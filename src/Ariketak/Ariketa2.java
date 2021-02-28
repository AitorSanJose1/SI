package Ariketak;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ariketa2 {

	private JFrame frame;
	//private JTextField textField;
	//private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ariketa2 window = new Ariketa2();
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
	public Ariketa2() {
		initialize();
	}
	


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		frame.setLocationRelativeTo(null);
		
		JPanel gridLayoutPane = new JPanel();
		gridLayoutPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
			}
		});
		frame.getContentPane().add(gridLayoutPane, BorderLayout.CENTER);
		gridLayoutPane.setLayout(new GridLayout(3, 3, 0, 0));
		
		JPanel eskuma_berri = new JPanel();
		frame.getContentPane().add(eskuma_berri, BorderLayout.EAST);
		eskuma_berri.setLayout(new GridLayout(3, 0, 0, 0));
		
		JPanel hutsa = new JPanel();
		eskuma_berri.add(hutsa);
		
		JPanel panel_2 = new JPanel();
		eskuma_berri.add(panel_2);
		panel_2.setLayout(new GridLayout(3, 0, 0, 0));
		
		JPanel panel = new JPanel();
		panel_2.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_1 = new JLabel("Label");
		panel.add(lblNewLabel_1);
		
		JTextField textField_1 = new JTextField();
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_2.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_2 = new JLabel("Tfield");
		panel_1.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_2.add(panel_4);
		panel_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_3 = new JLabel("");
		panel_4.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("OK");
		panel_4.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("");
		panel_4.add(lblNewLabel_4);
		
		JPanel panel_3 = new JPanel();
		eskuma_berri.add(panel_3);
		panel_3.setLayout(null);
		panel_3.add(getBtnNewButton_1());
		for (int l = 0; l < 3; l++) {
			for (int z = 0; z < 3; z++) {
				gridLayoutPane.add(getGridLayoutPanel(l,z));
			}
		}
		
		
	}

	private Component getGridLayoutPanel(int l, int z) {
		// TODO Auto-generated method stub
		JPanel gridBagLayout = new JPanel();
		//gridLayoutPane.add(gridBagLayout);
		GridBagLayout gbl_gridBagLayout = new GridBagLayout();
		gbl_gridBagLayout.columnWidths = new int[]{0};
		gbl_gridBagLayout.rowHeights = new int[]{0, 0, 0};
		gbl_gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_gridBagLayout.rowWeights = new double[]{Double.MIN_VALUE};
		gridBagLayout.setLayout(gbl_gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("L"+l+"Z"+z);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 2, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		gbc_lblNewLabel.weighty=0.33;
		gridBagLayout.add(lblNewLabel, gbc_lblNewLabel);
		
		JTextField textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 2;
		gbc_textField.weighty=0.66;
		//gbc_textField.weightx=0.66;
		gbc_textField.gridheight=2;
		gridBagLayout.add(textField, gbc_textField);
		textField.setColumns(50);
		
		
		
		return gridBagLayout;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Exit");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					System.exit(0);
				}
			});
			btnNewButton_1.setBounds(48, 34, 56, 21);
		}
		return btnNewButton_1;
	}
}
