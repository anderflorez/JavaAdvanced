package examManager;

import java.util.Comparator;

public class DescendingComparator implements Comparator<Double> {

	@Override
	public int compare(Double arg0, Double arg1) {
		int result = 0;
		if (arg0 < arg1) {
			result = 1;
		}
		else if (arg0 > arg1) {
			result = -1;
		}
		return result;
	}

}
