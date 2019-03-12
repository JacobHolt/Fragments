package com.example.jsu.lab4b;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class tipFragment extends Fragment implements View.OnClickListener{


    public tipFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_tip, container, false);

        Button b = (Button)v.findViewById(R.id.button); // Acquire button reference
        b.setOnClickListener(this);                     // Set event handler

        return v;

    }

    public void onClick(View v) {

        TextView totalAmountPerPerson = (TextView) getActivity().findViewById(R.id.totalAmountPerPerson);

        TextView billAmountinput = (TextView) getActivity().findViewById(R.id.billAmount);
        String billAmount = billAmountinput.getText().toString();
        double billAmountNumber = Double.parseDouble(billAmount);

        TextView percentageInput = (TextView) getActivity().findViewById(R.id.tipPercentage);
        String percentageString = percentageInput.getText().toString();
        double percentageInt = Double.parseDouble(percentageString);

        TextView numOfPeopleInput = (TextView) getActivity().findViewById(R.id.numOfPeople);
        String numOfPeopleString = numOfPeopleInput.getText().toString();
        double numOfPeopleInt = Double.parseDouble(numOfPeopleString);

        double percent = percentageInt / 100;
        percent = (percent * billAmountNumber) / numOfPeopleInt;

        double perPerson = billAmountNumber / numOfPeopleInt;
        perPerson += percent;
        perPerson = Math.floor(perPerson*100) / 100d;

        totalAmountPerPerson.setText("Total amount per person: $" + perPerson);
    }
}
