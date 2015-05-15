import java.util.HashMap;
import java.util.Map;

class Snake{
	
	Map<Integer,Integer> snake = new HashMap<Integer,Integer>();
	
}

class Ladder{
	
	Map<Integer,Integer> ladder = new HashMap<Integer,Integer>();
}

class Board{
	
	int position;
	boolean hasSnake;
	boolean hasLadder;
	Snake s;
	Ladder l;
	
}

class Player{
	
	String name;
	Board board;
	
	Player(String name){
		this.name = name;
	}
	
}

public class SnakeandLadder {

	public static void main(String args[]){
		
		Player player1 = new Player("Player1");
		Player player2 = new Player("Player2");
		
		Board[] board = new Board[100];
		int i=0;
         System.out.println("Length is "+board.length);
         
         for(i=0;i<board.length;i++){
        	 board[i].position = i+1;
         }
         
         

		
	}


}
