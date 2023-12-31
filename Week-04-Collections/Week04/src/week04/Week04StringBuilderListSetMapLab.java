package week04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week04StringBuilderListSetMapLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Why would we use a StringBuilder instead of a String?
		//StringBuilder is mutable.  Able to be changed.  String is immutable, unable to be changed.
				// 		a. Instantiate a new StringBuilder
			    System.out.println("Question 1: ");
			    String firstName = "Count";
			    String lastName = "Chocula";
			    String space = " ";
		        StringBuilder sb = new StringBuilder();
				//		b. Append the characters 0 through 9 to it separated by dashes
				// 				Note:  make sure no dash appears at the end of the StringBuilder
				sb.append(firstName);
				sb.append(space);
				sb.append(lastName);
				sb.append(space);
				
				for (int i = 0; i < 10; i++) {
					sb.append(i);
					if (i != 9) {
						sb.append(" - ");
					}
				}
				System.out.println(sb.toString());				
				
				
				// 2. List of String:
				//		a. Create a list of Strings 
				System.out.println("Question 2: ");
				List<String> strings = new ArrayList<String>();
				//		b. Add 5 Strings to it, each with a different length
				strings.add("Nelson");
				strings.add("Belinda");
				strings.add("Judith");
				strings.add("David");
				strings.add("Caleb");
				for (String string : strings) {
					System.out.println(string);
				}
				
				
				
				// 3. Write and test a method that takes a list of strings 
				//			and returns the shortest string
				System.out.println("Question 3: ");
				System.out.println(findShortString(strings));
				
				
				
				// 4. Write and test a method that takes a list of strings 
				//			and returns the list with the first and last element switched
				System.out.println("Question 4: ");
				System.out.println(switchName(strings));
				
								
				// 5. Write and test a method that takes a list of strings 
				//			and returns a string with all the list elements concatenated to each other,
				// 			separated by a comma
				System.out.println("Question 5: ");
				System.out.println(together(strings));
				
				

				
				// 6. Write and test a method that takes a list of strings and a string 
				//			and returns a new list with all strings from the original list
				// 			containing the second string parameter (i.e. like a search method)
				System.out.println("Question 6: ");
				List<String> searchResults = search(strings, "e");
				for (String result : searchResults) {
					System.out.println(result);
				}
				
				// 7. Write and test a method that takes a list of integers 
				//			and returns a List<List<Integer>> with the following conditions specified
				//			for the return value:
				//		a. The first List in the returned value contains any number from the input list 
				//			that is divisible by 2
				//		b. The second List contains values from the input list that are divisible by 3
				//		c. The third containing values divisible by 5, and 
				//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
				System.out.println("Question 7: ");
				
				List<Integer> numbers = Arrays.asList(1, 4, 5, 9, 10, 100, 45, 97);
				
				List<List<Integer>> sortedNumbers = numberSort(numbers);
				
				for (List<Integer> list : sortedNumbers) {
					for (Integer number : list) {
						System.out.println(number);
					}
					System.out.println("Next List ------------");
				}
				
				// 8. Write and test a method that takes a list of strings 
				//			and returns a list of integers that contains the length of each string
				System.out.println("Question 8: ");
				
				List<Integer> stringsLengths = calculateStringLength(strings);
				for (Integer i : stringsLengths) {
					System.out.println(i);
				}
				
				// 9. Create a set of strings and add 5 values
				System.out.println("Question 9: ");
				
				Set<String> set = new HashSet<String>();
				set.add("Nelson");
				set.add("Belinda");
				set.add("Caleb");
				set.add("Judith");
				set.add("David");
				
				for (String string : set) {
					System.out.println(string);
				}
				
				
				// 10. Write and test a method that takes a set of strings and a character 
				//			and returns a set of strings consisting of all the strings in the
				// 			input set that start with the character parameter.
				System.out.println("Question 10: ");
				
				Set<String> startsWithC = returnStrings(set, 'C');
				for (String word : startsWithC) {
					System.out.println(word);
				}
				
				// 11. Write and test a method that takes a set of strings 
				//			and returns a list of the same strings
				System.out.println("Question 11: ");
				
				List<String> resultList = convertSettoList(set);
				for (String listString : resultList) {
					System.out.println(listString);
				}
				

				// 12. Write and test a method that takes a set of integers 
				//			and returns a new set of integers containing only even numbers 
				//			from the original set
				System.out.println("Question 12: ");
				
				Set<Integer> integerSet = new HashSet<Integer>();
				integerSet.add(2);
				integerSet.add(1);
				integerSet.add(0);
				integerSet.add(100);
				integerSet.add(201);
				
				
				Set<Integer> extractNumber = evenNumbers(integerSet);
				for (Integer number : extractNumber) {
					System.out.println(number);
				}
				
				// 13. Create a map of string and string and add 3 items to it where the key of each
				// 			is a word and the value is the definition of the word
				System.out.println("Question 13: Map built");
				
				Map<String, String> dictionary = new HashMap<String, String>();
				dictionary.put("Computer", "Something that pays the bills");
				dictionary.put("Java", "A confusing but understandable language");
				dictionary.put("SQL", "Yes please!!");
				
				
			
				
				// 14. Write and test a method that takes a Map<String, String> and a string 
				// 			and returns the value for a key in the map that matches the
				// 			string parameter (i.e. like a language dictionary lookup)
				System.out.println("Question 14: ");
				
				String value = lookupValue(dictionary, "Java");
				
				System.out.println(value);
				
				// 15. Write and test a method that takes a List<String> 
				//			and returns a Map<Character, Integer> containing a count of 
				//			all the strings that start with a given character
				System.out.println("Question 15: ");
				
				Map<Character, Integer> count = countCharacter(resultList);
				for (Character character : count.keySet()) {
					System.out.println(character + " - " + count.get(character));
				}
				

			}
			
			
			// Method 15:
	public static Map<Character, Integer> countCharacter(List<String> list) {
		Map<Character, Integer> results = new HashMap<Character, Integer>();
		
		for (String string : list) {
			char c = string.charAt(0);
			if (results.get(c) == null) {
				results.put(c, 1);
			} else {
				results.put(c, results.get(c) + 1);
			}
		}		
		return results;		
	}
			
			
			// Method 14:
	public static String lookupValue(Map<String, String> map, String string) {
		for (String key : map.keySet()) {
			if (key.equals(string)) {
				return map.get(key);
			}
		}
		return "";
	}

			
			// Method 12:
	public static Set<Integer> evenNumbers(Set<Integer> set) {
		Set<Integer> results = new HashSet<Integer>();
		for (Integer number : set) {
			if (number % 2 == 0) {
				results.add(number);
			}
		}
		return results;
	}
			

			
			// Method 11:
	public static List<String> convertSettoList(Set<String> set) {
		List<String> results = new ArrayList<String>();
		for (String string : set) {
			results.add(string);
		}		
		return results;
	}
			


			// Method 10:
	public static Set<String> returnStrings(Set<String> set, char c) {	
		Set<String> results = new HashSet<String>();
		for (String string : set) {
			if (string.charAt(0) == c) {
				results.add(string);
			}
		}
		
		
		
		return results;
	}

			
			// Method 8:
	public static List<Integer> calculateStringLength(List<String> list) {
		List<Integer> lengths = new ArrayList<Integer>();
		for (String string : list) {
			lengths.add(string.length());
		}
		return lengths;
	}
			

			
			// Method 7:
	public static List<List<Integer>> numberSort(List<Integer> list) {
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		
		for (Integer number : list) {
			if (number % 2 == 0) {
				results.get(0).add(number);
			} if (number % 3 == 0) {
				results.get(1).add(number);				
			} if (number % 5 ==0) {
				results.get(2).add(number);
			} if (number % 2 != 0 && number % 3 != 0 && number % 5 != 0) {
				results.get(3).add(number);
			}
		}
		return results;
	}
			

			
			// Method 6:
	public static List<String> search(List<String> list, String query) {
		List<String> results = new ArrayList<String>();
		for (String string : list) {
			if (string.contains(query)) {
				results.add(string);
			}
		}
		return results;
	}
			

			
			// Method 5:
	public static String together(List<String> list) {
		StringBuilder sb = new StringBuilder();
		int count = 1;
		
		for (String string : list) {
			sb.append(string);
			if (count < list.size()) {
				sb.append(", ");
				
				count++;
			}
		}
		return sb.toString();
	}
			
			
			
			// Method 4:
	public static List<String> switchName(List<String> list) {
		String temp = list.get(0);
		list.set(0, list.get(list.size() - 1));
		list.set(list.size() - 1, temp);
		return list;
	}
			
			
			
			// Method 3:
	public static String findShortString(List<String> list) {
		String shortest = list.get(0);
		
		for (String string : list) {
			if (string.length() < shortest.length()) {
				shortest = string;
			}
			
		}
		return shortest;
	}
		
}


