package com.advancedjava;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu termenul de cautare:");
        String searchTerm = scanner.nextLine();

        URL hotnews = new URL("https://www.hotnews.ro");
         URLConnection con = hotnews.openConnection();
         InputStream inputStream= con.getInputStream();

         Scanner scannerHonews = new Scanner(inputStream);
        System.out.println(scannerHonews.nextLine());

        while (scannerHonews.hasNext()) {

            if(scannerHonews.nextLine().contains(searchTerm)){
                System.out.println("Termenul a fost gasit!");
            }


        }

    }
}
