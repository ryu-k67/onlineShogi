package application;


import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

public class shogiController {
	//�@0�s��
	@FXML private TextField zeroZero;
	@FXML private TextField zeroOne;
	@FXML private TextField zeroTwo;
	@FXML private TextField zeroThree;
	@FXML private TextField zeroFour;
	@FXML private TextField zeroFive;
	@FXML private TextField zeroSix;
	@FXML private TextField zeroSeven;
	@FXML private TextField zeroEight;
	// 1�s��
	@FXML private TextField oneZero;
	@FXML private TextField oneOne;
	@FXML private TextField oneTwo;
	@FXML private TextField oneThree;
	@FXML private TextField oneFour;
	@FXML private TextField oneFive;
	@FXML private TextField oneSix;
	@FXML private TextField oneSeven;
	@FXML private TextField oneEight;
	// 2�s��
	@FXML private TextField twoZero;
	@FXML private TextField twoOne;
	@FXML private TextField twoTwo;
	@FXML private TextField twoThree;
	@FXML private TextField twoFour;
	@FXML private TextField twoFive;
	@FXML private TextField twoSix;
	@FXML private TextField twoSeven;
	@FXML private TextField twoEight;
	// 3�s��
	@FXML private TextField threeZero;
	@FXML private TextField threeOne;
	@FXML private TextField threeTwo;
	@FXML private TextField threeThree;
	@FXML private TextField threeFour;
	@FXML private TextField threeFive;
	@FXML private TextField threeSix;
	@FXML private TextField threeSeven;
	@FXML private TextField threeEight;
	// 4�s��
	@FXML private TextField fourZero;
	@FXML private TextField fourOne;
	@FXML private TextField fourTwo;
	@FXML private TextField fourThree;
	@FXML private TextField fourFour;
	@FXML private TextField fourFive;
	@FXML private TextField fourSix;
	@FXML private TextField fourSeven;
	@FXML private TextField fourEight;
	// 5�s��
	@FXML private TextField fiveZero;
	@FXML private TextField fiveOne;
	@FXML private TextField fiveTwo;
	@FXML private TextField fiveThree;
	@FXML private TextField fiveFour;
	@FXML private TextField fiveFive;
	@FXML private TextField fiveSix;
	@FXML private TextField fiveSeven;
	@FXML private TextField fiveEight;
	// 6�s��
	@FXML private TextField sixZero;
	@FXML private TextField sixOne;
	@FXML private TextField sixTwo;
	@FXML private TextField sixThree;
	@FXML private TextField sixFour;
	@FXML private TextField sixFive;
	@FXML private TextField sixSix;
	@FXML private TextField sixSeven;
	@FXML private TextField sixEight;
	// 7�s��
	@FXML private TextField sevenZero;
	@FXML private TextField sevenOne;
	@FXML private TextField sevenTwo;
	@FXML private TextField sevenThree;
	@FXML private TextField sevenFour;
	@FXML private TextField sevenFive;
	@FXML private TextField sevenSix;
	@FXML private TextField sevenSeven;
	@FXML private TextField sevenEight;
	// 8�s��
	@FXML private TextField eightZero;
	@FXML private TextField eightOne;
	@FXML private TextField eightTwo;
	@FXML private TextField eightThree;
	@FXML private TextField eightFour;
	@FXML private TextField eightFive;
	@FXML private TextField eightSix;
	@FXML private TextField eightSeven;
	@FXML private TextField eightEight;
	
	//getPromptText setPromptText  ����̋����������@
	
	
	@FXML protected void handleClicked00(MouseEvent event) {
		boardSearch();
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked01(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroOne.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroOne.setText(piece);
		}
	}
	@FXML protected void handleClicked02(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroTwo.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroTwo.setText(piece);
		}
	}
	@FXML protected void handleClicked03(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroThree.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroThree.setText(piece);
		}
	}
	@FXML protected void handleClicked04(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroFour.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroFour.setText(piece);
		}
	}
	@FXML protected void handleClicked05(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroFive.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroFive.setText(piece);
		}
	}
	@FXML protected void handleClicked06(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroSix.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroSix.setText(piece);
		}
	}
	@FXML protected void handleClicked07(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroSeven.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroSeven.setText(piece);
		}
	}
	@FXML protected void handleClicked08(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroEight.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroEight.setText(piece);
		}
	}
	@FXML protected void handleClicked10(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=oneZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			oneZero.setText(piece);
		}
	}
	@FXML protected void handleClicked11(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=oneOne.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			oneOne.setText(piece);
		}
	}
	@FXML protected void handleClicked12(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=oneTwo.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			oneTwo.setText(piece);
		}
	}
	@FXML protected void handleClicked13(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=oneThree.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			oneThree.setText(piece);
		}
	}
	@FXML protected void handleClicked14(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=oneFour.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			oneFour.setText(piece);
		}
	}
	@FXML protected void handleClicked15(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=oneFive.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			oneFive.setText(piece);
		}
	}
	@FXML protected void handleClicked16(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=oneSix.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			oneSix.setText(piece);
		}
	}
	@FXML protected void handleClicked17(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=oneSeven.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			oneSeven.setText(piece);
		}
	}
	@FXML protected void handleClicked18(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=oneEight.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			oneEight.setText(piece);
		}
	}
	@FXML protected void handleClicked20(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=twoZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			twoZero.setText(piece);
		}
	}
	@FXML protected void handleClicked21(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=twoOne.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			twoOne.setText(piece);
		}
	}
	@FXML protected void handleClicked22(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=twoTwo.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			twoTwo.setText(piece);
		}
	}
	@FXML protected void handleClicked23(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=twoThree.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			twoThree.setText(piece);
		}
	}
	@FXML protected void handleClicked24(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=twoFour.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			twoFour.setText(piece);
		}
	}
	@FXML protected void handleClicked25(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=twoFive.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			twoFive.setText(piece);
		}
	}
	@FXML protected void handleClicked26(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=twoSix.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			twoSix.setText(piece);
		}
	}
	@FXML protected void handleClicked27(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=twoSeven.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			twoSeven.setText(piece);
		}
	}
	@FXML protected void handleClicked28(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=twoEight.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			twoEight.setText(piece);
		}
	}
	@FXML protected void handleClicked30(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=threeZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			threeZero.setText(piece);
		}
	}
	@FXML protected void handleClicked31(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=threeOne.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			threeOne.setText(piece);
		}
	}
	@FXML protected void handleClicked32(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=threeTwo.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			threeTwo.setText(piece);
		}
	}
	@FXML protected void handleClicked33(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=threeThree.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			threeThree.setText(piece);
		}
	}
	@FXML protected void handleClicked34(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=threeFour.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			threeFour.setText(piece);
		}
	}
	@FXML protected void handleClicked35(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=threeFive.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			threeFive.setText(piece);
		}
	}
	@FXML protected void handleClicked36(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=threeSix.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			threeSix.setText(piece);
		}
	}
	@FXML protected void handleClicked37(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=threeSeven.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			threeSeven.setText(piece);
		}
	}
	@FXML protected void handleClicked38(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=threeEight.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			threeEight.setText(piece);
		}
	}
	@FXML protected void handleClicked40(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked41(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked42(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked43(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked44(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked45(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked46(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked47(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked48(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked50(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked51(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked52(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked53(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked54(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked55(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked56(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked57(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked58(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked60(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked61(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked62(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked63(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked64(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked65(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked66(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked67(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked68(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked70(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked71(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked72(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked73(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked74(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked75(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked76(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked77(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked78(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked80(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked81(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked82(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked83(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked84(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked85(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked86(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked87(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked88(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	
//===========================================================================================
	/*�Ֆʂ̏�Ԃ�T���@0:����@1�F�����̋��@2�F����̋��*/
	public void boardSearch() {
		//������
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				board[i][j]=0;
			}
		}
		
		if(!(zeroZero.getText().equals(""))){ board[0][0]=1; }
		else{ if(!(zeroZero.getPromptText().equals(""))) { board[0][0]=2; } }
		if(!(zeroOne.getText().equals(""))){ board[0][1]=1; }
		else{ if(!(zeroOne.getPromptText().equals(""))) { board[0][1]=2; } }
		if(!(zeroTwo.getText().equals(""))){ board[0][2]=1; }
		else{ if(!(zeroTwo.getPromptText().equals(""))) { board[0][2]=2; } }
		if(!(zeroThree.getText().equals(""))){ board[0][3]=1; }
		else{ if(!(zeroThree.getPromptText().equals(""))) { board[0][3]=2; } }
		if(!(zeroFour.getText().equals(""))){ board[0][4]=1; }
		else{ if(!(zeroFour.getPromptText().equals(""))) { board[0][4]=2; } }
		if(!(zeroFive.getText().equals(""))){ board[0][5]=1; }
		else{ if(!(zeroFive.getPromptText().equals(""))) { board[0][5]=2; } }
		if(!(zeroSix.getText().equals(""))){ board[0][6]=1; }
		else{ if(!(zeroSix.getPromptText().equals(""))) { board[0][6]=2; } }
		if(!(zeroSeven.getText().equals(""))){ board[0][7]=1; }
		else{ if(!(zeroSeven.getPromptText().equals(""))) { board[0][7]=2; } }
		if(!(zeroEight.getText().equals(""))){ board[0][8]=1; }
		else{ if(!(zeroEight.getPromptText().equals(""))) { board[0][8]=2; } }
		
		if(!(oneZero.getText().equals(""))){ board[1][0]=1; }
		else{ if(!(oneZero.getPromptText().equals(""))) { board[1][0]=2; } }
		if(!(oneOne.getText().equals(""))){ board[1][1]=1; }
		else{ if(!(oneOne.getPromptText().equals(""))) { board[1][1]=2; } }
		if(!(oneTwo.getText().equals(""))){ board[1][2]=1; }
		else{ if(!(oneTwo.getPromptText().equals(""))) { board[1][2]=2; } }
		if(!(oneThree.getText().equals(""))){ board[1][3]=1; }
		else{ if(!(oneThree.getPromptText().equals(""))) { board[1][3]=2; } }
		if(!(oneFour.getText().equals(""))){ board[1][4]=1; }
		else{ if(!(oneFour.getPromptText().equals(""))) { board[1][4]=2; } }
		if(!(oneFive.getText().equals(""))){ board[1][5]=1; }
		else{ if(!(oneFive.getPromptText().equals(""))) { board[1][5]=2; } }
		if(!(oneSix.getText().equals(""))){ board[1][6]=1; }
		else{ if(!(oneSix.getPromptText().equals(""))) { board[1][6]=2; } }
		if(!(oneSeven.getText().equals(""))){ board[1][7]=1; }
		else{ if(!(oneSeven.getPromptText().equals(""))) { board[1][7]=2; } }
		if(!(oneEight.getText().equals(""))){ board[1][8]=1; }
		else{ if(!(oneEight.getPromptText().equals(""))) { board[1][8]=2; } }
		
		if(!(twoZero.getText().equals(""))){ board[2][0]=1; }
		else{ if(!(twoZero.getPromptText().equals(""))) { board[2][0]=2; } }
		if(!(twoOne.getText().equals(""))){ board[2][1]=1; }
		else{ if(!(twoOne.getPromptText().equals(""))) { board[2][1]=2; } }
		if(!(twoTwo.getText().equals(""))){ board[2][2]=1; }
		else{ if(!(twoTwo.getPromptText().equals(""))) { board[2][2]=2; } }
		if(!(twoThree.getText().equals(""))){ board[2][3]=1; }
		else{ if(!(twoThree.getPromptText().equals(""))) { board[2][3]=2; } }
		if(!(twoFour.getText().equals(""))){ board[2][4]=1; }
		else{ if(!(twoFour.getPromptText().equals(""))) { board[2][4]=2; } }
		if(!(twoFive.getText().equals(""))){ board[2][5]=1; }
		else{ if(!(twoFive.getPromptText().equals(""))) { board[2][5]=2; } }
		if(!(twoSix.getText().equals(""))){ board[2][6]=1; }
		else{ if(!(twoSix.getPromptText().equals(""))) { board[2][6]=2; } }
		if(!(twoSeven.getText().equals(""))){ board[2][7]=1; }
		else{ if(!(twoSeven.getPromptText().equals(""))) { board[2][7]=2; } }
		if(!(twoEight.getText().equals(""))){ board[2][8]=1; }
		else{ if(!(twoEight.getPromptText().equals(""))) { board[2][8]=2; } }
		
		if(!(threeZero.getText().equals(""))){ board[3][0]=1; }
		else{ if(!(threeZero.getPromptText().equals(""))) { board[3][0]=2; } }
		if(!(threeOne.getText().equals(""))){ board[3][1]=1; }
		else{ if(!(threeOne.getPromptText().equals(""))) { board[3][1]=2; } }
		if(!(threeTwo.getText().equals(""))){ board[3][2]=1; }
		else{ if(!(threeTwo.getPromptText().equals(""))) { board[3][2]=2; } }
		if(!(threeThree.getText().equals(""))){ board[3][3]=1; }
		else{ if(!(threeThree.getPromptText().equals(""))) { board[3][3]=2; } }
		if(!(threeFour.getText().equals(""))){ board[3][4]=1; }
		else{ if(!(threeFour.getPromptText().equals(""))) { board[3][4]=2; } }
		if(!(threeFive.getText().equals(""))){ board[3][5]=1; }
		else{ if(!(threeFive.getPromptText().equals(""))) { board[3][5]=2; } }
		if(!(threeSix.getText().equals(""))){ board[3][6]=1; }
		else{ if(!(threeSix.getPromptText().equals(""))) { board[3][6]=2; } }
		if(!(threeSeven.getText().equals(""))){ board[3][7]=1; }
		else{ if(!(threeSeven.getPromptText().equals(""))) { board[3][7]=2; } }
		if(!(threeEight.getText().equals(""))){ board[3][8]=1; }
		else{ if(!(threeEight.getPromptText().equals(""))) { board[3][8]=2; } }
		
		if(!(fourZero.getText().equals(""))){ board[4][0]=1; }
		else{ if(!(fourZero.getPromptText().equals(""))) { board[4][0]=2; } }
		if(!(fourOne.getText().equals(""))){ board[4][1]=1; }
		else{ if(!(fourOne.getPromptText().equals(""))) { board[4][1]=2; } }
		if(!(fourTwo.getText().equals(""))){ board[4][2]=1; }
		else{ if(!(fourTwo.getPromptText().equals(""))) { board[4][2]=2; } }
		if(!(fourThree.getText().equals(""))){ board[4][3]=1; }
		else{ if(!(fourThree.getPromptText().equals(""))) { board[4][3]=2; } }
		if(!(fourFour.getText().equals(""))){ board[4][4]=1; }
		else{ if(!(fourFour.getPromptText().equals(""))) { board[4][4]=2; } }
		if(!(fourFive.getText().equals(""))){ board[4][5]=1; }
		else{ if(!(fourFive.getPromptText().equals(""))) { board[4][5]=2; } }
		if(!(fourSix.getText().equals(""))){ board[4][6]=1; }
		else{ if(!(fourSix.getPromptText().equals(""))) { board[4][6]=2; } }
		if(!(fourSeven.getText().equals(""))){ board[4][7]=1; }
		else{ if(!(fourSeven.getPromptText().equals(""))) { board[4][7]=2; } }
		if(!(fourEight.getText().equals(""))){ board[4][8]=1; }
		else{ if(!(fourEight.getPromptText().equals(""))) { board[4][8]=2; } }
		
		if(!(fiveZero.getText().equals(""))){ board[5][0]=1; }
		else{ if(!(fiveZero.getPromptText().equals(""))) { board[5][0]=2; } }
		if(!(fiveOne.getText().equals(""))){ board[5][1]=1; }
		else{ if(!(fiveOne.getPromptText().equals(""))) { board[5][1]=2; } }
		if(!(fiveTwo.getText().equals(""))){ board[5][2]=1; }
		else{ if(!(fiveTwo.getPromptText().equals(""))) { board[5][2]=2; } }
		if(!(fiveThree.getText().equals(""))){ board[5][3]=1; }
		else{ if(!(fiveThree.getPromptText().equals(""))) { board[5][3]=2; } }
		if(!(fiveFour.getText().equals(""))){ board[5][4]=1; }
		else{ if(!(fiveFour.getPromptText().equals(""))) { board[5][4]=2; } }
		if(!(fiveFive.getText().equals(""))){ board[5][5]=1; }
		else{ if(!(fiveFive.getPromptText().equals(""))) { board[5][5]=2; } }
		if(!(fiveSix.getText().equals(""))){ board[5][6]=1; }
		else{ if(!(fiveSix.getPromptText().equals(""))) { board[5][6]=2; } }
		if(!(fiveSeven.getText().equals(""))){ board[5][7]=1; }
		else{ if(!(fiveSeven.getPromptText().equals(""))) { board[5][7]=2; } }
		if(!(fiveEight.getText().equals(""))){ board[5][8]=1; }
		else{ if(!(fiveEight.getPromptText().equals(""))) { board[5][8]=2; } }
		
		if(!(sixZero.getText().equals(""))){ board[6][0]=1; }
		else{ if(!(sixZero.getPromptText().equals(""))) { board[6][0]=2; } }
		if(!(sixOne.getText().equals(""))){ board[6][1]=1; }
		else{ if(!(sixOne.getPromptText().equals(""))) { board[6][1]=2; } }
		if(!(sixTwo.getText().equals(""))){ board[6][2]=1; }
		else{ if(!(sixTwo.getPromptText().equals(""))) { board[6][2]=2; } }
		if(!(sixThree.getText().equals(""))){ board[6][3]=1; }
		else{ if(!(sixThree.getPromptText().equals(""))) { board[6][3]=2; } }
		if(!(sixFour.getText().equals(""))){ board[6][4]=1; }
		else{ if(!(sixFour.getPromptText().equals(""))) { board[6][4]=2; } }
		if(!(sixFive.getText().equals(""))){ board[6][5]=1; }
		else{ if(!(sixFive.getPromptText().equals(""))) { board[6][5]=2; } }
		if(!(sixSix.getText().equals(""))){ board[6][6]=1; }
		else{ if(!(sixSix.getPromptText().equals(""))) { board[6][6]=2; } }
		if(!(sixSeven.getText().equals(""))){ board[6][7]=1; }
		else{ if(!(sixSeven.getPromptText().equals(""))) { board[6][7]=2; } }
		if(!(sixEight.getText().equals(""))){ board[6][8]=1; }
		else{ if(!(sixEight.getPromptText().equals(""))) { board[6][8]=2; } }
		
		if(!(sevenZero.getText().equals(""))){ board[7][0]=1; }
		else{ if(!(sevenZero.getPromptText().equals(""))) { board[7][0]=2; } }
		if(!(sevenOne.getText().equals(""))){ board[7][1]=1; }
		else{ if(!(sevenOne.getPromptText().equals(""))) { board[7][1]=2; } }
		if(!(sevenTwo.getText().equals(""))){ board[7][2]=1; }
		else{ if(!(sevenTwo.getPromptText().equals(""))) { board[7][2]=2; } }
		if(!(sevenThree.getText().equals(""))){ board[7][3]=1; }
		else{ if(!(sevenThree.getPromptText().equals(""))) { board[7][3]=2; } }
		if(!(sevenFour.getText().equals(""))){ board[7][4]=1; }
		else{ if(!(sevenFour.getPromptText().equals(""))) { board[7][4]=2; } }
		if(!(sevenFive.getText().equals(""))){ board[7][5]=1; }
		else{ if(!(sevenFive.getPromptText().equals(""))) { board[7][5]=2; } }
		if(!(sevenSix.getText().equals(""))){ board[7][6]=1; }
		else{ if(!(sevenSix.getPromptText().equals(""))) { board[7][6]=2; } }
		if(!(sevenSeven.getText().equals(""))){ board[7][7]=1; }
		else{ if(!(sevenSeven.getPromptText().equals(""))) { board[7][7]=2; } }
		if(!(sevenEight.getText().equals(""))){ board[7][8]=1; }
		else{ if(!(sevenEight.getPromptText().equals(""))) { board[7][8]=2; } }
		
		if(!(eightZero.getText().equals(""))){ board[8][0]=1; }
		else{ if(!(eightZero.getPromptText().equals(""))) { board[8][0]=2; } }
		if(!(eightOne.getText().equals(""))){ board[8][1]=1; }
		else{ if(!(eightOne.getPromptText().equals(""))) { board[8][1]=2; } }
		if(!(eightTwo.getText().equals(""))){ board[8][2]=1; }
		else{ if(!(eightTwo.getPromptText().equals(""))) { board[8][2]=2; } }
		if(!(eightThree.getText().equals(""))){ board[8][3]=1; }
		else{ if(!(eightThree.getPromptText().equals(""))) { board[8][3]=2; } }
		if(!(eightFour.getText().equals(""))){ board[8][4]=1; }
		else{ if(!(eightFour.getPromptText().equals(""))) { board[8][4]=2; } }
		if(!(eightFive.getText().equals(""))){ board[8][5]=1; }
		else{ if(!(eightFive.getPromptText().equals(""))) { board[8][5]=2; } }
		if(!(eightSix.getText().equals(""))){ board[8][6]=1; }
		else{ if(!(eightSix.getPromptText().equals(""))) { board[8][6]=2; } }
		if(!(eightSeven.getText().equals(""))){ board[8][7]=1; }
		else{ if(!(eightSeven.getPromptText().equals(""))) { board[8][7]=2; } }
		if(!(eightEight.getText().equals(""))){ board[8][8]=1; }
		else{ if(!(eightEight.getPromptText().equals(""))) { board[8][8]=2; } }
		
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				System.out.print(board[i][j]);
			}
		}
	}
	
//======================================================================================
	/*���͂񂾎��ɒu����͈͂�T��*/
	public void canBePlaceSearch() {
		int x=pick[0];
		int y=pick[1];
		//������
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				canBePlace[i][j]=0;
			}
		}
		
		switch(piece) {
		case "��"://-------------------------------------------------------------------
			if(x>0 && board[x-1][y]!=1) {//1��
				canBePlace[x-1][y]=1;
			}
			break;
		case "��"://---------------------------------------------------------------
			for(int i=x-1;i>=0;i--) {//�����
				if(board[i][y]==1) {
					break;
				}
				canBePlace[i][y]=1;
				if(board[i][y]==2) {
					break;
				}
			}
			for(int i=x+1;i<9;i++) {//������
				if(board[i][y]==1) {
					break;
				}
				canBePlace[i][y]=1;
				if(board[i][y]==2) {
					break;
				}
			}
			for(int j=y-1;j>=0;j--) {//������
				if(board[x][j]==1) {
					break;
				}
				canBePlace[x][j]=1;
				if(board[x][j]==2) {
					break;
				}
			}
			for(int j=y+1;j<9;j++) {//�E����
				if(board[x][j]==1) {
					break;
				}
				canBePlace[x][j]=1;
				if(board[x][j]==2) {
					break;
				}
			}
			break;
		case "�p"://-----------------------------------------------------------------------
			for(int i=x-1,j=y-1;i>=0 && j>=0;i--,j--) {//����
				if(board[i][j]==1) {
					break;
				}
				canBePlace[i][j]=1;
				if(board[i][j]==2) {
					break;
				}
			}
			for(int i=x-1,j=y+1;i>=0 && j<9;i--,j++) {//�E��
				if(board[i][j]==1) {
					break;
				}
				canBePlace[i][j]=1;
				if(board[i][j]==2) {
					break;
				}
			}
			for(int i=x+1,j=y-1;i<9 && j>=0;i++,j--) {//����
				if(board[i][j]==1) {
					break;
				}
				canBePlace[i][j]=1;
				if(board[i][j]==2) {
					break;
				}
			}
			for(int i=x+1,j=y+1;i<9 && j<9;i++,j++) {//�E��
				if(board[i][j]==1) {
					break;
				}
				canBePlace[i][j]=1;
				if(board[i][j]==2) {
					break;
				}
			}
			break;
		case "��"://-------------------------------------------------------------------
			for(int i=x-1;i>=0;i--) {//�����
				if(board[i][y]==1) {
					break;
				}
				canBePlace[i][y]=1;
				if(board[i][y]==2) {
					break;
				}
			}
			break;
		case "�j"://------------------------------------------------------------------
			if(x>1) {
				if(y>0 && board[x-2][y-1]!=1) {//����
					canBePlace[x-2][y-1]=1;
				}
				if(y<8 && board[x-2][y+1]!=1) {//�E��
					canBePlace[x-2][y+1]=1;
				}
			}
			break;
		case "��"://-------------------------------------------------------------------
			if(x>0) {
				if(y>0 && board[x-1][y-1]!=1) {//����
					canBePlace[x-1][y-1]=1;
				}
				if(board[x-1][y]!=1) {//��
					canBePlace[x-1][y]=1;
				}
				if(y<8 && board[x-1][y+1]!=1) {//�E��
					canBePlace[x-1][y+1]=1;
				}
			}
			if(x<8) {
				if(y>0 && board[x+1][y-1]!=1) {//����
					canBePlace[x+1][y-1]=1;
				}
				if(y<8 && board[x+1][y+1]!=1) {//�E��
					canBePlace[x+1][y+1]=1;
				}
			}
			break;
		case "��"://--------------------------------------------------------------------
		case "��":
		case "����":
		case "���j":
		case "����":
			if(x>0) {
				if(y>0 && board[x-1][y-1]!=1) {//����
					canBePlace[x-1][y-1]=1;
				}
				if(board[x-1][y]!=1) {//��
					canBePlace[x-1][y]=1;
				}
				if(y<8 && board[x-1][y+1]!=1) {//�E��
					canBePlace[x-1][y+1]=1;
				}
			}
			if(y>0) {
				if(board[x][y-1]!=1) {//��
					canBePlace[x][y-1]=1;
				}
			}
			if(y<8) {
				if(board[x][y+1]!=1) {//�E
					canBePlace[x][y+1]=1;
				}
			}
			if(x<8) {
				if(board[x+1][y]!=1) {//��
					canBePlace[x+1][y]=1;
				}
			}
			break;
		case "��"://------------------------------------------------------------------
		case "��":
			if(x>0) {
				if(y>0 && board[x-1][y-1]!=1) {//����
					canBePlace[x-1][y-1]=1;
				}
				if(board[x-1][y]!=1) {//��
					canBePlace[x-1][y]=1;
				}
				if(y<8 && board[x-1][y+1]!=1) {//�E��
					canBePlace[x-1][y+1]=1;
				}
			}
			if(y>0) {
				if(board[x][y-1]!=1) {//��
					canBePlace[x][y-1]=1;
				}
			}
			if(y<8) {
				if(board[x][y+1]!=1) {//�E
					canBePlace[x][y+1]=1;
				}
			}
			if(x<8) {
				if(y>0 && board[x+1][y-1]!=1) {//����
					canBePlace[x+1][y-1]=1;
				}
				if(board[x+1][y]!=1) {//��
					canBePlace[x+1][y]=1;
				}
				if(y<8 && board[x+1][y+1]!=1) {//�E��
					canBePlace[x+1][y+1]=1;
				}
			}
			break;
		case "����"://--------------------------------------------------------------
			for(int i=x-1;i>=0;i--) {//�����
				if(board[i][y]==1) {
					break;
				}
				canBePlace[i][y]=1;
				if(board[i][y]==2) {
					break;
				}
			}
			for(int i=x+1;i<9;i++) {//������
				if(board[i][y]==1) {
					break;
				}
				canBePlace[i][y]=1;
				if(board[i][y]==2) {
					break;
				}
			}
			for(int j=y-1;j>=0;j--) {//������
				if(board[x][j]==1) {
					break;
				}
				canBePlace[x][j]=1;
				if(board[x][j]==2) {
					break;
				}
			}
			for(int j=y+1;j<9;j++) {//�E����
				if(board[x][j]==1) {
					break;
				}
				canBePlace[x][j]=1;
				if(board[x][j]==2) {
					break;
				}
			}
			if(x>0) {
				if(y>0 && board[x-1][y-1]!=1) {//����
					canBePlace[x-1][y-1]=1;
				}
				if(y<8 && board[x-1][y+1]!=1) {//�E��
					canBePlace[x-1][y+1]=1;
				}
			}
			if(x<8) {
				if(y>0 && board[x+1][y-1]!=1) {//����
					canBePlace[x+1][y-1]=1;
				}
				if(y<8 && board[x+1][y+1]!=1) {//�E��
					canBePlace[x+1][y+1]=1;
				}
			}
			break;
		case "���n"://--------------------------------------------------------------
			for(int i=x-1,j=y-1;i>=0 && j>=0;i--,j--) {//����
				if(board[i][j]==1) {
					break;
				}
				canBePlace[i][j]=1;
				if(board[i][j]==2) {
					break;
				}
			}
			for(int i=x-1,j=y+1;i>=0 && j<9;i--,j++) {//�E��
				if(board[i][j]==1) {
					break;
				}
				canBePlace[i][j]=1;
				if(board[i][j]==2) {
					break;
				}
			}
			for(int i=x+1,j=y-1;i<9 && j>=0;i++,j--) {//����
				if(board[i][j]==1) {
					break;
				}
				canBePlace[i][j]=1;
				if(board[i][j]==2) {
					break;
				}
			}
			for(int i=x+1,j=y+1;i<9 && j<9;i++,j++) {//�E��
				if(board[i][j]==1) {
					break;
				}
				canBePlace[i][j]=1;
				if(board[i][j]==2) {
					break;
				}
			}
			if(x>0) {
				if(board[x-1][y]!=1) {//��
					canBePlace[x-1][y]=1;
				}
			}
			if(y>0) {
				if(board[x][y-1]!=1) {//��
					canBePlace[x][y-1]=1;
				}
			}
			if(y<8) {
				if(board[x][y+1]!=1) {//��
					canBePlace[x][y+1]=1;
				}
			}
			if(x<8) {
				if(board[x+1][y]!=1) {//��
					canBePlace[x+1][y]=1;
				}
			}
			break;
		default://--------------------------------------------------------------
			break;
		}
	}
	
	
//=============================================================================================	
	int clickNum=0; //�N���b�N�� (%2 = {0:�͂�,1:�u��})
	String piece=""; //�͂�ł����
	int[][] canBePlace=new int[9][9];  //[x][y] �u����ꏊ��1,�u���Ȃ��ꏊ��0
	int[] pick=new int[2];        //�͂񂾋�������ꏊ[x,y]
	int[] put=new int[2];         //�u���ꏊ[x,y]
	
	int[][] board=new int[9][9];  //�Ֆʁ@��Ȃ��F0  ����F1  �G��F2
	
}
