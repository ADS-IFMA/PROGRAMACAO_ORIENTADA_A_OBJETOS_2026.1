package janelas;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Janela extends JFrame {

    private JLabel texto1;
    private JLabel texto2;
    private JLabel texto3;
    private JTextField campo1;
    private JTextField campo2;
    private JTextField campo3;
    private JPanel painel;
    private JButton butao;

    public Janela() {
        configurarJanela();
        criarComponentes();
        montarLayout();
    }

    private void configurarJanela() {
        this.setSize(480, 380);
        this.setTitle("Sistema de Cadastro");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    private void criarComponentes() {
        texto1 = criarLabel("Nome:");
        texto2 = criarLabel("Telefone:");
        texto3 = criarLabel("Email:");

        campo1 = criarCampo("Digite seu nome...");
        campo2 = criarCampo("(XX) XXXXX-XXXX");
        campo3 = criarCampo("exemplo@email.com");

        butao = new JButton("Cadastrar");
        butao.setFont(new Font("Segoe UI", Font.BOLD, 14));
        butao.setBackground(new Color(52, 152, 219));
        butao.setForeground(Color.WHITE);
        butao.setFocusPainted(false);
        butao.setBorder(new EmptyBorder(10, 20, 10, 20));
        butao.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        butao.addActionListener(e -> cadastrar());
    }

    private JLabel criarLabel(String texto) {
        JLabel label = new JLabel(texto);
        label.setFont(new Font("Segoe UI", Font.BOLD, 13));
        label.setForeground(new Color(52, 73, 94));
        return label;
    }

    private JTextField criarCampo(String placeholder) {
        JTextField campo = new JTextField();
        campo.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        campo.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(189, 195, 199), 1),
                new EmptyBorder(6, 10, 6, 10)
        ));
        campo.setToolTipText(placeholder);
        return campo;
    }

    private void montarLayout() {
        JPanel cabecalho = new JPanel();
        cabecalho.setBackground(new Color(52, 152, 219));
        cabecalho.setBorder(new EmptyBorder(15, 20, 15, 20));
        JLabel titulo = new JLabel("Sistema de Cadastro");
        titulo.setFont(new Font("Segoe UI", Font.BOLD, 18));
        titulo.setForeground(Color.WHITE);
        cabecalho.add(titulo);

        painel = new JPanel();
        painel.setLayout(new GridBagLayout());
        painel.setBackground(new Color(248, 249, 250));
        painel.setBorder(new EmptyBorder(25, 35, 25, 35));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(6, 5, 6, 5);

        adicionarLinha(painel, gbc, texto1, campo1, 0);
        adicionarLinha(painel, gbc, texto2, campo2, 1);
        adicionarLinha(painel, gbc, texto3, campo3, 2);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.NONE;
        gbc.insets = new Insets(20, 5, 5, 5);
        painel.add(butao, gbc);

        this.setLayout(new BorderLayout());
        this.add(cabecalho, BorderLayout.NORTH);
        this.add(painel, BorderLayout.CENTER);
    }

    private void adicionarLinha(JPanel painel, GridBagConstraints gbc, JLabel label, JTextField campo, int linha) {
        gbc.gridx = 0;
        gbc.gridy = linha;
        gbc.gridwidth = 1;
        gbc.weightx = 0.3;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(6, 5, 6, 10);
        painel.add(label, gbc);

        gbc.gridx = 1;
        gbc.weightx = 0.7;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(6, 0, 6, 5);
        painel.add(campo, gbc);
    }

    private void cadastrar() {
        String nome = campo1.getText().trim();
        String telefone = campo2.getText().trim();
        String email = campo3.getText().trim();

        if (nome.isEmpty() || telefone.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Por favor, preencha todos os campos.",
                    "Campos obrigatórios",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        String mensagem = String.format(
                "Cadastro realizado com sucesso!\n\nNome: %s\nTelefone: %s\nEmail: %s",
                nome, telefone, email
        );
        JOptionPane.showMessageDialog(this, mensagem, "Sucesso", JOptionPane.INFORMATION_MESSAGE);

        campo1.setText("");
        campo2.setText("");
        campo3.setText("");
    }

}
