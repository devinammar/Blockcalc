import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Volumebalok {
    private JPanel VolumePanel;
    private JTextField tfPanjang;
    private JTextField tfLebar;
    private JTextField tfTinggi;
    private JTextField tfVolume;
    private JButton jfHitung;
    private JButton resetButton;
    private JButton keluarButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Perhitungan Volume Balok");
        frame.setContentPane(new Volumebalok().VolumePanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Volumebalok() {
        jfHitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //deklarasi variabel
                double panjang, lebar, tinggi, volume;
//setting input
                panjang = Double.parseDouble(tfPanjang.getText());
                lebar = Double.parseDouble(tfLebar.getText());
                tinggi = Double.parseDouble(tfTinggi.getText());
//hitung volume
                volume = panjang*lebar*tinggi;
//setting output volume
                tfVolume.setText(String.valueOf(volume));
            }
        });
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfPanjang.setText("");
                tfLebar.setText("");
                tfTinggi.setText("");
                tfVolume.setText("");
                tfPanjang.requestFocus();
            }
        });
        keluarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
