# FoodDiary
This app writes to a csv file, where a user can create a new one or append to an existing one
The *App* class houses the *main method*, which calls to the *Meals* class, and the method *Menu* within that class.
*Meals* class houses the variables:  date, dateOfMeal, dateFlag, cal1, meal, foodItem, input, selection, and makes mention of the static class *NutritionalValues*, which extends *Meals* and implements *FatsAndVitamins*.
After the variables were declared within Meals, the constructor was made, as well as a blank constructor.
Next, getters & setters were generated.
Within the *Menu* method, there is a call to *Nutritional Values* class.
The do/while provides the user with a menu of options, where they can 'create/append to a Food Diary' or 'exit'.
This is followed by an *if* statement that allows for the exit of the system, and it will continue to loop until the exit because of the *while* statement.
Witin the 'getMeal()' method, the user is provided *meal selections* of: breakfast, lunch, snack, dinner.  They are then prompted for their selection.
Once they have entered their selection, the *switch/case* takes them to their selection & then prompts them to enter the *nutritional values*.
*getFoodItem* takes in the user's input of what they ate for that particular meal.

*NutritionalValues* has the following variables:  calories, caloriesFromFat, totalFat, cholesterol, sodium, potassium, totalCarbohydrates, dietaryFiber, sugars, protein, vitamins, saturatedFat, transFat, vitaminA, vitaminC, calcium, and iron.
Because this is an extension of the *Meals* class, the constructor has those variables, along with the nutritional value variables.
Meals is referenced right below this constructor, and then there is a blank constructor.
getters & setters have been declared.
All of the getters are methods, but one of them--*getVitamins*--has a switch/case that returns a value for each item (*FatsAndVitamins* interface contains these methods' signatures).
The *writeToFile()* method takes all of the data entered and writes it to a csv file called, *"foodDiaryDetails.csv"*.

	public NutritionalValues createFoodDiary(int dateOfMeal, String meal, String foodItem, int calories,
			int caloriesFromFat, int totalFat, int cholesterol, int sodium, int potassium, int totalCarbohydrates,
			int dietaryFiber, int sugars, int protein, int saturatedFat, int transFat, String vitamins) {

		return new NutritionalValues();
		
	}
is there, but I cannot remember 'how' this got to be there, as this project is over one year old.  I only know that this ensures that all of the variable values from both *nutritional values*, as well as *meals* returns the values from these classes.
