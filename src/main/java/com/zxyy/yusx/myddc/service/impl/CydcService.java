package com.zxyy.yusx.myddc.service.impl;

import com.zxyy.yusx.myddc.mapper.CydcMapper;
import com.zxyy.yusx.myddc.mapper.CygroupMapper;
import com.zxyy.yusx.myddc.mapper.CyitemMapper;
import com.zxyy.yusx.myddc.model.*;
import com.zxyy.yusx.myddc.service.ICydcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CydcService implements ICydcService {

    @Autowired
    private CydcMapper cydcMapper;
    @Autowired
    private CygroupMapper cygroupMapper;
    @Autowired
    private CyitemMapper cyitemMapper;

    @Override
    public int saveCydc(Cydc cydc) {
        return cydcMapper.insert(cydc);
    }
    @Override
    public int saveGroup(Cygroup cygroup){
        return cygroupMapper.insert(cygroup);
    }
    @Override
    public int saveItem(Cyitem cyitem){
        return cyitemMapper.insert(cyitem);
    }

    @Override
    public int saveAllCd(Cydc cydc, List<Cygroup> cygroups, List<Cyitem> cyitems) {

        int i=0,j=0,k=0;
        if(cyitems != null && cyitems.size() >0){
            i = cyitemMapper.insertList(cyitems);
        }
        if(cygroups != null && cygroups.size()>0 && i>0){
            j = cygroupMapper.insertList(cygroups);
        }
        if(cyitems != null && cyitems.size()>0 && j>0){
            k = cydcMapper.insert(cydc);
        }
        if(j>0){
            return j;
        }
        return 0;
    }

    @Override
    public List<CydcDto> selectAllSatisfy() {
        return cydcMapper.selectAllSatisfy();
    }

    @Override
    public List<CydcDto> getSatisfyByCondition(Map map) {
        return cydcMapper.selectSatisfyByCondition(map);
    }

    @Override
    public List<CydcDetailDto> getSatisfyDetail(Map map) {
        return cydcMapper.selectSatisfyDetail(map);
    }


}
