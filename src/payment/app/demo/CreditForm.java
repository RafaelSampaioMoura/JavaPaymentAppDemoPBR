package payment.app.demo;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import java.util.Date;

public class CreditForm {
	private static final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	private static Text card_holder;
	private static Text card_number;
	private static Text expiry_date;
	private static Text password;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(341, 300);
		shell.setText("SWT Application");
		
		Button btnVisa = new Button(shell, SWT.RADIO);
		btnVisa.setSelection(true);
		btnVisa.setBounds(10, 10, 90, 16);
		formToolkit.adapt(btnVisa, true, true);
		btnVisa.setText("VISA");
		
		Button btnMastercard = new Button(shell, SWT.RADIO);
		btnMastercard.setBounds(10, 32, 90, 16);
		formToolkit.adapt(btnMastercard, true, true);
		btnMastercard.setText("MasterCard");
		
		Label lblDonoDoCarto = new Label(shell, SWT.NONE);
		lblDonoDoCarto.setBounds(10, 80, 90, 15);
		formToolkit.adapt(lblDonoDoCarto, true, true);
		lblDonoDoCarto.setText("Dono do Cartão");
		
		card_holder = new Text(shell, SWT.BORDER);
		card_holder.setBounds(10, 101, 122, 21);
		formToolkit.adapt(card_holder, true, true);
		
		Label lblNmeroDoCarto = new Label(shell, SWT.NONE);
		lblNmeroDoCarto.setBounds(178, 80, 111, 15);
		formToolkit.adapt(lblNmeroDoCarto, true, true);
		lblNmeroDoCarto.setText("Número do Cartão");
		
		card_number = new Text(shell, SWT.BORDER);
		card_number.setBounds(178, 101, 122, 21);
		formToolkit.adapt(card_number, true, true);
		
		Label lblDataDeVencimento = new Label(shell, SWT.NONE);
		lblDataDeVencimento.setBounds(10, 149, 122, 15);
		formToolkit.adapt(lblDataDeVencimento, true, true);
		lblDataDeVencimento.setText("Data de Vencimento");
		
		expiry_date = new Text(shell, SWT.BORDER);
		expiry_date.setBounds(10, 170, 122, 21);
		formToolkit.adapt(expiry_date, true, true);
		
		Label lblSenha = new Label(shell, SWT.NONE);
		lblSenha.setBounds(178, 149, 55, 15);
		formToolkit.adapt(lblSenha, true, true);
		lblSenha.setText("Senha");
		
		password = new Text(shell, SWT.BORDER);
		password.setBounds(178, 170, 122, 21);
		formToolkit.adapt(password, true, true);
		
		Button btnEnviar = new Button(shell, SWT.NONE);
		btnEnviar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				CreditInfoStore creditCard = new CreditInfoStore("Visa", card_holder.getText(), 
						Integer.parseInt(card_number.getText()), 
						Date.parse(expiry_date.getText()), 
						password.getText());
				creditCard.printInfo();
			}
		});
		btnEnviar.setBounds(121, 224, 75, 25);
		formToolkit.adapt(btnEnviar, true, true);
		btnEnviar.setText("Enviar");

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
