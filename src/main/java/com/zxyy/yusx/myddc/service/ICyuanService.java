package com.zxyy.yusx.myddc.service;

import com.zxyy.yusx.myddc.model.Cyuan;
import com.zxyy.yusx.myddc.model.CyuanDto;

import java.util.List;
import java.util.Map;

public interface ICyuanService {

    int saveOneCyuan(Cyuan cYuan);

    List<CyuanDto> getCYMYD(Map map);
}
