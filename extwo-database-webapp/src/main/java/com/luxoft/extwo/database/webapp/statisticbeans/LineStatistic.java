package com.luxoft.extwo.database.webapp.statisticbeans;

import java.io.Serializable;

public class LineStatistic implements Serializable{

    private static final long serialVersionUID = -1L;

    private int idLine;
    private int idFile;
    private int longestWord;
    private int shortestWord;
    private int avgWord;
    private int lineLength;
    private FileStatistic fileStatistic;

    public LineStatistic() {
    }

    public LineStatistic(int idLine, int idFile, int maxWord, int minWord, int avgWord, int lineLength) {
        this.idLine = idLine;
        this.idFile = idFile;
        this.longestWord = maxWord;
        this.shortestWord = minWord;
        this.avgWord = avgWord;
        this.lineLength = lineLength;
    }

    public int getIdLine() {
        return idLine;
    }
    public int getIdFile() {
        return idFile;
    }
    public int getLongestWord() {
        return longestWord;
    }
    public int getShortestWord() {
        return shortestWord;
    }
    public int getAvgWord() {
        return avgWord;
    }
    public int getLineLength() {
        return lineLength;
    }
    public FileStatistic getFileStatistic() {
        return fileStatistic;
    }

    public void setIdLine(int idLine) {
        this.idLine = idLine;
    }
    public void setIdFile(int idFile) {
        this.idFile = idFile;
    }
    public void setLongestWord(int longestWord) {
        this.longestWord = longestWord;
    }
    public void setShortestWord(int shortestWord) {
        this.shortestWord = shortestWord;
    }
    public void setAvgWord(int avgWord) {
        this.avgWord = avgWord;
    }
    public void setLineLength(int lineLength) {
        this.lineLength = lineLength;
    }
    public void setFileStatistic(FileStatistic fileStatistic) {
        this.fileStatistic = fileStatistic;
    }
}