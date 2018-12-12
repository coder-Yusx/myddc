package com.zxyy.yusx.myddc.service.impl;

import com.zxyy.yusx.myddc.mapper.YyKshiMapper;
import com.zxyy.yusx.myddc.model.YyKshi;
import com.zxyy.yusx.myddc.service.IYyKshiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
@Service
public class YyKshiService implements IYyKshiService {

    @Autowired
    private YyKshiMapper yyKshiMapper;

    @Override
    public List<YyKshi> getZyuanKshis() {
        Example example = new Example(YyKshi.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("depttype","I");
        List<YyKshi> yyKshis = yyKshiMapper.selectByExample(example);
        return yyKshis;
    }
}
