package memorias;

public class InterfaceCache extends javax.swing.JFrame {
    
    private int quant_conjuntos,tam_bloco,tip_map,tip_subs;

    public InterfaceCache() {
        initComponents();   // irá iniciar a interface
        setLocationRelativeTo(null);    // irá centralizar a interface quando ela for executada
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
        setTitle("Cache Simulator");

        label_qtd_conjuntos.setText("Quantidade de Conjuntos:");

        label_tamanho_bloco.setText("Tamanho do Bloco:");

        label_mapeamento.setText("Tipo de Mapeamento:");

        mapeamento_direto.setText("Mapeamento Direto");

        mapeamentoTot_assoc.setText("Mapeamento Totalmente Associativo");

        mapeamento2_assoc.setText("Mapeamento 2 Associativo");

        mapeamento4_assoc.setText("Mapeamento 4 Associativo");

        label_subs.setText("Politica de Substituição:");

        subs_random.setText("Random");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_qtd_conjuntos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(qtd_conjuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label_tamanho_bloco)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tamanho_bloco, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(mapeamento_direto)
                                            .addComponent(mapeamento4_assoc)
                                            .addComponent(mapeamento2_assoc)
                                            .addComponent(mapeamentoTot_assoc)
                                            .addComponent(label_mapeamento)))
                                    .addComponent(label_subs)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(subs_fifo)
                                        .addGap(8, 8, 8)
                                        .addComponent(subs_random)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(btn_enviar)))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_qtd_conjuntos)
                    .addComponent(qtd_conjuntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_tamanho_bloco)
                    .addComponent(tamanho_bloco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btn_enviar)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //=========================== Não Aterar ======================================================================================

    
    
    
    // ============================= Metodo que irá definir o que será feito quando os dados forem enviados ======================
    private void btn_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviarActionPerformed
      
        int aux1=0,aux2=0;
        
        //------------- verificando se o campo de conjuntos foi preenchido -----
        System.out.println(qtd_conjuntos.getText());
        if(qtd_conjuntos.getText().trim().equals("")){
            aux1 = 1;
        }
        else{
            quant_conjuntos = Integer.parseInt(qtd_conjuntos.getText());
        }
        //----------------------------------------------------------------------
        
        
        //------- verificando se o campo do tamanho do bloco foi preenchido-----
        System.out.println(tamanho_bloco.getText());
        if(tamanho_bloco.getText().trim().equals("")){
            aux2 = 1;
        }
        else{
            tam_bloco = Integer.parseInt(tamanho_bloco.getText());
        }
        //----------------------------------------------------------------------
        
        
        //----------------------------------------------------------------------
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
        //----------------------------------------------------------------------
        
        
        //------------------ criando cache default -----------------------------
        if((aux1 == 1) && 
                (aux2 == 1) &&
               (tamanho_bloco.getText().trim().equals("")) && 
                (mapeamento_direto.isSelected() == false) && 
                (mapeamento2_assoc.isSelected() == false) && 
                (mapeamento4_assoc.isSelected() == false) && 
                (mapeamentoTot_assoc.isSelected() == false) && 
                (subs_fifo.isSelected() == false) && 
                (subs_random.isSelected() == false)){
            
            System.out.printf("Cache default será criada\n");
            
            GeradorCache cache1 = new GeradorCache(); // construtor da cache default
            String bin = "10000000000000001100000000110001";
            
            cache1.memoria[0].buscaPalavra(bin,0);
            cache1.memoria[0].buscaPalavra(bin,0);
            cache1.memoria[0].buscaPalavra(bin,0);
            bin = "10000000000000001010000000110001";
            cache1.memoria[0].buscaPalavra(bin,0);
            cache1.memoria[0].buscaPalavra(bin,0);
            bin = "10000000000000001010000100110011";
            cache1.memoria[0].buscaPalavra(bin,0);
            
        }
        //----------------------------------------------------------------------
        
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

