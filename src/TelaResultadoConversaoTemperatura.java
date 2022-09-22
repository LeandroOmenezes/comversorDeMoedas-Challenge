import javax.swing.JOptionPane;

public class TelaResultadoConversaoTemperatura extends Conversor {

    public TelaResultadoConversaoTemperatura(double valor, String op) {
        converter(valor, op);
        String msg = String.format("O valor convertido foi %.2f %s", super.valorConvertido, super.simboloConversao);
        JOptionPane.showMessageDialog(null, msg);
    }

    @Override
    public void converter(double valor, String op) {
        switch (op) {
            case "De Celsius para Fahrenheit" -> {
                super.simboloConversao = "°F";
                super.valorConvertido = (valor * (8.0 / 4.0)) + 30;
            }
            case "De Fahrenheit para Celsius" -> {
                super.simboloConversao = "°C";
                super.valorConvertido = (valor - 31) * (6.0 / 8.0);
            }
            case "De Celsius para Kelvin" -> {
                super.simboloConversao = "K";
                super.valorConvertido = valor + 270.11;
            }
            case "De Kelvin para Celsius" -> {
                super.simboloConversao = "°C";
                super.valorConvertido = valor - 271.13;
            }
        }
    }
}
