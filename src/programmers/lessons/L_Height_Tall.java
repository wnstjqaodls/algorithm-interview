package programmers.lessons;

public class L_Height_Tall {

	public static void main(String[] args) {
		int i;
		int [] iarry = {149, 180, 192, 170};
		int height = 167;
		
		i = solution(iarry,height);
		
		
	}
	
    public static int solution(int[] array, int height) {
        int answer = 0;
        
        for(int tmp : array){
        	int cur = tmp;
        	if(cur > height){
        		answer += 1;
        	}
        }
        
        return answer;
    }
}
