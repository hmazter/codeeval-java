package com.hmazter.codeeval.lowercase;

import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("File input required");
            System.exit(1);
        }

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            System.out.println(line.toLowerCase());
        }
    }
}