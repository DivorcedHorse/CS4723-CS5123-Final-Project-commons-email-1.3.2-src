/* TestGetSentDate by Daniel Tellez
 * 
 * Purpose:
 * 
 * 		Tests the method Date getSentDate()
 * 		to see if the date of the email is 
 * 		being set properly.
 */

package org.apache.commons.mail;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import junit.framework.TestCase;
import java.util.Date;

public class TestGetSentDate extends TestCase {
	Email testEmail;
	
	/* 
	 * setUp
	 * 
	 * Sets up the necessary SimpleEmail that
	 * will be used in each test method.
	 */
	public void setUp() {
		testEmail = new SimpleEmail();
	}
	
	/*
	 * testNullSentDate
	 * 		Tests to see if a new Date
	 * 		object is returned if the 
	 * 		sentDate is null.
	 */
	public void testNullSentDate() {
		Date dateTest;
		testEmail.sentDate = null;

		dateTest = testEmail.getSentDate();
		
		assertTrue(dateTest instanceof Date);
		System.out.println("TESTNULLSENTDATE - UON - Purpose of this test "
		+ "is to to ensure that if the sentDate variable in an email is set "
		+ "to null, that a Date object is returned.");
	}
	
	/*
	 * testValidDateSet
	 * 		Asserts that if the date for the email
	 * 		has been set, that it returns the expected
	 * 		date.
	 */
	public void testValidDateSet() {
		Date expDate = new Date(2020, 9, 4, 4, 43, 33);
		testEmail.sentDate = expDate;
		
		Date actDate = testEmail.getSentDate();
		assertEquals(expDate.getTime(), actDate.getTime());
		System.out.println("TESTVALIDDATESET - UON - Purpose of this test "
		+ "is to to ensure that if the sentDate variable in an email is set "
		+ "to a specific date object, that the exact Date object is returned "
		+ "as expected.");
	}
	
	/*
	 * tearDown
	 * 
	 * After each test method, want to ensure that 
	 * the variables are "reset"/set back to their
	 * original state.
	 */
	public void tearDown() {
		testEmail = null;
	}
}
	
