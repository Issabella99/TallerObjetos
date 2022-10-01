import javax.swing.*;

public class Menu {

    public void menuOpciones() {

        String mensaje = "Por favor escoja una opcion\n"
                + "1. Cuadrado\n"
                + "2. Circulo\n"
                + "3. Triangulo\n"
                + "4. Paralelepipedo\n"
                + "0. Salir";

        int opcion = Integer.parseInt(JOptionPane.showInputDialog(mensaje));

        switch (opcion) {
            case 1:
                menuCuadrado();
                menuOpciones();
                break;
            case 2:
                menuOpciones();
                break;
            case 3:
                menuOpciones();
                break;
            case 4:
                menuOpciones();
                break;
            case 0:
                break;
            default:
        }

    }

    private void menuCuadrado() {
        String mensaje = "Por favor escoja lo que desea calcular\n"
                + "1. Area\n"
                + "2. Perimetro\n";
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(mensaje));

        switch (opcion) {
            case 1:
                calcularAreaCuadrado();
                menuOpciones();
                break;
            case 2:
                calcularperimetroCuadrado();
                menuOpciones();
                break;
        }
    }

    private void calcularAreaCuadrado() {
        JOptionPane.showMessageDialog(null, "El area del cuadrado es: " + generarCuadrado().calcularArea());

    }

    private void calcularperimetroCuadrado() {
        JOptionPane.showMessageDialog(null, "El perimetro del cuadrado es: " + generarCuadrado().calcularPerimetro());

    }

    private Cuadrado generarCuadrado(){
        int lado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado"));
        Cuadrado miCuadradito = new Cuadrado (lado);
        return miCuadradito;

    }

}
