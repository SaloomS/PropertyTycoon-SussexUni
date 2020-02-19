import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
		GameController gameController = GameController.getInstance();
		gameController.setGameWindowTitle("Property Tycoon!");
		gameController.setGameWindowSize(960, 720);
		gameController.setGameWindowLocation(50,  50);

		gameController.showGame();
	}
}
