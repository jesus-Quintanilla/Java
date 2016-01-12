package retailcalcdemo;

/**
 *
 *  by Jesus Quintanilla
 * 
 */
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;
public class RetailCalculator extends JFrame{
    private final int x = 450;
    private final int y = 400;
    private int retailPrice;
    private JPanel panel;
    private JButton button;
    private JTextField userInput1,userInput2;
    private JLabel label1,label2;
    //java API to Format Decimal Output
    private DecimalFormat format = new DecimalFormat("#,##0.00");;
    RetailCalculator(){
   // sets size of window + method for what to do when user click's X on window
        setSize(x,y);
        // will set window placement relative to where an object is null means middle 
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Retail Calculator");
        // user display of whats is needed
        label1= new JLabel("Enter Whole-Sale Price for an Item");
        label2= new JLabel("Enter Percent Markup as Whole Number e.g 20% as 20");
        // users input 
        userInput1 = new JTextField(10);
        userInput2 = new JTextField(10);
        //panel to Orginize Content withint the JFrame window
        panel = new JPanel();
        // button + button event handler
        button = new JButton("Calculate");
        button.addActionListener(new ButtonListener());
        // methods to add elements to JPanel 
        panel.add(label1);
        panel.add(userInput1);
        panel.add(label2);
        panel.add(userInput2);
        panel.add(button);
        add(panel);
        setVisible(true);
        }// end of constructor
    private class ButtonListener implements ActionListener{
       
        @Override
        public void actionPerformed (ActionEvent e){
            try{
            JOptionPane.showMessageDialog(rootPane,"WholeSale Price: $"+format.format(Double.parseDouble(userInput1.getText()))
                    +"\n Percent Markup :" +userInput2.getText()+"%"
                    +"\n Retail Price is $"
                    +format.format(Calculate(Double.parseDouble(userInput1.getText()),Double.parseDouble(userInput2.getText())))
                    );
            }
            catch(NumberFormatException ex){
              JOptionPane.showMessageDialog(null,"Must Enter A Number for price AND percent");
            }
          }
       }// end Button Listener
     private double Calculate(double whole,double percent){
         double wholeSale = whole;
         double percentRetail = percent;
         double retailPrice1;
         double calc;
         calc = whole * (percent/100);
         retailPrice1 = wholeSale + calc;
         return retailPrice1;
       }  
 }// end of class

