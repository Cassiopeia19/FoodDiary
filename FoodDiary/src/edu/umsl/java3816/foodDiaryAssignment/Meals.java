package edu.umsl.java3816.foodDiaryAssignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Meals {

	Date date;
	String dateOfMeal;
	boolean dateFlag;
	private Calendar cal1 = new GregorianCalendar();
	String meal;
	String foodItem;
	public Scanner input;
	int selection;
	static NutritionalValues nv = new NutritionalValues();

	public Meals(Date date, String dateOfMeal, boolean dateFlag, Calendar cal1, String meal, String foodItem,
			Scanner input, int selection, NutritionalValues nv) {
		super();
		this.date = date;
		this.dateOfMeal = dateOfMeal;
		this.dateFlag = dateFlag;
		this.cal1 = cal1;
		this.meal = meal;
		this.foodItem = foodItem;
		this.input = input;
		this.selection = selection;
		Meals.nv = nv;
	}

	public Meals() {

	}

	public Date getDate() {
		return date;
	}

	public String getDateOfMeal() {

		System.out.print("Enter date of the meal (MM/DD/YY): ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputText = null;
		try {
			inputText = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yy");
		ParsePosition pos = new ParsePosition(0);
		java.util.Date date = formatter.parse(inputText, pos);
		dateOfMeal = formatter.format(date);
		dateFlag = true;
		System.out.println("The date of the meal was entered as: " + dateOfMeal);

		return dateOfMeal;
	}

	public boolean isDateFlag() {
		return dateFlag;
	}

	public Calendar getCal1() {
		return cal1;
	}

	public void Menu() {

		NutritionalValues nv = new NutritionalValues();

		do {

			System.out.println("Menu of options: ");
			System.out.println();
			System.out.println("'1' Create/append to a Food Diary");
			System.out.println("'2' Exit");

			input = new Scanner(System.in);
			selection = input.nextInt();

			if (selection != 1) {
				break;
			}

			nv.writeToFile();

		} while (selection == 1);

	}

	public String getMeal() {

		System.out.println("Meal selections: ");
		System.out.println();
		System.out.println("'1' for Breakfast");
		System.out.println("'2' for Lunch");
		System.out.println("'3' for Snack");
		System.out.println("'4' for Dinner");
		System.out.println();
		System.out.print("Enter your selection: ");
		System.out.println();

		input = new Scanner(System.in);
		selection = input.nextInt();

		switch (selection) {

		case 1:
			meal = "Breakfast";
			System.out.println("For " + meal + ", enter the following values: ");
			break;
		case 2:
			meal = "Lunch";
			System.out.println("For " + meal + ", enter the following values: ");
			break;
		case 3:
			meal = "Snack";
			System.out.println("For " + meal + ", enter the following values: ");
			break;
		case 4:
			meal = "Dinner";
			System.out.println("For " + meal + ", enter the following values: ");
			break;
		}
		return meal;
	}

	public String getFoodItem() {

		System.out.print("Food item: ");

		input = new Scanner(System.in);
		foodItem = input.nextLine();

		return foodItem;
	}

	public Scanner getInput() {
		return input;
	}

	public int getSelection() {
		return selection;
	}

	public NutritionalValues getNv() {
		return nv;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setDateOfMeal(String dateOfMeal) {
		this.dateOfMeal = dateOfMeal;
	}

	public void setDateFlag(boolean dateFlag) {
		this.dateFlag = dateFlag;
	}

	public void setCal1(Calendar cal1) {
		this.cal1 = cal1;
	}

	public void setMeal(String meal) {
		this.meal = meal;
	}

	public void setFoodItem(String foodItem) {
		this.foodItem = foodItem;
	}

	public void setInput(Scanner input) {
		this.input = input;
	}

	public void setSelection(int selection) {
		this.selection = selection;
	}

	public void setNv(NutritionalValues nv) {
		Meals.nv = nv;
	}
}
