package com.example.a1107516259.tcp_s8;

import android.util.Log;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Cliente extends Thread{
    @Override
    public void run() {

        //Del emulador a servidor externo
        try {
            Socket s =new Socket("10.0.2.2",5000);
            OutputStream os= s.getOutputStream();
            PrintWriter out=new PrintWriter(new OutputStreamWriter(os));
            out.println("Hoda ya funciona :)");
            out.flush();

            Log.e("DEBUG","Conexion exitosa");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
