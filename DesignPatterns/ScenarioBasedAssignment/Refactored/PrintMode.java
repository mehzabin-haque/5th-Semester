package ScenarioBasedAssignment.Refactored;

public abstract class PrintMode {
    protected String orientation;
    protected int color_intensity;
    protected int cost_per_page,number_of_pages, page_size;
    public abstract void savePage();
}
