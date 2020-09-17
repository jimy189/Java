
package loteria;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlSpan;
import com.gargoylesoftware.htmlunit.html.HtmlTable;
import com.gargoylesoftware.htmlunit.html.HtmlTableCell;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class formloteria extends javax.swing.JFrame {
  
    public formloteria() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton = new javax.swing.JToggleButton();
        jLabel16 = new javax.swing.JLabel();
        labelAcertos = new javax.swing.JLabel();
        certo = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        labeldata = new javax.swing.JLabel();
        link = new javax.swing.JLabel();
        test = new javax.swing.JLabel();
        labelacert = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titulo.setText("Lotafácil: Digite os numeros");

        jButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton.setText("Sortear");
        jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Numero sorteados:");

        labelAcertos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelAcertos.setText("Acertos:");

        certo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        certo.setText("---");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Numeros acertados:");

        labeldata.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labeldata.setText("DATA");

        link.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        link.setText("Link");

        test.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        test.setText("---");

        labelacert.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelacert.setText("---");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(link))
                    .addComponent(test))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelacert)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelAcertos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(certo))
                    .addComponent(jLabel17)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labeldata))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(labeldata)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(certo)
                                .addComponent(labelAcertos)))))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(test))
                .addGap(18, 18, 18)
                .addComponent(labelacert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(link)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActionPerformed
      System.out.println("Aguarde processo em execusão...");  
        
      java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(java.util.logging.Level.OFF); 
      java.util.logging.Logger.getLogger("org.apache.http").setLevel(java.util.logging.Level.OFF);  
      
      CookieHandler.setDefault(new CookieManager(null, CookiePolicy.ACCEPT_ALL));
      String URL = "http://www.loterias.caixa.gov.br/wps/portal/loterias/landing/lotofacil";
      WebClient webClient = new WebClient(BrowserVersion.CHROME);
      HtmlPage page = null;
      
      try
      {
          page = webClient.getPage(URL);
      } 
       catch(IOException | FailingHttpStatusCodeException ex)
      {
          Logger.getLogger(Jogando.class.getName()).log(Level.SEVERE,null, ex);
      }
      
      webClient.getOptions().setJavaScriptEnabled(true);
      webClient.waitForBackgroundJavaScript(9000);
      
    
      System.out.println(page.getUrl().toString());
            
      List<HtmlElement> spans = page.getBody().getElementsByAttribute("span", "class", "ng-binding");
      HtmlSpan concurso = (HtmlSpan) spans.get(0);
      String ccs = concurso.getTextContent().replaceAll("\\s+", " ").trim();
      System.out.println(ccs);
      
      List<Long> resultados = new ArrayList();   
      List<HtmlElement> lista = page.getBody().getElementsByAttribute("table", "class", "simple-table lotofacil"); 
      HtmlTable tabela = (HtmlTable) lista.get(0);
      List<HtmlTableCell> cells = tabela.getBodies().get(0).getElementsByAttribute("td", "ng-repeat", "dezena in resultadoLinha");
      cells.forEach(cell -> resultados.add(Long.parseLong(cell.getTextContent())));
      
      Long n1=Long.parseLong(jTextField1.getText());
      Long n2=Long.parseLong(jTextField2.getText());
      Long n3=Long.parseLong(jTextField3.getText());
      Long n4=Long.parseLong(jTextField4.getText());
      Long n5=Long.parseLong(jTextField5.getText());
      Long n6=Long.parseLong(jTextField6.getText());
      
      Long n7=Long.parseLong(jTextField7.getText());
      Long n8=Long.parseLong(jTextField8.getText());
      Long n9=Long.parseLong(jTextField9.getText());
      Long n10=Long.parseLong(jTextField10.getText());
      Long n11=Long.parseLong(jTextField11.getText());
      Long n12=Long.parseLong(jTextField12.getText());
      
      Long n13=Long.parseLong(jTextField13.getText());
      Long n14=Long.parseLong(jTextField14.getText());
      Long n15=Long.parseLong(jTextField15.getText());
      
      System.out.println(resultados); 
      System.out.println(resultados.get(14));
      System.out.println(resultados.contains(n1));
      System.out.println("Tamanho" + resultados.size());
      
      int nsorteado=0;
      
      
      /*jLabel1.setText(Long.toString(resultados.get(0)));
      jLabel2.setText(Long.toString(resultados.get(1)));
      jLabel3.setText(Long.toString(resultados.get(2)));
      jLabel4.setText(Long.toString(resultados.get(3)));
      jLabel5.setText(Long.toString(resultados.get(4)));
      jLabel6.setText(Long.toString(resultados.get(5)));
      jLabel7.setText(Long.toString(resultados.get(6)));
      jLabel8.setText(Long.toString(resultados.get(7)));
      jLabel9.setText(Long.toString(resultados.get(8)));
      jLabel10.setText(Long.toString(resultados.get(9)));
      jLabel11.setText(Long.toString(resultados.get(10)));
      jLabel12.setText(Long.toString(resultados.get(11)));
      jLabel13.setText(Long.toString(resultados.get(12)));
      jLabel14.setText(Long.toString(resultados.get(13)));
      jLabel15.setText(Long.toString(resultados.get(14)));*/
      
     List<Long> acertado = new ArrayList();
      
      if(resultados.contains(n1)){
          
          acertado.add(n1);
          nsorteado++;
      }
      if(resultados.contains(n2)){
          acertado.add(n2);
           
          nsorteado++;
      }
      if(resultados.contains(n3)){ 
          acertado.add(n3);
          nsorteado++;
      }
       if(resultados.contains(n4)){ 
           acertado.add(n4);
          nsorteado++;
      }
        if(resultados.contains(n5)){ 
           acertado.add(n5);  
          nsorteado++;
      }
      
        if(resultados.contains(n6)){
            acertado.add(n6);
            nsorteado++;
      }  
        
        if(resultados.contains(n7)){
           acertado.add(n7);
          nsorteado++;
      }   
      
       if(resultados.contains(n8)){ 
           acertado.add(n8);
          nsorteado++;
      } 
      
       if(resultados.contains(n9)){  
           acertado.add(n9);
          nsorteado++;
      } 
       
       if(resultados.contains(n10)){  
          acertado.add(n10);
          nsorteado++;
      }   
       
          if(resultados.contains(n11)){
           acertado.add(n11);  
          nsorteado++;
      }  
       
          if(resultados.contains(n12)){ 
           acertado.add(n12); 
          nsorteado++;
      }  
           
                if(resultados.contains(n13)){  
             acertado.add(n13);    
          nsorteado++;
      }  
                  if(resultados.contains(n14)){
              acertado.add(n14);           
          nsorteado++;
      } 
                 if(resultados.contains(n15)){  
                acertado.add(n14);    
          nsorteado++;
      }  
                
        
      System.out.println("Acertos: "+nsorteado);
      
      List<HtmlElement> division = page.getBody().getElementsByAttribute("div", "class", "resultado-loteria");
      List<HtmlElement> paragrafos = division.get(0).getElementsByAttribute("p", "class", "ng-binding");
      String data = paragrafos.get(0).getTextContent().trim();
      data = "Data do próximo sorteio: ".concat(data.substring((data.length() - 10), data.length()));
      System.out.println(data);
        
      certo.setText(Integer.toString(nsorteado));
      labeldata.setText(data);
      link.setText(URL);
      test.setText(String.valueOf(resultados));
      labelacert.setText(String.valueOf(acertado));
    }//GEN-LAST:event_jButtonActionPerformed
    
    
   
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
            java.util.logging.Logger.getLogger(formloteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formloteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formloteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formloteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formloteria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel certo;
    private javax.swing.JToggleButton jButton;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel labelAcertos;
    private javax.swing.JLabel labelacert;
    private javax.swing.JLabel labeldata;
    private javax.swing.JLabel link;
    private javax.swing.JLabel test;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    private static class Jogando {

        public Jogando() {
        }
    }
}
