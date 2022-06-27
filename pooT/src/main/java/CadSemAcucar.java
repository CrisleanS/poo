//nome: Crislean Santos Martins ra: 1913280

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadSemAcucar extends javax.swing.JFrame {
 
    private SemAcucar sac;
    private BdSemAcucar bdSemAcucar = new BdSemAcucar();
    
    private static CadSemAcucar cadSemAcucar;
    
    
    
    private CadSemAcucar() {
        initComponents();
    }
    
    public static CadSemAcucar getCadSemAlcucar(){
        if(cadSemAcucar == null){
            cadSemAcucar = new CadSemAcucar();
        }
        return cadSemAcucar;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPreco = new javax.swing.JLabel();
        ctPreco = new javax.swing.JTextField();
        lblFabricante = new javax.swing.JLabel();
        ctFabricante = new javax.swing.JTextField();
        lblTipoBebida = new javax.swing.JLabel();
        ctTipoBebida = new javax.swing.JTextField();
        lblSemsacaoBeber = new javax.swing.JLabel();
        ctSensacaoBeber = new javax.swing.JTextField();
        lblEfeitoBeber = new javax.swing.JLabel();
        ctEfeitoBeber = new javax.swing.JTextField();
        lblOrigem = new javax.swing.JLabel();
        ctOrigem = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btCadastrarSa = new javax.swing.JButton();
        btConsultarId = new javax.swing.JButton();
        lblID = new javax.swing.JLabel();
        ctId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSemAcucar = new javax.swing.JTable();
        lblNome = new javax.swing.JLabel();
        btAltSaId = new javax.swing.JButton();
        ctNome = new javax.swing.JTextField();
        btExcluir = new javax.swing.JButton();
        lblQuantidade = new javax.swing.JLabel();
        ctQuantidade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPreco.setFont(lblPreco.getFont().deriveFont((lblPreco.getFont().getStyle() | java.awt.Font.ITALIC) & ~java.awt.Font.BOLD, lblPreco.getFont().getSize()+6));
        lblPreco.setText("Preco");

        ctPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctPrecoActionPerformed(evt);
            }
        });

        lblFabricante.setFont(lblFabricante.getFont().deriveFont((lblFabricante.getFont().getStyle() | java.awt.Font.ITALIC) & ~java.awt.Font.BOLD, lblFabricante.getFont().getSize()+6));
        lblFabricante.setText("Fabricante");

        ctFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctFabricanteActionPerformed(evt);
            }
        });

        lblTipoBebida.setFont(lblTipoBebida.getFont().deriveFont((lblTipoBebida.getFont().getStyle() | java.awt.Font.ITALIC) & ~java.awt.Font.BOLD, lblTipoBebida.getFont().getSize()+6));
        lblTipoBebida.setText("Tipo de Bebida");

        ctTipoBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctTipoBebidaActionPerformed(evt);
            }
        });

        lblSemsacaoBeber.setFont(lblSemsacaoBeber.getFont().deriveFont((lblSemsacaoBeber.getFont().getStyle() | java.awt.Font.ITALIC) & ~java.awt.Font.BOLD, lblSemsacaoBeber.getFont().getSize()+6));
        lblSemsacaoBeber.setText("Sensação apos beber");

        ctSensacaoBeber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctSensacaoBeberActionPerformed(evt);
            }
        });

        lblEfeitoBeber.setFont(lblEfeitoBeber.getFont().deriveFont((lblEfeitoBeber.getFont().getStyle() | java.awt.Font.ITALIC) & ~java.awt.Font.BOLD, lblEfeitoBeber.getFont().getSize()+6));
        lblEfeitoBeber.setText("Efeito apos beber");

        ctEfeitoBeber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctEfeitoBeberActionPerformed(evt);
            }
        });

        lblOrigem.setFont(lblOrigem.getFont().deriveFont((lblOrigem.getFont().getStyle() | java.awt.Font.ITALIC) & ~java.awt.Font.BOLD, lblOrigem.getFont().getSize()+6));
        lblOrigem.setText("Origem");

        ctOrigem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctOrigemActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btCadastrarSa.setText("Cadastrar");
        btCadastrarSa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarSaActionPerformed(evt);
            }
        });

        btConsultarId.setText("Consultar pelo id");
        btConsultarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarIdActionPerformed(evt);
            }
        });

        lblID.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        lblID.setText("Id: ");

        ctId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctIdActionPerformed(evt);
            }
        });

        tblSemAcucar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "nome", "quantidade", "preco"
            }
        ));
        jScrollPane1.setViewportView(tblSemAcucar);

        lblNome.setFont(lblNome.getFont().deriveFont((lblNome.getFont().getStyle() | java.awt.Font.ITALIC) & ~java.awt.Font.BOLD, lblNome.getFont().getSize()+6));
        lblNome.setText("Nome:");

        btAltSaId.setText("Alterar pelo id");
        btAltSaId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAltSaIdActionPerformed(evt);
            }
        });

        ctNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctNomeActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        lblQuantidade.setFont(lblQuantidade.getFont().deriveFont((lblQuantidade.getFont().getStyle() | java.awt.Font.ITALIC) & ~java.awt.Font.BOLD, lblQuantidade.getFont().getSize()+6));
        lblQuantidade.setText("Quantidade");

        ctQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctQuantidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btConsultarId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAltSaId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCadastrarSa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(btSair)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFabricante)
                                .addGap(18, 18, 18)
                                .addComponent(ctFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSemsacaoBeber)
                                .addGap(18, 18, 18)
                                .addComponent(ctSensacaoBeber, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTipoBebida)
                                .addGap(18, 18, 18)
                                .addComponent(ctTipoBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblOrigem)
                                .addGap(18, 18, 18)
                                .addComponent(ctOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEfeitoBeber)
                                .addGap(18, 18, 18)
                                .addComponent(ctEfeitoBeber, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblID)
                                .addGap(18, 18, 18)
                                .addComponent(ctId, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblQuantidade)
                                .addGap(18, 18, 18)
                                .addComponent(ctQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPreco)
                                .addGap(18, 18, 18)
                                .addComponent(ctPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNome)
                                .addGap(18, 18, 18)
                                .addComponent(ctNome, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblID)
                            .addComponent(ctId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(ctNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQuantidade)
                            .addComponent(ctQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPreco)
                            .addComponent(ctPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFabricante)
                    .addComponent(ctFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoBebida)
                    .addComponent(ctTipoBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSemsacaoBeber)
                    .addComponent(ctSensacaoBeber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEfeitoBeber)
                    .addComponent(ctEfeitoBeber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrigem)
                    .addComponent(ctOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar)
                    .addComponent(btSair)
                    .addComponent(btCadastrarSa)
                    .addComponent(btConsultarId)
                    .addComponent(btAltSaId)
                    .addComponent(btExcluir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ctPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctPrecoActionPerformed

    private void ctFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctFabricanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctFabricanteActionPerformed

    private void ctTipoBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctTipoBebidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctTipoBebidaActionPerformed

    private void ctSensacaoBeberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctSensacaoBeberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctSensacaoBeberActionPerformed

    private void ctEfeitoBeberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctEfeitoBeberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctEfeitoBeberActionPerformed

    private void ctOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctOrigemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctOrigemActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btCadastrarSaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarSaActionPerformed
        cadastrarSac();
        listarTab();
    }//GEN-LAST:event_btCadastrarSaActionPerformed

    private void btConsultarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarIdActionPerformed
        consultar();
    }//GEN-LAST:event_btConsultarIdActionPerformed

    private void ctIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctIdActionPerformed

    private void btAltSaIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltSaIdActionPerformed
        alterar();
        listarTab();
    }//GEN-LAST:event_btAltSaIdActionPerformed

    private void ctNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctNomeActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excluir();
        listarTab();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void ctQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctQuantidadeActionPerformed

    public void excluir(){
        sac = new SemAcucar();
        try{
            sac.setId(Integer.parseInt(ctId.getText()));

            sac = bdSemAcucar.consSacId(sac);

            if(sac!= null){
                ctId.setText(Integer.toString(sac.getId()));
                ctNome.setText(sac.getNome());
                /*ctQuantidade.setText(Integer.toString(sa.getQtd()));
                ctPreco.setText(Double.toString(sa.getPreco()));
                ctFabricante.setText(sa.getFab().getNomeF());
                ctTipoBebida.setText(sa.getTipo());
                ctQtdAcucar.setText(Integer.toString(sa.getQtdAcucar()));
                ctValorEnergetico.setText(Integer.toString(sa.getValorEnergetico()));
                ctQtdCafeina.setText(Integer.toString(sa.getCafeina()));*/
                int x = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir essa pessoa", "Confirmação", JOptionPane.YES_NO_CANCEL_OPTION);
                if(x == 0){
                    bdSemAcucar.removeSacId(sac);
                    JOptionPane.showConfirmDialog(null, "Lata excluida com sucesso", "exclusão de lata", 1);
                }
                limpar();
            }
            else{
                JOptionPane.showConfirmDialog(null, "não existe lata com esse id", "id inexistente", 0);
                limpar();
            }
        }
        catch(NumberFormatException nfe){
            JOptionPane.showConfirmDialog(null, "erro no tipo de dado", "id errado", 0);
            limpar();
            ctId.requestFocus();
        }
}
    
            
            
    public void alterar(){
         sac = new SemAcucar();
        try{
            sac.setId(Integer.parseInt(ctId.getText()));

            sac = bdSemAcucar.atualizarSacId(sac);

            if(sac!= null){
                ctId.setText(Integer.toString(sac.getId()));
                ctNome.setText(sac.getNome());
                ctQuantidade.setText(Integer.toString(sac.getQtd()));
                ctPreco.setText(Double.toString(sac.getPreco()));
                ctFabricante.setText(sac.getFab().getNomeF());
                ctTipoBebida.setText(sac.getTipo());
                ctSensacaoBeber.setText(sac.getSensacaoSA());
                ctEfeitoBeber.setText(sac.getEfeitoSA());
                ctOrigem.setText(sac.getEfeitoSA());
                JOptionPane.showConfirmDialog(null, "Dados atualizados com sucesso!", "Confirmação de dados", 1);
                limpar();
            }
            else{
                JOptionPane.showConfirmDialog(null, "não existe lata com esse id", "id inexistente", 0);
                limpar();
            }
        }
        catch(NumberFormatException nfe){
            JOptionPane.showConfirmDialog(null, "erro no tipo de dado", "id errado", 0);
            limpar();
            ctId.requestFocus();
        }
        
    }
    
    public void sair(){
        int resp = JOptionPane.showConfirmDialog(null, "Deseja fechar o cadastro?", "Saida", JOptionPane.YES_NO_CANCEL_OPTION);
        if(resp == 0){
            this.dispose();
        }
    }
    
    public void limpar(){
        ctId.setText("");
        ctNome.setText("");
        ctQuantidade.setText("");
        ctPreco.setText("");
        ctFabricante.setText("");
        ctTipoBebida.setText("");
        ctSensacaoBeber.setText("");
        ctEfeitoBeber.setText("");
        ctOrigem.setText("");
        ctId.requestFocus();
    }
    
    public void cadastrarSac(){
        sac = new SemAcucar();
                        
        try{
            sac.setId(Integer.parseInt(ctId.getText()));
            sac.setId(Integer.parseInt(ctId.getText()));
            sac.setNome(ctNome.getText());
            sac.setQtd(Integer.parseInt(ctQuantidade.getText()));
            sac.setPreco(Double.parseDouble(ctPreco.getText()));
            sac.getFab().setNomeF(ctFabricante.getText());
            sac.setTipo(ctTipoBebida.getText());
            sac.setQtd(Integer.parseInt(ctQuantidade.getText()));
            sac.setPreco(Double.parseDouble(ctPreco.getText()));
            sac.setSensacaoSA(ctSensacaoBeber.getText());
            sac.setEfeitoSA(ctEfeitoBeber.getText());
            sac.setOrigem(ctOrigem.getText());
            
            sac = bdSemAcucar.cadSac(sac);
            limpar();
            if(sac!=null){
                JOptionPane.showConfirmDialog(null,"Pessoa cadastrada com sucesso!","Cadastro ok!", 1);
            }else{
                JOptionPane.showConfirmDialog(null, "ja existe a lata cadastrada", "duplicado", 0);
                 limpar();
                 ctId.requestFocus();
            }
            
        }
        catch(NumberFormatException nfe){
            JOptionPane.showConfirmDialog(null, "erro no tipo de dado", "id, quantidade, preco...", 0);
            limpar();
            ctId.requestFocus();
        }
        
    }
    
    public void consultar(){
        sac = new SemAcucar();
        try{
            sac.setId(Integer.parseInt(ctId.getText()));

            sac = bdSemAcucar.consSacId(sac);

            if(sac!= null){
                ctId.setText(Integer.toString(sac.getId()));
                ctNome.setText(sac.getNome());
                ctQuantidade.setText(Integer.toString(sac.getQtd()));
                ctPreco.setText(Double.toString(sac.getPreco()));
                ctFabricante.setText(sac.getFab().getNomeF());
                ctTipoBebida.setText(sac.getTipo());
                ctSensacaoBeber.setText(sac.getSensacaoSA());
                ctEfeitoBeber.setText(sac.getEfeitoSA());
                ctOrigem.setText(sac.getOrigem());
                JOptionPane.showConfirmDialog(null, "Confirme os dados", "Confirmação de dados", 1);
                limpar();
            }
            else{
                JOptionPane.showConfirmDialog(null, "não existe lata com esse id", "id inexistente", 0);
                limpar();
            }
        }
        catch(NumberFormatException nfe){
            JOptionPane.showConfirmDialog(null, "erro no tipo de dado", "id errado", 0);
            limpar();
            ctId.requestFocus();
        }
        
    }
    
    public void listarTab(){
        DefaultTableModel modelo = (DefaultTableModel)tblSemAcucar.getModel();
        
        int posLin = 0;
        modelo.setRowCount(posLin);
        
        for(SemAcucar sac : bdSemAcucar.getBdSac()){
            modelo.insertRow(posLin, new Object [] {sac.getId(), sac.getNome(),sac.getQtd(),sac.getPreco()});
            posLin++;
        }
    }
    
    
    
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CadSemAcucar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadSemAcucar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadSemAcucar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadSemAcucar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadSemAcucar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAltSaId;
    private javax.swing.JButton btCadastrarSa;
    private javax.swing.JButton btConsultarId;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField ctEfeitoBeber;
    private javax.swing.JTextField ctFabricante;
    private javax.swing.JTextField ctId;
    private javax.swing.JTextField ctNome;
    private javax.swing.JTextField ctOrigem;
    private javax.swing.JTextField ctPreco;
    private javax.swing.JTextField ctQuantidade;
    private javax.swing.JTextField ctSensacaoBeber;
    private javax.swing.JTextField ctTipoBebida;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEfeitoBeber;
    private javax.swing.JLabel lblFabricante;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblOrigem;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblSemsacaoBeber;
    private javax.swing.JLabel lblTipoBebida;
    private javax.swing.JTable tblSemAcucar;
    // End of variables declaration//GEN-END:variables
}
