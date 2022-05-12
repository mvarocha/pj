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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class FormVendedor extends JFrame {

	private JPanel contentPane;
	private JTextField nome;
	private JTextField cpf;
	private Vendedor V1;
	ArrayList listaVendedor;
	private JButton listar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormVendedor frame = new FormVendedor();
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
	public FormVendedor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel labelnome = new JLabel("Nome");
		GridBagConstraints gbc_labelnome = new GridBagConstraints();
		gbc_labelnome.insets = new Insets(0, 0, 5, 5);
		gbc_labelnome.gridx = 1;
		gbc_labelnome.gridy = 1;
		contentPane.add(labelnome, gbc_labelnome);
		
		nome = new JTextField();
		GridBagConstraints gbc_nome = new GridBagConstraints();
		gbc_nome.insets = new Insets(0, 0, 5, 0);
		gbc_nome.fill = GridBagConstraints.HORIZONTAL;
		gbc_nome.gridx = 3;
		gbc_nome.gridy = 1;
		contentPane.add(nome, gbc_nome);
		nome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("CPF");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 2;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		cpf = new JTextField();
		GridBagConstraints gbc_cpf = new GridBagConstraints();
		gbc_cpf.insets = new Insets(0, 0, 5, 0);
		gbc_cpf.fill = GridBagConstraints.HORIZONTAL;
		gbc_cpf.gridx = 3;
		gbc_cpf.gridy = 2;
		contentPane.add(cpf, gbc_cpf);
		cpf.setColumns(10);
		
		listaVendedor = new ArrayList<Vendedor>();
		
		JButton Registrar = new JButton("Registrar");
		Registrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				V1 = new Vendedor(nome.getText(), Integer.parseInt(cpf.getText()));
				listaVendedor.add(V1);
				//System.out.println("Nome: " + V1.getNome() + "\nCPF: " + V1.getCpf());
				nome.setText("");
				cpf.setText("");
				
			}
		});
		GridBagConstraints gbc_Registrar = new GridBagConstraints();
		gbc_Registrar.insets = new Insets(0, 0, 5, 0);
		gbc_Registrar.gridx = 3;
		gbc_Registrar.gridy = 7;
		contentPane.add(Registrar, gbc_Registrar);
		
		listar = new JButton("Listar");
		listar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i = 0 ; i< listaVendedor.size(); i++) {
					V1 = (Vendedor)listaVendedor.get(i);
					System.out.println("nome: " + V1.getNome()+"\nCPF:"+ V1.getCpf());
				}
			}
		});
		GridBagConstraints gbc_listar = new GridBagConstraints();
		gbc_listar.gridx = 3;
		gbc_listar.gridy = 8;
		contentPane.add(listar, gbc_listar);
	}

}
