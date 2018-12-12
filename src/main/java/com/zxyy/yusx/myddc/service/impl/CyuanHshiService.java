package com.zxyy.yusx.myddc.service.impl;

import com.zxyy.yusx.myddc.mapper.CyuanHshiMapper;
import com.zxyy.yusx.myddc.model.CyuanHshi;
import com.zxyy.yusx.myddc.service.ICyuanHshiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CyuanHshiService implements ICyuanHshiService {

    @Autowired
    private CyuanHshiMapper cyuanHshiMapper;
    @Override
    public int saveOneHshi(CyuanHshi cyuanHshi) {
        int insert = 0;
        if(cyuanHshi != null){
            insert = cyuanHshiMapper.insert(cyuanHshi);
        }
        return insert;
    }
}
