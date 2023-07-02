import java.util.Arrays;

public class ArraysMethods {

  public static void main(String[] args) {
    
// 1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
    
    int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

    // a. Subtract first element from last element and print the result
    int result = ages[ages.length - 1] - ages[0];
    System.out.println(result);

    // b. Add a new age to the array and repeat the step above
    int newAge = 37;
    int[] newAges = new int[ages.length + 1];
    for (int i = 0; i < ages.length; i++) {
      newAges[i] = ages[i];
    }
    newAges[newAges.length - 1] = newAge;
    int newResult = newAges[newAges.length - 1] - newAges[0];
    System.out.println(newResult);

    // c. Calculate the average age
    int sum = 0;
    for (int i = 0; i < ages.length; i++) {
      sum += ages[i];
    }
    double average = (double) sum / ages.length;
    System.out.println(average);

// 2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
    
    String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

    // a. Calculate the average number of letters per name
    int totalLetters = 0;
    for (String name : names) {
      totalLetters += name.length();
    }
    double averageLetters = (double) totalLetters / names.length;
    System.out.println(averageLetters);

    // b. Concatenate all names together separated by spaces
    String allNames = "";
    for (String name : names) {
      allNames += name + " ";
    }
    System.out.println(allNames);
    
// 3. How do you access the last element of any array?
    /** To access the last element of any array all one should do is to use the last array .length - 1 which would look similar to my example. 
     * array[array.length - 1]
     */
    
// 4. How do you access the first element of any array?
    
    /** The array being used along with "[0]" which is similar to the question above an example would look like this:
     * array[0]
     */
    
// 5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
  
    int[] nameLengths = new int[names.length];

    for (int i = 0; i < names.length; i++) {
      nameLengths[i] = names[i].length();
    }

    System.out.println(Arrays.toString(nameLengths));
    
// 6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
  
    int[] nameLengths1 = new int[names.length];

    for (int i = 0; i < names.length; i++) {
      nameLengths1[i] = names[i].length();
    }

    int sum1 = 0;
    for (int i = 0; i < nameLengths1.length; i++) {
      sum1 += nameLengths1[i];
    }

    System.out.println(sum1);
    
//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
    
    String word = "Hello";
    int n = 3;
    String result1 = repeatWord(word, n);
    System.out.println(result1);
  }

  public static String repeatWord(String word, int n) {
    String result = "";
    for (int i = 0; i < n; i++) {
      result += word;
    }
    return result;
    
// 8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
    
    String firstName1 = "Trevon";
    String lastName = "Ross";
    String fullName = fullName(firstName1, lastName);
    System.out.println(fullName); }
    
  

  public static String fullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  
// 9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
    
    int[] numbers1 = {10, 20, 30, 40};
    boolean isGreaterThan100 = isSumGreaterThan100(numbers1);
    System.out.println(isGreaterThan100);
  }

  public static boolean isSumGreaterThan100(int[] numbers1) {
    int sum = 0;
    for (int i = 0; i < numbers1.length; i++) {
      sum += numbers1[i];
    }
    return sum > 100;
    
// 10. Write a method that takes an array of double and returns the average of all the elements in the array.
  
    double[] numbers2 = {2.5, 3.0, 4.0, 1.5, 2.0};
    double average = calculateAverage(numbers2);
    System.out.println("The average is: " + average);
  }

  public static double calculateAverage(double[] numbers2) {
    double sum = 0;
    for (int i = 0; i < numbers2.length; i++) {
      sum += numbers2[i];
    }
    return sum / numbers2.length;
    
// 11.   Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
    
    double[] arr1 = {2.5, 3.0, 4.0, 1.5, 2.0};
    double[] arr2 = {1.0, 2.0, 3.0, 4.0, 5.0};
    boolean results = compareAverages(arr1, arr2);
    System.out.println("Is the average of arr1 greater than the average of arr2? " + results);
  }
  public static boolean compareAverages(double[] arr1, double[] arr2) {
    double sum1 = 0;
    double sum2 = 0;
    for (int i = 0; i < arr1.length; i++) {
      sum1 += arr1[i];
    }
    for (int i = 0; i < arr2.length; i++) {
      sum2 += arr2[i];
    }
    double avg1 = sum1 / arr1.length;
    double avg2 = sum2 / arr2.length;
    return avg1 > avg2;
  }
// 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
  
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
      return isHotOutside && moneyInPocket > 10.50;
    }
      
// 13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
      
      public static double calculationOfProfit(double[] expenses, double[] income) {
        double totalExpenses = 0;
        double totalIncome = 0;

        for (double expense : expenses) {
            totalExpenses += expense;
        }

        for (double inc : income) {
            totalIncome += inc;
        }
        
        double profit = totalIncome - totalExpenses;

        return profit;
        
/* Hence, I am an accounting major, I've decided to use my learning from recent weeks to discover different calculations of Accounting. I used the double array to be the expense, income, and profit which 
        could also be a loss. The method I used subtracts the sum of income to calculate the profit or loss which would then return as a double. All in all, I believe I can make my own coding for future 
        accounting organizations with this type of methods. 
        */
      
      }

}
  
