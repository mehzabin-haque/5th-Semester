package com.company;

public class BoosterMode extends PrintMode {
    int threshold;
    int max_acceptable_level;
    @Override
    public void saveToner() {

    }

    @Override
    public void savePage() {

    }

    @Override
    public void boost() {

    }

    BoosterMode(){
        if(threshold>max_acceptable_level ){
            System.out.println("Increase color intensity");
        }
    }

}
