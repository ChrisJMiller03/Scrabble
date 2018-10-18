
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Display
	


{
	
	static 	String [][] board	= new String [7][7];
		public static void main(String[] args)
			{
				RackDatabase.fillRack();
				LetterDatabase.fillAlphabet();
				fillArray();
				display();
				playScrabble();
			}

	
		public static void fillArray()
			{
				
				
				
				for(int row = 0; row < 7; row++)
					{
						for(int col = 0; col < 7; col++)
							{
								
								board[row][col] = " ";
								
							}
					}
			
			}
	
		
		public static void display()
		{
			
		
			System.out.println("        1      2      3      4      5      6      7   ");
			System.out.println("    --------------------------------------------------");
			System.out.println("    |      |      |      |      |      |      |      |");
			System.out.println("   A|   " + board [0][0] + "  |  " + board [0][1] + "   | "  + board [0] [2] +   "    | "   + board [0][3] + "    | " + board [0][4] + "    |  " + board [0][5] + "   | " + board[0][6] +  "    |"  );
			System.out.println("    |      |      |      |      |      |      |      |");
			System.out.println("    |------+------+------+------+------+------+------|");
			System.out.println("    |      |      |      |      |      |      |      |");
			System.out.println("   B|   " + board [1][0] + "  |  " + board [1][1] + "   | "  + board [1][2] +  "    | " + board [1][3] + "    |" + board [1][4] + "     |" + board [1][5] + "     | " + board [1][6] + "    |");
			System.out.println("    |      |      |      |      |      |      |      |");
			System.out.println("    |------+------+------+------+------+------+------|");
			System.out.println("    |      |      |      |      |      |      |      |");
			System.out.println("   C|   " + board [2][0] + "  |  " + board [2][1] + "   | "  + board [2][2] +  "    | " + board [2][3] + "    |" + board [2][4] + "     |" + board [2][5] + "     | " + board [2][6] + "    |" );
			System.out.println("    |      |      |      |      |      |      |      |");
			System.out.println("    |------+------+------+------+------+------+------|");
			System.out.println("    |      |      |      |      |      |      |      |");
			System.out.println("   D|   " + board [3][0] + "  |  " + board [3][1] + "   | "  + board [3][2] +  "    | " + board [3][3] + "    |" + board [3][4] + "     |" + board [3][5] + "     | " + board [3][6] + "    |"  );
			System.out.println("    |      |      |      |      |      |      |      |");
			System.out.println("    |------+------+------+------+------+------+------|");
			System.out.println("    |      |      |      |      |      |      |      |");
			System.out.println("   E|   " + board [4][0] + "  |  " + board [4][1] + "   | "  + board [4][2] +  "    | " + board [4][3] + "    |" + board [4][4] + "     |" + board [4][5] + "     | " + board [4][6] + "    |" );
			System.out.println("    |      |      |      |      |      |      |      |");
			System.out.println("    |------+------+------+------+------+------+------|");
			System.out.println("    |      |      |      |      |      |      |      |");
			System.out.println("   F|   " + board [5][0] + "  |  " + board [5][1] + "   | "  + board [5][2] +  "    | " + board [5][3] + "    |" + board [5][4] + "     |" + board [5][5] + "     | " + board [5][6] + "    |" );
			System.out.println("    |      |      |      |      |      |      |      |");
			System.out.println("    |------+------+------+------+------+------+------|");
			System.out.println("    |      |      |      |      |      |      |      |");
			System.out.println("   G|   " + board [6][0] + "  |  " + board [6][1] + "   | "  + board [6][2] +  "    | " + board [6][3] + "    |" + board [6][4] + "     |" + board [6][5] + "     | " + board [6][6] + "    |" );
			System.out.println("    |      |      |      |      |      |      |      |");
			System.out.println("    --------------------------------------------------");
		
		}
	
	
		public static void playScrabble()
		{
			int rowInput = 0;
			int colInput = 0;
			
			
			for(int i = 0; i<7; i++)
				{
					System.out.print( LetterDatabase.alphabet.get(0).getLetter());
					System.out.println();
					RackDatabase.rack.add(LetterDatabase.alphabet.get(0));
					LetterDatabase.alphabet.remove(0);
				}
			System.out.println("The above letters are the letters you can use. Where do you want to put the letter?");
			Scanner userInput = new Scanner(System.in);
			String move = userInput.nextLine();
			
			if(move.substring(0,1).equals("A")	)	
				{
					rowInput= 0;
				}
			else if (move.substring(0,1).equals("B"))
				{
					rowInput = 1;
				}
			else if (move.substring(0,1).equals("C"))
				{
					rowInput = 2;
				}
			else if (move.substring(0,1).equals("D"))
				{
					rowInput = 3;
				}
			else if (move.substring(0,1).equals("E"))
				{
					rowInput = 4;
				}
			else if (move.substring(0,1).equals("F"))
				{
					rowInput = 5;
				}
			else if (move.substring(0,1).equals("G"))
				{
					rowInput = 6;
				}
		
			
			
			System.out.println("What letter do you want to use?");
			Scanner userInput1 = new Scanner(System.in);
			String chosenLetter = userInput.nextLine();
			boolean stillPlaying = true;
			
			while (stillPlaying)
				{
					colInput = Integer.parseInt(move.substring(1,2));
					colInput = colInput - 1;
					board[rowInput][colInput] = chosenLetter ;
					RackDatabase.rack.remove(chosenLetter);
					display();
					System.out.println("Do you want to keep playing?");
					Scanner userInput2 = new Scanner(System.in);
					String play= userInput.nextLine();
					if(play.equals("Yes"))
						{
							
						}
				}
			
						
					
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	
	
	}
