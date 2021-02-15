package KEA;

import java.util.List;
import java.util.Objects;

public class Planet extends OrbitalBody{
    private int numberOfMoons;
    private int distanceToSun;
    private int timeToOrbitSun;

    public Planet (){

    }

    public Planet(String name, int masse, int numberOfMoons, int distanceToSun, int timeToOrbitSun) {
        super(name, masse);
        this.numberOfMoons = numberOfMoons;
        this.distanceToSun = distanceToSun;
        this.timeToOrbitSun = timeToOrbitSun;
    }

    public int getNumberOfMoons() {
        return numberOfMoons;
    }

    public void setNumberOfMoons(int numberOfMoons) {
        this.numberOfMoons = numberOfMoons;
    }

    public long getDistanceToSun() {
        return distanceToSun;
    }

    public void setDistanceToSun(int distanceToSun) {
        this.distanceToSun = distanceToSun;
    }

    public int getTimeToOrbitSun() {
        return timeToOrbitSun;
    }

    public void setTimeToOrbitSun(int timeToOrbitSun) {
        this.timeToOrbitSun = timeToOrbitSun;
    }

    @Override
    public String toString() {
        return "\n Planet{" + super.getName() +
                "Planet's Masse: " + super.getMasse() + " Solar masse" +

                " : NumberOfMoons=" + numberOfMoons +
                ", DistanceToSun= " + distanceToSun + " millions kilometer" +
                ", Time to orbit sun=" + timeToOrbitSun +
                '}';
    }

    @Override
    public void orbitsAround() {

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Planet)) return false;
        if (!super.equals(o)) return false;
        Planet planet = (Planet) o;
        return numberOfMoons == planet.numberOfMoons && distanceToSun == planet.distanceToSun && timeToOrbitSun == planet.timeToOrbitSun;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfMoons, distanceToSun, timeToOrbitSun);
    }
}
