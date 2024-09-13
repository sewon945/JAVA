package 객체배열;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("물건 개수 입력 : ");
		int proNum = sc.nextInt();

		// 입력한 개수만큼 상품정보 저장 => 배열
		Product[] proArr = new Product[proNum];



		for (int i = 0; i < proNum; i++) { // i < proArr.length 둘 중에 뭘 쓰던 상관없음
			System.out.print(i + 1 + ") 물건 이름 : ");
			String name = sc.next();
			System.out.print(i + 1 + ") 단가 : ");
			int dan = sc.nextInt();
			System.out.print(i + 1 + ") 수량 : ");
			int su = sc.nextInt();

			// product 객체 생성
			proArr[i] = new Product(name, dan, su);
			System.out.println();
		}

		// 배열에 저장된 상품정보 출력, 총금액 출력

		System.out.println("제품명\t단가\t수량");
		
		int total = 0;  // 총금액 <= 각 상품에 대한 총금액(단가 * 수량) 누적

		for (Product p : proArr) {
			System.out.println(p.getName() + "\t" + p.getUnitPrice() + "원\t" + p.getAmount() + "개");
			total += p.getUnitPrice() * p.getAmount();

		}
		System.out.println("총 금액 : " + total + "원");

	}

}
