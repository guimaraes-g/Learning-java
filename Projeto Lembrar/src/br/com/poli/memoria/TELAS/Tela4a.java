package br.com.poli.memoria.TELAS;

import br.com.poli.memoria.DIFICULDADE.Dificuldade;
import br.com.poli.memoria.JOGADA.Partida;
import br.com.poli.memoria.JOGADOR.Jogador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela4a extends JFrame {
    private Partida go;
    private int medidor = 2;

    private JLabel jogadorAtual, label1, label2, label3, label4, label5, label6, label7, label8, label9, label10,
    label11, label12, label13, label14, label15, label16;

    JMenuBar barra3;
    JMenu opcoes3;
    JMenuItem voltar, sair3, voltar2;

    private JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button10,
    button11, button12, button13, button14, button15, button16, button17;

    public Tela4a(Jogador j1, Jogador j2, Dificuldade dif, int modo) {
        super("MEMORIA");
        Partida jogo = new Partida(j1, j2, dif);
        this.go = jogo;
        iniciar();
    }

    public void iniciar() {
        // icone

        ImageIcon icone = new ImageIcon(getClass().getResource("iconp.png"));
        setIconImage(icone.getImage());

        //menu

        barra3 = new JMenuBar();
        setJMenuBar(barra3);

        opcoes3 = new JMenu("Opções");
        barra3.add(opcoes3);

        voltar = new JMenuItem("Voltar a tela inicial");
        voltar2 = new JMenuItem("Escolher modo de jogo");
        sair3 = new JMenuItem("Sair");

        opcoes3.add(voltar);
        opcoes3.add(voltar2);
        opcoes3.add(sair3);

        sair3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent sair) {
                System.exit(0);
            }
        });
        voltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent voltarTl1) {
                new Tela1().setVisible(true);
                setVisible(false);

            }
        });
        voltar2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent voltarTl2) {
                new Tela2().setVisible(true);
                setVisible(false);

            }
        });

        // tela

        Container tela = getContentPane();
        tela.setBackground(new Color(131, 111, 255));

        setSize(800, 600);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //gameplay

        button1 = new JButton();
        label1 = new JLabel(go.getTabuleiro().getTabuleiro().get(0));
        button2 = new JButton();
        label2 = new JLabel(go.getTabuleiro().getTabuleiro().get(1));
        button3 = new JButton();
        label3 = new JLabel(go.getTabuleiro().getTabuleiro().get(2));
        button4 = new JButton();
        label4 = new JLabel(go.getTabuleiro().getTabuleiro().get(3));
        button5 = new JButton();
        label5 = new JLabel(go.getTabuleiro().getTabuleiro().get(4));
        button6 = new JButton();
        label6 = new JLabel(go.getTabuleiro().getTabuleiro().get(5));
        button7 = new JButton();
        label7 = new JLabel(go.getTabuleiro().getTabuleiro().get(6));
        button8 = new JButton();
        label8 = new JLabel(go.getTabuleiro().getTabuleiro().get(7));
        button9 = new JButton();
        label9 = new JLabel(go.getTabuleiro().getTabuleiro().get(8));
        button10 = new JButton();
        label10 = new JLabel(go.getTabuleiro().getTabuleiro().get(9));
        button11 = new JButton();
        label11 = new JLabel(go.getTabuleiro().getTabuleiro().get(10));
        button12 = new JButton();
        label12 = new JLabel(go.getTabuleiro().getTabuleiro().get(11));
        button13 = new JButton();
        label13 = new JLabel(go.getTabuleiro().getTabuleiro().get(12));
        button14 = new JButton();
        label14 = new JLabel(go.getTabuleiro().getTabuleiro().get(13));
        button15 = new JButton();
        label15 = new JLabel(go.getTabuleiro().getTabuleiro().get(14));
        button16 = new JButton();
        label16 = new JLabel(go.getTabuleiro().getTabuleiro().get(15));

        button17 = new JButton();


        tela.add(button1);
        button1.setBounds(150, 180, 78, 30);
        label1.setBounds(150, 180, 178, 30);
        tela.add(label1);
        label1.setVisible(false);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (medidor == 2 || medidor == 1){
                button1.setVisible(false);
                label1.setVisible(true);
                } else {
                    StringBuilder mensagem = new StringBuilder();
                    mensagem.append("Clique em Continuar!").append("!");
                }


            }
        });

        tela.add(button2);
        button2.setBounds(65, 180, 78, 30);
        label2.setBounds(65, 180, 78, 30);
        tela.add(label2);
        label2.setVisible(false);

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button2.setVisible(false);
                label2.setVisible(true);

            }
        });

        tela.add(button3);
        button3.setBounds(65, 215, 78, 30);
        label3.setBounds(65, 215, 78, 30);
        tela.add(label3);
        label3.setVisible(false);

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button3.setVisible(false);
                label3.setVisible(true);

            }
        });

        tela.add(button4);
        button4.setBounds(65, 250, 78, 30);
        label4.setBounds(65, 250, 78, 30);
        tela.add(label4);
        label4.setVisible(false);

        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button4.setVisible(false);
                label4.setVisible(true);

            }
        });

        tela.add(button5);
        button5.setBounds(65, 285, 78, 30);
        label5.setBounds(65, 285, 78, 30);
        tela.add(label5);
        label5.setVisible(false);

        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button5.setVisible(false);
                label5.setVisible(true);

            }
        });

        tela.add(button6);
        button6.setBounds(150, 215, 78, 30);
        label6.setBounds(150, 215, 78, 30);
        tela.add(label6);
        label6.setVisible(false);

        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button6.setVisible(false);
                label6.setVisible(true);

            }
        });

        tela.add(button7);
        button7.setBounds(325, 180, 78, 30);
        label7.setBounds(325, 180, 78, 30);
        tela.add(label7);
        label7.setVisible(false);

        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button7.setVisible(false);
                label7.setVisible(true);

            }
        });

        tela.add(button8);
        button8.setBounds(240, 180, 78, 30);
        label8.setBounds(240, 180, 78, 30);
        tela.add(label8);
        label8.setVisible(false);

        button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button8.setVisible(false);
                label8.setVisible(true);

            }
        });

        tela.add(button9);
        button9.setBounds(240, 215, 78, 30);
        label9.setBounds(240, 215, 78, 30);
        tela.add(label9);
        label9.setVisible(false);

        button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button9.setVisible(false);
                label9.setVisible(true);

            }
        });

        tela.add(button10);
        button10.setBounds(240, 250, 78, 30);
        label10.setBounds(240, 250, 78, 30);
        tela.add(label10);
        label10.setVisible(false);

        button10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button10.setVisible(false);
                label10.setVisible(true);

            }
        });

        tela.add(button11);
        button11.setBounds(240, 285, 78, 30);
        label11.setBounds(240, 285, 78, 30);
        tela.add(label11);
        label11.setVisible(false);

        button11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button11.setVisible(false);
                label11.setVisible(true);

            }
        });

        tela.add(button12);
        button12.setBounds(325, 215, 78, 30);
        label12.setBounds(325, 215, 78, 30);
        tela.add(label12);
        label12.setVisible(false);

        button12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button12.setVisible(false);
                label12.setVisible(true);

            }
        });

        tela.add(button13);
        button13.setBounds(150, 250, 78, 30);
        label13.setBounds(150, 250, 78, 30);
        tela.add(label13);
        label13.setVisible(false);

        button13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button13.setVisible(false);
                label13.setVisible(true);

            }
        });

        tela.add(button14);
        button14.setBounds(150, 285, 78, 30);
        label14.setBounds(150, 285, 78, 30);
        tela.add(label14);
        label14.setVisible(false);

        button14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button14.setVisible(false);
                label14.setVisible(true);

            }
        });

        tela.add(button15);
        button15.setBounds(325, 250, 78, 30);
        label15.setBounds(325, 250, 78, 30);
        tela.add(label15);
        label15.setVisible(false);

        button15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button15.setVisible(false);
                label15.setVisible(true);

            }
        });

        tela.add(button16);
        button16.setBounds(325, 285, 78, 30);
        label16.setBounds(325, 285, 78, 30);
        tela.add(label16);
        label16.setVisible(false);

        button16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button16.setVisible(false);
                label16.setVisible(true);

            }
        });

        button17.setText("Continuar");
        tela.add(button17);
        button17.setBounds(310, 385, 92, 55);

        //jlabel indicar jogador atual

        jogadorAtual = new JLabel(go.jogadorAtual().toString() + " realize sua jogada!");
        jogadorAtual.setBounds(60, 40, 500, 50);
        tela.add(jogadorAtual);
    }
}
