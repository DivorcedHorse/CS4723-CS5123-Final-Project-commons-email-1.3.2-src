/* TestGetSocketTimeout by Daniel Tellez
 * 
 * Purpose:
 * 
 * 		Tests the method int getSocketConnectionTimeout()
 * 		to see if the value is being returned from the method.
 */

package org.apache.commons.mail;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import junit.framework.TestCase;

public class TestGetSocketTimeout extends TestCase{
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
	 * testGetCorrectSocketInt
	 * 		Asserts that the value of the expected
	 * 		matches the value that is returned by the 
	 * 		method.
	 */
	public void testGetCorrectSocketInt() {
		int expected = 60000; 
		int actual = testEmail.getSocketConnectionTimeout();
		assertEquals(expected, actual);

		System.out.println("TESTGETCORRECTSOCKETINT - UON - Purpose of this test "
		+ "is to check if the variabl socketConnectionTimeout, which is set to the "
		+ "constant SOCKET_TIMEOUT_MS returns the correct value as expexted.");
	}
}
