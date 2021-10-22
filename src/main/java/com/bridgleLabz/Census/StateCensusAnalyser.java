package com.bridgleLabz.Census;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

public class StateCensusAnalyser {
    private String censusPath = "IndiaStateCode.csv";
public int loadData() throws IOException {
    int count = 0;
    Reader reader = Files.newBufferedReader(Paths.get(censusPath));
    CsvToBean<CensusModel> csvToBean = new CsvToBeanBuilder(reader).withIgnoreLeadingWhiteSpace(true).withType(CensusModel.class).build();
    Iterator<CensusModel> stateIterator = csvToBean.iterator();
    while (stateIterator.hasNext()) {
        CensusModel csvStates = stateIterator.next();
        count++;
    }
    return count;
}
}