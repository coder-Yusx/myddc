package com.zxyy.yusx.myddc.service.impl;

import com.zxyy.yusx.myddc.mapper.ZgongMapper;
import com.zxyy.yusx.myddc.model.DchzDto;
import com.zxyy.yusx.myddc.model.Zgong;
import com.zxyy.yusx.myddc.model.ZgongDcDetail;
import com.zxyy.yusx.myddc.service.IZgongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

@Service
public class ZgongService implements IZgongService {

    @Autowired
    private ZgongMapper zgongMapper;

    @Override
    public int saveZGong(Zgong zgong) {
        if(zgong != null)
            return zgongMapper.insert(zgong);
        return 0;
    }

    @Override
    public List<DchzDto> getDchz(Map map) {
        List<DchzDto> dchzDtos = zgongMapper.selectDchz(map);
        if(dchzDtos != null && dchzDtos.size() > 0){
            for(DchzDto dchzDto : dchzDtos){
                BigDecimal bg = new BigDecimal(dchzDto.getZmyd() * 100.0).setScale(2, RoundingMode.UP);
                String mylv = bg.toString() + "%";
                dchzDto.setZmydStr(mylv);
            }
        }
        return dchzDtos;
    }

    @Override
    public List<ZgongDcDetail> getZgongDcDetail(Map map) {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        List<ZgongDcDetail> zgongDcDetails = zgongMapper.selectZgongDcDetail(map);
        if(zgongDcDetails != null && zgongDcDetails.size()>0){
            for(ZgongDcDetail dcDetail:zgongDcDetails){
                if(dcDetail.getCjsjian() != null){
                    String format = sf.format(dcDetail.getCjsjian());
                    dcDetail.setCjsjianStr(format);
                }

                BigDecimal bg = new BigDecimal(dcDetail.getMylv() * 100.0).setScale(2, RoundingMode.UP);
                String mylv = bg.toString() + "%";
                dcDetail.setMylvStr(mylv);
            }
        }
        return zgongDcDetails;
    }
}
