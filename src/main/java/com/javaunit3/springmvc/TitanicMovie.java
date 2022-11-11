package com.javaunit3.springmvc;

import org.springframework.stereotype.Component;

@Component
public class TitanicMovie implements Movie {
    public String getTitle() {
        return "Wedding";
    }

    @Override
    public double getPricing() {
        return 1600;
    }

    public double Pricing() {
        return 1600;
    }

    public String getGenre() {
        return "wedding";
    }
}