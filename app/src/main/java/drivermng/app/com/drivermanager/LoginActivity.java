package drivermng.app.com.drivermanager;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity {
    EditText _emailText,_passwordText;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_login);
        _emailText=findViewById(R.id.input_email);
        _passwordText=findViewById(R.id.input_password);

    }

    public void Signup(View view) {
        startActivity(new Intent(this,RegisterActivity.class));
        overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);

    }

    public void Login(View view) {
        startActivity(new Intent(this,HomeActivity.class));

    }
}
