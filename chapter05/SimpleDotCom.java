public class SimpleDotCom{
	int [] locationCells;
	int numOfHits = 0;
	
	public void setLocationCells(int [] locs){
		locationCells = locs; //golden rule
	}
	
	public String checkYourself(String stringGuess){
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		for (int cell: locationCells){
			if (guess == cell){
				result = "hit";
				numOfHits++;
				break;
			}
		}//out of loop
		if (numOfHits == locationCells.length){
			result = "kill";
		}
		System.out.println(result);
		return result;
		
	}//close method
}//close class