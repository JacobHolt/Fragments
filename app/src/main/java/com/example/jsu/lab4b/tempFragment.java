package com.example.jsu.lab4b;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 */
public class tempFragment extends Fragment implements View.OnClickListener {


    public tempFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_temp, container, false);

        Button b = (Button)v.findViewById(R.id.temperatureConverter); // Acquire button reference
        b.setOnClickListener(this);                     // Set event handler

        return v;

    }

    public void onClick(View v) {
        String f = ((EditText) getActivity().findViewById(R.id.inputF)).getText().toString();
        String c = ((EditText) getActivity().findViewById(R.id.inputC)).getText().toString();
        if (  f.isEmpty() ) {
            if (  !c.isEmpty() ) {
                double celsius = Double.parseDouble(c);
                double fahrenheit = ((celsius * 9 / 5) + 32);
                ((EditText) getActivity().findViewById(R.id.inputF)).setText( Double.toString(fahrenheit) );
            }
        }
        else if( c.isEmpty()){
            double fahrenheit = Double.parseDouble(f);
            double celsius = ((fahrenheit - 32) * 5 / 9);
            ((EditText) getActivity().findViewById(R.id.inputC)).setText( Double.toString(celsius) );
        }
        else if( c.isEmpty() && f.isEmpty()) {

        }
        else {
            double fahrenheit = Double.parseDouble(f);
            double celsius = ((fahrenheit - 32) * 5 / 9);
            ((EditText) getActivity().findViewById(R.id.inputC)).setText( Double.toString(celsius) );
        }
    }

}
