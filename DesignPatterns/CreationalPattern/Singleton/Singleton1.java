package DesignPatterns.CreationalPattern.Singleton;

// import java.util.Arrays;
// import java.util.LinkedList;

public class Singleton1{
    // access point for any object or the one object that's 
    // going to be created from this class and this is statice because
    // objects like this almost always needed to be avaiable on a global basis

    private static Singleton1 firstInstance = null;
    //private karon to make sure there is only one instance for the class singleton
    
    String[] scrabbleLetters = 
    {"a", "a", "a", "a", "a", "a", "a", "a", "a","b", "b", "c", "c", 
    "d", "d", "d", "d", "e", "e", "e", "e", "e","e", "e", "e", "e", 
    "e", "e", "e", "f", "f", "g", "g", "g", "h","h", "i", "i", "i", 
    "i", "i", "i", "i", "i", "i", "j", "k", "l","l", "l", "l", "m", 
    "m", "n", "n", "n", "n", "n", "n", "o", "o","o", "o", "o", "o", 
    "o", "o", "p", "p", "q", "r", "r", "r", "r","r", "r", "s", "s", 
    "s", "s", "t", "t", "t", "t", "t", "t", "u","u", "u", "u", "v", 
    "v", "w", "w", "x", "y", "y", "z"}; 
    // private LinkedList<String> letterList = new LinkedList<String> (Arrays.asList(scrabbleLetters));
    static boolean firstThread = true;

    
    private Singleton1(){}

    //getinstance almost universally used as a method for the singleton pattern
    public static Singleton1 getInstance(){
        //instance create hoyeche naki check
        if(firstInstance == null){
            firstInstance = new Singleton1();
        }

        return firstInstance;
    }
}