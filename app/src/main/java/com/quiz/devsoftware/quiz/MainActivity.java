package com.quiz.devsoftware.quiz;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*Answers of Questions
    * 1. B
    * 2. A
    * 3. B
    * 4. B
    * 5. Mundak Upanishad
    * 6. A, B.
    * */

    private RadioGroup firstQuestion, secondQuestion, thirdQuestion, fourthQuestion;
    private EditText fifthQuestionAnswer;
    private CheckBox sixthQuestionCheckBox1, sixthQuestionCheckBox2, sixthQuestionCheckBox3, sixthQuestionCheckBox4;
    private RadioButton firstQuestionRadioButton, secondQuestionRadioButton, thirdQuestionRadioButton, fourthQuestionRadioButton ;
    private int totalScore = 0;
    int scoreFirstAnswer = 0;
    int scoreSecondAnswer = 0;
    int scoreThirdAnswer = 0;
    int scoreFourthAnswer = 0;
    int scorefifthAnswer = 0;
    int scoreSixthAnswer = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        declaringViews();
        questionOneAns();
        questionTwoAns();
        questionThreeAns();
        questionFourthAns();


    }

    private void declaringViews() {
        firstQuestion = (RadioGroup) findViewById(R.id.firstQuestionRadioGroup);
        secondQuestion = (RadioGroup) findViewById(R.id.secondQuestionRadioGroup);
        thirdQuestion = (RadioGroup) findViewById(R.id.thirdQuestionRadioGroup);
        fourthQuestion = (RadioGroup) findViewById(R.id.fourthQuestionRadioGroup);
        fifthQuestionAnswer = (EditText) findViewById(R.id.fifthQuestionAnswer);
        sixthQuestionCheckBox1 = (CheckBox) findViewById(R.id.bhagatSingh);
        sixthQuestionCheckBox2 = (CheckBox) findViewById(R.id.ramPrasadBismil);
        sixthQuestionCheckBox3 = (CheckBox) findViewById(R.id.mahatmaGandhi);
        sixthQuestionCheckBox4 = (CheckBox) findViewById(R.id.jawaharlalNehru);
        fifthQuestionAnswer = (EditText) findViewById(R.id.fifthQuestionAnswer);
    }
    private void questionOneAns() {
        final String ANSWER1 = "2:3";
        scoreFirstAnswer = 0;
        firstQuestion.setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                        firstQuestionRadioButton =(RadioButton) findViewById(checkedId);
                        String firstQuestionAnswer = firstQuestionRadioButton.getText().toString();
                        if(firstQuestionAnswer.equals(ANSWER1)) {
                            scoreFirstAnswer = 1;
                        }
                    }
                }
        );
    }
    private void questionTwoAns() {
        scoreSecondAnswer = 0;
        final String ANSWER2 = "Only the first stanza";
        secondQuestion.setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                        secondQuestionRadioButton =(RadioButton) findViewById(checkedId);
                        String secondQuestionAnswer = secondQuestionRadioButton.getText().toString();

                        if(secondQuestionAnswer.equals(ANSWER2))
                        {
                                scoreSecondAnswer = 1;
                        }
                    }
                }
        );

    }
    private void questionThreeAns() {
        scoreThirdAnswer = 0;
        final String ANSWER3 = "Abhinav Gupt";
        thirdQuestion.setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                        thirdQuestionRadioButton =(RadioButton) findViewById(checkedId);
                        String thirdQuestionAnswer = thirdQuestionRadioButton.getText().toString();

                        if(thirdQuestionAnswer.equals(ANSWER3)) {
                            scoreThirdAnswer = 1;
                        }
                    }
                }
        );
    }
    private void questionFourthAns() {
        scoreFourthAnswer = 0;
        final String ANSWER4 = "Gujarat";
        fourthQuestion.setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                        fourthQuestionRadioButton =(RadioButton) findViewById(checkedId);
                        String fourthQuestionAnswer = fourthQuestionRadioButton.getText().toString();

                        if(fourthQuestionAnswer.equals(ANSWER4)) {
                            scoreFourthAnswer = 1;
                        }
                    }
                }
        );
    }
    private void questionFiveAns() {
        scorefifthAnswer = 0;
        String answer5 = "mundak upanishad";
        if(fifthQuestionAnswer.getText().toString().equals(answer5))
        {
            scorefifthAnswer = 1;
        }
    }
    private void questionSixthAns(){
        scoreSixthAnswer = 0;
        if(sixthQuestionCheckBox1.isChecked() && sixthQuestionCheckBox2.isChecked())
        {
            scoreSixthAnswer = 1;
        }
    }
    private void totalScore(){

       totalScore = scoreFirstAnswer + scoreSecondAnswer + scoreThirdAnswer + scoreFourthAnswer + scorefifthAnswer + scoreSixthAnswer;

    }


    public void quizScore(View view) {
        questionFiveAns();
        questionSixthAns();
        totalScore();
        Toast.makeText(MainActivity.this, getString(R.string.result) + " " + totalScore, Toast.LENGTH_LONG).show();
    }

}
