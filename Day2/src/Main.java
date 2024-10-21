import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("----------first xercise---------");

//        Develop a program that takes the weight (in kilograms) and height (in meters)
//        as input and calculates the BMI, then prints it.
       int Weight_kg = 70;
       double Height_m = 1.75;
       double IBM= 70/(1.75*1.75);
       String result =String.format("%.2f",IBM);
        System.out.println("The IBM: " + result );

        System.out.println("----------second exercise---------");

        //        Write a program that takes the obtained marks and total marks as input and
//        calculates the percentage, then prints it.
       int marks = 85;
      int total_marks = 100;
      int percentage_of_marks=(marks*100)/total_marks ; //check
        System.out.println("The percentage of marks is : "+ percentage_of_marks +"%");

        System.out.println("----------third exercise---------");

//        Create a program that takes an amount in one currency and an exchange rate
//        as input, then converts and prints the amount in another currency.
        int usd=100;
        double eur=0.85;
       double change_rate= 100*0.85;
        System.out.println("the change of rate is: "+ change_rate);

        System.out.println("---------- fourth exercise---------");

//        Create a program that takes a string as input, calculates its length, and then
//        reverses the string using the StringBuilder class, finally printing both the length and
//        reversed string.
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter Hello, World!");
        String hello_test =input.nextLine();
        StringBuilder s =new StringBuilder(hello_test);

       System.out.println("Length of the string: "+hello_test.length()+ " And Reversed string:" + s.reverse()
       );


        System.out.println("----------fifth exercise---------");

//
//        Develop a program that takes a sentence as input and extracts a substring from
//        it, then prints the extracted substring.


        System.out.println(" can u Please enter *The quick brown fox jumps over the lazy dog *");
        String sentence=input.nextLine();
        System.out.println(sentence.substring(10,20));



        System.out.println("----------sixth exercise---------");

//        Write a program that takes a sentence and a keyword as input, then check if
//        the keyword is present in the sentence and prints the result.

        System.out.println(" can u please enter * The quick brown fox jumps over the lazy dog *");
        String keyword_check =input.nextLine();
        String keyword ="jumps";
        System.out.println(keyword_check.contains(keyword));

        System.out.println("----------seventh exercise---------");
//        Develop a program that takes a sentence and a word to replace as input, then
//        replace all occurrences of the word with another word and prints the modified
//        sentence.

        System.out.println(" can u pleas enter *The quick brown fox jumps over the lazy dog*");
        String replace_word =input.nextLine();
        System.out.println(replace_word.replace("fox","cat"));

        System.out.println("----------eighth exercise---------");
//        Write a program that takes two strings as input and check if they are equal,
//                ignoring the case, then prints whether they are equal or not.

        System.out.println("Please enter two words first -Hello-");
        String word1 =input.nextLine();
        System.out.println("Please enter two words first -hello-");
        String word2=input.nextLine();
        System.out.println("Strings are equal "+word1.equalsIgnoreCase(word2));


    }

}