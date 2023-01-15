package com.company;

public class PageSaveMode extends PrintMode{

    @Override
    public void saveToner() {

    }

    @Override
    public void savePage() {

    }

    @Override
    public void boost() {

    }

    public void pageReduce(){
        if(page_size=="large" && orientation == "portrait"){
            System.out.println("Reduce number of pages to half");
        }
        else if(page_size=="large" && orientation == "landscape"){
            System.out.println("Reduce few number of pages");
        }

        if(page_size=="small" && orientation == "portrait"){
            System.out.println("Reduce 3 pages");
        }
        else {
            System.out.println("Reduce 2 pages");
        }
    }
    public void renderView(){
        System.out.println("Documents are updated");
    }
}
