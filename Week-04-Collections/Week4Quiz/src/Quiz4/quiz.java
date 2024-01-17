package Quiz4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listOfNames = new ArrayList<String>();
		listOfNames.add("Richard");
		listOfNames.add("Nelson");
		listOfNames.add("Belinda");
		
		System.out.println(listOfNames);
		
		System.out.println("___________________________");
		System.out.println(listOfNames.get(2));
		
		System.out.println(" ");
		System.out.println("___________________________________");
		System.out.println(halfTheList(listOfNames));
		
	}
	
	public static List<String> halfTheList(List<String> listOfNames) {
		List<String> resultList = new ArrayList<>();
		
		for (int index = 0; index < listOfNames.size(); index++) {
			if (!(index % 2 == 0)) {
				resultList.add(listOfNames.get(listOfNames.size() - 1));
			}
		}
		return resultList;
	
	}

	private static List<String> returnValuesForKeysStartingWithA(Map<String, String> dictionary) {
		
		List<String> resultList = new ArrayList<>();
		Set<String> keySet = dictionary.keySet();
		
		for (String key : keySet) {
			if (key.toLowerCase().charAt(0) == 'a') {
				resultList.add(dictionary.get(key));
			}
	}
		return resultList;
}
}
