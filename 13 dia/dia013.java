package desafio100Dias;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTable;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

public class dia013 {

	private JFrame frame;
	private JTextField tfInicio;
	private JTextField tfFim;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dia013 window = new dia013();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public dia013() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 481, 488);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEmitirAta = new JLabel("Emitir Ata");
		lblEmitirAta.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmitirAta.setBounds(20, 11, 76, 14);
		frame.getContentPane().add(lblEmitirAta);
		
		JLabel lblInicio = new JLabel("Início");
		lblInicio.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblInicio.setBounds(10, 36, 46, 14);
		frame.getContentPane().add(lblInicio);
		
		JLabel lblFim = new JLabel("Fim");
		lblFim.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblFim.setBounds(119, 36, 46, 14);
		frame.getContentPane().add(lblFim);
		
		JLabel lblSetor = new JLabel("Setor");
		lblSetor.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblSetor.setBounds(220, 36, 46, 14);
		frame.getContentPane().add(lblSetor);
		
		tfInicio = new JTextField();
		tfInicio.setBounds(10, 50, 86, 20);
		frame.getContentPane().add(tfInicio);
		tfInicio.setColumns(10);
		
		tfFim = new JTextField();
		tfFim.setBounds(119, 50, 86, 20);
		frame.getContentPane().add(tfFim);
		tfFim.setColumns(10);
		
		JComboBox cbSetor = new JComboBox();
		cbSetor.setBounds(220, 49, 235, 22);
		frame.getContentPane().add(cbSetor);
		
		JLabel lblTitulo = new JLabel("Título");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblTitulo.setBounds(10, 75, 46, 14);
		frame.getContentPane().add(lblTitulo);
		
		textField = new JTextField();
		textField.setBounds(10, 92, 445, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPauta = new JLabel("Pauta");
		lblPauta.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblPauta.setBounds(10, 118, 46, 14);
		frame.getContentPane().add(lblPauta);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 134, 445, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDescricao = new JLabel("Descrição");
		lblDescricao.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblDescricao.setBounds(10, 158, 46, 14);
		frame.getContentPane().add(lblDescricao);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 175, 445, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblTipo.setBounds(10, 200, 46, 14);
		frame.getContentPane().add(lblTipo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 218, 218, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel lblPalavrasChave = new JLabel("Palavras-Chave");
		lblPalavrasChave.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblPalavrasChave.setBounds(10, 244, 86, 14);
		frame.getContentPane().add(lblPalavrasChave);
		
		textField_3 = new JTextField();
		textField_3.setBounds(10, 260, 445, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblParticipantes = new JLabel("PARTICIPANTES");
		lblParticipantes.setBounds(10, 289, 92, 14);
		frame.getContentPane().add(lblParticipantes);
		
		JButton btnMembroExterno = new JButton("Membro Externo");
		btnMembroExterno.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnMembroExterno.setBounds(344, 285, 111, 23);
		frame.getContentPane().add(btnMembroExterno);
		
		JLabel lblMatricula = new JLabel("Matrícula");
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblMatricula.setBounds(10, 308, 46, 14);
		frame.getContentPane().add(lblMatricula);
		
		textField_4 = new JTextField();
		textField_4.setBounds(10, 322, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnPesquisar.setBounds(99, 321, 79, 23);
		frame.getContentPane().add(btnPesquisar);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNome.setBounds(182, 308, 46, 14);
		frame.getContentPane().add(lblNome);
		
		JButton btnIncluir = new JButton("Incluir");
		btnIncluir.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnIncluir.setBounds(379, 319, 76, 23);
		frame.getContentPane().add(btnIncluir);
		
		textField_5 = new JTextField();
		textField_5.setBounds(180, 322, 197, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		String[][] dados = {{"a", "b", "c"},{"d", "e", "f"}};
		String [] nomeColunas = {"Matrícula", "Nome", "Ação"};
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalvar.setBounds(182, 415, 89, 23);
		frame.getContentPane().add(btnSalvar);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Matr\u00EDcula", "Nome", "A\u00E7\u00E3o"},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Matr\u00EDcula", "Nome", "A\u00E7\u00E3o"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(66);
		table.getColumnModel().getColumn(1).setPreferredWidth(322);
		table.setBounds(10, 357, 445, 48);
		frame.getContentPane().add(table);

	}
}
