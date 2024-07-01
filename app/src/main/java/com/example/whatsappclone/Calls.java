package com.example.whatsappclone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Calls extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calls);
    }
    public void openActivity_status(View v){
        Toast.makeText(this, "Status", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,Status.class);
        startActivity(intent);
    }

    public void openActivity_chats(View v){
        Toast.makeText(this, "Calls", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void openActivity_calls(View v){
        Toast.makeText(this, "Calls", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,Calls.class);
        startActivity(intent);
    }
}