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

import java.util.Scanner;
import java.io.*;

public class ExamDemo {
   public static void main(String[] args) throws IOException {
      
      //create scanner object for user input
      Scanner keyboard = new Scanner(System.in);
      char userAnswer;  //stores user input
      
      //create true/false exam
      TrueFalseExam test = new TrueFalseExam(4, "Questions.txt");
      
      //loop for all the questions
      for(int index = 0; index < test.getNumberOfQuestions(); index++) {
         
         //ask the question
         System.out.println(test.getQuestion(index));
         
         //get a T or F answer form the user
         do {
            userAnswer = keyboard.nextLine().charAt(0);
            if(userAnswer != 'T' && userAnswer != 'F') {
               System.out.println("Invalid answer. Please enter T or F");
            }
         }while(userAnswer != 'T' && userAnswer != 'F');
         
         //check the correctness of the answer
         if(userAnswer == test.getAnswer(index)) {
            System.out.println("Correct");
         } else {
            System.out.println("Incorrect");
         }
      }//end for
   }//end main
}//end class