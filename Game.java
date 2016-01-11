import java.util.ArrayList;
import java.util.List;
import java.util.Random;


class Lane {
	
	
	
	String name;
	
	List<EachPlayer> playerList = new ArrayList<EachPlayer>();
	List<String> playernames = new ArrayList<String>();
	
	Lane(String name){
		this.name = name;
		
		playerList = new ArrayList<EachPlayer>();
		
		
	}
	
	public void register(String name){
		playernames.add(name);
	}
	
	public void display(String name,int score){
		
		if(playernames.contains(name)){
			
			System.out.println("On Lane "+this.name+" player "+ name + " score is " +score);
			
		}
		
	}
	

}

class EachPlayer{
	
	String name;
	int score;
	Lane lane;
	Random r;
	int gameindex;
	int shotnumber;
	int shots[][] ;
	
	EachPlayer(String name,Lane l){
		this.name =name;
		lane = l;
		lane.register(name);
		score =0;
		shots = new int[10][2]; //Initial chances
		r = new Random();
	}	
	
	public void play(){	
		int i=0,j=0,prev=0;
		
		for(i=0;i<this.shots.length;i++){
			
			for(j=0;j<2;j++){
				
				this.shots[i][j]=10;//r.nextInt(10 -0);
				
				System.out.println("You have hit " +this.shots[i][j]+ "  for i "+i+ " j "+j);
				
				if(j ==0){
					
					prev= this.shots[i][j];				
					calcscore(this.shots[i][j],i,j,-1);					
				}
				
				else{
					calcscore(this.shots[i][j],i,j,prev);
				}
				
				
				
				if(this.shots[i][j] == 10 && j==0){
					j++;
					this.shots[i][j]=0;
				}
					
			}
			
		}
		
		System.out.println("Final score for player "+this.name + " is "+this.score);
		
		
	}

	public void calcscore(int value,int gameindex,int shotnumber,int prev){
		
		int i=0;
		this.score =this.score +value;
		
		if(value == 10 && shotnumber == 0){			
			this.score =this.score +10;// strike
			
			
			if(gameindex == 9){
				
				for(i=0;i<3;i++){
					this.score =this.score +r.nextInt(10 -0);
				}
			}
		}
		
		else if(prev!= -1 && prev+value ==10 && shotnumber ==1){
			this.score =this.score+5; //spare
			
			if(gameindex == 9){
				for(i=0;i<3;i++){
					this.score =this.score +r.nextInt(10 -0);
				}
        	}
		}	
		
		this.lane.display(this.name, this.score);
}

}

class Game{
	
	public static void main(String args[]){	
		
		Lane l= new Lane("Lane1");
		
		EachPlayer player1 = new EachPlayer("Karteek",l);
		EachPlayer player2 = new EachPlayer("Vishal",l);
		EachPlayer player3 = new EachPlayer("Ramesh" ,l);
		
		player1.play();
		player2.play();
		player3.play();
		//System.out.println("Final score is " +player1.score);
		
		Lane l2 = new Lane("Lane2");
		EachPlayer player4 = new EachPlayer("Ramu",l2);
		EachPlayer player5 = new EachPlayer("Kiran",l2);
		EachPlayer player6 = new EachPlayer("Praveen" ,l2);
		
		player4.play();
		player5.play();
		player6.play();
		
		List<Lane> lanes = new ArrayList<Lane>();
		lanes.add(l);
		lanes.add(l2);
		
		List<EachPlayer> playerList = new ArrayList<EachPlayer>();
		
		playerList.add(player1);
		playerList.add(player2);
		playerList.add(player3);
		playerList.add(player4);
		playerList.add(player5);
		playerList.add(player6);
		
		
		for(Lane locallane: lanes){
			
			List<String> players = locallane.playernames;
			
			for(String s:players){
				
				if(playerList.contains(s)){
					
			      
				}
			}
			
			
		}
		
		
		
		
		
	}
}
