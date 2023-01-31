package sba.sms.services;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import sba.sms.utils.CommandLine;


import static org.assertj.core.api.Assertions.*;

@FieldDefaults(level = AccessLevel.PRIVATE)

class StudentServiceEmailValidate {
	static StudentService studentService;

    @BeforeAll
    static void beforeAll() {
        studentService = new StudentService();
        CommandLine.addData();
    }

	@Test
	void validateStudent() {
		String email = "reema@gmail.com";
		String pass = "password";
		boolean validateEmail = studentService.validateStudent(email, pass);
        assertEquals(true, validateEmail);
	}

}
