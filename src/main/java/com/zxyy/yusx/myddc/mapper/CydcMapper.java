package com.zxyy.yusx.myddc.mapper;

import com.zxyy.yusx.myddc.model.Cydc;
import com.zxyy.yusx.myddc.model.CydcDetailDto;
import com.zxyy.yusx.myddc.model.CydcDto;
import com.zxyy.yusx.myddc.tk.TKMapper;

import java.util.List;
import java.util.Map;

public interface CydcMapper extends TKMapper<Cydc> {

    List<CydcDto> selectAllSatisfy();

    List<CydcDto> selectSatisfyByCondition(Map map);

    List<CydcDetailDto> selectSatisfyDetail(Map map);
}