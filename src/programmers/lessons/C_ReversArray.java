package programmers.lessons;

public class C_ReversArray {
public static void main(String[] args) {
	int [] num_list = {1, 2, 3, 4, 5};
	int [] result_list = {};
	
	System.out.print(num_list.length);
	
	for (int i = num_list.length-1; i >= 0 ; i--) {
		result_list[num_list.length -1 -i] = num_list[i];
		
	}
	
	
}
}
