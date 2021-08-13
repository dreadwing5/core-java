import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculateBill extends JFrame implements ActionListener {
	private JButton calculateBtn;
	private JLabel unitLabel, nameLabel, addressLabel, meterLabel, rateLabel, costLabel;
	private JTextField unitField, nameField, addressField, meterField, rateField;

	CalculateBill() {
		JFrame frame = new JFrame("Calculate & Generate Bill");

		nameLabel = new JLabel("Name : ");
		addressLabel = new JLabel("Address : ");
		meterLabel = new JLabel("Meter No : ");
		unitLabel = new JLabel("Units Consumed : ");
		rateLabel = new JLabel("Rate per unit: ");
		costLabel = new JLabel();

		nameField = new JTextField(15);
		addressField = new JTextField(150);
		meterField = new JTextField(15);
		unitField = new JTextField(15);
		rateField = new JTextField(15);

		calculateBtn = new JButton("Calculate");

		calculateBtn.addActionListener(this);

		setLayout(new BorderLayout());

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(15, 2, 0, 2));
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.setBackground(Color.lightGray);
		JPanel btnPanel = new JPanel();
		btnPanel.setBackground(Color.PINK);

		panel.add(nameLabel);
		panel.add(nameField);
		panel.add(addressLabel);
		panel.add(addressField);
		panel.add(meterLabel);
		panel.add(meterField);
		panel.add(unitLabel);
		panel.add(unitField);
		panel.add(rateLabel);
		panel.add(rateField);
		panel.add(costLabel);
		btnPanel.add(calculateBtn);

		frame.add(panel, BorderLayout.CENTER);
		frame.add(btnPanel, BorderLayout.SOUTH);

		frame.setResizable(false);
		frame.setSize(500, 600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent ae) {
		{
			try {
				if (ae.getSource() == calculateBtn) {
					int a = Integer.parseInt(unitField.getText()); // converting string into integer
					double billPay = a * Double.parseDouble(rateField.getText());
					costLabel.setText("Amount Payable : " + billPay);
				}
			} catch (NumberFormatException e) {
				costLabel.setText("Please Input Integer Only.");
			}
		}
	}

	public static void main(String[] args) {
		new CalculateBill();
	}
}
