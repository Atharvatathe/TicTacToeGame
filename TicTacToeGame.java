import java.util.*;


public class TicTacToeGame
{

	public char board[] = new char[10] ;
	public String user_value;


	public void assignToBoard()
	{
		for(int i=1; i<10 ;i++)
		{
			board[i]= 'x';
			System.out.println("board:["+i+"]="+board[i]);
		}


	}

	public void chooseOption()
	{
		
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
	
	

	public static void main(String[] args)
	{
		System.out.println("welcome to Tic Tac Toe game ");
		TicTacToeGame Tic_object = new TicTacToeGame();
		Tic_object.assignToBoard();
		Tic_object.chooseOption();
		
	}
}
