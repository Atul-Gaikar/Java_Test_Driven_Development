package com.bridgelabz.javatdd;

public class PasswordValidator {
	public boolean isValid(String Password) {
		if (Password.length() >= 5 && Password.length() <= 10) {
			return true;

		} else
			return false;
	}
}
