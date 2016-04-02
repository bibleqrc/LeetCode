
public class Length_of_Last_Word {
	public static int lengthOfLastWord(String s) {
        if(s.length()==0)  return 0;
        String[] str = s.split(" ");
        int len = str.length;
        String last = str[len-1];
        return last.length();
    }
	
	public static void main(String[]  args){
		int l = lengthOfLastWord("Hello World");
		System.out.println(l);
	}
}
