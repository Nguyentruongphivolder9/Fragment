package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnSendData;
    EditText edtInput;
    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSendData = findViewById(R.id.button_send_data);
        edtInput = findViewById(R.id.eidittext_main);
        fragmentManager = getSupportFragmentManager();

        btnSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                AndroidFragment androidFragment = new AndroidFragment();
                fragmentTransaction.add(R.id.linear_container, androidFragment, "android_fragment");
                fragmentTransaction.addToBackStack("fragment_android");
                fragmentTransaction.commit();
            }
        });
    }
}
