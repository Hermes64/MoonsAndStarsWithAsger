package KEA;

import java.util.Objects;

public abstract class OrbitalBody {

   private String name ;
   private int masse;

   public OrbitalBody() {
   }

   public OrbitalBody(String name, int masse) {
      this.name = name;
      this.masse = masse;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getMasse() {
      return masse;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof OrbitalBody)) return false;
      OrbitalBody that = (OrbitalBody) o;
      return masse == that.masse && name.equals(that.name);
   }

   @Override
   public int hashCode() {
      return Objects.hash(name, masse);
   }

   @Override
   public String toString() {
      return "OrbitalBody{" +
              "name='" + name + '\'' +
              ", masse=" + masse +
              '}';
   }

   public abstract void orbitsAround ();
}



