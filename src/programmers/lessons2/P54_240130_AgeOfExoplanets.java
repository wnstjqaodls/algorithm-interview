package programmers.lessons2;

public class P54_240130_AgeOfExoplanets {
	/*
	 * 우주여행을 하던 머쓱이는 엔진 고장으로 PROGRAMMERS-962 행성에 불시착하게 됐습니다. 
	 * 입국심사에서 나이를 말해야 하는데,
	 * PROGRAMMERS-962 행성에서는 나이를 알파벳으로 말하고 있습니다. 
	 * a는 0, b는 1, c는 2, ..., j는 9입니다.
	 * 
	 * 예를 들어 23살은 cd, 51살은 fb로 표현합니다. 
	 * 나이 age가 매개변수로 주어질 때 PROGRAMMER-962식 나이를
	 * return하도록 solution 함수를 완성해주세요.
	 * 
	 * 
	 */

	public static void main(String[] args) {

		int param = 51;
		String result;

		result = solution(param);
		System.out.println(result);

	}

    public static String solution(int age) {
        StringBuffer answer = new StringBuffer();
        // 내 풀이
        // 나이를,1의 자리로 추출한다 . 10 으로 계속나눈 나머지를 저장함. 
        // 숫자에 X 값을 더하여 , ascii 코드와 매칭시킨후 ,
        // 해당값을 String builder를 이용하여 문자열에 append 한다.
        int division = 10;        
        
        // 배열 초기화를 위한 로직
        // 어떤정수가, 몇자리 수인지 알려면 어떤 로직이 필요할까 ..? -> log(n) 계산후 그결과에 1더하거나
        // 또는 문자열로 변환후 문자열 길이 확인.
        String tmp = String.valueOf(age);

        // 1 로나눈 나머지는 : 백의자리
        
        int numArr [] = new int [tmp.length()];
        
        // 값이 1000 미만의 값이 들어오니까  조건식을 아래와 같이 구성함
        for (int i = 0; i < numArr.length; i++) {
        	numArr[i] = age % division; 
			age /= 10;
			
        }
         
        // ascii 코드의 소문자 a 는 97이다. 소문자는  97 부터 122(z) 까지임.
        // 0 이 a 라고했으니 ... 97을 더해주면 ascii 코드와 매칭됨

        for (int i = numArr.length-1; 0 <= i; i--) {
        	char tmpChar = (char) ( numArr[i]+ 97);
        	answer.append(tmpChar);
			
		}
        
        
        
        return answer.toString();
    }

}
