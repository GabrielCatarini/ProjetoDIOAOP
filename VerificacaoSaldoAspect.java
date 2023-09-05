package figures;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class VerificacaoSaldoAspect {

    @Before("execution(* figures.ContaBancaria.sacar(double)) && args(valor)")
    public void verificarSaldo(ContaBancaria conta, double valor) {
        if (conta.getSaldo() < valor) {
            System.out.println("Saldo insuficiente na conta " + conta.getTipoConta());
        }
    }
}