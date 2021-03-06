package Visual;

import java.awt.BorderLayout;
import java.util.ListIterator;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import RecursosHumanos.Cliente;

public class ClienteConsultar{

	private JFrame frameClienteConsultar;
	private DefaultTableModel modelo;
	private JTable tbClientes;
	
	public ClienteConsultar(){
		frameClienteConsultar();
		CriaTabela();
		AdicionaLinhasTabela();
	}
	
	
	private void AdicionarLinhaModelo (Object a []){
		this.modelo.addRow(a);
	}
	
	
	@SuppressWarnings("serial")
	public void CriaTabela() {
		
		String[] columns = new String[]{"Codigo","Nome","CPF","Rua","N�mero","Bairro","Cidade","E-mail","Data Nascimento"};
		
		modelo = new DefaultTableModel(null,columns);
		tbClientes = new JTable(modelo)
		{
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
		}};
		tbClientes.setBounds(20,75, 380, 100);
		
		frameClienteConsultar.add(tbClientes.getTableHeader(),BorderLayout.PAGE_START);
		frameClienteConsultar.add(tbClientes,BorderLayout.CENTER);
				
	}

	public void AdicionaLinhasTabela(){
		
		ListIterator<RecursosHumanos.Cliente> iterator = (ListIterator<Cliente>) Run.Main.bancoCliente.RetornaLinkedList().listIterator();

		while (iterator.hasNext()){
			RecursosHumanos.Cliente tempCliente = iterator.next();
			AdicionarLinhaModelo(new Object[]
					{
					tempCliente.getCodigoCliente(),
					tempCliente.getNome(),
					tempCliente.getCpf(),
					tempCliente.getRua(),
					tempCliente.getNumero(),
					tempCliente.getBairro(),
					tempCliente.getCidade(),
					tempCliente.getEmail(),
					tempCliente.getDataNascimentoFormatada()
					}
			);
		}

	}
	
	private void frameClienteConsultar(){
		frameClienteConsultar = new JFrame();
		frameClienteConsultar.setLayout(new BorderLayout());
		frameClienteConsultar.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frameClienteConsultar.setTitle("Locadora Unisal - Consultar Cliente");
		frameClienteConsultar.setVisible(true);
		frameClienteConsultar.setBounds(100, 100, 800, 300);
	}
}

