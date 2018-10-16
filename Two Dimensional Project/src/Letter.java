
public class Letter
	{

		String letter;
		int inputValue;
		int scoreNumber;
		String space;

		public Letter(String l, int i, int sn, String s)
			{
				letter = l;
				inputValue = i;
				scoreNumber = sn;
				space = s;
			}

		public String getLetter()
			{
				return letter;
			}

		public void setLetter(String letter)
			{
				this.letter = letter;
			}

		public int getInputValue()
			{
				return inputValue;
			}

		public void setInputValue(int inputValue)
			{
				this.inputValue = inputValue;
			}

		public int getScoreNumber()
			{
				return scoreNumber;
			}

		public void setScoreNumber(int scoreNumber)
			{
				this.scoreNumber = scoreNumber;
			}

		public String getSpace()
			{
				return space;
			}

		public void setSpace(String space)
			{
				this.space = space;
			}

		
	}
