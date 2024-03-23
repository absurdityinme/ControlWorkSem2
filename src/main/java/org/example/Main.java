package org.example;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("C:/Users/anyak/Downloads/schedule.txt"));
        List<String> lines = new ArrayList<>();
        while (sc.hasNextLine()) {
            lines.add(sc.nextLine());
        }
        Map<String, List<TVProgramm>> maps = new HashMap<>();
        for (int i = 0; i < lines.size(); ++i) {
            if (lines.get(i).charAt(0) == '#') {
                String key = lines.get(i).substring(1);
                List<TVProgramm> programms = new ArrayList<>();
                while ((i != lines.size() - 1) && (lines.get(++i).charAt(0) != '#')) {
                    programms.add(new TVProgramm(key, new BroadcastsTime(lines.get(i)), lines.get(++i)));
                }
                maps.put(key, programms);
                --i;
            }
        }
        List<TVProgramm> allProgramms = new ArrayList<>();
        for (String s : maps.keySet()) {
            for (TVProgramm tv : maps.get(s)) {
                allProgramms.add(tv);
            }
        }
        for (TVProgramm s : allProgramms) {
            System.out.println(s.title);
        }
    }
}