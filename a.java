//this is the changed version//

import java.util.*;
import java.io.*;
import javafx.util.Pair; 
import java.util.stream.Collectors;

class Result{
	 
    public static int minSwaps(List<Integer> list) 
    { 
          
    	 int[] arr = new int[list.size()]; 
          for (int i =0; i < list.size(); i++) 
            arr[i] = list.get(i); 

        int n = arr.length; 
  
        
        ArrayList <Pair <Integer, Integer> > arrpos = 
                  new ArrayList <Pair <Integer, Integer> > (); 
        for (int i = 0; i < n; i++) 
             arrpos.add(new Pair <Integer, Integer> (arr[i], i)); 
  
        
        arrpos.sort(new Comparator<Pair<Integer, Integer>>() 
        { 
            @Override
            public int compare(Pair<Integer, Integer> o1, 
                               Pair<Integer, Integer> o2) 
            { 
                if (o1.getKey() > o2.getKey()) 
                    return -1; 
  
                
                else if (o1.getKey().equals(o2.getKey())) 
                    return 0; 
  
                else
                    return 1; 
            } 
        }); 
  
         
        Boolean[] vis = new Boolean[n]; 
        Arrays.fill(vis, false); 
  
         
        int ans = 0; 
  
         
        for (int i = 0; i < n; i++) 
        { 
             
            if (vis[i] || arrpos.get(i).getValue() == i) 
                continue; 
  
            
            int cycle_size = 0; 
            int j = i; 
            while (!vis[j]) 
            { 
                vis[j] = true; 
  
                 
                j = arrpos.get(j).getValue(); 
                cycle_size++; 
            } 
  
            
            if(cycle_size > 0) 
            { 
                ans += (cycle_size - 1); 
            } 
        } 
  
        // Return result 
        return ans; 
    } 
} 
  
 
class a 
{ 
     
    public static void main(String[] args) 
    { 
         Scanner in=new Scanner(System.in);
       int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        
        List<Integer> a = Arrays.stream(arr)		// IntStream
									.boxed() 		// Stream<Integer>
									.collect(Collectors.toList());

        Result g=new Result();
        
       System.out.print( g.minSwaps(a));
	
    } 
} 
	
	



