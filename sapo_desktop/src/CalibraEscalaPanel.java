
/*
 * CalibraEscalaPanel.java
 *
 * Created on 8 de Fevereiro de 2005, 01:06
 */

/**
 *
 * @author Edison Puig Maldonado
 */

public class CalibraEscalaPanel extends javax.swing.JPanel {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 2502209793183007957L;
	SAPO sapo;
    CalibraEscalaXPanel jpCalEscalaX;
    CalibraEscalaYPanel jpCalEscalaY;
    
    /** Creates new form CalibraEscalaPanel */
    public CalibraEscalaPanel(SAPO sapo) {
        this.sapo = sapo;
        jpCalEscalaX = new CalibraEscalaXPanel(sapo);
        jpCalEscalaY = new CalibraEscalaYPanel(sapo);
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jpCalEscala = new javax.swing.JPanel();
        jtxtPanelEscala = new javax.swing.JTextPane();
        jPanel3 = new javax.swing.JPanel();
        jbCEX = new javax.swing.JButton();
        jbCEY = new javax.swing.JButton();
        jbCEOk = new javax.swing.JButton();
        jbCEAjuda = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jpCalEscala.setLayout(new java.awt.GridBagLayout());

        jpCalEscala.setMaximumSize(new java.awt.Dimension(2147483647, 250));
        jpCalEscala.setMinimumSize(new java.awt.Dimension(11, 36));
        jpCalEscala.setPreferredSize(new java.awt.Dimension(150, 250));
        jtxtPanelEscala.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        jtxtPanelEscala.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12));
        jtxtPanelEscala.setText("Define escala\npara  os eixos\nX  e  Y  desta\nimagem SAPO");
        jtxtPanelEscala.setToolTipText("Define escala para os eixos X e Y desta imagem, conforme unidades em Dados -> Prefer\u00eancias");
        jtxtPanelEscala.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jtxtPanelEscala.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jpCalEscala.add(jtxtPanelEscala, gridBagConstraints);

        jPanel3.setPreferredSize(new java.awt.Dimension(10, 45));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jpCalEscala.add(jPanel3, gridBagConstraints);

        jbCEX.setFont(new java.awt.Font("MS Sans Serif", 0, 12));
        jbCEX.setText("eixo-X");
        jbCEX.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbCEX.setMargin(new java.awt.Insets(0, 7, 0, 7));
        jbCEX.setMaximumSize(new java.awt.Dimension(72, 23));
        jbCEX.setMinimumSize(new java.awt.Dimension(72, 23));
        jbCEX.setPreferredSize(new java.awt.Dimension(72, 23));
        jbCEX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCEXActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.insets = new java.awt.Insets(3, 6, 3, 6);
        jpCalEscala.add(jbCEX, gridBagConstraints);

        jbCEY.setFont(new java.awt.Font("MS Sans Serif", 0, 12));
        jbCEY.setText("eixo-Y");
        jbCEY.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbCEY.setMargin(new java.awt.Insets(0, 7, 0, 7));
        jbCEY.setMaximumSize(new java.awt.Dimension(72, 23));
        jbCEY.setMinimumSize(new java.awt.Dimension(72, 23));
        jbCEY.setPreferredSize(new java.awt.Dimension(72, 23));
        jbCEY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCEYActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.insets = new java.awt.Insets(3, 6, 3, 6);
        jpCalEscala.add(jbCEY, gridBagConstraints);

        jbCEOk.setFont(new java.awt.Font("MS Sans Serif", 0, 12));
        jbCEOk.setText("Sair");
        jbCEOk.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbCEOk.setMargin(new java.awt.Insets(0, 7, 0, 7));
        jbCEOk.setMaximumSize(new java.awt.Dimension(72, 23));
        jbCEOk.setMinimumSize(new java.awt.Dimension(72, 23));
        jbCEOk.setPreferredSize(new java.awt.Dimension(72, 23));
        jbCEOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCEOkActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.insets = new java.awt.Insets(3, 6, 3, 6);
        jpCalEscala.add(jbCEOk, gridBagConstraints);

        jbCEAjuda.setFont(new java.awt.Font("MS Sans Serif", 0, 12));
        jbCEAjuda.setText("Ajuda");
        jbCEAjuda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbCEAjuda.setMargin(new java.awt.Insets(0, 7, 0, 7));
        jbCEAjuda.setMaximumSize(new java.awt.Dimension(72, 23));
        jbCEAjuda.setMinimumSize(new java.awt.Dimension(72, 23));
        jbCEAjuda.setPreferredSize(new java.awt.Dimension(72, 23));
        jbCEAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCEAjudaActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.insets = new java.awt.Insets(3, 6, 3, 6);
        jpCalEscala.add(jbCEAjuda, gridBagConstraints);

        add(jpCalEscala, java.awt.BorderLayout.CENTER);

    }
    // </editor-fold>//GEN-END:initComponents

    private void jbCEAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCEAjudaActionPerformed
        
    }//GEN-LAST:event_jbCEAjudaActionPerformed

    private void jbCEOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCEOkActionPerformed
        sapo.restauraZoom();
        sapo.restauraInternalFrameOriginal();
    }//GEN-LAST:event_jbCEOkActionPerformed

    private void jbCEYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCEYActionPerformed
        jpCalEscalaY.limpar();
        sapo.inserePainelEmInternalFrame(jpCalEscalaY, "WEST");
        sapo.calEscY.acoplar(sapo.numImg);
        sapo.jif[sapo.numImg].jaiP.setPaint(true, false, false, false);
    }//GEN-LAST:event_jbCEYActionPerformed

    private void jbCEXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCEXActionPerformed
        jpCalEscalaX.limpar();
        sapo.inserePainelEmInternalFrame(jpCalEscalaX, "WEST");
        sapo.calEscX.acoplar(sapo.numImg);
        sapo.jif[sapo.numImg].jaiP.setPaint(true, false, false, false);
    }//GEN-LAST:event_jbCEXActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbCEAjuda;
    private javax.swing.JButton jbCEOk;
    private javax.swing.JButton jbCEX;
    private javax.swing.JButton jbCEY;
    private javax.swing.JPanel jpCalEscala;
    private javax.swing.JTextPane jtxtPanelEscala;
    // End of variables declaration//GEN-END:variables
    
}
