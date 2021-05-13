
package Telas;

import Estruturas.Registro;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;


public class BaixarRegistrosXML extends javax.swing.JFrame {
    
    private ArrayList<Registro> registros;

    public BaixarRegistrosXML(ArrayList<Registro> registros) {
        this.registros = registros;
        initComponents();
       
    }
    
    public void baixarRegistros(String diretorio) {
        String[] registrosSelecionados = registrosSelecionados(txtNumeroRegistros.getText());
        
        StringBuilder montadorString = new StringBuilder();
        
        try {
            PrintWriter pw = new PrintWriter(new File("C:\\Users\\Kleber\\Documents\\BuscaNota\\teste.xml"));
            pw.write(registros.get(0).getXml());
            pw.close();
            
//        for(int i = 0; i < registrosSelecionados.length;i++) {
//            montadorString.replace(0, montadorString.length(), "");
//            montadorString.append(registros.get((Integer.parseInt(registrosSelecionados[i]))-1).getXml());
//            try {
//                PrintWriter pw = new PrintWriter(new File(diretorio + "//" +
//                        registros.get(Integer.parseInt(registrosSelecionados[i])).getChaveNota() +  ".xml"));
//                pw.write(montadorString.toString(), 0, (montadorString.length()/2));
////                pw.write(registros.get((Integer.parseInt(registrosSelecionados[i]))-1).getXml());
//            } catch (FileNotFoundException ex) {
//                Logger.getLogger(BaixarRegistrosXML.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BaixarRegistrosXML.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumeroRegistros = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Baixar Notas Fiscais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Digite os números dos registros que deseja baixar:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setText("Exemplo: \"1,2,35,48\"");

        jButton1.setText("Baixar NFes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumeroRegistros)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumeroRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          
        JFileChooser seletorPasta = new JFileChooser();
        seletorPasta.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        seletorPasta.setVisible(true);
        int escolha = seletorPasta.showSaveDialog(null);
        if(escolha == JFileChooser.APPROVE_OPTION) {
            baixarRegistros(seletorPasta.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    public String[] registrosSelecionados(String txtNumeroRegistros){
        return txtNumeroRegistros.split(",");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNumeroRegistros;
    // End of variables declaration//GEN-END:variables
}
