package br.com.poli.memoria.TELAS;
import br.com.poli.memoria.DIFICULDADE.Dificuldade;
import br.com.poli.memoria.JOGADA.Main;
import br.com.poli.memoria.JOGADA.Partida;
import br.com.poli.memoria.JOGADOR.Jogador;

import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Tela1 extends JFrame {

    JLabel creditoTlInicial1, creditoTlInicial2, memoriaTl;
    JButton botaoIniciar;
    JMenuBar barra;
    JMenu opcoes;
    JMenuItem sair;

    public Tela1() {
        super("Memoria");

        //Icone, imagens-iniciais do jogo

        ImageIcon icone = new ImageIcon(getClass().getResource("iconp.png"));
        setIconImage(icone.getImage());

        ImageIcon telaInicial = new ImageIcon(getClass().getResource("telainicial.png"));

        ImageIcon botaoInicial = new ImageIcon(getClass().getResource("botaoIniciarImg.gif"));

        //background e tela

        Container tela = getContentPane();
        tela.setBackground(new Color(131, 111, 255));

        setSize(800, 600);
        setLocationRelativeTo(null);
        setLayout(null);

        //jlabel tl inicial creditos

        setLayout(null);
        creditoTlInicial1 = new JLabel("Escrito por Gustavo Guimarães Garcez");
        creditoTlInicial2 = new JLabel("Projeto final de Lpoo");
        creditoTlInicial1.setBounds(20, 460, 300, 100);
        creditoTlInicial2.setBounds(20, 440, 300, 100);
        creditoTlInicial1.setForeground(new Color(176, 196, 222));
        creditoTlInicial2.setForeground(new Color(176, 196, 222));
        creditoTlInicial1.setFont(new Font("Arial", Font.BOLD, 16));
        creditoTlInicial2.setFont(new Font("Arial", Font.BOLD, 16));

        tela.add(creditoTlInicial1);
        tela.add(creditoTlInicial2);

        //jLabel tl logo
        memoriaTl = new JLabel(telaInicial);
        memoriaTl.setBounds(150, 100, 500, 300);
        tela.add(memoriaTl);

        //Jbutton para iniciar partida

        botaoIniciar = new JButton("", botaoInicial);
        botaoIniciar.setBounds(485, 460, 200, 50);
        botaoIniciar.setMnemonic(KeyEvent.VK_I);
        botaoIniciar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Tela2().setVisible(true);
                setVisible(false);
            }
        });
        tela.add(botaoIniciar);

        //Menu

        barra = new JMenuBar();
        setJMenuBar(barra);

        opcoes = new JMenu("Opções");
        barra.add(opcoes);

        sair = new JMenuItem("Sair");

        opcoes.add(sair);

        sair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent sair) {
                System.exit(0);
            }
        });


        setVisible(true);
    }
}