package conversorMoedas;

import conversorMoedas.ConverteMoedas;
import conversorMoedas.ConverteMoedasParaReais;

import javax.swing.JOptionPane;
import java.util.Objects;

public class Funcao {

    ConverteMoedas moedas = new ConverteMoedas();
    ConverteMoedasParaReais reais = new ConverteMoedasParaReais();

    public void converterMoeda(double valorRecebido) {
        String opcao = (JOptionPane.showInputDialog(null,
                "Escolha a moeda que você quer converter!", "Moedas", JOptionPane.PLAIN_MESSAGE, null,
                new Object[] { "De Reais a Dólares", "De Reais a Euros", "De Reais a Libras",
                        "De Reais a Peso Argentino", "De Reais a Peso Chileno", "De Dólares a Reais",
                        "De Euros a Reais", "De Libras a Reais", "De Peso Argentino a Reais",
                        "De Peso Chileno a Reais" },
                "Escolha")).toString();

        switch (opcao) {
            case "Reais para Dólares":
                moedas.converterReaisParaDolares(valorRecebido);
                break;
            case "Reais para Euros":
                moedas.converterReaisParaEuros(valorRecebido);
                break;
            case "Reais para Libras":
                moedas.converterReaisParaLibras(valorRecebido);
                break;
            case "Reais para Peso Argentino":
                moedas.converterReaisParaPesosArgentinos(valorRecebido);
                break;
            case "Reais para Peso Chileno":
                moedas.converterReaisParaPesosChilenos(valorRecebido);
                break;
            case "Dólares para Reais":
                reais.converterDolaresParaReais(valorRecebido);
                break;
            case "Euros para Reais":
                reais.converterEurosParaReais(valorRecebido);
                break;
            case "Libras para Reais":
                reais.converterLibrasParaReais(valorRecebido);
                break;
            case "Peso Argentino para Reais":
                reais.converterPesosArgentinosParaReais(valorRecebido);
                break;
            case "Peso Chileno para Reais":
                reais.converterPesosChilenosParaReais(valorRecebido);
                break;
        }
    }
}
