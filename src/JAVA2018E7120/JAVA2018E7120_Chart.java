package JAVA2018E7120;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import org.osgi.framework.ServiceFactory;

import JAVA2018E7120.JAVA2018E7120_Info.Subject;

import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.table.DefaultTableModel;

public class JAVA2018E7120_Chart extends JFrame {
	JAVA2018E7120_Info grade1;
	JAVA2018E7120_Info1 grade2;
	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private Object major;
	private Object lib;
	private Object curevt;
	private Object total;
	private Object avg;
	private Object sem;
	private Object rank;
	private String name;
	private Object stdnum;
	int i = 0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JAVA2018E7120_DataStats frame = new JAVA2018E7120_DataStats();
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
	public JAVA2018E7120_Chart() {
		getContentPane().setLayout(null);

		setTitle("\uD1B5\uACC4 \uC790\uB8CC");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 440, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		ArrayList<JAVA2018E7120_Info> grade1_1 = grade1.AL1;
		ArrayList<JAVA2018E7120_Info1> grade2_1 = grade2.AL2;

		Object[][] object = new Object[100][9];
		
		if (grade1_1.size() != 0) {
			for (JAVA2018E7120_Info grade1 : grade1.AL1) {
				object[i][0] = grade1.getname();
				object[i][1] = grade1.getstdnum();
				object[i][2] = grade1.getsem();
				object[i][3] = grade1.getmajor();
				object[i][4] = grade1.getlib();
				object[i][5] = grade1.getcurevt();
				object[i][6] = grade1.gettotal();
				object[i][7] = grade1.getavg();
				object[i][8] = grade1.getrank();
				i++;
			}
		}
		if (grade2_1.size() != 0) {
			for (JAVA2018E7120_Info1 grade2 : grade2.AL2) {
				object[i][0] = grade2.getname();
				object[i][1] = grade2.getstdnum();
				object[i][2] = grade2.getsem();
				object[i][3] = grade2.getmajor();
				object[i][4] = grade2.getlib();
				object[i][5] = grade2.getcurevt();
				object[i][6] = grade2.gettotal();
				object[i][7] = grade2.getavg();
				object[i][8] = grade2.getrank();
				i++;
			}
		}String[] colName = { "이름", "학번", "학기", "전공", "교양", "시사", "총점", "평균", "학점" };
		table_1 = new JTable(object, colName);
		
		table_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		table_1.setBounds(12, 10, 410, 241);
		contentPane.add(table_1);

		JScrollPane scrollPane = new JScrollPane(table_1);
		scrollPane.setBounds(12, 10, 410, 241);
		contentPane.add(scrollPane);
	}
}