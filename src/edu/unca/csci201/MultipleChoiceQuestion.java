package edu.unca.csci201;

public class MultipleChoiceQuestion implements Question {

	private String question;
	private int correctAnswer;
	
	public MultipleChoiceQuestion(String question, int correct) {
		
		this.question = question;
		this.correctAnswer = correct;
	}
	
	@Override
	public String getTheQuestionText() {
		
		return this.question;
	}

	@Override
	public boolean isCorrectAnswer(String answer) {
		
		int check = Integer.parseInt(answer);
		if (check == this.correctAnswer) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String getCorrectAnswer() {
		
		String str = Integer.toString(correctAnswer);
		return str;
	}

}
