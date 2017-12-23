package com.luxoft.extwo.database.webapp.statisticbeans;

import java.util.HashSet;
import java.util.Set;

public class FileStatistic {

    private int idFile;
    private int longestFileWord;
    private int shortestFileWord;
    private int avgFileWord;
    private int avgFileLineLength;
//    private Set<LineStatistic> lineStatistics = new HashSet<>(0);

    public FileStatistic() {
    }

    public FileStatistic(int idFile, int longestFileWord, int shortestFileWord, int avgFileWord, int avgFileLineLength) {
        this.idFile = idFile;
        this.longestFileWord = longestFileWord;
        this.shortestFileWord = shortestFileWord;
        this.avgFileWord = avgFileWord;
        this.avgFileLineLength = avgFileLineLength;
    }

    @Override
    public String toString() {
        return "id:" + idFile + ", longestFileWord:" + longestFileWord + ", shortestFileWord:" + shortestFileWord + ", avgFileWord:" +avgFileWord + ", avgFileLineLength:" + avgFileLineLength;
    }

    public int getIdFile() {
        return idFile;
    }
    public int getMaxFileWord() {
        return longestFileWord;
    }
    public int getMinFileWord() {
        return shortestFileWord;
    }
    public int getAvgFileWord() {
        return avgFileWord;
    }
    public int getAvgFileLineLength() {
        return avgFileLineLength;
    }
//    public Set<LineStatistic> getLineStatistics() {
//        return lineStatistics;
//    }

    public void setIdFile(int idFile) {
        this.idFile = idFile;
    }
    public void setMaxFileWord(int maxFileWord) {
        this.longestFileWord = maxFileWord;
    }
    public void setMinFileWord(int minFileWord) {
        this.shortestFileWord = minFileWord;
    }
    public void setAvgFileWord(int avgFileWord) {
        this.avgFileWord = avgFileWord;
    }
    public void setAvgFileLineLength(int avgFileLineLength) {
        this.avgFileLineLength = avgFileLineLength;
    }
//    public void setLineStatistics(Set<LineStatistic> lineStatistics) {
//        this.lineStatistics = lineStatistics;
//    }
}
