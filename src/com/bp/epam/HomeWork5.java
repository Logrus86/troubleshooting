package com.bp.epam;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 19.02.2017.
 */

public class HomeWork5 {

    private static final String FILE_NAME = "resource/Task #5 - Data.txt";

    public static void main(String[] args) throws IOException, InterruptedException {
        withMemoryLeak();
        //withoutMemoryLeak();
    }

    private static void withMemoryLeak() throws IOException, InterruptedException {
        List<String> threeSymbolsList = new ArrayList<String>();
        FileReader fr = new FileReader(FILE_NAME);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            threeSymbolsList.add(line.substring(0, 3));
            Thread.sleep(1);
        }
        fr.close();
        br.close();
        System.out.println(threeSymbolsList.toString());
    }

    private static void withoutMemoryLeak() throws IOException {
        List<String> threeSymbolsList = new ArrayList<String>();
        FileReader fr = new FileReader(FILE_NAME);
        BufferedReader br = new BufferedReader(fr);
        for (String line; (line = br.readLine()) != null; ) {
            threeSymbolsList.add(new String(line.substring(0, 3)));
        }
        fr.close();
        br.close();
        System.out.println(threeSymbolsList.toString());
    }
}
