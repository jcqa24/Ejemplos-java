import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

class ReproductorDeSonido{
    private Clip clip;

    public void cargarSonido(String ruta){
        try{
            File archivoSonido = new File(ruta);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(archivoSonido);
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void reproducir(){
        if(clip != null){
            clip.setFramePosition(0);
            clip.start();
        }
    }

    public void detener(){
        if(clip != null && clip.isRunning()){
            clip.stop();
        }
    }


}

class Ventana extends JFrame{
    private ReproductorDeSonido reproductor;

    public Ventana() {
        setTitle("Sonidos de animales");
        setSize(300,300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        reproductor = new ReproductorDeSonido();

        ImageIcon iconoPerro = new ImageIcon("src/img/dog.jpg");
        Image imagenOriginalPerro = iconoPerro.getImage();
        Image nuevaImagenPerro = imagenOriginalPerro.getScaledInstance(50,50,Image.SCALE_SMOOTH);
        iconoPerro = new ImageIcon(nuevaImagenPerro);

        JButton botonPerro = new JButton("Perro",iconoPerro);

        botonPerro.setBounds(60,20,150,50);

        botonPerro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reproductor.cargarSonido("src/sounds/dog.wav");
                reproductor.reproducir();
            }
        });


        ImageIcon iconoGato = new ImageIcon("src/img/cat.png");
        Image imagenOriginalGato = iconoGato.getImage();
        Image nuevaImagenGato = imagenOriginalGato.getScaledInstance(50,50,Image.SCALE_SMOOTH);
        iconoGato = new ImageIcon(nuevaImagenGato);

        JButton botonGato = new JButton("Gato",iconoGato);

        botonGato.setBounds(60,100,150,50);

        botonGato.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reproductor.cargarSonido("src/sounds/cat.wav");
                reproductor.reproducir();
            }
        });



        ImageIcon iconoPajaro = new ImageIcon("src/img/bird.jpg");
        Image imagenOriginalPajaro = iconoPajaro.getImage();
        Image nuevaImagenPajaro = imagenOriginalPajaro.getScaledInstance(50,50,Image.SCALE_SMOOTH);
        iconoPajaro = new ImageIcon(nuevaImagenPajaro);

        JButton botonPajaro = new JButton("Pajaro",iconoPajaro);

        botonPajaro.setBounds(60,180,150,50);

        botonPajaro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reproductor.cargarSonido("src/sounds/bird.wav");
                reproductor.reproducir();
            }
        });

        add(botonPerro);
        add(botonGato);
        add(botonPajaro);


        setVisible(true);

    }

}

public class Main {
    public static void main(String[] args) {
        new Ventana();
    }
}