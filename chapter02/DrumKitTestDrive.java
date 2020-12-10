public class DrumKitTestDrive{
	public static void main(String[] args){
		
		DrumKit d = new DrumKit();
		d.playSnare(); //same compiler error
		d.snare = false;
		d.playTopHat();
		
		if (d.snare == true){
			d.playSnare();
		}
	}
}