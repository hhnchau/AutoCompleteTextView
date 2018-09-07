package phuthotech.vn.autocompletetextview;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements TextWatcher {

    TextView selection;
    //Khai báo 2 CompleteTextView
    AutoCompleteTextView singleComplete;
    MultiAutoCompleteTextView multiComplete;
    //Khởi tạo mảng tạm để Test
    String arr[] = {"hà nội", "Huế", "Sài gòn",
            "hà giang", "Hội an", "Kiên giang",
            "Lâm đồng", "Long khánh", "hà nội", "Huế", "Sài gòn",
            "hà giang", "Hội an", "Kiên giang",
            "Lâm đồng", "Long khánh", "hà nội", "Huế", "Sài gòn",
            "hà giang", "Hội an", "Kiên giang",
            "Lâm đồng", "Long khánh", "hà nội", "Huế", "Sài gòn",
            "hà giang", "Hội an", "Kiên giang",
            "Lâm đồng", "Long khánh","hà nội", "Huế", "Sài gòn",
            "hà giang", "Hội an", "Kiên giang",
            "Lâm đồng", "Long khánh","hà nội", "Huế", "Sài gòn",
            "hà giang", "Hội an", "Kiên giang",
            "Lâm đồng", "Long khánh","hà nội", "Huế", "Sài gòn",
            "hà giang", "Hội an", "Kiên giang",
            "Lâm đồng", "Long khánh","hà nội", "Huế", "Sài gòn",
            "hà giang", "Hội an", "Kiên giang",
            "Lâm đồng", "Long khánh","hà nội", "Huế", "Sài gòn",
            "hà giang", "Hội an", "Kiên giang",
            "Lâm đồng", "Long khánh"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        selection = findViewById(R.id.selection);
        //lấy đối tượng AutoCompleteTextView ra
        singleComplete = findViewById(R.id.editauto);
        //Thiết lập để lắng nghe TextChange
        singleComplete.addTextChangedListener(this);
        //Thiết lập ArrayADapter
        singleComplete.setAdapter(
                new ArrayAdapter<String>
                        (
                                this,
                                android.R.layout.simple_list_item_1,
                                arr
                        ));

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                singleComplete.showDropDown();
            }
        }, 500);

        multiComplete = findViewById(R.id.multiAutoCompleteTextView1);
        //Thiết lập ArrayADapter
        multiComplete.setAdapter(
                new ArrayAdapter<String>
                        (
                                this,
                                android.R.layout.simple_list_item_1,
                                arr
                        ));
        multiComplete.setTokenizer(new MultiAutoCompleteTextView
                .CommaTokenizer());
    }

    public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
        selection.setText(singleComplete.getText());
    }

    public void afterTextChanged(Editable arg0) {
    }

    public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                                  int arg3) {
    }
}
