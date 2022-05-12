package locadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class FormComprador extends JFrame {

	private JPanel contentPane;
	private JTextField nome;
	private JTextField cpf;
	private JTextField endereco;
	private JButton Registrar;
	private Comprador C1;
	private JButton Registrar_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormComprador frame = new FormComprador();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FormComprador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Nome");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		nome = new JTextField();
		GridBagConstraints gbc_nome = new GridBagConstraints();
		gbc_nome.insets = new Insets(0, 0, 5, 0);
		gbc_nome.fill = GridBagConstraints.HORIZONTAL;
		gbc_nome.gridx = 3;
		gbc_nome.gridy = 1;
		contentPane.add(nome, gbc_nome);
		nome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CPF");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 2;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		cpf = new JTextField();
		GridBagConstraints gbc_cpf = new GridBagConstraints();
		gbc_cpf.insets = new Insets(0, 0, 5, 0);
		gbc_cpf.fill = GridBagConstraints.HORIZONTAL;
		gbc_cpf.gridx = 3;
		gbc_cpf.gridy = 2;
		contentPane.add(cpf, gbc_cpf);
		cpf.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Endere\u00E7o");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 3;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		endereco = new JTextField();
		GridBagConstraints gbc_endereco = new GridBagConstraints();
		gbc_endereco.insets = new Insets(0, 0, 5, 0);
		gbc_endereco.fill = GridBagConstraints.HORIZONTAL;
		gbc_endereco.gridx = 3;
		gbc_endereco.gridy = 3;
		contentPane.add(endereco, gbc_endereco);
		endereco.setColumns(10);
		
		JButton Registrar = new JButton("Registrar");
		Registrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				C1 = new Comprador(nome.getText(), Integer.parseInt(cpf.getText()), endereco.getText());
				System.out.println("Nome: " + C1.getNome() + "\nCPF: " + C1.getCpf() + "\nEndere�o: " + C1.getEndereco());
				nome.setText("");
				cpf.setText("");
				endereco.setText("");
			}
		});
		
		Registrar_1 = new JButton("Registrar");
		Registrar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C1 = new Comprador(nome.getText(), Integer.parseInt(cpf.getText()), endereco.getText());
				System.out.println("Nome: " + C1.getNome() + "\nCPF: " + C1.getCpf() + "\nEndere�o: " + C1.getEndereco());
				nome.setText("");
				cpf.setText("");
				endereco.setText("");
			}
		});
		GridBagConstraints gbc_Registrar_1 = new GridBagConstraints();
		gbc_Registrar_1.insets = new Insets(0, 0, 5, 0);
		gbc_Registrar_1.gridx = 3;
		gbc_Registrar_1.gridy = 8;
		contentPane.add(Registrar_1, gbc_Registrar_1);
		
	}

}