/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author bedra
 */
public class yiyecek {
    private int yiyecek_id;
    private  String yiyecekadi;
    private float fiyat;
    private int stokadedi;

    public yiyecek() {
    }

    public yiyecek(int yiyecek_id, String yiyecekadi, float fiyat, int stokadedi) {
        this.yiyecek_id = yiyecek_id;
        this.yiyecekadi = yiyecekadi;
        this.fiyat = fiyat;
        this.stokadedi = stokadedi;
    }
    

    public int getYiyecek_id() {
        return yiyecek_id;
    }

    public void setYiyecek_id(int yiyecek_id) {
        this.yiyecek_id = yiyecek_id;
    }

    public String getYiyecekadi() {
        return yiyecekadi;
    }

    public void setYiyecekadi(String yiyecekadi) {
        this.yiyecekadi = yiyecekadi;
    }

    public float getFiyat() {
        return fiyat;
    }

    public void setFiyat(float fiyat) {
        this.fiyat = fiyat;
    }

    public int getStokadedi() {
        return stokadedi;
    }

    public void setStokadedi(int stokadedi) {
        this.stokadedi = stokadedi;
    }

    @Override
    public String toString() {
        return "yiyecek{" + "yiyecek_id=" + yiyecek_id + ", yiyecekadi=" + yiyecekadi + ", fiyat=" + fiyat + ", stokadedi=" + stokadedi + '}';
    }
    
}
