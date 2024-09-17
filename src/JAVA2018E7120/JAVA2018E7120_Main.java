package JAVA2018E7120;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
import java.io.*;

public class JAVA2018E7120_Main extends JFrame {

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	JAVA2018E7120_Info grade1;
	JAVA2018E7120_Info1 grade2;
	static JAVA2018E7120_Main frame1 = new JAVA2018E7120_Main();
	String buttons1[] = { "학점 분포 그래프", "전체 표" };
	private Font f1 = new Font("맑은고딕", Font.PLAIN, 12);

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JAVA2018E7120_Main() {
		UIManager.put("OptionPane.messageFont", f1);
		UIManager.put("OptionPane.buttonFont", f1);
		setResizable(false);
		setTitle("2018E7120 \uC131\uC801 \uCC98\uB9AC \uD504\uB85C\uADF8\uB7A8");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton button = new JButton("입력");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JAVA2018E7120_Input frame2 = new JAVA2018E7120_Input();
				frame2.setVisible(true);
			}
		});
		button.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		button.setBounds(12, 313, 85, 23);

		JButton btnNewButton_1 = new JButton("자료 보기");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showOptionDialog(null, " 어떤 기능을 사용하길 원하십니까?", "선택", JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE, null, buttons1, "학점 분포 그래프");
				if (result == JOptionPane.YES_OPTION) {
					JAVA2018E7120_DataStats frame4 = new JAVA2018E7120_DataStats();
					frame4.setVisible(true);
				} else if (result == JOptionPane.NO_OPTION) {
					JAVA2018E7120_Chart frame5 = new JAVA2018E7120_Chart();
					frame5.setVisible(true);
				}
			}
		});
		btnNewButton_1.setBounds(331, 313, 90, 23);
		contentPane.setLayout(null);
		contentPane.add(button);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));

		JButton btnNewButton_2 = new JButton("검색/수정/삭제");
		btnNewButton_2.setBounds(204, 313, 120, 23);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JAVA2018E7120_Search frame3 = new JAVA2018E7120_Search();
				frame3.setVisible(true);
			}
		});
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(8, 10, 570, 277);
		contentPane.add(textArea);
		textArea.setText("먼저 정보를 입력하시고, 새로고침 버튼을 눌러주세요.");
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBounds(8, 30, 570, 277);
		contentPane.add(scrollPane);

		JButton btnNewButton_3 = new JButton("새로고침");
		btnNewButton_3.setBounds(105, 313, 90, 23);
		contentPane.add(btnNewButton_3);
		btnNewButton_3.setFont(new Font("맑은 고딕", Font.PLAIN, 12));

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 594, 23);
		contentPane.add(menuBar);

		JMenu mnNewMenu = new JMenu("\uD30C\uC77C");
		menuBar.add(mnNewMenu);
		mnNewMenu.setFont(new Font("맑은 고딕", Font.PLAIN, 12));

		JMenuItem mntmNewMenuItem = new JMenuItem("\uC800\uC7A5"); // 파일 저장
		mnNewMenu.add(mntmNewMenuItem);
		mntmNewMenuItem.setFont(new Font("맑은 고딕", Font.PLAIN, 12));

		JLabel lblNewLabel_1 = new JLabel("1\uD559\uAE30: 0\uBA85 2\uD559\uAE30: 0\uBA85");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		lblNewLabel_1.setBounds(433, 305, 141, 43);
		contentPane.add(lblNewLabel_1);
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				BufferedWriter bwriter = null;
				FileWriter fwriter = null;
				try {
					int i = 0;
					fwriter = new FileWriter("Data.txt", false); //파일명, 확장자명 지정. 이미 있을 경우 덮어쓰기
					bwriter = new BufferedWriter(fwriter);
					for (JAVA2018E7120_Info grade1 : grade1.AL1) {
						grade1 = grade1.AL1.get(i);
						bwriter.write(grade1.toString()); //1학기 정보를 파일에 입력한다
						bwriter.newLine(); //줄 바꿈
						i++;
					}
					i=0;
					for (JAVA2018E7120_Info1 grade2 : grade2.AL2) {
						grade2 = grade2.AL2.get(i);
						bwriter.write(grade2.toString()); //2학기 정보를 파일에 입력한다
						bwriter.newLine(); //줄 바꿈
						i++;
					}
					JOptionPane.showMessageDialog(null, "프로그램의 경로에 파일이 저장되었습니다.", "완료", JOptionPane.INFORMATION_MESSAGE);
				} catch (IOException e) {
					JOptionPane.showMessageDialog(null, "알 수 없는 오류가 발생했습니다.", "오류", JOptionPane.ERROR_MESSAGE);
				}finally{ //작업이 끝나면
					// writer를 닫는다.
					if(bwriter != null) try{bwriter.close();}catch(IOException e){}
					if(fwriter != null) try{fwriter.close();}catch(IOException e){}
				}
			}
		});
		btnNewButton_3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				int cnt = 0;
				int cnt1 = 0;
				for (JAVA2018E7120_Info grade1 : grade1.AL1) {
					textArea.append(grade1.toString() + "\n");
					cnt++;
				}
				for (JAVA2018E7120_Info1 grade2 : grade2.AL2) {
					textArea.append(grade2.toString() + "\n");
					cnt1++;
				}
				lblNewLabel_1.setText("1학기: " + cnt + "명" + " " + "2학기: " + cnt1 + "명");
			}
		});

	}
}
