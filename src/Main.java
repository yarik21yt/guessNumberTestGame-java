import java.util.Scanner; 
import java.util.Random;


public class Main {
	public static void main(String[] args) {
			Random rand = new Random();
			Scanner sc = new Scanner(System.in); 
			
			int ranNumber = rand.nextInt(10);
			int health = 3;
			
			
			do {
				System.out.println("Угадай число от 0 до 10!");
				System.out.println("У тебя " + health + " попытки! :");
				
				if (!sc.hasNextInt()) {
			        System.out.println("Эй, нужно ввести именно ЧИСЛО!");
			        sc.next();
			        continue;
			    }
				
				
				int guess = sc.nextInt();
				
				if (guess == ranNumber) {
					System.out.println("Ты победил! Загаданное число: " + ranNumber);
					break;
				}
				else {
					health--;
					System.out.println("Неправильно!");
				}
			}
			while (health > 0);
			
			
			if (health == 0) {
				System.out.println("Ты проиграл!");
				System.out.println("Загаданное число: " + ranNumber);
			}
			
			
		}

}
