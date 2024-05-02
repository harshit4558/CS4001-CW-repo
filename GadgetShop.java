import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.border.Border;;


public class GadgetShop implements ActionListener {

    // Frame
    private JFrame frame;

    // Panel
    private JPanel topPanel;
    private JPanel callPanel;
    private JPanel downloadPanel;
    private JPanel functionsPanel;
    private JPanel centerPanel;
    private JPanel bottomPanel;
    private JPanel clearPanel;
    private JPanel displayPanel;
    // Labels
    private JLabel header;
    private JLabel modelLabel;
    private JLabel priceLabel;
    private JLabel sizeLabel;
    private JLabel weightLabel;
    private JLabel creditLabel;
    private JLabel memoryLabel;
    private JLabel displayNumberLabel1;
    private JLabel displayNumberLabel2;
    private JLabel phoneNumberLabel;
    private JLabel callDurationLabel;
    private JLabel musicSizeLabel;
    // Buttons
    private JButton addMobileBtn;
    private JButton addMp3Btn;
    private JButton callBtn;
    private JButton downloadBtn;
    private JButton clearBtn;
    private JButton displayAllBtn;
    // Text Fields
    private JTextField modelField;
    private JTextField priceField;
    private JTextField sizeField;
    private JTextField weightField;
    private JTextField creditField;
    private JTextField memoryField;
    private JTextField displayNumberField1;
    private JTextField displayNumberField2;
    private JTextField phoneNumberField;
    private JTextField callDurationField;
    private JTextField musicSizeField;

    ArrayList<Gadget> gadgetList = new ArrayList<Gadget>();



    public static void main(String[] args) {
        GadgetShop gadgetShop = new GadgetShop();
    }


    public GadgetShop() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        Container contentPane = frame.getContentPane();
        Border border = BorderFactory.createLineBorder(Color.black);
        BoxLayout boxLayout = new BoxLayout(contentPane, BoxLayout.Y_AXIS);
        contentPane.setLayout(boxLayout);
        
        // top panel
        JPanel topPanel = new JPanel();
        header = new JLabel("GADGET SHOP");
        topPanel.add(header);
        topPanel.setBorder(border);
        // topPanel.setPreferredSize(new Dimension(150,50));

        // Centre panel
        centerPanel = new JPanel();
        // Labels
        modelLabel = new JLabel("Model : ");
        priceLabel = new JLabel("Price :");
        sizeLabel = new JLabel("Size :");
        weightLabel = new JLabel("Weight :");
        creditLabel = new JLabel("Credit :");
        memoryLabel = new JLabel("Memory :");

        // Text fields
        modelField = new JTextField(15);
        priceField = new JTextField(15);
        sizeField = new JTextField(15);
        weightField = new JTextField(15);
        creditField = new JTextField(15);
        memoryField = new JTextField(15);


        centerPanel.setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();

        // First column
        gc.anchor = GridBagConstraints.LINE_START;
        gc.weightx = 1;
        gc.weighty = 1;
        
        gc.gridx = 0;
        gc.gridy = 0;
        centerPanel.add(modelLabel,gc);

        gc.gridx = 0;
        gc.gridy = 1;
        centerPanel.add(sizeLabel,gc);

        gc.gridx = 0;
        gc.gridy = 2;
        centerPanel.add(creditLabel,gc);

        // Second Column
        gc.gridx = 1;
        gc.gridy = 0;
        centerPanel.add(modelField,gc);
        
        gc.gridx = 1;
        gc.gridy = 1;
        centerPanel.add(sizeField,gc);

        gc.gridx = 1;
        gc.gridy = 2;
        centerPanel.add(creditField,gc);

        // Add Mobile Button
        addMobileBtn = new JButton("Add Mobile");
        addMobileBtn.addActionListener(this);
        addMobileBtn.setPreferredSize(new Dimension(190, 30));
    
        gc.gridx = 1;
        gc.gridy = 3;
        centerPanel.add(addMobileBtn, gc);

        
        gc.gridx = 2;
        gc.gridy = 0;
        centerPanel.add(priceLabel,gc);

        gc.gridx = 2;
        gc.gridy = 1;
        centerPanel.add(weightLabel,gc);

        gc.gridx = 2;
        gc.gridy = 2;
        centerPanel.add(memoryLabel,gc);

        gc.gridx = 3;
        gc.gridy = 0;
        centerPanel.add(priceField,gc);

        gc.gridx = 3;
        gc.gridy = 1;
        centerPanel.add(weightField,gc);

        gc.gridx = 3;
        gc.gridy = 2;
        centerPanel.add(memoryField,gc);

        addMp3Btn = new JButton("Add MP3");
        addMp3Btn.addActionListener(this);
        addMp3Btn.setPreferredSize(new Dimension(190, 30));
        gc.gridx = 3;
        gc.gridy = 3;
        centerPanel.add(addMp3Btn,gc);
        // Add Border
        centerPanel.setBorder(BorderFactory.createTitledBorder("Inventory"));

        // Call Panel
        callPanel = new JPanel();
        // Labels
        displayNumberLabel1 = new JLabel("Display Number : ");
        phoneNumberLabel = new JLabel("Phone Number : ");
        callDurationLabel = new JLabel("Call Duration : ");
        // Text Fields
        displayNumberField1 = new JTextField(15);
        phoneNumberField = new JTextField(15);
        callDurationField = new JTextField(15);
        // Buttons 
        callBtn = new JButton("Call");
        callBtn.addActionListener(this);
        callBtn.setPreferredSize(new Dimension(190,30));
        downloadBtn = new JButton("Download");
        downloadBtn.addActionListener(this);

        callPanel.setLayout(new GridBagLayout());
        GridBagConstraints gc1 = new GridBagConstraints();
        gc1.anchor = GridBagConstraints.LINE_START;
        gc1.weightx = 1;
        gc1.weighty = 1;

        
        gc1.gridx = 0;
        gc1.gridy = 0;
        callPanel.add(displayNumberLabel1,gc1);

        gc1.gridx = 0;
        gc1.gridy = 1;
        callPanel.add(phoneNumberLabel,gc1);

        gc1.gridx = 0;
        gc1.gridy = 2;
        callPanel.add(callDurationLabel,gc1);

        gc1.anchor = GridBagConstraints.LINE_END;
        gc1.gridx = 1;
        gc1.gridy = 0;
        callPanel.add(displayNumberField1,gc1);
        
        gc1.gridx = 1;
        gc1.gridy = 1;
        callPanel.add(phoneNumberField,gc1);

        gc1.gridx = 1;
        gc1.gridy = 2;
        callPanel.add(callDurationField,gc1);

        gc1.gridx = 1;
        gc1.gridy = 3;
        callPanel.add(callBtn,gc1);

        // Border
        callPanel.setBorder(BorderFactory.createTitledBorder("Make a Call"));

        // Download Panel
        downloadPanel = new JPanel();
        // labels
        musicSizeLabel = new JLabel("Music Size: ");
        displayNumberLabel2 = new JLabel("Display Number: ");
        // text fields
        musicSizeField = new JTextField(15);
        displayNumberField2 = new JTextField(15);
        // Button
        downloadBtn = new JButton("Download");
        downloadBtn.addActionListener(this);
        downloadBtn.setPreferredSize(new Dimension(190,30));

        downloadPanel.setLayout(new GridBagLayout());
        GridBagConstraints gc2 = new GridBagConstraints();
        gc2.anchor = GridBagConstraints.LINE_START;
        gc2.weightx = 1;
        gc2.weighty = 1;

        gc2.gridx = 0;
        gc2.gridy = 0;
        downloadPanel.add(displayNumberLabel2,gc2);

        gc2.gridx = 0;
        gc2.gridy = 1;
        downloadPanel.add(musicSizeLabel,gc2);

        gc2.anchor = GridBagConstraints.LINE_END;

        gc2.gridx = 1;
        gc2.gridy = 0;
        downloadPanel.add(displayNumberField2,gc2);

        gc2.gridx = 1;
        gc2.gridy = 1;
        downloadPanel.add(musicSizeField,gc2);

        gc2.gridx = 1;
        gc2.gridy = 3;
        downloadPanel.add(downloadBtn,gc2);

        downloadPanel.setBorder(BorderFactory.createTitledBorder("Download Music"));

        // Functions Panel
        functionsPanel = new JPanel();
        functionsPanel.setLayout(new GridLayout(0,2));
        functionsPanel.add(callPanel);
        functionsPanel.add(downloadPanel);

        // Clear Panel
        clearPanel = new JPanel();
        // Buttons
        clearBtn = new JButton("Clear");
        clearBtn.addActionListener(this);
        clearBtn.setPreferredSize(new Dimension(300,30));
        clearPanel.add(clearBtn);

        // Dislplay Panel
        displayPanel = new JPanel();
        // Button
        displayAllBtn = new JButton("Display All");
        displayAllBtn.addActionListener(this);
        displayAllBtn.setPreferredSize(new Dimension(300,30));
        displayPanel.add(displayAllBtn);

        // Bottom Panel
        bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(2,0));
        bottomPanel.add(clearPanel);
        bottomPanel.add(displayPanel);

        
        contentPane.add(topPanel);
        contentPane.add(centerPanel);
        contentPane.add(functionsPanel);
        contentPane.add(bottomPanel);

        frame.setVisible(true);
        frame.pack();

    }

    // FUNCTIONALITY
    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();
        if (command.equals("Add Mobile")) {
            addMobile();
        }
        if (command.equals("Add MP3")) {
            addMp3();
        }
        if (command.equals("Call")) {
            call(getDisplayNumber1());
        }
        if (command.equals("Download")) {
            download(getDisplayNumber2());
        }
        if (command.equals("Clear")) {
            clear();
        }
        if (command.equals("Display All")) {
            display();
        }
    }


    // ADD MOBILE
    public void addMobile() {
        if (stringCheck(getModel())) {
            if (stringCheck(getSize())) {
                if (priceCheck(getPrice())) {
                    if (valueCheck(getWeight())) {
                        if (valueCheck(getCredit())) {
                            Mobile newMobile = new Mobile(getModel(), getSize(), getWeight(), getPrice(), getCredit());                               
                            gadgetList.add(newMobile);
                            JOptionPane.showMessageDialog(frame, "A new Mobile is added to the inventory");
                            clear();
                    
        }}}}} 
        // else {
        //     JOptionPane.showMessageDialog(frame, "Something's not right, please check your entyr");
        // }          
    }

    // ADD MP3
    public void addMp3() {
        if (stringCheck(getModel())) {
            if (stringCheck(getSize())) {
                if (priceCheck(getPrice())) {
                    if (valueCheck(getWeight())) {
                        if (valueCheck(getMemory())) {
                            Mp3 newMp3 = new Mp3(getModel(), getSize(), getPrice(), getWeight(), getMemory());
                            gadgetList.add(newMp3);
                            JOptionPane.showMessageDialog(frame, "A new MP3 is added to the inventory");
                            clear();
                        }
                    }
                }
            }
        }
          
    }

    // CALL
    public void call(int i) {
        i = i-1;
        if (i >= 0 && phoneNumberCheck(getPhoneNumber()) && valueCheck(getCallDuration()) ) {
            try {
                Gadget gadget = gadgetList.get(i);
                if (gadget instanceof Mobile) {
                    ((Mobile)gadget).phoneCall(getPhoneNumber(), getCallDuration());
                    clear();                            
                    
                } else {
                    JOptionPane.showMessageDialog(frame, "There is no Mobile with this display number");
                    clear();
                }
            } catch (IndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(frame, "Gadget with this display number does not exist");
            }
            
        } 
    }

    // DOWNLOAD MUSIC
    public void download(int j) {
        j = j - 1;
        if (j >=  0 && valueCheck(getMusicSize())) {
            try {
                Gadget gadget = gadgetList.get(j);
                if (gadget instanceof Mp3) {
                    {
                        ((Mp3)gadget).downloadMusic(getMusicSize());
                        clear();
                    }                        
                } else {
                    JOptionPane.showMessageDialog(frame, "There is no MP3 with this display number");
                    clear();
                }
            } catch (IndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(frame, "Gadget with this display number does not exist");
                clear();
            }

        }
    }
    


    // CLEAR
    public void clear() {
        modelField.setText(null);
        priceField.setText(null);
        sizeField.setText(null);
        weightField.setText(null);
        creditField.setText(null);
        memoryField.setText(null);
        displayNumberField1.setText(null);
        displayNumberField2.setText(null);
        phoneNumberField.setText(null);
        callDurationField.setText(null);
        musicSizeField.setText(null);

    }

    // DISPLAY
    public void display() {
        clearTerminal();
        for (Gadget gadget : gadgetList) {
            System.out.println(gadgetList.indexOf(gadget) + 1 + ":");
            gadget.display();
            System.out.println();
        }
    }


    public void clearTerminal() {
        System.out.println('\u000C');
    }



    // ACCESSORS ----  

    public String getModel() {
        String aModel = null;
        try {
            aModel = modelField.getText();   
            if (aModel.isEmpty()) {
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(frame, "Please enter a model entry");
            clear();
        }
        return aModel;
    }


    public String getSize() { 
        String aSize = null;

       try {
            aSize = sizeField.getText();
            if (aSize.isEmpty()) {
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(frame, "Please enter a size entry");
            clear();
       }
       return aSize;
    }

    public float getPrice() {
        float aPrice = 0;
        try {
            aPrice = Float.parseFloat(priceField.getText());
            if (aPrice < 0) {
                JOptionPane.showMessageDialog(frame, "Please enter a positive price value");
                clear();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Please enter a valid price entry");
            clear();
        }
        return aPrice;
    }
    public int getCredit() {
        int aCredit = 0;
        try {
            aCredit = Integer.parseInt(creditField.getText());
            if (aCredit < 0) {
                JOptionPane.showMessageDialog(frame, "Please enter a Positive credit value");
                clear();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Please enter a valid credit entry");
            clear();
        }
        return aCredit;
    }
    public int getWeight() {
        int aWeight = 0;
        try {
            aWeight = Integer.parseInt(weightField.getText());
            if (aWeight < 0) {
                JOptionPane.showMessageDialog(frame, "Please enter a positive weight value");
                clear();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Please enter a valid weight entry");
            clear();
        }
        return aWeight;
    }
    public int getMemory() {
        int aMemory = 0;
        try {
            aMemory = Integer.parseInt(memoryField.getText());
            if (aMemory < 0) {
                JOptionPane.showMessageDialog(frame, "Please enter a positve Storage value");
                clear();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Please enter a valid storage value");
            clear();
        }
        return aMemory;
    }

    public int getDisplayNumber1() {
        int aDisplayNumber1 = 0;
        try {
            aDisplayNumber1 = Integer.parseInt(displayNumberField1.getText());
            if (aDisplayNumber1 <= 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Please enter a valid display number");
            clear();
        }
        return aDisplayNumber1;
    }
    public int getDisplayNumber2() {
        int aDisplayNumber2 = 0;
        try {
            aDisplayNumber2 = Integer.parseInt(displayNumberField2.getText());
            if (aDisplayNumber2 <= 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Please enter a valid display number" );
            clear();
        }
        return aDisplayNumber2;
    }

    public int getCallDuration() {
        int aCallDuration = 0;
        try {
            aCallDuration = Integer.parseInt(callDurationField.getText());
            
            
            if (aCallDuration < 0) {
                JOptionPane.showMessageDialog(frame, "Please enter valid call duration");
                clear();
        
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Please enter valid call duration");
            clear();
        }
        return aCallDuration;
    }
    public long getPhoneNumber() {
        long aPhoneNumber = 0;
        try {
            aPhoneNumber = Integer.parseInt(phoneNumberField.getText());
            if (phoneNumberField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please enter a valid phone number");
            }
            if (aPhoneNumber <= 0) {
                JOptionPane.showMessageDialog(frame, "Please enter a valid phone number");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Please enter a valid phone number");
            clear();
        }
        return aPhoneNumber;
    }
    public int getMusicSize() {
        int aMusicSize = 0;
        try {
            aMusicSize = Integer.parseInt(musicSizeField.getText());
            if (aMusicSize < 0) {
                JOptionPane.showMessageDialog(frame, "Please enter a valid Music size");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Please enter a valid Music size");
            clear();
        }
        
        return aMusicSize;
    }

// ADDITIONAL METHODS
public int numberOfgadgets() {
    return gadgetList.size();
}

public boolean phoneNumberCheck(long a) {
    if (a <= 0) {
        return false;
    } 
    else {
        return true;
    }
} 

public boolean valueCheck(int a) {
    if (a <= 0) {
        return false;
    }   
    else {
        return true;
    }
}

public boolean priceCheck (float a) {
    if (a <= 0) {
        return false;
    } else {
        return true;
    }
}
public boolean stringCheck(String a) {
    if (a.isEmpty()) {
        return false;
    } else {
        return true;
    }
}


}