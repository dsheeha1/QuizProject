package edu.unca.csci201;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
	
	private double correct;
	private double finalScore;
	private boolean[] score = new boolean[25];
	private ArrayList<Question> QuestionList = new ArrayList<Question>();
	
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
			score[i] = q.isCorrectAnswer(scan.nextLine());
		}
		for (int b = 0; b < 25; b++) {
			boolean check = score[b];
			if (check == true) {
				this.correct++;
			}
		}
		this.finalScore = (this.correct/25)*100;
		return this.finalScore;
	}
	
	
}
