import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class AppletEventHandle extends Applet implements ActionListener
{
    // Define Basic Components To Display
    Label label1,label2,output;
    TextField tempInput;
    Checkbox ckKelvin,ckFarenh;
    CheckboxGroup ckgrp;
    
    // Initialize Frame 
    public void init()
    {
        label1 = new Label("Enter Temprature In Celcius : ");
        tempInput = new TextField(15);

        label2 = new Label("Choose Conversion Unit ");
        ckgrp = new CheckboxGroup();
        ckKelvin = new Checkbox("kelvin",ckgrp,false);
        ckFarenh = new Checkbox("farenheight",ckgrp,false);

        Button submitBtn=new Button("Convert");

        // Ouput Will Be Displayed on this label
        output = new Label("Output Will Be Displayed Here");

        add(label1);
        add(tempInput);
        add(label2);
        add(ckFarenh);
        add(ckKelvin);
        add(submitBtn);
        add(output);

        // When Submit button clicked
        submitBtn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        // Check if user has selected checkbox or not
        if(ckgrp.getSelectedCheckbox()!=null)
        {
            // get data from input box and convert to double
            double tempInp = Double.parseDouble(tempInput.getText());

            // Display Result
            if(ckgrp.getSelectedCheckbox().getLabel() == "kelvin")
            {
                output.setText("Temprature in Kelvin = "+Double.toString(tempInp+273));
            }
            else
            {
                output.setText("Temprature in Farenheight = "+Double.toString((tempInp*1.8)+32));
            }
        }
    }
}