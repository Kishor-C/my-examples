package com.examples.session2;

import java.util.Scanner;

abstract class GameCharacter {
	
	abstract void attack();
	abstract void defend();
}
class Warrior extends GameCharacter {

	int strength;
	public Warrior(int strength) {
		this.strength = strength;
	}
	@Override
	void attack() {
		System.out.println("Attack: Powerful sword slash for "+(strength*3)+" damage!");
	}

	@Override
	void defend() {
		System.out.println("Defend: Raises shield, defence boosted by "+strength+"!");
	}
	
}
class Wizard extends GameCharacter {
	int power;
	public Wizard(int power) {
		this.power = power;
	}
	@Override
	void attack() {
		System.out.println("Attack: Casts spell, deals "+power*2+" magical damage!");
	}

	@Override
	void defend() {
		System.out.println("Defend: Creates magical barrier, defence boosted by "+power+"!");
	}
	
}

public class S1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int option = scan.nextInt();
		switch(option) {
		case 1: 
			int n = scan.nextInt();
			Warrior warrior1 = new Warrior(n);
			System.out.println("Warrior Actions:");
			warrior1.attack();
			warrior1.defend();
			break;
		case 2: 
			int m = scan.nextInt();
			Wizard wizard1 = new Wizard(m);
			System.out.println("Wizard Actions:");
			wizard1.attack();
			wizard1.defend();
			break;
		default : System.out.println("Invalid choice");
		}
		scan.close();
	}
}
