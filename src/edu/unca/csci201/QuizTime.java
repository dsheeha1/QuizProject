package edu.unca.csci201;

public class QuizTime {

	public static void main(String[] args) {

		Quiz quiz = new Quiz();
		
		Question a = new  MultipleChoiceQuestion("Answer is 1.\r\n1: one\r\n2: two\r\n3: three\r\n4: four", 1);
		Question b = new  MultipleChoiceQuestion("Answer is 1.\r\n1: one\r\n2: two\r\n3: three\r\n4: four", 1);
		Question c = new  MultipleChoiceQuestion("Answer is 1.\r\n1: one\r\n2: two\r\n3: three\r\n4: four", 1);
		Question d = new  MultipleChoiceQuestion("Answer is 1.\r\n1: one\r\n2: two\r\n3: three\r\n4: four", 1);
		Question e = new  MultipleChoiceQuestion("Answer is 1.\r\n1: one\r\n2: two\r\n3: three\r\n4: four", 1);
		Question f = new  MultipleChoiceQuestion("Answer is 1.\r\n1: one\r\n2: two\r\n3: three\r\n4: four", 1);
		Question g = new  MultipleChoiceQuestion("Answer is 1.\r\n1: one\r\n2: two\r\n3: three\r\n4: four", 1);
		Question h = new  MultipleChoiceQuestion("Answer is 1.\r\n1: one\r\n2: two\r\n3: three\r\n4: four", 1);
		Question i = new  MultipleChoiceQuestion("Answer is 1.\r\n1: one\r\n2: two\r\n3: three\r\n4: four", 1);
		Question j = new  MultipleChoiceQuestion("Answer is 1.\r\n1: one\r\n2: two\r\n3: three\r\n4: four", 1);
		
		Question k = new TrueFalseQuestion("Answer is true", "true");
		Question l = new TrueFalseQuestion("Answer is true", "true");
		Question m = new TrueFalseQuestion("Answer is true", "true");
		Question n = new TrueFalseQuestion("Answer is true", "true");
		Question o = new TrueFalseQuestion("Answer is true", "true");
		Question p = new TrueFalseQuestion("Answer is true", "true");
		Question q = new TrueFalseQuestion("Answer is true", "true");
		Question r = new TrueFalseQuestion("Answer is true", "true");
		Question s = new TrueFalseQuestion("Answer is true", "true");
		Question t = new TrueFalseQuestion("Answer is true", "true");
		
		Question u = new FillTheBlank("Answer is ___. \r\none, one, one, one", "one");
		Question v = new FillTheBlank("Answer is ___. \r\none, one, one, one", "one");
		Question w = new FillTheBlank("Answer is ___. \r\none, one, one, one", "one");
		Question x = new FillTheBlank("Answer is ___. \r\none, one, one, one", "one");
		Question y = new FillTheBlank("Answer is ___. \r\none, one, one, one", "one");

		quiz.addQuestion(a);
		quiz.addQuestion(b);
		quiz.addQuestion(c);
		quiz.addQuestion(d);
		quiz.addQuestion(e);
		quiz.addQuestion(f);
		quiz.addQuestion(g);
		quiz.addQuestion(h);
		quiz.addQuestion(i);
		quiz.addQuestion(j);
		quiz.addQuestion(k);
		quiz.addQuestion(l);
		quiz.addQuestion(m);
		quiz.addQuestion(n);
		quiz.addQuestion(o);
		quiz.addQuestion(p);
		quiz.addQuestion(q);
		quiz.addQuestion(r);
		quiz.addQuestion(s);
		quiz.addQuestion(t);
		quiz.addQuestion(u);
		quiz.addQuestion(v);
		quiz.addQuestion(w);
		quiz.addQuestion(x);
		quiz.addQuestion(y);
		
		System.out.println("Your score is "+quiz.giveQuiz());
	}

}
