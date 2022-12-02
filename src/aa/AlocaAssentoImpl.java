package aa;

import java.util.Random;

import javax.jws.WebService;

@WebService(endpointInterface = "aa.AlocaAssento")
public class AlocaAssentoImpl implements AlocaAssento {

    @Override
    public boolean isAlocado(String voo, int numeroAssento) {
	Random aloca = new Random();
	return aloca.nextBoolean();
    }

}
