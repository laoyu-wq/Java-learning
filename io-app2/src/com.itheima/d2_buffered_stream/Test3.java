package com.itheima.d2_buffered_stream;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new FileReader("io-app2\\src\\com.itheima\\csb.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("io-app2\\src\\com.itheima\\newcsb.txt"));
                ){
            List<String> data = new ArrayList<>();

            String line;
            while ((line = br.readLine()) != null){
                data.add(line);
            }

            Collections.sort(data);
            System.out.println(data);

            for (String ln : data) {
                bw.write(ln);
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
