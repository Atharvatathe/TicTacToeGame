public class TicTacToeGame
{

	public char board[] = new char[10] ;


	public void assignToBoard()
	{
		for(int i=1; i<10 ;i++)
		{
			board[i]= 'a';
			System.out.println("board:["+i+"]="+board[i]);
		}


	}

	public static void main(String[] args)
	{
		System.out.println("welcome to Tic Tac Toe game ");
		TicTacToeGame Tic_object = new TicTacToeGame();
		Tic_object.assignToBoard();

	}
}
