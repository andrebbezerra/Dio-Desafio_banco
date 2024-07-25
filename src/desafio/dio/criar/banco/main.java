package desafio.dio.criar.banco;

/**
 *
 * @author andre
 */
public class main {
    
  public static void main(String[] args) {
      
      Cliente andre = new Cliente();
      andre.setNome("André");
        Conta cc = new ContaCorrente(andre);
        Conta poupanca = new ContaPoupanca(andre);
        cc.depositar(100);
        cc.transferir(50.00, poupanca); 
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
 
