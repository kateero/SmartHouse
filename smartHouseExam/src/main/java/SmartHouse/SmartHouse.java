package SmartHouse;

import EngineeringSystems.ConcreteSystems.*;
import EngineeringSystems.EngineeringSystem;
import java.util.ArrayList;

public class SmartHouse {

    private ArrayList<EngineeringSystem> systems;

    public SmartHouse() {
        this.systems = new ArrayList<>();
    }

    public ArrayList<EngineeringSystem> getSystems() {
        return systems;
    }

    public void updateSystems() {
        for (EngineeringSystem system : systems) {
            system.updateState();
        }
    }

    public void addSystem(EngineeringSystem system) {
        this.systems.add(system);
    }
}
