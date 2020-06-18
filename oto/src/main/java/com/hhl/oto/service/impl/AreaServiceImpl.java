package com.hhl.oto.service.impl;

import com.hhl.oto.dao.AreaDao;
import com.hhl.oto.entity.Area;
import com.hhl.oto.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaDao areaDao;
    @Override
    public List<Area> getAreaList() {
        return areaDao.queryArea();
    }
}
