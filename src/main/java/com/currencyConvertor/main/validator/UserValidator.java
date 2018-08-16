package com.currencyConvertor.main.validator;

import java.time.LocalDate;
import org.apache.commons.validator.routines.EmailValidator;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.currencyConvertor.main.model.User;

@Component
public class UserValidator implements Validator {

	private final String NOT_EMPTY = "NotEmpty";
	@Override
	public boolean supports(Class<?> aClass) {
		return User.class.equals(aClass);
	}

	@Override
	public void validate(Object o, Errors errors) {
		User user = (User) o;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", NOT_EMPTY);
		if (!EmailValidator.getInstance().isValid(user.getEmail())) {
			errors.rejectValue("email", "invalid.userForm.email");
		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", NOT_EMPTY);
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "dob", NOT_EMPTY);
		if (LocalDate.parse(user.getDob()).isAfter(LocalDate.now())) {
			errors.rejectValue("dob", "after.userForm.dob");
		}
	}
}
