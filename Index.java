import java.lang.*;
import java.util.*;
import java.io.*;

public class Index {
  
  private class Entry {
    String word;
    int chapter = 62;
    int wordNum;
    String prevFive;
    String nextFive;

    private void setWord (String w){
      word = w;
    }
    private void setWordNum (int n){
      wordNum = n;
    }
    private void setPrev (String prev){
      prevFive = prev;
    }
    private void setNext (String next){
      nextFive = next;
    }
  }
  
  private List<String> wordList = new ArrayList<>();
  private List<Entry> wordTable = new ArrayList<>();
  private int wordCount;

  private void printList() {
    for (String word: wordList) {
      System.out.println(word);
    }
  }
  private void getWord(String word) {
    String replacedWord = word.replaceAll("[^a-zA-z0-9'\\s-]+", "");
    wordList.add(replacedWord);
    wordCount++;
  }

  private void buildWordTable() {
    for(int i = 0; i < wordList.size(); i++){
      Entry tableEntry = new Entry();
      tableEntry.setWord(wordList.get(i));
      tableEntry.setWordNum(i + 1);
      
    }
  }
  
 
}
