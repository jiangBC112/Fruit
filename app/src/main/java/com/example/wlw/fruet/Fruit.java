package com.example.wlw.fruet;

/**
 * Created by wlw on 2016/12/8.
 */
public class Fruit {
    private String title;
    private String desc;
    private int imageID;
    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public int getImageID() {
        return imageID;
    }



    public Fruit(String title, String desc, int imageID) {
        this.title = title;
        this.desc = desc;
        this.imageID = imageID;
    }
}
