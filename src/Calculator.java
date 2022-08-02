import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.atomic.AtomicInteger;

public class Calculator
{
    public static void main(String[] args) {
        //window
        JFrame main = new JFrame("calculator");
        main.setBounds(300,100,800,800);
        main.setVisible(true);
        var addbtn = new JButton();
        //add button
        addbtn.setText("+");
        addbtn.setLocation(100,100);
        addbtn.setSize(90,40);
        addbtn.setVisible(true);
        main.add(addbtn);
        //sub button
        var subbtn = new JButton();
        subbtn.setText("-");
        subbtn.setLocation(190,100);
        subbtn.setSize(90,40);
        subbtn.setVisible(true);
        main.add(subbtn);
        //sub button
        var multbtn = new JButton();
        multbtn.setText("*");
        multbtn.setLocation(280,100);
        multbtn.setSize(90,40);
        multbtn.setVisible(true);
        main.add(multbtn);
        var divbtn = new JButton();
        divbtn.setText("/");
        divbtn.setLocation(370,100);
        divbtn.setSize(90,40);
        divbtn.setVisible(true);
        main.add(divbtn);
        //text math
        JLabel TItle = new JLabel("simple calculattor");
        main.add(TItle);
        TItle.setText(TItle.getText());
        TItle.setLocation(200,10);
        var number = new JTextField();
        number.setLocation(190,230);
        number.setSize(100,40);
        main.add(number);
        number.setVisible(true);
        number.setText("0");
        var ref = new Object() {
            Integer total = Integer.parseInt(number.getText());
        };
        ActionListener add = actionEvent -> {
             ref.total = Integer.parseInt(number.getText()) + Integer.parseInt(number.getText());
             number.setText(ref.total.toString());


        };

        ActionListener subtract = actionEvent -> {
            ref.total = ref.total - Integer.parseInt(number.getText());
            number.setText(ref.total.toString());


        };
       subbtn.addActionListener(subtract);
        ActionListener mult = actionEvent -> {
            ref.total = ref.total * Integer.parseInt(number.getText());
            number.setText(ref.total.toString());


        };
        ActionListener div = actionEvent -> {
            ref.total = Integer.parseInt(number.getText()) / Integer.parseInt(number.getText());
            number.setText(ref.total.toString());


        };
        //adds actions to button for btt
        multbtn.addActionListener(mult);
        addbtn.addActionListener(add);

        subbtn.addActionListener(subtract);
        divbtn.addActionListener(div);



    }




}
