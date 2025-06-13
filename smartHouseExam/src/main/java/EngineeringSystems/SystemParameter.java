package EngineeringSystems;

public class SystemParameter {
    private final String name;
    private double mean;
    private double sd;
    private double currentValue;
    private NormalDistributionGenerator generator;

    public SystemParameter(String name, double mean, double sd) {
        this.name = name;
        this.mean = mean;
        this.sd = sd;
        this.generator = new NormalDistributionGenerator(mean, sd);
    }

    public String getName() {
        return name;
    }

    public double getCurrentValue() {
        return currentValue;
    }
    
    public void updateCurrentValue(){
        this.currentValue = generator.nextValue();
    } 
}
