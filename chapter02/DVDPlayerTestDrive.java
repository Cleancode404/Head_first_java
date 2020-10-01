// package com.headfirstjava.chaptertwo.dvdplayer;


// public class DVDPlayerTestDrive{
	// public static void main(String[] args){
		// DVDPlayer d = new DVDPlayer();
		// d.canRecord = true;
		// d.playDVD();
		// if (d.canRecord == true){
			// d.recordDVD();
		// }
		
	// }
// }






public class DVDPlayerTestDrive {

    public static void main(String[] args) {

        DVDPlayer dvdPlayer = new DVDPlayer();
        dvdPlayer.canRecord = true;
        dvdPlayer.playDVD();

        if (dvdPlayer.canRecord == true) {
            dvdPlayer.recordDVD();
        }
    }
}