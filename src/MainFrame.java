//Németh Angéla, Szoft/I/2/E, 2023-05/23 
//Feladat 0358

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
    InputPanel AoldalPanel;
    InputPanel BoldalPanel;
    InputPanel ColdalPanel;
    InputPanel indexPanel;
    JPanel buttonPanel;
    JButton calcButton;
        
    public MainFrame() {    
        this.setFrame();    
        this.initComponent();
        this.addComponent();
        this.handleEvent();
    }

    public void Greeting() {
        JOptionPane.showMessageDialog(this, "Németh Angéla, Szoft/I/2/E, 2023-05/23");
    }

    private void setFrame() {
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        this.pack();    
        this.setVisible(true);
    }

    private void initComponent() {
        this.AoldalPanel = new InputPanel("A oldal hossza");
        this.BoldalPanel = new InputPanel("B oldal hossza");
        this.ColdalPanel = new InputPanel("C oldal hossza");
        this.buttonPanel = new JPanel();
        this.indexPanel = new InputPanel("Paralelepipedon térfogat");
        this.calcButton = new JButton("Számít");
    }

    private void addComponent() {
        this.add(this.AoldalPanel);
        this.add(this.BoldalPanel);
        this.add(this.ColdalPanel);
        this.add(this.buttonPanel);    
        this.add(this.indexPanel);
        this.buttonPanel.add(this.calcButton);
    }

    private void handleEvent() {   
        this.calcButton.addActionListener(e  -> {   
            startCalc();
        });    
    }

    private void startCalc() {
        String AoldalStr = this.AoldalPanel.getValue();
        String BoldalStr = this.BoldalPanel.getValue();
        String ColdalStr = this.ColdalPanel.getValue();

        if(!this.checkInput(AoldalStr, BoldalStr, ColdalStr)) {
            JOptionPane.showMessageDialog(this, "Csak számjegy");
            return;
        }

        double oldalA = Double.parseDouble(AoldalStr);
        double oldalB = Double.parseDouble(BoldalStr);
        double oldalC = Double.parseDouble(ColdalStr);

        Double volume = this.calcParalelepipedonVolume(oldalA, oldalB, oldalC);   
        this.indexPanel.setValue(volume.toString());
    }

    public double calcParalelepipedonVolume(double Aoldal, double Boldal, double Coldal) {
        return Aoldal * Boldal * Coldal;
    }

    public boolean checkInput(String input1, String input2, String input3) {
        boolean ok = false;
        if(input1.matches("[0-9.]+") && input2.matches("[0-9.]+") && input3.matches("[0-9.]+")) {   
            ok = true;
        }
        return ok;
    }
}
