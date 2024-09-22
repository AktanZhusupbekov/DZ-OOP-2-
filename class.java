public class Building {
    private String foundation;
    private String roof;
    private String thermalInsulation;
    private String facade;

    public Building() {
        this.foundation = "";
        this.roof = "";
        this.thermalInsulation = "";
        this.facade = "";
    }

    public Building(String foundation, String roof, String thermalInsulation, String facade) {
        this.foundation = foundation;
        this.roof = roof;
        this.thermalInsulation = thermalInsulation;
        this.facade = facade;
    }

    public void displayInfo() {
        System.out.println("Foundation: " + foundation);
        System.out.println("Roof: " + roof);
        System.out.println("Thermal Insulation: " + thermalInsulation);
        System.out.println("Facade: " + facade);
    }

    public double ESC() {
        double baseCost = 1000000;
        if (foundation.equals("concrete")) {
            baseCost += 50000;
        } else if (foundation.equals("pile")) {
            baseCost += 75000;
        }
        return baseCost;
    }
}
