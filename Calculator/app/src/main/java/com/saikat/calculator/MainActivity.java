package com.saikat.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView layoutDisplayTextview,layoutResultTextview,buttonClear,buttonDelete,buttonMudulus,buttonDivision;
    TextView buttonSeven,buttonEight,buttonNine,buttonMultiply,buttonFour,buttonFive,buttonSix,buttonThree,buttonTwo,buttonOne,buttonPlus,buttonMinius,buttonZero,buttonDot,buttonEqual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layoutDisplayTextview=findViewById(R.id.layoutDisplayTextview);
        layoutResultTextview=findViewById(R.id.layoutResultTextview);
        buttonClear=findViewById(R.id.buttonClear);
        buttonDelete=findViewById(R.id.buttonDelete);
        buttonMudulus=findViewById(R.id.buttonModulus);
        buttonDivision=findViewById(R.id.buttonDivision);
        buttonOne=findViewById(R.id.buttonOne);
        buttonTwo=findViewById(R.id.buttonTwo);
        buttonThree=findViewById(R.id.buttonThree);
        buttonFour=findViewById(R.id.buttonFour);
        buttonFive=findViewById(R.id.buttonFive);
        buttonSix=findViewById(R.id.buttonSix);
        buttonSeven=findViewById(R.id.buttonSeven);
        buttonEight=findViewById(R.id.buttonEight);
        buttonNine=findViewById(R.id.buttonNine);
        buttonMultiply=findViewById(R.id.buttonMultiply);
        buttonPlus=findViewById(R.id.buttonPlus);
        buttonMinius=findViewById(R.id.buttonMinius);
        buttonZero=findViewById(R.id.buttonZero);
        buttonDot=findViewById(R.id.buttonDot);
        buttonEqual=findViewById(R.id.buttonEqual);

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutDisplayTextview.setText("1");
            }
        });




    }
}