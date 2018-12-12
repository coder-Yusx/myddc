package com.zxyy.yusx.myddc.service.impl;

import com.zxyy.yusx.myddc.mapper.ZgongDchaMapper;
import com.zxyy.yusx.myddc.model.Zgong;
import com.zxyy.yusx.myddc.model.ZgongDcha;
import com.zxyy.yusx.myddc.service.IZgongDchaService;
import com.zxyy.yusx.myddc.service.IZgongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZgongDchaService implements IZgongDchaService {

    @Autowired
    private ZgongDchaMapper zgongDchaMapper;
    @Override
    public int saveDcha(ZgongDcha zgongDcha) {
        if(zgongDcha != null)
            return zgongDchaMapper.insert(zgongDcha);
        return 0;
    }
}
