import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private Map<String, CardapioDia> cardapioSemanal = new HashMap<>();
    private DefaultListModel<CardapioItem> cardapioListModel = new DefaultListModel<>();

    private JFrame frame;
    private JTextField nomeField;
    private JTextField bebidaField;
    private JList<CardapioItem> cardapioList;
    private JComboBox<String> diaComboBox;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Main app = new Main();
            app.createAndShowGUI();
        });
    }

    private void createAndShowGUI() {
        frame = new JFrame("Restaurante Universitário");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 10, 5, 10);
        constraints.fill = GridBagConstraints.HORIZONTAL;

        diaComboBox = new JComboBox<>(new String[]{"Segunda", "Terça", "Quarta", "Quinta", "Sexta"});
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        panel.add(diaComboBox, constraints);

        nomeField = new JTextField();
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        panel.add(new JLabel("Comida do dia:"), constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        panel.add(nomeField, constraints);

        bebidaField = new JTextField();
        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(new JLabel("Bebida:"), constraints);

        constraints.gridx = 1;
        constraints.gridy = 2;
        panel.add(bebidaField, constraints);

        JButton adicionarButton = new JButton("Adicionar");
        constraints.gridx = 0;
        constraints.gridy = 3;
        panel.add(adicionarButton, constraints);

        JButton removerButton = new JButton("Remover");
        constraints.gridx = 1;
        constraints.gridy = 3;
        panel.add(removerButton, constraints);

        cardapioList = new JList<>(cardapioListModel);
        JScrollPane scrollPane = new JScrollPane(cardapioList);
        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;
        panel.add(scrollPane, constraints);

        frame.getContentPane().add(panel);
        frame.setVisible(true);


        adicionarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeField.getText();
                String bebida = bebidaField.getText();
                String dia = (String) diaComboBox.getSelectedItem();

                if (!nome.isEmpty() && !bebida.isEmpty()) {
                    CardapioItem item = new CardapioItem(nome, bebida);
                    cardapioSemanal.get(dia).adicionarItem(item);
                    atualizarListaDoCardapio(dia);
                    nomeField.setText("");
                    bebidaField.setText("");
                }
            }
        });

        removerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = cardapioList.getSelectedIndex();
                if (selectedIndex != -1) {
                    CardapioItem selectedItem = cardapioListModel.get(selectedIndex);
                    String dia = (String) diaComboBox.getSelectedItem();
                    cardapioSemanal.get(dia).removerItem(selectedItem);
                    atualizarListaDoCardapio(dia);
                }
            }
        });

        diaComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String diaSelecionado = (String) diaComboBox.getSelectedItem();
                atualizarListaDoCardapio(diaSelecionado);
            }
        });

        // Inicializar o cardápio semanal para cada dia da semana
        for (int i = 0; i < diaComboBox.getItemCount(); i++) {
            cardapioSemanal.put((String) diaComboBox.getItemAt(i), new CardapioDia());
        }
    }

    private void atualizarListaDoCardapio(String dia) {
        cardapioListModel.clear();
        cardapioListModel.addAll(cardapioSemanal.get(dia).getItens());
    }
}
