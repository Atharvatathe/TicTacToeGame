import java.util.*;
import java.awt.*; 


public class TicTacToeGame
{

	private static String board[] = new String[10] ;
	private static String user_value;
	public static String computer_value;
	public static final int Is_Head=0,Is_Tail=1;

	//UC1
	public static void assignToBoard()
	{
		for(int i=1; i<10 ;i++)
		{
			board[i]= user_value;
			System.out.println("board:["+i+"]="+board[i]);
		}


	}
	//UC2
	public static void chooseOption()
	{
		System.out.print("\n");
		System.out.println("User should Choose between X or O ");
		Scanner sc_object = new Scanner(System.in);
		user_value = sc_object.next();
		
		if(user_value.equals("x") || user_value.equals("X"))
		{
			
			System.out.println("The computer should choose  'O' ");
			computer_value = "o";
			
		}
		else if(user_value.equals("o") || user_value.equals("O"))
		{
			System.out.println("The computer should choose 'X' ");
			computer_value = "x";
		}
		else
		{
			System.out.println("invalid input choose correct option");
			chooseOption();
		}
			
		
	}
	//UC3
	public static void showBoard()
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
	
	public static void selctLocation()
	{
		System.out.print("\n");
		System.out.println("Choose the Board location between 1 to 9 ");
		
		Scanner select = new Scanner(System.in);
		int choose = select.nextInt();
		if(board[choose].equalsIgnoreCase(" "))
		{
			System.out.println("Index is free You can Enetr value");
			
		}
		else
			System.out.println("Index "+choose+ " is not free You can choose another location");
			
	}
	
	public static void makeToss()
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
			
static String checkStatus()
    {
        for (int a = 0; a < 8; a++) {
            String line = null;
  
            switch (a) {
            case 0:
                line = board[0] + board[1] + board[2];
                break;
            case 1:
                line = board[3] + board[4] + board[5];
                break;
            case 2:
                line = board[6] + board[7] + board[8];
                break;
            case 3:
                line = board[0] + board[3] + board[6];
                break;
            case 4:
                line = board[1] + board[4] + board[7];
                break;
            case 5:
                line = board[2] + board[5] + board[8];
                break;
            case 6:
                line = board[0] + board[4] + board[8];
                break;
            case 7:
                line = board[2] + board[4] + board[6];
                break;
            }
            //For X winner
            if (line.equalsIgnoreCase("XXX")) {
                return "X is winner";
            }
              
            // For O winner
            else if (line.equalsIgnoreCase("OOO")) {
                return "O is winner";
            }
        }
		 
        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(board).contains(
                    String.valueOf(a + 1))) {
                break;
            }
            else if (a == 8) {
                return "draw";
            }
        }
  
		return null;
    }
	

	public static void main(String[] args)
	{
		System.out.println("welcome to Tic Tac Toe game ");
		
		assignToBoard();
		chooseOption();
		showBoard();
		selctLocation();
		makeToss();
		checkStatus();
		
	}
}
