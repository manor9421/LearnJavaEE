package com.mnr.xo.interfaces;

import com.mnr.xo.model.PlayerSymbol;

public interface XOGameModel {
	public PlayerSymbol isWinner();
	
	public boolean haveEmptyFields();
	
}
