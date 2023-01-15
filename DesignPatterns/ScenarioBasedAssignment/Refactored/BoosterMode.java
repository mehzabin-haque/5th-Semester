
package DesignPatterns.ScenarioBasedAssignment.Refactored;
public class BoosterMode {
    int threshold;
    int max_acceptable_level;
    BoosterMode(int color_intensity){
        if(threshold>max_acceptable_level ){
            System.out.println("Increase color intensity " + color_intensity++);
        }
        else{
            System.out.println("Decrease color intensity  " + color_intensity--);
        }
    }

}
