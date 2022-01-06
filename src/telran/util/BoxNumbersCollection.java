package telran.util;

import java.util.Collection;
import java.util.Iterator;

import java.util.function.Predicate;

public abstract class BoxNumbersCollection implements BoxNumbers {

	protected Collection<Integer> collection;

	@Override
	public boolean addNumber(int number) {
		return collection.add(number);
	}

	@Override
	public boolean removeNumber(int number) {
		return collection.remove(number);
	}

	@Override
	public int removeByPredicate(Predicate<Integer> predicate) {
		int sizeBeforeRemove = collection.size();
		collection.removeIf(predicate);
		return sizeBeforeRemove-collection.size();
	}
	
	@Override
	public int removeInRange(int minInclusive, int maxExclusive) {
		return removeByPredicate(num -> num>=minInclusive && num < maxExclusive);
		/*
		int sizeBeforeRemove = collection.size();
		collection.removeIf(num -> (num >= minInclusive && num < maxExclusive));
		return sizeBeforeRemove - collection.size();
		*/
	}

	@Override
	public boolean containsNumber(int number) {		
		return collection.contains(number);
	}
	
	@Override
	public Iterator<Integer> iterator() {
		return  collection.iterator();
	}

}
