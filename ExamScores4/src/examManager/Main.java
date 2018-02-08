package examManager;

import java.util.List;
import java.util.function.ToDoubleFunction;

public class Main {

	public static void main(String[] args) {
		
		ToDoubleFunction<List<Double>> average = myScores -> {
			Double sum = 0d;
			
			for (Double nextScore : myScores) {
				sum += nextScore;
			}
			return sum / myScores.size();
		};
		
		ToDoubleFunction<List<Double>> highestScore = myScores -> {
			Double highest = 0d;
			for (Double nextScore : myScores) {
				highest = Math.max(highest, nextScore);
			}
			return highest;
		};
		
		ExamManager examManager = new ExamManager();
		System.out.println ("The average score is " + examManager.customCalculation(average));
		System.out.println ("The highest score is " + examManager.customCalculation(highestScore));
		
		System.out.println("the first score is " + examManager.customCalculation(myScores -> myScores.get(0)));
		
		examManager.printScores();
		System.out.println("---");
		examManager.printSelectedScores(s -> s >= 50);
		
		// Using stream to sum all scores
		System.out.println();
		System.out.println("The total of all scores is: " + examManager.getTotalOfAllScores());
		
		//using the second version of the printSelectedScores
		System.out.println("\nUsing the new printSelectedScoresVersion2");
		examManager.printSelectedScoresVersion2(s -> s >= 50);
	}

}
