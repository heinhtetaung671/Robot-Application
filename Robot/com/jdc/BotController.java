package com.jdc;
import java.util.Scanner;
public class BotController{

	private Robot robot = new Robot();

	public void run(){

			System.out.println("================");
			System.out.println("===  Mr Bot  ===");
			System.out.println("================");
			
			Scanner sc = new Scanner(System.in);

			
			while(true){
				System.out.println();
				System.out.print("User> ");
				String user = sc.nextLine();

				if(user.equalsIgnoreCase("exists")){
					System.out.println("===================");
					System.out.println("===  Thank YOu  ===");
					System.out.println("===================");
					break;
				}

				System.out.print("Bot> "+robot.talk(user.toLowerCase()));
				System.out.println();


		}
	}

}