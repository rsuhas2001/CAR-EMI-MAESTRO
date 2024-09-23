package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText onroad, down, interest, tenure, loan;
    TextView emiresult;
    Button carloan, emires;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onroad = (EditText) findViewById(R.id.carprice);
        down = (EditText) findViewById(R.id.downpaymentInput);
        interest = (EditText) findViewById(R.id.interestRateInput);
        tenure = (EditText) findViewById(R.id.yearsInput);
        loan = (EditText) findViewById(R.id.loanamount);
        carloan = (Button) findViewById(R.id.loanbutton);
        emires = (Button) findViewById(R.id.emibutton);
        emiresult = (TextView) findViewById(R.id.emi);
        setTitle("CAR EMI CALCULATOR");
        Spinner mySpinner1 = (Spinner) findViewById(R.id.spinner1);
        Spinner mySpinner2 = (Spinner) findViewById(R.id.spinner2);
        List<String> brands = new ArrayList<>();
        brands.add("Maruthi-Suzuki");
        brands.add("Hyundai");
        brands.add("Tata-Motors");
        brands.add("Mahindra");
        brands.add("Kia");
        ArrayAdapter<String> myAdapter1 = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, brands);
        mySpinner1.setAdapter(myAdapter1);
        mySpinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                if (position == 0) {
                    List<String> models = new ArrayList<>();
                    models.add("Alto");
                    models.add("Swift");
                    models.add("Brezza");
                    models.add("Ertiga");
                    models.add("Ciaz");
                    ArrayAdapter<String> myAdapter2 = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, models);
                    mySpinner2.setAdapter(myAdapter2);
                } else if (position == 1) {
                    List<String> models1 = new ArrayList<>();
                    models1.add("i10");
                    models1.add("i20");
                    models1.add("Venue");
                    models1.add("Creta");
                    models1.add("Verna");
                    ArrayAdapter<String> myAdapter2 = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, models1);
                    mySpinner2.setAdapter(myAdapter2);
                } else if (position == 2) {
                    List<String> models3 = new ArrayList<>();
                    models3.add("Tiago");
                    models3.add("Altroz");
                    models3.add("Nexon");
                    models3.add("Harrier");
                    models3.add("Safari");
                    ArrayAdapter<String> myAdapter2 = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, models3);
                    mySpinner2.setAdapter(myAdapter2);
                } else if (position == 3) {
                    List<String> models4 = new ArrayList<>();
                    models4.add("Bolero");
                    models4.add("XUV3OO");
                    models4.add("XUV7OO");
                    models4.add("Scorpio-N");
                    models4.add("Thar");
                    ArrayAdapter<String> myAdapter2 = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, models4);
                    mySpinner2.setAdapter(myAdapter2);
                } else if (position == 4) {
                    List<String> models5 = new ArrayList<>();
                    models5.add("Sonet");
                    models5.add("Seltos");
                    models5.add("Carens");
                    models5.add("Carnival");
                    ArrayAdapter<String> myAdapter2 = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, models5);
                    mySpinner2.setAdapter(myAdapter2);
                } else {
                    List<String> nullList = new ArrayList<>();
                    ArrayAdapter<String> myAdapter2 = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, nullList);
                    mySpinner2.setAdapter(myAdapter2);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        mySpinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = mySpinner2.getSelectedItem().toString();
                if (str.equals("Alto")) onroad.setText("Rs.536000");
                else if (str.equals("Swift")) onroad.setText("Rs.1080000");
                else if (str.equals("Brezza")) onroad.setText("Rs.1750000");
                else if (str.equals("Ertiga")) onroad.setText("Rs.1600000");
                else if (str.equals("Ciaz")) onroad.setText("Rs.1480000");
                else if (str.equals("i10")) onroad.setText("Rs.1000000");
                else if (str.equals("i20")) onroad.setText("Rs.1495000");
                else if (str.equals("Venue")) onroad.setText("Rs.1575000");
                else if (str.equals("Creta")) onroad.setText("Rs.2250000");
                else if (str.equals("Verna")) onroad.setText("Rs.1925000");
                else if (str.equals("Tiago")) onroad.setText("Rs.950000");
                else if (str.equals("Altroz")) onroad.setText("Rs.1250000");
                else if (str.equals("Nexon")) onroad.setText("Rs.1750000");
                else if (str.equals("Harrier")) onroad.setText("Rs.2780000");
                else if (str.equals("Safari")) onroad.setText("Rs.2950000");
                else if (str.equals("Bolero")) onroad.setText("Rs.1288000");
                else if (str.equals("XUV3OO")) onroad.setText("Rs.1761000");
                else if (str.equals("XUV7OO")) onroad.setText("Rs.3105000");
                else if (str.equals("Scorpio-N")) onroad.setText("Rs.2458000");
                else if (str.equals("Thar")) onroad.setText("Rs.2020000");
                else if (str.equals("Sonet")) onroad.setText("Rs.1707000");
                else if (str.equals("Seltos")) onroad.setText("Rs.2284000");
                else if (str.equals("Carens")) onroad.setText("Rs.2188000");
                else if (str.equals("Carnival")) onroad.setText("Rs.4377000");
                else onroad.setText(" ");
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        carloan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String checkroad = onroad.getText().toString().substring(3);
                String checkdown = down.getText().toString();
                if (checkroad.matches("")) {
                    Toast.makeText(MainActivity.this, "Please enter a valid onroad price of car", Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    if (checkdown.matches("")) {
                        Toast.makeText(MainActivity.this, "Please enter a valid downpayment price of car", Toast.LENGTH_SHORT).show();
                    } else {
                        double carprice = Double.parseDouble(onroad.getText().toString().substring(3));
                        double downpayment = Double.parseDouble(down.getText().toString());
                        String loanamt = String.valueOf(carprice - downpayment);
                        loan.setText(loanamt);
                    }
                }
            }
        });
        emires.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String finalloan = loan.getText().toString();
                String interestrate = interest.getText().toString();
                String loanperiod = tenure.getText().toString();
                if (finalloan.matches("") || interestrate.matches("") || loanperiod.matches("")) {
                    Snackbar.make(findViewById(R.id.root), "All the fields are requires",Snackbar.LENGTH_SHORT).show();
                } else {
                    double principal = Double.parseDouble(loan.getText().toString());
                    double irate = Double.parseDouble(interest.getText().toString());
                    double time = Double.parseDouble(tenure.getText().toString());
                    double rate = irate / 1200;
                    String finalemi = String.valueOf((principal * rate * Math.pow(1 + rate, time)) / (Math.pow(1 + rate, time) - 1));
                    String emifinal = finalemi.substring(0, 8);
                    emiresult.setText(emifinal);
                }
            }
        });
    }
}