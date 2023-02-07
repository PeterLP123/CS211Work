package Lab1;
public class PoI {
    public String country;
    public String city;
    PoI(String country, String city){
        this.country = country;
        this.city = city;
    }

    public String get_country(){
        return country;
    }
    public String get_city(){
        return city;
    }
}