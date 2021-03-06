import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_fj=new JLabel();
    JLabel label_bj=new JLabel();
    int cell=128;
    int row=16,column=16;
    //构造方法
    public App() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyCode() == KeyEvent.VK_UP){
                    label_fj.setBounds(label_fj.getX(),label_fj.getY()-row,cell,cell);
                }
                if(e.getKeyCode() == KeyEvent.VK_DOWN){
                    label_fj.setBounds(label_fj.getX(),label_fj.getY()+row,cell,cell);
                }

                if(e.getKeyCode() == KeyEvent.VK_RIGHT){
                    label_fj.setBounds(label_fj.getX()+column,label_fj.getY(),cell,cell);
                }
                if(e.getKeyCode() == KeyEvent.VK_LEFT){
                    label_fj.setBounds(label_fj.getX()-column,label_fj.getY(),cell,cell);
                }

            }
        });
    }
    //显示窗体方法
    void go(){
        java.net.URL imgURL = App.class.getResource("img/plane0.png");
        label_fj.setIcon(new ImageIcon(imgURL));
        label_fj.setBounds(250-(cell/2),700,cell,cell);

        java.net.URL imgURL1 = App.class.getResource("img/bj.png");
        label_bj.setIcon(new ImageIcon(imgURL1));
        label_bj.setBounds(0,0,500,844);


        myPanel.add(label_fj);
        myPanel.add(label_bj);
        myPanel.setLayout(null);
        JFrame frame = new JFrame("雷霆小战机");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,500,880);
        //frame.pack();
        frame.setVisible(true);
        myPanel.setFocusable(true);//键盘监听必须加panel面板的焦点获取才可以
    }
    public static void main(String[] args) {
        new App().go();
    }
}
