package tw.edu.pu.edu.s1071483.bread;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class one extends AppCompatActivity {
    EditText quantity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
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
                    int milkpowder;
                    int cream;
                    int eggyolk;
                    int salt;
                    TextView result = (TextView)findViewById(R.id.tv5);
                    result.setText("菠蘿皮"+fq);

                    TextView result1 = (TextView)findViewById(R.id.tv6);
                    sugar=fq*60;
                    result1.setText("糖"+sugar+"g");

                    TextView result2 = (TextView)findViewById(R.id.tv7);
                    flour=fq*110;
                    result2.setText("麵粉"+flour+"g");

                    TextView result3 = (TextView)findViewById(R.id.tv8);
                    milkpowder=fq*15;
                    result3.setText("奶粉"+milkpowder+"g");

                    TextView result4 = (TextView)findViewById(R.id.tv9);
                    cream=fq*60;
                    result4.setText("奶油"+cream+"g");

                    TextView result5 = (TextView)findViewById(R.id.tv10);
                    eggyolk=fq*40;
                    result5.setText("蛋黃液"+eggyolk+"g");

                    TextView result6 = (TextView)findViewById(R.id.tv11);
                    salt=fq*3;
                    result6.setText("鹽"+salt+"g");
                }
            }
        });


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(one.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}