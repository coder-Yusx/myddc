package com.zxyy.yusx.myddc.service.impl;

import com.zxyy.yusx.myddc.mapper.CyuanZybwshengMapper;
import com.zxyy.yusx.myddc.model.CyuanZybwsheng;
import com.zxyy.yusx.myddc.service.ICyuanZybwshengService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CyuanZybwshengService implements ICyuanZybwshengService {
    @Autowired
    private CyuanZybwshengMapper cyuanZybwshengMapper;

    @Override
    public int saveOneZybwsheng(CyuanZybwsheng cyuanZybwsheng) {
        int i = 0;
        if(cyuanZybwsheng != null){
            i = cyuanZybwshengMapper.insert(cyuanZybwsheng);
        }
        return i;
    }
}
