package com.doit.do4_implicitintentexam;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dialPhone(View view) {
        EditText editText = findViewById(R.id.phone_number_edit);
        dialPhoneNumber(editText.getText().toString());
    }

    private void dialPhoneNumber(String phoneNumber) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phoneNumber));

        if(intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }
    }
}
