public class TapeDeckTestDrive{
	public static void main(String[] args){
		//miss this line(object) before so cant run//
		TapeDeck t = new TapeDeck();
		
		t.canRecord = true;
		//t.playTape( );
		
		if (t.canRecord == true){
			t.recordTape();
		}
	}
}




