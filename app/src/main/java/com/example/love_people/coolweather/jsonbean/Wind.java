/**
  * Copyright 2018 bejson.com 
  */
package com.example.love_people.coolweather.jsonbean;
import java.util.Date;

/**
 * Auto-generated: 2018-01-02 10:48:22
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Wind {

    private String deg;
    private String dir;
    private Date sc;
    private String spd;
    public void setDeg(String deg) {
         this.deg = deg;
     }
     public String getDeg() {
         return deg;
     }

    public void setDir(String dir) {
         this.dir = dir;
     }
     public String getDir() {
         return dir;
     }

    public void setSc(Date sc) {
         this.sc = sc;
     }
     public Date getSc() {
         return sc;
     }

    public void setSpd(String spd) {
         this.spd = spd;
     }
     public String getSpd() {
         return spd;
     }

}