package JavaFestival;

public class Ex13 {

	public static void main(String[] args) {

		String score = "A,A,B,C,D,A,C,D,D,D,F";
		
		// 성적에 따른 개수를 저장할 변수
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		
		for(int i = 0; i < score.length();i++) {
			// 특정 문자를 찾는 조건문
			if(score.charAt(i) == 'A') {
				a++;
			} else if(score.charAt(i) == 'B') {
				b++;
			}else if(score.charAt(i)== 'C') {
				c++;
			}else if(score.charAt(i)== 'D') {
				d++;
			}else if(score.charAt(i)== 'E') {
				e++;
			}else if(score.charAt(i)== 'F') {
				f++;
			}
		}
		
		System.out.println("A : " + a + "명");
		System.out.println("B : " + b + "명");
		System.out.println("C : " + c + "명");
		System.out.println("D : " + d + "명");
		System.out.println("E : " + e + "명");
		System.out.println("F : " + f + "명");
		
		
		
		
		
		
		
		
		
		
		
	}

}
