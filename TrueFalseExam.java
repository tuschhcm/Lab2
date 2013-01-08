//***********************************************************************
// Project: Lab 2
//
// Author: Craig Tuschhoff
//
// Completion time: 2 hours total
//
// Honor Code: I pledge that this program represents my own program code.
// I received help from (no one) in designing and debugging my program.
//***********************************************************************

import java.io.*;
import java.util.Scanner;

public class TrueFalseExam {
   
   // instance variables
   private String[] questions = {"is the earth flat?", "Is a baby beautiful?",
      "Is water wet?"};
   private char[] correctAnswers = {'F', 'T', 'T'};
   
   // no args constructor
   public TrueFalseExam() {
      // do nothing yet
   }
   
   // overloaded constructor, read from file
   public TrueFalseExam(int numberOfQuestions, String fileName) throws IOException {
      
      // 1. Create the File and Scanner objects
      File file = new File(fileName);
      Scanner inputFile = new Scanner(file);
      
      // 2. Instantiate the two arrays to the correct size
      questions = new String[numberOfQuestions];
      correctAnswers = new char[numberOfQuestions];
      
      // 3. loop, reading the question and answer data, into the two arrays
      for(int i = 0; i < numberOfQuestions; i++) {
         questions[i] = inputFile.nextLine();
         correctAnswers[i] = inputFile.nextLine().charAt(0);
      }
      
      // 4. Close the Scanner object when your done using it
      inputFile.close();
   }
   
   // get answer method
   public char getAnswer(int index) {
      return correctAnswers[index];
   }
   
   // get question method
   public String getQuestion(int index) {
      return questions[index];
   }
   
   //get number of questions method
   public int getNumberOfQuestions() {
      return questions.length;
   }
}