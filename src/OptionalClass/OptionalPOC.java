package OptionalClass;

import java.util.Optional;

public class OptionalPOC {
	public static void main(String[] args) {
		
		 // 1. of() vs ofNullable()
        Optional<String> name = Optional.of("John");
        Optional<String> nullableName = Optional.ofNullable(null); // no exception
        // Optional<String> error = Optional.of(null); // throws NullPointerException

        // 2. isPresent()
        if (name.isPresent()) {
            System.out.println("Name is present: " + name.get());
        }

        // 3. ifPresent()
        name.ifPresent(n -> System.out.println("Hello, " + n));

        // 4. orElse()
        String defaultName = nullableName.orElse("Default Name");
        System.out.println("Name is: " + defaultName);

        // 5. orElseGet()
        String generatedName = nullableName.orElseGet(() -> "Generated Name");
        System.out.println("Name is: " + generatedName);

        // 6. orElseThrow()
        try {
            nullableName.orElseThrow(() -> new RuntimeException("Name not found"));
        } catch (RuntimeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // 7. map()
        Optional<String> upperName = name.map(String::toUpperCase);
        System.out.println("Upper case name: " + upperName.orElse("No name"));

       

        // 9. filter()
        Optional<String> filtered = name.filter(n -> n.startsWith("J"));
        System.out.println("Filtered name: " + filtered.orElse("No match"));

        // Optional in model class
        User user = new User("Ajay", null);
        String city = Optional.ofNullable(user.getAddress())
                              .map(Address::getCity)
                              .orElse("Unknown City");

        System.out.println("User's city: " + city);
		
		
	}

}


class User{
	 private String name;
     private Address address;

     public User(String name, Address address) {
         this.name = name;
         this.address = address;
     }

     public Address getAddress() {
         return address;
     }
	
}


class Address{
	 private String city;

     public Address(String city) {
         this.city = city;
     }

     public String getCity() {
         return city;
     }
	
}
