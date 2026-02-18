import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<T> implements List<T> {
	private T[] array;
	private int size;

	@SuppressWarnings("unchecked") // suppress the warning
	public MyArrayList() {
		array = (T[]) new Object[4];
		size = 0;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		if (size == 0)
			return true;
		return false;
	}

	@Override
	public boolean contains(Object o) {
		return false;
	}

	@Override
	public Iterator<T> iterator() {
		return null;
	}

	@Override
	public Object[] toArray() {
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return null;
	}

	@Override
	public boolean add(T e) {
		if (size >= array.length) {
			@SuppressWarnings("unchecked")
			T[] bigger = (T[]) new Object[array.length * 2];
			for (int i = 0; i < array.length; i++) {
				bigger[i] = array[i];
			}
			array = bigger;
		}
		array[size++] = e;
		// size++;
		return true;
	}

	@Override
	public boolean remove(Object o) {
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends T> c) {
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		boolean flag = true;
		for(Object obj : c) {
			flag &= remove(obj);
		}
		return flag;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return false;
	}

	@Override
	public void clear() {
		size = 0;
	}

	@Override
	public T get(int index) {
		if(index < 0 || index > size) {
			throw new IndexOutOfBoundsException(); // exit out of this method
		}
		return array[index];
	}

	@Override
	public T set(int index, T element) {
		T old = get(index);
		array[index] = element;
		return old;
	}

	@Override
	public void add(int index, T element) {
		if(index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
		// add the element to the resizing of the array
		add(element);
		// shift the elements
		for(int i = size-1; i > index; i--) {
			array[i] = array [i-1];
		}
		// put the new element in the right place
		array[index] = element;
	}

	@Override
	public T remove(int index) {
		T old = get(index);
		for(int i = index; i < size; i++) {
			array[i] = array[i+1];
		}
		size--;
		return old;
	}

	@Override
	public int indexOf(Object o) {
		for(int i = 0; i < size; i++) {
			if(equals(array[i], o)) {
				return i;
			}
		}
		return -1;
	}

	private boolean equals(T t, Object o) {
		if (t == null || o == null ) {
			return false;
		}
		return t.equals(o);	
	}

	@Override
	public int lastIndexOf(Object o) {
		for(int i = size-1; i >= 0; i--) {
			if(equals(array[i], o)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public ListIterator<T> listIterator() {

		return null;
	}

	@Override
	public ListIterator<T> listIterator(int index) {

		return null;
	}

	@Override
	public List<T> subList(int fromIndex, int toIndex) {

		return null;
	}

}
