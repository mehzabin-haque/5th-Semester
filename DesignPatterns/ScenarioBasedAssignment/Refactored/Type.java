package ScenarioBasedAssignment.Refactored;

public enum Type {
    HALF(100,"potrait"),FEW(100,"landscape"), THREE(50,"potrait"),TWO(50,"landscape");
    final int size;
    final String orien;

    Type(int size,String orien){
        this.size = size;
        this.orien = orien;
    }
}
