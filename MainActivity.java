package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
    int count = 0;
    String x;
    TextView textView;

    ArrayList<String> Oarray = new ArrayList<>();
    ArrayList<String> Xarray = new ArrayList<>();

    String array, arr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);

        textView = findViewById(R.id.textView);
    }

    public static String OorX(int count) {
        if (count > 100) {
            return "";
        } else if (count % 2 != 0) {
            return "O";
        } else {
            return "X";
        }
    }

    public static Boolean WorF(String array) {
        boolean a = false;

        if (array.contains("1")) {
            if (array.contains("2") && array.contains("3")) a = true;
            else if (array.contains("5") && array.contains("9")) a = true;
            else if (array.contains("4") && array.contains("7")) a = true;

        } else if (array.contains("2") && array.contains("5") && array.contains("8")) {
            a = true;

        } else if (array.contains("3")) {
            if (array.contains("5") && array.contains("7")) a = true;
            else if (array.contains("6") && array.contains("9")) a = true;

        } else if (array.contains("4") && array.contains("5") && array.contains("6")) {
            a = true;

        } else if (array.contains("7") && array.contains("8") && array.contains("9")) {
            a = true;
        }

        return a;
    }

    @Override
    public void onClick(View v) {
        array = "";
        arr = "";
        count += 1;

        switch (v.getId()) {
            case R.id.button1:
                button1.setText(OorX(count));
                button1.setEnabled(false);
                x = "1";
                break;
            case R.id.button2:
                button2.setText(OorX(count));
                button2.setEnabled(false);
                x = "2";
                break;
            case R.id.button3:
                button3.setText(OorX(count));
                button3.setEnabled(false);
                x = "3";
                break;
            case R.id.button4:
                button4.setText(OorX(count));
                button4.setEnabled(false);
                x = "4";
                break;
            case R.id.button5:
                button5.setText(OorX(count));
                button5.setEnabled(false);
                x = "5";
                break;
            case R.id.button6:
                button6.setText(OorX(count));
                button6.setEnabled(false);
                x = "6";
                break;
            case R.id.button7:
                button7.setText(OorX(count));
                button7.setEnabled(false);
                x = "7";
                break;
            case R.id.button8:
                button8.setText(OorX(count));
                button8.setEnabled(false);
                x = "8";
                break;
            case R.id.button9:
                button9.setText(OorX(count));
                button9.setEnabled(false);
                x = "9";
                break;
        }

        if (OorX(count).equals("O")) {
            Oarray.add(x);
        } else {
            Xarray.add(x);
        }

        for (String Oarray : Oarray) {
            array += Oarray;
        }
        for (String Xarray : Xarray) {
            arr += Xarray;
        }

        if (WorF(array)) {
            textView.setText("O贏了");
            count += 200;
        } else if (WorF(arr)) {
            textView.setText("X贏了");
            count += 200;
        }
    }

    public void re(View v) {
        count = 0;
        array = "";
        arr = "";
        Oarray.clear();
        Xarray.clear();

        button1.setText(""); button1.setEnabled(true);
        button2.setText(""); button2.setEnabled(true);
        button3.setText(""); button3.setEnabled(true);
        button4.setText(""); button4.setEnabled(true);
        button5.setText(""); button5.setEnabled(true);
        button6.setText(""); button6.setEnabled(true);
        button7.setText(""); button7.setEnabled(true);
        button8.setText(""); button8.setEnabled(true);
        button9.setText(""); button9.setEnabled(true);

        textView.setText("");
    }
}
