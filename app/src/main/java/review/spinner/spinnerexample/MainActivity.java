package review.spinner.spinnerexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    final String TAG="Spinner";
    //create reference to the spinner
    Spinner spinner;
    Spinner customSpinner;
    Spinner namePopulation;
    // data source for basic spinner
    String[] fruits = {"apple", "banana", "carrot", "donut", "eggplant"};
    //create object from util class
    Utils utils=new Utils();
    //create arrayList kind of Country
    ArrayList<Country>countries=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        spinner=findViewById(R.id.spinner);
        customSpinner=findViewById(R.id.customSpinner);
        namePopulation=findViewById(R.id.spNamePopulation);
        //create arrayAdapter that take three parameters
        //first parameter represents content
        //layout-->it represents what does look like each row
        //data source-->which data displays each row
        ArrayAdapter<String> fruitsAdapter=new ArrayAdapter<String>(this,
                R.layout.layout_fruits,this.fruits);
        spinner.setAdapter(fruitsAdapter);

        //detect when an item selected
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            //when item selected runs
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String item=fruits[position];
                Log.d(TAG,"Selected item is :"+item);
            }
            @Override
            //it runs when item is not selected
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        customSpinner();
    }

    //get to selected item from spinner
    public void getSelectedItem(View view){
        String itemSelected=spinner.getSelectedItem().toString();
        Toast toast=Toast.makeText(this,"You Picked:"+itemSelected,Toast.LENGTH_LONG);
        toast.show();
    }

    //custom spinner using country class
    public void customSpinner(){
        //load to data from utils class to arrayList
        this.countries=this.utils.loadCountry();

        //Create an arrayList of country names
        ArrayList<String >countryNames=new ArrayList<>();
        //generate an array of country names to use as a data sources
        for(Country current:this.countries){
            countryNames.add(current.getName());
        }

        //create a arrayAdapter for these country names
        ArrayAdapter<String>countryNameAdapter=new ArrayAdapter(getApplicationContext(),
                R.layout.layout_fruits,countryNames);
        //connect adapter with spinner
        customSpinner.setAdapter(countryNameAdapter);
    }

}