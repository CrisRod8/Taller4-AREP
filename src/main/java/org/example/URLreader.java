package org.example;
import java.io.*;
import java.net.*;
public class URLreader {
    public static void main (String[] args) {
        try {
            URL myURL = new URL ("https://www.omdbapi.com/");
            System.out.println("Protocol: " + myURL.getProtocol());
            System.out.println("Host " + myURL.getHost());
            System.out.println("Port: " + myURL.getPort());
            System.out.println("Path: " + myURL.getPath());
            System.out.println("Query: " + myURL.getQuery());
            System.out.println("File: " + myURL.getFile());
            System.out.println("Ref: " + myURL.getRef());
            System.out.println("Authority: " + myURL.getAuthority());

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

}