package com.example.anmolgulwani.myapplication;

import android.Manifest;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

public class testWifi extends AppCompatActivity {
    WifiManager wm;
    WifiInfo wifiInfo;
    List<ScanResult> l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_wifi);
        wm = (WifiManager) getSystemService(Context.WIFI_SERVICE);



        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_WIFI_STATE)
                != PackageManager.PERMISSION_GRANTED){
            if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.ACCESS_WIFI_STATE)) {
            } else {
                ActivityCompat.requestPermissions(this, new String[]{
                        Manifest.permission.ACCESS_WIFI_STATE}, 1002);


            }
        }

        if (wm != null) {
            if (!wm.isWifiEnabled()) {
                wm.setWifiEnabled(true);

                    wm.startScan();
                }

            }
        else {
                Toast.makeText(testWifi.this, "old phone", Toast.LENGTH_SHORT).show();
                {wm.startScan();}

            }
            BroadcastReceiver br = new BroadcastReceiver() {
                @Override
                public void onReceive(Context context, Intent intent) {
                    String action = intent.getAction();
                    if (action.equals(WifiManager.SCAN_RESULTS_AVAILABLE_ACTION)) {
                        l = wm.getScanResults();
                    }
                    for (ScanResult s1 : l) {
                        Toast.makeText(testWifi.this, s1.BSSID + "||" + s1.SSID + "||" + s1.level, Toast.LENGTH_SHORT).show();
                    }
                }
            };
            IntentFilter ifr = new IntentFilter(WifiManager.SCAN_RESULTS_AVAILABLE_ACTION);
            registerReceiver(br, ifr);
        }

  /*  protected void onResume() {
        super.onResume();
    }
    protected void onStop(){
        super.onStop();
        unregisterReceiver(br,ifr);
    }*/

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);


        switch (requestCode){
            case 1002:
                if (grantResults.length>0&&grantResults[0]==PackageManager.PERMISSION_GRANTED){}
                else{}
                return;
        }
    }
}

