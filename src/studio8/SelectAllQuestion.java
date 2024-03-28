package studio8;

public class SelectAllQuestion extends MultipleChoiceQuestion {

	private String[] options;
	
	public SelectAllQuestion(String prompt, String answer, String[] choices) {
		super (prompt, answer, 1, choices);
		this.options=choices;
		//Hint: 1 point per choice
		//FIXME
	}
	
	public int checkAnswer(String givenAnswer) {
		int totalPoints = 0;
		String answer = new String();
		answer.toCharArray();
		for (int i=0; i< options.length; i++) {
			if(this.options[i]<
	}
	
	public static void main(String[] args) {
		String[] choices = {"instance variables", "git", "methods", "eclipse"};
		Question selectAll = new SelectAllQuestion("Select all of the following that can be found within a class:", "13", choices);
		selectAll.displayPrompt();
		System.out.println(selectAll.checkAnswer("hi")); //no credit
		System.out.println(selectAll.checkAnswer("13")); //full credit
		System.out.println(selectAll.checkAnswer("31")); //full credit
		System.out.println(selectAll.checkAnswer("1")); //3 points
		System.out.println(selectAll.checkAnswer("3")); //3 points
		System.out.println(selectAll.checkAnswer("23")); //2 points
		System.out.println(selectAll.checkAnswer("34")); //2 points
		System.out.println(selectAll.checkAnswer("4")); //1 point
		System.out.println(selectAll.checkAnswer("124")); //1 point
		System.out.println(selectAll.checkAnswer("24")); //0 points
		
	}
}
