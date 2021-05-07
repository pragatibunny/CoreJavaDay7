/**
 * Program to extract date, time from the date string
 */
package com.java;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Pragati Sharma
 *
 */
public class Assignment2 {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		// Extracting date
		System.out.println(dateFormatter.format(now));
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		// Extracting time
		System.out.println(timeFormatter.format(now));
	}

}
