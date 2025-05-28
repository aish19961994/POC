package FunctinalInterface;

public class functionalInterfacePoc {
	public static void main(String[] args) {
		
		functionalinterface service = name -> System.out.println("Hello, " + name + "!");
		
		 service.greet("asish");
	        service.greet("tawade");
	        
	        service.sayGoodbye("Ashish");
	        
	        functionalinterface.sayHelloWorld();
		
		
	}

}
