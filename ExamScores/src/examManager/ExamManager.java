package examManager;

import java.util.ArrayList;
import java.util.List;
//import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class ExamManager {
	
	// The simplest approach is using a java predefined interface from java.util.function
	
	// Another approach could be using a developer defined interface
//	public interface CalculationFunctionInterface {
//		public Double execute(List<Double> scores);
//	}

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

	// Using a developer defined interface
//	public Double customCalculation(CalculationFunctionInterface calculator) {
//		return calculator.execute(myScores);
//	}
	
	// Using the generic java predefined interface from java.util.function 
//	public Double customCalculation(Function<List<Double>, Double> calculator) {
//		return calculator.apply(myScores);
//	}
	
	// Using a specific java predefined interface from java.util.function 
	public Double customCalculation(ToDoubleFunction<List<Double>> calculator) {
		return calculator.applyAsDouble(myScores);
	}
}
