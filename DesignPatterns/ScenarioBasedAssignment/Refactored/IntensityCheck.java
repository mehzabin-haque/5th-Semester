package ScenarioBasedAssignment.Refactored;

public enum IntensityCheck {
    HIGH("high"),MEDIUM("medium"),LOW("low");
    final String type;

    IntensityCheck(String type){
        this.type = type;
    }
}
