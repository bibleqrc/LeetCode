
public class Rectangle_Area {
	 public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
	      long area1=(C-A)*(D-B);
	      long area2=(G-E)*(H-F);
	      long overlap = overlapping(A,B,C,D,E,F,G,H);
	      return (int)(area1+area2-overlap);
	      
	    }

	private long overlapping(int A, int B, int C, int D, int E, int F, int G, int H) {
		
		long h1 = Math.max(B, F);
		long h2 = Math.min(D, H);
		long h = h2-h1;
		
		long v1 = Math.max(A, E);
		long v2 = Math.min(C, G);
		long v = v2-v1;
		
    	if(h<=0||v<=0)  return 0;
		else return v*h;
		
	}
}
