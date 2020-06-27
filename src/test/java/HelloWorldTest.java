/*
 * maven-surefile-plugin picks classes starting/ending with name Test and runs methods starting with test, POJO Unit tests
 * 
 */
public class HelloWorldTest {

	public void testHello() {
		System.out.println("Test - Hello...");
	}

	public void testWorld() {
		System.out.println("Test - World...");
	}

	public void helloTest() {
		System.out.println("Test - Hello...");
	}

	public void worldTest() {
		System.out.println("Test - World...");
	}

}