package com.example;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("input.txt");
            FileOutputStream out = new FileOutputStream("output.txt");
            byte[] buffer = new byte[in.available()];
            in.read(buffer, 0, buffer.length);
            String s = new String (buffer, "UTF-8");
            String[] a = s.split(" ");
            int a1 = Integer.parseInt(a[0]);
            int a2 = Integer.parseInt(a[1]);
            String b = String.format("%s",a1 / a2);
            buffer = b.getBytes();
            out.write(buffer, 0, buffer.length);
        } catch (Exception ex) {
            System.out.println("Error was found");
            System.out.println(ex.getMessage());
        }
    }
}