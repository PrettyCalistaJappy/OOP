package aa;
import java.util.Scanner;
import java.util.Random;

//This program is made to generate Genshin Teams which usually consists of 4 different Characters per team
//The randomizer/gacha system for this program uses a method called generate(); that utilizes java.util.Random 
//first, the program will ask user how many Randomized Teams They want to generate
//then, the program will loop to call the generate() method
//in the generate method, there is an array of strings which contains all the name of characters in the game
// Genshin Impact until version 3.5 which totals to 62 character.
//the program will create another String array of 4, and randomize each index contents using random() until
//the program get 4 characters
//After That, the method will return the String array so that it can be printed in the main()

public class gacha {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Let's Gacha a Genshin Team!");
		System.out.println("How Many Team Do You Want To Generate?");
		int teams = input.nextInt();
		for (int i = 0; i < teams; i++) {
			String[] team = generate();
			System.out.println("Team " + (i+1) + " consists of " + team[0] + ", "+ team[1] + ", " + team[2] + ", and " + team[3]);
		}
		System.out.println("Have Fun Doing the Abbys!");
	}
	
	public static String[] generate() {//this return an array
		String[] characters = new String[] {"Alhaitham", "Wanderer", "Nahida", "Nilou", "Yelan", 
				"Raiden", "Ayaka", "Venti", "Zhongli", "Ganyu", "Kazuha", "Bennett", "HuTao", "XingQiu",
				"Xiangling", "Xiao", "Dehya", "Yoimiya", "Jean", "Eula", "Albedo", "Tartaglia", "Ayato",
				"Shenhe", "Itto", "Tighnari", "Yae", "Keqing", "Cyno", "Kuki", "Fishcl", "YaoYao", "Mika",
				"Faruzan", "YunJin", "Gorou", "Qiqi", "Beidou", "Rosaria", "Noelle", "Yanfei", "Mona", "Diluc",
				"Collei", "Sucrose", "Heizou", "Barbara", "Thoma", "Klee", "Traveler", "Razor", "Aloy", "Sayu",
				"Chongyun", "Dori", "Layla", "Candace", "Xinyan", "Lisa", "Amber", "Ningguang", "Kaeya"};
		//62 characters
		String[] selection = new String[4];
		Random rand = new Random();
		for(int i = 0; i < 4; i++) {
			int gachaNum = rand.nextInt(62);
			selection[i] = characters[gachaNum];
		}
		
		return selection;
	}

}
