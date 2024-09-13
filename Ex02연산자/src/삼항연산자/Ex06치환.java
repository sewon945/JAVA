package 삼항연산자;

public class Ex06치환 {

	public static void main(String[] args) {

		String left = "red";
		String right = "blue";
		
		System.out.println("왼손 : "+ left);
		System.out.println("오른손 : "+ right);
		
		String temp = "";
		             // left   right   temp
		temp = right;// red    blue    blue
		right = left;// red    red     blue
		left = temp; // blue   red     blue
		// step2에서 하나를 내려놓긴 했지만 일단 가지고 있는 것임
		
		System.out.println("왼손 : "+ left);
		System.out.println("오른손 : "+ right);
		
		
	}

}
