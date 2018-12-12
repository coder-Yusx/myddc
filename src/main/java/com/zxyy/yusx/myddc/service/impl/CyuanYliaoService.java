package com.zxyy.yusx.myddc.service.impl;

import com.zxyy.yusx.myddc.mapper.CyuanHshiMapper;
import com.zxyy.yusx.myddc.mapper.CyuanYliaoMapper;
import com.zxyy.yusx.myddc.model.CyuanYliao;
import com.zxyy.yusx.myddc.service.ICyuanYliaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CyuanYliaoService implements ICyuanYliaoService {

    @Autowired
    private CyuanYliaoMapper cyuanYliaoMapper;
    @Override
    public int saveOneYliao(CyuanYliao cyuanYliao) {
        int insert = 0;
        if(cyuanYliao != null ){
            insert= cyuanYliaoMapper.insert(cyuanYliao);
        }
        return insert;
    }
}
