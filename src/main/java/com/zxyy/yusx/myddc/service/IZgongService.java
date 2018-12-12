package com.zxyy.yusx.myddc.service;

import com.zxyy.yusx.myddc.model.DchzDto;
import com.zxyy.yusx.myddc.model.Zgong;
import com.zxyy.yusx.myddc.model.ZgongDcDetail;

import java.util.List;
import java.util.Map;

public interface IZgongService {

    int saveZGong(Zgong zgong);

    List<DchzDto> getDchz(Map map);

    List<ZgongDcDetail> getZgongDcDetail(Map map);
}
