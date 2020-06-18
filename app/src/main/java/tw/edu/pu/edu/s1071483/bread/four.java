package tw.edu.pu.edu.s1071483.bread;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class four extends AppCompatActivity {
    EditText quantity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
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
                    int cream;
                    int milk;
                    int salt;
                    int water;
                    TextView result = (TextView)findViewById(R.id.tv5);
                    cream=45*fq;
                    result.setText("奶油"+cream);

                    TextView result1 = (TextView)findViewById(R.id.tv6);
                    sugar=fq*20;
                    result1.setText("糖"+sugar+"g");

                    TextView result2 = (TextView)findViewById(R.id.tv7);
                    flour=fq*280;
                    result2.setText("麵粉"+flour+"g");

                    TextView result3 = (TextView)findViewById(R.id.tv8);
                    milk=fq*40;
                    result3.setText("牛奶"+milk+"g");

                    TextView result4 = (TextView)findViewById(R.id.tv9);
                    salt=fq*5;
                    result4.setText("鹽"+salt+"g");

                    TextView result5 = (TextView)findViewById(R.id.tv10);
                    water=fq*140;
                    result5.setText("水"+water+"g");


                }
            }
        });


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(four.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}