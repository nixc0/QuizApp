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
    private double correctAnswers = 0;

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
        CheckBox answerFourA = findViewById(R.id.answerFourA);
        CheckBox answerFourB = findViewById(R.id.answerFourB);
        CheckBox answerFourC = findViewById(R.id.answerFourC);
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
            correctAnswers++;
        }

        // Is question two correct?
        if (answerTwo.isChecked()) {
            correctAnswers++;
        }

        // Is question three correct?
        if (answerThree.isChecked()) {
            correctAnswers++;
        }

        // Is question four correct?

        // Completely correct by checking both B and D
        if (answerFourB.isChecked() && answerFourD.isChecked() && !answerFourA.isChecked() && !answerFourC.isChecked()) {
            correctAnswers++;
        }

        // Half correct by only checking answer B
        else if (answerFourB.isChecked() && !answerFourD.isChecked() && !answerFourA.isChecked() && !answerFourC.isChecked()) {
            correctAnswers = correctAnswers + .5;
        }

        // Half correct by only checking answer D
        else if (!answerFourB.isChecked() && answerFourD.isChecked() && !answerFourA.isChecked() && !answerFourC.isChecked()) {
            correctAnswers = correctAnswers + .5;
        }

        // Is question five correct?
        if (answerFive.isChecked()) {
            correctAnswers++;
        }

        // Is question six correct?
        if (answerSix.isChecked()) {
            correctAnswers++;
        }

        // Is question seven correct?
        if (answerSeven.isChecked()) {
            correctAnswers++;
        }

        // Is question eight correct?
        if (answerEight.isChecked()) {
            correctAnswers++;
        }

        // Is question nine correct?
        String answerNineString = answerNine.getText().toString().trim();
        if (answerNineString.equals("i")) {
            correctAnswers++;
        }
        // Is question ten correct?
        if (answerTen.isChecked()) {
            correctAnswers++;
        }

        //Calculate score
        double score = correctAnswers * 10.0;

        //Display score as a Toast

        if (score == 100.0) {
            Toast toast = Toast.makeText(getApplicationContext(), "You scored a perfect score!", Toast.LENGTH_LONG);
            toast.show();
        } else {
            Toast toast = Toast.makeText(getApplicationContext(), "You scored " + score, Toast.LENGTH_LONG);
            toast.show();
        }

        //Reset variable so that multiple presses of submit does not count correct answers multiple times.
        correctAnswers = 0;
    }


}
