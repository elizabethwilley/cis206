
public class Mountain { // it took me a bit to figure out how to make a different file 
    private String name;

    private String country;

    private int elevation;
    // declaring private ints

    public Mountain() {
        this.name = "";

     this.country = "";

     this.elevation = 0;
    }

    public Mountain(String name, String country, int elevation) {
        this.name = name;

        this.country = country;

         this.elevation = elevation;
    }

    public void setName(String name){// separately have to set each string and int because before it was just saying null for everything
    this.name = name;
    }
    public void setCountry(String country){
        this.country= country;
    }
    public void setElevation(int elevation){
        this.elevation= elevation;
    }
    public String getName() {
        return name;
    } // setter and getters to return the names and ints
    public String getCountry() {
        return country;
    }
    public int getElevation() {
        return elevation;
    }
    public static double toMeters(double elevationInFeet){// toMeters member function to convert
        final double FT_TO_METER = 1/3.2808;// final int because the conversion can't be changed
        return elevationInFeet *FT_TO_METER;
    }
}
