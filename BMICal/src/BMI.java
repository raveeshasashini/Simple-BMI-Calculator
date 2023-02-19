import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMI extends JFrame {
    private JPanel BMIPanel;
    private JTextField textWeight;
    private JTextField textHeight;
    private JButton calculateBMIButton;
    private JButton resetButton;

    private JLabel Display;
    private JRadioButton KGMetersRadioButton;
    private JRadioButton poundsInchesRadioButton;
    private JLabel Display2;

    public BMI() {
        add(BMIPanel);
        setVisible(true);
        setSize(300,250);
        setTitle("BMI Calculate...!!!");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        calculateBMIButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (poundsInchesRadioButton.isSelected() == true) {
                    float height = Float.parseFloat(textWeight.getText());
                    float weight = Float.parseFloat(textHeight.getText());
                    float result = (weight * 703) / (height * height);
                    if (result >= 30) {
                        Display.setText("Obese");
                    } else if (result < 29.9 && result >= 25) {
                        Display.setText("Over Weight");
                    } else if (result < 24.9 && result > 18.5) {
                        Display.setText("Normal");
                    } else if (result < 18.5) {
                        Display.setText("Under Weight");
                    }

                    Display2.setText(Float.toString(result));

                } else if (KGMetersRadioButton.isSelected() == true) {
                    float height = Float.parseFloat(textWeight.getText());
                    float weight = Float.parseFloat(textHeight.getText());
                    float result = (weight) / (height * height);
                    if (result >= 30) {
                        Display.setText("Obese");
                    } else if (result < 29.9 && result >= 25) {
                        Display.setText("Over Weight");
                    } else if (result < 24.9 && result > 18.5) {
                        Display.setText("Normal");
                    } else if (result < 18.5) {
                        Display.setText("Under Weight");
                    }
                    Display2.setText(Float.toString(result));
                }

            }
        });
        resetButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textWeight.setText("");
            textHeight.setText("");
            Display.setText("");
            Display2.setText("");
        }
    });

    }
    public static void main(String[] args){
        BMI b=new BMI();
    }


}
