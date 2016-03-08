package com.hmazter.codeeval.sumofinteger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("File input required");
            System.exit(1);
        }

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        int sum = 0;
        while ((line = buffer.readLine()) != null) {
            sum += Integer.parseInt(line.trim());
        }
        System.out.println(sum);
    }
}
