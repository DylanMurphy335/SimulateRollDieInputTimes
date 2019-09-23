import java.util.Random;

public class SimulateRollDie2 {

	int face;
	int freq1, freq2, freq3, freq4, freq5, freq6; //counter for outcomes
	Random r = new Random();

	void blurb() {
		System.out.println("====================================");
		System.out.println("= Simulate multiple rolls of a die =");
		System.out.println("====================================");
		System.out.println();
	}

	void roll() {
		System.out.println("how many times would you like the dice to be rolled");
		Scanner s = new Scanner(System.in);
		int rollAmount = s.nextInt();
		System.out.println();
		rollDie(rollAmount);
	}

	void rollDie(int numOfDie) {
		for (int i=1; i<=numOfDie; i++) {
			face = 1 + r.nextInt(6);
		
			switch (face) {
			case 1 : freq1++;
				break;
			case 2 : freq2++;
				break;
			case 3 : freq3++;
				break;
			case 4 : freq4++;
				break;
			case 5 : freq5++;
				break;
			case 6 : freq6++;
				break;
			}
			display(face);
		}
		System.out.println("\n1:\t" + freq1);
		System.out.println("\n2:\t" + freq2);
		System.out.println("\n3:\t" + freq3);
		System.out.println("\n4:\t" + freq4);
		System.out.println("\n5:\t" + freq5);
		System.out.println("\n6:\t" + freq6);
	}

	void display(int face) {
		System.out.println(face);

	}

	public static void main(String[] args) {
		SimulateRollDie2 app = new SimulateRollDie2();
		app.blurb();
		app.roll();
	}
}
