package com.zxyy.yusx.myddc.controller;

import com.zxyy.yusx.myddc.model.CydcDetailDto;
import com.zxyy.yusx.myddc.model.CyuanDto;
import com.zxyy.yusx.myddc.model.DchzDto;
import com.zxyy.yusx.myddc.result.AjaxResult;
import com.zxyy.yusx.myddc.service.ICydcService;
import com.zxyy.yusx.myddc.service.impl.CyuanService;
import com.zxyy.yusx.myddc.service.impl.ZgongService;
import com.zxyy.yusx.myddc.utils.ExcelUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.util.StringUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/export")
public class ExportController {

    @Autowired
    private ICydcService cydcService;
    @Autowired
    private ZgongService zgongService;

    //导出excel
    @RequestMapping(value = "/zgong",method = RequestMethod.POST)
    public void zgongReport(HttpServletRequest request, HttpServletResponse response, String kshi, String startTime, String endTime){
        Map map = new HashMap();
        if(StringUtil.isNotEmpty(kshi)){
            map.put("kshi",kshi);
        }
        if(StringUtil.isNotEmpty(startTime)){
            map.put("startTime",startTime);
        }
        if(StringUtil.isNotEmpty(endTime)){
            map.put("endTime",endTime);
        }
        List<DchzDto> dchz = zgongService.getDchz(map);

        //excel标题
        String[] title = {"科室","调查次数","服务态度","服务质量","办事效率","劳动纪律","合计","满分","总满意度"};
        //excel文件名
        String fileName = "襄阳市中心医院职能科室满意度调查表"+System.currentTimeMillis()+".xls";

        String sheetName = "襄阳市中心医院职能科室满意度调查表";
        String[][] content = content = new String[dchz.size()+1][title.length+1];
        for(int i=0;i<dchz.size();i++){
            DchzDto dchzDto = dchz.get(i);
            if(dchzDto != null){
                content[i][0] = dchzDto.getKshi();
                content[i][1] = new Integer(dchzDto.getFshu()).toString();
                content[i][2] = new Integer(dchzDto.getFwtdu()).toString();
                content[i][3] = new Integer(dchzDto.getFwzliang()).toString();
                content[i][4] = new Integer(dchzDto.getBsxlv()).toString();
                content[i][5] = new Integer(dchzDto.getLdjlv()).toString();
                content[i][6] = new Integer(dchzDto.getHji()).toString();
                content[i][7] = new Integer(dchzDto.getZfen()).toString();
                content[i][8] = dchzDto.getZmydStr();
            }
        }
        HSSFWorkbook wb = ExcelUtil.getHSSFWorkbook(sheetName, title, content, null);
        try {
            this.setResponseHeader(response, fileName);
            OutputStream os = response.getOutputStream();
            wb.write(os);
            os.flush();
            os.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //导出excel
    @RequestMapping(value = "/report",method = RequestMethod.POST)
    public void cyuanReport(HttpServletRequest request, HttpServletResponse response, String kshi, String startTime, String endTime){
        AjaxResult result = new AjaxResult();
        Map map = new HashMap();
        if(StringUtil.isNotEmpty(kshi)){
            map.put("kshi",kshi);
        }
        if(StringUtil.isNotEmpty(startTime)){
            map.put("startTime",startTime);
        }
        if(StringUtil.isNotEmpty(endTime)){
            map.put("endTime",endTime);
        }
        List<CydcDetailDto> satisfyDetail = cydcService.getSatisfyDetail(map);

        //excel标题
        String[] title = {"科室","医生态度","医生技术","医生告知病情","医生医德","护士态度","护士技术",
                "护士效率","医疗放射","医疗核磁","医疗ct","医疗超声","医疗心电","医疗推拿","医疗检验","后勤卫生","后勤膳食",
                "后勤入出院","后勤水电电梯","住院部环境","意见","填写时间","得分","总分","满意度"};
        //excel文件名
        String fileName = "襄阳市中心医院出院患者满意度调查表"+System.currentTimeMillis()+".xls";

        String sheetName = "襄阳市中心医院出院患者满意度调查";
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        String[][] content = content = new String[satisfyDetail.size()+1][title.length+1];
        for(int i=0;i<satisfyDetail.size();i++){
            CydcDetailDto cydcDetailDto = satisfyDetail.get(i);
            if(cydcDetailDto != null){
                content[i][0] = cydcDetailDto.getDept();
                content[i][1] = new Integer(cydcDetailDto.getYsfwu()).toString();
                content[i][2] = new Integer(cydcDetailDto.getYsyl()).toString();
                content[i][3] = new Integer(cydcDetailDto.getYsgz()).toString();
                content[i][4] = new Integer(cydcDetailDto.getYsyd()).toString();
                content[i][5] = new Integer(cydcDetailDto.getHsjs()).toString() ;
                content[i][6] = new Integer(cydcDetailDto.getHsfw()).toString() ;
                content[i][7] = new Integer(cydcDetailDto.getHsjz()).toString() ;
                content[i][8] = new Integer(cydcDetailDto.getYlfs()).toString() ;
                content[i][9] = new Integer(cydcDetailDto.getYlhs()).toString() ;
                content[i][10] = new Integer(cydcDetailDto.getYlct()).toString() ;
                content[i][11] = new Integer(cydcDetailDto.getYlbc()).toString() ;
                content[i][12] = new Integer(cydcDetailDto.getYlxd()).toString() ;
                content[i][13] = new Integer(cydcDetailDto.getYltn()).toString() ;
                content[i][14] = new Integer(cydcDetailDto.getYljy()).toString() ;
                content[i][15] = new Integer(cydcDetailDto.getHqqj()).toString() ;
                content[i][16] = new Integer(cydcDetailDto.getHqss()).toString() ;
                content[i][17] = new Integer(cydcDetailDto.getHqrc()).toString() ;
                content[i][18] = new Integer(cydcDetailDto.getHqsdd()).toString() ;
                content[i][19] = new Integer(cydcDetailDto.getZyhj()).toString() ;
                content[i][20] = cydcDetailDto.getYjian();
                content[i][21] = sf.format(cydcDetailDto.getCreatetime());
                content[i][22] = new Integer(cydcDetailDto.getScore()).toString() ;
                content[i][23] = new Integer(cydcDetailDto.getTotalscor()).toString() ;
                content[i][24] = Double.toString(cydcDetailDto.getSatisfy());
            }
        }
        HSSFWorkbook wb = ExcelUtil.getHSSFWorkbook(sheetName, title, content, null);
        //响应到客户端
        try {
            this.setResponseHeader(response, fileName);
            OutputStream os = response.getOutputStream();
            wb.write(os);
            os.flush();
            os.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //发送响应流方法
    public void setResponseHeader(HttpServletResponse response, String fileName) {
        try {
            try {
                fileName = new String(fileName.getBytes(),"ISO8859-1");
            } catch (UnsupportedEncodingException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            response.setContentType("application/octet-stream;charset=ISO8859-1");
            response.setHeader("Content-Disposition", "attachment;filename="+ fileName);
            response.addHeader("Pargam", "no-cache");
            response.addHeader("Cache-Control", "no-cache");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
