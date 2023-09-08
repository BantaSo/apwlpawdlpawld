package com.banta.onlinecabbooksystem;

import java.util.Objects;

public class Page {
    private Greet greeting;
    private Me aboutMe;

//constructor
public Page(Greet greeting, Me aboutMe){
    this.greeting = greeting;
    this.aboutMe = aboutMe;
}

//setter getter
    public Greet getGreeting() {
        return greeting;
    }
    public void setGreeting(){
        this.greeting = greeting;
    }

    public Me getAboutMe(){
        return aboutMe;
    }
    public void setAboutMe(){
        this.aboutMe = aboutMe;
    }

//equals hash toString manual

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Page page = (Page) o;
        return Objects.equals(greeting, page.greeting) && Objects.equals(aboutMe, page.aboutMe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(greeting, aboutMe);
    }

    @Override
    public String toString() {
        return "Page{" +
                "greeting=" + greeting +
                ", aboutMe=" + aboutMe +
                '}';
    }
}
