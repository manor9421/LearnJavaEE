package com.mnr.xo.model;

import com.mnr.xo.interfaces.XOGameField;

public class Field implements XOGameField{

	private PlayerSymbol symbol;
	
	public Field() {
	}

	public Field(PlayerSymbol symbol) {
		this.symbol = symbol;
	}
	
	@Override
	public PlayerSymbol getSymbol() {
		return symbol;
	}
	
	@Override
	public void setSymbol(PlayerSymbol symbol) {
		this.symbol = symbol;
	}
	
	
	
}
