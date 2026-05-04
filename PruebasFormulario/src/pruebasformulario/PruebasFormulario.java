
package pruebasformulario;

import javax.swing.*;
import java.awt.event.*;

class PruebasFormulario extends JFrame implements ActionListener, ItemListener{
    //Declaraciones
    
    JButton c1;
    JTextField jtNombre1;
    public PruebasFormulario(){
        crearDisenyo();
    }
    
    private void crearDisenyo(){
        //Frame
        setLayout(null);
        setTitle("Tres en Raya");
        
        //Button
        
        c1 = new JButton();
            c1.setBounds(220, 120, 80, 80);
            add(c1);
            c1.addActionListener(this);
            
        //TextField
        jtNombre1 = new JTextField("HOLA");
            jtNombre1.setBounds(600, 200, 120, 30);
            add(jtNombre1);
            jtNombre1.setText("hola");
            
        //JLabel
            
    }
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        // Aquí es donde irá el código de lo que pasa al pulsar botones
        System.out.println("Se ha pulsado un botón");
    }
    @Override
    public void itemStateChanged(java.awt.event.ItemEvent e) {
        // Código para gestionar cambios en CheckBox o ComboBox
    }

}
