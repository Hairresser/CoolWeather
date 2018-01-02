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
public class Hourly_forecast {

    private Cond cond;
    private Date date;
    private String hum;
    private String pop;
    private String pres;
    private String tmp;
    private Wind wind;
    public void setCond(Cond cond) {
         this.cond = cond;
     }
     public Cond getCond() {
         return cond;
     }

    public void setDate(Date date) {
         this.date = date;
     }
     public Date getDate() {
         return date;
     }

    public void setHum(String hum) {
         this.hum = hum;
     }
     public String getHum() {
         return hum;
     }

    public void setPop(String pop) {
         this.pop = pop;
     }
     public String getPop() {
         return pop;
     }

    public void setPres(String pres) {
         this.pres = pres;
     }
     public String getPres() {
         return pres;
     }

    public void setTmp(String tmp) {
         this.tmp = tmp;
     }
     public String getTmp() {
         return tmp;
     }

    public void setWind(Wind wind) {
         this.wind = wind;
     }
     public Wind getWind() {
         return wind;
     }

}