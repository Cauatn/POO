import java.awt.*;

import javax.swing.*;

public class Login extends JFrame {
    private JLabel title;
    private JTextField usernameField, emailField;

    public Login (){
        Color backgroundColor = new Color(30, 30 ,30);
        
        setTitle("PomoPlus | Your favorite Pomodoro App");
        setSize(700, 700);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        getContentPane().setBackground(backgroundColor);

        this.title = new JLabel("PomoPlus");
        this.title.setFont(new Font("Sans-Serif", Font.BOLD, 40));
        this.title.setForeground(Color.red);
        add(this.title);
    }
}
