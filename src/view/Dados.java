/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Aluno;

/**
 *
 * @author alunocmc
 */
public class Dados extends javax.swing.JFrame {

    /**
     * Creates new form Atualizar
     */
    public Dados() {
        initComponents();
    }

    public void exibir(Aluno a) {
        lbl_nome.setText(a.getNome());
        lbl_SNome.setText(a.getSnome());
        lbl_da.setText(a.getData());
        lbl_rgm.setText(a.getRGM());
        lbl_s.setText(a.getSexo());
        lbl_curso.setText(a.getCurso());
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_nome = new javax.swing.JLabel();
        lbl_SNome = new javax.swing.JLabel();
        lbl_da = new javax.swing.JLabel();
        lbl_s = new javax.swing.JLabel();
        lbl_rgm = new javax.swing.JLabel();
        lbl_curso = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setSize(new java.awt.Dimension(800, 800));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Nome");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 10, 410, 90);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setText("Sobrenome");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(470, 10, 480, 90);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setText("Sexo");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(490, 210, 230, 90);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel4.setText("Data de Aniversario ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 210, 490, 90);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel5.setText("Curso");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(470, 380, 380, 100);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel6.setText("RGM");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 380, 410, 100);

        lbl_nome.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_nome.setText("jLabel7");
        getContentPane().add(lbl_nome);
        lbl_nome.setBounds(20, 70, 420, 90);

        lbl_SNome.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_SNome.setText("jLabel8");
        getContentPane().add(lbl_SNome);
        lbl_SNome.setBounds(470, 70, 450, 90);

        lbl_da.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_da.setText("jLabel9");
        getContentPane().add(lbl_da);
        lbl_da.setBounds(20, 270, 510, 90);

        lbl_s.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_s.setText("jLabel10");
        getContentPane().add(lbl_s);
        lbl_s.setBounds(480, 270, 530, 90);

        lbl_rgm.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_rgm.setText("jLabel11");
        getContentPane().add(lbl_rgm);
        lbl_rgm.setBounds(0, 450, 430, 100);

        lbl_curso.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_curso.setText("jLabel12");
        getContentPane().add(lbl_curso);
        lbl_curso.setBounds(470, 450, 730, 100);

        jLabel7.setText("________________________________________________________________________________________________________________________________");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, -20, 790, 90);

        jLabel8.setText("________________________________________________________________________________________________________________________________");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, -36, 790, 110);

        jLabel9.setText("________________________________________________________________________________________________________________________________");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 90, 790, 110);

        jLabel10.setText("________________________________________________________________________________________________________________________________");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 20, 790, 110);

        jLabel11.setText("________________________________________________________________________________________________________________________________");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 170, 790, 110);

        jLabel12.setText("________________________________________________________________________________________________________________________________");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, 230, 790, 110);

        jLabel13.setText("________________________________________________________________________________________________________________________________");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(0, 290, 790, 110);

        jLabel14.setText("________________________________________________________________________________________________________________________________");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(0, 340, 790, 110);

        jLabel15.setText("________________________________________________________________________________________________________________________________");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(0, 400, 790, 110);

        jLabel16.setText("________________________________________________________________________________________________________________________________");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(0, 470, 790, 110);

        jLabel17.setText("________________________________________________________________________________________________________________________________");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(0, 480, 790, 110);

        jLabel18.setText("________________________________________________________________________________________________________________________________");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(0, 330, 790, 110);

        jLabel19.setText("________________________________________________________________________________________________________________________________");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(0, 300, 790, 110);

        jLabel20.setText("________________________________________________________________________________________________________________________________");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(0, 160, 790, 110);

        jLabel21.setText("________________________________________________________________________________________________________________________________");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(10, 100, 790, 110);

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
            java.util.logging.Logger.getLogger(Dados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbl_SNome;
    private javax.swing.JLabel lbl_curso;
    private javax.swing.JLabel lbl_da;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_rgm;
    private javax.swing.JLabel lbl_s;
    // End of variables declaration//GEN-END:variables
}
