package buba.com.cn.dao;

import buba.com.cn.entity.Solider;

import java.util.List;

public interface SoliderDao {
    int updateSoldier(Solider solider);
    int addSoldier(Solider solider);
    int delSolider(Integer Solider);
    List<Solider>fillSolider();
}
