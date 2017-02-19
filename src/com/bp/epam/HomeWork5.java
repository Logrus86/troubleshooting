package com.bp.epam;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 19.02.2017.
 */

public class HomeWork5 {

    public static void main(String[] args) throws IOException {
        initialWay();
    }

    private static void initialWay() throws IOException {
        List<String> threeSymbolsList = new ArrayList<String>();
        FileReader fr = new FileReader("resource/Task #5 - Data.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            threeSymbolsList.add(line.substring(0, 2));
        }
        fr.close();
        br.close();
        System.out.printf(threeSymbolsList.toString());
    }

    private static void fixedWay() throws IOException {

    }
}
