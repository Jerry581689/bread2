package tw.edu.pu.edu.s1071483.bread;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class five extends AppCompatActivity {
    EditText quantity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
        quantity = (EditText)findViewById(R.id.et1);
        Button back = (Button) findViewById(R.id.back);
        Button search = (Button)findViewById(R.id.search);

        search.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View arg0) {
                if ( !("".equals(quantity.getText().toString())) )
                {
                    int fq = Integer.parseInt(quantity.getEditableText().toString());
                    int sugar;
                    int flour;
                    int milk;
                    int salt;
                    int cream;
                    TextView result = (TextView)findViewById(R.id.tv5);
                    milk=fq*240;
                    result.setText("鮮奶"+milk+"g");


                    TextView result1 = (TextView)findViewById(R.id.tv6);
                    sugar=fq*10;
                    result1.setText("糖"+sugar+"g");

                    TextView result2 = (TextView)findViewById(R.id.tv7);
                    flour=fq*85;
                    result2.setText("麵粉"+flour+"g");

                    TextView result3 = (TextView)findViewById(R.id.tv8);
                    salt=fq*5;
                    result3.setText("鹽"+salt+"g");

                    TextView result4 = (TextView)findViewById(R.id.tv9);
                    cream=fq*18;
                    result4.setText("鹽"+cream+"g");

                }
            }
        });


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(five.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}