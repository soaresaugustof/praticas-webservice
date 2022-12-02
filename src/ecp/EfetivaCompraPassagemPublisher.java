package ecp;

import javax.xml.ws.Endpoint;

public class EfetivaCompraPassagemPublisher {
    public static void main(String[] args) {
	Endpoint.publish("http://127.0.0.1:4200/ecp", new EfetivaCompraPassagemImpl());
	System.out.println("Rodando o web service efetivaCompraPassagem");
    }
}
