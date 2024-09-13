package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02MusicPlayList만들기 {

	public static void main(String[] args) {

		// 발생 오류 종류
		// 컴파일 -> 컴파일 완료하고 그 코드로 -> 실행
		// 1. 컴파일(작성한 코드를 컴퓨터 언어로 변경) 오류
		// 코드상에서 오타 , 타입 불일치 등 => 실행이 안됨 (빨간줄)
		
		// 2. 런타임(프로그램 실행) 오류
		// 코드 문법 자체는 문제가 없음 but, 실행을 하고 보니 오류 발생
		// 콘솔에 출력되는 Exception 타입 확인 => 작성한 코드가 어떤 오류가 발생하는지를 확인
		//   => 해당 오류를 해결할 수 있는 예외처리 필수
		
		
		
		Scanner sc = new Scanner(System.in);

		ArrayList<String> musicList = new ArrayList<>();

		while (true) {
			System.out.print("[1] 노래 추가 [2] 노래 삭제 [3] 종료 >> ");
			
			int menu = sc.nextInt();
			
			if (menu == 1) { // 노래 추가
				
				// 재생목록 출력
				printPlayList(musicList);
				
//				// 1. 재생목록 출력
//				System.out.println("======= 현재 재생 목록 =======");
//				// 재생할 곡이 없는 경우 / 있는 경우 => 조건문
//				if (musicList.isEmpty()) {
//					System.out.println("재생목록이 없습니다.");
//				} else {
//					int index = 1;
//					for (String music : musicList) {
//						System.out.println(index + ". " + music);
//						index++;
//					}
//				}
//				System.out.println("==========================");
				
				System.out.print("[1]마지막 위치에 추가 [2]원하는 위치에 추가 >> ");
				int input = sc.nextInt();
				if(input==1) {
					System.out.print("추가 할 노래 입력 >> ");
					String inputTitle = sc.next();
					musicList.add(inputTitle);
					// musicList.add(sc.next()); => 위에 두줄을 합친 것
					
				}else { // 2
					System.out.print("추가 할 노래 입력 >> ");
					// musicList.add(sc.next());
					String inputTitle = sc.next();
					System.out.print("추가 할 위치 입력 >> ");
					int inputIndex = sc.nextInt();
					// 예외처리 : try~catch(o) / throws
					try { // 내가 실행하고 싶은 코드 (오류가 발생할 수 있는 코드 넣어주기)
						musicList.add(inputIndex-1 , inputTitle);
						
						// 어레이와 위치 번호가 다름으로 -1을 해줘야 원하는 위치에 들어간다.
					}catch(IndexOutOfBoundsException e) {  
						// => 발생한 오류를 어떻게 처리할 것인지 작성
						// => 해당 오류가 발생했을 때에만 실행된다
						// () -> try에서 발생할 수 있는 오류 코드(콘솔창에 뜨는 오류코드) 넣어주기
						// 오류 코드를 부르는 명칭 하나를 위의 e처럼 뒤에 붙여주기
						System.out.println("지정할 수 없는 위치입니다.");
						continue; // 반복문 안에서 작성하는 키워드
						          // break; : 반복문 종료하는 키워드(반복문을 나가버리는 키워드)
						          // continue; : 현재 반복문 회차만 종료
					}
			
				}
				
				System.out.println("추가가 완료되었습니다.");
				
			} else if (menu == 2) { // 노래 삭제
				
				printPlayList(musicList);
				
				// 곡이 없으면 삭제할 곡이 없습니다 출려 / 있으면 삭제 기능 진행
				if(musicList.isEmpty()) {
					System.out.println("삭제할 곡이 없습니다.");
				}else {
					System.out.println("[1]선택삭제 [2]전체삭제 >> ");
					int input = sc.nextInt();
					if(input==1) { // 1번
						System.out.println("삭제할 노래 선택 >> ");
						int inputIndex = sc.nextInt(); // 1번 -> 0번방 , 3번 -> 2번방
						try { // 내가 실행하고 싶은 코드 (오류가 발생할 수 있는 코드 넣어주기)
							musicList.remove(inputIndex-1);
							// 어레이와 위치 번호가 다름으로 -1을 해줘야 원하는 위치에 들어간다.
							System.out.println("노래가 삭제되었습니다.");
						}catch(IndexOutOfBoundsException e) {  
							// => 발생한 오류를 어떻게 처리할 것인지 작성
							// => 해당 오류가 발생했을 때에만 실행된다
							// () -> try에서 발생할 수 있는 오류 코드(콘솔창에 뜨는 오류코드) 넣어주기
							// 오류 코드를 부르는 명칭 하나를 위의 e처럼 뒤에 붙여주기
							System.out.println("지정할 수 없는 위치입니다.");
							continue; // 반복문 안에서 작성하는 키워드
							          // break; : 반복문 종료하는 키워드(반복문을 나가버리는 키워드)
							          // continue; : 현재 반복문 회차만 종료

						}
					}else { // 2번
						musicList.clear();
						System.out.println("전체 list가 삭제되었습니다.");
						
					}
				}

			} else {
				System.out.println("프로그램 종료");
				break;
			}
		}

		
	
		
	}

	// 재생목록 출력
	public static void printPlayList(ArrayList<String> musicList) {
		// 1. 재생목록 출력
		System.out.println("======= 현재 재생 목록 =======");
		// 재생할 곡이 없는 경우 / 있는 경우 => 조건문
		if (musicList.isEmpty()) {
			System.out.println("재생목록이 없습니다.");
		} else {
			int index = 1;
			for (String music : musicList) {
				System.out.println(index + ". " + music);
				index++;
			}
		}
		System.out.println("==========================");
		
	}
	
}
