package edu.umsl.java3816.foodDiaryAssignment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.util.Calendar;
import java.util.Scanner;

public class NutritionalValues extends Meals implements FatsAndVitamins {

	int calories;
	int caloriesFromFat;
	int totalFat;
	int cholesterol;
	int sodium;
	int potassium;
	int totalCarbohydrates;
	int dietaryFiber;
	int sugars;
	int protein;
	String vitamins;
	int saturatedFat;
	int transFat;
	String vitaminA;
	String vitaminC;
	String calcium;
	String iron;

	public NutritionalValues(Date date, String dateOfMeal, boolean dateFlag, Calendar cal1, String meal,
			String foodItem, Scanner input, int selection, NutritionalValues nv, int calories, int caloriesFromFat,
			int totalFat, int cholesterol, int sodium, int potassium, int totalCarbohydrates, int dietaryFiber,
			int sugars, int protein, String vitamins, int saturatedFat, int transFat, String vitaminA, String vitaminC,
			String calcium, String iron) {
		super(date, dateOfMeal, dateFlag, cal1, meal, foodItem, input, selection, nv);
		this.calories = calories;
		this.caloriesFromFat = caloriesFromFat;
		this.totalFat = totalFat;
		this.cholesterol = cholesterol;
		this.sodium = sodium;
		this.potassium = potassium;
		this.totalCarbohydrates = totalCarbohydrates;
		this.dietaryFiber = dietaryFiber;
		this.sugars = sugars;
		this.protein = protein;
		this.vitamins = vitamins;
		this.saturatedFat = saturatedFat;
		this.transFat = transFat;
		this.vitaminA = vitaminA;
		this.vitaminC = vitaminC;
		this.calcium = calcium;
		this.iron = iron;
	}

	Meals mls = new Meals();

	public NutritionalValues() {

	}

	public int getCalories() {

		System.out.print("Calories: ");
		input = new Scanner(System.in);
		calories = input.nextInt();
		return calories;
	}

	public int getCaloriesFromFat() {

		System.out.print("Calories from fat: ");
		input = new Scanner(System.in);
		caloriesFromFat = input.nextInt();
		return caloriesFromFat;

	}

	public int getTotalFat() {
		System.out.print("Total fat: ");
		input = new Scanner(System.in);
		totalFat = input.nextInt();
		return totalFat;
	}

	public int getCholesterol() {

		System.out.print("Cholesterol: ");
		input = new Scanner(System.in);
		cholesterol = input.nextInt();
		return cholesterol;
	}

	public int getSodium() {

		System.out.print("Sodium: ");
		input = new Scanner(System.in);
		sodium = input.nextInt();
		return sodium;
	}

	public int getPotassium() {

		System.out.print("Potassium: ");
		input = new Scanner(System.in);
		potassium = input.nextInt();
		return potassium;
	}

	public int getTotalCarbohydrates() {

		System.out.print("Total carbohydrates: ");
		input = new Scanner(System.in);
		totalCarbohydrates = input.nextInt();
		return totalCarbohydrates;
	}

	public int getDietaryFiber() {

		System.out.print("Dietary fiber: ");
		input = new Scanner(System.in);
		dietaryFiber = input.nextInt();
		return dietaryFiber;
	}

	public int getSugars() {

		System.out.print("Sugars: ");
		input = new Scanner(System.in);
		sugars = input.nextInt();
		return sugars;
	}

	public int getProtein() {

		System.out.print("Protein: ");
		input = new Scanner(System.in);
		protein = input.nextInt();
		return protein;
	}

	public String getVitamins() {
		int answer;
		System.out.print("Are there any % vitamins in the food item? ('1' for yes or '2' for no)");
		answer = input.nextInt();
		switch (answer) {

		case 1:
			getVitaminA();
			getVitaminC();
			getCalcium();
			getIron();
			vitamins = vitaminA + "," + vitaminC + "," + calcium + "," + iron;
			break;

		case 2:
			vitaminA = "0%";
			vitaminC = "0%";
			calcium = "0%";
			iron = "0%";
			vitamins = vitaminA + "," + vitaminC + "," + calcium + "," + iron;
			break;
		}
		return vitamins;
	}

	public int getSaturatedFat() {

		System.out.print("Saturated fat: ");
		input = new Scanner(System.in);
		saturatedFat = input.nextInt();

		return saturatedFat;
	}

	public int getTransFat() {

		System.out.print("transFat: ");
		input = new Scanner(System.in);
		transFat = input.nextInt();

		return transFat;
	}

	public String getVitaminA() {

		System.out.print("Vitamin A: ");
		input = new Scanner(System.in);
		vitaminA = input.next() + "%";

		return vitaminA;
	}

	public String getVitaminC() {

		System.out.print("Vitamin C: ");
		input = new Scanner(System.in);
		vitaminC = input.next() + "%";

		return vitaminC;
	}

	public String getCalcium() {

		System.out.print("Calcium: ");
		input = new Scanner(System.in);
		calcium = input.next() + "%";

		return calcium;
	}

	public String getIron() {

		System.out.print("Iron: ");
		input = new Scanner(System.in);
		iron = input.next() + "%";

		return iron;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public void setCaloriesFromFat(int caloriesFromFat) {
		this.caloriesFromFat = caloriesFromFat;
	}

	public void setTotalFat(int totalFat) {
		this.totalFat = totalFat;
	}

	public void setCholesterol(int cholesterol) {
		this.cholesterol = cholesterol;
	}

	public void setSodium(int sodium) {
		this.sodium = sodium;
	}

	public void setPotassium(int potassium) {
		this.potassium = potassium;
	}

	public void setTotalCarbohydrates(int totalCarbohydrates) {
		this.totalCarbohydrates = totalCarbohydrates;
	}

	public void setDietaryFiber(int dietaryFiber) {
		this.dietaryFiber = dietaryFiber;
	}

	public void setSugars(int sugars) {
		this.sugars = sugars;
	}

	public void setProtein(int protein) {
		this.protein = protein;
	}

	public void setVitamins(String vitamins) {
		this.vitamins = vitamins;
	}

	public void setSaturatedFat(int saturatedFat) {
		this.saturatedFat = saturatedFat;
	}

	public void setTransFat(int transFat) {
		this.transFat = transFat;
	}

	public void setVitaminA(String vitaminA) {
		this.vitaminA = vitaminA;
	}

	public void setVitaminC(String vitaminC) {
		this.vitaminC = vitaminC;
	}

	public void setCalcium(String calcium) {
		this.calcium = calcium;
	}

	public void setIron(String iron) {
		this.iron = iron;
	}

	public void writeToFile() {

		BufferedWriter bw = null;
		File file = new File("foodDiaryDetails.csv");
		if (!file.exists()) {

			try {
				bw = new BufferedWriter(new FileWriter("foodDiaryDetails.csv"));
				bw.write("DATE,MEAL,FOODITEM,CALORIES,CALORIES FROM FAT,"
						+ "TOTAL FAT,CHOLESTEROL,SODIUM,POTASSIUM,TOTAL CARBOHYDRATES,"
						+ "DIETARY FIBER,SUGARS,PROTEIN,SATURATED FAT,TRANSFAT,VITAMIN A,VITAMIN C," + "CALCIUM,IRON");
				bw.newLine();
				bw.close();
			} catch (IOException e1) {

				e1.printStackTrace();
			}
		}
		try {
			bw = new BufferedWriter(new FileWriter("foodDiaryDetails.csv", true));
			bw.write(mls.getDateOfMeal() + "," + mls.getMeal() + "," + mls.getFoodItem() + "," + nv.getCalories() + ","
					+ nv.getCaloriesFromFat() + "," + nv.getTotalFat() + "," + nv.getCholesterol() + ","
					+ nv.getSodium() + "," + nv.getPotassium() + "," + nv.getTotalCarbohydrates() + ","
					+ nv.getDietaryFiber() + "," + nv.getSugars() + "," + nv.getProtein() + "," + nv.getSaturatedFat()
					+ "," + nv.getTransFat() + "," + nv.getVitamins());
			bw.newLine();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Meals getMls() {
		return mls;
	}

	public void setMls(Meals mls) {
		this.mls = mls;
	}

	public NutritionalValues createFoodDiary(int dateOfMeal, String meal, String foodItem, int calories,
			int caloriesFromFat, int totalFat, int cholesterol, int sodium, int potassium, int totalCarbohydrates,
			int dietaryFiber, int sugars, int protein, int saturatedFat, int transFat, String vitamins) {

		return new NutritionalValues();
	}
}