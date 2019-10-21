package GeekBrains_HW_Lesson_4;

import javax.swing.*;

public class MyFirstApp {

    private JList<String> mainList;
    private JPanel panel1;
    private JTextField inputTextField;
    private JButton enterButton;

    public MyFirstApp() {
        DefaultListModel<String> mainModel = new DefaultListModel<>();
        mainList.setModel(mainModel);

        enterButton.addActionListener(e -> {
            mainModel.addElement(inputTextField.getText());
            inputTextField.setText("");
        });
        inputTextField.addActionListener(e -> {
            mainModel.addElement(inputTextField.getText());
            inputTextField.setText("");
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MyFirstApp");
        frame.setContentPane(new MyFirstApp().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
