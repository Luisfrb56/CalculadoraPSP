/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 *
 * @author Luis Fernando
 */
public class Cliente extends javax.swing.JFrame {

    /**
     * Creates new form Cliente
     */
    /*
    Operador es un valor de tipo String que cambiara segun el operador que seleccionemos en nuestra interfaz para 
   `poder interpretarlo en el servidor
    */
    String operador=null;
    
    public Cliente() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bSuma = new javax.swing.JButton();
        bResta = new javax.swing.JButton();
        bMulti = new javax.swing.JButton();
        bDivi = new javax.swing.JButton();
        bRaiz = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        bEnviar = new javax.swing.JButton();
        t4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jbPunto1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bSuma.setText("Sumar(+)");
        bSuma.setMaximumSize(new java.awt.Dimension(100, 20));
        bSuma.setMinimumSize(new java.awt.Dimension(100, 20));
        bSuma.setPreferredSize(new java.awt.Dimension(100, 20));
        bSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSumaActionPerformed(evt);
            }
        });

        bResta.setText("Restar(-)");
        bResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRestaActionPerformed(evt);
            }
        });

        bMulti.setText("Multiplicación(*)");
        bMulti.setMaximumSize(new java.awt.Dimension(100, 20));
        bMulti.setMinimumSize(new java.awt.Dimension(100, 20));
        bMulti.setPreferredSize(new java.awt.Dimension(110, 20));
        bMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMultiActionPerformed(evt);
            }
        });

        bDivi.setText("División(/)");
        bDivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDiviActionPerformed(evt);
            }
        });

        bRaiz.setText("Raiz(√)");
        bRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRaizActionPerformed(evt);
            }
        });

        b1.setText("1");
        b1.setPreferredSize(new java.awt.Dimension(75, 75));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setText("2");
        b2.setPreferredSize(new java.awt.Dimension(75, 75));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setText("3");
        b3.setPreferredSize(new java.awt.Dimension(75, 75));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setText("4");
        b4.setPreferredSize(new java.awt.Dimension(75, 75));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b6.setText("6");
        b6.setPreferredSize(new java.awt.Dimension(75, 75));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b5.setText("5");
        b5.setPreferredSize(new java.awt.Dimension(75, 75));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b9.setText("9");
        b9.setPreferredSize(new java.awt.Dimension(75, 75));
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        b8.setText("8");
        b8.setPreferredSize(new java.awt.Dimension(75, 75));
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b7.setText("7");
        b7.setPreferredSize(new java.awt.Dimension(75, 75));
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b10.setText("0");
        b10.setPreferredSize(new java.awt.Dimension(75, 75));
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });

        t1.setPreferredSize(new java.awt.Dimension(75, 50));

        t3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t3.setPreferredSize(new java.awt.Dimension(75, 50));

        t2.setPreferredSize(new java.awt.Dimension(75, 50));

        bEnviar.setText("Enviar");
        bEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEnviarActionPerformed(evt);
            }
        });

        t4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        t4.setPreferredSize(new java.awt.Dimension(75, 50));

        jLabel1.setText("Resultado:");

        jbPunto1.setText("Negativo(-)");
        jbPunto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPunto1ActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bEnviar))))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bResta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bDivi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bRaiz))
                    .addComponent(jbPunto1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bMulti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSuma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bResta)
                    .addComponent(bDivi)
                    .addComponent(bRaiz))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbPunto1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bEnviar)
                    .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMultiActionPerformed
        /*
        Boton de multiplicar muestra la operación que vamos a realizar en un TextView, mete su codigo en el operador 
        para tratarlo en el servidor en su caso es 103 e impide que se puedan dar a los otros botones una vez dado este.
        */
        bSuma.setEnabled(false);
        bMulti.setEnabled(false);
        bResta.setEnabled(false);
        bDivi.setEnabled(false);
        bRaiz.setEnabled(false);
        t3.setText("*");
        operador="103";
        t1.setEditable(false);
        t1.setEnabled(false);
    }//GEN-LAST:event_bMultiActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        if(t1.isEditable()==true){
            t1.setText(t1.getText()+"1");
        }else{
            t2.setText(t2.getText()+"1");
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        if(t1.isEditable()==true){
            
            t1.setText(t1.getText()+"2");
        }else{
            t2.setText(t2.getText()+"2");
        }
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        if(t1.isEditable()==true){
            t1.setText(t1.getText()+"3");
        }else{
            t2.setText(t2.getText()+"3");
        }
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        if(t1.isEditable()==true){
            t1.setText(t1.getText()+"4");
        }else{
            t2.setText(t2.getText()+"4");
        }
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        if(t1.isEditable()==true){
            t1.setText(t1.getText()+"5");
        }else{
            t2.setText(t2.getText()+"5");
        }
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
       if(t1.isEditable()==true){
            t1.setText(t1.getText()+"6");
        }else{
            t2.setText(t2.getText()+"6");
        }
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        if(t1.isEditable()==true){
            t1.setText(t1.getText()+"7");
        }else{
            t2.setText(t2.getText()+"7");
        }
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        if(t1.isEditable()==true){
            t1.setText(t1.getText()+"8");
        }else{
            t2.setText(t2.getText()+"8");
        }
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        if(t1.isEditable()==true){
            t1.setText(t1.getText()+"9");
        }else{
            t2.setText(t2.getText()+"9");
        }
    }//GEN-LAST:event_b9ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
        if(t1.isEditable()==true){
            t1.setText(t1.getText()+"0");
        }else{
            t2.setText(t2.getText()+"0");
        }
    }//GEN-LAST:event_b10ActionPerformed

    private void bSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSumaActionPerformed
        /*
        Boton de sumar muestra la operación que vamos a realizar en un TextView, mete su codigo en el operador 
        para tratarlo en el servidor en su caso es 101 e impide que se puedan dar a los otros botones una vez dado este.
        */
        bSuma.setEnabled(false);
        bMulti.setEnabled(false);
        bResta.setEnabled(false);
        bDivi.setEnabled(false);
        bRaiz.setEnabled(false);
        t3.setText("+");
        operador="101";
        t1.setEditable(false);
        t1.setEnabled(false);
    }//GEN-LAST:event_bSumaActionPerformed

    private void bRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRestaActionPerformed
        /*
        Boton de restar muestra la operación que vamos a realizar en un TextView, mete su codigo en el operador 
        para tratarlo en el servidor en su caso es 102 e impide que se puedan dar a los otros botones una vez dado este.
        */
        bSuma.setEnabled(false);
        bMulti.setEnabled(false);
        bResta.setEnabled(false);
        bDivi.setEnabled(false);
        bRaiz.setEnabled(false);
        t3.setText("-");
        operador="102";
        t1.setEditable(false);
        t1.setEnabled(false);
    }//GEN-LAST:event_bRestaActionPerformed

    private void bDiviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDiviActionPerformed
        /*
        Boton de dividir muestra la operación que vamos a realizar en un TextView, mete su codigo en el operador 
        para tratarlo en el servidor en su caso es 104 e impide que se puedan dar a los otros botones una vez dado este.
        */
        bSuma.setEnabled(false);
        bMulti.setEnabled(false);
        bResta.setEnabled(false);
        bDivi.setEnabled(false);
        bRaiz.setEnabled(false);
        t3.setText("/");
        operador="104";
        t1.setEditable(false);
        t1.setEnabled(false);
    }//GEN-LAST:event_bDiviActionPerformed

    private void bRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRaizActionPerformed
        /*
        Boton de la raiz muestra la operación que vamos a realizar en un TextView, mete su codigo en el operador 
        para tratarlo en el servidor en su caso es 105 e impide que se puedan dar a los otros botones una vez dado este, 
        además a diferencia de los otros, tambien impide que se pueda escribir en el ultimo TextView porque la raiz solo 
        necesita un valor.
        */
        bSuma.setEnabled(false);
        bMulti.setEnabled(false);
        bResta.setEnabled(false);
        bDivi.setEnabled(false);
        bRaiz.setEnabled(false);
        t3.setText("Raiz");
        operador="105";
        t1.setEditable(false);
        t1.setEnabled(false);
        t2.setEditable(false);
        t2.setEnabled(false);
        t3.setEnabled(false);
    }//GEN-LAST:event_bRaizActionPerformed

    private void bEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEnviarActionPerformed
        try{
            /*
            Abrimos el socket del cliente y establecemos la conexión con el host del servidor
            ademas creamos ya nuestros Inputs y Outputs Stream que usaremos
            */
            System.out.println("Creando socket cliente");
            Socket clienteSocket=new Socket();
            System.out.println("Estableciendo la conexion");
            InetSocketAddress addr=new InetSocketAddress("localhost",6666);
            clienteSocket.connect(addr);
            
            InputStream is = clienteSocket.getInputStream();
            OutputStream os= clienteSocket.getOutputStream();
            /*
            Usamos el if para distinguir la raiz del resto de operadores ya que esta solo pasara dos datos en el array y no tres
            */
            
            if(operador=="105"){
            String []operacion={t1.getText(),operador};
            for(int i=0;i<=1;i++){   
            os.write(Byte.valueOf(operacion[i]));   
            }
            os.write(0);
            }else{
                /*
                Creamos un array de string donde mandamos el primer digito, luego el operador y por ultimo el segundo digito a operar
                despues creamos un for para mandar estos datos en orden y que al leerlos en el servidor puedan ser tratados
                */
            String []operacion={t1.getText(),operador,t2.getText()};
            for(int i=0;i<=2;i++){ 
            
            os.write(Byte.valueOf(operacion[i]));  
            
            }
            //Mandamos los mensajes
            os.write(0);
            }
            
            /*
            Creamos un dato de tipo byte con el que leeremos el resultado que nos llegue desde el servidor y que
            sera mostrado en la interfaz en el apartado del resultado.
            */
            byte[]result=new byte[50];
            is.read(result);
            t4.setText(new String (result));
            System.out.println(new String(result));
            /*
            Despues cerramos el socket.
            */
            System.out.println("Cerrando el socket cliente");

            clienteSocket.close();

            System.out.println("Terminado");

            }catch (IOException e) {
                e.printStackTrace();
        }
    }//GEN-LAST:event_bEnviarActionPerformed

    private void jbPunto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPunto1ActionPerformed
        
        if(t1.isEditable()==true){
            t1.setText("-");
        }else{
            t2.setText("-");
        }
    }//GEN-LAST:event_jbPunto1ActionPerformed

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
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bDivi;
    private javax.swing.JButton bEnviar;
    private javax.swing.JButton bMulti;
    private javax.swing.JButton bRaiz;
    private javax.swing.JButton bResta;
    private javax.swing.JButton bSuma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbPunto1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    // End of variables declaration//GEN-END:variables
}
