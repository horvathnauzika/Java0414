package hu.szamalk.nezet;

import hu.szamalk.modell.Gyujtemeny;
import hu.szamalk.modell.Mukincs;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;

public class GuiForm {
    private JComboBox comboBeolvasottak;
    private JPanel panelMain;
    private JButton buttonUjSzobor;
    private JButton buttonMasolas;
    private JList list1;
    private JFrame frame;
    private JMenuItem beolvas, kilepes;

    public GuiForm() {
        init();

        kilepes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kilepes();
            }
        });

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                kilepes();
            }
        });

        beolvas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser jfc = new JFileChooser(new File(System.getProperty("user.dir")));
                if(jfc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                    File fajl = jfc.getSelectedFile();
                    try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fajl))) {
                        Gyujtemeny gyujtemeny = (Gyujtemeny) ois.readObject();
                        DefaultComboBoxModel<String> dlm = (DefaultComboBoxModel<String>) comboBeolvasottak.getModel();
                        for (Mukincs s : gyujtemeny.getMukincsek()) {
                            dlm.addElement(String.valueOf(s));
                        }
                    }catch (FileNotFoundException ex){
                        System.err.println("olvasás: Nincs meg a fájl: " + ex.getMessage());
                        ex.printStackTrace();
                    }catch (IOException | ClassNotFoundException ex){
                        System.err.println("olvasás: I/O hiba: " + ex.getMessage());
                        ex.printStackTrace();
                    }
                }
            }
        });

    }


    private void init(){
        frame = new JFrame("Combo + List");
        frame.setContentPane(panelMain);
        frame.setSize(520, 240);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        beolvas = new JMenuItem("Beolvasás");
        kilepes = new JMenuItem("Kilépés");
        JMenu menuProgram = new JMenu("Program");
        menuProgram.add(beolvas);
        menuProgram.add(kilepes);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menuProgram);
        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
    }

    private void kilepes() {
        String msg = "Biztos kilépsz?";
        String cim = "KILÉPÉS!";
        int opt = JOptionPane.OK_CANCEL_OPTION;
        int gomb = JOptionPane.showConfirmDialog(null, msg, cim, opt);
        if(gomb == JOptionPane.OK_OPTION) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new GuiForm();
    }
}
