package String.Ex;

public class String_demo {
	public static void main(String[] args) {
        String str = "Java is a powerful language";
        System.out.println("Total number of characters: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Original String: " + str);
        System.out.println("Substring from index 5: " + str.substring(5));
        System.out.println("Substring (5 to 13): " + str.substring(5, 13));
        System.out.println("Index of 'powerful': " + str.indexOf("powerful"));
        String paddedStr = "\t" + str + "\t";
        System.out.println("Padded String: [" + paddedStr + "]");
        System.out.println("Trimmed String: [" + paddedStr.trim() +"]");
        System.out.println("Replace 'a' with '*': " + str.replace("a", "*"));
        String nameStr = "Java makes coding fun";
        System.out.println(nameStr + " -> " + new StringBuffer(nameStr).reverse());
    }
}
