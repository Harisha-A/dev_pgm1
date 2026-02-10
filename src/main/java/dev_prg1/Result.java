package dev_prg1;

public class Result {
		public static String display(int m)
		{
			if(m<0 ||m>100)
				return "invalid";
			else if(m<40)
				return "fail";
			else
				return "pass";
		
		}

	}


