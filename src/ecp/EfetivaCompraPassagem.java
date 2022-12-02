package ecp;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface EfetivaCompraPassagem {

    @WebMethod
    boolean efetivarCompra(String voo, String dataViagem, String destino, String cpf);
}
