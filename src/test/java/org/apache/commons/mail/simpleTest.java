package org.apache.commons.mail;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import junit.framework.TestCase;

public class simepleTest extends TestCase {

	public void simple() {
		System.out.println("This is a message from the simple test.");
		String result = "oneTwo";
		assertEquals("oneTwo", result);
	}

}
