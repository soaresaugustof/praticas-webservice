package main;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import aa.AlocaAssento;
import ct.CalculaTarifa;
import ecp.EfetivaCompraPassagem;

public class CompAereaClient {
    public static void main(String[] args) throws Exception {
	// Configurando serviços
	URL urlCalcTarifa = new URL("http://localhost:8080/ct?wsdl");
	QName qnameCalcTarifa = new QName("http://ct/", "CalculaTarifaImplService");
	Service serviceCalcTarifa = Service.create(urlCalcTarifa, qnameCalcTarifa);

	URL urlAlocaAssento = new URL("http://localhost:8081/aa?wsdl");
	QName qnameAlocaAssento = new QName("http://aa/", "AlocaAssentoImplService");
	Service serviceAlocaAssento = Service.create(urlAlocaAssento, qnameAlocaAssento);

	URL urlEfetivaCompraPassagem = new URL("http://localhost:4200/ecp?wsdl");
	QName qnameEfetivaCompraPassagem = new QName("http://ecp/", "EfetivaCompraPassagemImplService");
	Service serviceEfetivaCompraPassagem = Service.create(urlEfetivaCompraPassagem, qnameEfetivaCompraPassagem);

	CalculaTarifa calcTarifa = serviceCalcTarifa.getPort(CalculaTarifa.class);
	AlocaAssento alocaAssento = serviceAlocaAssento.getPort(AlocaAssento.class);
	EfetivaCompraPassagem efetivaCompraPassagem = serviceEfetivaCompraPassagem.getPort(EfetivaCompraPassagem.class);

	// Lançando requisição ao service
	System.out.println("Tarifa: " + calcTarifa.calcularTarifa("Salvador", "31/05/2022"));
	System.out.println("Assento alocado: " + alocaAssento.isAlocado("1111", 22));
	System.out.println("Compra efetivada: "
		+ efetivaCompraPassagem.efetivarCompra("1111", "31/05/2022", "Salvador", "111.111.111-11"));
    }
}
