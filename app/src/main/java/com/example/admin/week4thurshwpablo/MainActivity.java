package com.example.admin.week4thurshwpablo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void authClicks(View view) {

        switch (view.getId()) {
            case R.id.btnGoogleAuth:
                Intent intent = new Intent(this, GoogleActivity.class);
                startActivity(intent);

                break;

                case R.id.btnFacebookAuth:
                    Intent intentF = new Intent(this,FacebookActivity.class);
                    startActivity(intentF);
                    break;
/*
                case R.id.btnTwitterAuth:

                    break;

            }
            */
        }
    }
}
