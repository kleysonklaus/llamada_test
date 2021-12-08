package com.example.llamada_demo;

import android.content.BroadcastReceiver;
import android.content.Context;  // <- aumentado
import android.content.Intent;     // <- aumentado
import android.widget.Toast;

public class InterceptCall extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        try{
            Toast.makeText(context, "sonando", Toast.LENGTH_SHORT).show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
