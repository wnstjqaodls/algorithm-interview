package programmers.lessons;

public class G_StringPrint {
	
	public static void main(String[] args) {
		
		
		solution("hello", 3);
		
	}
	
    public static void solution(String my_string, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
       
        int idx = 0;
        while (idx < my_string.length()){
        	
        	for(int i =0; i < n; i++){
        		sb.append(my_string.charAt(idx));	
        	}
        	
        	
        	idx += 1;
        }
        
        System.out.println(sb.toString());
        
        
    }
}
