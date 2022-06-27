//nome:Crislean Santos Martins ra:1913280
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class CadAlcoolico extends javax.swing.JFrame {
    private Alcoolico al;
    private BdAlcoolico bdAlcoolico = new BdAlcoolico();
    
    private static CadAlcoolico cadAlcoolico;
    
    
    
    private CadAlcoolico() {
        initComponents();
    }

   public static CadAlcoolico getCadAlcoolico(){
        if(cadAlcoolico == null){
            cadAlcoolico = new CadAlcoolico();
        }
        return cadAlcoolico;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btCadastrarAl = new javax.swing.JButton();
        btConsultarId = new javax.swing.JButton();
        btAltAlId = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        lblFabricante = new javax.swing.JLabel();
        ctFabricante = new javax.swing.JTextField();
        lblTipoBebida = new javax.swing.JLabel();
        ctTipoBebida = new javax.swing.JTextField();
        lblTeorAlcoolico = new javax.swing.JLabel();
        ctTAlcoolico = new javax.swing.JTextField();
        lblSensacao = new javax.swing.JLabel();
        ctSensacaoB = new javax.swing.JTextField();
        lblTipoConfeccao = new javax.swing.JLabel();
        ctTipoConfeccao = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        ctId = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        ctNome = new javax.swing.JTextField();
        lblQuantidade = new javax.swing.JLabel();
        ctQuantidade = new javax.swing.JTextField();
        lblPreco = new javax.swing.JLabel();
        ctPreco = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbAlcoolica = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btCadastrarAl.setText("Cadastrar");
        btCadastrarAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarAlActionPerformed(evt);
            }
        });

        btConsultarId.setText("Consultar pelo id");
        btConsultarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarIdActionPerformed(evt);
            }
        });

        btAltAlId.setText("Alterar pelo id");
        btAltAlId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAltAlIdActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
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

        lblTeorAlcoolico.setFont(lblTeorAlcoolico.getFont().deriveFont((lblTeorAlcoolico.getFont().getStyle() | java.awt.Font.ITALIC) & ~java.awt.Font.BOLD, lblTeorAlcoolico.getFont().getSize()+6));
        lblTeorAlcoolico.setText("Teor Alcoolico");

        ctTAlcoolico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctTAlcoolicoActionPerformed(evt);
            }
        });

        lblSensacao.setFont(lblSensacao.getFont().deriveFont((lblSensacao.getFont().getStyle() | java.awt.Font.ITALIC) & ~java.awt.Font.BOLD, lblSensacao.getFont().getSize()+6));
        lblSensacao.setText("Sensação apos beber");

        ctSensacaoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctSensacaoBActionPerformed(evt);
            }
        });

        lblTipoConfeccao.setFont(lblTipoConfeccao.getFont().deriveFont((lblTipoConfeccao.getFont().getStyle() | java.awt.Font.ITALIC) & ~java.awt.Font.BOLD, lblTipoConfeccao.getFont().getSize()+6));
        lblTipoConfeccao.setText("Tipo de confecção de bebida");

        ctTipoConfeccao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctTipoConfeccaoActionPerformed(evt);
            }
        });

        lblID.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        lblID.setText("Id: ");

        ctId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctIdActionPerformed(evt);
            }
        });

        lblNome.setFont(lblNome.getFont().deriveFont((lblNome.getFont().getStyle() | java.awt.Font.ITALIC) & ~java.awt.Font.BOLD, lblNome.getFont().getSize()+6));
        lblNome.setText("Nome:");

        ctNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctNomeActionPerformed(evt);
            }
        });

        lblQuantidade.setFont(lblQuantidade.getFont().deriveFont((lblQuantidade.getFont().getStyle() | java.awt.Font.ITALIC) & ~java.awt.Font.BOLD, lblQuantidade.getFont().getSize()+6));
        lblQuantidade.setText("Quantidade");

        ctQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctQuantidadeActionPerformed(evt);
            }
        });

        lblPreco.setFont(lblPreco.getFont().deriveFont((lblPreco.getFont().getStyle() | java.awt.Font.ITALIC) & ~java.awt.Font.BOLD, lblPreco.getFont().getSize()+6));
        lblPreco.setText("Preco");

        ctPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctPrecoActionPerformed(evt);
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

        tbAlcoolica.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbAlcoolica);

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
                        .addComponent(btAltAlId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCadastrarAl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(btSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFabricante)
                                .addGap(18, 18, 18)
                                .addComponent(ctFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTeorAlcoolico)
                                .addGap(18, 18, 18)
                                .addComponent(ctTAlcoolico, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTipoBebida)
                                .addGap(18, 18, 18)
                                .addComponent(ctTipoBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTipoConfeccao)
                                .addGap(18, 18, 18)
                                .addComponent(ctTipoConfeccao, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSensacao)
                                .addGap(18, 18, 18)
                                .addComponent(ctSensacaoB, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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
                            .addComponent(ctPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFabricante)
                            .addComponent(ctFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTipoBebida)
                            .addComponent(ctTipoBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTeorAlcoolico)
                    .addComponent(ctTAlcoolico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSensacao)
                    .addComponent(ctSensacaoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoConfeccao)
                    .addComponent(ctTipoConfeccao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar)
                    .addComponent(btSair)
                    .addComponent(btCadastrarAl)
                    .addComponent(btConsultarId)
                    .addComponent(btAltAlId)
                    .addComponent(btExcluir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarAlActionPerformed
        cadastrarAl();
        listarTabA();
    }//GEN-LAST:event_btCadastrarAlActionPerformed

    private void btConsultarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarIdActionPerformed
        consultar();
    }//GEN-LAST:event_btConsultarIdActionPerformed

    private void btAltAlIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltAlIdActionPerformed
        alterar();
        listarTabA();
    }//GEN-LAST:event_btAltAlIdActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excluir();
        listarTabA();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void ctFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctFabricanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctFabricanteActionPerformed

    private void ctTipoBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctTipoBebidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctTipoBebidaActionPerformed

    private void ctTAlcoolicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctTAlcoolicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctTAlcoolicoActionPerformed

    private void ctSensacaoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctSensacaoBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctSensacaoBActionPerformed

    private void ctTipoConfeccaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctTipoConfeccaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctTipoConfeccaoActionPerformed

    private void ctIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctIdActionPerformed

    private void ctNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctNomeActionPerformed

    private void ctQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctQuantidadeActionPerformed

    private void ctPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctPrecoActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    
    
    public void excluir(){
         al = new Alcoolico();
        try{
            al.setId(Integer.parseInt(ctId.getText()));

            al = bdAlcoolico.consAlId(al);

            if(al!= null){
                ctId.setText(Integer.toString(al.getId()));
                ctNome.setText(al.getNome());
                /*ctQuantidade.setText(Integer.toString(sa.getQtd()));
                ctPreco.setText(Double.toString(sa.getPreco()));
                ctFabricante.setText(sa.getFab().getNomeF());
                ctTipoBebida.setText(sa.getTipo());
                ctQtdAcucar.setText(Integer.toString(sa.getQtdAcucar()));
                ctValorEnergetico.setText(Integer.toString(sa.getValorEnergetico()));
                ctQtdCafeina.setText(Integer.toString(sa.getCafeina()));*/
                int x = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir essa pessoa", "Confirmação", JOptionPane.YES_NO_CANCEL_OPTION);
                if(x == 0){
                    bdAlcoolico.removeAlId(al);
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
         al = new Alcoolico();
        try{
            al.setId(Integer.parseInt(ctId.getText()));

            al = bdAlcoolico.atualizarAlId(al);

            if(al!= null){
                ctId.setText(Integer.toString(al.getId()));
                ctNome.setText(al.getNome());
                ctQuantidade.setText(Integer.toString(al.getQtd()));
                ctPreco.setText(Double.toString(al.getPreco()));
                ctFabricante.setText(al.getFab().getNomeF());
                ctTipoBebida.setText(al.getTipo());
                ctTAlcoolico.setText(Double.toString(al.getTeorA()));
                ctSensacaoB.setText(al.getSensacaoA());
                ctTipoConfeccao.setText(al.getPreparo());
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
        ctTAlcoolico.setText("");
        ctSensacaoB.setText("");
        ctTipoConfeccao.setText("");
        ctId.requestFocus();
    }
    
    public void cadastrarAl(){
        al = new Alcoolico();
                        
        try{
            al.setId(Integer.parseInt(ctId.getText()));
            al.setId(Integer.parseInt(ctId.getText()));
            al.setNome(ctNome.getText());
            al.setQtd(Integer.parseInt(ctQuantidade.getText()));
            al.setPreco(Double.parseDouble(ctPreco.getText()));
            al.getFab().setNomeF(ctFabricante.getText());
            al.setTipo(ctTipoBebida.getText());
            al.setQtd(Integer.parseInt(ctQuantidade.getText()));
            al.setPreco(Double.parseDouble(ctPreco.getText()));
            al.setTeorA(Double.parseDouble(ctTAlcoolico.getText()));
            al.setSensacao(ctSensacaoB.getText());
            al.setPreparo(ctTipoConfeccao.getText());
            
            al = bdAlcoolico.cadAl(al);
            limpar();
            if(al!=null){
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
        al = new Alcoolico();
        try{
            al.setId(Integer.parseInt(ctId.getText()));

            al = bdAlcoolico.consAlId(al);

           if(al!= null){
                ctId.setText(Integer.toString(al.getId()));
                ctNome.setText(al.getNome());
                ctQuantidade.setText(Integer.toString(al.getQtd()));
                ctPreco.setText(Double.toString(al.getPreco()));
                ctFabricante.setText(al.getFab().getNomeF());
                ctTipoBebida.setText(al.getTipo());
                ctTAlcoolico.setText(Double.toString(al.getTeorA()));
                ctSensacaoB.setText(al.getSensacaoA());
                ctTipoConfeccao.setText(al.getPreparo());
                JOptionPane.showConfirmDialog(null,  "Confirme os dados", "Confirmação de dados", 1);
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
    
     public void listarTabA(){
        DefaultTableModel modelo = (DefaultTableModel)tbAlcoolica.getModel();
        
        int posLin = 0;
        modelo.setRowCount(posLin);
        
        for(Alcoolico al : bdAlcoolico.getBdAl()){
            modelo.insertRow(posLin, new Object [] {al.getId(), al.getNome(),al.getQtd(),al.getPreco()});
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
            java.util.logging.Logger.getLogger(CadAlcoolico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadAlcoolico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadAlcoolico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadAlcoolico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadAlcoolico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAltAlId;
    private javax.swing.JButton btCadastrarAl;
    private javax.swing.JButton btConsultarId;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField ctFabricante;
    private javax.swing.JTextField ctId;
    private javax.swing.JTextField ctNome;
    private javax.swing.JTextField ctPreco;
    private javax.swing.JTextField ctQuantidade;
    private javax.swing.JTextField ctSensacaoB;
    private javax.swing.JTextField ctTAlcoolico;
    private javax.swing.JTextField ctTipoBebida;
    private javax.swing.JTextField ctTipoConfeccao;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFabricante;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblSensacao;
    private javax.swing.JLabel lblTeorAlcoolico;
    private javax.swing.JLabel lblTipoBebida;
    private javax.swing.JLabel lblTipoConfeccao;
    private javax.swing.JTable tbAlcoolica;
    // End of variables declaration//GEN-END:variables
}
