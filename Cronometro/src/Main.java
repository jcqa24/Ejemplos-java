import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JLabel labelTiempo;
    private JButton botonIniciar, botonPausar, botonReiniciar;
    private Timer timer;
    private int segundos =0;
    private  boolean activo = false;

    public Main(){
        setTitle("Cronómetro");
        setSize(300,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        labelTiempo = new JLabel("Tiempo: 0 segundos");
        labelTiempo.setFont(new Font("Arial",Font.PLAIN,20));
        labelTiempo.setHorizontalAlignment(JLabel.CENTER);
        add(labelTiempo, BorderLayout.CENTER);

        botonIniciar = new JButton("Iniciar");
        botonPausar = new JButton("Pausar");
        botonReiniciar = new JButton("Reiniciar");

        botonReiniciar.setBackground(Color.white);
        botonPausar.setBackground(Color.white);
        botonIniciar.setBackground(Color.white);


        botonIniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!activo){
                    iniciarCronometro();
                }
            }
        });

        botonPausar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(activo){
                    pausarCronometro();
                }
            }
        });

        botonReiniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    ReiniciarCronometro();
            }
        });

        JPanel panelBotones = new JPanel();
        panelBotones.add(botonIniciar);
        panelBotones.add(botonPausar);
        panelBotones.add(botonReiniciar);

        add(panelBotones, BorderLayout.SOUTH);
    }


    private void iniciarCronometro(){
        activo = true;
        botonPausar.setBackground(Color.white);
        botonIniciar.setBackground(Color.green);
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                segundos++;
                labelTiempo.setText("Tiempo: "+segundos+" segundos");
            }
        });

        timer.start();
    }

    private void pausarCronometro(){
        activo = false;
        botonIniciar.setBackground(Color.white);
        botonPausar.setBackground(Color.red);
        if(timer != null){
            timer.stop();
        }

    }

    private void ReiniciarCronometro(){
        botonIniciar.setBackground(Color.white);
        botonPausar.setBackground(Color.white);
        activo = false;
        segundos = 0;
        labelTiempo.setText("Tiempo: 0 segundos");
        if(timer != null){
            timer.stop();
        }

    }

    public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    Main cronometro = new Main();
                    cronometro.setVisible(true);
                }
            });

    }
}