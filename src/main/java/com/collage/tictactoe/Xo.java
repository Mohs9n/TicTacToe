/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.collage.tictactoe;

import java.util.Arrays;
import javax.swing.JLabel;

/**
 *
 * @author mohse
 */
public class Xo extends javax.swing.JFrame {

    /**
     * Creates new form Xo
     */
    public Xo() {
        initComponents();
        initTiles(tiles);
        state=0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        B1 = new javax.swing.JLabel();
        B2 = new javax.swing.JLabel();
        B3 = new javax.swing.JLabel();
        B4 = new javax.swing.JLabel();
        B5 = new javax.swing.JLabel();
        B6 = new javax.swing.JLabel();
        B7 = new javax.swing.JLabel();
        B8 = new javax.swing.JLabel();
        B9 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        stateLabel = new javax.swing.JLabel();
        printState = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        B1.setBackground(new java.awt.Color(255, 255, 255));
        B1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        B1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        B1.setName("1");
        B1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B1MouseClicked(evt);
            }
        });

        B2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        B2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        B2.setName("2");
        B2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B2MouseClicked(evt);
            }
        });

        B3.setBackground(new java.awt.Color(255, 255, 255));
        B3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        B3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        B3.setName("3");
        B3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B3MouseClicked(evt);
            }
        });

        B4.setBackground(new java.awt.Color(255, 255, 255));
        B4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        B4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        B4.setName("4");
        B4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B4MouseClicked(evt);
            }
        });

        B5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        B5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        B5.setName("5");
        B5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B5MouseClicked(evt);
            }
        });

        B6.setBackground(new java.awt.Color(255, 255, 255));
        B6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        B6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        B6.setName("6");
        B6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B6MouseClicked(evt);
            }
        });

        B7.setBackground(new java.awt.Color(255, 255, 255));
        B7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        B7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        B7.setName("7");
        B7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B7MouseClicked(evt);
            }
        });

        B8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        B8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        B8.setName("8");
        B8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B8MouseClicked(evt);
            }
        });

        B9.setBackground(new java.awt.Color(255, 255, 255));
        B9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        B9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        B9.setName("9");
        B9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B9MouseClicked(evt);
            }
        });

        reset.setText("Reset");
        reset.setFocusPainted(false);
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        stateLabel.setText("State:");

        printState.setText("X to Play");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(stateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(printState, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(146, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(reset)
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stateLabel)
                            .addComponent(printState))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(reset)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B1MouseClicked
        // TODO add your handling code here:
        placeTile(B1);
    }//GEN-LAST:event_B1MouseClicked

    private void B2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B2MouseClicked
        // TODO add your handling code here:
        placeTile(B2);
    }//GEN-LAST:event_B2MouseClicked

    private void B3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B3MouseClicked
        // TODO add your handling code here:
        placeTile(B3);
    }//GEN-LAST:event_B3MouseClicked

    private void B4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B4MouseClicked
        // TODO add your handling code here:
        placeTile(B4);
    }//GEN-LAST:event_B4MouseClicked

    private void B5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B5MouseClicked
        // TODO add your handling code here:
        placeTile(B5);
    }//GEN-LAST:event_B5MouseClicked

    private void B6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B6MouseClicked
        // TODO add your handling code here:
        placeTile(B6);
    }//GEN-LAST:event_B6MouseClicked

    private void B7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B7MouseClicked
        // TODO add your handling code here:
        placeTile(B7);
    }//GEN-LAST:event_B7MouseClicked

    private void B8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B8MouseClicked
        // TODO add your handling code here:
        placeTile(B8);
    }//GEN-LAST:event_B8MouseClicked

    private void B9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B9MouseClicked
        // TODO add your handling code here:
        placeTile(B9);
    }//GEN-LAST:event_B9MouseClicked

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        printTiles();
        this.dispose();
        new Xo().setVisible(true);
        
    }//GEN-LAST:event_resetActionPerformed

    private static void printTiles() {
        for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 3; j++) {
               System.out.println("["+i+","+j+"]"+": "+tiles[i][j]);
        }
    }
}
    /**
     * @param args the command line arguments
     */
    
    public static void placeTile(JLabel label)
    {
        String placedSymbol = label.getText();
        int [] tile = getTile(Integer.parseInt(label.getName()));
        System.out.println(Arrays.toString(tile));
        
        if (2==state) {
            return;
        } else {
            if (state==0 && "".equals(placedSymbol)) {
                label.setText("X");
                tiles[tile[0]][tile[1]] = State.X;
                printState.setText("O to Play");
                state=1;
                determineState();
            } else if (state==1 && "".equals(placedSymbol))  {
                label.setText("O");
                tiles[tile[0]][tile[1]] = State.O;
                printState.setText("X to Play");
                state=0;
                determineState();
            }
        }
        int labelNumber = Integer.parseInt(label.getName());
        System.out.println(labelNumber);
    }
    
    static void determineState() {
        String x = winX();
        String o = winO();
        
        if (x.equals("X")) {
            printState.setText("X Wins!");
            state =2;
        } else if (o.equals("O")) {
            printState.setText("O Wins!");
            state =2;
        } else if (!stillEmpty()) {
            printState.setText("Draw!");
            state =2;
        }
    }
    
    //Don't Open!!! Garbage!!!
    private static String winX() {
        if (tiles[0][0]==State.X&&
            tiles[0][1]==State.X&&
            tiles[0][2]==State.X) {
            return "X";
        }
        if (tiles[1][0]==State.X&&
            tiles[1][1]==State.X&&
            tiles[1][2]==State.X) {
            return "X";
        }
        if (tiles[2][0]==State.X&&
            tiles[2][1]==State.X&&
            tiles[2][2]==State.X) {
            return "X";
        }
        if (tiles[0][0]==State.X&&
            tiles[1][0]==State.X&&
            tiles[2][0]==State.X) {
            return "X";
        }
        if (tiles[0][1]==State.X&&
            tiles[1][1]==State.X&&
            tiles[2][1]==State.X) {
            return "X";
        }
        if (tiles[0][2]==State.X&&
            tiles[1][2]==State.X&&
            tiles[2][2]==State.X) {
            return "X";
        }
        if (tiles[0][0]==State.X&&
            tiles[1][1]==State.X&&
            tiles[2][2]==State.X) {
            return "X";
        }
        if (tiles[0][2]==State.X&&
            tiles[1][1]==State.X&&
            tiles[2][0]==State.X) {
            return "X";
        }
        return "notX";
    }
    private static String winO() {
        if (tiles[0][0]==State.O&&
            tiles[0][1]==State.O&&
            tiles[0][2]==State.O) {
            return "O";
        }
        if (tiles[1][0]==State.O&&
            tiles[1][1]==State.O&&
            tiles[1][2]==State.O) {
            return "O";
        }
        if (tiles[2][0]==State.O&&
            tiles[2][1]==State.O&&
            tiles[2][2]==State.O) {
            return "O";
        }
        if (tiles[0][0]==State.O&&
            tiles[1][0]==State.O&&
            tiles[2][0]==State.O) {
            return "O";
        }
        if (tiles[0][1]==State.O&&
            tiles[1][1]==State.O&&
            tiles[2][1]==State.O) {
            return "O";
        }
        if (tiles[0][2]==State.O&&
            tiles[1][2]==State.O&&
            tiles[2][2]==State.O) {
            return "O";
        }
        if (tiles[0][0]==State.O&&
            tiles[1][1]==State.O&&
            tiles[2][2]==State.O) {
            return "O";
        }
        if (tiles[0][2]==State.O&&
            tiles[1][1]==State.O&&
            tiles[2][0]==State.O) {
            return "O";
        }
        return "notO";
    }
    
    private static boolean stillEmpty() {
        for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 3; j++) {
               if (tiles[i][j]==State.EMPTY) {
                   return true;
               }
        }
      }   
        return false;
    }
    
    private static int[] getTile(int num) {
        return switch (num) {
            case 1 -> new int [] {0,0};
            case 2 -> new int [] {0,1};
            case 3 -> new int [] {0,2};
            case 4 -> new int [] {1,0};
            case 5 -> new int [] {1,1};
            case 6 -> new int [] {1,2};
            case 7 -> new int [] {2,0};
            case 8 -> new int [] {2,1};
            case 9 -> new int [] {2,2};
            default -> new int [] {0,0};
        };
    }
    private static void initTiles(State[][] t) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                t[i][j]=State.EMPTY;
            }
        }
    }
    
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
            java.util.logging.Logger.getLogger(Xo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Xo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Xo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Xo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Xo().setVisible(true);
            }
        });
    }

    static State [][] tiles = new State [3][3];
    static int state = 0;
    // 0 -> x
    // 1 -> o
    // 2 -> gameover
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel B1;
    private javax.swing.JLabel B2;
    private javax.swing.JLabel B3;
    private javax.swing.JLabel B4;
    private javax.swing.JLabel B5;
    private javax.swing.JLabel B6;
    private javax.swing.JLabel B7;
    private javax.swing.JLabel B8;
    private javax.swing.JLabel B9;
    private static javax.swing.JLabel printState;
    private javax.swing.JButton reset;
    private javax.swing.JLabel stateLabel;
    // End of variables declaration//GEN-END:variables
}
