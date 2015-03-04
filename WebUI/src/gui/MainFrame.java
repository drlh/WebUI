/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

/**
 *
 * @author PR050736
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        jCC_ChooseObjectColor = new javax.swing.JColorChooser();
        jPan_EditTools = new javax.swing.JPanel();
        jTBtn_Circle = new javax.swing.JToggleButton();
        jTBtn_Drag = new javax.swing.JToggleButton();
        jTBtn_Square = new javax.swing.JToggleButton();
        jTBtn_Ellipse = new javax.swing.JToggleButton();
        jTBtn_Text = new javax.swing.JToggleButton();
        jTBtn_Draw = new javax.swing.JToggleButton();
        jBtn_ColorChooser = new javax.swing.JButton();
        jTabPane_ImageMaps = new javax.swing.JTabbedPane();
        jToolBar_Maintools = new javax.swing.JToolBar();
        jBtn_New = new javax.swing.JButton();
        jBtn_Open = new javax.swing.JButton();
        jBtn_Save = new javax.swing.JButton();
        jBtn_SaveAs = new javax.swing.JButton();
        jMenuBar_mainMenu = new javax.swing.JMenuBar();
        jMenu_File = new javax.swing.JMenu();
        jMenuItem_NewMap = new javax.swing.JMenuItem();
        jMenuItem_Open = new javax.swing.JMenuItem();
        jMenuItem_Save = new javax.swing.JMenuItem();
        jMenuItem_SaveAs = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_Quit = new javax.swing.JMenuItem();
        jMenu_Edit = new javax.swing.JMenu();
        jMenu_Help = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WebUI - ImageMapEditor");

        jPan_EditTools.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tools", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(102, 102, 102)));
        jPan_EditTools.setMinimumSize(new java.awt.Dimension(140, 10));
        jPan_EditTools.setName(""); // NOI18N
        jPan_EditTools.setPreferredSize(new java.awt.Dimension(140, 100));
        jPan_EditTools.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTBtn_Circle.setToolTipText("Kreis");
        jTBtn_Circle.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jPan_EditTools.add(jTBtn_Circle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 30, 30));

        jTBtn_Drag.setSelected(true);
        jTBtn_Drag.setToolTipText("Verschieben");
        jTBtn_Drag.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jPan_EditTools.add(jTBtn_Drag, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 30, 30));

        jTBtn_Square.setToolTipText("Rechteck");
        jTBtn_Square.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jPan_EditTools.add(jTBtn_Square, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 30, 30));

        jTBtn_Ellipse.setToolTipText("Ellipse");
        jTBtn_Ellipse.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jPan_EditTools.add(jTBtn_Ellipse, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 30, 30));

        jTBtn_Text.setToolTipText("Text");
        jTBtn_Text.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jPan_EditTools.add(jTBtn_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 30, 30));

        jTBtn_Draw.setToolTipText("Zeichnen");
        jTBtn_Draw.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jPan_EditTools.add(jTBtn_Draw, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 30, 30));

        jBtn_ColorChooser.setBackground(new java.awt.Color(255, 255, 255));
        jBtn_ColorChooser.setToolTipText("Klicken um eine andere Farbe zu wählen");
        jBtn_ColorChooser.setRolloverEnabled(false);
        jPan_EditTools.add(jBtn_ColorChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 30, 30));

        getContentPane().add(jPan_EditTools, java.awt.BorderLayout.LINE_START);
        getContentPane().add(jTabPane_ImageMaps, java.awt.BorderLayout.CENTER);

        jToolBar_Maintools.setRollover(true);

        jBtn_New.setText("Neue Image Map");
        jBtn_New.setFocusable(false);
        jBtn_New.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtn_New.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar_Maintools.add(jBtn_New);

        jBtn_Open.setText("Öffnen");
        jBtn_Open.setFocusable(false);
        jBtn_Open.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtn_Open.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar_Maintools.add(jBtn_Open);

        jBtn_Save.setText("Speichern");
        jBtn_Save.setFocusable(false);
        jBtn_Save.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtn_Save.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar_Maintools.add(jBtn_Save);

        jBtn_SaveAs.setText("Speichern unter");
        jBtn_SaveAs.setFocusable(false);
        jBtn_SaveAs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtn_SaveAs.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar_Maintools.add(jBtn_SaveAs);

        getContentPane().add(jToolBar_Maintools, java.awt.BorderLayout.NORTH);

        jMenu_File.setText("Datei");

        jMenuItem_NewMap.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem_NewMap.setText("Neu...");
        jMenu_File.add(jMenuItem_NewMap);

        jMenuItem_Open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem_Open.setText("Öffnen...");
        jMenu_File.add(jMenuItem_Open);

        jMenuItem_Save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem_Save.setText("Speichern");
        jMenu_File.add(jMenuItem_Save);

        jMenuItem_SaveAs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem_SaveAs.setText("Speichern unter...");
        jMenu_File.add(jMenuItem_SaveAs);
        jMenu_File.add(jSeparator1);

        jMenuItem_Quit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem_Quit.setText("Beenden");
        jMenu_File.add(jMenuItem_Quit);

        jMenuBar_mainMenu.add(jMenu_File);

        jMenu_Edit.setText("Bearbeiten");
        jMenuBar_mainMenu.add(jMenu_Edit);

        jMenu_Help.setText("Hilfe");
        jMenuBar_mainMenu.add(jMenu_Help);

        setJMenuBar(jMenuBar_mainMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_ColorChooser;
    private javax.swing.JButton jBtn_New;
    private javax.swing.JButton jBtn_Open;
    private javax.swing.JButton jBtn_Save;
    private javax.swing.JButton jBtn_SaveAs;
    private javax.swing.JColorChooser jCC_ChooseObjectColor;
    private javax.swing.JMenuBar jMenuBar_mainMenu;
    private javax.swing.JMenuItem jMenuItem_NewMap;
    private javax.swing.JMenuItem jMenuItem_Open;
    private javax.swing.JMenuItem jMenuItem_Quit;
    private javax.swing.JMenuItem jMenuItem_Save;
    private javax.swing.JMenuItem jMenuItem_SaveAs;
    private javax.swing.JMenu jMenu_Edit;
    private javax.swing.JMenu jMenu_File;
    private javax.swing.JMenu jMenu_Help;
    private javax.swing.JPanel jPan_EditTools;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToggleButton jTBtn_Circle;
    private javax.swing.JToggleButton jTBtn_Drag;
    private javax.swing.JToggleButton jTBtn_Draw;
    private javax.swing.JToggleButton jTBtn_Ellipse;
    private javax.swing.JToggleButton jTBtn_Square;
    private javax.swing.JToggleButton jTBtn_Text;
    private javax.swing.JTabbedPane jTabPane_ImageMaps;
    private javax.swing.JToolBar jToolBar_Maintools;
    // End of variables declaration//GEN-END:variables
}
