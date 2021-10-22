package com.bridgleLabz.Census;

import java.io.IOException;

public class mainClass {
    public static void main(String[] args)  {
StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
        try {
            System.out.println(stateCensusAnalyser.loadData());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
