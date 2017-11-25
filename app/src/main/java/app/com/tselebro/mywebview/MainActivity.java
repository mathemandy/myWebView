package app.com.tselebro.mywebview;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;
import android.widget.TextView;

import com.thefinestartist.finestwebview.FinestWebView;

public class MainActivity extends AppCompatActivity {

    private String Url = "https://uniuyo.edu.ng/eportals/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextInputEditText
                textView = findViewById(R.id.input_url);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("http://");
                
                Url = textView.getText().toString();
                startWebView();
            }
        });

    }


    private void startWebView(){
        new FinestWebView.Builder(this)
                .backPressToClose(true)
                .show(Url);


    }
}
