package test;

import dubluri.PersoanaFake;
import model.IPersoana;
import model.PachetTuristic;
import model.Persoana;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;
import test.categorii.TestEroare;
import test.categorii.TestRange;

import java.util.Optional;

import static org.junit.Assert.*;

public class PachetTuristicTest {

    @Test
    @Category(TestRange.class)
    public void corectAplicaDiscountVarstnici() {
        IPersoana persoana = new Persoana("Tudor","5021211312");
        PachetTuristic pachetTuristic = new PachetTuristic(persoana,"bali",100d);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(100d, pachetTuristic.getPret(),0.01);
    }
    @Test
    @Category(TestRange.class)
    public void limitBoundaryAplicaDiscount(){
        IPersoana persoana = new Persoana("Tudor","1571211312");
        PachetTuristic pachetTuristic = new PachetTuristic(persoana,"bali",200d);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(180,pachetTuristic.getPret(),0.01);
    }
    @Test
    @Category(TestRange.class)
    public void testGetVarstaFak(){
        PersoanaFake persoana = new PersoanaFake();
        persoana.setVarsta(66);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana,"dubai",250d);
        pachetTuristic.aplicaDiscountVarstnici(20);
        assertEquals(200d,pachetTuristic.getPret(),0.01);
    }
    @Test
    @Category(TestRange.class)
    public void correctTestGetVarstaFakeNoDiscount(){
        PersoanaFake persoana = new PersoanaFake();
        persoana.setVarsta(62);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana,"dubai",250d);
        pachetTuristic.aplicaDiscountVarstnici(20);
        assertEquals(250d,pachetTuristic.getPret(),0.01);
    }
//    @Test
//    public void correctTestGetVarstaFakeFullDiscount(){
//        PersoanaFake persoana = new PersoanaFake();
//        persoana.setVarsta(100);
//        PachetTuristic pachetTuristic = new PachetTuristic(persoana,"dubai",250d);
//        pachetTuristic.aplicaDiscountVarstnici(1000);
//        assertEquals(0,pachetTuristic.getPret(),0.01);
//    }
    @Test(expected = IllegalArgumentException.class)
    @Category({TestRange.class, TestEroare.class})
    public void correctTestGetVarstaFakeNoDiscountThrowsError(){
        PersoanaFake persoana = new PersoanaFake();
        persoana.setVarsta(66);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana,"dubai",250d);
        pachetTuristic.aplicaDiscountVarstnici(-10);
//        assertEquals(200d,pachetTuristic.getPret(),0.01);
    }
    @Test(timeout = 10)
    public void correctTestGetVarstaPerformance(){
        PersoanaFake persoana = new PersoanaFake();
        persoana.setVarsta(66);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana,"dubai",250d);
        pachetTuristic.aplicaDiscountVarstnici(10);

    }
}