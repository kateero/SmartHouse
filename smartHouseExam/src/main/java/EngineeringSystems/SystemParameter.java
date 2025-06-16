package EngineeringSystems;

public class SystemParameter {

    protected double currentValue;
    protected NormalDistributionGenerator normalGenerator;
    protected NormalDistributionGenerator abnormalGenerator;
    protected boolean isUsingNormalGenerator;

    public SystemParameter(double mean, double sd, double abnormalMean, double abnormalSd) {
        this.normalGenerator = new NormalDistributionGenerator(mean, sd);
        this.abnormalGenerator = new NormalDistributionGenerator(abnormalMean, abnormalSd);
        this.isUsingNormalGenerator = true;
    }
    
    public double getCurrentValue() {
        return currentValue;
    }

    public void setNormalState(boolean isNormal) {
        this.isUsingNormalGenerator = isNormal;
    }

    public void updateCurrentValue() {
        if (isUsingNormalGenerator) {
            this.currentValue = Math.abs(normalGenerator.nextValue()); 
        } else {
            this.currentValue = Math.abs(abnormalGenerator.nextValue());
        }
    }
}
