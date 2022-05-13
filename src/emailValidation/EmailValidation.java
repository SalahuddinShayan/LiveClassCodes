package emailValidation;

import java.util.*;  

public class EmailValidation {
	public static void main(String[] args)  {
		System.out.println("This is a E-mail Id Verification Program");
		String[] emailList = { "abc@g.com", "efg@g.com", "xyz@g.com" }; 
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter a Email Id");
		String userGivenEmail= sc.nextLine();
		sc.close();
		boolean x = false;
		for (int i = 0; i < emailList.length; i++) {  
            if(userGivenEmail.equals(emailList[i])) {  
                x = true; break;  
            }  
        } 
        if(x)  
            System.out.println("User given Email is Valid");  
        else  
            System.out.println("User given Email is not Valid");  
    }  
	}


