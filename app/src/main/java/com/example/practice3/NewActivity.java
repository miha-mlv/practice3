package com.example.practice3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {
    private Student student;
    private TextView student_text, student_group, table_surname, table_name, table_age, table_group;
    private Button back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        student = (Student)getIntent().getSerializableExtra("Student");
        student_text = findViewById(R.id.student);
        student_group = findViewById(R.id.student_group);
        table_surname = findViewById(R.id.table_surname_text);
        table_name = findViewById(R.id.table_name);
        table_age = findViewById(R.id.table_age);
        table_group = findViewById(R.id.table_group);
        if(student != null) {
            student_text.setText(student.getSurname()+ " " + student.getName() + " " + student.getAge());
            student_group.setText(student.getGroup());
            table_surname.setText(student.getSurname());
            table_name.setText(student.getName());
            table_age.setText(student.getAge());
            table_group.setText(student.getGroup());

        }
        back_btn = findViewById(R.id.back_btn);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBack = new Intent(NewActivity.this, MainActivity.class);
                intentBack.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intentBack);
            }
        });
    }
}