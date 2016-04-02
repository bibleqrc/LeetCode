import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/*
 * 299. Bulls and Cows My Submissions Question Total Accepted: 19777 Total Submissions: 69126 Difficulty: Easy
You are playing the following Bulls and Cows game with your friend: You write down a number and ask your friend to guess what the number is. Each time your friend makes a guess, you provide a hint that indicates how many digits in said guess match your secret number exactly in both digit and position (called "bulls") and how many digits match the secret number but locate in the wrong position (called "cows"). Your friend will use successive guesses and hints to eventually derive the secret number.

For example:

Secret number:  "1807"
Friend's guess: "7810"
Hint: 1 bull and 3 cows. (The bull is 8, the cows are 0, 1 and 7.)
Write a function to return a hint according to the secret number and friend's guess, use A to indicate the bulls and B to indicate the cows. In the above example, your function should return "1A3B".

Please note that both secret number and friend's guess may contain duplicate digits, for example:

Secret number:  "1123"
Friend's guess: "0111"
In this case, the 1st 1 in friend's guess is a bull, the 2nd or 3rd 1 is a cow, and your function should return "1A1B".
You may assume that the secret number and your friend's guess only contain digits, and their lengths are always equal.
 */
public class Bulls_and_Cows {

	 public String getHint(String secret, String guess) {
	        char[]  secrets = secret.toCharArray();
	        char[]  guesses = guess.toCharArray();
	        
	        HashMap<Character,Integer> maps = new HashMap<>();
	        List<Character> postDealList = new LinkedList<>();
	        
	        int As = 0,Bs=0;
	        
	        for(int i=0;i<secrets.length;i++)
	        {
	            if(secrets[i]==guesses[i])
	              As++;
	             else{
	                 if(!maps.containsKey(secrets[i]))
	                    maps.put(secrets[i],0);
	                    
	                  maps.replace(secrets[i],maps.get(secrets[i])+1);
	                  postDealList.add(guesses[i]);
	             }
	        }
	        
	        int size = postDealList.size();
	         for(int i = 0;i<size;i++){
	            char guessChar = postDealList.get(i);
	            if(maps.containsKey(guessChar)){
	                int val = maps.get(guessChar);
	                Bs++;
	                if(val - 1 == 0)
	                    maps.remove(guessChar);
	                else
	                    maps.replace(guessChar,val-1);
	            }
	        }
	        
	        return String.valueOf(As)+"A"+String.valueOf(Bs)+"B";
	    }
	    
	
}
