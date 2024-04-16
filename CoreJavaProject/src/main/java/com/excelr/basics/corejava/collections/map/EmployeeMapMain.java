package com.excelr.basics.corejava.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EmployeeMapMain {

	public static void main(String[] args) {
		Address address1 = new Address();
		address1.setAddress1("Street 1");
		address1.setAddress2("Gajuwaka");
		address1.setCity("Vizag");
		address1.setState("AP");
		
		Address address2 = new Address();
		address2.setAddress1("Street 2");
		address2.setAddress2("Srinagar");
		address2.setCity("Vizag");
		address2.setState("AP");
		
		Address address3 = new Address();
		address3.setAddress1("Street 3");
		address3.setAddress2("KR Puram");
		address3.setCity("Bangalore");
		address3.setState("Karnataka");
		
		Address address4 = new Address();
		address4.setAddress1("Street 4");
		address4.setAddress2("Northridge");
		address4.setCity("Los Angeles");
		address4.setState("California");
		
		Address address5 = new Address();
		address5.setAddress1("Street 23");
		address5.setAddress2("New Jersey");
		address5.setCity("New York City");
		address5.setState("New York State");
		
		Employee emp1 = new Employee();
		emp1.setEmpId(1);
		emp1.setName("BOB");
		emp1.setOrganization("FinTech Industries");
		
		Employee emp2 = new Employee();
		emp2.setEmpId(2);
		emp2.setName("JAMES");
		emp2.setOrganization("FinTech Industries");
		
		Employee emp3 = new Employee();
		emp3.setEmpId(3);
		emp3.setName("OMEN");
		emp3.setOrganization("FinTech Industries");
		
		Employee emp4 = new Employee();
		emp4.setEmpId(4);
		emp4.setName("KILLJOY");
		emp4.setOrganization("FinTech Industries");
		
		Employee emp5 = new Employee();
		emp5.setEmpId(5);
		emp5.setName("VIPER");
		emp5.setOrganization("FinTech Industries");
		
		Map<Employee, Address> mapEmpAdd = new LinkedHashMap<>();
		mapEmpAdd.put(emp1, address1);
		mapEmpAdd.put(emp2, address2);
		mapEmpAdd.put(emp3, address3);
		mapEmpAdd.put(emp4, address4);
		mapEmpAdd.put(emp5, address5);
		mapEmpAdd.put(null, address5);
//		mapEmpAdd.put(emp1, address5);

		mapEmpAdd.forEach((key, value) -> System.out.println(key + " : " + value));
		
		int mapSize = mapEmpAdd.size();
        System.out.println("Size of the map: " + mapSize);
        System.out.println();
        
        boolean isEmpty = mapEmpAdd.isEmpty();
        System.out.println("Is map empty? " + isEmpty);
        System.out.println();
        
        Employee keyToFetch = emp3; // Example key
        Address value = mapEmpAdd.get(keyToFetch);
        System.out.println("Value for key " + keyToFetch + ": " + value);
        
        mapEmpAdd.remove(emp1);
        System.out.println();
        
        mapSize = mapEmpAdd.size();
        System.out.println("Size of the map: " + mapSize);
        System.out.println();
             
        boolean containsKey = mapEmpAdd.containsKey(emp1);
        System.out.println("Does map contain key " + emp1 + "? " + containsKey);
        System.out.println();
        
        containsKey = mapEmpAdd.containsKey(emp2);
        System.out.println("Does map contain key " + emp1 + "? " + containsKey);
        System.out.println();
        
        boolean containsValue = mapEmpAdd.containsValue(address1);
        System.out.println("Does map contain value " + address1 + "? " + containsValue);
        System.out.println();
        
        
        for(Employee name : mapEmpAdd.keySet())
        {
        	System.out.println(name);
        }
        System.out.println();
        
        for(Employee name : mapEmpAdd.keySet())
        {
        	System.out.println(mapEmpAdd.get(name));
        }
        System.out.println();
        
        
        for(Address add : mapEmpAdd.values())
        {
        	System.out.println(add);
        }
        System.out.println();
        
        
        for (Entry<Employee, Address> entrySet1 : mapEmpAdd.entrySet())
        {
            System.out.println("Entry set: " + entrySet1);
        }
        System.out.println();

        Map<Employee, Address> copiedMap = new HashMap<>(mapEmpAdd);
        for (Map.Entry<Employee, Address> entry : copiedMap.entrySet()) {
            Employee key = entry.getKey();
            Address value1 = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value1);
        }
	}
}
