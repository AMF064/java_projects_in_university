package Loops.src;
import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        //Input
        Scanner in = new Scanner(System.in);
        System.out.println("Frase:");
        String string = in.nextLine();
        in.close();


        //Split sentence into words
        String[] words = string.split(" ");
        int len = words.length;

        //String for avoiding repetition in the output
        String[] registeredWords = new String[len];

        for(int i = 0; i < len; i++){
            int count = 0;
            boolean registered = false;
            for(int j = 0; j < len; j++)
                if(words[i].equalsIgnoreCase(registeredWords[j]))
                    registered = true;
            for(int j = 0; j < len && !registered; j++)
                if(words[j].equalsIgnoreCase(words[i]))
                    count++;
            if(!registered)
                System.out.println(words[i] + ":" + count);
            registeredWords[i] = words[i];
        }
    }
}
