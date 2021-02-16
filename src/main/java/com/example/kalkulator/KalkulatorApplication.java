package com.example.kalkulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KalkulatorApplication {

    public void add(int a, int b) {
        System.out.println(a + b);
    }
    public void sub (int a, int b) {
        System.out.println(a - b);
    }

    public static void main(String[] args) {
        SpringApplication.run(KalkulatorApplication.class, args);

        KalkulatorApplication kalkulatorApplication = new KalkulatorApplication();
        kalkulatorApplication.add(1 , 5);
        kalkulatorApplication.sub(5,1);
    }
}
