package tw.edu.pu.edu.s1071483.bread;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class three extends AppCompatActivity {
    EditText quantity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
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
                    int salt;
                    int water;
                    int cream;
                    TextView result = (TextView)findViewById(R.id.tv5);
                    result.setText("蛋黃"+fq);


                    TextView result1 = (TextView)findViewById(R.id.tv6);
                    sugar=fq*50;
                    result1.setText("糖"+sugar+"g");

                    TextView result2 = (TextView)findViewById(R.id.tv7);
                    flour=fq*500;
                    result2.setText("麵粉"+flour+"g");

                    TextView result3 = (TextView)findViewById(R.id.tv8);
                    salt=fq*5;
                    result3.setText("鹽"+salt+"g");

                    TextView result4 = (TextView)findViewById(R.id.tv9);
                    water=fq*250;
                    result4.setText("水"+water+"g");

                    TextView result5 = (TextView)findViewById(R.id.tv10);
                    cream=fq*40;
                    result5.setText("奶油"+cream+"g");
                }
            }
        });


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(three.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}