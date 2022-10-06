package sample.actuator;

import org.testng.annotations.Test;


import org.springframework.beans.factory.annotation.Autowired;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHellomessage extends HelloWorldServiceTestt {
    @Autowired
    HelloWorldServiceTestt helloWorldServiceTest;

    @Test
    public void testHelloMessage(){

        assertEquals("Hola Hola",helloWorldServiceTest.getHelloMessage());
    }


}

