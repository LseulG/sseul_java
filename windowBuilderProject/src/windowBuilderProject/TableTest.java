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
	//필드 선언
    private JPanel jContentPane = null;
    private JTable list_table;
    private JButton add_row_btn, delete_row_btn, print_btn;
    private JLabel join_label, name_label, address_label, tel_label;
    private JTextField name_field, address_field, tel_field;

//생성자
    public TableTest() {
        super();
       // initialize();
        this.createCompents(); //컴포넌트를 만든 메소드 호출
        this.connectEventListener(); //이벤트 리스너 연결 메소드 호출
    }

//컴포넌트 생성&패널에 붙이는 메소드
    public void createCompents(){
        String colum_names[] = {"이름", "전화번호", "주소"};
        DefaultTableModel model = new DefaultTableModel(colum_names, 0);
        this.list_table = new JTable(model);
        //라벨 생성
        this.join_label = new JLabel("회원가입");
        this.name_label = new JLabel("이름");
        this.address_label = new JLabel("주소");
        this.tel_label = new JLabel("연락처");
        //텍스트 필드 생성
        this.name_field = new JTextField();
        this.address_field = new JTextField();
        this.tel_field = new JTextField();
        //버튼 생성
        this.add_row_btn = new JButton("추가");
        this.delete_row_btn = new JButton("삭제");
        this.print_btn = new JButton("출력");
//버튼이 들어갈 그리드 레이아웃의  패널 생성
        JPanel btn_panel = new JPanel(new GridLayout(1, 3));
//패널에 버튼 붙이기
        btn_panel.add(this.add_row_btn);
        btn_panel.add(this.delete_row_btn);
        btn_panel.add(this.print_btn);
        //회원가입의 내용이 들어갈 그리드 레이아웃의  패널 생성
        JPanel form_panel = new JPanel(new GridLayout(4, 2));
//패널에 회원가입에 들어갈 라벨&텍스트 필드 컴포넌트 붙이기
        form_panel.add(new JLabel(""));
        form_panel.add(this.join_label);
        form_panel.add(this.name_label);
        form_panel.add(this.name_field);
        form_panel.add(this.address_label);
        form_panel.add(this.address_field);
        form_panel.add(this.tel_label);
        form_panel.add(this.tel_field);
        //스크롤바가 생기는 스크롤패널 생성&테이블을 붙임
        JScrollPane jscrollpane = new JScrollPane(this.list_table);
//테이블이 있는 스크롤패널을 ContentPane패널에 붙임
        this.getContentPane().add(jscrollpane, BorderLayout.CENTER); 
//버튼이 만들어진 패널을 ContentPane패널에 붙임
        this.getContentPane().add(btn_panel, BorderLayout.SOUTH);
//회원가입 양식이 들어있는 패널을 ContentPane패널에 붙임
        this.getContentPane().add(form_panel, BorderLayout.WEST);
    }

    //이벤트 리스너 연결 메소드
    public void connectEventListener(){
//테이블과 텍스트 필드의 내용을 리스너 클래스로 넘김
        TableEventListener tel = new TableEventListener(this.list_table, this.name_field, this.address_field, this.tel_field);
        this.add_row_btn.addActionListener(tel);
        this.delete_row_btn.addActionListener(tel);
        this.print_btn.addActionListener(tel);
    }
}



