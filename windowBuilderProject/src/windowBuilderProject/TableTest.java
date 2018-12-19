package windowBuilderProject;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class TableTest {
	//�ʵ� ����
    private JPanel jContentPane = null;
    private JTable list_table;
    private JButton add_row_btn, delete_row_btn, print_btn;
    private JLabel join_label, name_label, address_label, tel_label;
    private JTextField name_field, address_field, tel_field;

//������
    public TableTest() {
        super();
       // initialize();
        this.createCompents(); //������Ʈ�� ���� �޼ҵ� ȣ��
        this.connectEventListener(); //�̺�Ʈ ������ ���� �޼ҵ� ȣ��
    }

//������Ʈ ����&�гο� ���̴� �޼ҵ�
    public void createCompents(){
        String colum_names[] = {"�̸�", "��ȭ��ȣ", "�ּ�"};
        DefaultTableModel model = new DefaultTableModel(colum_names, 0);
        this.list_table = new JTable(model);
        //�� ����
        this.join_label = new JLabel("ȸ������");
        this.name_label = new JLabel("�̸�");
        this.address_label = new JLabel("�ּ�");
        this.tel_label = new JLabel("����ó");
        //�ؽ�Ʈ �ʵ� ����
        this.name_field = new JTextField();
        this.address_field = new JTextField();
        this.tel_field = new JTextField();
        //��ư ����
        this.add_row_btn = new JButton("�߰�");
        this.delete_row_btn = new JButton("����");
        this.print_btn = new JButton("���");
//��ư�� �� �׸��� ���̾ƿ���  �г� ����
        JPanel btn_panel = new JPanel(new GridLayout(1, 3));
//�гο� ��ư ���̱�
        btn_panel.add(this.add_row_btn);
        btn_panel.add(this.delete_row_btn);
        btn_panel.add(this.print_btn);
        //ȸ�������� ������ �� �׸��� ���̾ƿ���  �г� ����
        JPanel form_panel = new JPanel(new GridLayout(4, 2));
//�гο� ȸ�����Կ� �� ��&�ؽ�Ʈ �ʵ� ������Ʈ ���̱�
        form_panel.add(new JLabel(""));
        form_panel.add(this.join_label);
        form_panel.add(this.name_label);
        form_panel.add(this.name_field);
        form_panel.add(this.address_label);
        form_panel.add(this.address_field);
        form_panel.add(this.tel_label);
        form_panel.add(this.tel_field);
        //��ũ�ѹٰ� ����� ��ũ���г� ����&���̺��� ����
        JScrollPane jscrollpane = new JScrollPane(this.list_table);
//���̺��� �ִ� ��ũ���г��� ContentPane�гο� ����
        this.getContentPane().add(jscrollpane, BorderLayout.CENTER); 
//��ư�� ������� �г��� ContentPane�гο� ����
        this.getContentPane().add(btn_panel, BorderLayout.SOUTH);
//ȸ������ ����� ����ִ� �г��� ContentPane�гο� ����
        this.getContentPane().add(form_panel, BorderLayout.WEST);
    }

    //�̺�Ʈ ������ ���� �޼ҵ�
    public void connectEventListener(){
//���̺�� �ؽ�Ʈ �ʵ��� ������ ������ Ŭ������ �ѱ�
        TableEventListener tel = new TableEventListener(this.list_table, this.name_field, this.address_field, this.tel_field);
        this.add_row_btn.addActionListener(tel);
        this.delete_row_btn.addActionListener(tel);
        this.print_btn.addActionListener(tel);
    }
}



