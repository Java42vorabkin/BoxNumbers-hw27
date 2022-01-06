package telran.util;

import java.util.HashSet;
import java.util.LinkedList;

public class BoxNumbersLinkedList extends BoxNumbersList {
	
	public BoxNumbersLinkedList() {
		collection = new LinkedList<Integer>();
	}
	protected void updateCollectionByHashSet(HashSet<Integer> hashSet) {
		collection = new LinkedList<Integer>(hashSet);
	}

}
