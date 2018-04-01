package com.jiyun.lalala;

/**
 * Created by Administrator on 2018/4/1 0001.
 */

public class CarChang {
    private String name;
    private int img;
    private String weizhi;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getWeizhi() {
        return weizhi;
    }

    public void setWeizhi(String weizhi) {
        this.weizhi = weizhi;
    }

    public CarChang(String name, int img, String weizhi) {

        this.name = name;
        this.img = img;
        this.weizhi = weizhi;
    }
}
