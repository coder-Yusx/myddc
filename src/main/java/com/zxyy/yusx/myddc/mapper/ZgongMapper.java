package com.zxyy.yusx.myddc.mapper;

import com.zxyy.yusx.myddc.model.DchzDto;
import com.zxyy.yusx.myddc.model.Zgong;
import com.zxyy.yusx.myddc.model.ZgongDcDetail;
import com.zxyy.yusx.myddc.model.ZgongDcha;
import com.zxyy.yusx.myddc.tk.TKMapper;

import java.util.List;
import java.util.Map;

public interface ZgongMapper extends TKMapper<Zgong> {

    List<DchzDto> selectDchz(Map map);

    List<ZgongDcDetail> selectZgongDcDetail(Map map);
}