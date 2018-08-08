/**
 * 
 */
package com.lab18;

/**
 * @author Camila Brasil
 *
 */
public interface MyList {

	void addAtBeginning(String data);
	
	void removeFromBeginning();
	
	void addAtEnd(String data);
	
	void removeFromEnd();
	
	boolean removeAt(int index);
	
	String get(int index);
	
	int size(); // How many items are in the list

	boolean insertAt(String data, int index);
	
}
