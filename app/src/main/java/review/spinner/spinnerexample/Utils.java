package review.spinner.spinnerexample;

import java.util.ArrayList;

public class Utils {
    ArrayList<Country> countries=new ArrayList<>();

    public ArrayList<Country> loadCountry(){
        this.countries.add(new Country("Canada",123243,"canada.png"));
        this.countries.add(new Country("Turkey",35645634,"turkey.png"));
        this.countries.add(new Country("Italy",23456,"italy.png"));

        return countries;
    }
}
