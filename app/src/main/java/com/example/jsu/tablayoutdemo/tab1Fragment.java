package com.example.jsu.tablayoutdemo;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.*;
import java.text.DecimalFormat;
import java.lang.Math;


/**
 * A simple {@link Fragment} subclass.
 */
public class tab1Fragment extends Fragment implements View.OnClickListener {

    EditText textTotal;
    EditText tipTotal;
    EditText peopleTotal;
    TextView totalPer;
    DecimalFormat decimal;
    Button tipButton;


    public tab1Fragment() {
        // Required empty public constructor
    }


    @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View v = inflater.inflate(R.layout.fragment_tab1, container, false);

        textTotal = v.findViewById(R.id.totalText);
        tipTotal = v.findViewById(R.id.tipText);
        peopleTotal = v.findViewById(R.id.peopleText);
        totalPer = v.findViewById(R.id.totalPerPerson);
        tipButton = v.findViewById(R.id.Calculate2);
        tipButton.setOnClickListener(this);
        decimal = new DecimalFormat("#.##");

        return v;
    }


    @SuppressLint("SetTextI18n")
    public void onClick(View v){

        String totalString = textTotal.getText().toString();
        String tipString = tipTotal.getText().toString();
        String peopleString = peopleTotal.getText().toString();
        double total = Double.parseDouble(totalString);
        double tip = Double.parseDouble(tipString);
        double people = Double.parseDouble(peopleString);

        double grandTotal = (Math.ceil(total + (total * tip)) / people);


        totalPer.setText(decimal.format(grandTotal));



    }


}
