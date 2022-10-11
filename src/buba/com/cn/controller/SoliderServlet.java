package buba.com.cn.controller;

import buba.com.cn.dao.SoliderDao;
import buba.com.cn.dao.impl.SoliderDaoimpl;
import buba.com.cn.entity.Solider;
import buba.com.cn.utils.ViewBaseServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class SoliderServlet extends ViewBaseServlet {
    private SoliderDao soliderDao=new SoliderDaoimpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        if (req.getParameter("method").equals("fillSolider")){
            this.fillSolider(req,resp);
        }
        if (req.getParameter("method").equals("delSolider")){
            this.delSolider(req,resp);
        }
        if (req.getParameter("method").equals("addSoldier")){
            this.addSoldier(req,resp);
        }
        if (req.getParameter("method").equals("updateSoldier")){
            this.updateSoldier(req,resp);
        }
        if (req.getParameter("method").equals("itemm")){
            this.itemm(req,resp);
        }
    }
    protected void fillSolider(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Solider> soliders = soliderDao.fillSolider();
        System.out.println(soliders);
        req.setAttribute("soliders",soliders);
        processTemplate("list",req,resp);
    }
    protected void delSolider(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        soliderDao.delSolider(Integer.valueOf(id));
        this.fillSolider(req,resp);
    }
    protected void addSoldier(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String username1 = req.getParameter("userweapon");
        Solider solider = new Solider(username,username1);
       soliderDao.addSoldier(solider);
        this.fillSolider(req,resp);
    }
    protected void updateSoldier(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String username = req.getParameter("name");
        String username1 = req.getParameter("waepon");
        Solider solider = new Solider(Integer.valueOf(id),username,username1);
        req.setAttribute("solider",solider);
        processTemplate("item",req,resp);
    }
    protected void itemm(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("userid");
        String username = req.getParameter("username");
        String username1 = req.getParameter("userweapon");
        Solider solider = new Solider(Integer.valueOf(id),username,username1);

       soliderDao.updateSoldier(solider);
        this.fillSolider(req,resp);
    }
}
