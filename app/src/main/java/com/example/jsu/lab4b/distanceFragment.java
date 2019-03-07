package com.example.jsu.lab4b;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 */
public class distanceFragment extends Fragment {

    public distanceFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_distance, container, false);
    }

    public void convertDistanceClicked(View v) {
        String m = ((EditText) getActivity().findViewById(R.id.inputM)).getText().toString();
        String k = ((EditText) getActivity().findViewById(R.id.inputK)).getText().toString();
        if (  m.isEmpty() ) {
            if (  !k.isEmpty() ) {
                double kilometer = Double.parseDouble(k);
                double miles = (kilometer * 0.62137);
                ((EditText) getActivity().findViewById(R.id.inputM)).setText( Double.toString(miles) );
            }
        }
        else if (k.isEmpty()){
            double miles = Double.parseDouble(m);
            double kilometer = (miles / 0.62137);
            ((EditText) getActivity().findViewById(R.id.inputK)).setText( Double.toString(kilometer) );
        }
        else if( k.isEmpty() && m.isEmpty()) {

        }
        else {
            double miles = Double.parseDouble(m);
            double kilometer = (miles / 0.62137);
            ((EditText) getActivity().findViewById(R.id.inputK)).setText( Double.toString(kilometer) );
        }
    }

}
