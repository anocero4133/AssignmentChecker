package com.example.loginpage_finalassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import javax.microedition.khronos.egl.EGLDisplay;

public class StudentRegisterPage extends AppCompatActivity {

    EditText studentUsername;
    EditText firstNStudent;
    EditText lastNStudent;
    EditText studentPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_register_page);

        studentUsername = (EditText) findViewById(R.id.editText6);
        firstNStudent = (EditText) findViewById(R.id.editText5);
        lastNStudent = (EditText) findViewById(R.id.editText2);
        studentPassword = (EditText) findViewById(R.id.editText);
    }//end of on create

    public void onRegister(View v)
    {

        String username = studentUsername.getText().toString();
        String firstName = firstNStudent.getText().toString();
        String lastName = lastNStudent.getText().toString();
        String password = studentPassword.getText().toString();
        String method = "register";

        RegisterBackground registerBackground = new RegisterBackground(this);
        registerBackground.execute(method, firstName, lastName, password, username);
        //finish();

    }//end of onRegister
}
