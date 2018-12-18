package windowBuilderProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
public class FrmChange extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel panel1 = new JPanel(), 
panel2=new JPanel(), 
panel3=new JPanel(), 
panel4=new JPanel();
 
    public FrmChange() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        panel1.setBackground(Color.BLUE);
        panel2.setBackground(Color.RED);
        // panel3.setBackground(Color.ORANGE);
        
        initMenu();
        
        setPanel3();
        
        setLayout(new BorderLayout());
    }
 
    public void setPanel3() {
        JLabel j1 = new JLabel("섭씨 온도");
        JLabel j2 = new JLabel("화씨 온도");
        j1.setFont(new Font("Serif", Font.PLAIN, 12));
        j2.setFont(new Font("Serif", Font.PLAIN, 12));
        
        JTextField t1 = new JTextField(); t1.setSize(70, 18);
        JTextField t2 = new JTextField(); t2.setSize(70, 18);
        
        Dimension s1 = j1.getPreferredSize()
                    , s2 = j2.getPreferredSize();
    
        j1.setBounds(3, 5, s1.width, s1.height);
        j2.setBounds(s1.width + 10, 5, s2.width, s2.height);
 
        t1.setBounds(120, 5 , t1.getWidth(), t1.getHeight());
        t2.setBounds(200, 5 , t2.getWidth(), t2.getHeight());
        
        JButton btn = new JButton("변환");
        
        btn.setBounds(280, 5 , 70, 18);
        btn.setFont(new Font("Serif", Font.PLAIN, 12));
        
        panel3.add(j1);
        panel3.add(t1);
 
        panel3.add(j2);
        panel3.add(t2);
        
        panel3.add(btn);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  double tempera = (9/5.0) * Double.parseDouble( t1.getText() ) + 32 ;
                  t2.setText(Double.toString(tempera)) ;
            }
        });
 
    }
    
    private class MenuAction implements MouseListener{
        private JPanel panel;
 
        private MenuAction(JPanel pnl) {
            this.panel = pnl;
        }
 
        @Override
        public void mouseClicked(MouseEvent e) {
            changePanel(panel);
        }
 
        @Override
        public void mousePressed(MouseEvent e) {
        }
 
        @Override
        public void mouseReleased(MouseEvent e) {
        }
 
        @Override
        public void mouseEntered(MouseEvent e) {
        }
 
        @Override
        public void mouseExited(MouseEvent e) {
        }
    }
 
    private void initMenu() {
        JMenuBar menubar = new JMenuBar();
        JMenu  menu1 = new JMenu("과제1")
                , menu2 = new JMenu("과제2")
                , menu3 = new JMenu("과제3")
                , menu4 = new JMenu("과제4");
    
        menu1.setFont(new Font("Serif", Font.BOLD, 13));
        menu2.setFont(new Font("Serif", Font.BOLD, 13));
        menu3.setFont(new Font("Serif", Font.BOLD, 13));
        menu4.setFont(new Font("Serif", Font.BOLD, 13));
        
        menubar.add(menu1);
        menubar.add(menu2);
        menubar.add(menu3);
        menubar.add(menu4);
    
        setJMenuBar(menubar);
        menu1.addMouseListener(new MenuAction(panel1));
        menu2.addMouseListener(new MenuAction(panel2));
        menu3.addMouseListener(new MenuAction(panel3));
        menu4.addMouseListener(new MenuAction(panel4));
    }
 
    
    
    private void changePanel(JPanel panel) {
        getContentPane().removeAll();
        getContentPane().add(panel, BorderLayout.CENTER);
        
        getContentPane().doLayout();
        update(getGraphics());
        
        getContentPane().setVisible(true);
        
    }
 
    public static void main(String[] args) {
        FrmChange frame = new FrmChange();
        frame.setBounds(400, 400, 400, 400);
        frame.setResizable(false);
        frame.setVisible(true);
    }
 
}