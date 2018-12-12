package com.zxyy.yusx.myddc.controller;

import com.zxyy.yusx.myddc.model.*;
import com.zxyy.yusx.myddc.result.AjaxResult;
import com.zxyy.yusx.myddc.service.ISurveyDeptService;
import com.zxyy.yusx.myddc.service.ISurveyDocService;
import com.zxyy.yusx.myddc.service.ISurveyGroupService;
import com.zxyy.yusx.myddc.service.ISurveyItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
public class SurveyDoController {

    @Autowired
    public ISurveyDocService surveyDocService;

    @Autowired
    public ISurveyDeptService surveyDeptService;

    @Autowired
    public ISurveyGroupService surveyGroupService;

    @Autowired
    public ISurveyItemService surveyItemService;

    @RequestMapping(value = "/totalprecent/{deptCode}", method = RequestMethod.GET)
    public AjaxResult totalPrecent(@PathVariable("deptCode") String deptCode) {
        //List<DeptVo1> allDepts = surveyDeptService.getAllDepts();
        String totalprecent = surveyDocService.getOneDeptSurvey(deptCode);
        AjaxResult result = new AjaxResult();
        result.success(totalprecent);
        return result;
    }

    @RequestMapping(value = "/depts", method = RequestMethod.GET)
    public AjaxResult allDepts() {
        List<DeptVo1> allDepts = surveyDeptService.getAllDepts();
        AjaxResult result = new AjaxResult();
        result.success(allDepts);
        return result;
    }

    @RequestMapping(value = "/report1", method = RequestMethod.GET)
    public AjaxResult surveyVo1List() {

        List<SurveyVo1> surveyVo1s = surveyDocService.getAllSurveyVo1();
        AjaxResult result = new AjaxResult();
        result.success(surveyVo1s);
        return result;
    }

    @RequestMapping(value = "/adddoc", method = RequestMethod.POST)
    public AjaxResult addSurveyDoc(@RequestBody Map<String, Object> map, HttpServletRequest request, HttpServletResponse response) {

        SurveyDoc surveyDoc = new SurveyDoc();
        List<SurveyDept> surveyDepts = new ArrayList<SurveyDept>();
        List<SurveyGroup> surveyGroups = new ArrayList<SurveyGroup>();
        List<SurveyItem> surveyItems = new ArrayList<SurveyItem>();

        //解析前端调查单信息
        Map<String, Object> params = (Map<String, Object>) map.get("params");
        String doc_code = (String) params.get("doc_code");
        String doc_name = (String) params.get("doc_name");
        String doc_advice = (String) params.get("doc_advice");

        //填充后端调查单信息
        String doc_id = UUID.randomUUID().toString();
        surveyDoc.setDocId(doc_id);
        surveyDoc.setDocExtend1(doc_code);
        surveyDoc.setDocName(doc_name);
        surveyDoc.setDocDiscribe(doc_advice);

        String username = (String)request.getAttribute("username");
        surveyDoc.setDocWriter(username);

        //JSONArray doc_dept=(JSONArray)params.get("doc_dept");
        List<Map<String, Object>> doc_dept = (List<Map<String, Object>>) params.get("doc_dept");
        for (int i = 0; i < doc_dept.size(); i++) {

            Map<String, Object> dept = doc_dept.get(i);
            String dept_code = (String) dept.get("dept_code");
            String dept_name = (String) dept.get("dept_name");

            SurveyDept surveyDept = new SurveyDept();
            String dept_id = UUID.randomUUID().toString();
            surveyDept.setDeptId(dept_id);
            surveyDept.setDeptExtend1(dept_code);
            surveyDept.setDeptName(dept_name);
            surveyDept.setDeptDoc(doc_id);

            //JSONArray dept_group = (JSONArray) dept.get("dept_group");

            List<Map<String, Object>> dept_group = (List<Map<String, Object>>) dept.get("dept_group");

            Map<String, Object> group = dept_group.get(0);
            String group_code = (String) group.get("group_code");
            String group_name = (String) group.get("group_name");

            SurveyGroup surveyGroup = new SurveyGroup();
            String group_id = UUID.randomUUID().toString();
            surveyGroup.setGroupId(group_id);
            surveyGroup.setGroupExtend1(group_code);
            surveyGroup.setGroupName(group_name);
            surveyGroup.setGroupDept(dept_id);

            List<Map<String, Object>> group_item = (List<Map<String, Object>>) group.get("group_item");
            for (int j = 0; j < group_item.size(); j++) {
                Map<String, Object> item = group_item.get(j);
                String item_code = (String) item.get("item_code");
                String item_name = (String) item.get("item_name");
                int item_star = (int) item.get("item_star");

                SurveyItem surveyItem = new SurveyItem();
                String item_id = UUID.randomUUID().toString();
                surveyItem.setItemId(item_id);
                surveyItem.setItemExtend1(item_code);
                surveyItem.setItemName(item_name);
                surveyItem.setItemStar(item_star);
                surveyItem.setItemGroup(group_id);

                surveyItems.add(surveyItem);
            }
            surveyGroups.add(surveyGroup);
            surveyDepts.add(surveyDept);
        }
        surveyDocService.saveSurveyDoc(surveyDoc);
        surveyDeptService.batchSaveSurveyDept(surveyDepts);
        surveyGroupService.batchSaveSurveyGroup(surveyGroups);
        surveyItemService.batchSaveSurveyItem(surveyItems);

        AjaxResult result = new AjaxResult();
        result.success();
        return result;
    }
}
