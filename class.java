public class Building {
    private String foundation;
    private int emergencyExits; 
    private String thermalInsulation;
    private String facade;

    public Building() {
        this.foundation = "";
        this.emergencyExits = 0;
        this.thermalInsulation = "";
        this.facade = "";
    }

    public Building(String foundation, int emergencyExits, String thermalInsulation, String facade) {
        this.foundation = foundation;
        this.emergencyExits = emergencyExits;
        this.thermalInsulation = thermalInsulation;
        this.facade = facade;
    }

    public void displayInfo() {
        System.out.println("Foundation: " + foundation);
        System.out.println("Number of Emergency Exits: " + emergencyExits);
        System.out.println("Thermal Insulation: " + thermalInsulation);
        System.out.println("Facade: " + facade);
    }

    public double calculateEstimatedCost() {
        double baseCost = 1000000;
        if (foundation.equals("concrete")) {
            baseCost += 50000;
        } else if (foundation.equals("pile")) {
            baseCost += 75000;
        }
        return baseCost;
    }
}
