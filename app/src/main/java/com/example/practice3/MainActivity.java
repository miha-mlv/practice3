package com.example.practice3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.example.practice3.Student;

public class MainActivity extends AppCompatActivity {
    private Student student = new Student();
    private EditText edit_surname, edit_name, edit_group, edit_age;
    private Button admission_main_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        admission_main_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                student.setSurname(edit_surname.getText().toString());
                student.setName(edit_name.getText().toString());
                student.setGroup(edit_group.getText().toString());
                student.setAge(edit_age.getText().toString());
                Intent intentMain = new Intent(MainActivity.this, NewActivity.class);
                intentMain.putExtra("Student", student);
                startActivity(intentMain);
            }
        });

    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("TAG", "onStop");
    }
    @Override
    protected void onPause() {
        Log.i("TAG", "onPause");
        super.onPause();
    }
    @Override
    protected void onStart() {
        Log.i("TAG", "onStart");
        super.onStart();
    }
    @Override
    protected void onResume() {
        Log.i("TAG", "onResume");
        super.onResume();
    }
    @Override
    protected void onDestroy() {
        Log.i("TAG", "onDestroy");
        super.onDestroy();
    }
    @Override
    protected void onRestart() {
        Log.i("TAG", "onRestart");
        super.onRestart();
    }
    private void init()
    {
        edit_surname = findViewById(R.id.edit_surname);
        edit_name = findViewById(R.id.edit_name);
        edit_group = findViewById(R.id.edit_group);
        edit_age = findViewById(R.id.edit_age);
        admission_main_btn = findViewById(R.id.admission);

    }
}