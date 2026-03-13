public class ps3 {
    public static void main(String[] args) {
//        problem 1 convert string into lower case
        String name = "Jack Parker";
        name = name.toLowerCase();
        System.out.println(name);

//        Problem 2 space replace from under score (_)
        String Text = "My Name Is Ammar";
        Text = Text.replace(" ", "_");
        System.out.println(Text);

//        Problem 3 Dear <|name|> convert with any name and print name + thanks a lot!
        String Letter = "Dear <|name|>, Thanks a lot!";
        Letter = Letter.replace("<|name|>", "Ammar");
        System.out.println(Letter);

//        Detect Double and Triple spaces in a string
        String myString = "This line contains  double and   triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

//        problem no 5 format the letter using escape sequence character
        String myLetter = "Dear Ammar,\n\t This Java Course Is Interesting.\n\t Thanks!";
        System.out.println(myLetter);
//        \t for tab \n for next line.






    }
}

