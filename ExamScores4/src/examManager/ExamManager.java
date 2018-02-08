package examManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;

public class ExamManager {
	
	private List<Double> myScores;

	public ExamManager() {
		myScores = new ArrayList<Double>();
		myScores.add(78.3);
		myScores.add(69.2);
		myScores.add(44.7);
		myScores.add(61.6);
		myScores.add(80.2);
		myScores.add(66.9);
		myScores.add(54.1);
	}

	public Double customCalculation(ToDoubleFunction<List<Double>> calculator) {
		return calculator.applyAsDouble(myScores);
	}
	
	public void printScores() {
		
		// Sort the list using another class to be a comparator for the Collections sort method - Java7 style
		System.out.println("Descending sort: Java7 style");
		Collections.sort(myScores, new DescendingComparator());
		myScores.forEach(s -> System.out.println(s));
		System.out.println();
		
		// Sort the list using a lambda expression - Java8 style
		// the DescendingComparator.java class is not needed when using this approach
		
		// Because the Comparator interface is a functional interface we can create a lambda function using a Comparator
		Comparator<Double> descendingComparator = (arg0, arg1) -> {
			int result = 0;
			if (arg0 < arg1) {
				result = 1;
			}
			else if (arg0 > arg1) {
				result = -1;
			}
			return result;
		};
		
		// we can now sort the list using the new created comparator descendingComparator
		// this approach does no use another class and therefore it does not instantiate other objects
		System.out.println("Descending sort: Java8 lambda function style");
		Collections.sort(myScores, descendingComparator);
		myScores.forEach(s -> System.out.println(s));
		System.out.println();
		
		// or instead of creating the descendingComparator variable that contains a lambda function we could
		// place an in-line lambda function directly as the second parameter of the sort method
		System.out.println("Descending sort: Java8 style with in-line lambda function");
		Collections.sort(myScores, (arg0, arg1) -> {
			int result = 0;
			if (arg0 < arg1) {
				result = 1;
			}
			else if (arg0 > arg1) {
				result = -1;
			}
			return result;
		});
		myScores.forEach(s -> System.out.println(s));
		System.out.println();
		
	}
	
	public void printSelectedScores (Predicate<Double> testCriteria) {
		myScores.forEach(s -> {
			if (testCriteria.test(s)) {
				System.out.println(s);
			}
		});
	}
	
}
