package KEA;

public class Moon extends OrbitalBody{
    private Planet planet;

    private double timeToOrbitePlanet;

    public Moon(Planet planet, double timeToOrbitePlanet) {
        this.planet = planet;
        this.timeToOrbitePlanet = timeToOrbitePlanet;
    }

    public Moon(String name, int masse, Planet planet, double timeToOrbitePlanet) {
        super(name, masse);
        this.planet = planet;
        this.timeToOrbitePlanet = timeToOrbitePlanet;
    }


    public Moon() {
    }

    public Moon(int timeToOrbitePlanet) {
        this.timeToOrbitePlanet = timeToOrbitePlanet;
    }

    @Override
    public void orbitsAround() {
        System.out.println("" + " orbits around the planet " );

    }

    @Override
    public String toString() {
        return "Moon{" +
                "timeToOrbitePlanet=" + timeToOrbitePlanet +
                '}';
    }


}
