package com.example.miwokapp;

public class Row_Data {

    String MiwokWord, EnglishWord;
    int Audio;

    public Row_Data(String miwokWord, String englishWord, int audio) {
        MiwokWord = miwokWord;
        EnglishWord = englishWord;
        Audio = audio;
    }

    public String getMiwokWord() {
        return MiwokWord;
    }

    public String getEnglishWord() {
        return EnglishWord;
    }

    public int getAudio() {
        return Audio;
    }
}
