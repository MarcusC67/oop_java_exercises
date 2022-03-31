package com.techreturners.cats;

import java.util.Random;

public class DomesticCat extends CatAbstract {

    public DomesticCat() {
        // super keyword references immediate parent class object
        super("domestic", 23);
    }

    @Override
    public String eat() {
        return "Purrrrrrr";
    }

}
