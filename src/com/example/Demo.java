package com.example;

import java.util.StringTokenizer;

public class Demo {
	private static final String DELIM = " ";

	public static void main(String[] args) {
		String dummyName = "ngoc trinh dit bu";

		StringTokenizer st = new StringTokenizer(dummyName, DELIM);
		StringBuilder result = new StringBuilder();
		while (st.hasMoreTokens()) {
			String tmp = st.nextToken();
			result.append(tmp.substring(0, 1).toUpperCase() + tmp.substring(1) + DELIM);
		}

		System.out.println(result);
	}
}
