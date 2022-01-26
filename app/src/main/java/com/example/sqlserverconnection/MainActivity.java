package com.example.sqlserverconnection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import java.sql.Connection;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConnectionClass connectionClass = new ConnectionClass();
        Connection connection = connectionClass.connection();
        Toast.makeText(this, "Connection:"+connection, Toast.LENGTH_SHORT).show();
    }
}