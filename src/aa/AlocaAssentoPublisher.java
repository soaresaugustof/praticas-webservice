package aa;

import javax.xml.ws.Endpoint;

public class AlocaAssentoPublisher {
    public static void main(String[] args) {
	Endpoint.publish("http://127.0.0.1:8081/aa", new AlocaAssentoImpl());
	System.out.println("Rodando o web service alocaAssento");
    }
}
