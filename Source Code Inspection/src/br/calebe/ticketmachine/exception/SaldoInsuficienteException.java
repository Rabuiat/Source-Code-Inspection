package br.calebe.ticketmachine.exception;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException() {
        System.out.println("Saldo indisponível ou insuficiente");
    }   
}
