package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Declare global variables
    double correctAnswers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateScore(View view) {

        //Get all correct answers
        RadioButton answerOne = findViewById(R.id.answerOneB);
        RadioButton answerTwo = findViewById(R.id.answerTwoC);
        RadioButton answerThree = findViewById(R.id.answerThreeB);
        CheckBox answerFourB = findViewById(R.id.answerFourB);
        CheckBox answerFourD = findViewById(R.id.answerFourD);
        RadioButton answerFive = findViewById(R.id.answerFiveB);
        RadioButton answerSix = findViewById(R.id.answerSixA);
        RadioButton answerSeven = findViewById(R.id.answerSevenB);
        RadioButton answerEight = findViewById(R.id.answerEightC);
        EditText answerNine = (EditText) findViewById(R.id.answerNineText);
        RadioButton answerTen = findViewById(R.id.answerTenA);

        //Logic to grade the quiz

        // Is question one correct?
        if (answerOne.isChecked()) {
            correctAnswers = correctAnswers + 1;
        }

        // Is question two correct?
        if (answerTwo.isChecked()) {
            correctAnswers = correctAnswers + 1;
        }

        // Is question three correct?
        if (answerThree.isChecked()) {
            correctAnswers = correctAnswers + 1;
        }

        // Is question four correct?
        if (answerFourB.isChecked()) {
            correctAnswers = correctAnswers + .5;
        }
        if (answerFourD.isChecked()) {
            correctAnswers = correctAnswers + .5;
        }


        // Is question five correct?
        if (answerFive.isChecked()) {
            correctAnswers = correctAnswers + 1;
        }

        // Is question six correct?
        if (answerSix.isChecked()) {
            correctAnswers = correctAnswers + 1;
        }

        // Is question seven correct?
        if (answerSeven.isChecked()) {
            correctAnswers = correctAnswers + 1;
        }

        // Is question eight correct?
        if (answerEight.isChecked()) {
            correctAnswers = correctAnswers + 1;
        }

        // Is question nine correct?
        String answerNineString = answerNine.getText().toString();
        if (answerNineString.equals(":")) {
            correctAnswers++;
        }
        // Is question ten correct?
        if (answerTen.isChecked()) {
            correctAnswers = correctAnswers + 1;
        }

        //Calculate score
        double score = correctAnswers * 10.0;

        //Display score as a Toast
        Toast toast = Toast.makeText(getApplicationContext(), "You scored " + score, Toast.LENGTH_LONG);
        toast.show();

        //Reset variable so that multiple presses of submit does not count correct answers multiple times.
        correctAnswers = 0;
    }


}
