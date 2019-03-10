package com.example.jsu.tablayoutdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import java.text.DecimalFormat;


/**
 * A simple {@link Fragment} subclass.
 */
public class tab3Fragment extends Fragment implements View.OnClickListener {

    EditText inputM;
    EditText inputK;
    DecimalFormat decimal;
    Button distButton;


    public tab3Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View v = inflater.inflate(R.layout.fragment_tab3, container, false);

        inputM = v.findViewById(R.id.editMiles);
        inputK = v.findViewById(R.id.editKilometers);
        distButton = v.findViewById(R.id.calDistance);
        distButton.setOnClickListener(this);
        decimal = new DecimalFormat("#.##");

        return v;
    }
    public void onClick(View v){

        String miles = inputM.getText().toString();
        String kilometers = inputK.getText().toString();

        // Is miles field empty?  If so, convert from kilometers

        if (miles.isEmpty()) {

            // Check kilometers field first; if it is not empty, convert to miles

            if (!kilometers.isEmpty()) {

                double kilo = Double.parseDouble(kilometers);
                double mil = (kilo * 0.621370);

                inputM.setText(decimal.format(mil));

            }

        } else {

            double miles2 = Double.parseDouble(miles);
            double kilometers2 = (miles2 * 1.609344);

            inputK.setText(decimal.format(kilometers2));
        }

    }

}
