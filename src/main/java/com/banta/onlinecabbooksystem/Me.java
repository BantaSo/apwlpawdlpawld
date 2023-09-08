package com.banta.onlinecabbooksystem;

import java.math.BigInteger;
import java.util.Objects;

public class Me {
 private String name;
 private String nationality;
 private String birth;
 private String marital;
 private String sex;
 private String forlengprof;
 private String phone;

 //Constructor
public Me(String name, String nationality, String birth, String marital, String sex, String forlengprof, String phone){
    this.name = name;
    this.nationality = nationality;
    this.birth = birth;
    this.marital = marital;
    this.sex = sex;
    this.forlengprof = forlengprof;
    this.phone = phone;
}

//get and set
public String getName(){
    return name;
}
public void setName(){
    this.name = name;
}
public String getNationality(){
    return nationality;
}
public void setNationality(){
    this.nationality = nationality;
}
public String getBirth(){
    return birth;
}
public void setBirth(){
    this.birth = birth;
}
public String getMarital(){
    return marital;
}
public void setMarital(){
    this.marital = marital;
}
public String getSex(){
    return sex;
}
public void setSex(){
    this.sex = sex;
}
public String getForlengprof(){
    return forlengprof;
}
public void setForlengprof(){
    this.forlengprof = forlengprof;
}
public String getPhone(){
    return phone;
}
public void setPhone(){
    this.phone = phone;
}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Me me = (Me) o;
        return Objects.equals(name, me.name) && Objects.equals(nationality, me.nationality) && Objects.equals(birth, me.birth) && Objects.equals(marital, me.marital) && Objects.equals(sex, me.sex) && Objects.equals(forlengprof, me.forlengprof) && Objects.equals(phone, me.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nationality, birth, marital, sex, forlengprof, phone);
    }

    @Override
    public String toString() {
        return "about Me{" +
                "name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", birth='" + birth + '\'' +
                ", marital='" + marital + '\'' +
                ", sex='" + sex + '\'' +
                ", forlengprof='" + forlengprof + '\'' +
                ", phone=" + phone +
                '}';
    }
}
