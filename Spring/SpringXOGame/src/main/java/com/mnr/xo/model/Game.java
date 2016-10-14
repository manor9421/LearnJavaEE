package com.mnr.xo.model;

import com.mnr.xo.interfaces.XOGameField;
import com.mnr.xo.interfaces.XOGameModel;

public class Game implements XOGameModel{

	private XOGameField[][] fieldArray;
	
	public Game(){
		/*for(int i=0;i<fieldArray.length;i++){
			for(int j=0;j<fieldArray[i].length;j++){
				fieldArray[i][j] = new Field(PlayerSymbol.EMPTY);
			}
		}
		*/
	}
	
	

	public Game(XOGameField[][] fieldArray) {
		super();
		this.fieldArray = fieldArray;
	}



	public XOGameField[][] getFieldArray() {
		return fieldArray;
	}


	public void setFieldArray(XOGameField[][] fieldArray) {
		this.fieldArray = fieldArray;
	}


	public void setGameField(int i,int j,PlayerSymbol ps){
		fieldArray[i][j].setSymbol(ps);
	}
	
	public PlayerSymbol getGameFieldSymbol(int i,int j){
		return fieldArray[i][j].getSymbol();
	}
	
	/*
	 * return winning symbol
	 */
	public PlayerSymbol isWinner(){
		if( (fieldArray[0][0].getSymbol() == PlayerSymbol.X && fieldArray[0][1].getSymbol() == PlayerSymbol.X && fieldArray[0][2].getSymbol() == PlayerSymbol.X) ||
				(fieldArray[1][0].getSymbol() == PlayerSymbol.X && fieldArray[1][1].getSymbol() == PlayerSymbol.X && fieldArray[1][2].getSymbol() == PlayerSymbol.X) ||
				(fieldArray[2][0].getSymbol() == PlayerSymbol.X && fieldArray[2][1].getSymbol() == PlayerSymbol.X && fieldArray[2][2].getSymbol() == PlayerSymbol.X) ||

				(fieldArray[0][0].getSymbol() == PlayerSymbol.X && fieldArray[1][0].getSymbol() == PlayerSymbol.X && fieldArray[2][0].getSymbol() == PlayerSymbol.X) ||
				(fieldArray[0][1].getSymbol() == PlayerSymbol.X && fieldArray[1][1].getSymbol() == PlayerSymbol.X && fieldArray[2][1].getSymbol() == PlayerSymbol.X) ||
				(fieldArray[0][2].getSymbol() == PlayerSymbol.X && fieldArray[1][2].getSymbol() == PlayerSymbol.X && fieldArray[2][2].getSymbol() == PlayerSymbol.X) ||

				(fieldArray[0][0].getSymbol() == PlayerSymbol.X && fieldArray[1][1].getSymbol() == PlayerSymbol.X && fieldArray[2][2].getSymbol() == PlayerSymbol.X) ||
				(fieldArray[0][2].getSymbol() == PlayerSymbol.X && fieldArray[1][1].getSymbol() == PlayerSymbol.X && fieldArray[2][0].getSymbol() == PlayerSymbol.X) ){
				return PlayerSymbol.X;
			}else if( (fieldArray[0][0].getSymbol() == PlayerSymbol.O && fieldArray[0][1].getSymbol() == PlayerSymbol.O && fieldArray[0][2].getSymbol() == PlayerSymbol.O) ||
					(fieldArray[1][0].getSymbol() == PlayerSymbol.O && fieldArray[1][1].getSymbol() == PlayerSymbol.O && fieldArray[1][2].getSymbol() == PlayerSymbol.O) ||
					(fieldArray[2][0].getSymbol() == PlayerSymbol.O && fieldArray[2][1].getSymbol() == PlayerSymbol.O && fieldArray[2][2].getSymbol() == PlayerSymbol.O) ||

					(fieldArray[0][0].getSymbol() == PlayerSymbol.O && fieldArray[1][0].getSymbol() == PlayerSymbol.O && fieldArray[2][0].getSymbol() == PlayerSymbol.O) ||
					(fieldArray[0][1].getSymbol() == PlayerSymbol.O && fieldArray[1][1].getSymbol() == PlayerSymbol.O && fieldArray[2][1].getSymbol() == PlayerSymbol.O) ||
					(fieldArray[0][2].getSymbol() == PlayerSymbol.O && fieldArray[1][2].getSymbol() == PlayerSymbol.O && fieldArray[2][2].getSymbol() == PlayerSymbol.O) ||

					(fieldArray[0][0].getSymbol() == PlayerSymbol.O && fieldArray[1][1].getSymbol() == PlayerSymbol.O && fieldArray[2][2].getSymbol() == PlayerSymbol.O) ||
					(fieldArray[0][2].getSymbol() == PlayerSymbol.O && fieldArray[1][1].getSymbol() == PlayerSymbol.O && fieldArray[2][0].getSymbol() == PlayerSymbol.O) ){
				return PlayerSymbol.O;
		}
		
		return PlayerSymbol.EMPTY;
		
	}
	
	public boolean haveEmptyFields(){
		for(int i=0;i<fieldArray.length;i++){
			for(int j=0;j<fieldArray[i].length;j++){
				if(fieldArray[i][j].getSymbol() == PlayerSymbol.EMPTY)
					return true;
			}
		}
		return false;
		
	}
	
}
