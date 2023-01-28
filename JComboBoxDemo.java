

import javax.swing.*;
import java.awt.event.*;

class JComboBoxDemoTASK2 extends JFrame implements ActionListener{
        // To declare the components
    JTextField itemTF;
    JButton addItembtn,ItemRemovebtn,AllItemRemove;
    JComboBox ItemCBox;
    JLabel ItemLable;
    String[] Items;
    int Cnt=0;
    
    JComboBoxDemoTASK2(){
        
    // To create TextField
        itemTF = new JTextField ();
        itemTF.setBounds(10,20,100,25);
                
    // To create buttons
        addItembtn = new JButton ("Add Item");
        addItembtn.setBounds (120, 20, 100, 25);
        ItemRemovebtn = new JButton ("Remove Selected Item");
        ItemRemovebtn.setBounds (10, 60, 210, 25);
        AllItemRemove = new JButton ("Remove All Items");
        AllItemRemove.setBounds (10, 95, 210, 25);

    // to create JCombobox
        Items = new String[] {};
        ItemCBox = new JComboBox(Items);
        ItemCBox.setBounds (230, 20, 100, 25);
                
    // to create label
        ItemLable = new JLabel("Total Items = 0");
        ItemLable.setBounds(230, 60, 100, 25);

    // to add action listeners to buttons
        addItembtn.addActionListener (this);
        add(addItembtn);
        ItemRemovebtn.addActionListener (this);
        add(ItemRemovebtn);
        AllItemRemove.addActionListener (this);
        add(AllItemRemove);

    // to add components to JFrame
        add(ItemLable);
        add(itemTF);
        add(ItemCBox);
    
    // JFrame Properties
        setSize (400, 230);
        setLayout (null);
        setVisible (true);
        setTitle("JComboBox demo");
    // code to close the JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    // Method to perform actions
    public void actionPerformed (ActionEvent e){
        
    // if user clicks on Add button
        if (e.getSource()==addItembtn){
                    
        String item =itemTF.getText();
        
        ItemCBox.addItem(item);
        
        Cnt++;
        
        ItemLable.setText("Total Items = "+String.valueOf(Cnt));
    }
        
    // if user clicks on Remove Selected Item button
        if (e.getSource()==ItemRemovebtn){
        int index = ItemCBox.getSelectedIndex();
                
        if (index > -1){
        ItemCBox.removeItemAt(index);
        Cnt--;
        ItemLable.setText("Total Items = "+String.valueOf(Cnt));
            }
                        
        }
    // if user clicks on Remove All Items button
        if (e.getSource()==AllItemRemove){
            ItemCBox.removeAllItems();
            Cnt = 0;
            ItemLable.setText("Total Items = "+String.valueOf(Cnt));
        }

    }
        // Main method
    public static void main (String args[]){
        new JComboBoxDemoTASK2();
    }
}

