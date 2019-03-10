package com.example.jsu.tablayoutdemo;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.annotation.SuppressLint;
import android.widget.Button;
import android.widget.EditText;
import java.text.DecimalFormat;


/**
 * A simple {@link Fragment} subclass.
 */
public class tab2Fragment extends Fragment implements View.OnClickListener {

    EditText inputF;
    EditText inputC;
    DecimalFormat decimal;
    Button tempButton;


    public tab2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View v = inflater.inflate(R.layout.fragment_tab2, container, false);


        tempButton = v.findViewById(R.id.calTemp);
        tempButton.setOnClickListener(this);
        inputF = v.findViewById(R.id.editFahrenheit);
        inputC = v.findViewById(R.id.editCelsius);
        decimal = new DecimalFormat("#.##");

        return v;
    }

    @SuppressLint("SetTextI18n")
    public void onClick(View v) {

        String f = inputF.getText().toString();
        String c = inputC.getText().toString();

        // Is Fahrenheit field empty?  If so, convert from Celsius

        if (f.isEmpty()) {

            // Check Celsius field first; if it is not empty, convert to Fahrenheit

            if (!c.isEmpty()) {

                double celsius = Double.parseDouble(c);
                double fahrenheit = ((celsius * 9 / 5) + 32);

                inputF.setText(decimal.format(fahrenheit));

            }

        } else {

            double fahrenheit = Double.parseDouble(f);
            double celsius = ((fahrenheit - 32) * 5 / 9);

            inputC.setText(decimal.format(celsius));

        }
    }

}
