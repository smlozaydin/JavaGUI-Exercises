/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab9;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.JToggleButton;

/**
 *
 * @author Bilal
 */
public class frm_quest1 extends javax.swing.JFrame {

    Point mouseStart;
    Point mouseEnd;
    boolean mouseDragged;
    Color color = Color.BLACK;
    int thickness = 1;
    ArrayList<Shape> list = new ArrayList<Shape>();
    Shape yshape = null;

    public frm_quest1() {
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

        jSplitPane1 = new javax.swing.JSplitPane();
        pnl_area = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                for(Shape shape : list){
                    shape.Draw(g);
                }
            }
        };
        ;
        jPanel2 = new javax.swing.JPanel();
        tbar_tools = new javax.swing.JToolBar();
        tbtn_line = new javax.swing.JToggleButton();
        tbtn_circle = new javax.swing.JToggleButton();
        tbtn_rectangle = new javax.swing.JToggleButton();
        txt_text = new javax.swing.JTextField();
        tbtn_text = new javax.swing.JToggleButton();
        cmbx_color = new javax.swing.JComboBox<>();
        spnr_thickness = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(904, 511));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jSplitPane1.setDividerLocation(50);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        pnl_area.setBackground(new java.awt.Color(255, 255, 255));
        pnl_area.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnl_areaMouseDragged(evt);
            }
        });
        pnl_area.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnl_areaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnl_areaMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnl_areaLayout = new javax.swing.GroupLayout(pnl_area);
        pnl_area.setLayout(pnl_areaLayout);
        pnl_areaLayout.setHorizontalGroup(
            pnl_areaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        pnl_areaLayout.setVerticalGroup(
            pnl_areaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 455, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(pnl_area);

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        tbar_tools.setRollover(true);

        tbtn_line.setText("Line");
        tbtn_line.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbtn_line.setFocusable(false);
        tbtn_line.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbtn_line.setMinimumSize(new java.awt.Dimension(100, 50));
        tbtn_line.setPreferredSize(new java.awt.Dimension(100, 50));
        tbtn_line.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbtn_line.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_lineActionPerformed(evt);
            }
        });
        tbar_tools.add(tbtn_line);

        tbtn_circle.setText("Circle");
        tbtn_circle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbtn_circle.setFocusable(false);
        tbtn_circle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbtn_circle.setMinimumSize(new java.awt.Dimension(100, 50));
        tbtn_circle.setPreferredSize(new java.awt.Dimension(100, 50));
        tbtn_circle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbtn_circle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_circleActionPerformed(evt);
            }
        });
        tbar_tools.add(tbtn_circle);

        tbtn_rectangle.setText("Rectangle");
        tbtn_rectangle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbtn_rectangle.setFocusable(false);
        tbtn_rectangle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbtn_rectangle.setMinimumSize(new java.awt.Dimension(100, 50));
        tbtn_rectangle.setPreferredSize(new java.awt.Dimension(100, 50));
        tbtn_rectangle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbtn_rectangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_rectangleActionPerformed(evt);
            }
        });
        tbar_tools.add(tbtn_rectangle);

        txt_text.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_text.setMinimumSize(new java.awt.Dimension(100, 50));
        txt_text.setPreferredSize(new java.awt.Dimension(100, 50));
        tbar_tools.add(txt_text);

        tbtn_text.setText("Text");
        tbtn_text.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbtn_text.setFocusable(false);
        tbtn_text.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbtn_text.setMinimumSize(new java.awt.Dimension(100, 50));
        tbtn_text.setPreferredSize(new java.awt.Dimension(100, 50));
        tbtn_text.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbtn_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_textActionPerformed(evt);
            }
        });
        tbar_tools.add(tbtn_text);

        cmbx_color.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Black", "Red", "Green", "Blue" }));
        cmbx_color.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cmbx_color.setMinimumSize(new java.awt.Dimension(100, 50));
        cmbx_color.setPreferredSize(new java.awt.Dimension(100, 50));
        cmbx_color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbx_colorActionPerformed(evt);
            }
        });
        tbar_tools.add(cmbx_color);

        spnr_thickness.setModel(new javax.swing.SpinnerNumberModel(1, 1, 15, 1));
        spnr_thickness.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        spnr_thickness.setMinimumSize(new java.awt.Dimension(100, 50));
        spnr_thickness.setPreferredSize(new java.awt.Dimension(100, 50));
        spnr_thickness.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnr_thicknessStateChanged(evt);
            }
        });
        tbar_tools.add(spnr_thickness);

        jPanel2.add(tbar_tools);

        jSplitPane1.setLeftComponent(jPanel2);

        getContentPane().add(jSplitPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbtn_lineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_lineActionPerformed
        JToggleButton tbtn = (JToggleButton) evt.getSource();
        setSelectedComponent(tbtn);
    }//GEN-LAST:event_tbtn_lineActionPerformed

    private void tbtn_circleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_circleActionPerformed
        JToggleButton tbtn = (JToggleButton) evt.getSource();
        setSelectedComponent(tbtn);        // TODO add your handling code here:
    }//GEN-LAST:event_tbtn_circleActionPerformed

    private void tbtn_rectangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_rectangleActionPerformed
        JToggleButton tbtn = (JToggleButton) evt.getSource();
        setSelectedComponent(tbtn);        // TODO add your handling code here:
    }//GEN-LAST:event_tbtn_rectangleActionPerformed

    private void tbtn_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_textActionPerformed
        JToggleButton tbtn = (JToggleButton) evt.getSource();
        setSelectedComponent(tbtn);        // TODO add your handling code here:
    }//GEN-LAST:event_tbtn_textActionPerformed


    private void pnl_areaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_areaMousePressed
        mouseStart = evt.getPoint();
        mouseDragged = false;
        yshape = null;
    }//GEN-LAST:event_pnl_areaMousePressed

    private void pnl_areaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_areaMouseReleased
//        mouseEnd = evt.getPoint();
//        if (mouseDragged) {
//            if (tbtn_line.isSelected()) {
//                SLine nshape = new SLine(mouseStart, mouseEnd, color, thickness);
//                list.add(nshape);
//            } else if (tbtn_rectangle.isSelected()) {
//                SRectangle nshape = new SRectangle(mouseStart, mouseEnd, color, thickness);
//                list.add(nshape);
//            } else if (tbtn_circle.isSelected()) {
//                SCircle nshape = new SCircle(mouseStart, mouseEnd, color, thickness);
//                list.add(nshape);
//            } else if (tbtn_text.isSelected() && !(this.txt_text.getText().isEmpty())) {
//                SText nshape = new SText(mouseStart, this.txt_text.getText(), color, thickness);
//                list.add(nshape);
//            }
//            pnl_area.repaint();
//        }
    }//GEN-LAST:event_pnl_areaMouseReleased

    private void pnl_areaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_areaMouseDragged
        mouseDragged = true;
        mouseEnd = evt.getPoint();

        if (yshape == null) {
            if (tbtn_line.isSelected()) {
                yshape = new SLine(mouseStart, mouseEnd, color, thickness);
                list.add(yshape);
            } else if (tbtn_rectangle.isSelected()) {
                yshape = new SRectangle(mouseStart, mouseEnd, color, thickness);
                list.add(yshape);
            } else if (tbtn_circle.isSelected()) {
                yshape = new SCircle(mouseStart, mouseEnd, color, thickness);
                list.add(yshape);
            } else if (tbtn_text.isSelected() && !(this.txt_text.getText().isEmpty())) {
                yshape = new SText(mouseStart, this.txt_text.getText(), color, thickness);
                list.add(yshape);
            }
        } else {
            if (tbtn_line.isSelected()) {
                SLine rshape = (SLine) yshape;
                rshape.end = mouseEnd;

            } else if (tbtn_rectangle.isSelected()) {
                SRectangle rshape = (SRectangle) yshape;
                rshape.rePosition(mouseStart,mouseEnd);
            } else if (tbtn_circle.isSelected()) {
                SCircle rshape = (SCircle) yshape;
                rshape.rePosition(mouseStart,mouseEnd);
            } else if (tbtn_text.isSelected() && !(this.txt_text.getText().isEmpty())) {
                SText rshape = (SText) yshape;
                rshape.start=mouseEnd;
            }
        }

        pnl_area.repaint();

    }//GEN-LAST:event_pnl_areaMouseDragged

    private void cmbx_colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbx_colorActionPerformed
        switch (cmbx_color.getSelectedIndex()) {
            case 0:
                color = Color.BLACK;
                break;
            case 1:
                color = Color.RED;
                break;
            case 2:
                color = Color.GREEN;
                break;
            case 3:
                color = Color.BLUE;
                break;
        }

    }//GEN-LAST:event_cmbx_colorActionPerformed

    private void spnr_thicknessStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnr_thicknessStateChanged
        thickness = (int) spnr_thickness.getValue();

    }//GEN-LAST:event_spnr_thicknessStateChanged
    public void setSelectedComponent(JToggleButton tbtn) {
        for (Component component : tbar_tools.getComponents()) {
            if (component instanceof JToggleButton) {
                if (!component.equals(tbtn)) {
                    ((JToggleButton) component).setSelected(false);
                }
            }
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
            java.util.logging.Logger.getLogger(frm_quest1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_quest1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_quest1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_quest1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_quest1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbx_color;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel pnl_area;
    private javax.swing.JSpinner spnr_thickness;
    private javax.swing.JToolBar tbar_tools;
    private javax.swing.JToggleButton tbtn_circle;
    private javax.swing.JToggleButton tbtn_line;
    private javax.swing.JToggleButton tbtn_rectangle;
    private javax.swing.JToggleButton tbtn_text;
    private javax.swing.JTextField txt_text;
    // End of variables declaration//GEN-END:variables

}
