package com.example.hel;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnActTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnActTwo = (Button) findViewById(R.id.button);
        btnActTwo.setOnClickListener(this);




        //EditText.getBackground().mutate().setColorFilter(getResources().getColor(R.color.colorPrimary), PorterDuff.Mode.SRC_ATOP);

        //Задаем путь к нашим шрифтам:
        String fontPath1 = "fonts/helvetica.ttf";
        //Объявляем объекты типа TextView и привязываем их к наших элементам:
        TextView textView1 = (TextView) findViewById(R.id.tv1);
        //Объявляем сами шрифты:
        Typeface typeface1 = Typeface.createFromAsset(getAssets(), fontPath1);
        // Применяем шрифты к соответствующим текстовым элементам:
        textView1.setTypeface(typeface1);

    }
    //TextView.setText(getSpacedSpannable(context, textView.getText().toString(), <Your spacing DP>), TextView.BufferType.SPANNABLE);
    //Typeface customFont = Typeface.createFromAsset(getAssets(), "fonts/cinzel.ttf");

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                Intent intent = new Intent(this, activity_2.class);
                startActivity(intent);
                break;
            default:
                break;

        }

    }

}




