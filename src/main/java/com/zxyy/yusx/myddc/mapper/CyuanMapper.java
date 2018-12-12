package com.zxyy.yusx.myddc.mapper;

import com.zxyy.yusx.myddc.model.Cyuan;
import com.zxyy.yusx.myddc.model.CyuanDto;
import com.zxyy.yusx.myddc.tk.TKMapper;

import java.util.List;
import java.util.Map;

public interface CyuanMapper extends TKMapper<Cyuan> {

    List<CyuanDto> selectCYMYD(Map map);
}