package telran.util;

import java.util.TreeSet;

public class BoxNumbersTreeSet extends BoxNumbersSet{

	public BoxNumbersTreeSet() {
		collection = new TreeSet<Integer>();
	}
	
	@Override
	public int removeInRange(int minInclusive, int maxExclusive) {
		TreeSet<Integer> subset = 
				(TreeSet<Integer>) ((TreeSet<Integer>)collection).subSet(minInclusive, maxExclusive);
		int countRemovedNumbers = subset.size();
		subset.clear();
		return countRemovedNumbers;
	}

}
