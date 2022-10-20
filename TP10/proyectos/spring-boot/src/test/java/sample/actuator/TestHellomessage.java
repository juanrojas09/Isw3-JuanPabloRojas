package sample.actuator;

//import org.testng.annotations.Test;






import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHellomessage  {

    HelloWorldServiceTestt helloWorldServiceTest= new HelloWorldServiceTestt();

    @Test
    public void testHolaMessage(){

        assertEquals("Hola Hola",helloWorldServiceTest.getHelloMessage());
        assertEquals("Hello Hello",helloWorldServiceTest.getHelloMessage());
    }



}

