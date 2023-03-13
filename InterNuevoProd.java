package GUI;

import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

 /**
 *
 * @author jonat
 */
public class InterNuevoProd extends javax.swing.JInternalFrame {
    
    int obtenerIDCateg=0;
    
    //Declaration de Variables                      
    private javax.swing.JComboBox<String> ComboBoxCategoria,ComboBoxIVA;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel lblCantidad, lblCategoria, lblDescripcion, lblIVA, lblNombre, lblPrecio, lblTitulo_NuevoP;
    private javax.swing.JTextField txtCantidad, txtDescripcion, txtNombre, txtPrecio;    

    public InterNuevoProd() {
        Componentes();
        ajustesventana();
        CargarCategorias();
    }
                        
    private void Componentes() {

        lblTitulo_NuevoP = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblIVA = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        ComboBoxIVA = new javax.swing.JComboBox<>();
        ComboBoxCategoria = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Nuevo Producto");

        lblTitulo_NuevoP.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        lblTitulo_NuevoP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo_NuevoP.setText("Nuevo Producto");

        lblNombre.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNombre.setText("Nombre:");

        lblCantidad.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        lblCantidad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCantidad.setText("Cantidad:");

        lblPrecio.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        lblPrecio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPrecio.setText("Precio:");

        lblDescripcion.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        lblDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDescripcion.setText("Descripcion:");

        lblIVA.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        lblIVA.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblIVA.setText("IVA:");

        lblCategoria.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        lblCategoria.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCategoria.setText("Categoria:");

        txtNombre.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        
        txtCantidad.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        
        txtDescripcion.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        
        txtPrecio.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N

        ComboBoxIVA.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        ComboBoxIVA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione IVA:", "Sin IVA", "13%", "16%", " " }));
        
        ComboBoxCategoria.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        ComboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione categoria:", " " }));

        btnGuardar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(lblTitulo_NuevoP))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCategoria)
                            .addComponent(lblNombre)
                            .addComponent(lblCantidad)
                            .addComponent(lblPrecio)
                            .addComponent(lblIVA)
                            .addComponent(lblDescripcion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDescripcion)
                            .addComponent(txtPrecio)
                            .addComponent(txtCantidad)
                            .addComponent(txtNombre)
                            .addComponent(ComboBoxIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo_NuevoP)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblCantidad))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPrecio)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescripcion)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIVA)
                    .addComponent(ComboBoxIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoria)
                    .addComponent(ComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addGap(35, 35, 35))
        );

        pack();
    }                                                                

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        Clases.Producto producto = new Clases.Producto();
        Gestion.Ctrl_Producto controlP = new Gestion.Ctrl_Producto();
        String iva = "";
        String categoria = "";
        iva = ComboBoxIVA.getSelectedItem().toString().trim();
        categoria = ComboBoxCategoria.getSelectedItem().toString().trim();

        //validar los campos
        if (txtNombre.getText().equals("") || txtCantidad.getText().equals("") || txtPrecio.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Complete todo los campos");
            txtNombre.setBackground(Color.red);
            txtCantidad.setBackground(Color.red);
            txtPrecio.setBackground(Color.red);
        } else {
            //Consulta para ver si el producto ya existe
            if (!controlP.existeProducto(txtNombre.getText().trim())) {
                if (iva.equalsIgnoreCase("Seleccione iva:")) {
                    JOptionPane.showMessageDialog(null, "Seleccione iva");
                } else {
                    if (categoria.equalsIgnoreCase("Seleccione categoria:")) {
                        JOptionPane.showMessageDialog(null, "Seleccione categoria");
                    } else {
                        try {

                            producto.setNombre(txtNombre.getText().trim());
                            producto.setCantidad(Integer.parseInt(txtCantidad.getText().trim()));
                            String precioTXT = "";
                            float Precio = 0.0f;
                            precioTXT = txtPrecio.getText().trim();
                            boolean aux = false;
                            //Si el usuario ingresa , (coma) como punto decimal,
                            //lo transformamos a punto(.)
                            for (int i = 0; i < precioTXT.length(); i++) {
                                if (precioTXT.charAt(i) == ',') {
                                    String precioNuevo = precioTXT.replace(",", ".");
                                    Precio = Float.parseFloat(precioNuevo);
                                    aux = true;
                                }
                            }
                            //evaluar la condicion
                            if (aux == true) {
                                producto.setPrecio(Precio);
                            } else {
                                Precio = Float.parseFloat(precioTXT);
                                producto.setPrecio(Precio);
                            }
                            producto.setDescripcion(txtDescripcion.getText().trim());
                            //Porcentaje IVA
                            if (iva.equalsIgnoreCase("No tiene iva")) {
                                producto.setPorcentajeIva(0);
                            } else if (iva.equalsIgnoreCase("13%")) {
                                producto.setPorcentajeIva(14);
                            } else if (iva.equalsIgnoreCase("16%")) {
                                producto.setPorcentajeIva(16);
                            }

                            //idCategoria - cargar metodo que obtiene la id de categoria
                            IdCategoria();
                            producto.setIdCategoria(obtenerIDCateg);
                            producto.setEstado(1); // estado activo

                            if (controlP.guardar(producto)) {
                                JOptionPane.showMessageDialog(null, "Registro Guardado");
                                txtNombre.setBackground(Color.green);
                                txtCantidad.setBackground(Color.green);
                                txtPrecio.setBackground(Color.green);
                                
                                this.CargarCategorias();
                                this.ComboBoxIVA.setSelectedItem("Seleccione iva:");
                                this.Limpiar();
                            } else {
                                JOptionPane.showMessageDialog(null, "Error al guardar");
                            }

                        } catch (HeadlessException | NumberFormatException e) {
                            System.out.println("Error en: " + e);
                        }
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "El producto ya existe en la BD");
            }

        }
    }                                          

     private void ajustesventana(){
         setSize(new java.awt.Dimension(500,400));
         setTitle("Nuevo Producto");
     }
                 
    //Metodo para cargar categoria:
     private void CargarCategorias(){
         java.sql.Connection cn = (java.sql.Connection) Conector.Conexion.conectar();
        String sql = "select * from tb_categoria";
        java.sql.Statement st;

        try {
            st = (java.sql.Statement) cn.createStatement();
            java.sql.ResultSet rs = st.executeQuery(sql);
            ComboBoxCategoria.removeAllItems();
            ComboBoxCategoria.addItem("Seleccione categoria");
            while (rs.next()) {
                ComboBoxCategoria.addItem(rs.getString("descripcion"));
            }
            cn.close();

        } catch (java.sql.SQLException e) {
            System.out.println("Error al cargar categorias: " + e);
        }
     }
     
      //Metodo para limpiar campos
    private void Limpiar() {
        txtNombre.setText("");
        txtCantidad.setText("");
        txtPrecio.setText("");
        txtDescripcion.setText("");
    }
    
    //Metodo para obtener id categoria
    private int IdCategoria() {
        String sql = "select * from tb_categoria where descripcion = '" + this.ComboBoxCategoria.getSelectedItem() + "'";
        Statement st;
        try {

            Connection cn = (Connection) Conector.Conexion.conectar();
            st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                obtenerIDCateg = rs.getInt("idCategoria");
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener id categoria " + e);
        }

        return obtenerIDCateg;
    }
}
