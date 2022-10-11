package buba.com.cn.service;

import buba.com.cn.entity.Solider;

import java.util.List;

public interface SoliderService {
    int updateSoldier(Solider solider);
    int addSoldier(Solider solider);
    int delSolider(Integer Solider);
    List<Solider> fillSolider();
}
