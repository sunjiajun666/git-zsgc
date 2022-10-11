package buba.com.cn.service.impl;

import buba.com.cn.dao.SoliderDao;
import buba.com.cn.dao.impl.SoliderDaoimpl;
import buba.com.cn.entity.Solider;
import buba.com.cn.service.SoliderService;

import java.util.List;

public class SoliderServiceimpl implements SoliderService {
    private SoliderDao soliderDao=new SoliderDaoimpl();


    @Override
    public int updateSoldier(Solider solider) {
        return soliderDao.updateSoldier(solider);
    }

    @Override
    public int addSoldier(Solider solider) {
        return soliderDao.addSoldier(solider);
    }

    @Override
    public int delSolider(Integer Solider) {
        return soliderDao.delSolider(Solider);
    }

    @Override
    public List<Solider> fillSolider() {
        return soliderDao.fillSolider();
    }
}
