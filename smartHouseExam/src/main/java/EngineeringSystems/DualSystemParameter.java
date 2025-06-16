package EngineeringSystems;

public class DualSystemParameter extends SystemParameter {

    private NormalDistributionGenerator abnormalLowGenerator;
    private boolean isHighAbnormal;

    public DualSystemParameter(String name, double mean, double sd,
            double abnormalHighMean, double abnormalHighSd,
            double abnormalLowMean, double abnormalLowSd) {
        super(name, mean, sd, abnormalHighMean, abnormalHighSd);
        this.abnormalLowGenerator = new NormalDistributionGenerator(abnormalLowMean, abnormalLowSd);
    }

    @Override
    public void setNormalState(boolean isNormal) {
        this.isUsingNormalGenerator = isNormal;
        this.isHighAbnormal = Math.random() > 0.5;
    }

    @Override
    public void updateCurrentValue() {
        if (isUsingNormalGenerator) {
            this.currentValue = normalGenerator.nextValue();
        } else if (isHighAbnormal) {
            this.currentValue = abnormalGenerator.nextValue();
        } else {
            this.currentValue = abnormalLowGenerator.nextValue();
        }
    }
}
