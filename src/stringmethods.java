public class stringmethods
{
    public static void main(String[] args) {
        //how to find the length of our string
        String name = "Harry";
        int value = name.length();
        System.out.println (value);
        //use to lower case method
        String lstring = name.toLowerCase();
        System.out.println(lstring);
        //to upper case
        String ustring = name.toUpperCase();
        System.out.println(ustring);
        //to non trimmed string
        String nonTrimmedString = "      Harry       ";
        System.out.println(nonTrimmedString);

        String TrimmedString = nonTrimmedString.trim();
        System.out.println(TrimmedString);
        //sub string method
        System.out.println(name.substring(2));
        //sub string method in which we gave both start and end points
        System.out.println(name.substring(1,5));
        //Replace r with p and target string to its replacement
        System.out.println(name.replace('r','p'));
        System.out.println(name.replace("rry","ier"));
        //name starts with our give condition example is "ha" if yes true otherwise false
        System.out.println(name.startsWith("Har"));
        System.out.println(name.endsWith("Har"));
        //charAT method
        System.out.println(name.charAt(0));
        //indexOf
        System.out.println(name.indexOf("r"));
        //name.Equal
        System.out.println(name.equals("Harry"));
        //Equal ignore case
        System.out.println(name.equalsIgnoreCase("HArRy"));
        //escape sequence character
        System.out.println("I am escape sequence\ndouble quote");
        System.out.println("I am escape sequence\tdouble quote");
//        letter template
        String letter = "Dear <|name|>, Thanks a lot! ";
        letter = letter.replace("<|name|>","Harry");
        System.out.println(letter);







    }
}
