import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HelloWorldTest {


    @Test
    public void fakeTest() {
        HelloWorld helloWorld = new HelloWorld();

        assertTrue(helloWorld.alwaysTrue());
    }

}