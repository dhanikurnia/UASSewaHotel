package polinema.ac.id.uassewahotel.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import polinema.ac.id.uassewahotel.R;

import polinema.ac.id.uassewahotel.activities.MainActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button login = (Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplication().getApplicationContext(), "Berhasil Login",Toast.LENGTH_LONG).show();
                Intent in = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(in);
            }
        });

    }
}

