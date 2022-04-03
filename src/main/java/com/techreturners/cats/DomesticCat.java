package com.techreturners.cats;

import java.util.Random;

public class DomesticCat extends CatAbstract {

    public DomesticCat() {
        // super keyword references immediate parent class object
        super("domestic", 23);
    }

    @Override
    public String eat() {

        boolean random_boolean = Math.random() < 0.5;
        if (random_boolean) {
            return "Purrrrrrr" + ". It will do I suppose";
        } else {
            return "Purrrrrrr";

        }

    }

}
