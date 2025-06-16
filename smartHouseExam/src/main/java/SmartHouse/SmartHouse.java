package SmartHouse;

import EngineeringSystems.ConcreteSystems.*;
import EngineeringSystems.EngineeringSystem;
import java.util.ArrayList;

public class SmartHouse {

    private ArrayList<EngineeringSystem> systems;

    public SmartHouse() {
        this.systems = new ArrayList<>();
        this.systems.add(new AirConditioner());
        this.systems.add(new Boiler());
        this.systems.add(new GasPipeline());
        this.systems.add(new HeatingSystem());
        this.systems.add(new PumpStation());
        this.systems.add(new Transformer());
    }

    public ArrayList<EngineeringSystem> getSystems() {
        return systems;
    }

    public void updateSystems() {
        for (EngineeringSystem system : systems) {
            system.updateState();
        }
    }
    
    public void addSystem(EngineeringSystem system){
        this.systems.add(system);
    }
}
