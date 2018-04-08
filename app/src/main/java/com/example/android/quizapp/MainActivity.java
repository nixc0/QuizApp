package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    // Declare global variables
    int correctAnswers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public float calculateScore(View view) {

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

        RadioButton answerTen = findViewById(R.id.answerTenA);

        //Logic to grade the quiz

        // Is question one correct?
        if (answerOne.isChecked()) {
            correctAnswers += 1;
        }

        // Is question two correct?
        if (answerTwo.isChecked()) {
            correctAnswers += 1;
        }

        // Is question three correct?
        if (answerThree.isChecked()) {
            correctAnswers += 1;
        }

        // Is question four correct?
        if (answerFourB.isChecked()) {
            correctAnswers += .5;
        }
        if (answerFourD.isChecked()) {
            correctAnswers += .5;
        }


        // Is question five correct?
        if (answerFive.isChecked()) {
            correctAnswers += 1;
        }

        // Is question six correct?
        if (answerSix.isChecked()) {
            correctAnswers += 1;
        }

        // Is question seven correct?
        if (answerSeven.isChecked()) {
            correctAnswers += 1;
        }

        // Is question eight correct?
        if (answerEight.isChecked()) {
            correctAnswers += 1;
        }

        // Is question nine correct?

        // Is question ten correct?
        if (answerTen.isChecked()) {
            correctAnswers += 1;
        }

        //Calculate score
        float score = correctAnswers / 10;
        return score;


    }
}
