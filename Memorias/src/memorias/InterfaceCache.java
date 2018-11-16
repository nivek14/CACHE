package memorias;

import javax.swing.JOptionPane;
import endereco.GeradorDeEnderecos;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InterfaceCache extends javax.swing.JFrame {
    
    private int quant_conjuntos,tam_bloco,tip_map,tip_subs;
    private int tot_hits,tot_misses,tot_compulsorio,tot_capacidade,tot_acessos;
    private int quantidade_end;
    private float miss_ratio,hit_ratio;
    private GerarTxt salvando = new GerarTxt();
    private Grafico grafico = new Grafico();;
            
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
        gerador = new javax.swing.JLabel();
        gerador_enderecos = new javax.swing.JButton();
        quantEnd = new javax.swing.JLabel();
        quantidade_enderecos = new javax.swing.JTextField();
        geradortxt = new javax.swing.JLabel();
        gerar_txt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        gera_grafico = new javax.swing.JButton();

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

        gerador.setText("Gerar Endereços:");

        gerador_enderecos.setText("Gerar");
        gerador_enderecos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerador_enderecosActionPerformed(evt);
            }
        });

        quantEnd.setText("Quantidade de Endereços:");

        quantidade_enderecos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantidade_enderecosActionPerformed(evt);
            }
        });

        geradortxt.setText("Gerar Txt:");

        gerar_txt.setText("TXT");
        gerar_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerar_txtActionPerformed(evt);
            }
        });

        jLabel1.setText("Gerar Gráfico:");

        gera_grafico.setText("Gráfico");
        gera_grafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gera_graficoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(label_qtd_conjuntos)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(qtd_conjuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(quantEnd)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(quantidade_enderecos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addComponent(btn_enviar)))
                        .addContainerGap(191, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(gerador)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(geradortxt)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gerar_txt)
                                    .addComponent(gerador_enderecos)))
                            .addComponent(jLabel1)
                            .addComponent(gera_grafico))
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(quantEnd)
                    .addComponent(quantidade_enderecos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(gerador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gerador_enderecos)
                .addGap(18, 18, 18)
                .addComponent(geradortxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gerar_txt)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gera_grafico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
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
        
        
        //---------- verificando se as checkboxes foram marcadas ---------------
        if(mapeamento_direto.isSelected() == true){
            tip_map = 0;
        }
        
        else if(mapeamento2_assoc.isSelected() == true){
            tip_map = 2;
        }
        
        else if(mapeamento4_assoc.isSelected() == true){
            tip_map = 4;
        }
        
        else if(mapeamentoTot_assoc.isSelected() == true){
            tip_map = 1;
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
            
            LeitorDeArquivo gerar = new LeitorDeArquivo();
            try {
                gerar.leitorDeTxT(quantidade_end,cache1);
            } catch (IOException ex) {
                System.out.println("");
            }            
            tot_acessos = cache1.acessos();
            tot_hits = cache1.hits();
            tot_misses = cache1.misses();
            tot_compulsorio = cache1.compulsorio();
            tot_capacidade = cache1.capacidade();
            hit_ratio =  (float) ((tot_hits * 100) / tot_acessos);
            miss_ratio = (float) 100 - hit_ratio;
            
            salvando.setarTxt(tip_map,miss_ratio,hit_ratio);
            
            try {
                salvando.save();
            } catch (IOException ex) {
                Logger.getLogger(InterfaceCache.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(InterfaceCache.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        //-----------------------------------------------------------------------
        else if( 
                ((mapeamento_direto.isSelected() == true) || 
                (mapeamento2_assoc.isSelected() == true) ||
                (mapeamento4_assoc.isSelected() == true) ||
                (mapeamentoTot_assoc.isSelected() == true))){
            if((subs_fifo.isSelected() == true) && 
                (subs_random.isSelected() == false)){
                System.out.printf("Cache 2 assoc será criada\n");
            
                GeradorCache cache1;
                if((mapeamento_direto.isSelected() == true) && 
                (mapeamento2_assoc.isSelected() == false) &&
                (mapeamento4_assoc.isSelected() == false) &&
                (mapeamentoTot_assoc.isSelected() == false))
                    cache1= new GeradorCache(quant_conjuntos, tam_bloco, 0,1); // construtor da cache map direto
                else if((mapeamento_direto.isSelected() == false) && 
                (mapeamento2_assoc.isSelected() == true) &&
                (mapeamento4_assoc.isSelected() == false) &&
                (mapeamentoTot_assoc.isSelected() == false))
                    cache1= new GeradorCache(quant_conjuntos, tam_bloco, 2,1); // construtor da cache 4 assoc
                else if((mapeamento_direto.isSelected() == false) && 
                (mapeamento2_assoc.isSelected() == false) &&
                (mapeamento4_assoc.isSelected() == true) &&
                (mapeamentoTot_assoc.isSelected() == false))
                    cache1= new GeradorCache(quant_conjuntos, tam_bloco, 4,1); // construtor da cache 4 assoc
                else    
                    cache1= new GeradorCache(quant_conjuntos, tam_bloco, 1,1); // construtor da cache tot assoc
                LeitorDeArquivo gerar = new LeitorDeArquivo();
                try {
                    gerar.leitorDeTxT(quantidade_end,cache1);
                } catch (IOException ex) {
                    System.out.println("");
                }            
                tot_acessos = cache1.acessos();
                tot_hits = cache1.hits();
                tot_misses = cache1.misses();
                tot_compulsorio = cache1.compulsorio();
                tot_capacidade = cache1.capacidade();
                hit_ratio =  (float) ((tot_hits * 100) / tot_acessos);
                miss_ratio = (float) 100 - hit_ratio;

            }
            
            //------------------------------------------------------------------------------------------------------
            else if((subs_fifo.isSelected() == false) && 
                (subs_random.isSelected() == true)){
                System.out.printf("Cache 2 assoc será criada\n");
               GeradorCache cache1;
               if((mapeamento_direto.isSelected() == true) && 
                (mapeamento2_assoc.isSelected() == false) &&
                (mapeamento4_assoc.isSelected() == false) &&
                (mapeamentoTot_assoc.isSelected() == false))
                    cache1= new GeradorCache(quant_conjuntos, tam_bloco, 0,2); // construtor da cache map direto
                else if((mapeamento_direto.isSelected() == false) && 
                (mapeamento2_assoc.isSelected() == true) &&
                (mapeamento4_assoc.isSelected() == false) &&
                (mapeamentoTot_assoc.isSelected() == false))
                    cache1= new GeradorCache(quant_conjuntos, tam_bloco, 2,2); // construtor da cache 2 assoc
                else if((mapeamento_direto.isSelected() == false) && 
                (mapeamento2_assoc.isSelected() == false) &&
                (mapeamento4_assoc.isSelected() == true) &&
                (mapeamentoTot_assoc.isSelected() == false))
                    cache1= new GeradorCache(quant_conjuntos, tam_bloco, 4,2); // construtor da cache 4 assoc
                else    
                    cache1= new GeradorCache(quant_conjuntos, tam_bloco, 1,2); // construtor da cache tot assoc
                LeitorDeArquivo gerar = new LeitorDeArquivo();
                try {
                    gerar.leitorDeTxT(quantidade_end,cache1);
                } catch (IOException ex) {
                    System.out.println("");
                }            
                tot_acessos = cache1.acessos();
                tot_hits = cache1.hits();
                tot_misses = cache1.misses();
                tot_compulsorio = cache1.compulsorio();
                tot_capacidade = cache1.capacidade();
                hit_ratio =  (float) ((tot_hits * 100) / tot_acessos);
                miss_ratio = (float) 100 - hit_ratio;
            }
        }
        
        //----------------------------------------------------------------------------------------
        else {
            System.out.println("ALGO NAO FOI SELECIONADO");
        }
            JOptionPane.showMessageDialog(this,"Total de acessos: " + tot_acessos + "\n" + 
                                             "Total de hits: " + tot_hits + "\n" + 
                                             "Total de misses: " + tot_misses + "\n" 
                                             + "Misses compulsórios: " + tot_compulsorio + "\n" 
                                              + "Misses de capacidade: " + tot_capacidade +
                    "\n" + "Hit Ratio: " + hit_ratio + "%" + "\n"
                    + "Miss Ratio: " + miss_ratio + "%" + "\n","Resultados",JOptionPane.INFORMATION_MESSAGE);
            
            
           
        //----------------------------------------------------------------------
        
        System.out.println(tot_acessos);
        System.out.println(tot_hits);
        System.out.println(tot_misses);
        System.out.println(tot_compulsorio);
        System.out.println(tot_capacidade);
        
        
    }//GEN-LAST:event_btn_enviarActionPerformed

    
    //-------------------------------------------------------------------------------------------------------------------------------
    private void gerador_enderecosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerador_enderecosActionPerformed
       
        GeradorDeEnderecos gerar = new GeradorDeEnderecos();
        
        gerar.gerarArquivos(quantidade_end);
        
        System.out.printf("%d endereços foram gerados\n", quantidade_end);
        
    }//GEN-LAST:event_gerador_enderecosActionPerformed
    //--------------------------------------------------------------------------------------------------------------------------------
    
    
    
    //--------------------------------------------------------------------------------------------------------------------------------
    private void quantidade_enderecosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantidade_enderecosActionPerformed
       
        if(quantidade_enderecos.getText().trim().equals("")){
            quantidade_end = 200;
            System.out.printf("Tamanho de arquivo default será criado (200)\n");
        }
        
        else{
            quantidade_end = Integer.parseInt(quantidade_enderecos.getText());
            System.out.printf("Tamanho %d selecionado com sucesso\n", quantidade_end);
        }
        
    }//GEN-LAST:event_quantidade_enderecosActionPerformed
    //---------------------------------------------------------------------------------------------------------------------
    
    
    
    //---------------------------- Gerando Txt -------------------------------------------------------------------------------------
    private void gerar_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerar_txtActionPerformed
      
        try {
            
            
            salvando.GerarTxtNovo();
            System.out.printf("Arquivo criado com sucesso\n");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(InterfaceCache.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(InterfaceCache.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
    }//GEN-LAST:event_gerar_txtActionPerformed

    
    //--------------------- Gerar o gráfico das caches ----------------------------------------------------------------------------
    private void gera_graficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gera_graficoActionPerformed
       
       
        grafico.criarGrafico();
        
        
    }//GEN-LAST:event_gera_graficoActionPerformed
    //-------------------------------------------------------------------------------------------------------------------------------
   
    
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
    private javax.swing.JButton gera_grafico;
    private javax.swing.JLabel gerador;
    private javax.swing.JButton gerador_enderecos;
    private javax.swing.JLabel geradortxt;
    private javax.swing.JButton gerar_txt;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel quantEnd;
    private javax.swing.JTextField quantidade_enderecos;
    private javax.swing.JCheckBox subs_fifo;
    private javax.swing.JCheckBox subs_random;
    private javax.swing.JTextField tamanho_bloco;
    // End of variables declaration//GEN-END:variables
}

