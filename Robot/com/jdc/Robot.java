package com.jdc;
import java.util.Map;
import java.util.HashMap;



public class Robot{

		private Map<String , String> dictionary = new HashMap<>();
		private String question;

		Robot(){
			dictionary.put("name", "mr robot");
			question = null;
		}
		
		
			
		

		public String talk(String message){

			if(null != question){
				dictionary.put(question, message);
				question = null;
				return "Thank you for teaching me.";
				
			}

			String botTalk = dictionary.get((message));

			if(botTalk != null){
				return botTalk;
			}

			question = message;

			return "I have no idea. Please teach me.";
		}


}