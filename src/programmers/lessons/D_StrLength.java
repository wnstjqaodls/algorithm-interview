package programmers.lessons;

public class D_StrLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] strarr = {"asd","fdbd","c"};
		
		solution(strarr);

	}
	
    public static int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for(int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
            System.out.println(answer[i]);
        }
        
        return answer;
    }

}
