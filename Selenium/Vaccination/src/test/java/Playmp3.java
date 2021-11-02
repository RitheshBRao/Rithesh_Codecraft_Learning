import javax.print.attribute.standard.Media;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Playmp3 {
    public static void main(String[] args) throws IOException, LineUnavailableException, UnsupportedAudioFileException {
//        File f = new File("D:\\Rithesh\\Selenium\\Vaccination\\123.wav");
//        AudioInputStream audioIn = AudioSystem.getAudioInputStream(f.toURI().toURL());
//        Clip clip = AudioSystem.getClip();
//        clip.open(audioIn);
//        clip.start();
        Playmp3 p = new Playmp3();
        p.makeSound();
    }

//    https://stackoverflow.com/questions/26305/how-can-i-play-sound-in-java
    void playSound(String soundFile) throws LineUnavailableException, IOException, UnsupportedAudioFileException {
        File f = new File("./" + soundFile);
        AudioInputStream audioIn = AudioSystem.getAudioInputStream(f.toURI().toURL());
        Clip clip = AudioSystem.getClip();
        clip.open(audioIn);
        clip.start();
    }

    public void makeSound(){
        File lol = new File("D:\\Rithesh\\Selenium\\Vaccination\\12345.mp3");


        try{
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(lol));
            clip.start();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
