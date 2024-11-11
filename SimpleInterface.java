import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SimpleInterface {
    public static void main(String[] args) {
        // Criar o frame
        JFrame frame = new JFrame("DesafioDev");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640, 480);
        
        // Criar um painel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        
        // Adicionar texto
        JLabel textLabel = new JLabel("Bem-vindo à interface simples!", SwingConstants.CENTER);
        panel.add(textLabel, BorderLayout.SOUTH);
        
        // Adicionar imagem
        ImageIcon imageIcon = new ImageIcon("desafio.png"); // Substitua pelo caminho da sua imagem
        JLabel imageLabel = new JLabel(imageIcon);
        panel.add(imageLabel, BorderLayout.CENTER);
        
        // Adicionar botão
        JButton button = new JButton("Clique aqui");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Botão clicado!");
            }
        });
        panel.add(button, BorderLayout.NORTH);
        
        // Adicionar painel ao frame
        frame.add(panel);
        
        // Tornar o frame visível
        frame.setVisible(true);
    }
}
