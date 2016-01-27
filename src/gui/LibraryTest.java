package gui;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This is the test for Library class.
 * 
 * @author Scott Zhou
 * @version 3.0 December 16, 2015
 */
public class LibraryTest {

	@Test
	public void testsearchKeyword() {
	 String[] cell={"Trung","Banana","Something about Trung","Trung likes to eat bananas and pine candies"};
	 String keyword = "Banana";
	 Library lib = new Library();
	 assertArrayEquals(cell,lib.searchKeyword(keyword));
	}
	
	@Test
	public void testsearchTitle() {
	 String[] cell={"Trung","Banana","Something about Trung","Trung likes to eat bananas and pine candies"};
	 String title = "Trung";
	 Library lib = new Library();
	 assertArrayEquals(cell,lib.searchTitle(title));
	}

}
