package br.com.poli.memoria.TELAS;

import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Tela2 extends JFrame {
    JMenuBar barra2;
    JMenu opcoes2;
    JMenuItem sair2, voltar;
    JButton modo1, modo2;
    public int valor;


    public Tela2 () {
        super("Memoria");

        //Icone, imagem de modo de jogo.

        ImageIcon icone = new ImageIcon(getClass().getResource("iconp.png"));
        setIconImage(icone.getImage());

        ImageIcon imagemModo1 = new ImageIcon(getClass().getResource("player player.gif"));
        ImageIcon imagemModo2 = new ImageIcon(getClass().getResource("player cpu.gif"));

        //background e panel

        Container tela = getContentPane();
        tela.setBackground(new Color(131, 111, 255));

        setSize(800, 600);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Menu

        barra2 = new JMenuBar();
        setJMenuBar(barra2);

        opcoes2 = new JMenu("Opções");
        barra2.add(opcoes2);

        voltar = new JMenuItem("Voltar a tela inicial");
        sair2 = new JMenuItem("Sair");

        opcoes2.add(voltar);
        opcoes2.add(sair2);

        sair2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent sair) {
            System.exit(0);
        }
        });
        voltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent voltar) {
                new Tela1().setVisible(true);
                setVisible(false);
            }
        });

        //Jbutton escolha dos modos de jogo

        modo1 = new JButton("", imagemModo1);
        modo1.setBounds(30, 90, 350, 300);
        modo1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            setVisible(false);
            new Tela3(0).setVisible(true);
            }
        });

        tela.add(modo1);

        modo2 = new JButton("", imagemModo2);
        modo2.setBounds(400, 90, 350, 300);
        modo2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            setVisible(false);
            new Tela3(1).setVisible(true);
            }
        });

        tela.add(modo2);

    setVisible(false);
}
}
