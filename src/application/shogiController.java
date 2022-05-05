package application;


import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

public class shogiController {
	//　0行目
	@FXML private TextField zeroZero;
	@FXML private TextField zeroOne;
	@FXML private TextField zeroTwo;
	@FXML private TextField zeroThree;
	@FXML private TextField zeroFour;
	@FXML private TextField zeroFive;
	@FXML private TextField zeroSix;
	@FXML private TextField zeroSeven;
	@FXML private TextField zeroEight;
	// 1行目
	@FXML private TextField oneZero;
	@FXML private TextField oneOne;
	@FXML private TextField oneTwo;
	@FXML private TextField oneThree;
	@FXML private TextField oneFour;
	@FXML private TextField oneFive;
	@FXML private TextField oneSix;
	@FXML private TextField oneSeven;
	@FXML private TextField oneEight;
	// 2行目
	@FXML private TextField twoZero;
	@FXML private TextField twoOne;
	@FXML private TextField twoTwo;
	@FXML private TextField twoThree;
	@FXML private TextField twoFour;
	@FXML private TextField twoFive;
	@FXML private TextField twoSix;
	@FXML private TextField twoSeven;
	@FXML private TextField twoEight;
	// 3行目
	@FXML private TextField threeZero;
	@FXML private TextField threeOne;
	@FXML private TextField threeTwo;
	@FXML private TextField threeThree;
	@FXML private TextField threeFour;
	@FXML private TextField threeFive;
	@FXML private TextField threeSix;
	@FXML private TextField threeSeven;
	@FXML private TextField threeEight;
	// 4行目
	@FXML private TextField fourZero;
	@FXML private TextField fourOne;
	@FXML private TextField fourTwo;
	@FXML private TextField fourThree;
	@FXML private TextField fourFour;
	@FXML private TextField fourFive;
	@FXML private TextField fourSix;
	@FXML private TextField fourSeven;
	@FXML private TextField fourEight;
	// 5行目
	@FXML private TextField fiveZero;
	@FXML private TextField fiveOne;
	@FXML private TextField fiveTwo;
	@FXML private TextField fiveThree;
	@FXML private TextField fiveFour;
	@FXML private TextField fiveFive;
	@FXML private TextField fiveSix;
	@FXML private TextField fiveSeven;
	@FXML private TextField fiveEight;
	// 6行目
	@FXML private TextField sixZero;
	@FXML private TextField sixOne;
	@FXML private TextField sixTwo;
	@FXML private TextField sixThree;
	@FXML private TextField sixFour;
	@FXML private TextField sixFive;
	@FXML private TextField sixSix;
	@FXML private TextField sixSeven;
	@FXML private TextField sixEight;
	// 7行目
	@FXML private TextField sevenZero;
	@FXML private TextField sevenOne;
	@FXML private TextField sevenTwo;
	@FXML private TextField sevenThree;
	@FXML private TextField sevenFour;
	@FXML private TextField sevenFive;
	@FXML private TextField sevenSix;
	@FXML private TextField sevenSeven;
	@FXML private TextField sevenEight;
	// 8行目
	@FXML private TextField eightZero;
	@FXML private TextField eightOne;
	@FXML private TextField eightTwo;
	@FXML private TextField eightThree;
	@FXML private TextField eightFour;
	@FXML private TextField eightFive;
	@FXML private TextField eightSix;
	@FXML private TextField eightSeven;
	@FXML private TextField eightEight;
	
	
	@FXML
	protected void handleClicked00(MouseEvent event) {
		String text=zeroZero.getPromptText();
		System.out.println(text);
		zeroZero.setPromptText("a");
	}
}
