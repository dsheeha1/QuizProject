package edu.unca.csci201;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
	
	private double correct;
	private double finalScore;
	private boolean[] score = new boolean[25];
	private ArrayList<Question> QuestionList = new ArrayList<Question>();
	private String[] AnswerList = new String[25];
	
	public void addQuestion(Question q) {	
		if (QuestionList.size() < 25) {
			QuestionList.add(q);
		}
	}
	
	public double giveQuiz() {
		

		for (int i = 0; i < 25; i++) {
			
			Scanner scan = new Scanner(System.in);
			
			//assigns question to arraylist element 
			Question q = QuestionList.get(i);
			
			//prints the question text
			System.out.println(q.getTheQuestionText());
			
			//records the user's answer and assigns score result to score[] element
			String answer = scan.nextLine();
			score[i] = q.isCorrectAnswer(answer);
			AnswerList[i] = answer;
			
		}
		for (int b = 0; b < 25; b++) {
			boolean check = score[b];
			if (check == true) {
				this.correct++;
			}
			if (check == false) {
				System.out.println("Question #"+(b+1)+" correction:");
				System.out.println(QuestionList.get(b).getTheQuestionText());
				System.out.println("Your answer was: "+AnswerList[b]);
				System.out.println("The correct answer is: "+QuestionList.get(b).getCorrectAnswer());
				System.out.println("\r\n");
			}
		}
		
		
		
		this.finalScore = (this.correct/25)*100;
		return this.finalScore;
	}
	
	
}
