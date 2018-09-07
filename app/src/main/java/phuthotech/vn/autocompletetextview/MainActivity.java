package phuthotech.vn.autocompletetextview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import java.io.UnsupportedEncodingException;

public class MainActivity extends AppCompatActivity {
    private static final String[] COUNTRIES = new String[]{
            "Afghanistan", "Albania", "Algeria", "Andorra", "Angola"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] countries = getResources().getStringArray(R.array.countries);

        AutoCompleteTextView editText = findViewById(R.id.actv);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.custom_list_item, R.id.text_view_list_item, countries);
        editText.setAdapter(adapter);
        //editText.setThreshold(1);

        //get the input like for a normal EditText
        //String input = editText.getText().toString();


        startActivity(new Intent(this, Main3Activity.class));



        String d = "Huỳnh Ngọc Châu";

        String s = convertToUTF8(d);

        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();

    }

    public static String convertFromUTF8(String s) {
        String out = null;
        try {
            out = new String(s.getBytes("ISO-8859-1"), "UTF-8");
        } catch (java.io.UnsupportedEncodingException e) {
            return null;
        }
        return out;
    }

    public static String convertToUTF8(String s) {
        String out = null;
        try {
            out = new String(s.getBytes("UTF-8"), "ISO-8859-1");
        } catch (java.io.UnsupportedEncodingException e) {
            return null;
        }
        return out;
    }

}
