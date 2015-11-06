package mack.pessoa;

public class Pessoa {

    double imc;

    public double calculaIMC(double peso, double altura) {
        imc = peso / (Math.pow(altura, 2));
        return imc;
    }

    public String msgIMC(char genero , double imc) {
        switch (genero) {
            case 'M':
                if (imc >= 27.8) {
                    return "Você esta Obeso. Procure o acompanhamento de um nutricionista e realizar mais atividades fisicas!";
                } else if (imc < 27.8 && imc >= 25.0) {
                    return "Você esta acima do peso recomendado. Cuidado";
                } else if (imc < 25 && imc >= 19.0) {
                    return "Você esta muito bem!Continue assim!";
                } else if (imc < 19 && imc >= 17.9) {
                    return "Você esta abaixo do peso";
                } else {
                    break;
                }
            case 'F':
                if (imc >= 27.3) {
                    return "Você esta Obeso. Procure o acompanhamento de um nutricionista e realizar mais atividades fisicas!";
                } else if (imc < 27.3 && imc >= 24.5) {
                    return "Você esta acima do peso recomendado. Cuidado";
                } else if (imc < 24.5 && imc >= 18.0) {
                    return "Você esta muito bem!Continue assim!";
                } else if (imc < 18.0 && imc >= 15.0) {
                    return "Você esta abaixo do peso";
                } else {
                    break;
                }
        }
        return null;
    }
}
