package edu.unca.csci201;

public class ShortAnswerQuestion implements Question {

	private String question;
	private String correctAnswer;
	
	public ShortAnswerQuestion(String question, String correct) {
		
		this.question = question;
		this.correctAnswer = correct;
	}
	
	@Override
	public String getTheQuestionText() {

		return this.question;
	}

	@Override
	public boolean isCorrectAnswer(String answer) {

		if (this.correctAnswer.equals(answer)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String getCorrectAnswer() {

		return correctAnswer;
	}

}
