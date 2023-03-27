import javax.swing.JOptionPane;

public class ConversorMoneda {
    public static void main(String[] args) {
        String[] opciones = {"Conversor de Moneda", "Conversor de Temperatura"};
        String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion",
                "Menu", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

        if (seleccion == null) {
            // Si el usuario presiona cancelar o cierra la ventana sin seleccionar una opción
            return;
        } else if (seleccion.equals("Conversor de Moneda")) {
            // Aquí iría el código para convertir la moneda
            System.out.println("Print");
            seleccionarMoneda();
        } else if (seleccion.equals("Conversor de Temperatura")) {
            System.out.println("Hola mundo");
        }
    }


    static void  ConvertirMoneda() {
//convertir moneda USD a BRL
        double valorReal = 11.0;
        double taxaCambio = 5.21;
        double valorConvertido = Math.round((valorReal * taxaCambio)*100.0)/100.0;

        JOptionPane.showMessageDialog(null, "Tienes: $" + valorConvertido+ " Real Brasileño");}

    static void seleccionarMoneda() {
        String[] opciones = {"De Pesos a Dolar","De Pesos a Euro","De Pesos a Libra","De Pesos a Yen",
                "De pesos a Yen","De pesos a Won chino","De Dolar a pesos","De Euro a pesos","De Libra a pesos"};
        String seleccion = (String) JOptionPane.showInputDialog(null, "Elije la mmoneda a la que desea convertir tu dinero",
                "Monedas", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

        if (seleccion == null) {
            // Si el usuario presiona cancelar o cierra la ventana sin seleccionar una opción
            return;
        } else if (seleccion.equals("Dolar a real brasileño")) {
            // Aquí iría el código para convertir la moneda
            System.out.println("Print");
            ConvertirMoneda();
        } else if (seleccion.equals("Conversor de Temperatura")) {
            System.out.println("Hola mundo");
        }
        JOptionPane.showMessageDialog(null, "Opcion inválida");
    }
}



