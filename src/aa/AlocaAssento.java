package aa;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface AlocaAssento {

    @WebMethod
    boolean isAlocado(String voo, int numeroAssento);

}
