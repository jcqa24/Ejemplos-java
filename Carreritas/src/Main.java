import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Hilo implements Runnable{

    Thread t;
    String nombre;
    JLabel personaje;
    JLabel labelFinal;
    public static int lugar;


    public Hilo(String nombre, JLabel personaje, JLabel labelFinal){
        this.nombre = nombre;
        this.personaje = personaje;
        this.labelFinal = labelFinal;
        t = new Thread(this,nombre);
        t.start();
    }

    @Override
    public void run() {
        int retardo;
        try{
            lugar = 1;
            retardo = (int) (Math.random() * 15) +1;
            labelFinal.setVisible(false);
            personaje.setVisible(true);

            for (int i=0;i<500;i++){
                personaje.setLocation(i,personaje.getY());
                Thread.sleep(retardo);
            }
            personaje.setVisible(false);
            labelFinal.setVisible(true);
            labelFinal.setText(nombre + " Ha llegado en la pos "+lugar);
            lugar++;


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
class VentanaCarrera extends JFrame{

    public VentanaCarrera(){
        super("Carrera de Leyendas");
        JLabel mario,megaman,crash, mario_pos, megaman_pos, crash_pos;
        JButton botonIniciarCarrera;

        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        Image imagen_mario = new ImageIcon("src/img/mario.gif").getImage();
        ImageIcon mario_Icon = new ImageIcon(imagen_mario.getScaledInstance(50,50,Image.SCALE_DEFAULT));
        mario = new JLabel();
        mario.setIcon(mario_Icon);
        mario.setBounds(50,50,50,50);

        Image imagen_maegaman = new ImageIcon("src/img/megaman.gif").getImage();
        ImageIcon megaman_Icon = new ImageIcon(imagen_maegaman.getScaledInstance(50,50,Image.SCALE_DEFAULT));
        megaman = new JLabel();
        megaman.setIcon(megaman_Icon);
        megaman.setBounds(50,100,50,50);

        Image imagen_crash = new ImageIcon("src/img/crahs.gif").getImage();
        ImageIcon crash_Icon = new ImageIcon(imagen_crash.getScaledInstance(50,50,Image.SCALE_DEFAULT));
        crash = new JLabel();
        crash.setIcon(crash_Icon);
        crash.setBounds(50,150,50,50);

        mario_pos = new JLabel();
        mario_pos.setBounds(50,50,350,50);

        megaman_pos = new JLabel();
        megaman_pos.setBounds(50,100,350,50);

        crash_pos = new JLabel();
        crash_pos.setBounds(50,150,350,50);

        botonIniciarCarrera = new JButton("Iniciar Carrera");
        botonIniciarCarrera.setBounds(150,200,150,50);

        botonIniciarCarrera.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Hilo tmario = new Hilo("Mario",mario,mario_pos);
                Hilo tmegaman = new Hilo("Megaman",megaman,megaman_pos);
                Hilo tcrash = new Hilo("Crash",crash,crash_pos);
            }
        });

        panel.add(mario);
        panel.add(mario_pos);
        panel.add(megaman);
        panel.add(megaman_pos);
        panel.add(crash);
        panel.add(crash_pos);
        panel.add(botonIniciarCarrera);

        add(panel);

        setVisible(true);
    }

}


public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaCarrera();
            }
        });
    }
}
