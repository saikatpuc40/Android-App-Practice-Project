package com.example.taskmanager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class addTask extends AppCompatActivity {

    EditText inputFirstName, inputSecondName, startTime, endTime, description;
    Button saveButton, btnDesign, btnMeeting, btnCoding, btnTesting, btnQuickCall, btnOther;
    DatabaseHelper dbHelper;
    String selectedCategory = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_task);

        inputFirstName = findViewById(R.id.inputFirstName);
        inputSecondName = findViewById(R.id.inputSecondName);
        startTime = findViewById(R.id.startTime);
        endTime = findViewById(R.id.endTime);
        description = findViewById(R.id.description);
        saveButton = findViewById(R.id.saveButton);
        btnDesign = findViewById(R.id.btnDesign);
        btnMeeting = findViewById(R.id.btnMeeting);
        btnCoding = findViewById(R.id.btnCoding);
        btnTesting = findViewById(R.id.btnTesting);
        btnQuickCall = findViewById(R.id.btnQuickCall);
        btnOther = findViewById(R.id.btnOther);
        btnDesign.setOnClickListener(v -> selectedCategory = "Design");
        btnMeeting.setOnClickListener(v -> selectedCategory = "Meeting");
        btnCoding.setOnClickListener(v -> selectedCategory = "Coding");
        btnTesting.setOnClickListener(v -> selectedCategory = "Testing");
        btnQuickCall.setOnClickListener(v -> selectedCategory = "Quick Call");
        btnOther.setOnClickListener(v -> selectedCategory = "Other");

        dbHelper = new DatabaseHelper(addTask.this);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.addData(inputFirstName.getText().toString(), inputSecondName.getText().toString(), startTime.getText().toString(), endTime.getText().toString(), description.getText().toString(), selectedCategory);
                Toast.makeText(addTask.this, "Data Added", Toast.LENGTH_SHORT).show();
                inputFirstName.setText("");
                inputSecondName.setText("");
                startTime.setText("");
                endTime.setText("");
                description.setText("");
            }
        });


    }
}