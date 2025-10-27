package oo1.ejercicio18;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EvenNumberSet implements Set<Integer> {
    private final Set<Integer> internalSet = new HashSet<>();

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return internalSet.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return internalSet.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return internalSet.contains(o);
	}

	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return internalSet.iterator();
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return internalSet.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return internalSet.toArray(a);
	}

	@Override
	public boolean add(Integer e) {
		if(e % 2 ==0) {
			internalSet.add(e);
			return true;
		}
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return internalSet.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return internalSet.containsAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends Integer> c) {
		// TODO Auto-generated method stub
		return internalSet.addAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return internalSet.retainAll(c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return internalSet.removeAll(c);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		internalSet.clear();
		
	}

}
