package com.example.whatsappclone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.widget.Adapter;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    String persons[]={"Anoop","Hitman","Kolhi","Ishan","Shubman","Dhoni","Hardik","Sky","Bhumbra","Rahul","Chahal","Shami"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);
        //adding adapter
        Person ad = new Person(this,R.layout.chats_layout,persons);
        listView.setAdapter(ad);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Opening "+persons[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void openActivity_status(View v){
        Toast.makeText(this, "Status", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,Status.class);
        startActivity(intent);
    }

    public void openActivity_calls(View v){
        Toast.makeText(this, "Calls", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,Class.class);
        startActivity(intent);
    }
    public void openActivity_chats(View v){
        Toast.makeText(this, "Calls", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}