package DesignPatterns.ScenarioBasedAssignment.Refactored;

public class PageSaveMode extends PrintMode{

    public void savePage() {

        for(Type t : Type.values()){
            if(page_size == t.size && orientation==t.orien){
                System.out.println("Number of pages reduced to " + t.name());
            }
            else{
                System.out.println("Number of pages can't be reduced.");
            }
        }
    }

}
