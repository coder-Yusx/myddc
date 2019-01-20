package com.zxyy.yusx.myddc.service;

import com.zxyy.yusx.myddc.model.*;

import java.util.List;
import java.util.Map;

public interface ICydcService {

    public int saveCydc(Cydc cydc);

    public int saveGroup(Cygroup cygroup);

    public int saveItem(Cyitem cyitem);

    public int saveAllCd(Cydc cydc , List<Cygroup> cygroups , List<Cyitem> cyitems);

    List<CydcDto> selectAllSatisfy();

    List<CydcDto> getSatisfyByCondition(Map map);

    List<CydcDetailDto> getSatisfyDetail(Map map);
}
