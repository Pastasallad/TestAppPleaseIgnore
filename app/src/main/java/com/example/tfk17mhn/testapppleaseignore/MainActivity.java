package com.example.tfk17mhn.testapppleaseignore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    ToggleButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        button = (ToggleButton) findViewById(R.id.toggleButton);
    }

    public void toggle(View view) {
        if (button.isChecked())
            textView.setText("Tjeeena!");
        else
            textView.setText("Dåå drar vi hem till söööder.");
    }
}
