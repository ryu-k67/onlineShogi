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
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked31(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked32(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked33(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked34(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked35(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked36(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked37(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
		}
	}
	@FXML protected void handleClicked38(MouseEvent event) {
		clickNum++;
		if(clickNum%2==0) { //������� (get)
			piece=zeroZero.getText();
			System.out.println(piece);
		}
		else {              //���u�� (set)
			zeroZero.setText(piece);
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
	
	int clickNum=-1; //�N���b�N�� (%2 = {0:�͂�,1:�u��})
	String piece=""; //�͂�ł����
	
}
