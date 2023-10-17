package loginapp;

import java.util.ResourceBundle;

public class loginapp {
	public int checkLogin(String string, String string2)
	{
		ResourceBundle rb  = ResourceBundle.getBundle("config");
		String user = rb.getString("username");
		String pas =  rb.getString("password");
			if (string.equals(user) && string2.equals(pas))
			{
				return 1;
			}
			else 
			{
				return 0;
			}
		
	}

}
