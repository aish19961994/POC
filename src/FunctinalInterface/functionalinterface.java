package FunctinalInterface;
@FunctionalInterface
public interface functionalinterface {
	
	void greet(String name); 
	
	default void sayGoodbye(String name) {
        System.out.println("Goodbye, " + name + "!");
    }	
	
	
	 static void sayHelloWorld() {
	        System.out.println("tawade");
	    }

}
