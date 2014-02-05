package org.daniels.samples;

import junit.framework.TestCase;
import mockit.Mocked;
import mockit.NonStrictExpectations;

import org.junit.Before;
import org.junit.Test;


public class AppTest extends TestCase {

	@Mocked
	Book book;
	
	private App app;
	
    @Before
    public void setUp()  {
    	app = new App();
    }

	@Test
	public void testApp() {
		// given
		app.setBook(book);
		
		// expect
		new NonStrictExpectations() {
			{
				book.getName(); result = "test";
				book.getPrice(); result = 10;
			}
		};
		
		// when
		String details = app.getBookDatails();
		
		// then
		assertEquals("test10", details);
		
	}
}
