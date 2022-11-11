package com.javaunit3.springmvc;

import org.springframework.stereotype.Component;

@Component
public class BatmanMovie implements Movie {

    public String getTitle() {
        return "Pre Wedding: The Bridal Shower";
    }

    public double getPricing() {
        return 1300;
    }

    public String getGenre() {
        return "Bridal";
    }
}
