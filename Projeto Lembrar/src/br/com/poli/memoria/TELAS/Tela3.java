package br.com.poli.memoria.TELAS;
import br.com.poli.memoria.DIFICULDADE.Dificuldade;
import br.com.poli.memoria.JOGADA.Partida;
import br.com.poli.memoria.JOGADOR.Jogador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Tela3 extends JFrame {

    JMenuBar barra3;
    JMenu opcoes3;
    JMenuItem voltar, sair3, voltar2;
    JButton fac, med, dif;
    String nome1, nome2;

    public Tela3(int modo) {
        super("Memoria");

        //Icone, imagem de modo de jogo.

        ImageIcon icone = new ImageIcon(getClass().getResource("iconp.png"));
        setIconImage(icone.getImage());

        ImageIcon easy = new ImageIcon(getClass().getResource("fac.jpg"));
        ImageIcon mid = new ImageIcon(getClass().getResource("med.jpg"));
        ImageIcon hard = new ImageIcon(getClass().getResource("dif.jpg"));


        //background e panel

        Container tela = getContentPane();
        tela.setBackground(new Color(131, 111, 255));

        setSize(800, 600);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Menu

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
        // Dificuldade

        fac = new JButton("", easy);
        fac.setBounds(40, 210, 210, 220);
        fac.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (modo == 0) {
                    nome1 = digitarNome1();
                    Jogador p1 = new Jogador(nome1, 1);
                    nome2 = digitarNome2();
                    Jogador p2 = new Jogador(nome2, 2);
                    new Tela4a(p1, p2, Dificuldade.FACIL, modo).setVisible(true);
                    setVisible(false);
                } else {
                    nome1 = digitarNome1();
                    Jogador p1 = new Jogador(nome1, 1);
                    caixaCPU();
                    Jogador p2 = new Jogador("CPU",2);
                    new Tela4a(p1, p2, Dificuldade.FACIL, modo).setVisible(true);
                    setVisible(false);
                }
            }

        });

        tela.add(fac);

        med = new JButton("", mid);
        med.setBounds(280, 210, 210, 220);
        med.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (modo == 0) {
                    nome1 = digitarNome1();
                    Jogador p1 = new Jogador(nome1, 1);
                    nome2 = digitarNome2();
                    Jogador p2 = new Jogador(nome2, 2);
                    new Tela4a(p1, p2, Dificuldade.MEDIO, modo).setVisible(true);
                    setVisible(false);

                } else {
                    nome1 = digitarNome1();
                    Jogador p1 = new Jogador(nome1, 1);
                    caixaCPU();
                    Jogador p2 = new Jogador("CPU",2);
                    new Tela4a(p1, p2, Dificuldade.MEDIO, modo).setVisible(true);
                    setVisible(false);
                }

            }
        });

        tela.add(med);

        dif = new JButton("", hard);
        dif.setBounds(520, 210, 220, 227);
        dif.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (modo == 0) {
                    nome1 = digitarNome1();
                    Jogador p1 = new Jogador(nome1, 1);
                    nome2 = digitarNome2();
                    Jogador p2 = new Jogador(nome2, 2);
                    new Tela4a(p1, p2, Dificuldade.DIFICIL, modo).setVisible(true);
                    setVisible(false);

                } else {
                    nome1 = digitarNome1();
                    Jogador p1 = new Jogador(nome1, 1);
                    caixaCPU();
                    Jogador p2 = new Jogador("CPU",2);
                    new Tela4a(p1, p2, Dificuldade.DIFICIL, modo).setVisible(true);
                    setVisible(false);
                }

            }
        });

        tela.add(dif);


    }

    // receber nomes

    public String digitarNome1 (){
        StringBuilder mensagem = new StringBuilder();

        nome1 = JOptionPane.showInputDialog("Digite o nome do JOGADOR 01:");
        mensagem.append("Bem-vindo ").append(nome1).append("!");
        JOptionPane.showMessageDialog(null, mensagem);

        return nome1;
    }

    public String digitarNome2(){
        StringBuilder mensagem = new StringBuilder();

        nome2 = JOptionPane.showInputDialog("Digite o nome do JOGADOR 02:");
        mensagem.append("Bem-vindo ").append(nome2).append("!");
        JOptionPane.showMessageDialog(null, mensagem);

        return nome2;
    }

    public void caixaCPU(){
        StringBuilder mensagem = new StringBuilder();

        mensagem.append("Você escolheu a opção de joga contra o CPU!");
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
