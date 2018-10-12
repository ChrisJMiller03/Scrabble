
public class Display
	{
	static 	String [][] board	= new String [7][7];
		public static void main(String[] args)
			{
				fillArray();
				display();

			}

	
		public static void fillArray()
			{
				
				
				
				for(int row = 0; row < 7; row++)
					{
						for(int col = 0; col < 7; col++)
							{
								
								System.out.print(board[row][col] + " ");
								
							}
					}
			}
	
		
		public static void display()
		{
			
		
			System.out.println("        1      2      3      4      5      6      7   ");
			System.out.println("    --------------------------------------------------");
			System.out.println("    |      |      |      |      |      |      |      |");
			System.out.println("   A|   " + board [0][0] + "    |    " + board [0][1] + "  |  "  +    "|      |      |      |      |");
			System.out.println("    |      |      |      |      |      |      |      |");
			System.out.println("    |------------------------------------------------|");
			System.out.println("    |      |      |      |      |      |      |      |");
			System.out.println("   B|      |      |      |      |      |      |      |");
			System.out.println("    |      |      |      |      |      |      |      |");
			System.out.println("    |------------------------------------------------|");
			System.out.println("    |      |      |      |      |      |      |      |");
			System.out.println("   C|      |      |      |      |      |      |      |");
			System.out.println("    |      |      |      |      |      |      |      |");
			System.out.println("    |------------------------------------------------|");
			System.out.println("    |      |      |      |      |      |      |      |");
			System.out.println("   D|      |      |      |      |      |      |      |");
			System.out.println("    |      |      |      |      |      |      |      |");
			System.out.println("    |------------------------------------------------|");
			System.out.println("    |      |      |      |      |      |      |      |");
			System.out.println("   E|      |      |      |      |      |      |      |");
			System.out.println("    |      |      |      |      |      |      |      |");
			System.out.println("    |------------------------------------------------|");
			System.out.println("    |      |      |      |      |      |      |      |");
			System.out.println("   F|      |      |      |      |      |      |      |");
			System.out.println("    |      |      |      |      |      |      |      |");
			System.out.println("    |------------------------------------------------|");
			System.out.println("    |      |      |      |      |      |      |      |");
			System.out.println("   G|      |      |      |      |      |      |      |");
			System.out.println("    |      |      |      |      |      |      |      |");
			System.out.println("    --------------------------------------------------");
		
		}
	}
