package JAVA2018E7120;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class JAVA2018E7120_Edit extends JFrame { //점수를 수정한다

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private ArrayList<JAVA2018E7120_Info> AL1 = JAVA2018E7120_Info.AL1;
	private ArrayList<JAVA2018E7120_Info1> AL2 = JAVA2018E7120_Info1.AL2;
	JAVA2018E7120_Info grade1;
	JAVA2018E7120_Info1 grade2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JAVA2018E7120_Edit frame = new JAVA2018E7120_Edit();
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
	public JAVA2018E7120_Edit() {
		setTitle("\uC131\uC801 \uC218\uC815");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 240, 175);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("\uC804\uACF5");
		lblNewLabel_1.setBounds(24, 10, 57, 15);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));

		JLabel lblNewLabel_3 = new JLabel("\uAD50\uC591");
		lblNewLabel_3.setBounds(24, 40, 57, 15);
		contentPane.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("맑은 고딕", Font.PLAIN, 12));

		JLabel lblNewLabel_4 = new JLabel("\uC2DC\uC0AC");
		lblNewLabel_4.setBounds(24, 70, 57, 15);
		contentPane.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("맑은 고딕", Font.PLAIN, 12));

		textField_3 = new JTextField();
		textField_3.setBounds(60, 10, 144, 21);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(60, 40, 144, 21);
		contentPane.add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBounds(60, 70, 144, 21);
		contentPane.add(textField_5);
		textField_5.setColumns(10);

		JButton btnNewButton = new JButton("수정");
		btnNewButton.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		btnNewButton.setBounds(12, 100, 90, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("\uB2EB\uAE30");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(114, 100, 97, 23);
		btnNewButton_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		contentPane.add(btnNewButton_1);

		btnNewButton.addActionListener(new ActionListener() { //수정 버튼
			public void actionPerformed(ActionEvent e) {
				JAVA2018E7120_Info grade1 = new JAVA2018E7120_Info();
				JAVA2018E7120_Info1 grade2 = new JAVA2018E7120_Info1();
				JAVA2018E7120_Search Search = new JAVA2018E7120_Search(); //GradeSearch에서 입력받은 이름, 학번, 학기를 전달받기 위함
				int i;
				if (textField_3.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "전공 점수를 입력하세요.", "오류", JOptionPane.ERROR_MESSAGE);
				} else if (textField_4.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "교양 점수를 입력하세요.", "오류", JOptionPane.ERROR_MESSAGE);
				} else if (textField_5.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "시사 점수를 입력하세요.", "오류", JOptionPane.ERROR_MESSAGE);
				} else {
					if (Search.temp[2] == "1") { //1학기의 점수를 수정한다
						for (JAVA2018E7120_Info grade1_1 : AL1) {
							grade1_1.setmajor(Integer.parseInt(textField_3.getText()));
							grade1_1.setlib(Integer.parseInt(textField_4.getText()));
							grade1_1.setcurevt(Integer.parseInt(textField_5.getText()));
							grade1_1.gettotal();
							grade1_1.getavg();

							textField_3.setText("");
							textField_4.setText("");
							textField_5.setText("");
							JOptionPane.showMessageDialog(null, "수정이 완료 되었습니다.", "완료", JOptionPane.INFORMATION_MESSAGE);
							setVisible(false);
						}
					} else if (Search.temp[2] == "2") { //2학기의 점수를 수정한다
						for (JAVA2018E7120_Info1 grade2_1 : AL2) {
							grade2_1.setmajor(Integer.parseInt(textField_3.getText()));
							grade2_1.setlib(Integer.parseInt(textField_4.getText()));
							grade2_1.setcurevt(Integer.parseInt(textField_5.getText()));
							grade2_1.gettotal();
							grade2_1.getavg();

							textField_3.setText("");
							textField_4.setText("");
							textField_5.setText("");
							JOptionPane.showMessageDialog(null, "수정이 완료 되었습니다.", "완료", JOptionPane.INFORMATION_MESSAGE);
							setVisible(false);
						}
					}

				}
			}
		});
	}
}
