import javax.swing.*;
import java.awt.*;

public class Janela extends JFrame {

    private JTextField campNome;
    private JTextField campEmail;
    private JTextField campTelefone;

    public Janela(){
        setTitle("Cadastro");
        setSize(380, 280);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        initComponents();
    }

    private void initComponents() {
        JPanel painel = new JPanel(new GridBagLayout());
        painel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(4, 0, 4, 0);

        // --- Label Nome ---
        JLabel lblNome = new JLabel("Nome:");
        gbc.gridx = 0; gbc.gridy = 0;
        painel.add(lblNome, gbc);

        // --- Campo Nome ---
        campNome = new JTextField();
        gbc.gridx = 0; gbc.gridy = 1;
        gbc.weightx = 1.0;
        painel.add(campNome, gbc);

        // --- Label Email ---
        JLabel lblEmail = new JLabel("E-mail:");
        gbc.gridx = 0; gbc.gridy = 2;
        gbc.insets = new Insets(12, 0, 4, 0);
        painel.add(lblEmail, gbc);

        // --- Campo Email ---
        campEmail = new JTextField();
        gbc.gridx = 0; gbc.gridy = 3;
        gbc.insets = new Insets(4, 0, 4, 0);
        painel.add(campEmail, gbc);

        // --- Label Telefone ---
        JLabel lblTelefone = new JLabel("Telefone:");
        gbc.gridx = 0; gbc.gridy = 4;
        gbc.insets = new Insets(12, 0, 4, 0);
        painel.add(lblTelefone, gbc);

        // --- Campo Telefone ---
        campTelefone = new JTextField();
        gbc.gridx = 0; gbc.gridy = 5;
        gbc.insets = new Insets(4, 0, 4, 0);
        painel.add(campTelefone, gbc);

        // --- Botão Salvar ---
        JButton btnSalvar = new JButton("SALVAR");
        gbc.gridx = 0; gbc.gridy = 6;
        gbc.insets = new Insets(20, 0, 0, 0);
        painel.add(btnSalvar, gbc);

        // --- Ação do botão ---
        btnSalvar.addActionListener(e -> {
            String nome     = campNome.getText().trim();
            String email    = campEmail.getText().trim();
            String telefone = campTelefone.getText().trim();

            if (nome.isEmpty() || email.isEmpty() || telefone.isEmpty()) {
                JOptionPane.showMessageDialog(
                        this,
                        "Preencha todos os campos.",
                        "Aviso",
                        JOptionPane.WARNING_MESSAGE
                );
                return;
            }

            JOptionPane.showMessageDialog(
                    this,
                    "Dados salvos:\n\nNome: "     + nome +
                            "\nE-mail: "   + email +
                            "\nTelefone: " + telefone,
                    "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE
            );
        });

        add(painel);
    }


}
