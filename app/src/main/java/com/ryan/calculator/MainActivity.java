package com.ryan.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

import org.dyndns.kwitte.jfunction.*;

public class MainActivity extends AppCompatActivity
{

    String equation = "";

    Button button0, button1, button2, button3, button4, button5, button6, button7,
            button8, button9, buttonAddition, buttonSubtraction, buttonMultiplication, buttonDivision,
            buttonBack, buttonDecimal, buttonClear, buttonNegate, buttonEqual;

    EditText textEditor;

    boolean equalPressedLast = false;
    boolean negative = true;

    @Override

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonAddition = (Button) findViewById(R.id.buttonAddition);
        buttonSubtraction = (Button) findViewById(R.id.buttonSubtraction);
        buttonMultiplication = (Button) findViewById(R.id.buttonMultiplication);
        buttonDivision = (Button) findViewById(R.id.buttonDivision);
        buttonClear = (Button) findViewById(R.id.buttonClear);
        buttonDecimal = (Button) findViewById(R.id.buttonDecimal);
        buttonNegate = (Button) findViewById(R.id.buttonNegate);
        buttonEqual = (Button) findViewById(R.id.buttonEqual);
        buttonBack = (Button) findViewById(R.id.buttonBack);

        textEditor = (EditText) findViewById(R.id.editText1);



        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetCalculator();
                equalPressedLast = false;
                negative = true;
                textEditor.setText(textEditor.getText()+"0");
                equation += "0";
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetCalculator();
                equalPressedLast = false;
                negative = true;
                textEditor.setText(textEditor.getText()+"1");
                equation += "1";
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetCalculator();
                equalPressedLast = false;
                negative = true;
                textEditor.setText(textEditor.getText()+"2");
                equation += "2";
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetCalculator();
                equalPressedLast = false;
                negative = true;
                textEditor.setText(textEditor.getText()+"3");
                equation += "3";
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetCalculator();
                equalPressedLast = false;
                negative = true;
                textEditor.setText(textEditor.getText()+"4");
                equation += "4";
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetCalculator();
                equalPressedLast = false;
                negative = true;
                textEditor.setText(textEditor.getText()+"5");
                equation += "5";
            }
        });


        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetCalculator();
                equalPressedLast = false;
                negative = true;
                textEditor.setText(textEditor.getText()+"6");
                equation += "6";
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetCalculator();
                equalPressedLast = false;
                negative = true;
                textEditor.setText(textEditor.getText()+"7");
                equation += "7";
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetCalculator();
                equalPressedLast = false;
                negative = true;
                textEditor.setText(textEditor.getText()+"8");
                equation += "8";
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetCalculator();
                equalPressedLast = false;
                textEditor.setText(textEditor.getText()+"9");
                equation += "9";
            }
        });

        buttonAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetCalculator();
                equalPressedLast = false;
                negative = true;
                textEditor.setText(textEditor.getText()+" + ");
                equation += " + ";

            }
        });

        buttonSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetCalculator();
                equalPressedLast = false;
                negative = true;
                textEditor.setText(textEditor.getText()+" - ");
                equation += " - ";
            }
        });

        buttonMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetCalculator();
                equalPressedLast = false;
                negative = true;
                textEditor.setText(textEditor.getText()+" * ");
                equation += " * ";
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetCalculator();
                equalPressedLast = false;
                negative = true;
                textEditor.setText(textEditor.getText()+" / ");
                equation += " / ";
            }
        });

        buttonDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetCalculator();
                equalPressedLast = false;
                negative = true;
                textEditor.setText(textEditor.getText()+".");
                equation += ".";
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetCalculator();
                equalPressedLast = false;
                negative = true;
                textEditor.setText("");
                equation = "";
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double answer = null;
                try {
                    answer = Terms.evaluate(equation);
                } catch (FunctionFormatException e) {
                    e.printStackTrace();
                }
                textEditor.setText(Double.toString(answer));
                    equation = "";
                    equalPressedLast = true;
                    negative = true;
                }
        });


        buttonNegate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetCalculator();
                equalPressedLast = false;
                if(!negative) {
                    equation = removeLastChar(equation);
                    textEditor.setText(equation);
                    negative = true;
                }
                else {
                    textEditor.setText(textEditor.getText() + "-");
                    negative = false;
                    equation += "-";
                }


            }
        });

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetCalculator();
                equalPressedLast = false;
                equation = removeLastChar(equation);
                textEditor.setText(equation);

            }
        });
    }

    public void resetCalculator()
    {
        if(equalPressedLast == true) {
            textEditor.setText("");
            negative = true;
            equation = "";
        }
    }

    public static String removeLastChar(String s) {
        return (s == null || s.length() == 0) ? null : (s.substring(0, s.length() - 1));
    }
}
