package com.zxyy.yusx.myddc.service.impl;

import com.zxyy.yusx.myddc.mapper.CyuanHqinMapper;
import com.zxyy.yusx.myddc.model.CyuanHqin;
import com.zxyy.yusx.myddc.service.ICyuanHqinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CyuanHqinService implements ICyuanHqinService {
    @Autowired
    private CyuanHqinMapper cyuanHqinMapper;

    @Override
    public int saveOneHqin(CyuanHqin cyuanHqin) {
        int insert = 0;
        if(cyuanHqin != null){
            insert = cyuanHqinMapper.insert(cyuanHqin);
        }
        return insert;
    }
}
