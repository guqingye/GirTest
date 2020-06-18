package com.hhl.oto.dao;

import com.hhl.oto.entity.Area;

import java.util.List;

public interface AreaDao {
    /***
     * 列出区域列表
     * @return arealist
     */
    List<Area> queryArea();
}
