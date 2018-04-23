package ro.beia.beiahive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.beiahive.R;


public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "webAddress";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //this.requestWindowFeature(Window.FEATURE_NO_TITLE); //turns off the title at the top of the screen
        setContentView(R.layout.activity_main);



        Button goButton = (Button) findViewById(R.id.button);
        goButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                EditText webAddress = (EditText) findViewById(R.id.webAddressText);
                Intent i = new Intent(v.getContext(), WebViewActivity.class);
                i.putExtra(EXTRA_MESSAGE, webAddress.getText().toString());
                startActivity(i);
            }
        });

        Button iflButton = (Button) findViewById(R.id.button2);
        iflButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
//                EditText webAddress = (EditText) findViewById(R.id.webAddressText);
                Intent i = new Intent(v.getContext(), WebViewActivity.class);
                startActivity(i);
            }
        });



    }
}
