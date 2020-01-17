package com.advancedjava;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Google extends Thread {

    List<String> siteContent = new ArrayList<>();

    @Override
    public void run() {
     try {
         URL hotnews = new URL("https://www.hotnews.ro");
         URLConnection con = hotnews.openConnection();
         InputStream inputStream = con.getInputStream();

         Scanner scannerHonews = new Scanner(inputStream);
         System.out.println(scannerHonews.nextLine());

         while (scannerHonews.hasNext()) {
             siteContent.add(scannerHonews.nextLine());

         }
     }catch (Exception e) {
         System.out.println("Eroare in scanarea site-ului");
     }
    }
}
