package com.example.st.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int generate;

    public void generateNum (){
        Random RandomNum = new Random();
        generate = 1+ RandomNum.nextInt(20);

    }
    public void guessTheNumber(View view){
        // Button
        Log.i("Info","Button Pressed!");
        // Code
        EditText guessedNum = (EditText)findViewById(R.id.guessedNum);
        String guessedNumStr = guessedNum.getText().toString();
        Log.i("guessed number is : ",guessedNumStr);
        Integer guessedNumInt = Integer.parseInt(guessedNumStr);

        // Check the answer
        if(guessedNumInt==generate){
            Toast.makeText(this, "You got it! Try it again :)", Toast.LENGTH_LONG).show();
            generateNum ();

        }
        else if(guessedNumInt<generate){
            Toast.makeText(this, "Higher!", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, "Lower!", Toast.LENGTH_LONG).show();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // generate a number between 1 and 20
        generateNum ();

    }
}
