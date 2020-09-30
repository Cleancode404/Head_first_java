class TapeDeckTestDrive{
	public static void main(String[] args){
		//miss this line(object) before so cant run//
		t.TapeDeck = new TapeDeck();
		
		t.canRecord = true;
		t.playTape();
		
		if (t.canRecord == true){
			t.recordTape();
		}
	}
}




