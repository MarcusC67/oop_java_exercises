package com.techreturners.cats;

public class CheetahCat extends CatAbstract {

    public CheetahCat() {
       super("wild", 1000);
    }

    @Override
    public String eat() {
        return "Zzzzzzz";
    }

}
