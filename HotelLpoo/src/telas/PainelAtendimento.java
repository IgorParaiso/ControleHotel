/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import Quartos.*;
import gravacao.GravarArquivo;
import java.io.IOException;
import javax.swing.DefaultComboBoxModel;
import usuario.*;

/**
 *
 * @author Igor Paraiso
 */
public class PainelAtendimento extends javax.swing.JFrame {

    /**
     * Creates new form PainelAtendimento
     * @param user
     * @param room
     */
    public PainelAtendimento(ListaUsuario user, ListaQuarto room) {
        this.listaUsuario = user;
        this.listaQuarto = room;
        this.quartoDisponivel = this.listaQuarto.buscarDisponiveis();
        this.quartoOcupado = this.listaQuarto.buscarOcupados();
        this.quartoReservado = this.listaQuarto.buscarReservados();
        this.nomeUsuario = this.listaUsuario.nomeUser();
        initComponents();
        setLocationRelativeTo(null);
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
        botaoVoltar = new javax.swing.JButton();
        botaoCheckIn = new javax.swing.JButton();
        botaoCheckOut = new javax.swing.JButton();
        botaoReserva = new javax.swing.JButton();
        labelDisponiveis = new javax.swing.JLabel();
        selectDisponiveis = new javax.swing.JComboBox<>();
        labelOcupados = new javax.swing.JLabel();
        selectOcupado = new javax.swing.JComboBox<>();
        labelReservado = new javax.swing.JLabel();
        selectReservado = new javax.swing.JComboBox<>();
        labelUsuario = new javax.swing.JLabel();
        selectUsuario = new javax.swing.JComboBox<>();
        checkReserva = new javax.swing.JCheckBox();
        msgErro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Bem vindo ao painel de atendimento");

        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        botaoCheckIn.setText("Fazer Check-in");
        botaoCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCheckInActionPerformed(evt);
            }
        });

        botaoCheckOut.setText("Fazer Check-out");
        botaoCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCheckOutActionPerformed(evt);
            }
        });

        botaoReserva.setText("Reservar um quarto");
        botaoReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoReservaActionPerformed(evt);
            }
        });

        labelDisponiveis.setText("QuartosDisponiveis");

        selectDisponiveis.setModel(new DefaultComboBoxModel(this.quartoDisponivel));

        labelOcupados.setText("Quartos Ocupados");

        selectOcupado.setModel(new DefaultComboBoxModel(this.quartoOcupado));

        labelReservado.setText("Quartos Reservados");

        selectReservado.setModel(new DefaultComboBoxModel(this.quartoReservado));

        labelUsuario.setText("Usuarios Cadastrados");

        selectUsuario.setModel(new DefaultComboBoxModel(this.nomeUsuario));

        checkReserva.setText("Usuario reservou Quarto?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(msgErro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(labelReservado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelOcupados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelDisponiveis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(selectDisponiveis, 0, 92, Short.MAX_VALUE)
                            .addComponent(selectOcupado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectReservado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botaoCheckOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoCheckIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(checkReserva, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(botaoReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoVoltar)
                    .addComponent(titulo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDisponiveis)
                    .addComponent(selectDisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCheckIn)
                    .addComponent(msgErro, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelOcupados)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(selectOcupado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botaoCheckOut)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelReservado)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(selectReservado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botaoReserva)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelUsuario)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(selectUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(checkReserva)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCheckInActionPerformed
        if(this.checkReserva.isSelected()){
            String quartoSelecionado = this.selectReservado.getSelectedItem().toString();
            Quarto selecao = this.listaQuarto.getQuarto(this.listaQuarto.busca(quartoSelecionado));
            if (selecao.checkin()){
                GravarArquivo gravar;
                try {
                    gravar = new GravarArquivo("quartos.txt");
                    gravar.grava(this.listaQuarto.toString());
                    gravar.fecha();
                    this.dispose();
                    new RespostaAtendimento("CheckIn feito com sucesso", selecao).setVisible(true);
                } catch (IOException ex) {
                    this.msgErro.setText("Não foi possível salvar");
                    this.msgErro.setVisible(true);
                }
            } else {
                this.msgErro.setText("Quarto nao esta pronto para uso");
            }
        } else {
            Usuario user = this.listaUsuario.getUsuario(this.selectUsuario.getSelectedItem().toString());
            String quartoSelecionado = this.selectDisponiveis.getSelectedItem().toString();
            Quarto selecao = this.listaQuarto.getQuarto(this.listaQuarto.busca(quartoSelecionado));
            if (selecao.checkin()){
                selecao.fazerReserva(user);
                GravarArquivo gravar;
                try {
                    gravar = new GravarArquivo("quartos.txt");
                    gravar.grava(this.listaQuarto.toString());
                    gravar.fecha();
                    this.dispose();
                    new RespostaAtendimento("CheckIn feito com sucesso", selecao).setVisible(true);
                } catch (IOException ex) {
                    this.msgErro.setText("Não foi possível salvar");
                    this.msgErro.setVisible(true);
                }
            } else {
                this.msgErro.setText("Quarto nao esta pronto para uso");
            }
        }
    }//GEN-LAST:event_botaoCheckInActionPerformed

    private void botaoCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCheckOutActionPerformed
        String quartoSelecionado = this.selectOcupado.getSelectedItem().toString();
        Quarto selecao = this.listaQuarto.getQuarto(this.listaQuarto.busca(quartoSelecionado));
        
        selecao.checkout();
        
        GravarArquivo gravar;
                try {
                    gravar = new GravarArquivo("quartos.txt");
                    gravar.grava(this.listaQuarto.toString());
                    gravar.fecha();
                    this.dispose();
                    new RespostaAtendimento("CheckIn feito com sucesso", selecao).setVisible(true);
                } catch (IOException ex) {
                    this.msgErro.setText("Não foi possível salvar");
                    this.msgErro.setVisible(true);
                }
    }//GEN-LAST:event_botaoCheckOutActionPerformed

    private void botaoReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoReservaActionPerformed
        Usuario user = this.listaUsuario.getUsuario(this.selectUsuario.getSelectedItem().toString());
        String quartoSelecionado = this.selectDisponiveis.getSelectedItem().toString();
        Quarto selecao = this.listaQuarto.getQuarto(this.listaQuarto.busca(quartoSelecionado));
        selecao.fazerReserva(user);
        
        GravarArquivo gravar;
        try {
            gravar = new GravarArquivo("quartos.txt");
            gravar.grava(this.listaQuarto.toString());
            gravar.fecha();
            this.dispose();
            new RespostaAtendimento("Quarto reservado com sucesso", selecao).setVisible(true);
        } catch (IOException ex) {
            this.msgErro.setText("Não foi possível salvar");
            this.msgErro.setVisible(true);
        }
    }//GEN-LAST:event_botaoReservaActionPerformed

    /**
     * @param args the command line arguments
     */
    
    private ListaUsuario listaUsuario;
    private ListaQuarto listaQuarto;
    private String[] quartoDisponivel, quartoOcupado, quartoReservado, nomeUsuario;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCheckIn;
    private javax.swing.JButton botaoCheckOut;
    private javax.swing.JButton botaoReserva;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JCheckBox checkReserva;
    private javax.swing.JLabel labelDisponiveis;
    private javax.swing.JLabel labelOcupados;
    private javax.swing.JLabel labelReservado;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JLabel msgErro;
    private javax.swing.JComboBox<String> selectDisponiveis;
    private javax.swing.JComboBox<String> selectOcupado;
    private javax.swing.JComboBox<String> selectReservado;
    private javax.swing.JComboBox<String> selectUsuario;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
