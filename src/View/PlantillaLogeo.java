package View;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import utilerias.TipoUsuarioEnum;

public class PlantillaLogeo extends JFrame implements ActionListener {

    private Cursor cMano;
    private JPanel panelderecho, panelizquierdo;
    private JButton bCerrar;
    private ImageIcon iCerrar, ifondo, iSvg1;
    private ImageIcon iDimAux;
    private JLabel lFondo, lSvg1;
    private JTextField TnombreUsuario;
    private Color colorPrincipal,grisoscuro;
    private Border Binferiorazul;
    private Font fontmedia;
    private JComboBox cbTipoUsuario;
    private JButton baceptar;
    public PlantillaLogeo() {
        //CARGAR FUENTE
        generarFunente();
        this.cMano = new Cursor(Cursor.HAND_CURSOR);
        //agreagr las imagenes
        iCerrar = new ImageIcon("resources/images/cerrar.png");
        ifondo = new ImageIcon("resources/images/fondo.png");
        iSvg1 = new ImageIcon("resources/images/imagen1.png");
        //colores
        colorPrincipal = new Color(60,78,120);
        grisoscuro =  new Color(80,80,80);
        //borde
        Binferiorazul = BorderFactory.createMatteBorder(0, 0, 2, 0, colorPrincipal);
        //font
        fontmedia =  new Font("LuzSans-Book",Font.PLAIN,15);
        
        //panels 
        panelizquierdo = new JPanel();
        panelizquierdo.setSize(600, 500);
        panelizquierdo.setLocation(0, 0);
        panelizquierdo.setBackground(Color.WHITE);
        panelizquierdo.setLayout(null);
        this.add(this.panelizquierdo);

        panelderecho = new JPanel();
        panelderecho.setSize(400, 500);
        panelderecho.setLocation(600, 0);
        panelderecho.setBackground(Color.WHITE);
        panelderecho.setLayout(null);
        this.add(this.panelderecho);
        
        //componentes del panel derecho 
        TnombreUsuario = new JTextField("Nombre Usuario");
        TnombreUsuario.setSize(260,40);
        TnombreUsuario.setLocation((panelderecho.getWidth()-TnombreUsuario.getWidth())/2,130);
        TnombreUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        TnombreUsuario.setForeground(colorPrincipal);
        TnombreUsuario.setBackground(Color.WHITE);
        TnombreUsuario.setCaretColor(grisoscuro);
        TnombreUsuario.setFont(fontmedia);
        TnombreUsuario.setBorder(Binferiorazul);
        panelderecho.add(TnombreUsuario);
        TnombreUsuario.addMouseListener(
                new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            
                TnombreUsuario.setText(" ");
            }
                
                }
        
        );
        //combo box
        cbTipoUsuario =  new JComboBox();
        cbTipoUsuario.addItem("Invitado");
        cbTipoUsuario.addItem("Admin");
        cbTipoUsuario.addItem("Super Admin");
        cbTipoUsuario.setSize(220,30);
        cbTipoUsuario.setLocation((panelderecho.getWidth()-cbTipoUsuario.getWidth())/2,195);
        cbTipoUsuario.setBackground(Color.WHITE);
        cbTipoUsuario.setForeground(colorPrincipal);
        ((JLabel)cbTipoUsuario.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
       panelderecho.add(cbTipoUsuario);
         //agregar boton aceptar
          this.baceptar = new JButton("aceptar");
        this.baceptar.setBounds(310, 10, 45, 30);
        this.baceptar.setBackground(Color.blue);
        this.baceptar.setForeground(Color.white);
        this.baceptar.setCursor(cMano);
        this.baceptar.addActionListener(this);
        this.baceptar.setSize(220,30);
        this.baceptar.setLocation((panelderecho.getWidth()-cbTipoUsuario.getWidth())/2,260);
        this.panelderecho.add(this.baceptar);
        //coloacar una imagen
        iDimAux = new ImageIcon(iSvg1.getImage().getScaledInstance(500, 345, Image.SCALE_AREA_AVERAGING));
        lSvg1 = new JLabel();
        lSvg1.setBounds(100, 100, 500, 345);
        lSvg1.setIcon(iDimAux);
        panelizquierdo.add(lSvg1);  
        //coloacar el fondo
        iDimAux = new ImageIcon(ifondo.getImage().getScaledInstance(600, 600, Image.SCALE_AREA_AVERAGING));
        lFondo = new JLabel();
        lFondo.setBounds(0, 0, 600, 600);
        lFondo.setIcon(iDimAux);
        panelizquierdo.add(lFondo);
        
        //configurar botones
        this.bCerrar = new JButton("X");
        this.bCerrar.setBounds(350, 10, 65, 40);
        this.bCerrar.setBackground(Color.blue);
        this.bCerrar.setForeground(Color.white);
        this.bCerrar.setCursor(cMano);
        this.bCerrar.addActionListener(this);
        this.panelderecho.add(this.bCerrar);

        iDimAux = new ImageIcon(iCerrar.getImage()
                .getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING));

        this.bCerrar.setIcon(iDimAux);
        this.bCerrar.setFocusable(false);
        this.bCerrar.setBorder(null);
        this.bCerrar.setContentAreaFilled(false);
        //configurar el jframe
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1000, 500);
        this.setLocationRelativeTo(this);
        this.setLayout(null);
        this.setUndecorated(true);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
      
        if (ae.getSource() == this.getbcerrar()) {
            System.exit(0);

        }
        if (ae.getSource() == this.baceptar) {
            String tipo = this.cbTipoUsuario.getSelectedItem().toString();
            if (tipo.compareTo(TipoUsuarioEnum.ADMINISTRADOR.getValue())==0) {
                System.err.println("Usuario de tipo Admin");
            }
        if (tipo.compareTo(TipoUsuarioEnum.INVITADO.getValue())==0) {
                System.err.println("Usuario de tipo Invitado");
        } 
                if (tipo.compareTo(TipoUsuarioEnum.NORMAL.getValue())==0) {
                System.err.println("Usuario de tipo Usuario");
            
        }
        
        
        
    }
    }
    public JButton getbcerrar() {
        return this.bCerrar;
    }
    private void generarFunente(){
        try {
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT,new File("resources/fonts/LUZRO.TTF")));
        } catch (Exception e) {
        }
    }
}
