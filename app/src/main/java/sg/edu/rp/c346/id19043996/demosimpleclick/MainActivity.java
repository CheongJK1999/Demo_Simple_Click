package sg.edu.rp.c346.id19043996.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    //Step 1: Declare the variables
    TextView tvDisplay;
    EditText etInput;
    Button btnDisplay;
    ToggleButton tbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Step 2: Bind the UI element to these Java components
        tvDisplay = findViewById(R.id.textViewDisplay);
        etInput = findViewById(R.id.editTextInput);
        btnDisplay = findViewById(R.id.buttonDisplay);
        tbtn = findViewById(R.id.toggleButtonEnabled);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Handle button click event here
                String value = etInput.getText().toString();
                tvDisplay.setText(value);
            }
        });

        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(tbtn.isChecked()) {
                    if(tbtn.isChecked()) {
                        etInput.setEnabled(true);
                    } else{
                        etInput.setEnabled(false);
                    }
                }
            }
        });
    }
}
