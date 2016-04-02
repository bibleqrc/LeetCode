/*
 * 
 * 计算所有不大于正整数n的素数的个数
 * 
 */
public class count_Primes {
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n+1];
        for(int i =0;i<n;i++)
                 isPrime[i]=true;
        
        for(int j=2;j*j<n;j++){
       	 if(!isPrime[j])  continue;
       	 
       	 for(int k = j*j;k<n;k+=j)
       		 isPrime[k]=false;
        }
        
        int count = 0;
        for(int a=2;a<n;a++)
       	 if(isPrime[a]) count++;
        
        return count;
    }
}
