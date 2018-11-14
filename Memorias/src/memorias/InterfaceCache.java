package memorias;

public class InterfaceCache extends javax.swing.JFrame {
    
    private int quant_conjuntos,tam_bloco,tip_map,tip_subs;

    public InterfaceCache() {
        initComponents();
    }

    //=========================== Não Aterar ======================================================================================
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        label_qtd_conjuntos = new javax.swing.JLabel();
        qtd_conjuntos = new javax.swing.JTextField();
        label_tamanho_bloco = new javax.swing.JLabel();
        tamanho_bloco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        label_mapeamento = new javax.swing.JLabel();
        mapeamento_direto = new javax.swing.JCheckBox();
        mapeamentoTot_assoc = new javax.swing.JCheckBox();
        mapeamento2_assoc = new javax.swing.JCheckBox();
        mapeamento4_assoc = new javax.swing.JCheckBox();
        label_subs = new javax.swing.JLabel();
        subs_random = new javax.swing.JCheckBox();
        subs_fifo = new javax.swing.JCheckBox();
        btn_enviar = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label_qtd_conjuntos.setText("Quantidade de Conjuntos:");

        label_tamanho_bloco.setText("Tamanho do Bloco:");

        label_mapeamento.setText("Tipo de Mapeamento:");

        mapeamento_direto.setText("Mapeamento Direto");
        mapeamento_direto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mapeamento_diretoActionPerformed(evt);
            }
        });

        mapeamentoTot_assoc.setText("Mapeamento Totalmente Associativo");

        mapeamento2_assoc.setText("Mapeamento 2 Associativo");

        mapeamento4_assoc.setText("Mapeamento 4 Associativo");

        label_subs.setText("Politica de Substituição:");

        subs_random.setText("Random");
        subs_random.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subs_randomActionPerformed(evt);
            }
        });

        subs_fifo.setText("FIFO");

        btn_enviar.setText("Enviar");
        btn_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_qtd_conjuntos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(qtd_conjuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_tamanho_bloco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tamanho_bloco, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_mapeamento)
                                    .addComponent(mapeamento_direto)
                                    .addComponent(mapeamento4_assoc)
                                    .addComponent(mapeamento2_assoc)
                                    .addComponent(mapeamentoTot_assoc)))
                            .addComponent(label_subs)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(subs_fifo)
                                .addGap(8, 8, 8)
                                .addComponent(subs_random))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(btn_enviar)))
                .addContainerGap(201, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_qtd_conjuntos)
                    .addComponent(qtd_conjuntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_tamanho_bloco)
                    .addComponent(tamanho_bloco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(label_mapeamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(mapeamento_direto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mapeamento2_assoc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mapeamento4_assoc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mapeamentoTot_assoc)
                .addGap(18, 18, 18)
                .addComponent(label_subs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subs_fifo)
                    .addComponent(subs_random))
                .addGap(18, 18, 18)
                .addComponent(btn_enviar)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //=========================== Não Aterar ======================================================================================
    
    
    
    
    
  
    
    
    private void mapeamento_diretoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mapeamento_diretoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mapeamento_diretoActionPerformed

    private void subs_randomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subs_randomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subs_randomActionPerformed

    
    
    
    
    // ============================= Metodo que irá definir o que será feito quando os dados forem enviados ======================
    private void btn_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviarActionPerformed
      
        System.out.println(qtd_conjuntos.getText());
        quant_conjuntos = Integer.parseInt(qtd_conjuntos.getText());
        
        System.out.println(tamanho_bloco.getText());
        tam_bloco = Integer.parseInt(tamanho_bloco.getText());
        
        if(mapeamento_direto.isSelected() == true){
            tip_map = 1;
        }
        
        else if(mapeamento2_assoc.isSelected() == true){
            tip_map = 2;
        }
        
        else if(mapeamento4_assoc.isSelected() == true){
            tip_map = 3;
        }
        
        else if(mapeamentoTot_assoc.isSelected() == true){
            tip_map = 4;
        }
        
        if(subs_fifo.isSelected() == true){
            tip_subs = 1;
        }
        
        else if(subs_random.isSelected() == true){
            tip_subs = 2;
        }
        
        System.out.println(quant_conjuntos + 1);
        System.out.println(tam_bloco + 1);
        System.out.println(tip_map);
        System.out.println(tip_subs);
        
        
    }//GEN-LAST:event_btn_enviarActionPerformed
    //=============================================================================================================================
    
    
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceCache.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceCache.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceCache.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceCache.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceCache().setVisible(true);
            }
        });
    }

    
    
    
 
 //=================================================== Não Alterar =================================================================
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_enviar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel label_mapeamento;
    private javax.swing.JLabel label_qtd_conjuntos;
    private javax.swing.JLabel label_subs;
    private javax.swing.JLabel label_tamanho_bloco;
    private javax.swing.JCheckBox mapeamento2_assoc;
    private javax.swing.JCheckBox mapeamento4_assoc;
    private javax.swing.JCheckBox mapeamentoTot_assoc;
    private javax.swing.JCheckBox mapeamento_direto;
    private javax.swing.JTextField qtd_conjuntos;
    private javax.swing.JCheckBox subs_fifo;
    private javax.swing.JCheckBox subs_random;
    private javax.swing.JTextField tamanho_bloco;
    // End of variables declaration//GEN-END:variables
}

