class main{
    /*
 File: main.java
 Description: This is my final exam project
 Created: Wed. June 7, 2023
 Author: Elizabeth Willey
 email: elizabw0434@student.vvc.edu
*/

    public static Mountain minElevation(Mountain mountains[]) {//mountain class
        int min = 0;
        for (int i = 0; i < mountains.length; i++) {
            if (mountains[i].getElevation()< mountains[min].getElevation()) {
                min = i;
            }
        }
        return mountains[min]; //finding the smallest mountain
    }
    public static void main(String[] args) {
        Mountain mountains[] = new Mountain[7]; //putting in Mountains
        // the Java debugger thing helped with setting this up because I couldn't get it to run in their space
        mountains[0] = new Mountain ("Chimborazo","Ecuador",20549);
        mountains[1]= new Mountain("Matterhorn","Switzerland",14692);
        mountains[2]= new Mountain("Olympus","Greece",9573);
        mountains[3]= new Mountain("Everest","Nepal",29029);
        mountains[4]= new Mountain("Mount Marcy","United States",5344);
        mountains[5] = new Mountain("Mount Mitchell","United States",6684);
        mountains[6]= new Mountain("Zugspitze","Switzerland",9719);
        // creating a table so it looks cleaner by catagorizing each row

        System.out.printf("%-20s%-20s%10s%20s\n", "Mountain Name","Country","Elevation (ft)", "Elevation (mts)");
        for (Mountain mountain : mountains) {
            //https://www.javatpoint.com/how-to-print-table-in-java-using-formatter this helped me with forming the table
           // putting the data in the same format so it falls into the right row

            System.out.printf("%-20s%-20s%10d%20.2f\n", mountain.getName(),
             mountain.getCountry(), mountain.getElevation(),Mountain.toMeters(mountain.getElevation()));
        }
        Mountain smallest = minElevation(mountains);// calling minElevation
        System.out.println("Mountain with the smallest elevation: "+ smallest.getName());
        System.out.println(smallest.getName() +"'s Elevation: "+ smallest.getElevation()+ " meters");
        //printing out the smallest Mountain and its elevation 

    }
}