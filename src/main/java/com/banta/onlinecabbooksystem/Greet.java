package com.banta.onlinecabbooksystem;

import java.util.Objects;

public class Greet {
    private String day;
    private String date;
    private String month;
    private String year;

    //Constructor
    public Greet(String day, String date, String month, String year){
        this.day = day;
        this.date = date;
        this.month = month;
        this.year = year;
    }

    // Getter dan setter (secara manual)
    public String getDay() {
        return day;
    }
    public void setDay(){
        this.day = day;
    }
    public String getDate() {
        return date;
    }
    public void setDate(){
        this.date = date;
    }

    public String getMonth(){
        return month;
    }
    public void setMonth(){
        this.month = month;
    }

    public String getYear(){
        return year;
    }
    public void setYear(){
        this.year = year;
    }

    // equals(), hashCode(), dan toString() (secara manual)
    @Override
    public boolean equals(Object g) {
        if (this == g) return true;
        if (g == null || getClass() != g.getClass()) return false;
        Greet gReet = (Greet) g;
        return Objects.equals(day, gReet.day) &&
                Objects.equals(date, gReet.date) &&
                Objects.equals(month, gReet.month) &&
                Objects.equals(year, gReet.year);
    }

    @Override
    public int hashCode(){
        return Objects.hash(day, date, month, year);
    }

    @Override
    public String toString(){
        return "greet{ " + day + "/" +date + "/" + month + "/" +  year +
                '}';
    }
}
