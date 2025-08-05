package Scope;

class TestString {
	public static void main(String[] args) {
		String s1 ="Sai";
        String s2 = "Sai";
        System.out.println("s1 == s2");       
        s1 = s1 + "Abhinav";
        System.out.println("s1 == s2");        
        String s3 = "Sai Abhinav";
        System.out.println("s1 == s3");        
        System.out.println("s1.equals(s3) : " + s1.equals(s3)); 
    }
}