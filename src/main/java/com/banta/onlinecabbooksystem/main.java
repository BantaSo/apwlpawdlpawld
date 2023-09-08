package com.banta.onlinecabbooksystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class main {
     public static void main(String[] args){
         SpringApplication.run(main.class, args);


     }

//   v1 works too
//    @GetMapping("/home")
//    public page Page(){
//    return new page(new greet("Monday", "17", "September", "2023"),
//           new Me("Banta Solagratia", "Indonesian", "Balige 13 Februari 2000", "Merried", "Male", "English(Passive)", "082273681213"));
//
//    }


    //works 2
    @GetMapping("/home")
    public Page page(){
         Page Response = new Page(new Greet("Monday", "17", "September", "2023"),
                 new Me("Banta Solagratia", "Indonesian", "Balige 13 Februari 2000", "Married", "Male", "English(Passive)", "082273681213"));
        return Response;

    }








}
