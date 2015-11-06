package mack.imc;

import mack.pessoa.Pessoa;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class IMCTestFeminino {
    
    @Test
    public void IMCFemininoRiscoBaixo() {
        double p = 65;
        double a = 2;
        Pessoa ps = new Pessoa ();
        char genero = 'F';  
        String g = "Você esta abaixo do peso";
        Assert.assertEquals(ps.msgIMC(genero, ps.calculaIMC(p,a)), g);
    }
    
    @Test
    public void IMCFemininoIdeal() {
        double p = 80;
        double a = 2;
        Pessoa ps = new Pessoa ();
        char genero = 'F';  
        String g = "Você esta muito bem!Continue assim!";
        Assert.assertEquals(ps.msgIMC(genero, ps.calculaIMC(p,a)), g);
    }
    
    @Test
    public void IMCFemininoRiscoModerado() {
        double p = 100;
        double a = 2;
        Pessoa ps = new Pessoa ();
        char genero = 'F';  
        String g = "Você esta acima do peso recomendado. Cuidado";
        Assert.assertEquals(ps.msgIMC(genero, ps.calculaIMC(p,a)), g);
    }
    
    @Test
    public void IMCFemininoRiscoElevado() {
        double p = 115;
        double a = 2;
        Pessoa ps = new Pessoa ();
        char genero = 'F';  
        String g = "Você esta Obeso. Procure o acompanhamento de um nutricionista e realizar mais atividades fisicas!";
        Assert.assertEquals(ps.msgIMC(genero, ps.calculaIMC(p,a)), g);
    }

}
