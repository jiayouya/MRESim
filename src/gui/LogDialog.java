/*
 *     Copyright 2010, 2015 Julian de Hoog (julian@dehoog.ca), Victor Spirin (victor.spirin@cs.ox.ac.uk)
 *
 *     This file is part of MRESim 2.2, a simulator for testing the behaviour
 *     of multiple robots exploring unknown environments.
 *
 *     If you use MRESim, I would appreciate an acknowledgement and/or a citation
 *     of our papers:
 *
 *     @inproceedings{deHoog2009,
 *         title = "Role-Based Autonomous Multi-Robot Exploration",
 *         author = "Julian de Hoog, Stephen Cameron and Arnoud Visser",
 *         year = "2009",
 *         booktitle = "International Conference on Advanced Cognitive Technologies and Applications (COGNITIVE)",
 *         location = "Athens, Greece",
 *         month = "November",
 *     }
 *
 *     @incollection{spirin2015mresim,
 *       title={MRESim, a Multi-robot Exploration Simulator for the Rescue Simulation League},
 *       author={Spirin, Victor and de Hoog, Julian and Visser, Arnoud and Cameron, Stephen},
 *       booktitle={RoboCup 2014: Robot World Cup XVIII},
 *       pages={106--117},
 *       year={2015},
 *       publisher={Springer}
 *     }
 *
 *     MRESim is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     MRESim is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License along with MRESim.
 *     If not, see <http://www.gnu.org/licenses/>.
 */
package gui;

import config.SimulatorConfig;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author  julh
 */
public class LogDialog extends javax.swing.JDialog {
    
    SimulatorConfig envConfig;
    boolean logAgents;
    String logAgentsFilename;
    boolean logData;
    String logDataFilename;
    boolean logScreenshots;
    String logScreenshotsDirname;
    
    /** Creates new form CommunicationDialog */
    public LogDialog(java.awt.Frame parent, boolean modal, SimulatorConfig ec) {
        super(parent, modal);
        
        envConfig = ec;
        logAgents = envConfig.logAgents();
        logAgentsFilename = envConfig.getLogAgentFilename();
        logData = envConfig.logData();
        logDataFilename = envConfig.getLogDataFilename();
        logScreenshots = envConfig.logScreenshots();
        logScreenshotsDirname = envConfig.getLogScreenshotsDirname();
        
        initComponents();
        
        checkboxAgents.setSelected(logAgents);
        labelAgents.setText(logAgentsFilename);
        checkboxData.setSelected(logData);
        labelData.setText(logDataFilename);
        checkboxScreenshots.setSelected(logScreenshots);
        labelScreenshots.setText(logScreenshotsDirname);
        checkboxAgentsActionPerformed(null);
        checkboxDataActionPerformed(null);
        checkboxScreenshotsActionPerformed(null);
        
        // Let window X being clicked be handled by windowClosing method
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
        // center on screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (dim.width-getSize().width)/2;
        int y = (dim.height-getSize().height)/2;
        setLocation(x, y);
        
        this.addWindowListener(windowListener);
        setVisible(true);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        checkboxAgents = new javax.swing.JCheckBox();
        buttonAgents = new javax.swing.JButton();
        labelAgents = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        checkboxData = new javax.swing.JCheckBox();
        buttonData = new javax.swing.JButton();
        labelData = new javax.swing.JLabel();
        buttonCancel = new javax.swing.JButton();
        buttonOK = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        checkboxScreenshots = new javax.swing.JCheckBox();
        buttonScreenshots = new javax.swing.JButton();
        labelScreenshots = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Logs");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        checkboxAgents.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        checkboxAgents.setText("Agent Locations");
        checkboxAgents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxAgentsActionPerformed(evt);
            }
        });

        buttonAgents.setFont(new java.awt.Font("Arial", 0, 11));
        buttonAgents.setText("Change");
        buttonAgents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgentsActionPerformed(evt);
            }
        });

        labelAgents.setFont(new java.awt.Font("Arial", 0, 11));
        labelAgents.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelAgents.setText("Filename");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(labelAgents, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonAgents))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(checkboxAgents)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkboxAgents)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAgents)
                    .addComponent(labelAgents))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        checkboxData.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        checkboxData.setText("Simulation Data");
        checkboxData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxDataActionPerformed(evt);
            }
        });

        buttonData.setFont(new java.awt.Font("Arial", 0, 11));
        buttonData.setText("Change");
        buttonData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDataActionPerformed(evt);
            }
        });

        labelData.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        labelData.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelData.setText("Filename");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(checkboxData, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(labelData, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonData)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonData)
                    .addComponent(labelData))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkboxData)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        buttonCancel.setFont(new java.awt.Font("Arial", 0, 11));
        buttonCancel.setText("Cancel");
        buttonCancel.setDefaultCapable(false);
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        buttonOK.setFont(new java.awt.Font("Arial", 0, 11));
        buttonOK.setText("OK");
        buttonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOKActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        checkboxScreenshots.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        checkboxScreenshots.setText("Screenshots");
        checkboxScreenshots.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxScreenshotsActionPerformed(evt);
            }
        });

        buttonScreenshots.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        buttonScreenshots.setText("Change");
        buttonScreenshots.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonScreenshotsActionPerformed(evt);
            }
        });

        labelScreenshots.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        labelScreenshots.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelScreenshots.setText("Filename");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(checkboxScreenshots, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(labelScreenshots, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonScreenshots)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonScreenshots)
                    .addComponent(labelScreenshots))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkboxScreenshots)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buttonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonCancel))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancel)
                    .addComponent(buttonOK))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOKActionPerformed
        envConfig.setLogAgents(logAgents);
        envConfig.setLogAgentsFilename(logAgentsFilename);
        envConfig.setLogData(logData);
        envConfig.setLogDataFilename(logDataFilename);
        envConfig.setLogScreenshots(logScreenshots);
        envConfig.setLogScreenshotsDirname(logScreenshotsDirname);
        this.dispose();
}//GEN-LAST:event_buttonOKActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        this.dispose();
}//GEN-LAST:event_buttonCancelActionPerformed

    private void checkboxAgentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxAgentsActionPerformed
        if(checkboxAgents.isSelected()) {
            labelAgents.setEnabled(true);
            buttonAgents.setEnabled(true);
            logAgents = true;
        }
        else {
            labelAgents.setEnabled(false);
            buttonAgents.setEnabled(false);
            logAgents = false;
        }
}//GEN-LAST:event_checkboxAgentsActionPerformed

    private void checkboxDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxDataActionPerformed
        if(checkboxData.isSelected()) {
            labelData.setEnabled(true);
            buttonData.setEnabled(true);
            logData = true;
        }
        else {
            labelData.setEnabled(false);
            buttonData.setEnabled(false);
            logData = false;
        }

}//GEN-LAST:event_checkboxDataActionPerformed

    private void buttonAgentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgentsActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        //Usually, log dir default: fileChooser.setCurrentDirectory(new File(System.getProperty("user.dir") + "/logs/"));
        // But temporarily for thesis:
        fileChooser.setCurrentDirectory(new File(envConfig.getLogAgentFilename()));
        int returnVal = fileChooser.showSaveDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            logAgentsFilename = file.getPath();
            labelAgents.setText(logAgentsFilename);
        }
    }//GEN-LAST:event_buttonAgentsActionPerformed

    private void buttonDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDataActionPerformed
        JFileChooser fileChooser = new JFileChooser();
       //Usually, log dir default: fileChooser.setCurrentDirectory(new File(System.getProperty("user.dir") + "/logs/"));
        // But temporarily for thesis:
        fileChooser.setCurrentDirectory(new File(envConfig.getLogDataFilename()));
        int returnVal = fileChooser.showSaveDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            logDataFilename = file.getPath();
            labelData.setText(logDataFilename);
        }
    }//GEN-LAST:event_buttonDataActionPerformed

    private void checkboxScreenshotsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxScreenshotsActionPerformed
        if(checkboxScreenshots.isSelected()) {
            labelScreenshots.setEnabled(true);
            buttonScreenshots.setEnabled(true);
            logScreenshots = true;
        }
        else {
            labelScreenshots.setEnabled(false);
            buttonScreenshots.setEnabled(false);
            logScreenshots = false;
        }


}//GEN-LAST:event_checkboxScreenshotsActionPerformed

    private void buttonScreenshotsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonScreenshotsActionPerformed
        System.setProperty("apple.awt.fileDialogForDirectories", "true");
        JFileChooser dirChooser = new JFileChooser();
       //Usually, dir default: dirChooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
        // But temporarily for thesis:
        dirChooser.setCurrentDirectory(new File(envConfig.getLogScreenshotsDirname()));
        dirChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int returnVal = dirChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File dir = dirChooser.getSelectedFile();
            logScreenshotsDirname = dir.getPath();
            labelScreenshots.setText(logScreenshotsDirname);
        }
}//GEN-LAST:event_buttonScreenshotsActionPerformed
    
    WindowListener windowListener = new WindowAdapter() {
        @Override
        public void windowClosing ( WindowEvent w ) {
            dispose();
        } 
    };
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgents;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonData;
    private javax.swing.JButton buttonData1;
    private javax.swing.JButton buttonOK;
    private javax.swing.JButton buttonScreenshots;
    private javax.swing.JCheckBox checkboxAgents;
    private javax.swing.JCheckBox checkboxData;
    private javax.swing.JCheckBox checkboxData1;
    private javax.swing.JCheckBox checkboxScreenshots;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelAgents;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelData1;
    private javax.swing.JLabel labelScreenshots;
    // End of variables declaration//GEN-END:variables
    
}
