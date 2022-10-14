package sample.actuator;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest(classes= SampleActuatorApplication.class)
@WebAppConfiguration

public abstract class AbstractTest {
    protected MockMvc mvc; //MockMvc es una clase de spring que nos permite hacer peticiones http
    @Autowired //
    WebApplicationContext webApplicationContext; //WebApplicationContext es una clase de spring que nos permite obtener el contexto de la aplicacion
    protected void setUp(){ //setUp es un metodo que se ejecuta antes de cada test
        mvc= MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

}
