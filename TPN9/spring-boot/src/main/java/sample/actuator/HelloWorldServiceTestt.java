package sample.actuator;

public class HelloWorldServiceTestt {
    int contadorLlamadas = 0;

    public String getHelloMessage() {
        contadorLlamadas++;

    if(contadorLlamadas>1){
    return "Hello Hello";
    }
        return "Hola Hola";
    }



}