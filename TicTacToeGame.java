import java.util.*;
import java.awt.*; 


public class TicTacToeGame
{

	public char board[] = new char[10] ;
	public String user_value;
	public static final int Is_Head=0,Is_Tail=1;


	public void assignToBoard()
	{
		for(int i=1; i<10 ;i++)
		{
			board[i]= ' ';
			System.out.println("board:["+i+"]="+board[i]);
		}


	}

	public void chooseOption()
	{
		System.out.print("\n");
		System.out.println("User should Choose between X or O ");
		Scanner sc_object = new Scanner(System.in);
		user_value = sc_object.next();
		
		if(user_value.equals("x") || user_value.equals("X"))
		{
			System.out.println("The computer should choose  'O' ");
			
		}
		else if(user_value.equals("o") || user_value.equals("O"))
		{
			System.out.println("The computer should choose 'X' ");
		}
		else
		{
			System.out.println("invalid input choose correct option");
			chooseOption();
		}
			
		
	}
	
	public void showBoard()
	{
		System.out.print("\n");
		
        System.out.println("|---|---|---|");
        System.out.println("| " + board[1] + " | "
                           + board[2] + " | " + board[3]
                           + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[4] + " | "
                           + board[5] + " | " + board[6]
                           + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[7] + " | "
                           + board[8] + " | " + board[9]
                           + " |");
        System.out.println("|---|---|---|");
    
	}
	
	void selctLocation()
	{
		System.out.print("\n");
		System.out.println("Choose the Board location between 1 to 9 ");
		
		Scanner select = new Scanner(System.in);
		int choose = select.nextInt();
		if(board[choose] == ' ')
		{
			System.out.println("Index is free You can Enetr value");
			
		}
		else
			System.out.println("Index "+choose+ " is not free You can choose another location");
			
	}
	
	void makeToss()
	{
		System.out.print("\n");
		System.out.println("Make Toss between user and computer");
		System.out.println("If It is Head :User will play Tail :computer will play");
		int toss = (int)Math.floor( Math.random() * 10) % 2;
		
		switch(toss)
		{
			case Is_Head:
				System.out.println("Its Head:User will Play");
				break;
			
			case Is_Tail:
				System.out.println("Its Tail:Computer will Play");
				break;
		}
	}
			
			
	
	

	public static void main(String[] args)
	{
		System.out.println("welcome to Tic Tac Toe game ");
		TicTacToeGame Tic_object = new TicTacToeGame();
		Tic_object.assignToBoard();
		Tic_object.chooseOption();
		Tic_object.showBoard();
		Tic_object.selctLocation();
		Tic_object.makeToss();
		
	}
}
