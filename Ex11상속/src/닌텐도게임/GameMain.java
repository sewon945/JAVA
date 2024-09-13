package 닌텐도게임;

public class GameMain {

	public static void main(String[] args) {
		// 게임을 실행할 공간

		// 게임 칩 가져오기
		DongGame d = new DongGame();
		// 게임 칩 끼워서 실행하기
		insert(d);

		PokemonGame p = new PokemonGame();
		insert(p);
		MarioGame m = new MarioGame();
		insert(m);
		// 빨간줄 에러 해결해보기~
		

	}

	// 게임칩을 끼워서 실행하는 기능
	private static void insert(GameChip game) { 
		// --> 모든 게임들이 상속받으려면 공통의 부모를 만들어서 그걸 게임칩이라고 만들고 한 번에 상속받기
		// 모든 게임칩들(PokemonGame, MarioGame)들은 GameChip을 상속 받아
		// GameChip 자료형으로 자동 형변환이 가능!
		// GameChip game = new PokemonGame();  --> 자동으로 형변환
		// GameChip game = MarioGame();        --> 자동으로 형변환
		// GameChip game = new DongGame();
		// GameChip game = p = new PokemonGame();
		// new PokemonGame(); -> p -> GameChip 으로 형 변환
		game.run();
	}

//	// 메소드 오버로딩 기법으로 해결하는 방법
//	private static void insert(PokemonGame game) {
//		game.run();
//	}
//
//	private static void insert(MarioGame game) {
//		game.run();
//
//	}
}
