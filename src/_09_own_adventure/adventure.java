package _09_own_adventure;

import javax.swing.JOptionPane;

public class adventure {
public static void main(String[] args) {
	int c1 = JOptionPane.showOptionDialog(null, "You have a free plane ticket to either the Bahamas or the Hawiian Islands. Where do you choose to visit?", "Mr. Choice", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "The Bahamas", "The Hawiian Islands" }, null);
if(c1 == 0) {
	int c2a = JOptionPane.showOptionDialog(null, "A flight attendant offers you some snacks. She says, would you like the seeds, or salted peanuts?", "Mr. Choice", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "The Sunflower Seeds", "The Salty Peanuts"}, null);	
	// If the user picks another salty item along the journey, then make them die of high blood pressure.
	// The Sunflower Seeds are used to either lure birds
	if(c2a == 0) {
	int	sfs = 1;
	// sfs stands for sunflower seeds
	}
	if(c2a == 1) {
	int	sl = 1;
	// sl stands for salt level
	}
	int c3a = JOptionPane.showOptionDialog(null, "You land in the bahamas. You spy a pool, and a hotel. Which do you go to first?", "Mr. Choice", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "The Pool", "The Hotel" }, null);
	if(c3a == 0) {
	int	c4a = JOptionPane.showOptionDialog(null, "You walk into the hotel and see a food court. You walk in and see a pizza bar, as well as a huge flat screen TV with sports vendors. Which place do you go to?", "Mr. Choice", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "The Pool", "The Hotel" }, null);
	}
	if(c2a == 1) {
	int	sl = 1;
	}
}
if(c1 == 1) {
	int c2b = JOptionPane.showOptionDialog(null, "A flight attendant offers you some snacks. She says, would you like the seeds, or salted peanuts?", "Mr. Choice", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "The Sunflower Seeds", "The Salty Peanuts" }, null);		
	// If the user picks another salty item along the journey, then make them die of high blood pressure.
	// The Sunflower Seeds are used to either lure birds
	if(c2b == 0) {
		int	sfs = 1;
		// sfs stands for sunflower seeds
	}
	if(c2b == 1) {
	int	sl = 1;
	// sl stands for salt level
	}
	int c3b = JOptionPane.showOptionDialog(null, "You hop off the plane and see two billboards. They advertise a volcano tour and a hang gliding tour. Which tour would you like to go on?", "Mr. Choice", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "The Volcano Tour", "The Hang Gliding Tour" }, null);	
}	
}
}
