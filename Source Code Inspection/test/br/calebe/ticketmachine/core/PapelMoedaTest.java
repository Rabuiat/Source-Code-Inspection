/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 41411803
 */
public class PapelMoedaTest {
    
    public PapelMoedaTest() {
    }

    /**
     * Test of setValor method, of class PapelMoeda.
     */
    @Test
    public void CenarioParaInserçãoDeValoresTeste() {
        System.out.println("setValor");
        int valor = 0;
        PapelMoeda instance = new PapelMoeda(50, 2);
        assertEquals(50, instance.getValor());
    }

    /**
     * Test of setQuantidade method, of class PapelMoeda.
     */
    @Test
    public void CenarioParaInserçãoDeQuantidadesTeste() {
        System.out.println("setQuantidade");
        int quantidade = 0;
        PapelMoeda instance = new PapelMoeda(50, 4);
        assertEquals(4, instance.getQuantidade());
    } 
    
    @Test(expected = PapelMoedaInvalidaException.class) 
    public void CenarioInserçãoDePapelMoedaInválido() throws PapelMoedaInvalidaException{
       TicketMachine instance = new TicketMachine(50);
       instance.inserir(33);
    }
    
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        PapelMoeda instance = null;
        int expResult = 0;
        int result = instance.getValor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantidade method, of class PapelMoeda.
     */
    @Test
    public void testGetQuantidade() {
        System.out.println("getQuantidade");
        PapelMoeda instance = null;
        int expResult = 0;
        int result = instance.getQuantidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class PapelMoeda.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        PapelMoeda instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
