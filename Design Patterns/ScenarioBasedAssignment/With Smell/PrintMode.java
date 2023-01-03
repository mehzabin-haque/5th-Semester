package com.company;

public abstract class PrintMode {
    String orientation,color_intensity,cost_per_page,number_of_pages, page_size;
    public abstract void saveToner();
    public abstract void savePage();
    public abstract void boost();


}
