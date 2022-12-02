package ecp;

import java.util.Random;

import javax.jws.WebService;

@WebService(endpointInterface = "ecp.EfetivaCompraPassagem")
public class EfetivaCompraPassagemImpl implements EfetivaCompraPassagem {

    @Override
    public boolean efetivarCompra(String voo, String dataViagem, String destino, String cpf) {
	Random efetivacao = new Random();
	return efetivacao.nextBoolean();
    }

}
