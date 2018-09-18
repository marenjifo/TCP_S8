package com.example.a1107516259.tcp_s8;

import android.util.Log;

import java.io.IOException;
import java.net.Socket;

public class Cliente extends Thread{
    @Override
    public void run() {

        //Del emulador a servidor externo
        try {
            Socket s =new Socket("10.0.2.2",5000);
            Log.e("DEBUG","Conexion exitosa");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
