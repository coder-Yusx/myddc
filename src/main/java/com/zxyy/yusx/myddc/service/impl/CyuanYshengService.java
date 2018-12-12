package com.zxyy.yusx.myddc.service.impl;

import com.zxyy.yusx.myddc.mapper.CyuanYshengMapper;
import com.zxyy.yusx.myddc.model.CyuanYsheng;
import com.zxyy.yusx.myddc.service.ICyuanYshengService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CyuanYshengService implements ICyuanYshengService {

    @Autowired
    private CyuanYshengMapper cyuanYshengMapper;

    @Override
    public int saveOneYsheng(CyuanYsheng cyuanYsheng) {
        int insert = 0;
        if(cyuanYsheng != null){
            insert = cyuanYshengMapper.insert(cyuanYsheng);
        }
        return insert;
    }
}
