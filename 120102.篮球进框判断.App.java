import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_ball=new JLabel();
    JLabel label_basket=new JLabel();
    JLabel label_background=new JLabel();
    //构造方法

    int cell=64;
    int x,y;
    public App() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyCode() == KeyEvent.VK_UP){
                    y--;
                    label_ball.setBounds(x*cell,y*cell,cell,cell);
                }
                if(e.getKeyCode() == KeyEvent.VK_DOWN){
                    y++;
                    label_ball.setBounds(x*cell,y*cell,cell,cell);
                }
                if(e.getKeyCode() == KeyEvent.VK_LEFT){
                    x--;
                    label_ball.setBounds(x*cell,y*cell,cell,cell);
                }
                if(e.getKeyCode() == KeyEvent.VK_RIGHT){
                    x++;
                    label_ball.setBounds(x*cell,y*cell,cell,cell);
                }

                if (label_basket.getX() == label_ball.getX() && label_basket.getY() == label_ball.getY()) {
                    JOptionPane.showMessageDialog(null,"恭喜球进了");
                }
            }
        });
    }
    //显示窗体方法
    void go(){
        java.net.URL imgball=App.class.getResource("img/ball.gif");
        label_ball.setIcon(new ImageIcon(imgball));
        label_ball.setBounds(0,128,cell,cell);
        java.net.URL imgbasket=App.class.getResource("img/basket.jpg");
        label_basket.setIcon(new ImageIcon(imgbasket));
        label_basket.setBounds(128,0,cell,cell);
        java.net.URL imgbackground=App.class.getResource("img/background.jpg");
        label_background.setIcon(new ImageIcon(imgbackground));
        label_background.setBounds(0,0,1024,768);

        myPanel.setLayout(null);

        myPanel.add(label_ball);
        myPanel.add(label_basket);
        myPanel.add(label_background);
        JFrame frame = new JFrame("Basketball Game");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1024,768);
        //frame.pack();
        frame.setVisible(true);
        myPanel.setFocusable(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
