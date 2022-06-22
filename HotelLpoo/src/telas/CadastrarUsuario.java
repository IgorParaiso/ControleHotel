package telas;

import usuario.Usuario;
import usuario.ListaUsuario;
import gravacao.GravarArquivo;
import java.io.IOException;

public class CadastrarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarUsuario
     * @param listaUsuario
     */
    public CadastrarUsuario(ListaUsuario listaUsuario) {
        initComponents();
        setLocationRelativeTo(null);
        this.listUser = listaUsuario;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        tituloNome = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        tituloCPF = new javax.swing.JLabel();
        campoCPF = new javax.swing.JTextField();
        tituloDatanasc = new javax.swing.JLabel();
        campoDataNasc = new javax.swing.JTextField();
        tituloTelefone = new javax.swing.JLabel();
        campoTelefone = new javax.swing.JTextField();
        tituloPais = new javax.swing.JLabel();
        campoPais = new javax.swing.JTextField();
        tituloIdioma = new javax.swing.JLabel();
        campoIdioma = new javax.swing.JTextField();
        botaoSalvar = new javax.swing.JButton();
        msgErro = new javax.swing.JLabel();
        botaoVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 415));

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Cadastrar Usuario");

        tituloNome.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        tituloNome.setText("Nome");

        tituloCPF.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        tituloCPF.setText("CPF");

        tituloDatanasc.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        tituloDatanasc.setText("Data de Nascimento");

        tituloTelefone.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        tituloTelefone.setText("Telefone");

        tituloPais.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        tituloPais.setText("País de Origem");

        tituloIdioma.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        tituloIdioma.setText("Idioma Preferêncial de Atendimento");

        botaoSalvar.setText("Salvar Usuario");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        msgErro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        msgErro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botaoVoltar)
                        .addGap(18, 18, 18)
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tituloNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tituloCPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tituloDatanasc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tituloTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tituloPais, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tituloIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoNome)
                                    .addComponent(campoCPF)
                                    .addComponent(campoTelefone)
                                    .addComponent(campoPais)
                                    .addComponent(campoIdioma)
                                    .addComponent(botaoSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(campoDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(msgErro, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoVoltar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msgErro, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloNome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloCPF))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloDatanasc)
                    .addComponent(campoDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloTelefone))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloPais))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloIdioma))
                .addGap(18, 18, 18)
                .addComponent(botaoSalvar)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        String nome = this.campoNome.getText();
        String cpf = this.campoCPF.getText();
        String dataNasc = this.campoDataNasc.getText();
        String pais = this.campoPais.getText();
        String idioma = this.campoIdioma.getText();
        try {
            int telefone = Integer.parseInt(this.campoTelefone.getText());
            this.listUser.cadastrar(new Usuario(nome, cpf, dataNasc, telefone, pais, idioma));
            
            
            GravarArquivo gravar;
            try {
                gravar = new GravarArquivo("usuario.txt");
                gravar.grava(listUser.toString());
                gravar.fecha();
                this.dispose();
            } catch (IOException e) {
                this.msgErro.setText("Não foi possível salvar");
                this.msgErro.setVisible(true);
            }
            
        } catch (NumberFormatException e){
            this.msgErro.setText("TELEFONE DEVE CONTER APENAS NUMEROS");
            this.msgErro.setVisible(true);
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
    
    private ListaUsuario listUser;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField campoCPF;
    private javax.swing.JTextField campoDataNasc;
    private javax.swing.JTextField campoIdioma;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoPais;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JLabel msgErro;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel tituloCPF;
    private javax.swing.JLabel tituloDatanasc;
    private javax.swing.JLabel tituloIdioma;
    private javax.swing.JLabel tituloNome;
    private javax.swing.JLabel tituloPais;
    private javax.swing.JLabel tituloTelefone;
    // End of variables declaration//GEN-END:variables
}
