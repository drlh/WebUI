/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author PR050736
 */
public class MainFrame extends javax.swing.JFrame {

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
        jBtnGroup_Tools = new javax.swing.ButtonGroup();
        jPan_EditTools = new javax.swing.JPanel();
        jTBtn_Circle = new javax.swing.JToggleButton();
        jTBtn_Drag = new javax.swing.JToggleButton();
        jTBtn_Square = new javax.swing.JToggleButton();
        jTBtn_Ellipse = new javax.swing.JToggleButton();
        jTBtn_Text = new javax.swing.JToggleButton();
        jTBtn_Quadrat = new javax.swing.JToggleButton();
        jBtn_ColorChooser = new javax.swing.JButton();
        jTBtn_Polygon = new javax.swing.JToggleButton();
        jTBtn_Img = new javax.swing.JToggleButton();
        jScrollPane_ObjectList = new javax.swing.JScrollPane();
        jList_Objects = new javax.swing.JList();
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
        setMinimumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(500, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPan_EditTools.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tools", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(102, 102, 102)));
        jPan_EditTools.setMinimumSize(new java.awt.Dimension(130, 10));
        jPan_EditTools.setName(""); // NOI18N
        jPan_EditTools.setPreferredSize(new java.awt.Dimension(130, 100));

        jBtnGroup_Tools.add(jTBtn_Circle);
        jTBtn_Circle.setToolTipText("Kreis");
        jTBtn_Circle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jBtnGroup_Tools.add(jTBtn_Drag);
        jTBtn_Drag.setSelected(true);
        jTBtn_Drag.setToolTipText("Verschieben");
        jTBtn_Drag.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTBtn_Drag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBtn_DragActionPerformed(evt);
            }
        });

        jBtnGroup_Tools.add(jTBtn_Square);
        jTBtn_Square.setToolTipText("Rechteck");
        jTBtn_Square.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTBtn_Square.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBtn_SquareActionPerformed(evt);
            }
        });

        jBtnGroup_Tools.add(jTBtn_Ellipse);
        jTBtn_Ellipse.setToolTipText("Ellipse");
        jTBtn_Ellipse.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jBtnGroup_Tools.add(jTBtn_Text);
        jTBtn_Text.setToolTipText("Text");
        jTBtn_Text.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jBtnGroup_Tools.add(jTBtn_Quadrat);
        jTBtn_Quadrat.setToolTipText("Quadrat");
        jTBtn_Quadrat.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jBtn_ColorChooser.setBackground(new java.awt.Color(255, 255, 255));
        jBtn_ColorChooser.setText("Farbe");
        jBtn_ColorChooser.setToolTipText("Klicken um eine andere Farbe zu wählen");
        jBtn_ColorChooser.setRolloverEnabled(false);
        jBtn_ColorChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_ColorChooserActionPerformed(evt);
            }
        });

        jBtnGroup_Tools.add(jTBtn_Polygon);
        jTBtn_Polygon.setToolTipText("Polygon");
        jTBtn_Polygon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jBtnGroup_Tools.add(jTBtn_Img);
        jTBtn_Img.setToolTipText("Bild");
        jTBtn_Img.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jList_Objects.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane_ObjectList.setViewportView(jList_Objects);

        javax.swing.GroupLayout jPan_EditToolsLayout = new javax.swing.GroupLayout(jPan_EditTools);
        jPan_EditTools.setLayout(jPan_EditToolsLayout);
        jPan_EditToolsLayout.setHorizontalGroup(
            jPan_EditToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPan_EditToolsLayout.createSequentialGroup()
                .addGroup(jPan_EditToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPan_EditToolsLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPan_EditToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPan_EditToolsLayout.createSequentialGroup()
                                .addComponent(jTBtn_Drag, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jTBtn_Square, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTBtn_Quadrat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPan_EditToolsLayout.createSequentialGroup()
                                .addGroup(jPan_EditToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTBtn_Img, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTBtn_Circle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPan_EditToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTBtn_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPan_EditToolsLayout.createSequentialGroup()
                                        .addComponent(jTBtn_Ellipse, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTBtn_Polygon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jBtn_ColorChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane_ObjectList, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4))
        );
        jPan_EditToolsLayout.setVerticalGroup(
            jPan_EditToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPan_EditToolsLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPan_EditToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPan_EditToolsLayout.createSequentialGroup()
                        .addGroup(jPan_EditToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTBtn_Drag, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTBtn_Square, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTBtn_Quadrat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPan_EditToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTBtn_Circle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTBtn_Ellipse, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTBtn_Polygon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPan_EditToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTBtn_Img, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTBtn_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jBtn_ColorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane_ObjectList, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE))
        );

        getContentPane().add(jPan_EditTools, java.awt.BorderLayout.LINE_START);
        getContentPane().add(jTabPane_ImageMaps, java.awt.BorderLayout.CENTER);

        jToolBar_Maintools.setRollover(true);

        jBtn_New.setText("Neu");
        jBtn_New.setFocusable(false);
        jBtn_New.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtn_New.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtn_New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_NewActionPerformed(evt);
            }
        });
        jToolBar_Maintools.add(jBtn_New);

        jBtn_Open.setText("Öffnen...");
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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        createNewEmptyMap();
    }//GEN-LAST:event_formWindowOpened

    private void jTBtn_DragActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBtn_DragActionPerformed
        int sel = jTabPane_ImageMaps.getSelectedIndex();
        imageMaps.get(sel).setTool(ImageMapPanel.ARROW_TOOL);
    }//GEN-LAST:event_jTBtn_DragActionPerformed

    private void jTBtn_SquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBtn_SquareActionPerformed
        int sel = jTabPane_ImageMaps.getSelectedIndex();
        imageMaps.get(sel).setTool(ImageMapPanel.SQUARE_TOOL);
    }//GEN-LAST:event_jTBtn_SquareActionPerformed

    private void jBtn_NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_NewActionPerformed
        createNewEmptyMap();
    }//GEN-LAST:event_jBtn_NewActionPerformed

    private void jBtn_ColorChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_ColorChooserActionPerformed
        jCC_ChooseObjectColor.show();
        int sel = jTabPane_ImageMaps.getSelectedIndex();
        Color c = jCC_ChooseObjectColor.showDialog(this, "Farbauswahl", imageMaps.get(sel).getColor());
        imageMaps.get(sel).setColor(c);
        jBtn_ColorChooser.setBackground(c);
    }//GEN-LAST:event_jBtn_ColorChooserActionPerformed

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
    private javax.swing.ButtonGroup jBtnGroup_Tools;
    private javax.swing.JButton jBtn_ColorChooser;
    private javax.swing.JButton jBtn_New;
    private javax.swing.JButton jBtn_Open;
    private javax.swing.JButton jBtn_Save;
    private javax.swing.JButton jBtn_SaveAs;
    private javax.swing.JColorChooser jCC_ChooseObjectColor;
    private javax.swing.JList jList_Objects;
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
    private javax.swing.JScrollPane jScrollPane_ObjectList;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToggleButton jTBtn_Circle;
    private javax.swing.JToggleButton jTBtn_Drag;
    private javax.swing.JToggleButton jTBtn_Ellipse;
    private javax.swing.JToggleButton jTBtn_Img;
    private javax.swing.JToggleButton jTBtn_Polygon;
    private javax.swing.JToggleButton jTBtn_Quadrat;
    private javax.swing.JToggleButton jTBtn_Square;
    private javax.swing.JToggleButton jTBtn_Text;
    private javax.swing.JTabbedPane jTabPane_ImageMaps;
    private javax.swing.JToolBar jToolBar_Maintools;
    // End of variables declaration//GEN-END:variables

    private ArrayList<ImageMapPanel> imageMaps = new ArrayList<ImageMapPanel>();

    private void createNewEmptyMap() {
        int count = jTabPane_ImageMaps.getTabCount();
        if (count <= 0) {
            imageMaps.add(new ImageMapPanel(this));
            jTabPane_ImageMaps.add("Neue Image Map 1", imageMaps.get(0));
        } else {
            imageMaps.add(new ImageMapPanel(this));
            jTabPane_ImageMaps.addTab("Neue Image Map " + (count + 1), imageMaps.get(count));
        }
    }
}
