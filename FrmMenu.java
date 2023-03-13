package GUI;
/**
 *
 * @author jonat
 */
public class FrmMenu extends javax.swing.JFrame{
    
    //Declaracion de Variables                     
    private javax.swing.JMenuItem MItemAgregarProd, MItemGestProd;
    private javax.swing.JMenu MenuCategoria, MenuCliente, MenuFacturas, MenuProducto, MenuReportes, MenuUsuario, jMenu3, jMenu4, jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10, jMenuItem11, jMenuItem12, jMenuItem13, jMenuItem14, jMenuItem15,
                                  jMenuItem16, jMenuItem17, jMenuItem18, jMenuItem3, jMenuItem4, jMenuItem5, 
                                  jMenuItem6, jMenuItem7, jMenuItem8, jMenuItem9;

    public FrmMenu() {
        Componentes();
        ajustes();
    }
                      
    private void Componentes() {

        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuProducto = new javax.swing.JMenu();
        MItemAgregarProd = new javax.swing.JMenuItem();
        MItemGestProd = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        MenuCategoria = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        MenuFacturas = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        MenuReportes = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        MenuUsuario = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        MenuCliente = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();

        jMenuItem10.setText("jMenuItem10");

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MenuProducto.setText("Producto");
        MenuProducto.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        MenuProducto.setPreferredSize(new java.awt.Dimension(150, 50));

        MItemAgregarProd.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        MItemAgregarProd.setText("Agregar Producto");
        MItemAgregarProd.setPreferredSize(new java.awt.Dimension(200, 30));
        MItemAgregarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MItemAgregarProdActionPerformed(evt);
            }
        });
        MenuProducto.add(MItemAgregarProd);

        MItemGestProd.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        MItemGestProd.setText("Gestionar Productos");
        MItemGestProd.setPreferredSize(new java.awt.Dimension(200, 30));
        MenuProducto.add(MItemGestProd);

        jMenuItem3.setText("Actualizar Stock");
        jMenuItem3.setPreferredSize(new java.awt.Dimension(0, 0));
        MenuProducto.add(jMenuItem3);

        jMenuBar1.add(MenuProducto);

        MenuCategoria.setText("Categoria");
        MenuCategoria.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        MenuCategoria.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jMenuItem4.setText("Agregar Categoria");
        jMenuItem4.setPreferredSize(new java.awt.Dimension(200, 30));
        MenuCategoria.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jMenuItem5.setText("Gestionar Categorias");
        jMenuItem5.setPreferredSize(new java.awt.Dimension(200, 30));
        MenuCategoria.add(jMenuItem5);

        jMenuBar1.add(MenuCategoria);

        MenuFacturas.setText("Factura");
        MenuFacturas.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        MenuFacturas.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jMenuItem6.setText("Nueva Venta");
        jMenuItem6.setPreferredSize(new java.awt.Dimension(200, 30));
        MenuFacturas.add(jMenuItem6);

        jMenuItem7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jMenuItem7.setText("Gestionar Ventas");
        jMenuItem7.setPreferredSize(new java.awt.Dimension(200, 30));
        MenuFacturas.add(jMenuItem7);

        jMenuBar1.add(MenuFacturas);

        MenuReportes.setText("Reportes");
        MenuReportes.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        MenuReportes.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jMenuItem8.setText("Clientes");
        jMenuItem8.setPreferredSize(new java.awt.Dimension(200, 30));
        MenuReportes.add(jMenuItem8);

        jMenuItem9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jMenuItem9.setText("Categorias");
        jMenuItem9.setPreferredSize(new java.awt.Dimension(200, 30));
        MenuReportes.add(jMenuItem9);

        jMenuItem11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jMenuItem11.setText("Productos");
        jMenuItem11.setPreferredSize(new java.awt.Dimension(200, 30));
        MenuReportes.add(jMenuItem11);

        jMenuItem12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jMenuItem12.setText("Ventas");
        jMenuItem12.setPreferredSize(new java.awt.Dimension(200, 30));
        MenuReportes.add(jMenuItem12);

        jMenuBar1.add(MenuReportes);

        MenuUsuario.setText("Usuario");
        MenuUsuario.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        MenuUsuario.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jMenuItem13.setText("Agregar");
        jMenuItem13.setPreferredSize(new java.awt.Dimension(180, 30));
        
        MenuUsuario.add(jMenuItem13);

        jMenuItem14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jMenuItem14.setText("Gestionar");
        jMenuItem14.setPreferredSize(new java.awt.Dimension(180, 30));
        MenuUsuario.add(jMenuItem14);

        jMenuBar1.add(MenuUsuario);

        MenuCliente.setText("Cliente");
        MenuCliente.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        MenuCliente.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jMenuItem15.setText("Agregar Cliente");
        jMenuItem15.setPreferredSize(new java.awt.Dimension(180, 30));
        MenuCliente.add(jMenuItem15);

        jMenuItem16.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jMenuItem16.setText("Gestionar");
        jMenuItem16.setPreferredSize(new java.awt.Dimension(180, 30));
        MenuCliente.add(jMenuItem16);

        jMenuBar1.add(MenuCliente);

        jMenu4.setText("Historial");
        jMenu4.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem17.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jMenuItem17.setText("Ver Historial");
        jMenuItem17.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenu4.add(jMenuItem17);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Cerrar Sesion");
        jMenu5.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jMenu5.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem18.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jMenuItem18.setText("Cerrar Sesion");
        jMenuItem18.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenu5.add(jMenuItem18);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        pack();
    }//                      

    private void MItemAgregarProdActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
            InterNuevoProd NuevoProducto = new InterNuevoProd();
            
            NuevoProducto.setVisible(true);
    }                                                

    private void ajustes(){
        setSize(1200, 700);
        setLocationRelativeTo(null);
        setExtendedState(this.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setTitle("Sistema");
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }
}


