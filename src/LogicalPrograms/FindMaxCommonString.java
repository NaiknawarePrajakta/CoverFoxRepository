package LogicalPrograms;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class FindMaxCommonString {

	public static void main(String[] args) {
		
		//Find max common string kar
		String s1 = "Tendulkar";
        String s2 = "Gavaskar";
        for(int i=0;i<=s1.length()-1;i++)
        {
        	for(int j=0;j<=s2.length()-1;j++)
        	{
        		char temp1 = s2.charAt(i);
        	
        	}
        		String temp = "kar";
				if(s1.equals(s2))
        		{
        			System.out.println(temp);
        		}
        			
 
        }
		
		  
		       /* String s1 = "Tendulkar";
		        String s2 = "Gavaskar";
		        System.out.println("Longest common substring: " + longestCommonSubstring(s1, s2));
		    }

		    public static String longestCommonSubstring(String s1, String s2) {
		        int m = s1.length();
		        int n = s2.length();
		        
		        // Create a 2D array to store lengths of longest common suffixes
		        int[][] dp = new int[m + 1][n + 1];
		        int maxLength = 0; // Length of the longest common substring
		        int endIndexS1 = 0; // End index of the longest common substring in s1
		        
		        // Build the dp array
		        for (int i = 1; i <= m; i++) {
		            for (int j = 1; j <= n; j++) {
		                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
		                    dp[i][j] = dp[i - 1][j - 1] + 1;
		                    if (dp[i][j] > maxLength) {
		                        maxLength = dp[i][j];
		                        endIndexS1 = i - 1;
		                    }
		                } else {
		                    dp[i][j] = 0;
		                }
		            }
		        }
		        
		        // Extract the longest common substring
		        return s1.substring(endIndexS1 - maxLength + 1, endIndexS1 + 1);
		    */}
		    
		    
		

	}


