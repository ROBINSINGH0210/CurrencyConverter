package com.currencyConvertor.main.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

public class PasswordValidator {
	private static PasswordValidator INSTANCE = new PasswordValidator();
	private static String pattern = null;
	private final static Pattern hasUppercase = Pattern.compile("[A-Z]");
	private final static Pattern hasLowercase = Pattern.compile("[a-z]");
	private final static Pattern hasNumber = Pattern.compile("\\d");
	private final static Pattern hasSpecialChar = Pattern.compile("[^a-zA-Z0-9 ]");

	/**
	 * No one can make a direct instance
	 */
	private PasswordValidator() {
		// do nothing
	}

	/**
	 * Force the user to build a validator using this way only
	 */
	public static String buildValidator() {
		StringBuilder patternBuilder = new StringBuilder("((?=.*[a-z])");
		patternBuilder.append("(?=.*[@#$%])");
		patternBuilder.append("(?=.*[A-Z])");
		patternBuilder.append("(?=.*\\\\\\\\d)");
		// patternBuilder.append(".{" + minLength + "," + maxLength + "})");
		patternBuilder.append(")");
		pattern = patternBuilder.toString();
		return pattern;
	}

	public static boolean validatePassword(final String password) {
		if(StringUtils.isBlank(pattern))
			buildValidator();
		Pattern p = Pattern.compile(pattern);
		Matcher m = hasUppercase.matcher(password);
		return m.matches();
	}
}