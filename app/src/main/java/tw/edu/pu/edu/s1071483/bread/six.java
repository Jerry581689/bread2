package tw.edu.pu.edu.s1071483.bread;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class six extends AppCompatActivity {
    EditText quantity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six);
        quantity = (EditText)findViewById(R.id.et1);
        Button back = (Button) findViewById(R.id.back);
        Button search = (Button)findViewById(R.id.search);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        search.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View arg0) {
                if ( !("".equals(quantity.getText().toString())) )
                {
                    int fq = Integer.parseInt(quantity.getEditableText().toString());
                    int sugar;
                    int flour;
                    int egg;
                    int s;
                    TextView result = (TextView)findViewById(R.id.tv5);
                    s=fq*10;
                    result.setText("草莓醬"+s+"g");


                    TextView result1 = (TextView)findViewById(R.id.tv6);
                    sugar=fq*120;
                    result1.setText("糖"+sugar+"g");

                    TextView result2 = (TextView)findViewById(R.id.tv7);
                    flour=fq*460;
                    result2.setText("麵粉"+flour+"g");

                    TextView result3 = (TextView)findViewById(R.id.tv8);
                    egg=fq*50;
                    result3.setText("雞蛋"+egg+"g");

                }
            }
        });


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(six.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}