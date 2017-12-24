package com.luxoft.extwo.database.webapp.statisticbeans;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class FileStatistic implements Serializable{

    private static final long serialVersionUID = -2L;

    private int idFile;
    private int longestFileWord;
    private int shortestFileWord;
    private int avgFileWord;
    private int avgFileLineLength;
    private Set<LineStatistic> lineStatistics = new HashSet<LineStatistic>(0);

    public FileStatistic() {
    }

    public FileStatistic(int idFile, int longestFileWord, int shortestFileWord, int avgFileWord, int avgFileLineLength) {
        this.idFile = idFile;
        this.longestFileWord = longestFileWord;
        this.shortestFileWord = shortestFileWord;
        this.avgFileWord = avgFileWord;
        this.avgFileLineLength = avgFileLineLength;
    }

    public int getIdFile() {
        return idFile;
    }
    public int getLongestFileWord() {
        return longestFileWord;
    }
    public int getShortestFileWord() {
        return shortestFileWord;
    }
    public int getAvgFileWord() {
        return avgFileWord;
    }
    public int getAvgFileLineLength() {
        return avgFileLineLength;
    }
    public Set<LineStatistic> getLineStatistics() {
        return lineStatistics;
    }
    
    public void setIdFile(int idFile) {
        this.idFile = idFile;
    }
    public void setLongestFileWord(int longestFileWord) {
        this.longestFileWord = longestFileWord;
    }
    public void setShortestFileWord(int shortestFileWord) {
        this.shortestFileWord = shortestFileWord;
    }
    public void setAvgFileWord(int avgFileWord) {
        this.avgFileWord = avgFileWord;
    }
    public void setAvgFileLineLength(int avgFileLineLength) {
        this.avgFileLineLength = avgFileLineLength;
    }
    public void setLineStatistics(Set<LineStatistic> lineStatistics) {
        this.lineStatistics = lineStatistics;
    }
}
