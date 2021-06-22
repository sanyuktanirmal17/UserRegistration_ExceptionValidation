
/************************************************************
 * Purpose : VAlidation Exception for user registration system using regex.
 * @author Sanyukta Nirmal
 * @Version 1.0
 * @since 22-06-2021
 *
 ************************************************************/

import java.util.regex.Pattern;

public class UserRgistration {

	/**
	 * Function for Checking the FirstName
	 * 
	 * @param fName
	 * @return True if matches regex pattern otherwise throws exception
	 * @throws ValidationOfException
	 */
	public boolean checkFirstname(String fName) throws ValidationOfException {
		boolean check = Pattern.matches("[A-Z]+[a-z]{2,}", fName);
		if (check)
			return true;
		else
			throw new ValidationOfException("Invalid First name");
	}

	/**
	 * Function for Checking the LastName
	 * 
	 * @param Lname
	 * @return True if matches regex pattern otherwise throws exception
	 * @throws ValidationOfException
	 */
	public boolean checkLastName(String Lname) throws ValidationOfException {
		boolean check = Pattern.matches("[A-Z]+[a-z]{2,}", Lname);
		if (check)
			return true;
		else
			throw new ValidationOfException("Invalid Last Name");
	}

	/**
	 * Function for Checking the EmailId
	 * 
	 * @param EmailId
	 * @return True if matches regex pattern otherwise throws exception
	 * @throws ValidationOfException
	 */
	public boolean checkEmailId(String EmailId) throws ValidationOfException {
		boolean check = Pattern.matches("^[a-z0-9.+-]+@[A-Za-z0-9.-]+.[A-Za-z]{2,6}$", EmailId);
		if (check)
			return true;
		else
			throw new ValidationOfException("Invalid Email id");
	}

	/**
	 * Function for Checking the MobileNo
	 * 
	 * @param MobileNo
	 * @return True if matches regex pattern otherwise throws exception
	 * @throws ValidationOfException
	 */
	public boolean checkMobileNo(String MobileNo) throws ValidationOfException {
		boolean check = Pattern.matches("^[1-9][0-9]\s[1-9]{10}$", MobileNo);
		if (check)
			return true;
		else
			throw new ValidationOfException("Invalid Phone number");
	}

	/**
	 * Function for Checking the PassWord
	 * 
	 * @param Password
	 * @return True if matches regex pattern otherwise throws exception
	 * @throws ValidationOfException
	 */
	public boolean checkPassWord(String Password) throws ValidationOfException {
		boolean check = Pattern.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[a-zA-z0-9!@#$%^&*()_+=-{};':<>,./?~`]).{8,}$",
				Password);
		if (check)
			return true;
		else
			throw new ValidationOfException("Invalid password");
	}

	public static void main(String[] args) throws ValidationOfException {
		UserRgistration registration = new UserRgistration();
		registration.checkFirstname("sanyu"); // Throws invalid first name exception

	}

}
