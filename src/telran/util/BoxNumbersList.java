package telran.util;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public abstract class BoxNumbersList extends BoxNumbersCollection {

	@Override
	public int removeRepeated() {
		HashSet<Integer> hashSet = new HashSet<>(collection);
		int countRemovedNumbers = collection.size() - hashSet.size();
//		updateCollection(hashSet);
		updateCollectionByHashSet(hashSet);
		return countRemovedNumbers;
	}
	
	private void updateCollection(HashSet<Integer> hashSet) {
		collection.clear();
		Iterator<Integer> itr = hashSet.iterator();
		while(itr.hasNext()) {
			collection.add(itr.next());
		}
	}
	protected abstract void updateCollectionByHashSet(HashSet<Integer> hashSet);
}
