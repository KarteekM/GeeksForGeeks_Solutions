import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Snake{
	
	Map<Integer,Integer> snake = new HashMap<Integer,Integer>();
	
}

class Ladder{
	
	Map<Integer,Integer> ladder = new HashMap<Integer,Integer>();
}

class Board{
	
	int position[];
	boolean hasSnake;
	boolean hasLadder;
	Snake snake[];
	Ladder ladder[];
	
	Board(){
		int i=0;
		while(i<100){
			 
			 this.position[i]=i+1;
			 this.snake[i]=null;
			 this.ladder[i]=null;
		 }
	}
	
}

class Player{
	
	String name;
	Board board;
	int player_position;
	
	Player(String name){
		this.name = name;
		this.player_position = 1;
	}
	
}

public class SnakeandLadder {
	
	public static void main(String args[]){
		
		//Create Board
		int i=0;		
		Board playable_board = new Board();
		
		//Define specific ladders
		playable_board.ladder[5] = new Ladder();
		playable_board.ladder[5].ladder.put(6, 99);
		
		playable_board.ladder[4] = new Ladder();
		playable_board.ladder[4].ladder.put(5, 94);
		
		playable_board.ladder[3] = new Ladder();
		playable_board.ladder[3].ladder.put(6, 96);
	
		
		ArrayList<Player> playerList = new ArrayList<Player>();
		
		for(i=0;i<playerList.size();i++){
			
			Player player = new Player("Player " +i);			
			 playerList.add(player);
		}

		
		//Play the actual game
		while(playerList.size()>0){
			
			for(i=0;i<playerList.size();i++){
				
				
			}
		}
		 
		
		
	}

	
	
	
	
	
}
