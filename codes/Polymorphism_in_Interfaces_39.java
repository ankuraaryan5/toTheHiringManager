interface Camera{
    void clickingPictures();
}
interface GPS{
    void searchGPS();
}

class Phone implements Camera, GPS{
    public void clickingPictures(){
        System.out.println("clicking beautiful pictures");
    };
    public void searchGPS(){
        System.out.println("Searching for the location");
    }
}
public class Polymorphism_in_Interfaces_39 {
    public static void main(String[] args) {
        GPS G = new Phone();
        Camera c = new Phone();
        G.searchGPS();
        c.clickingPictures();
        // c.searchGPS() // not allowed because it is restricted
        Phone phone = new Phone(); // make a phone object to use any method without restriction
        phone.searchGPS();
        phone.clickingPictures();
    }
}
