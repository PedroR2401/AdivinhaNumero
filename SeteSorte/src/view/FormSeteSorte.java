package view;

import model.SeteSorte;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class FormSeteSorte {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton jogarButton;
    private JPanel panelSeteSorte;
    private JTextField num2;
    private JTextField num1;
    private JTextField num3;
    private JButton checar;
    private JLabel numero1;
    private JLabel numero2;
    private JLabel numero3;




String n1, n2, n3;

    public JPanel getPanelSeteSorte() {
        return panelSeteSorte;
    }

    public FormSeteSorte() {
        jogarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                    SeteSorte jogo = new SeteSorte();



                button1.setText(String.valueOf(jogo.getValor1()));
                button2.setText(String.valueOf(jogo.getValor2()));
                button3.setText(String.valueOf(jogo.getValor3()));

                n1 = String.valueOf(button1.getText());
                n2 = String.valueOf(button2.getText());
                n3 = String.valueOf(button3.getText());

                button1.setText(String.valueOf(" "));
                button2.setText(String.valueOf(" "));
                button3.setText(String.valueOf(" "));


                    num1.setText(String.valueOf(jogo.getNumero1()));
                    num2.setText(String.valueOf(jogo.getNumero2()));
                    num3.setText(String.valueOf(jogo.getNumero3()));

                int n1 = Integer.parseInt(num1.getText());




            }
    }
    );
        checar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {


//                 n1 = String.valueOf(button1.getText());
//                 n2 = String.valueOf(button2.getText());
//                 n3 = String.valueOf(button3.getText());

                int acertos = 0;
                if (num1.getText().equals(n1)) acertos = acertos + 1;
                if (num2.getText().equals(n2)) acertos = acertos + 1;
                if (num3.getText().equals(n3)) acertos = acertos + 1;
                if (acertos == 3) {
                    JOptionPane.showMessageDialog(null,
                            "Parabéns!! Venceu",
                            "Resultado",
                            JOptionPane.INFORMATION_MESSAGE);}
                else{
                    JOptionPane.showMessageDialog(null,
                            "Que pena!! Deu Banca",
                            "Resultado",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    }

