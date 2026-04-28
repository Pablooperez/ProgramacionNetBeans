
package agenda;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class jfPrincipal extends javax.swing.JFrame {
    //Declaraciones de Clase
    Conexion cx;
    public Statement stm;     
    public ResultSet rs;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(jfPrincipal.class.getName());

// ** CONSTRUCTORES***********************************************************************************************
    public jfPrincipal() {
        initComponents();
       
        //Centramos Formulario
        setLocationRelativeTo(null);
        //Limpiamos Campos
        limpiarCampos();
        //Conectar con MySql Agenda
        cx = new Conexion();
        //Consulta
        String sql = "SELECT * FROM contactos";
        String resetId = "ALTER TABLE contactos AUTO_INCREMENT = 1";
        try {
            rs = cx.getRS(sql);
            
            if (rs.isBeforeFirst()) {
                rs.first();
                cargarDatos(rs);
                
            }else{
                System.out.println("ERROR --> AGENDA VACÍA");
            }
            
        
            
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Agenda vacía", "AGENDA", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtfNombre = new javax.swing.JTextField();
        jlNombre = new javax.swing.JLabel();
        jtfApellidos = new javax.swing.JTextField();
        jlApellidos = new javax.swing.JLabel();
        jlDireccion = new javax.swing.JLabel();
        jtfDireccion = new javax.swing.JTextField();
        jlPoblacion = new javax.swing.JLabel();
        jtfPoblacion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jbFirst = new javax.swing.JButton();
        jbPrevious = new javax.swing.JButton();
        jbNext = new javax.swing.JButton();
        jbLast = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jbInsertar = new javax.swing.JButton();
        jbActualizar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jlId = new javax.swing.JLabel();
        jlId2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlNombre.setText("Nombre:");

        jlApellidos.setText("Apellidos:");

        jlDireccion.setText("Dirección:");

        jlPoblacion.setText("Población:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("AGENDA");
        jLabel1.setToolTipText(" ");

        jbFirst.setText("<<");
        jbFirst.addActionListener(this::jbFirstActionPerformed);

        jbPrevious.setText("<");
        jbPrevious.addActionListener(this::jbPreviousActionPerformed);

        jbNext.setText(">");
        jbNext.addActionListener(this::jbNextActionPerformed);

        jbLast.setText(">>");
        jbLast.addActionListener(this::jbLastActionPerformed);

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(this::jbLimpiarActionPerformed);

        jbInsertar.setText("Insertar");
        jbInsertar.addActionListener(this::jbInsertarActionPerformed);

        jbActualizar.setText("Actualizar");
        jbActualizar.addActionListener(this::jbActualizarActionPerformed);

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(this::jbEliminarActionPerformed);

        jbSalir.setText("Salir");
        jbSalir.addActionListener(this::jbSalirActionPerformed);

        jlId.setText("ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jbFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbNext, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbLast, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jbInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jbEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                                .addComponent(jbSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jlNombre)
                                        .addComponent(jlApellidos)
                                        .addComponent(jlDireccion)
                                        .addComponent(jlPoblacion))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jtfApellidos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                                        .addComponent(jtfPoblacion, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtfNombre)
                                        .addComponent(jtfDireccion))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlId2)))))
                .addGap(11, 11, 11))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlId)
                            .addComponent(jlId2))
                        .addGap(6, 6, 6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlApellidos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDireccion)
                    .addComponent(jtfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPoblacion)
                    .addComponent(jtfPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbFirst)
                    .addComponent(jbPrevious)
                    .addComponent(jbNext)
                    .addComponent(jbLast))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLimpiar)
                    .addComponent(jbInsertar)
                    .addComponent(jbActualizar)
                    .addComponent(jbEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbSalir)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

// ** MÉTODOS******************************************************************************************************
    public void limpiarCampos(){
        jtfNombre.setText("");
        jtfApellidos.setText("");
        jtfDireccion.setText("");
        jtfPoblacion.setText("");
        jlId2.setText("---");
    }
    
    private void cargarDatos(ResultSet r){
       
        try {
            jlId2.setText(r.getString("id"));
            jtfNombre.setText(r.getString("nombre"));
            jtfApellidos.setText(r.getString("apellidos"));
            jtfDireccion.setText(r.getString("direccion"));
            jtfPoblacion.setText(r.getString("poblacion"));
        } catch (SQLException ex) {
            System.getLogger(jfPrincipal.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    
    
    
    }
    
    private void insertarDatos(String nombre, String apellidos, String direccion, String poblacion) {
    String sSql = "INSERT INTO contactos VALUES (NULL, ?, ?, ?, ?)";
    
    
    try {
        PreparedStatement pps = cx.getConnection().prepareStatement(sSql);
        pps.setString(1, nombre);
        pps.setString(2, apellidos);
        pps.setString(3, direccion);
        pps.setString(4, poblacion);
        
        pps.executeUpdate(); // Mejor usar executeUpdate para INSERT/UPDATE/DELETE
        String sql = "SELECT * FROM contactos";
        
        try {
            rs = cx.getRS(sql);
            
            if (rs.isBeforeFirst()) {
                rs.first();
                cargarDatos(rs);
               
            }else{
                System.out.println("ERROR --> AGENDA VACÍA");
            }
        } catch (SQLException ex){
            
        }
        JOptionPane.showMessageDialog(null, "Registro añadido", "TAME", JOptionPane.INFORMATION_MESSAGE);
        
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "ERROR - al insertar datos: " + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
    }
}
    private void actualizarDatos(String nombre, String apellidos, String direccion, String poblacion){
        //Creamos la variable que va a ser la consulta UPDATE
        String sSql;
        sSql="UPDATE contactos SET nombre=?, apellidos=?, direccion=?, poblacion=? WHERE id=?";
        
        System.out.println(sSql);
        
        //Forma 1
        
        try {
           PreparedStatement pps = cx.getConnection().prepareStatement(sSql);
            pps.setString(1, jtfNombre.getText());
            pps.setString(2, jtfApellidos.getText());
            pps.setString(3, jtfDireccion.getText());
            pps.setString(4, jtfPoblacion.getText());
            pps.setString(5, jlId2.getText());
            pps.executeUpdate();
            System.out.println("Entra");
            String sql = "SELECT * FROM contactos";
            try {
                rs = cx.getRS(sql);
            
                if (rs.isBeforeFirst()) {
                    rs.first();
                    cargarDatos(rs);
                }else{
                    System.out.println("ERROR --> AGENDA VACÍA");
                }
            } catch (SQLException ex){
            
        }
            JOptionPane.showMessageDialog(null, "Registro modificado","TAME",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            System.out.println("No entra");
            JOptionPane.showMessageDialog(null, "ERROR - al modificar datos","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        
        //Forma 2
        
        //sSql="UPDATE contactos SET nombre='"+jtfNombre.getText()+"',apellidos='"+jtfApellidos.getText()+"',direccion='"
        //+jtfDireccion.getText()+"',poblacion='"+jtfPoblacion.getText()
        //+ "' WHERE id='"+jlId2.getText()+"'"+";";
        /*try {
           PreparedStatement pps = cx.getConnection().prepareStatement(sSql);
            pps.executeUpdate();
            System.out.println("Entra");
            JOptionPane.showMessageDialog(null, "Registro modificado","TAME",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            System.out.println("No entra");
            JOptionPane.showMessageDialog(null, "ERROR - al modificar datos","ERROR",JOptionPane.ERROR_MESSAGE);
        }*/
    }
    
    private void eliminarDatos(String id){
        //Creamos la variable que va a ejecutar el deleter
        String sSql;
        sSql = "DELETE FROM contactos where id = ?";
        
        try {
            PreparedStatement pps = cx.getConnection().prepareStatement(sSql);
            pps.setString(1,jlId2.getText());
            pps.execute();
            String sql = "SELECT * FROM contactos";
        
            try {
                rs = cx.getRS(sql);
            
                if (rs.isBeforeFirst()) {
                    rs.first();
                    cargarDatos(rs);
                }else{
                    System.out.println("ERROR --> AGENDA VACÍA");
                }
            } catch (SQLException ex){
            
        }
            JOptionPane.showMessageDialog(null, "Registro eliminado","AGENDA",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR - al eliminar datos", "AGENDA", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    

            
            
    private void jbFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFirstActionPerformed
        try {
            rs.first();
            cargarDatos(rs);
        } catch (SQLException ex) {
            System.getLogger(jfPrincipal.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_jbFirstActionPerformed

    private void jbPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPreviousActionPerformed
        try {
            if (rs.previous()) {
                cargarDatos(rs);
            }else{
             JOptionPane.showMessageDialog(null,"No quedan más registros");   
            }
        } catch (SQLException ex) {
            System.getLogger(jfPrincipal.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_jbPreviousActionPerformed

    private void jbNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNextActionPerformed
        try {
            if (rs.next()) {
                cargarDatos(rs);
            }else{
             JOptionPane.showMessageDialog(null,"No quedan más registros");   
            }
        } catch (SQLException ex) {
            System.getLogger(jfPrincipal.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_jbNextActionPerformed

    private void jbLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLastActionPerformed
        try {
            rs.last();
            cargarDatos(rs);
        } catch (SQLException ex) {
            System.getLogger(jfPrincipal.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_jbLastActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInsertarActionPerformed
        insertarDatos(jtfNombre.getText(),jtfApellidos.getText(),jtfDireccion.getText(),jtfPoblacion.getText());
        
    }//GEN-LAST:event_jbInsertarActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        actualizarDatos(jtfNombre.getText(), jtfApellidos.getText(), jtfDireccion.getText(), jtfPoblacion.getText());
        
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        eliminarDatos(jlId2.getText());
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbSalirActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> new jfPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbFirst;
    private javax.swing.JButton jbInsertar;
    private javax.swing.JButton jbLast;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbNext;
    private javax.swing.JButton jbPrevious;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlApellidos;
    private javax.swing.JLabel jlDireccion;
    private javax.swing.JLabel jlId;
    private javax.swing.JLabel jlId2;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlPoblacion;
    private javax.swing.JTextField jtfApellidos;
    private javax.swing.JTextField jtfDireccion;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfPoblacion;
    // End of variables declaration//GEN-END:variables
}
