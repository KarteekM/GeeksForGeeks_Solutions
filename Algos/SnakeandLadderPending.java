import java.util.HashMap;
import java.util.Map;

class Snake{
	
	Map<Integer,Integer> snake = new HashMap<Integer,Integer>();
	
}

class Ladder{
	
	Map<Integer,Integer> ladder = new HashMap<Integer,Integer>();
}

class Number{
	
	int i;
	boolean hasSnake;
	boolean hasLadder;
	Snake s;
	Ladder l;
	
}

class Player{
	
	String name;
	Number number;
	
	Player(String name){
		this.name = name;
	}
	
}

public class SnakeandLadder {

	Player player1 = new Player("Player1");
	Player player2 = new Player("Player2");
}
