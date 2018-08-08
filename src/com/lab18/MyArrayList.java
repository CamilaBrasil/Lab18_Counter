package com.lab18;

import java.util.Arrays;

public class MyArrayList implements MyList {

	String[] array = new String[4];

	int length = 0;

	@Override
	public void addAtBeginning(String data) {
		if (isFull()) {
			doubleLength();
		}

		//Loop backwards and shift all the items over to make room for the new one
		for (int i = length; i > 0; i--) {
			array[i] = array[i - 1];
		}
		
		// Set first element and increment length
		array[0] = data;
		length++;
	}

	@Override
	public void removeFromBeginning() {
		for (int i = 0; i < length; i++ ) {
			array[i] = array[i + 1];
		}
			length--;
	}

	@Override
	public void addAtEnd(String data) {
		if (isFull()) {
			// If our array is out of space, it will double the size
			doubleLength();
		}

		// Set the next item in the array and increment the length
		array[length] = data;
		length++;
	}

	@Override
	public void removeFromEnd() {
		// Clear the last slot and decrement the length
		array[length - 1] = null;
		length--;
	}

	@Override
	public String get(int index) {
		// TODO Auto-generated method stub
		return array[index];
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return length;
	}

	private boolean isFull() {
		return length == array.length;
	}

	private void doubleLength() {

		// Make a new copy of the array that is twice as long
		array = Arrays.copyOf(array, array.length * 2);

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < length; i++) {
			sb.append(array[i]);
			if (i != length - 1) {
				sb.append(",");
			}
		}

		sb.append("]");

		return sb.toString();
	}

	@Override
	public boolean removeAt(int index) {
		boolean outOfLimits = true;

		if (get(index + 1) == null) {
			removeFromEnd();
		} else {
			for (int i = index; i < length - 1; i++ ) {
				array[i] = array[i + 1];
			}
			length--;
			outOfLimits = true;
		}
		
		return outOfLimits;
	}

	//Doesn't work!
	@Override
	public boolean insertAt(String data, int index) {
		boolean outOfLimits = true;

		if (get(index + 1) == null) {
			addAtEnd(data);
		} else {
			for (int i = length -1; i < index; i--) {
				array[i + 1] = array[i];
			}
			array[index] = data;
			length++;
			outOfLimits = true;
		}
		
		return outOfLimits;
	}


}
