package com.example.bluetooth;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnon,btnoff;
    BluetoothAdapter bluetoothAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnon=findViewById(R.id.btnblutoothon);
        btnoff=findViewById(R.id.btnbluetoothoff);

        bluetoothAdapter=BluetoothAdapter.getDefaultAdapter();
    }

    public void enableBluetooth(View view) {



        startActivityForResult(new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE),0);


    }



    public void disableBluetooth(View view) {
        bluetoothAdapter.disable();


    }
}
