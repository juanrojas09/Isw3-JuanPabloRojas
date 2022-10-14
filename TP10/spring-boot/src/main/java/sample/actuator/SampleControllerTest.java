package sample.actuator;

import org.junit.Test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleControllerTest extends AbstractTest{
    @Override
    @Autowired
    public void setUp(){
        super.setUp(); //super es para llamar al metodo de la clase padre
    }
@Test


    public void testRootMessage() throws Exception{
        String uri="/"; //
        MvcResult mvcResult=mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON_VALUE)).andReturn(); //
        String content=mvcResult.getResponse().getContentAsString(); //obtengo el contenido de la respuesta
        int status=mvcResult.getResponse().getStatus();
        assertEquals(200,status);
        String expected="Hello World";
       assertEquals("Hello World",expected);
        assertEquals(content,"{\"message\":\"Spring boot says hello from a Docker container\"}");
    }
}



