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
	
	int position[] = new int[100];
	boolean hasSnake;
	boolean hasLadder;
	Snake snake[] = new Snake[100];
	Ladder ladder[] = new Ladder[100];
	

	
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
	
 static int Rand(){
	 int Random = (int) (Math.random()*100)%7;
	 return Random;
 }
	
	public static void main(String args[]){
		
		//Create Board
		int i=0;		
		Board playable_board = new Board();
		
		//Inititalize all
		while(i<100){
			 
			playable_board.position[i]=i+1;
			playable_board.snake[i]=null;
			playable_board.ladder[i]=null;
			i++;
		 }	
		
		//Define specific ladders
		playable_board.ladder[5] = new Ladder();
		playable_board.ladder[5].ladder.put(6, 99);
		
		playable_board.ladder[4] = new Ladder();
		playable_board.ladder[4].ladder.put(5, 94);
		
		playable_board.ladder[3] = new Ladder();
		playable_board.ladder[3].ladder.put(6, 96);
		
		//Define specific Snakes
		playable_board.snake[65] = new Snake();
		playable_board.snake[65].snake.put(66, 33);
		
		playable_board.snake[75] = new Snake();
		playable_board.snake[75].snake.put(76, 43);
		
		playable_board.snake[94] = new Snake();
		playable_board.snake[94].snake.put(95, 53);
	
		
		ArrayList<Player> playerList = new ArrayList<Player>();
		
	
		
		for(i=0;i<2;i++){
			
			Player player = new Player("Player " +(i+1));
			player.board = playable_board;
			 playerList.add(player);
			 System.out.println(player.name +" added");
		}

		
		//Play the actual game
		while(playerList.size()>0){
			
			for(i=0;i<playerList.size();i++){
				
				Player curr_player = playerList.get(i);
				if(playerList.get(i).player_position>=100){
					playerList.remove(i);				
					
				}
				
				System.out.println("Rolling the dice for " +playerList.get(i).name);
				 int random = Rand();
				 while(random == 0){
					 random =Rand();
				 }
				
				 curr_player.player_position =curr_player.player_position + random;
				 
				  if(curr_player.player_position == 100){
					  System.out.println(curr_player.name + " game is over");
					   playerList.remove(curr_player);
				  }
				 
				  else if(curr_player.player_position > 100)
					  continue;
				  
				  else
				  {
					  
						 System.out.println("Current position for  " +curr_player.name + " is "+curr_player.player_position);
						int currpos =curr_player.player_position;
						
						//Check if currpos >100
						
						
						
						//Check for snake or Ladder
						if( curr_player.board.snake[currpos-1] != null)
						{
							int changed_pos =curr_player.board.snake[currpos-1].snake.get(currpos);
							curr_player.player_position =changed_pos;
						}
						
						if(curr_player.board.ladder[currpos-1] != null)
						{
							int changed_pos =curr_player.board.ladder[currpos-1].ladder.get(currpos);
							curr_player.player_position =changed_pos;
						}
				  }
				
				
			}
		}
		 
		
		
	}

	
	
	
	
	
}
