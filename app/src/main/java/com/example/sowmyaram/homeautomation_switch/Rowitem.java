package com.example.sowmyaram.homeautomation_switch;

/**
 * Created by sowmyaram on 6/1/2017.
 */

public class Rowitem {
    private int imageId;
    private String title;
    private String desc;

    public Rowitem(int imageId) {
        this.imageId = imageId;
        this.title = title;
        this.desc = desc;
    }
    public int getImageId() {
        return imageId;
    }
    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return title + "\n" + desc;
    }



}
