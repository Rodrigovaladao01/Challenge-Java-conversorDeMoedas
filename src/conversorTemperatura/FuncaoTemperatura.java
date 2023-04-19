package conversorTemperatura;

import javax.swing.*;

public class FuncaoTemperatura {
    ConverteTemperatura temperatura = new ConverteTemperatura();

    public void converterTemperatura(double valorRecebido) {
        String opcao = (JOptionPane.showInputDialog(null, "Escolha uma opção para converter", "Temperatura",
                JOptionPane.PLAIN_MESSAGE, null, new Object[] {
                        "Graus Celsius para Fahrenheit",
                        "Graus Celsius para Kelvin",
                        "Graus Fahrenheit para Celsius",
                        "Kelvin para Graus Celsius",
                        "Kelvin para Graus Fahrenheit" },
                "Escolha")).toString();
        switch (opcao) {
            case "Graus Celsius para Fahrenheit":
                temperatura.converterCelsiusParaFahrenheit(valorRecebido);
                break;
            case "Graus Celsius para Kelvin":
                temperatura.converterCelsiusParaKelvin(valorRecebido);
                break;
            case "Graus Fahrenheit para Celsius":
                temperatura.converterFahrenheitParaCelsius(valorRecebido);
                break;
            case "Kelvin para Graus Celsius":
                temperatura.converterKelvinParaCelsius(valorRecebido);
                break;
            case "Kelvin para Graus Fahrenheit":
                temperatura.converterKelvinParaFahrenheit(valorRecebido);
                break;
        }
    }
}
