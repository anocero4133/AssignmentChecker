package com.example.loginpage_finalassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONObject;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText studentUsername;
    EditText studentPassword;
    TextView registerLink;
    TextView studentLoginMessage;
    static JSONObject jObj = null;
    static String json = "";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        studentUsername = (EditText) findViewById(R.id.UsernameField);
        studentPassword = (EditText) findViewById(R.id.PasswordField);

        TextView link = findViewById(R.id.textView5);
        link.setOnClickListener(myListener);
    } //end of onCreate


    public View.OnClickListener myListener = new View.OnClickListener()
    {
        public void onClick(View v)
        {
            Intent intent = new Intent(getApplicationContext(), StudentRegisterPage.class);
            startActivity(intent);

        }
    }; //end of OnClickListener

    public void onLogin(View v)
    {
        String username = studentUsername.getText().toString();
        String password = studentPassword.getText().toString();
        String type = "login";

        if(studentUsername.equals("") || studentPassword.equals(""))
        {
            Toast.makeText(MainActivity.this, "Left empty", Toast.LENGTH_LONG).show();
        }


        LoginBackground loginBackground = new LoginBackground(this);
        loginBackground.execute(type, username, password);


    }//end of onLogin

}

