package application;


import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

public class shogiController {
	//　0行目
	@FXML protected TextField zeroZero;
	@FXML protected TextField zeroOne;
	@FXML protected TextField zeroTwo;
	@FXML protected TextField zeroThree;
	@FXML protected TextField zeroFour;
	@FXML protected TextField zeroFive;
	@FXML protected TextField zeroSix;
	@FXML protected TextField zeroSeven;
	@FXML protected TextField zeroEight;
	// 1行目
	@FXML protected TextField oneZero;
	@FXML protected TextField oneOne;
	@FXML protected TextField oneTwo;
	@FXML protected TextField oneThree;
	@FXML protected TextField oneFour;
	@FXML protected TextField oneFive;
	@FXML protected TextField oneSix;
	@FXML protected TextField oneSeven;
	@FXML protected TextField oneEight;
	// 2行目
	@FXML protected TextField twoZero;
	@FXML protected TextField twoOne;
	@FXML protected TextField twoTwo;
	@FXML protected TextField twoThree;
	@FXML protected TextField twoFour;
	@FXML protected TextField twoFive;
	@FXML protected TextField twoSix;
	@FXML protected TextField twoSeven;
	@FXML protected TextField twoEight;
	// 3行目
	@FXML protected TextField threeZero;
	@FXML protected TextField threeOne;
	@FXML protected TextField threeTwo;
	@FXML protected TextField threeThree;
	@FXML protected TextField threeFour;
	@FXML protected TextField threeFive;
	@FXML protected TextField threeSix;
	@FXML protected TextField threeSeven;
	@FXML protected TextField threeEight;
	// 4行目
	@FXML protected TextField fourZero;
	@FXML protected TextField fourOne;
	@FXML protected TextField fourTwo;
	@FXML protected TextField fourThree;
	@FXML protected TextField fourFour;
	@FXML protected TextField fourFive;
	@FXML protected TextField fourSix;
	@FXML protected TextField fourSeven;
	@FXML protected TextField fourEight;
	// 5行目
	@FXML protected TextField fiveZero;
	@FXML protected TextField fiveOne;
	@FXML protected TextField fiveTwo;
	@FXML protected TextField fiveThree;
	@FXML protected TextField fiveFour;
	@FXML protected TextField fiveFive;
	@FXML protected TextField fiveSix;
	@FXML protected TextField fiveSeven;
	@FXML protected TextField fiveEight;
	// 6行目
	@FXML protected TextField sixZero;
	@FXML protected TextField sixOne;
	@FXML protected TextField sixTwo;
	@FXML protected TextField sixThree;
	@FXML protected TextField sixFour;
	@FXML protected TextField sixFive;
	@FXML protected TextField sixSix;
	@FXML protected TextField sixSeven;
	@FXML protected TextField sixEight;
	// 7行目
	@FXML protected TextField sevenZero;
	@FXML protected TextField sevenOne;
	@FXML protected TextField sevenTwo;
	@FXML protected TextField sevenThree;
	@FXML protected TextField sevenFour;
	@FXML protected TextField sevenFive;
	@FXML protected TextField sevenSix;
	@FXML protected TextField sevenSeven;
	@FXML protected TextField sevenEight;
	// 8行目
	@FXML protected TextField eightZero;
	@FXML protected TextField eightOne;
	@FXML protected TextField eightTwo;
	@FXML protected TextField eightThree;
	@FXML protected TextField eightFour;
	@FXML protected TextField eightFive;
	@FXML protected TextField eightSix;
	@FXML protected TextField eightSeven;
	@FXML protected TextField eightEight;
	
	@FXML protected Button buttonConnect;
	@FXML protected Label selectedPiece;
	@FXML protected Label enemy0;
	@FXML protected Label enemy1;
	@FXML protected Label enemy2;
	@FXML protected Label enemy3;
	@FXML protected Label enemy4;
	@FXML protected Label enemy5;
	@FXML protected Label enemy6;
	@FXML protected Label enemy7;
	@FXML protected Label my0;
	@FXML protected Label my1;
	@FXML protected Label my2;
	@FXML protected Label my3;
	@FXML protected Label my4;
	@FXML protected Label my5;
	@FXML protected Label my6;
	@FXML protected Label my7;
	//getPromptText setPromptText  相手の駒をいじる方法
	
//================================================================================================
	/*テキストフィールドをクリックしたときの動作*/
	public void handleClicked(TextField tf,int x,int y) {
		if(clickNum==0) { //駒をつかむ (get)
			pick[0]=x;
			pick[1]=y;
			if(board[x][y]==1) {
				piece=tf.getText();
				tf.setText("");
				selectedPiece.setText(piece);
				board[x][y]=0;
				clickNum=1;
				canBePlaceSearch();
			}
		}
		else {              //駒を置く (set)
			put[0]=x;
			put[1]=y;
			if(canBePlace[x][y]==1) {
				if(board[x][y]==2) {
					countPiece(tf.getPromptText());
					tf.setPromptText("");
				}
				tf.setText(piece);
				selectedPiece.setText("");
				board[x][y]=1;
				clickNum=0;
			}
		}
	}
	
//=================================================================================================	
	@FXML protected void handleClicked00(MouseEvent event) {
		handleClicked(zeroZero,0,0);
	}
	@FXML protected void handleClicked01(MouseEvent event) {
		handleClicked(zeroOne,0,1);
	}
	@FXML protected void handleClicked02(MouseEvent event) {
		handleClicked(zeroTwo,0,2);
	}
	@FXML protected void handleClicked03(MouseEvent event) {
		handleClicked(zeroThree,0,3);
	}
	@FXML protected void handleClicked04(MouseEvent event) {
		handleClicked(zeroFour,0,4);
	}
	@FXML protected void handleClicked05(MouseEvent event) {
		handleClicked(zeroFive,0,5);
	}
	@FXML protected void handleClicked06(MouseEvent event) {
		handleClicked(zeroSix,0,6);
	}
	@FXML protected void handleClicked07(MouseEvent event) {
		handleClicked(zeroSeven,0,7);
	}
	@FXML protected void handleClicked08(MouseEvent event) {
		handleClicked(zeroEight,0,8);
	}
//---------------------------------------------------------------------------------------------------
	@FXML protected void handleClicked10(MouseEvent event) {
		handleClicked(oneZero,1,0);
	}
	@FXML protected void handleClicked11(MouseEvent event) {
		handleClicked(oneOne,1,1);
	}
	@FXML protected void handleClicked12(MouseEvent event) {
		handleClicked(oneTwo,1,2);
	}
	@FXML protected void handleClicked13(MouseEvent event) {
		handleClicked(oneThree,1,3);
	}
	@FXML protected void handleClicked14(MouseEvent event) {
		handleClicked(oneFour,1,4);
	}
	@FXML protected void handleClicked15(MouseEvent event) {
		handleClicked(oneFive,1,5);
	}
	@FXML protected void handleClicked16(MouseEvent event) {
		handleClicked(oneSix,1,6);
	}
	@FXML protected void handleClicked17(MouseEvent event) {
		handleClicked(oneSeven,1,7);
	}
	@FXML protected void handleClicked18(MouseEvent event) {
		handleClicked(oneEight,1,8);
	}
//---------------------------------------------------------------------------------------------------
	@FXML protected void handleClicked20(MouseEvent event) {
		handleClicked(twoZero,2,0);
	}
	@FXML protected void handleClicked21(MouseEvent event) {
		handleClicked(twoOne,2,1);
	}
	@FXML protected void handleClicked22(MouseEvent event) {
		handleClicked(twoTwo,2,2);
	}
	@FXML protected void handleClicked23(MouseEvent event) {
		handleClicked(twoThree,2,3);
	}
	@FXML protected void handleClicked24(MouseEvent event) {
		handleClicked(twoFour,2,4);
	}
	@FXML protected void handleClicked25(MouseEvent event) {
		handleClicked(twoFive,2,5);
	}
	@FXML protected void handleClicked26(MouseEvent event) {
		handleClicked(twoSix,2,6);
	}
	@FXML protected void handleClicked27(MouseEvent event) {
		handleClicked(twoSeven,2,7);
	}
	@FXML protected void handleClicked28(MouseEvent event) {
		handleClicked(twoEight,2,8);
	}
//---------------------------------------------------------------------------------------------------
	@FXML protected void handleClicked30(MouseEvent event) {
		handleClicked(threeZero,3,0);
	}
	@FXML protected void handleClicked31(MouseEvent event) {
		handleClicked(threeOne,3,1);
	}
	@FXML protected void handleClicked32(MouseEvent event) {
		handleClicked(threeTwo,3,2);
	}
	@FXML protected void handleClicked33(MouseEvent event) {
		handleClicked(threeThree,3,3);
	}
	@FXML protected void handleClicked34(MouseEvent event) {
		handleClicked(threeFour,3,4);
	}
	@FXML protected void handleClicked35(MouseEvent event) {
		handleClicked(threeFive,3,5);
	}
	@FXML protected void handleClicked36(MouseEvent event) {
		handleClicked(threeSix,3,6);
	}
	@FXML protected void handleClicked37(MouseEvent event) {
		handleClicked(threeSeven,3,7);
	}
	@FXML protected void handleClicked38(MouseEvent event) {
		handleClicked(threeEight,3,8);
	}
//---------------------------------------------------------------------------------------------------
	@FXML protected void handleClicked40(MouseEvent event) {
		handleClicked(fourZero,4,0);
	}
	@FXML protected void handleClicked41(MouseEvent event) {
		handleClicked(fourOne,4,1);
	}
	@FXML protected void handleClicked42(MouseEvent event) {
		handleClicked(fourTwo,4,2);
	}
	@FXML protected void handleClicked43(MouseEvent event) {
		handleClicked(fourThree,4,3);
	}
	@FXML protected void handleClicked44(MouseEvent event) {
		handleClicked(fourFour,4,4);
	}
	@FXML protected void handleClicked45(MouseEvent event) {
		handleClicked(fourFive,4,5);
	}
	@FXML protected void handleClicked46(MouseEvent event) {
		handleClicked(fourSix,4,6);
	}
	@FXML protected void handleClicked47(MouseEvent event) {
		handleClicked(fourSeven,4,7);
	}
	@FXML protected void handleClicked48(MouseEvent event) {
		handleClicked(fourEight,4,8);
	}
//---------------------------------------------------------------------------------------------------
	@FXML protected void handleClicked50(MouseEvent event) {
		handleClicked(fiveZero,5,0);
	}
	@FXML protected void handleClicked51(MouseEvent event) {
		handleClicked(fiveOne,5,1);
	}
	@FXML protected void handleClicked52(MouseEvent event) {
		handleClicked(fiveTwo,5,2);
	}
	@FXML protected void handleClicked53(MouseEvent event) {
		handleClicked(fiveThree,5,3);
	}
	@FXML protected void handleClicked54(MouseEvent event) {
		handleClicked(fiveFour,5,4);
	}
	@FXML protected void handleClicked55(MouseEvent event) {
		handleClicked(fiveFive,5,5);
	}
	@FXML protected void handleClicked56(MouseEvent event) {
		handleClicked(fiveSix,5,6);
	}
	@FXML protected void handleClicked57(MouseEvent event) {
		handleClicked(fiveSeven,5,7);
	}
	@FXML protected void handleClicked58(MouseEvent event) {
		handleClicked(fiveEight,5,8);
	}
//---------------------------------------------------------------------------------------------------
	@FXML protected void handleClicked60(MouseEvent event) {
		handleClicked(sixZero,6,0);
	}
	@FXML protected void handleClicked61(MouseEvent event) {
		handleClicked(sixOne,6,1);
	}
	@FXML protected void handleClicked62(MouseEvent event) {
		handleClicked(sixTwo,6,2);
	}
	@FXML protected void handleClicked63(MouseEvent event) {
		handleClicked(sixThree,6,3);
	}
	@FXML protected void handleClicked64(MouseEvent event) {
		handleClicked(sixFour,6,4);
	}
	@FXML protected void handleClicked65(MouseEvent event) {
		handleClicked(sixFive,6,5);
	}
	@FXML protected void handleClicked66(MouseEvent event) {
		handleClicked(sixSix,6,6);
	}
	@FXML protected void handleClicked67(MouseEvent event) {
		handleClicked(sixSeven,6,7);
	}
	@FXML protected void handleClicked68(MouseEvent event) {
		handleClicked(sixEight,6,8);
	}
//---------------------------------------------------------------------------------------------------
	@FXML protected void handleClicked70(MouseEvent event) {
		handleClicked(sevenZero,7,0);
	}
	@FXML protected void handleClicked71(MouseEvent event) {
		handleClicked(sevenOne,7,1);
	}
	@FXML protected void handleClicked72(MouseEvent event) {
		handleClicked(sevenTwo,7,2);
	}
	@FXML protected void handleClicked73(MouseEvent event) {
		handleClicked(sevenThree,7,3);
	}
	@FXML protected void handleClicked74(MouseEvent event) {
		handleClicked(sevenFour,7,4);
	}
	@FXML protected void handleClicked75(MouseEvent event) {
		handleClicked(sevenFive,7,5);
	}
	@FXML protected void handleClicked76(MouseEvent event) {
		handleClicked(sevenSix,7,6);
	}
	@FXML protected void handleClicked77(MouseEvent event) {
		handleClicked(sevenSeven,7,7);
	}
	@FXML protected void handleClicked78(MouseEvent event) {
		handleClicked(sevenEight,7,8);
	}
//---------------------------------------------------------------------------------------------------
	@FXML protected void handleClicked80(MouseEvent event) {
		handleClicked(eightZero,8,0);
	}
	@FXML protected void handleClicked81(MouseEvent event) {
		handleClicked(eightOne,8,1);
	}
	@FXML protected void handleClicked82(MouseEvent event) {
		handleClicked(eightTwo,8,2);
	}
	@FXML protected void handleClicked83(MouseEvent event) {
		handleClicked(eightThree,8,3);
	}
	@FXML protected void handleClicked84(MouseEvent event) {
		handleClicked(eightFour,8,4);
	}
	@FXML protected void handleClicked85(MouseEvent event) {
		handleClicked(eightFive,8,5);
	}
	@FXML protected void handleClicked86(MouseEvent event) {
		handleClicked(eightSix,8,6);
	}
	@FXML protected void handleClicked87(MouseEvent event) {
		handleClicked(eightSeven,8,7);
	}
	@FXML protected void handleClicked88(MouseEvent event) {
		handleClicked(eightEight,8,8);
	}
	
//==========================================================================================
	@FXML protected void handleButtonConnect() {
		boardSearch();
	}
//===========================================================================================
	/*盤面の状態を探索　0:駒無し　1：自分の駒あり　2：相手の駒あり*/
	public void boardSearch() {
		//初期化
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				board[i][j]=0;
			}
		}
		
		if(!(zeroZero.getText().equals(""))){ board[0][0]=1; }
		else{ if(!(zeroZero.getPromptText().equals(""))) { board[0][0]=2; } }
		if(!(this.zeroOne.getText().equals(""))){ board[0][1]=1; }
		else{ if(!(this.zeroOne.getPromptText().equals(""))) { board[0][1]=2; } }
		if(!(this.zeroTwo.getText().equals(""))){ board[0][2]=1; }
		else{ if(!(this.zeroTwo.getPromptText().equals(""))) { board[0][2]=2; } }
		if(!(this.zeroThree.getText().equals(""))){ board[0][3]=1; }
		else{ if(!(this.zeroThree.getPromptText().equals(""))) { board[0][3]=2; } }
		if(!(this.zeroFour.getText().equals(""))){ board[0][4]=1; }
		else{ if(!(this.zeroFour.getPromptText().equals(""))) { board[0][4]=2; } }
		if(!(this.zeroFive.getText().equals(""))){ board[0][5]=1; }
		else{ if(!(this.zeroFive.getPromptText().equals(""))) { board[0][5]=2; } }
		if(!(this.zeroSix.getText().equals(""))){ board[0][6]=1; }
		else{ if(!(this.zeroSix.getPromptText().equals(""))) { board[0][6]=2; } }
		if(!(this.zeroSeven.getText().equals(""))){ board[0][7]=1; }
		else{ if(!(this.zeroSeven.getPromptText().equals(""))) { board[0][7]=2; } }
		if(!(this.zeroEight.getText().equals(""))){ board[0][8]=1; }
		else{ if(!(this.zeroEight.getPromptText().equals(""))) { board[0][8]=2; } }
		
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
	/*駒を掴んだ時に置ける範囲を探索*/
	public void canBePlaceSearch() {
		int x=pick[0];
		int y=pick[1];
		//初期化
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				canBePlace[i][j]=0;
			}
		}
		
		switch(piece) {
		case "歩"://-------------------------------------------------------------------
			if(x>0 && board[x-1][y]!=1) {//1つ上
				canBePlace[x-1][y]=1;
			}
			break;
		case "飛"://---------------------------------------------------------------
			for(int i=x-1;i>=0;i--) {//上方向
				if(board[i][y]==1) {
					break;
				}
				canBePlace[i][y]=1;
				if(board[i][y]==2) {
					break;
				}
			}
			for(int i=x+1;i<9;i++) {//下方向
				if(board[i][y]==1) {
					break;
				}
				canBePlace[i][y]=1;
				if(board[i][y]==2) {
					break;
				}
			}
			for(int j=y-1;j>=0;j--) {//左方向
				if(board[x][j]==1) {
					break;
				}
				canBePlace[x][j]=1;
				if(board[x][j]==2) {
					break;
				}
			}
			for(int j=y+1;j<9;j++) {//右方向
				if(board[x][j]==1) {
					break;
				}
				canBePlace[x][j]=1;
				if(board[x][j]==2) {
					break;
				}
			}
			break;
		case "角"://-----------------------------------------------------------------------
			for(int i=x-1,j=y-1;i>=0 && j>=0;i--,j--) {//左上
				if(board[i][j]==1) {
					break;
				}
				canBePlace[i][j]=1;
				if(board[i][j]==2) {
					break;
				}
			}
			for(int i=x-1,j=y+1;i>=0 && j<9;i--,j++) {//右上
				if(board[i][j]==1) {
					break;
				}
				canBePlace[i][j]=1;
				if(board[i][j]==2) {
					break;
				}
			}
			for(int i=x+1,j=y-1;i<9 && j>=0;i++,j--) {//左下
				if(board[i][j]==1) {
					break;
				}
				canBePlace[i][j]=1;
				if(board[i][j]==2) {
					break;
				}
			}
			for(int i=x+1,j=y+1;i<9 && j<9;i++,j++) {//右下
				if(board[i][j]==1) {
					break;
				}
				canBePlace[i][j]=1;
				if(board[i][j]==2) {
					break;
				}
			}
			break;
		case "香"://-------------------------------------------------------------------
			for(int i=x-1;i>=0;i--) {//上方向
				if(board[i][y]==1) {
					break;
				}
				canBePlace[i][y]=1;
				if(board[i][y]==2) {
					break;
				}
			}
			break;
		case "桂"://------------------------------------------------------------------
			if(x>1) {
				if(y>0 && board[x-2][y-1]!=1) {//左上
					canBePlace[x-2][y-1]=1;
				}
				if(y<8 && board[x-2][y+1]!=1) {//右上
					canBePlace[x-2][y+1]=1;
				}
			}
			break;
		case "銀"://-------------------------------------------------------------------
			if(x>0) {
				if(y>0 && board[x-1][y-1]!=1) {//左上
					canBePlace[x-1][y-1]=1;
				}
				if(board[x-1][y]!=1) {//上
					canBePlace[x-1][y]=1;
				}
				if(y<8 && board[x-1][y+1]!=1) {//右上
					canBePlace[x-1][y+1]=1;
				}
			}
			if(x<8) {
				if(y>0 && board[x+1][y-1]!=1) {//左下
					canBePlace[x+1][y-1]=1;
				}
				if(y<8 && board[x+1][y+1]!=1) {//右下
					canBePlace[x+1][y+1]=1;
				}
			}
			break;
		case "金"://--------------------------------------------------------------------
		case "と":
		case "成香":
		case "成桂":
		case "成銀":
			if(x>0) {
				if(y>0 && board[x-1][y-1]!=1) {//左上
					canBePlace[x-1][y-1]=1;
				}
				if(board[x-1][y]!=1) {//上
					canBePlace[x-1][y]=1;
				}
				if(y<8 && board[x-1][y+1]!=1) {//右上
					canBePlace[x-1][y+1]=1;
				}
			}
			if(y>0) {
				if(board[x][y-1]!=1) {//左
					canBePlace[x][y-1]=1;
				}
			}
			if(y<8) {
				if(board[x][y+1]!=1) {//右
					canBePlace[x][y+1]=1;
				}
			}
			if(x<8) {
				if(board[x+1][y]!=1) {//下
					canBePlace[x+1][y]=1;
				}
			}
			break;
		case "王"://------------------------------------------------------------------
		case "玉":
			if(x>0) {
				if(y>0 && board[x-1][y-1]!=1) {//左上
					canBePlace[x-1][y-1]=1;
				}
				if(board[x-1][y]!=1) {//上
					canBePlace[x-1][y]=1;
				}
				if(y<8 && board[x-1][y+1]!=1) {//右上
					canBePlace[x-1][y+1]=1;
				}
			}
			if(y>0) {
				if(board[x][y-1]!=1) {//左
					canBePlace[x][y-1]=1;
				}
			}
			if(y<8) {
				if(board[x][y+1]!=1) {//右
					canBePlace[x][y+1]=1;
				}
			}
			if(x<8) {
				if(y>0 && board[x+1][y-1]!=1) {//左下
					canBePlace[x+1][y-1]=1;
				}
				if(board[x+1][y]!=1) {//下
					canBePlace[x+1][y]=1;
				}
				if(y<8 && board[x+1][y+1]!=1) {//右下
					canBePlace[x+1][y+1]=1;
				}
			}
			break;
		case "龍王"://--------------------------------------------------------------
			for(int i=x-1;i>=0;i--) {//上方向
				if(board[i][y]==1) {
					break;
				}
				canBePlace[i][y]=1;
				if(board[i][y]==2) {
					break;
				}
			}
			for(int i=x+1;i<9;i++) {//下方向
				if(board[i][y]==1) {
					break;
				}
				canBePlace[i][y]=1;
				if(board[i][y]==2) {
					break;
				}
			}
			for(int j=y-1;j>=0;j--) {//左方向
				if(board[x][j]==1) {
					break;
				}
				canBePlace[x][j]=1;
				if(board[x][j]==2) {
					break;
				}
			}
			for(int j=y+1;j<9;j++) {//右方向
				if(board[x][j]==1) {
					break;
				}
				canBePlace[x][j]=1;
				if(board[x][j]==2) {
					break;
				}
			}
			if(x>0) {
				if(y>0 && board[x-1][y-1]!=1) {//左上
					canBePlace[x-1][y-1]=1;
				}
				if(y<8 && board[x-1][y+1]!=1) {//右上
					canBePlace[x-1][y+1]=1;
				}
			}
			if(x<8) {
				if(y>0 && board[x+1][y-1]!=1) {//左下
					canBePlace[x+1][y-1]=1;
				}
				if(y<8 && board[x+1][y+1]!=1) {//右下
					canBePlace[x+1][y+1]=1;
				}
			}
			break;
		case "龍馬"://--------------------------------------------------------------
			for(int i=x-1,j=y-1;i>=0 && j>=0;i--,j--) {//左上
				if(board[i][j]==1) {
					break;
				}
				canBePlace[i][j]=1;
				if(board[i][j]==2) {
					break;
				}
			}
			for(int i=x-1,j=y+1;i>=0 && j<9;i--,j++) {//右上
				if(board[i][j]==1) {
					break;
				}
				canBePlace[i][j]=1;
				if(board[i][j]==2) {
					break;
				}
			}
			for(int i=x+1,j=y-1;i<9 && j>=0;i++,j--) {//左下
				if(board[i][j]==1) {
					break;
				}
				canBePlace[i][j]=1;
				if(board[i][j]==2) {
					break;
				}
			}
			for(int i=x+1,j=y+1;i<9 && j<9;i++,j++) {//右下
				if(board[i][j]==1) {
					break;
				}
				canBePlace[i][j]=1;
				if(board[i][j]==2) {
					break;
				}
			}
			if(x>0) {
				if(board[x-1][y]!=1) {//上
					canBePlace[x-1][y]=1;
				}
			}
			if(y>0) {
				if(board[x][y-1]!=1) {//上
					canBePlace[x][y-1]=1;
				}
			}
			if(y<8) {
				if(board[x][y+1]!=1) {//上
					canBePlace[x][y+1]=1;
				}
			}
			if(x<8) {
				if(board[x+1][y]!=1) {//下
					canBePlace[x+1][y]=1;
				}
			}
			break;
		default://--------------------------------------------------------------
			break;
		}
	}
//==============================================================================================
	/*敵コマを倒したときに持ち駒を更新*/
	public void countPiece(String pieceName) {
		switch(pieceName) {
		case "歩":
		case "と":
			havePiece[0][0]+=1;
			my0.setText(Integer.valueOf(havePiece[0][0]).toString());
			break;
		case "角":
		case "龍馬":
			havePiece[0][1]+=1;
			my1.setText(Integer.valueOf(havePiece[0][1]).toString());
			break;
		case "飛":
		case "龍王":
			havePiece[0][2]+=1;
			my2.setText(Integer.valueOf(havePiece[0][2]).toString());
			break;
		case "香":
		case "成香":
			havePiece[0][3]+=1;
			my3.setText(Integer.valueOf(havePiece[0][3]).toString());
			break;
		case "桂":
		case "成桂":
			havePiece[0][4]+=1;
			my4.setText(Integer.valueOf(havePiece[0][4]).toString());
			break;
		case "銀":
		case "成銀":
			havePiece[0][5]+=1;
			my5.setText(Integer.valueOf(havePiece[0][5]).toString());
			break;
		case "金":
			havePiece[0][6]+=1;
			my6.setText(Integer.valueOf(havePiece[0][6]).toString());
			break;
		case "王":
		case "玉":
			havePiece[0][7]+=1;
			my7.setText(Integer.valueOf(havePiece[0][7]).toString());
			break;
		default:
			break;
		}
	}
//=============================================================================================	
	int clickNum=0; //クリック回数 (%2 = {0:掴む,1:置く})
	String piece=""; //掴んでいる駒
	int[][] canBePlace=new int[9][9];  //[x][y] 置ける場所は1,置けない場所は0
	int[] pick=new int[2];        //掴んだ駒があった場所[x,y]
	int[] put=new int[2];         //置く場所[x,y]
	
	int[][] board=new int[9][9];  //盤面　駒がない：0  自駒：1  敵駒：2
	int[][] havePiece= {{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0}};  //持ち駒　[0][]:自分の駒  [1][]:相手の駒
	
}
