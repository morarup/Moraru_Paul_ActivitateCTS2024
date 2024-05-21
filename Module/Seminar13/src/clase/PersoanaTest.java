package clase;

import static org.junit.Assert.*;

public class PersoanaTest {

    @org.junit.Test
    public void getSexReturnF() {
        Persoana pers1 = new Persoana("Simona", "6021118520090");
        assertEquals(pers1.getSex(),"F");
    }

    @org.junit.Test
    public void getSexReturnM() {
        Persoana pers1 = new Persoana("Simona", "6021118520090");
        assertEquals(pers1.getSex(),"F");
    }

    @org.junit.Test
    public void getSexReturnLimitaInferioara(){
        Persoana pers1 = new Persoana("Alexandru", "1981118520090");
        assertEquals(pers1.getSex(), "M");
    }

    @org.junit.Test
    public void getSexReturnCrossCheck(){
        String cnp = "1981118520090";
        Persoana pers1 = new Persoana("Alexandru", cnp);
        String sex;
        if ( Integer.valueOf(cnp.charAt(0)) %2 == 0 ){
            sex = String.valueOf('F');
        }else{
            sex = String.valueOf('M');
        }
        assertEquals(pers1.getSex(), sex);
    }

    @org.junit.Test(expected = NullPointerException.class)
    public void getSexErrorCNPStartWithInvalidCharacter(){
        Persoana persoana = new Persoana("Andrei", "");
        persoana.getSex();
    }

    @org.junit.Test(timeout = 200)
    public void getSexPerformance(){
        Persoana persoana = new Persoana("Andrei", "1981118520090");
        persoana.getSex();
    }

    @org.junit.Test
    public void getSexCorrect(){
        Persoana persoana = new Persoana("Andrei", "1981118520090");
        assertEquals(persoana.getSex().length() , 1);
    }

    @org.junit.Test
    public void getSexCorrectByLetter(){
        Persoana persoana = new Persoana("Andrei", "1981118520090");
        boolean isCorrect = persoana.getSex().toLowerCase().equals("m") || persoana.getSex().toLowerCase().equals("f");
        assertEquals(persoana.getSex().length() , 1);
    }

    @org.junit.Test
    public void getSexOrder(){
        Persoana persoana1 = new Persoana("Andrei", "1981118520090");
        Persoana persoana2 = new Persoana("Simona", "6021118520090");
        assertTrue(persoana1.getSex().compareTo(persoana2.getSex()) > 0);
    }

    @org.junit.Test
    public void getSexRange(){
        Persoana persoana1 = new Persoana("Simona", "8981118520090");
        assertEquals(persoana1.getSex(), "F");
    }

    @org.junit.Test(expected = NullPointerException.class)
    public void getSexExistance(){
        Persoana persoana1 = new Persoana("Simona", null);
        persoana1.getSex();
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void getSexCardinality(){
        Persoana persoana1 = new Persoana("Simona", "00000000000");
        persoana1.getSex();
    }
}