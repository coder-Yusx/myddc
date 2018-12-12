package com.zxyy.yusx.myddc.service.impl;

import com.zxyy.yusx.myddc.mapper.KtYsMapper;
import com.zxyy.yusx.myddc.model.KtYs;
import com.zxyy.yusx.myddc.service.IKtYsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KtYsService implements IKtYsService {

    @Autowired
    private KtYsMapper ktYsMapper;

    @Override
    public int saveSsdcys(KtYs ktYs) {
        return ktYsMapper.insert(ktYs);
    }
}
