package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {

        String parola = null;

        ServerSocket ss = new ServerSocket(3000);
        Socket s = ss.accept();

        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);

        do{

            parola = in.readLine();
            if(parola == "exit"){
                break;
            }
            out.println(parola.toUpperCase());
            ss.close();

        }while(true);
    }
}