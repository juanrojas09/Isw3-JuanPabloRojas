package sample.actuator;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
/*@ExtendWith(MockitoExtension.class)
public class ServiceTest {
    @Mock //MOCKEO EL CONTEXTO DE LA BASE DE DATOS CON ESTA ANNONTATION
    Dbcontext dbcontextMock;
    @Test
    public void isDbAvaiableTest(){
        assertNotNull(dbcontextMock); //VERIFICO QUE EL MOCK NO SEA NULO
        when(dbcontextMock.isAvaiable()).thenReturn(true); //LE DIGO QUE SIEMPRE DEVUELVA TRUE
        Service service = new Service(dbcontextMock);
        boolean query=service.isDbAvaiable("SELECT * FROM TABLE");
        assertTrue(query);
    }
    @Test
    public void getUniqueIdTest(){
        assertTrue(dbcontextMock.getUniqueId()==42);//VERIFICO QUE EL MOCK DEVUELVA EL VALOR QUE LE DI
        Service service = new Service(dbcontextMock); //puedo testear que me devuelva la cadena que quiero
        assertNotNull(service.getUniqueId());
    }
}
*/