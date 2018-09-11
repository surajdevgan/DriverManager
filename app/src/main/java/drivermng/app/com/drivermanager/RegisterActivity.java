package drivermng.app.com.drivermanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
    EditText Name, Phone, Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_register);
        Password = findViewById(R.id.input_password);
        Phone = findViewById(R.id.input_mobile);
        Name = findViewById(R.id.input_name);
    }

    public void AlreadyMember(View view) {

        startActivity(new Intent(this,LoginActivity.class));
        overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
    }

    public void Register(View view) {

    }
}
