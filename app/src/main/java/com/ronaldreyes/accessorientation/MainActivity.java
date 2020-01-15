package com.ronaldreyes.accessorientation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText textField;
    private TextView answerLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textField = findViewById(R.id.text_field);
        Button submitButton = findViewById(R.id.submit_button);
        submitButton.setOnClickListener(this);
        answerLabel = findViewById(R.id.answer_label);

    }

    @Override
    public void onClick(View v){
        String textFieldText= textField.getText().toString();

        if (textFieldText.equalsIgnoreCase("42")){
            answerLabel.setText(R.string.answer_label_text_correct);
        } else{
            answerLabel.setText(R.string.answer_label_text_incorrect);
        }
    }
}
