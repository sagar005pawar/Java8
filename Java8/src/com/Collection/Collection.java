
package com.Collection;

import java.io.Serializable;
import java.util.*;
import java.util.Map.Entry;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

class Product implements Cloneable, Serializable, Comparable<Product>
{
	private int id;
	private String name;
	private float price;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public Product(Product p) {
		this.id = p.id;
		this.name = p.name;
		this.price = p.price;
	}

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Product clone() throws CloneNotSupportedException {
		return (Product) super.clone();
	} 
	
	@Override
	public String toString() {
		return "Product [  " + id + "	 " + name + "   " + price + "]";
	}

	@Override
	public int compareTo(Product o) {
		return this.id-o.id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(price);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		return true;
	}
	
}

public class Collection {

	public static void main(String[] args) throws Exception {

		Employee e1 = new Employee(3, "Vijay", 2500.0f),
				 e2 = new Employee(1, "Pawar", 2000.0f),
				 e3 = new Employee(2, "Sagar", 3500.0f);
				
		Product p1 = new Product(2, "Vijay", 250.0f);
		Product p2 = new Product(3, "Sagar", 350.0f);
		Product p3 = new Product(1, "Pawar", 200.0f);
		Product p4 = p3.clone();

		
		List<String> lista = new ArrayList<>();
		lista.add("a");
		lista.add("b");
		lista.add("c");
//		lista.remove(1);
		System.out.println("Collections= " + Collections.synchronizedList(lista));
		Collections.reverse(lista);
		Collections.swap(lista, 0, 1);
		lista.forEach(System.out::println);
		System.out.println(Collections.checkedList(lista, String.class));

		
/*		
		List<String> listb = new LinkedList<>();
		listb.add("a");
		listb.add("b");
		listb.add("c");
		listb.remove(1);
		System.out.println(listb.get(1));
*/
		
/*		
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add("c");
		list.add("a");
		Set<String> unique = new LinkedHashSet<>(list);
		for (String string : unique) {
			System.out.println(string + "= " + Collections.frequency(list, string));
		}
*/		
		
/*				
		Set<Product> s2 = new HashSet<>();
		s2.add(p1);
		s2.add(p3);
		s2.add(p4);
		s2.add(p2);
		s2.forEach(System.out::println);
		System.out.println(s2.size());

		Set<Employee> s3 = new HashSet<>();
		s3.add(e1);
		s3.add(e1);
		s3.add(e3);
		System.out.println(s3.size());

		System.out.println("e1= "+e1.hashCode() + "\t"+e1.equals(e2) + "\t" + e1.equals(e3));
		System.out.println("e2= "+e2.hashCode() + "\t"+e2.equals(e1) + "\t" + e2.equals(e3));
		System.out.println("e3= "+e3.hashCode() + "\t"+e3.equals(e2) + "\t" + e3.equals(e1));

		Map<Product, Employee> m1 = new HashMap<>();
		m1.put(p1, e1);		//TreeMap<Employee, Employee>  
		m1.put(p2, e2);		//uses comparable Interface
		m1.put(p3, e3);		//b'coz here User-Define-Class as key
		m1.put(p4, e2);
		Set s1 = m1.entrySet();
		Iterator i1 = s1.iterator();
		
		while (i1.hasNext()) {
			Map.Entry<Product, Employee> entry = (Entry<Product, Employee>) i1.next();
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}

		
		Map<String, Integer> tm = new TreeMap<>();
		tm.put("vivek", 1);
		tm.put("vivek", 2);
		System.out.println(tm);

		Map<String, Integer> ht = new Hashtable<>();
		ht.put("vivek", 1);
		ht.put("vivek", 2);
		System.out.println(ht);
*/		
				
		
/*		
		List<Employee> list = new ArrayList<>();		//Type Inference, since Java8
		list.add(e1);
		list.add(e2);
		list.add(e3);
		System.out.println(list.isEmpty());
*/
		
/*		
		Set<String> s1 = new HashSet<>();	//Type Inference java8
		s1.add("sagar");	//Wrapper class objects TreeSet Reverse Ordered
		s1.add("vijay");	//Takes unique objects by using hashcode() & equalTo() methods
		s1.add("pawar");	//checks the objects hashCodes for uniqness(Set)
		s1.add("sagar");
		s1.add("vijay");
		s1.add("pawar");
		s1.forEach(System.out::println);
*/		

/*		
		List<Employee> a1 = new ArrayList<>();
		for(int i=1;i<=100;i++) {
			a1.add(new Employee(3, "Sagar", 3500.0f));
		}		//get 90th numbered Object from Collection using get()
		System.out.println(a1.get(90));
*/

/*		
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);	//Stream API skip(number of objects)						
		list.stream().skip(2).forEach(System.out::println);
*/		

/*		
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);				
		//Set maintain Insertion order
		Set<Employee> s1 = new LinkedHashSet<Employee>(); 
		s1.addAll(list);
		s1.forEach(System.out::println);		
*/
		
		//ASC
		//Collections.sort(list, (u1, u2)->u1.getName().compareToIgnoreCase(u2.getName()));

		//DESC
		//Collections.sort(list, (u1, u2)->(-1)*u1.getName().compareToIgnoreCase(u2.getName()));

		//Collections.sort(list, new SalaryComparatorASC());		//Salary ASC
		//Collections.sort(list, new SalaryComparatorDESC());		//Salary DESC
		//Collections.sort(list, new NameComparator());				//Names ASC
		//Collections.sort(list, new NameComparatorDESC());			//Names DESC
		//list.forEach(System.out::println);	

		
/*		
		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);		//Salary Comparator ASC
		
		list.sort(new NameComparator());
		list.forEach(System.out::println);	
		System.out.println();		
		list.sort(new SalaryComparatorDESC());
		list.forEach(System.out::println);		
		System.out.println();
		list.sort(new SalaryComparatorASC());
		list.forEach(System.out::println);			
*/		
		

/*		
		String s = "sagar";
		String s1 = "sagar";
		System.out.println(s.equals(s1) + "\n" + s.hashCode() + "\n" + s1.hashCode());
		System.out.println();
		
		Integer i1=s.hashCode();
		Integer i2=s1.hashCode();
		System.out.println(i1.equals(i2) + "\n" + i1.hashCode() + "\n" + i2.hashCode());

		Long l = 2l;
		System.out.println(l.hashCode());
		
		if(l instanceof Long) {
			System.out.println("Correct..");
		}		
*/
		
/*		
		Employee e4 = new Employee(2, "Vijay", 2500.0f);
		Employee e5 = new Employee(3, "Sagar", 3500.0f);
		Employee e6 = new Employee(1, "Pawar", 2000.0f);
		Employee e7 = new Employee(1, "Pawar", 2000.0f);
		System.out.println("e7="+e7.hashCode() + "\te6=" + e6.hashCode() + "\tnew=" + new Employee(1, "Pawar", 2000.0f).hashCode());
		
		Set<Employee> s3 = new LinkedHashSet<>();
		s3.add(e1);
		s3.add(e2);
		s3.add(e3);
		s3.add(e4);
		s3.add(e5);
		s3.add(e6);		
		s3.add(new Employee(1, "Pawar", 2000.0f));
//		s3.add(e6);
		s3.add(e7);
		s3.forEach(System.out::println);
		System.out.println(s3.size());
*/

		List<String> s1 = new ArrayList<>();
		s1.add("sagar");	//Wrapper class objects ArraList Reverse Ordered
		s1.add("vijay");
		s1.add("pawar");
		s1.add("sagar");	//Wrapper class objects ArraList Reverse Ordered
		s1.add("vijay");

		Set<String> s3 = new HashSet<>();		//duplicate removing from List
		s3.addAll(s1);
		s1.clear();
		s1.addAll(s3);
		
		Collections.sort(s1, (l1, l2)->((-1)*(l1.compareTo(l2))));	//sorted List Reverse-Ordered
		Collections.reverse(s1);	//Inserted Order Descending
		s1.forEach(System.out::println);

		
/*		
		List<String> s1 = new ArrayList<String>();
		s1.add("sagar");	//Wrapper class objects ArraList Reverse Ordered
		s1.add("vijay");
		s1.add("pawar");
		s1.add("sagar");	//Wrapper class objects ArraList Reverse Ordered
		s1.add("vijay");

		Set<String> s3 = new HashSet<String>();		//duplicate removing from List
		s3.addAll(s1);
		s1.clear();
		s1.addAll(s3);
		
//		Collections.sort(s1, (l1, l2)->((-1)*(l1.compareTo(l2))));	//List Reverse-Ordered
//		Collections.reverse(s1);		//Inserted Order Descending
		s1.forEach(System.out::println);
*/
		
/*		
		Set<String> s1 = new TreeSet<>();
		Set<String> s1 = new TreeSet<>(Collections.reverseOrder());
		s1.add("sagar");	//Wrapper class objects TreeSet Reverse Ordered
		s1.add("vijay");	//Takes unique objects by using hashcode() & equalTo() methods
		s1.add("pawar");	//checks the objects hashCodes for uniqness(Set)
		s1.add("sagar");
		s1.add("vijay");
		s1.add("pawar");		
		s1.forEach(System.out::println);
*/
		
		
/*		
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);		//Salary Comparator ASC
		//Collections.sort(list, (u1, u2)->u1.getName().compareToIgnoreCase(u2.getName()));
		//Collections.sort(list, new SalaryComparatorASC());
		//Collections.sort(list, new SalaryComparatorDESC());
		list.sort(new NameComparator());
		list.forEach(System.out::println);	
		
		list.sort(new SalaryComparatorDESC());
		list.forEach(System.out::println);		
		
		list.sort(new SalaryComparatorASC());
		list.forEach(System.out::println);
*/
		
		
/*		
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);		//Salary Comparator DESC
		Collections.sort(list, new SalaryComparatorDESC());
		list.forEach(System.out::println);		
*/		

/*		
		Map<Employee, Employee> m1 = new TreeMap<>(Collections.reverseOrder(new NameComparatorDESC()));
		m1.put(e2, e1);		//TreeMap<Employee, Employee>  
		m1.put(e3, e2);		//uses comparable Interface
		m1.put(e1, e3);		//b'coz here User-Define-Class as key
				
		Set s1 = m1.entrySet();
		Iterator i1 = s1.iterator();
		
		while (i1.hasNext()) {
			Map.Entry<Employee, Employee> entry = (Entry<Employee, Employee>) i1.next();
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
*/
		
		
/*		
 		//Map<Wrapper/User-Define class, Wrapper/User-Define class>
		Map<Integer, Product> m1 = new TreeMap<Integer, Product>(Collections.reverseOrder());
		m1.put(3, p1);		//TreeMap<Integer, Employee>
		m1.put(1, p2);		//b'coz here Wrapper-Class as key
		m1.put(2, p3);		//so we don't need to uses comparable Interface by default implements
		m1.put(2, p3);
		
		Set<Entry<Integer, Product>> s1 = m1.entrySet();
		Iterator<Entry<Integer, Product>> i1 = s1.iterator();
		
		while (i1.hasNext()) {
			Map.Entry<Integer, Product> entry = (Map.Entry<Integer, Product>) i1.next();
			System.out.println(entry.getKey() + " "+ entry.getValue());
		}		
*/
		
		
/*		
		Set<Employee> set = new TreeSet<Employee>();     //sorted by comparable interface
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.forEach(System.out::println);		
*/	

		
/*		
		Set<Employee> set = new TreeSet<Employee>(new NameComparator());     //sorted by comparator interface
		Set<Employee> set = new TreeSet<Employee>();     //sorted by comparable interface
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.forEach(System.out::println);		
*/	
		
		
		
/*		
		Set<Employee> set = new LinkedHashSet<Employee>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e1);
		set.add(e2);
		set.add(e3);	
		set.forEach(System.out::println);
*/		

/*		
		Queue<Employee> priority_q = new PriorityQueue<Employee>();		
		priority_q.offer(e3);		//priority by id using comparable
		priority_q.offer(e1);
		priority_q.offer(e2);
		priority_q.forEach(System.out::println);
*/		

/*		
		Queue<Employee> arr_q = new ArrayDeque<Employee>();
		arr_q.offer(e1);
		arr_q.offer(e2);
		arr_q.offer(e3);
		arr_q.forEach(System.out::println);		
*/
		
		
		
	}
}

class Employee implements Comparable<Employee>, Cloneable, Serializable
{
	private int id;
	private String name;
	private float salary;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(salary);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(salary) != Float.floatToIntBits(other.salary))
			return false;
		return true;
	}
	
	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	@Override
	public int compareTo(Employee o) {
		if(this.id < o.id){
			return -1;
		} else if (this.id > o.id) {
			return 1;
		} else {
			return 0;			
		}
	}
	
	public Employee clone() throws CloneNotSupportedException{
		return (Employee) super.clone();
	}
	@Override
	public String toString() {
		return "Employee [  " + id + "	 " + name + "   " + salary + "]";
	}
}

class NameComparator implements Comparator<Employee>
{
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}	
}

class NameComparatorDESC implements Comparator<Employee>
{
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return (-1)*o1.getName().compareTo(o2.getName());
	}	
}

class SalaryComparatorASC implements Comparator<Employee>
{
	@Override
	public int compare(Employee o1, Employee o2) {
		return (int) (o1.getSalary()-o2.getSalary());
	}	
}

class SalaryComparatorDESC implements Comparator<Employee>
{
	@Override
	public int compare(Employee o1, Employee o2) {
		return (int) (o2.getSalary()-o1.getSalary());
	}	
}

