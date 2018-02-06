package examManager;

import java.util.List;
//import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class Main {

	public static void main(String[] args) {
		
		// Using a developer defined interface
		
//		ExamManager.CalculationFunctionInterface average = myScores -> {
//			Double sum = 0d;
//			
//			for (Double nextScore : myScores) {
//				sum += nextScore;
//			}
//			return sum / myScores.size();
//		};		
//		ExamManager.CalculationFunctionInterface highestScore = myScores -> {
//			Double highest = 0d;
//			for (Double nextScore : myScores) {
//				highest = Math.max(highest, nextScore);
//			}
//			return highest;
//		};
		
		
		// Using the general java predefined interface from java.util.function		
//		Function<List<Double>, Double> average = myScores -> {
//			Double sum = 0d;
//			
//			for (Double nextScore : myScores) {
//				sum += nextScore;
//			}
//			return sum / myScores.size();
//		};	
//		Function<List<Double>, Double> highestScore = myScores -> {
//			Double highest = 0d;
//			for (Double nextScore : myScores) {
//				highest = Math.max(highest, nextScore);
//			}
//			return highest;
//		};
		
		// Using a specific java predefined interface from java.util.function
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
		
		// This is the most common way to use the lambda expressions;
		// it uses an inline expression instead of giving it a name.
		System.out.println("The first score is " + examManager.customCalculation(myScores -> myScores.get(0)));
	}

}
