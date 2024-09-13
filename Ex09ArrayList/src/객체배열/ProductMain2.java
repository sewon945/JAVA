package 객체배열;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductMain2 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
	      
	      System.out.print("물건 개수 입력 : ");
	      int proNum = sc.nextInt();

	      //입력한 개수만큼 상품정보 저장 => 어레이리스트
	      ArrayList<Product> proAl = new ArrayList<Product>();
	      

	      // 처음 포문을 쓸 때에는 아무것도 들어가지 않은 상태라 사이즈에 0이 들어간다 그러므로 처음에는 사이즈 쓰지않기
	      for(int i=0; i<proNum; i++) {
	         System.out.print(i+1+") 물건 이름 : ");
	         String name = sc.next();
	         System.out.print(i+1+") 물건 단가 : ");
	         int dan = sc.nextInt();
	         System.out.print(i+1+") 물건 수량 : ");
	         int su = sc.nextInt();
	         
	        
	        proAl.add( new Product(name,dan,su));
	      }
	      
	      //배열에 저장된 상품정보 출력, 총금액 출력
	      System.out.println("제품명\t단가\t수량");
	      int total = 0; //총금액 <= 각 상품에 대한 총금액(단가 * 수량) 누적
	      for(Product p:proAl) {
	         System.out.println(p.getName()+"\t"+p.getUnitPrice()+"원\t"+p.getAmount()+"개");
	         total += p.getUnitPrice() * p.getAmount();
	      }
	      
	      for(int i=0; i<proAl.size(); i++) {
	    	  System.out.println(proAl.get(i).getName()+"\t"+proAl.get(i).getUnitPrice()+"원\t"+proAl.get(i).getAmount()+"개");
		         total += proAl.get(i).getUnitPrice() * proAl.get(i).getAmount();
	    	  
	      }
	      System.out.println("총 금액 : "+ total+"원");
		
		
		
		
		
		
		
		
		
	}

}
