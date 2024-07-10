import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interface extends JFrame {
    private Cruzamento cruzamento;

    public Interface() {
        cruzamento = new Cruzamento();
        setupUI();
    }

    private void setupUI() {
        setTitle("Semáforo-Claiton");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        setResizable(false);
        setLocationRelativeTo(null);


        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 10, 10, 20);


        Font buttonFont = new Font("Arial", Font.BOLD, 14);
        Dimension buttonSize = new Dimension(120, 30);

        JButton iniciarButton = new JButton("Iniciar");
        iniciarButton.setBackground(Color.BLACK);
        iniciarButton.setForeground(Color.WHITE);
        iniciarButton.setFocusable(false);
        iniciarButton.setFont(buttonFont);
        iniciarButton.setPreferredSize(buttonSize);
        iniciarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cruzamento.iniciarSemaforo();
            }
        });

        JButton pararButton = new JButton("Parar");
        pararButton.setBackground(Color.BLACK);
        pararButton.setForeground(Color.WHITE);
        pararButton.setFocusable(false);
        pararButton.setFont(buttonFont);
        pararButton.setPreferredSize(buttonSize);
        pararButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cruzamento.paraSemaforo();
            }
        });

        JButton trocarButton = new JButton("Trocar");
        trocarButton.setBackground(Color.BLACK);
        trocarButton.setForeground(Color.WHITE);
        trocarButton.setFocusable(false);
        trocarButton.setFont(buttonFont);
        trocarButton.setPreferredSize(buttonSize);
        trocarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cruzamento.TrocarSemaforo();
            }
        });

        JButton sairButton = new JButton("Sair");
        sairButton.setBackground(Color.BLACK);
        sairButton.setForeground(Color.WHITE);
        sairButton.setFocusable(false);
        sairButton.setFont(buttonFont);
        sairButton.setPreferredSize(buttonSize);
        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        panel.add(iniciarButton, gbc);
        panel.add(pararButton, gbc);
        panel.add(trocarButton, gbc);
        panel.add(sairButton, gbc);

        JLabel developedC = new JLabel();
        developedC.setText("Desenvolvido por Claiton Caio");
        developedC.setFont(new Font("Serif", Font.BOLD, 14));
        developedC.setBounds(275, 10, 250, 40);
        panel.add(developedC);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(panel, BorderLayout.SOUTH);
        mainPanel.add(cruzamento, BorderLayout.CENTER);

        add(mainPanel, BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }
}
