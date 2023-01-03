package com.company;

public class TonerSaveMode extends PrintMode{

    String tonerSavingLevel;
    @Override
    public void saveToner() {
        if(tonerSavingLevel == "high" ){
            System.out.println("Color Intensity Reduced " );
        }
        else if(tonerSavingLevel == "medium" ){
            System.out.println("Color Intensity Reduced " );
        }
        else if(tonerSavingLevel == "low" ){
            System.out.println("Color Intensity Reduced " );
        }
    }

    @Override
    public void savePage() {

    }

    @Override
    public void boost() {

    }
}
