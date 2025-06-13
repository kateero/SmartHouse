package EngineeringSystems;

import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;

public class NormalDistributionGenerator {

    private NormalDistribution distribution;

    public NormalDistributionGenerator(double mean, double stdDev) {
        RandomGenerator generator = new Well19937c();
        this.distribution = new NormalDistribution(generator, mean, stdDev);
    }

    public double nextValue() {
        return distribution.sample();
    }
}
