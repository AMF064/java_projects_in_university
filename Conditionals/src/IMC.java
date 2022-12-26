import java.util.Scanner;
class IMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner ( System.in );
        double peso, altura,imc;
        System.out.print( "Escriba el valor del peso:" );
        peso = entrada.nextDouble();
        System.out.print( "Escriba el valor de la altura:" );
        altura = entrada.nextDouble();
        //Calcular IMC
        imc = peso/(altura*altura);

        //Mostrar estado nutricional
        if (imc < 18.50)
            System.out.println("Bajo peso");
        else if (18.50 <= imc && imc < 25)
            System.out.println("Peso normal");
        else if (25 <= imc && imc < 30)
            System.out.println("Sobrepeso");
        else if (imc <= 30)
            System.out.println("Obesidad");
        entrada.close();
    }
}