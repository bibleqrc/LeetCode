
public class ZigZag_Conversion {
    public static String convert(String s,int nrows){
    	int i =0,j,cnt = 0,k;
    	StringBuffer a = new StringBuffer();
    	
    	if(s==null||s.length()<=nrows||nrows<=1) return s;
    	
    	for(i=0;i<s.length();i=i+2*nrows-2)
    		a.append(s.charAt(i));
    	
    	for(i=1;i<nrows-1;i++){
    		
    		for(j=i;j<s.length();j=j+2*nrows-2){
    			
    			a.append(s.charAt(j));
    			if(j+2*nrows-2-2*i<s.length())
    			{
    				a.append(s.charAt(j+2*nrows-2-2*i));
    			}
    		}
    	}
    	
    	for(i = nrows-1;i<s.length();i=i+2*nrows-2)
    		a.append(s.charAt(i));
    	return a.toString();
    }
}
