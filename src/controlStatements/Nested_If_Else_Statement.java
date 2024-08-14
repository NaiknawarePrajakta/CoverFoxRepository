package controlStatements;

public class Nested_If_Else_Statement {

public static void main(String[] args) {
		
		//Enter your email id
		//if email id is correct, then enter the password
		//if password is correct then login success
		//else password is incorrect
		//else email id is incorrect
		
		String emailId = "java@gamil.com";
		String password = "java@1234";
		
		if(emailId =="java1@gamil.com")
		{
			System.out.println("Email id is correct,please enter password");
			
			if(password == "java@12345")
			{
				System.out.println("Password is correct, login success");
			}
		
		else 
		{
			System.out.println("incorrect password");
		}
		}
			else
			{
				System.out.println("email id is incorrect");
			}
		}
	}




