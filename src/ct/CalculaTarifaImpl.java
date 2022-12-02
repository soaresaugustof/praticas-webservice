package ct;

import java.util.Random;

import javax.jws.WebService;

@WebService(endpointInterface = "ct.CalculaTarifa")
public class CalculaTarifaImpl implements CalculaTarifa {

    @Override
    public int calcularTarifa(String destino, String dataVoo) {
	Random tarifa = new Random();
	return tarifa.nextInt(4501) + 500;
    }

}
