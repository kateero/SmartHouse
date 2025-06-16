package EngineeringSystems;

public class SystemParameter {

    protected final String name;
    protected double currentValue;
    protected NormalDistributionGenerator normalGenerator;
    protected NormalDistributionGenerator abnormalGenerator;
    protected boolean isUsingNormalGenerator;

    public SystemParameter(String name, double mean, double sd, double abnormalMean, double abnormalSd) {
        this.name = name;
        this.normalGenerator = new NormalDistributionGenerator(mean, sd);
        this.abnormalGenerator = new NormalDistributionGenerator(abnormalMean, abnormalSd);
        this.isUsingNormalGenerator = true;
    }

    public String getName() {
        return name;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public void setNormalState(boolean isNormal) {
        this.isUsingNormalGenerator = isNormal;
    }

    public void updateCurrentValue() {
        if (isUsingNormalGenerator) {
            this.currentValue = normalGenerator.nextValue(); 
        } else {
            this.currentValue = abnormalGenerator.nextValue();
        }
    }
}
