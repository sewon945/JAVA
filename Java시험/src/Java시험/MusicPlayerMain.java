package Java시험;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlayerMain {

	public static void main(String[] args) {

		
		      Scanner sc = new Scanner(System.in);
		      
		      MusicVO vo = new MusicVO("유리구슬","여자친구",320);
		      
		      System.out.println("====뮤직플레이어====");
		      System.out.println("1.등록 2.목록 3.실행 4.이전곡 5.다음곡 6.종료 >>");
		      
		      int choise = sc.nextInt();
		      int unmber = sc.nextInt();
		      
		      ArrayList<MusicVO> list = new ArrayList<MusicVO>();
		      
		      if(choise == 1) {
		         System.out.println("등록");
		         
		         
		      }else if(choise == 2) {
		         System.out.println("===노래제목===");
		         for(int i = 0; i < list.size(); i++) {
		            
		         }
		         System.out.println();
		      }else if(choise == 3) {
		         
		      }else if(choise == 4) {
		         System.out.println("====이전곡====");
		        
		         
		         
		         
		      }else if(choise == 5) {
		         
		      }else if(choise == 6) {
		         
		      }
		   }
	

		
	}


