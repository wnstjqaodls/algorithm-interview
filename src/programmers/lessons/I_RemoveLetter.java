package programmers.lessons;

public class I_RemoveLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		solution("abcdef", "f");

	}
	
    public static void solution(String my_string, String letter) {
        String answer ;
        char tmp;
        String inletter = letter;
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < my_string.length(); i++) {
        	tmp = my_string.charAt(i);
        	
        	if(inletter.charAt(0) == tmp){
        		continue;
        	}
        	
        	sb.append(tmp);
        	
        	
		}
        
        answer = sb.toString();
        System.out.println(sb.toString());
        
    }

}
