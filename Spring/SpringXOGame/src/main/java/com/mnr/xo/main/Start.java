package com.mnr.xo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mnr.xo.controller.Controller;
import com.mnr.xo.interfaces.XOGameModel;
import com.mnr.xo.interfaces.XOGameViewField;
import com.mnr.xo.model.Game;
import com.mnr.xo.model.Player;
import com.mnr.xo.model.PlayerSymbol;
import com.mnr.xo.view.GameField;

public class Start {

	public static void main(String[] args) {
		// создаем окно
		/*XOGameField gameField = new GameField();//
		gameField.drawField();//

		Player player = new Player(PlayerSymbol.X, "Sergey");//
		Game game = new Game();
		
		new Controller(gameField,game,player);*/
		ApplicationContext context = new ClassPathXmlApplicationContext("AppContext.xml");
		GameField gameField = (GameField) context.getBean("gameField");// получаем бин с qualifier "model1"
		
		gameField.drawField();
		
		Game game = (Game) context.getBean("game");
		
		Controller controller = (Controller) context.getBean("controller");
		
		
	}

}
