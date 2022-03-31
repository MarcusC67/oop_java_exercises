package com.techreturners.cats;

public abstract class CatAbstract implements Cat{

   private int aveHeight;
   private String setting;
   private Boolean asleep;

   public CatAbstract(String setting, int aveHeight) {
      this.asleep = false;
      this.setting = setting;
      this.aveHeight = aveHeight;
   }
   @Override
   public boolean isAsleep() {
      return asleep;
   }

   @Override
   public void goToSleep() {
      asleep = true;
   }

   @Override
   public void wakeUp() {
      asleep = false;
   }



}
