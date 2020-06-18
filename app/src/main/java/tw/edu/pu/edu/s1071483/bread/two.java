package tw.edu.pu.edu.s1071483.bread;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class two extends AppCompatActivity {
    EditText quantity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
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
                    int egg;
                    int cream;
                    int milk;
                    TextView result = (TextView)findViewById(R.id.tv5);
                    egg=3*fq;
                    result.setText("雞蛋"+egg);


                    TextView result1 = (TextView)findViewById(R.id.tv6);
                    sugar=fq*180;
                    result1.setText("糖"+sugar+"g");

                    TextView result2 = (TextView)findViewById(R.id.tv7);
                    flour=fq*1000;
                    result2.setText("麵粉"+flour+"g");

                    TextView result4 = (TextView)findViewById(R.id.tv8);
                    cream=fq*190;
                    result4.setText("奶油"+cream+"g");

                    TextView result5 = (TextView)findViewById(R.id.tv9);
                    cream=fq*250;
                    result5.setText("牛奶"+cream+"cc");

                }
            }
        });


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(two.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}