package com.example.dnage.collegeloanpayoffcalculator;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.String.format;

public class MainActivity extends AppCompatActivity {

    double loan;
    double interest;
    int years;
    EditText loanTextView;
    EditText interestTextView;
    TextView result5;
    TextView result10;
    TextView result15;
    TextView result20;
    TextView result25;
    TextView result30;
    Button finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loanTextView = (EditText) findViewById(R.id.LoanInput);
        interestTextView = (EditText) findViewById(R.id.InterestInput);

        result5 = (TextView) findViewById(R.id.YearInput5);
        result10 = (TextView) findViewById(R.id.YearInput10);
        result15 = (TextView) findViewById(R.id.YearInput15);
        result20 = (TextView) findViewById(R.id.YearInput20);
        result25 = (TextView) findViewById(R.id.YearInput25);
        result30 = (TextView) findViewById(R.id.YearInput30);
        finish = (Button) findViewById(R.id.button);
        finish.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //When the button is clicked, call the calucate method.
                calculateLoan();
            }
        });
    }

    private void calculateLoan() {
        loan=Double.parseDouble(loanTextView.getText().toString());
        interest=Double.parseDouble(interestTextView.getText().toString());
        double answer = (loan+(loan*(interest/100)*5))/(12*5);
        result5.setText("$"+Double.toString(answer));
        answer = (loan+(loan*(interest/100)*10))/(12*10);
        result10.setText("$"+Double.toString(answer));
        answer = (loan+(loan*(interest/100)*15))/(12*15);
        result15.setText("$"+Double.toString(answer));
        answer = (loan+(loan*(interest/100)*20))/(12*20);
        result20.setText("$"+Double.toString(answer));
        answer = (loan+(loan*(interest/100)*25))/(12*25);
        result25.setText("$"+Double.toString(answer));
        answer = (loan+(loan*(interest/100)*30))/(12*30);
        result30.setText("$"+Double.toString(answer));
    }

}

