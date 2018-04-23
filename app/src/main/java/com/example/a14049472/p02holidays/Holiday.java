package com.example.a14049472.p02holidays;

public class Holiday {

    private String name;
    private String date;
    private boolean pic;

    public Holiday (String name,String date,boolean pic){
        this.name=name;
        this.date=date;
        this.pic=pic;
    }
    public String getName(){return name;}
    public String getDate(){return date;}
    public boolean isPic(){return pic;}


}
