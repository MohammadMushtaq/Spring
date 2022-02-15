package com.xworkz.passport;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.xworkz.passport.constants.BloodGroup;
import com.xworkz.passport.constants.Gender;
import com.xworkz.passport.constants.PassportPersonnelType;
import com.xworkz.passport.constants.VerifiedDocument;
import com.xworkz.passport.entity.PassportEntity;
import com.xworkz.passport.repository.PassportDAO;
import com.xworkz.passport.repository.PassportDAOImpl;
import com.xworkz.passport.service.PassportService;
import com.xworkz.passport.service.PassportServiceImp;

public class PassportTester {

	public static void main(String[] args) {
		
		PassportEntity pass= new PassportEntity("ravi kumar",
				LocalDateTime.of(2022, 9, 1, 11, 45, 30), LocalDateTime.of(2033, 3, 16, 12, 45, 30),
				Gender.MALE,"A2096457", "ward no -34 bellary", "mushtaq ahmad", false,
				PassportPersonnelType.REGULAR,LocalDate.of(2010, 5, 10),BloodGroup.AB_NEGITIVE,VerifiedDocument.DRIVING_LICENCE);

		
		PassportDAO passDao = new PassportDAOImpl();
		PassportService passportService= new PassportServiceImp(passDao);
		passportService.validateAndSave(pass);
	}

}
