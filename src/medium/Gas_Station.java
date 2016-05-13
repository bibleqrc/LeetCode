/*There are N gas stations along a circular route, where the amount of gas at station i is gas[i].

You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from station i to its next station (i+1). You begin the journey with an empty tank at one of the gas stations.

Return the starting gas station's index if you can travel around the circuit once, otherwise return -1.

Note:
The solution is guaranteed to be unique.

维护sum代表途径的station的gas[i] - cost[i]的和，total代表所有station的gas[i] - cost[i]的和，
如果total < 0，是不可能存在解的，因为总收入小于总支出任何一条路径都无法回到原点。当sum<0的时候，就将loc指向下一个station，
因为之前的station所走的路一定无法到达。
 * 
 */
package medium;

public class Gas_Station {
  public int canCompleteCircuit(int[] gas, int[] cost) {
    if(gas.length==0 || cost.length ==0 ||cost.length!=gas.length){     
    	return -1;
    }
    int loc = 0,sum = 0,total = 0;
    for(int i=0;i<gas.length;i++){
    	sum+=gas[i]-cost[i];
    	total+=gas[i]-cost[i];
    	if(sum<0){
    		loc = i+1;
    		sum = 0;
    	}
    }
    if(total<0) return -1;
    else return loc;
  }
}
