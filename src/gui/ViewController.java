package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

// Quando o usu�rio fizer alguma intera��o com a tela, exemplo: clicar em um bot�o,
// preencher algum componente... essa a��o ir� tratada pelo controlador

// Irei usar um padr�o quando eu for criar um controlador de uma classe fxml, irei colocar sempre o Controller na frente.
// Por exemplo: Clientes.fxml = ClientesController.java
public class ViewController {

	@FXML
	private TextField txtNumber1;

	@FXML
	private TextField txtNumber2;

	@FXML
	private Label labelResult;

	@FXML
	private Button btSum;

	// M�todo para ser instanciado quando o bot�o for clicado
	@FXML
	public void onBTSumAction() {
		try {
			// Uso a opera��o .getText() para pegar o conte�do dentro da vari�vel txtNumber,
			// e converto o String que retornar para um tipo Double
			double number1 = Double.parseDouble(txtNumber1.getText());
			double number2 = Double.parseDouble(txtNumber2.getText());
			double sum = number1 + number2;
			// Uso a opera��o .setText para eu colocar um cont�udo dentro do label.
			labelResult.setText(String.format("%.2f", sum));
		} catch (NumberFormatException N) {
			Alerts.showAlert("Error", "Parse error", N.getMessage(), AlertType.ERROR);
		}
	}
}
