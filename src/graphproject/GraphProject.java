package graphproject;

import javax.swing.JFrame;

public class GraphProject {
    public static void main(String[] args){
        //Window window = new Window();
        
        JFrame frame = new JFrame("Function Grapher");
        //frame.add(window);
        frame.setResizable(false);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        //new Thread(window).start();
    }
}