package com.zxyy.yusx.myddc.service.impl;

import com.zxyy.yusx.myddc.mapper.CyuanMapper;
import com.zxyy.yusx.myddc.model.Cyuan;
import com.zxyy.yusx.myddc.model.CyuanDto;
import com.zxyy.yusx.myddc.service.ICyuanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

@Service
public class CyuanService implements ICyuanService {

    @Autowired
    private CyuanMapper cyuanMapper;

    @Override
    public int saveOneCyuan(Cyuan cYuan) {
        int i = 0;
        if(cYuan != null){
            i = cyuanMapper.insert(cYuan);
        }
        return i;
    }

    @Override
    public List<CyuanDto> getCYMYD(Map map) {
        List<CyuanDto> cyuanDtos = cyuanMapper.selectCYMYD(map);
        if(cyuanDtos != null){
            for(CyuanDto cyuanDto : cyuanDtos){
                //把满意度转化成百分比
                BigDecimal bg = new BigDecimal(cyuanDto.getMydu() * 100.0).setScale(2, RoundingMode.UP);
                String mylv = bg.toString() + "%";
                cyuanDto.setMylv(mylv);

                //把填写时间转化成字符串
                if(cyuanDto.getTxsjian() != null){
                    SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String format = sf.format(cyuanDto.getTxsjian());
                    cyuanDto.setTxsjianStr(format);
                }
            }
        }
        return cyuanDtos;
    }
}
