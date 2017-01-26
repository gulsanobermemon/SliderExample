package com.etiennelawlor.discreteslider.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.etiennelawlor.discreteslider.R;
import com.etiennelawlor.discreteslider.library.ui.DiscreteLabelSlider;

public class TestActivity extends AppCompatActivity {

    DiscreteLabelSlider citySlider, languageSlider;
    TextView txtStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        String[] cityArr = {"Karachi", "Hyderabad", "Rawalpindi", "Islamabad"};

        citySlider = (DiscreteLabelSlider) findViewById(R.id.discreteCity_slider);
        citySlider.setLabelsArray(cityArr);

        languageSlider = (DiscreteLabelSlider) findViewById(R.id.discreteLbl_slider);

        txtStatus = (TextView) findViewById(R.id.txtStatus);
    }

    public void getDataFun(View view)
    {
        String status = "";
        status += "Your city is " + citySlider.getSelectedLabel() + "\n";
        status += "Your language is " + languageSlider.getSelectedLabel() + "\n";
        status += "Is Rawalpindi selected? " + citySlider.isPositionSelected(2) + "\n";
        status += "Is your language is C++? " + languageSlider.isLabelSelected("C++");

        txtStatus.setText(status);
    }
}
