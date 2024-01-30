package programmers.lessons;

public class F_ConsonantVowels {
	
	

	
	
	
	    public String solution(String my_string) {
			StringBuilder answer = new StringBuilder();
			String someStr = "aeiouAEIOU";
			
			
			for (int i = 0; i < my_string.length(); i++) {
				
				char c = my_string.charAt(i);
				
				if(someStr.indexOf(c) == -1){
					answer.append(c);
				}
				  
				
			}
	        return answer.toString();
	    }
	
}
