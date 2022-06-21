package telas;

import Quartos.*;
import gravacao.GravarArquivo;
import java.io.*;

public class CriarQuarto extends javax.swing.JFrame {

    /**
     * Creates new form CriarQuartoMaster
     */
    public CriarQuarto(ListaQuarto lista, int tipoQuarto) {
        initComponents();
        setLocationRelativeTo(null);
        this.list = lista;
        switch (tipoQuarto){
            case 1 -> {
                this.labelHidro.setVisible(false);
                this.escolheHidro.setVisible(false);
                this.labelMordomo.setVisible(false);
                this.escolheMordomo.setVisible(false);
            }
            case 2 -> {
                this.labelHidro.setVisible(true);
                this.escolheHidro.setVisible(true);
                this.labelMordomo.setVisible(false);
                this.escolheMordomo.setVisible(false);
            }
            case 3 -> {
                this.labelHidro.setVisible(true);
                this.escolheHidro.setVisible(true);
                this.labelMordomo.setVisible(true);
                this.escolheMordomo.setVisible(true);
            }
        }
        
        this.tipoQuarto = tipoQuarto;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotaoVoltar = new javax.swing.JButton();
        BotaoSalvar = new javax.swing.JButton();
        labelAndar = new javax.swing.JLabel();
        labelIdentificador = new javax.swing.JLabel();
        labelQntHosp = new javax.swing.JLabel();
        labelTipoCama = new javax.swing.JLabel();
        labelCafeManha = new javax.swing.JLabel();
        labelVista = new javax.swing.JLabel();
        labelHidro = new javax.swing.JLabel();
        labelMordomo = new javax.swing.JLabel();
        campoAndar = new javax.swing.JTextField();
        campoIdentificador = new javax.swing.JTextField();
        campoQntHosp = new javax.swing.JTextField();
        CampoTipoCama = new javax.swing.JTextField();
        campoVista = new javax.swing.JTextField();
        escolheCafe = new javax.swing.JComboBox<>();
        escolheHidro = new javax.swing.JComboBox<>();
        escolheMordomo = new javax.swing.JComboBox<>();
        msgErro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotaoVoltar.setText("Voltar");
        BotaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVoltarActionPerformed(evt);
            }
        });

        BotaoSalvar.setText("Salvar");
        BotaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarActionPerformed(evt);
            }
        });

        labelAndar.setText("Andar");

        labelIdentificador.setText("Letra do Quarto");

        labelQntHosp.setText("Quantidade de Hospedes");

        labelTipoCama.setText("Tipo de Cama");

        labelCafeManha.setText("Cafe da manha");

        labelVista.setText("Vista do Quarto");

        labelHidro.setText("Quarto tem Hidro");

        labelMordomo.setText("Mordomo disponivel");

        escolheCafe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não"}));

        escolheHidro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não"}));

        escolheMordomo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não"}));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotaoVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAndar)
                            .addComponent(labelIdentificador)
                            .addComponent(labelQntHosp)
                            .addComponent(labelTipoCama)
                            .addComponent(labelCafeManha)
                            .addComponent(labelVista)
                            .addComponent(labelHidro)
                            .addComponent(labelMordomo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoVista, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(CampoTipoCama)
                            .addComponent(campoQntHosp)
                            .addComponent(campoIdentificador)
                            .addComponent(campoAndar)
                            .addComponent(escolheCafe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(escolheHidro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(escolheMordomo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addComponent(msgErro, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotaoSalvar)
                .addGap(166, 166, 166))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotaoVoltar)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelAndar)
                            .addComponent(campoAndar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelIdentificador)
                            .addComponent(campoIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelQntHosp)
                            .addComponent(campoQntHosp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(msgErro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTipoCama)
                    .addComponent(CampoTipoCama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCafeManha)
                    .addComponent(escolheCafe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelVista)
                    .addComponent(campoVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHidro)
                    .addComponent(escolheHidro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMordomo)
                    .addComponent(escolheMordomo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotaoSalvar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotaoVoltarActionPerformed

    private void BotaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarActionPerformed
        char identificador = this.campoIdentificador.getText().charAt(0);
        String tipoCama = this.CampoTipoCama.getText();
        String vista = this.campoVista.getText();
        
        boolean cafeDaManha = this.escolheCafe.getSelectedIndex()==0;
        boolean hidro = false;
        boolean mordomo = false;
        
        if(tipoQuarto > 1 ){
            hidro = this.escolheHidro.getSelectedIndex()==0;
            if(tipoQuarto > 2){
                mordomo = this.escolheMordomo.getSelectedIndex()==0;
            }
        }
        
        try {
            int andar = Integer.parseInt(this.campoAndar.getText());
            int qntHosp = Integer.parseInt(this.campoQntHosp.getText());
            
            switch (tipoQuarto) {
                case 1:
                    this.list.CadastrarSimples(new QuartoSimples(andar, identificador, qntHosp, tipoCama, cafeDaManha, vista));
                    break;
                case 2:
                    this.list.CadastrarConfort(new QuartoConfort(andar,identificador, qntHosp, tipoCama, cafeDaManha, vista, hidro));
                    break;
                default:
                    this.list.CadastrarMaster(new QuartoMaster(andar, identificador, qntHosp, tipoCama, cafeDaManha, vista, hidro, mordomo));
                    break;
            }
            
            GravarArquivo gravar;
            try {
                gravar = new GravarArquivo("quartos.txt");
                gravar.grava(list.toString());
                gravar.fecha();
                this.dispose();
            } catch (IOException ex) {
                this.msgErro.setText("Nao foi possivel salvar");
                this.msgErro.setVisible(true);
            }
            
        } catch (NumberFormatException e) {
            this.msgErro.setText("TELEFONE E QUANTIDADE DE HOSPEDES DEVEM CONTER APENAS NUMEROS");
            this.msgErro.setVisible(true);
        }
        
    }//GEN-LAST:event_BotaoSalvarActionPerformed

    private ListaQuarto list;
    private int tipoQuarto;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoSalvar;
    private javax.swing.JButton BotaoVoltar;
    private javax.swing.JTextField CampoTipoCama;
    private javax.swing.JTextField campoAndar;
    private javax.swing.JTextField campoIdentificador;
    private javax.swing.JTextField campoQntHosp;
    private javax.swing.JTextField campoVista;
    private javax.swing.JComboBox<String> escolheCafe;
    private javax.swing.JComboBox<String> escolheHidro;
    private javax.swing.JComboBox<String> escolheMordomo;
    private javax.swing.JLabel labelAndar;
    private javax.swing.JLabel labelCafeManha;
    private javax.swing.JLabel labelHidro;
    private javax.swing.JLabel labelIdentificador;
    private javax.swing.JLabel labelMordomo;
    private javax.swing.JLabel labelQntHosp;
    private javax.swing.JLabel labelTipoCama;
    private javax.swing.JLabel labelVista;
    private javax.swing.JLabel msgErro;
    // End of variables declaration//GEN-END:variables
}
