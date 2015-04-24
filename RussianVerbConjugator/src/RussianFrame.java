import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RussianFrame extends JFrame{
    private JLabel rusLogo;
    private JLabel titleLabel;
    private JLabel spaceLabel;
    private JTextField entryField;
    private JButton inchesToCentimeters;
    private JButton centimetersToInches;
    
    public RussianFrame()
    {
        super("Русский Глагол Спряжение");
        setLayout(new FlowLayout());
         
        rusLogo = new JLabel(new ImageIcon("rusLogo.png"));
        add(rusLogo);

        titleLabel = new JLabel("Глагол:");
        add(titleLabel);
        
        entryField = new JTextField(10);
        add(entryField);
//        labelTitle = new JLabel("Metric Converter");
//        add(labelTitle);
//        
//        LabelInches = new JLabel("Inches");
//        add(LabelInches);
//        
//        fieldInches = new JTextField(10);
//        add(fieldInches);
//        
//        labelCentimeters = new JLabel("Centimeters");
//        add(labelCentimeters);
//        
//        fieldCentimeters = new JTextField(10);
//        add(fieldCentimeters);
        
//        inchesToCentimeters = new JButton("IN To CM");
//        add(inchesToCentimeters);
//        inchesToCentimeters.addActionListener(new InToCmButtonHandler());
//        
//        centimetersToInches = new JButton("CM To IN");
//        add(centimetersToInches);
//        centimetersToInches.addActionListener(new CmToInButtonHandler());
    }
}