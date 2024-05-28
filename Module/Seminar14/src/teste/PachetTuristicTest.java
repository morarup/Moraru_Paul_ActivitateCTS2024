package teste;

import clase.IPersoana;
import clase.PachetTuristic;
import clase.Persoana;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import teste.categorii.CuMock;
import teste.categorii.FaraMock;
import teste.dubluri.PersoanaFake;

import static org.junit.Assert.*;

public class PachetTuristicTest {

    @Test
    @Category(FaraMock.class)
    public void testeazaCorectitudineAplicaDiscount(){
        IPersoana client = new Persoana("Ion Popescu","1240326254373");
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Destinatie 1", 22.5);
        pachetTuristic.aplicaDiscountVarstnici(20);
        assertEquals(18.0, pachetTuristic.getPret(), 0.01);
    }

    @Test
    @Category(FaraMock.class)
    public void aplicaDiscountBoundary(){
        IPersoana client = new Persoana("Dan", "159020476448933");
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Bucuresti", 33.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(29.7, pachetTuristic.getPret(), 0.01);
    }

    @Test
    @Category(CuMock.class)
    public void valoareAplicaDiscoutFake(){
        PersoanaFake client = new PersoanaFake();
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Bucuresti", 33.0);
        client.setValoareGetVarsta(65);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(29.7,pachetTuristic.getPret(), 0.01);
    }

    @Test
    @Category(CuMock.class)
    public void valoareNuAplicaDiscountFake(){
        PersoanaFake client = new PersoanaFake();
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Bucuresti", 33.0);
        client.setValoareGetVarsta(25);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(33.0,pachetTuristic.getPret(), 0.01);
    }

    @Test
    @Category(CuMock.class)
    public void valoareAplicaDiscount100() {
        PersoanaFake client = new PersoanaFake();
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Bucuresti", 33.0);
        client.setValoareGetVarsta(65);
        pachetTuristic.aplicaDiscountVarstnici(100);
        assertEquals(0.0,pachetTuristic.getPret(),0.01);
    }

    @Test
    @Category(CuMock.class)
    public void valoareAplicaDiscount0() {
        PersoanaFake client = new PersoanaFake();
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Bucuresti", 33.0);
        client.setValoareGetVarsta(65);
        pachetTuristic.aplicaDiscountVarstnici(0);
        assertEquals(33.0,pachetTuristic.getPret(),0.01);
    }

    @Test
    @Category(CuMock.class)
    public void valoareAplicaDiscount1() {
        PersoanaFake client = new PersoanaFake();
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Bucuresti", 30.0);
        client.setValoareGetVarsta(65);
        pachetTuristic.aplicaDiscountVarstnici(1);
        assertEquals(29.7,pachetTuristic.getPret(),0.01);
    }
}