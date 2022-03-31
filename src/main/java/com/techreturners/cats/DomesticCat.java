package com.techreturners.cats;

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
