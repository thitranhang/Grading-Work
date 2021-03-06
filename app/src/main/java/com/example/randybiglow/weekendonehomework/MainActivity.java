package com.example.randybiglow.weekendonehomework;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText textEdits;
    TextView textButton;
    //Saves memory in space for TextView and EditText.


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Is onCreate the same as our main method in any other Java project?

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Auto-generated by android.

        textButton = (TextView) (findViewById(R.id.displayPF));
        textEdits = (EditText) (findViewById(R.id.enterText));
        //Utilizes the saved memory space for the names of TextView and EditText.
        //Allows the TextView and EditText to reference each other.
    }

    public void gradeButton(View arbitraryName) {
        int number = Integer.parseInt(textEdits.getText().toString());
        //Allows for "number" to interpret the numbers user enter.
        if (number > 100 || number < 0) {
            Toast showToast = Toast.makeText(getApplicationContext(), "Please enter a number between 0-100", Toast.LENGTH_SHORT);
            //Limits the User to only input numbers between 0-100.
            showToast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL, 0, 0);
            //Positions the Toast message to appear in the center of the screen, close to the placement of the EditText.
            showToast.show();
            //This activates the Toast message to show on the screen.

        } else {
            //I can put another if/else within another if/else. That's awesome.
            if (number >= 90) {
                textButton.setText("A");
                textButton.setBackgroundColor(Color.GREEN);
                //This should print the letter grade in Green through TextView.
                //Grading system is changed from the UK to the US.

            } else if (number >= 80) {
                textButton.setText("B");
                textButton.setTextColor(Color.GREEN);

            } else if (number >= 70) {
                textButton.setText("C");
                textButton.setTextColor(Color.GREEN);

            } else if (number >= 60) {
                textButton.setText("D");
                textButton.setTextColor(Color.GREEN);

            } else {
                textButton.setText("F");
                textButton.setTextColor(Color.RED);
            }
        }
    }

    public void passOrFailButton(View arbitraryName) {
        int number = Integer.parseInt(textEdits.getText().toString());
        if (number > 100 || number < 0) {
            Toast showToast = Toast.makeText(getApplicationContext(), "Please enter a number between 0-100", Toast.LENGTH_SHORT);
            //Limits the User to only input numbers between 0-100.
            showToast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL, 0, 0);
            //Positions the Toast message to appear in the center of the screen, close to the placement of the EditText.
            showToast.show();
            //This activates the Toast message to show on the screen.
        } else {
            if (number >= 65) {
                textButton.setText("Pass");
                textButton.setTextColor(Color.GREEN);
                //I am not sure why the colors are highlighted.

            } else {
                textButton.setText("Fail");
                textButton.setTextColor(Color.RED);
            }
        }
    }

    public void fiveTimesButton(View arbitraryName) {
        String fiveTimes = textEdits.getText().toString();
        textButton.setText(fiveTimes + " " + fiveTimes + " "  + fiveTimes + " "  + fiveTimes + " " + fiveTimes);
        //Super awesome hacky way to print something five times with space!
        //I allowed any number to be printed beyond number > 100 and < 0.
    }
}