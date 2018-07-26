package com.parambara.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	
	private static final Map<Character, Character> dnaComplementMap = new HashMap<Character, Character>() {
        { 
            put('A','T');
            put('T','A');
            put('C','G');
            put('G','C');
        }
    };
   


	    // Complete the dnaComplement function below.
	    static String dnaComplement(String s) {
	        String reverseComplement = "";
	        if (s != null) {
	            for (char c : s.toCharArray()) {
	                reverseComplement = dnaComplementMap.get(c) + reverseComplement;
	            }
	        }
	        return reverseComplement;

	    }
	    
	    static List<Integer> commandCount(List<String> commands) {
	        List<Integer> result = new ArrayList<Integer>();
	         Pattern pattern = Pattern.compile("([a-z]([a-z0-9])*\\:*\\/([a-z0-9])+\\\\+([a-z]+))*");
	         Matcher matcher = null;
	         int count;
	         for (String command : commands) {
	             matcher = pattern.matcher(command);
	             count = 1;
	             int start = 0;
	             while (matcher.find()) {
	            	 	//System.out.println(matcher.groupCount());
	            	 		count ++;
	             }
	             System.out.println(count);
	             result.add(count);
	         }
	         return result;
	     }




	    public static void main(String args[]) {
	    	List<String> commands = new ArrayList<>();
	    	commands.add("w:/a\bc::/12\\xyz"); //8
	    	commands.add(":/a\\bc::/12\\xyz");
	    	commandCount(commands);
	    }

}
