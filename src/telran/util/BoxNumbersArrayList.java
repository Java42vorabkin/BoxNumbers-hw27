package telran.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class BoxNumbersArrayList extends BoxNumbersList{
	
	public BoxNumbersArrayList() {
		collection = new ArrayList<Integer>();
	}
	protected void updateCollectionByHashSet(HashSet<Integer> hashSet) {
		collection = new ArrayList<Integer>(hashSet);
	}
}
