package CollectionwithStream;

import java.util.stream.Collectors;

public class Moderate {
	 private int id;
	    private String name;
	    private int age;
	    private double salary;
	    private String department;

	    public Moderate(int id, String name, int age, double salary, String department) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.salary = salary;
	        this.department = department;
	    }

	    // Getters
	    public int getId() { return id; }
	    public String getName() { return name; }
	    public int getAge() { return age; }
	    public double getSalary() { return salary; }
	    public String getDepartment() { return department; }

	    @Override
	    public String toString() {
	        return name + " (" + age + ", " + department + ")";
	    }

}








