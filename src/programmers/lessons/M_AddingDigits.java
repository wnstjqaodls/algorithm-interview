package programmers.lessons;

public class M_AddingDigits {

	public static void main(String[] args) {
		int [] i;
		int [] iarry = {1,2,100,-99,1,2,3};

		//i = solution(iarry);


	}

    public static int solution(int n) {
        int answer = 0;
/*        String n2Str = Integer.toString(n);
        
        for (int i = 0; i < n2Str.length(); i++) {
        	char tmp = n2Str.charAt(i);
        	
			answer += tmp;
		}*/

        
        while (n > 0){

        	if(n > 0){
        		answer += n % 10 ;
        		n /= 10;
        	}
        }
        
        
        return answer;
    }
}
