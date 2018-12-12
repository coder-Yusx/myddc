package com.zxyy.yusx.myddc.controller;

import com.zxyy.yusx.myddc.model.CyuanDto;
import com.zxyy.yusx.myddc.model.DchzDto;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/export")
public class ExportController {

    @Autowired
    private CyuanService cyuanService;
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
        List<CyuanDto> cymyd = cyuanService.getCYMYD(map);

        //excel标题
        String[] title = {"科室","患者姓名","联系方式","填写时间","医生态度","医生技术","医生医德","护士态度","护士技术",
                "护士效率","医疗放射","医疗核磁","医疗ct","医疗超声","医疗心电","医疗推拿","医疗检验","后勤卫生","后勤膳食",
                "后勤入出院","后勤水电电梯","住院部环境","合计","满分","满意率"};
        //excel文件名
        String fileName = "襄阳市中心医院出院患者满意度调查表"+System.currentTimeMillis()+".xls";

        String sheetName = "襄阳市中心医院出院患者满意度调查";
        String[][] content = content = new String[cymyd.size()+1][title.length+1];
        for(int i=0;i<cymyd.size();i++){
            CyuanDto cyuanDto = cymyd.get(i);
            if(cyuanDto != null){
                content[i][0] = cyuanDto.getKshi();
                content[i][1] = cyuanDto.getHzxming();
                content[i][2] = cyuanDto.getLxfshi();
                content[i][3] = cyuanDto.getTxsjianStr() ;
                content[i][4] = new Integer(cyuanDto.getYstdu()).toString();
                content[i][5] = new Integer(cyuanDto.getYsjshu()).toString() ;
                content[i][6] = new Integer(cyuanDto.getYsyde()).toString() ;
                content[i][7] = cyuanDto.getHzxming() ;
                content[i][8] = new Integer(cyuanDto.getHstdu()).toString() ;
                content[i][9] = new Integer(cyuanDto.getHsjshu()).toString() ;
                content[i][10] = new Integer(cyuanDto.getHsxlv()).toString() ;
                content[i][11] = new Integer(cyuanDto.getYlfshe()).toString() ;
                content[i][12] = new Integer(cyuanDto.getYlhci()).toString() ;
                content[i][13] = new Integer(cyuanDto.getYlct()).toString() ;
                content[i][14] = new Integer(cyuanDto.getYlcsheng()).toString() ;
                content[i][15] = new Integer(cyuanDto.getYlxdian()).toString() ;
                content[i][16] = new Integer(cyuanDto.getYltna()).toString() ;
                content[i][17] = new Integer(cyuanDto.getYljyan()).toString() ;
                content[i][18] = new Integer(cyuanDto.getHqwsheng()).toString() ;
                content[i][19] = new Integer(cyuanDto.getHqsshi()).toString() ;
                content[i][20] = new Integer(cyuanDto.getHqsddti()).toString() ;
                content[i][21] = new Integer(cyuanDto.getZybhjing()).toString() ;
                content[i][22] = new Integer(cyuanDto.getHji()).toString() ;
                content[i][23] = new Integer(cyuanDto.getMfen()).toString() ;
                content[i][24] = cyuanDto.getMylv();
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
