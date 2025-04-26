// Recibir de la línea de comandos tres parametros Y cálcular la operaciuón solicitada

import java.util.Scanner;

public class CalculadoraBasica {

    public static calculadora (numA, operatorA, numB, operatorB, numC) {

        if (operatorA == operatorB) {
            switch (operatorA) {

                case "+":
                    return numA + numB + numC;

                case "-":
                    return numA - numB - numC;

                case "*":
                    return numA * numB * numC;

                case "/":
                    return numA / numB / numC;

                default:
                    return "Operación desconocida";

            }   else if (operatorA == "+" || operatorA == "-" ) {



            }

        }

    }

}
