package com.company;

public class TonerSaveMode {

    protected String tonerSavingLevel;

        public void saveToner(String tonerSavingLevel) {
            for(IntensityCheck ic : IntensityCheck.values()){
                if(tonerSavingLevel.equals(ic.type)){
                    System.out.println("Color Intensity Reduced to " + ic.name());
                }
                else{
                    System.out.println("Color Intensity can't be Reduced ");
                }
            }
    }
}
