
package Telas;

import Conexoes.Conexao;


public class Menu extends javax.swing.JFrame {
    private Conexao conexao;
    
    public Menu(Conexao conexao) {
        this.conexao = conexao;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnBuscaPorCNPJ = new javax.swing.JMenuItem();
        btnBuscaPorData = new javax.swing.JMenuItem();
        btnBuscaPorCNPJeData = new javax.swing.JMenuItem();
        btnBuscaPorChave = new javax.swing.JMenuItem();

        jLabel4.setText("/");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Selecione uma das opções no Menu acima.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Tipo de Busca");

        btnBuscaPorCNPJ.setText("Busca por CNPJ");
        btnBuscaPorCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaPorCNPJActionPerformed(evt);
            }
        });
        jMenu1.add(btnBuscaPorCNPJ);

        btnBuscaPorData.setText("Busca por Data");
        btnBuscaPorData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaPorDataActionPerformed(evt);
            }
        });
        jMenu1.add(btnBuscaPorData);

        btnBuscaPorCNPJeData.setText("Busca por CNPJ e Data");
        btnBuscaPorCNPJeData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaPorCNPJeDataActionPerformed(evt);
            }
        });
        jMenu1.add(btnBuscaPorCNPJeData);

        btnBuscaPorChave.setText("Busca por Chave da Nota");
        btnBuscaPorChave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaPorChaveActionPerformed(evt);
            }
        });
        jMenu1.add(btnBuscaPorChave);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscaPorCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaPorCNPJActionPerformed
        BuscaPorCNPJfrm buscaCNPJ = new BuscaPorCNPJfrm(this.conexao);
        buscaCNPJ.setVisible(true);
    }//GEN-LAST:event_btnBuscaPorCNPJActionPerformed

    private void btnBuscaPorDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaPorDataActionPerformed
        BuscaPorDatafrm buscaData = new BuscaPorDatafrm(this.conexao);
        buscaData.setVisible(true);
    }//GEN-LAST:event_btnBuscaPorDataActionPerformed

    private void btnBuscaPorCNPJeDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaPorCNPJeDataActionPerformed
        BuscaPorCNPJeDatafrm buscaCNPJeData = new BuscaPorCNPJeDatafrm(this.conexao);
        buscaCNPJeData.setVisible(true);
    }//GEN-LAST:event_btnBuscaPorCNPJeDataActionPerformed

    private void btnBuscaPorChaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaPorChaveActionPerformed
        BuscaPorChave buscaChave = new BuscaPorChave(this.conexao);
        buscaChave.setVisible(true);
    }//GEN-LAST:event_btnBuscaPorChaveActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnBuscaPorCNPJ;
    private javax.swing.JMenuItem btnBuscaPorCNPJeData;
    private javax.swing.JMenuItem btnBuscaPorChave;
    private javax.swing.JMenuItem btnBuscaPorData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
