import java.util.ArrayList;
import java.util.Collections;

public class Q33Circus implements Comparable<Q33Circus>{
	int ht;
    int wt;
    
    Q33Circus(int h,int w)
    {
        ht = h;
        wt = w;
    }   
    public int compareTo1(Q33Circus o) {
    
        if(this.ht == o.ht)
        {
            if(this.wt == o.wt)
            {
                 return 0;
            }
            else
                return this.wt>o.wt?1:-1;
            
        }
        else
        {
            return this.ht>o.ht?1:-1;
        }
        
    }

    @Override
    public String toString() {
        return "("+ht+","+wt+")";
    }
    
    static int findMaxSeqLength(int[] wts)
    {
        int fitlength = 0;
        int maxseqlength = 0;
   for(int i =1;i<wts.length;i++)
    {
        
        if(wts[i]>wts[i-1])
        {
            if((i-1)==0 || i==wts.length-1)
            fitlength+=1;
            fitlength++;
        }
        else 
        {
            fitlength = 0;
        }
        if(fitlength>maxseqlength)
                maxseqlength = fitlength;
    }
    
    return maxseqlength;
    }

	public static void main(String[] args){
		ArrayList<Integer> maxSeqLengths = new ArrayList<Integer>();
	    
		Q33Circus obj1 = new Q33Circus(1,12);
		Q33Circus obj2 = new Q33Circus(2,14);
		Q33Circus obj3 = new Q33Circus(3,16);
		Q33Circus obj4 = new Q33Circus(4,50);
		Q33Circus obj5 = new Q33Circus(5,40);
		Q33Circus obj6 = new Q33Circus(6,70);
	    
	    ArrayList<Q33Circus> mylist = new ArrayList<>();
	    mylist.add(obj1);
	    mylist.add(obj2);
	    mylist.add(obj3);
	    mylist.add(obj4);
	    mylist.add(obj5);
	    mylist.add(obj6);
	    Collections.sort(mylist);
	   int[] wts = new int[mylist.size()];
	   int j = 0;
	    for(Q33Circus i:mylist)
	    {
	        System.out.println(i);
	        wts[j++] = i.wt;
	    }
	   int maxseqlength = findMaxSeqLength(wts);
	    System.out.println("length="+maxseqlength);
	    
	    
	}
	@Override
	public int compareTo(Q33Circus o) {
		// TODO Auto-generated method stub
		return 0;
	}
	}


