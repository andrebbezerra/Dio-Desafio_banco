package desafio.dio.criar.banco;

/**
 *
 * @author andre
 */
public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente){
        super(cliente);
    }
    
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato conta Corrente ===");
        super.imprimirInfosComuns();
    }
       
}
