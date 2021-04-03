package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rooms;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Rooms[] vect = new Rooms[10];

		System.out.print("How many rooms will be  rented? ");
		int quantityRooms = input.nextInt();

		for (int i = 0; i < quantityRooms; i++) {
			System.out.println();
			System.out.println("Rent #"+i+":");
			System.out.print("Name: ");
			input.nextLine();
			String name = input.nextLine();

			System.out.print("Email: ");
			String email = input.nextLine();

			System.out.print("Room: ");
			int room = input.nextInt();

			vect[room] = new Rooms(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		
		for(int i=0; i<10;i++) {
			if(vect[i]!=null) {
				System.out.println(i+": "+vect[i]);
			}
		}

		input.close();
	}
}
