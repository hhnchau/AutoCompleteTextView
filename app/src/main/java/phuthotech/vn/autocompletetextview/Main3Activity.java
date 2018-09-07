package phuthotech.vn.autocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;
import java.util.List;

public class Main3Activity extends AppCompatActivity {

    private List<CountryItem> countryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fillCountryList();

        AutoCompleteTextView editText = findViewById(R.id.actv);
        AutoCompleteCountryAdapter adapter = new AutoCompleteCountryAdapter(this, countryList);
        editText.setAdapter(adapter);
    }

    private void fillCountryList() {
        countryList = new ArrayList<>();
        countryList.add(new CountryItem("Afghanistan", R.drawable.ic_launcher_background));
        countryList.add(new CountryItem("Albania", R.drawable.ic_launcher_background));
        countryList.add(new CountryItem("Algeria", R.drawable.ic_launcher_background));
        countryList.add(new CountryItem("Andorra", R.drawable.ic_launcher_background));
        countryList.add(new CountryItem("Angola", R.drawable.ic_launcher_background));
    }
}
