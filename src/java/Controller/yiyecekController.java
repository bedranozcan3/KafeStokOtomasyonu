/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.yiyecekDao;
import entity.yiyecek;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author bedra
 */
@Named
@SessionScoped
public class yiyecekController implements Serializable{
   private List<yiyecek> ylist;
   private yiyecekDao ydao;

    public yiyecekController() {
        this.ylist= new ArrayList();
        ydao=new yiyecekDao();
    }

    public List<yiyecek> getYlist() {
        this.ylist=this.ydao.getyiyecek();
        return ylist;
    }

    public void setYlist(List<yiyecek> ylist) {
        this.ylist = ylist;
    }

    public yiyecekDao getYdao() {
        return ydao;
    }

    public void setYdao(yiyecekDao ydao) {
        this.ydao = ydao;
    }
   
}
