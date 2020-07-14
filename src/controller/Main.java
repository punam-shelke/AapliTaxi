package controller;

import java.util.Scanner;

import service.Mini;
import service.SUV;
import service.Sedan;

public class Main {
public static void main(String args[]) {
	final int BASE_DISTANCE_MINI = 3;
	final int BASE_DISTANCE_SEDAN = 5;
	final int BASE_DISTANCE_SUV = 5;
	final int BASE_PRICE_MINI = 50;
	final int BASE_PRICE_SEDAN = 80;
	final int BASE_PRICE_SUV = 100;
	final int ABOVE_BASE_PRICE_MINI = 10;
	final int ABOVE_BASE_PRICE_SEDAN = 12;
	final int ABOVE_BASE_PRICE_SUV = 15;
	final int MILESTONE_MINI = 75;
	final int MILESTONE_SEDAN = 100;
	final int MILESTONE_SUV = Integer.MAX_VALUE;
	final int ABOVE_MILESTONE_MINI = 8;
	final int ABOVE_MILESTONE_SEDAN = 10;
	final int ABOVE_MILESTONE_SUV = 0;
	Scanner sc = new Scanner(System.in);
	int type = sc.nextInt();
	int distance = sc.nextInt();
	int cost=0;
	switch(type) {
	case 1:
		Mini mini = new Mini(BASE_DISTANCE_MINI, BASE_PRICE_MINI, ABOVE_BASE_PRICE_MINI, MILESTONE_MINI, ABOVE_MILESTONE_MINI);
		cost = mini.calculateFare(distance);
		break;
	case 2:
		Sedan sedan = new Sedan(BASE_DISTANCE_SEDAN, BASE_PRICE_SEDAN, ABOVE_BASE_PRICE_SEDAN, MILESTONE_SEDAN, ABOVE_MILESTONE_SEDAN);
		cost = sedan.calculateFare(distance);
		break;
	case 3:
		SUV suv = new SUV(BASE_DISTANCE_SUV, BASE_PRICE_SUV, ABOVE_BASE_PRICE_SUV, MILESTONE_SUV, ABOVE_MILESTONE_SUV);
		cost = suv.calculateFare(distance);
		break;
	}
	System.out.println(cost);
	sc.close();
}
}
