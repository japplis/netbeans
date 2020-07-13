/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.netbeans.modules.j2ee.ddloaders.web.multiview;

import java.awt.event.ItemEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import org.netbeans.modules.j2ee.dd.api.web.RelativeOrdering;
import org.netbeans.modules.j2ee.dd.api.web.RelativeOrderingItems;
import org.netbeans.modules.j2ee.dd.api.web.WebApp;
import org.netbeans.modules.j2ee.dd.api.web.WebFragment;
import org.netbeans.modules.j2ee.ddloaders.web.DDDataObject;
import org.netbeans.modules.xml.multiview.ui.SectionInnerPanel;
import org.netbeans.modules.xml.multiview.ui.SectionView;
import org.openide.DialogDescriptor;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.util.NbBundle;

/**
 * @author Petr Slechta
 */
public class RelativeOrderingPanel extends SectionInnerPanel implements java.awt.event.ItemListener {
    private DDDataObject dObj;
    private WebApp webApp;
    private DefaultListModel listModelAfter;
    private DefaultListModel listModelBefore;

    public RelativeOrderingPanel(SectionView sectionView, DDDataObject dObj) {
        super(sectionView);
        this.dObj = dObj;
        webApp = dObj.getWebApp();

        initComponents();
        listModelAfter = new DefaultListModel();
        listAfter.setModel(listModelAfter);
        listModelBefore = new DefaultListModel();
        listBefore.setModel(listModelBefore);

        if (webApp instanceof WebFragment) {
            WebFragment webFrag = (WebFragment)webApp;
            RelativeOrdering[] orderings = webFrag.getOrdering();
            if (orderings != null) {
                for (RelativeOrdering ordering : orderings) {
                    addItems(listModelAfter, ordering.getAfter());
                    addItems(listModelBefore, ordering.getBefore());
                }
            }
        }
    }

    private void addItems(DefaultListModel model, RelativeOrderingItems items) {
        if (items != null) {
            for (String name : items.getName())
                model.addElement(name);
            if (items.getOthers() != null)
                model.addElement(OrderingItemPanel.OTHERS);
        }
    }

    public javax.swing.JComponent getErrorComponent(String errorId) {
        return null;
    }

    public void setValue(javax.swing.JComponent source, Object value) {
    }
    
    public void linkButtonPressed(Object obj, String id) {
    }

    public void itemStateChanged(ItemEvent e) {
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pAfter = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listAfter = new javax.swing.JList();
        bAddAfter = new javax.swing.JButton();
        bEditAfter = new javax.swing.JButton();
        bRemoveAfter = new javax.swing.JButton();
        bUpAfter = new javax.swing.JButton();
        bDownAfter = new javax.swing.JButton();
        pBefore = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listBefore = new javax.swing.JList();
        bAddBefore = new javax.swing.JButton();
        bEditBefore = new javax.swing.JButton();
        bRemoveBefore = new javax.swing.JButton();
        bUpBefore = new javax.swing.JButton();
        bDownBefore = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(250, 150));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(RelativeOrderingPanel.class, "LBL_RelativeOrder")); // NOI18N

        pAfter.setOpaque(false);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(RelativeOrderingPanel.class, "LBL_After")); // NOI18N

        listAfter.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(listAfter);

        org.openide.awt.Mnemonics.setLocalizedText(bAddAfter, org.openide.util.NbBundle.getMessage(RelativeOrderingPanel.class, "BTN_Add")); // NOI18N
        bAddAfter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddAfterActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(bEditAfter, org.openide.util.NbBundle.getMessage(RelativeOrderingPanel.class, "BTN_Edit")); // NOI18N
        bEditAfter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditAfterActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(bRemoveAfter, org.openide.util.NbBundle.getMessage(RelativeOrderingPanel.class, "BTN_Remove")); // NOI18N
        bRemoveAfter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRemoveAfterActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(bUpAfter, org.openide.util.NbBundle.getMessage(RelativeOrderingPanel.class, "BTN_Up")); // NOI18N
        bUpAfter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpAfterActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(bDownAfter, org.openide.util.NbBundle.getMessage(RelativeOrderingPanel.class, "BTN_Down")); // NOI18N
        bDownAfter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDownAfterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pAfterLayout = new javax.swing.GroupLayout(pAfter);
        pAfter.setLayout(pAfterLayout);
        pAfterLayout.setHorizontalGroup(
            pAfterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAfterLayout.createSequentialGroup()
                .addGroup(pAfterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(pAfterLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pAfterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bRemoveAfter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bEditAfter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bAddAfter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bUpAfter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bDownAfter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pAfterLayout.setVerticalGroup(
            pAfterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAfterLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pAfterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pAfterLayout.createSequentialGroup()
                        .addComponent(bAddAfter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bEditAfter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bRemoveAfter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bUpAfter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bDownAfter))
                    .addComponent(jScrollPane2))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pBefore.setOpaque(false);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(RelativeOrderingPanel.class, "LBL_Before")); // NOI18N

        listBefore.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(listBefore);

        org.openide.awt.Mnemonics.setLocalizedText(bAddBefore, org.openide.util.NbBundle.getMessage(RelativeOrderingPanel.class, "BTN_Add")); // NOI18N
        bAddBefore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddBeforeActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(bEditBefore, org.openide.util.NbBundle.getMessage(RelativeOrderingPanel.class, "BTN_Edit")); // NOI18N
        bEditBefore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditBeforeActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(bRemoveBefore, org.openide.util.NbBundle.getMessage(RelativeOrderingPanel.class, "BTN_Remove")); // NOI18N
        bRemoveBefore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRemoveBeforeActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(bUpBefore, org.openide.util.NbBundle.getMessage(RelativeOrderingPanel.class, "BTN_Up")); // NOI18N
        bUpBefore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpBeforeActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(bDownBefore, org.openide.util.NbBundle.getMessage(RelativeOrderingPanel.class, "BTN_Down")); // NOI18N
        bDownBefore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDownBeforeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pBeforeLayout = new javax.swing.GroupLayout(pBefore);
        pBefore.setLayout(pBeforeLayout);
        pBeforeLayout.setHorizontalGroup(
            pBeforeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBeforeLayout.createSequentialGroup()
                .addGroup(pBeforeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(pBeforeLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pBeforeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bRemoveBefore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bEditBefore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bAddBefore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bUpBefore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bDownBefore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pBeforeLayout.setVerticalGroup(
            pBeforeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBeforeLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pBeforeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pBeforeLayout.createSequentialGroup()
                        .addComponent(bAddBefore)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bEditBefore)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bRemoveBefore)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bUpBefore)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bDownBefore))
                    .addComponent(jScrollPane3))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pAfter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pBefore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pBefore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pAfter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bAddAfterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddAfterActionPerformed
        String name = getOrderItemFromUser("");
        if (name != null) {
            listModelAfter.addElement(name);
            refreshDdModel();
        }
}//GEN-LAST:event_bAddAfterActionPerformed

    private void bEditAfterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditAfterActionPerformed
        int x = listAfter.getSelectedIndex();
        if (x >= 0) {
            String name = getOrderItemFromUser((String)listModelAfter.get(x));
            if (name != null) {
                listModelAfter.set(x, name);
                refreshDdModel();
            }
        }
}//GEN-LAST:event_bEditAfterActionPerformed

    private void bRemoveAfterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRemoveAfterActionPerformed
        int x = listAfter.getSelectedIndex();
        if (x >= 0) {
            listModelAfter.remove(x);
            refreshDdModel();
        }
}//GEN-LAST:event_bRemoveAfterActionPerformed

    private void bUpAfterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpAfterActionPerformed
        int x = listAfter.getSelectedIndex();
        if (x > 0) {
            exchange(listModelAfter, x-1);
        }
        listAfter.setSelectedIndex(x-1);
        refreshDdModel();
}//GEN-LAST:event_bUpAfterActionPerformed

    private void bDownAfterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDownAfterActionPerformed
        int x = listAfter.getSelectedIndex();
        if (x >= 0 && x < listModelAfter.size()-1) {
            exchange(listModelAfter, x);
        }
        listAfter.setSelectedIndex(x+1);
        refreshDdModel();
}//GEN-LAST:event_bDownAfterActionPerformed

    private void bAddBeforeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddBeforeActionPerformed
        String name = getOrderItemFromUser("");
        if (name != null) {
            listModelBefore.addElement(name);
            refreshDdModel();
        }
}//GEN-LAST:event_bAddBeforeActionPerformed

    private void bEditBeforeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditBeforeActionPerformed
        int x = listBefore.getSelectedIndex();
        if (x >= 0) {
            String name = getOrderItemFromUser((String)listModelBefore.get(x));
            if (name != null) {
                listModelBefore.set(x, name);
                refreshDdModel();
            }
        }
}//GEN-LAST:event_bEditBeforeActionPerformed

    private void bRemoveBeforeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRemoveBeforeActionPerformed
        int x = listBefore.getSelectedIndex();
        if (x >= 0) {
            listModelBefore.remove(x);
            refreshDdModel();
        }
}//GEN-LAST:event_bRemoveBeforeActionPerformed

    private void bUpBeforeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpBeforeActionPerformed
        int x = listBefore.getSelectedIndex();
        if (x > 0) {
            exchange(listModelBefore, x-1);
        }
        listBefore.setSelectedIndex(x-1);
        refreshDdModel();
}//GEN-LAST:event_bUpBeforeActionPerformed

    private void bDownBeforeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDownBeforeActionPerformed
        int x = listBefore.getSelectedIndex();
        if (x >= 0 && x < listModelBefore.size()-1) {
            exchange(listModelBefore, x);
        }
        listBefore.setSelectedIndex(x+1);
        refreshDdModel();
}//GEN-LAST:event_bDownBeforeActionPerformed

    private String getOrderItemFromUser(String value) {
        OrderingItemPanel p = new OrderingItemPanel(value);
        DialogDescriptor dd = new DialogDescriptor(p,
                NbBundle.getMessage(RelativeOrderingPanel.class, "TTL_Ordering"));
        dd.createNotificationLineSupport();
        p.setDlgSupport(dd);
        dd.setOptionType(NotifyDescriptor.OK_CANCEL_OPTION);
        if (NotifyDescriptor.OK_OPTION.equals(DialogDisplayer.getDefault().notify(dd))) {
            return p.getResult();
        }
        return null;
    }

    private void exchange(DefaultListModel model, int x) {
        Object tmp1 = model.get(x);
        Object tmp2 = model.get(x+1);
        model.set(x, tmp2);
        model.set(x+1, tmp1);
    }
    
    private void refreshDdModel() {
        if (!(webApp instanceof WebFragment)) {
            Logger.getGlobal().log(Level.SEVERE, "refreshDdModel failed, not a WebFragment instance of DD passed!");
            return;
        }
        WebFragment webFrag = (WebFragment)webApp;

        RelativeOrdering ordering = webFrag.newRelativeOrdering();

        RelativeOrderingItems after = ordering.newRelativeOrderingItems();
        ordering.setAfter(after);
        for (int i=0,maxi=listModelAfter.size(); i<maxi; i++) {
            String item = (String)listModelAfter.get(i);
            if (item.equals(OrderingItemPanel.OTHERS))
                after.setOthers(after.newRelativeOrderingOthersItem());
            else
                after.addName(item);
        }

        RelativeOrderingItems before = ordering.newRelativeOrderingItems();
        ordering.setBefore(before);
        for (int i=0,maxi=listModelBefore.size(); i<maxi; i++) {
            String item = (String)listModelBefore.get(i);
            if (item.equals(OrderingItemPanel.OTHERS))
                before.setOthers(before.newRelativeOrderingOthersItem());
            else
                before.addName(item);
        }

        RelativeOrdering[] orderings = new RelativeOrdering[1];
        orderings[0] = ordering;
        webFrag.setOrdering(orderings);
        dObj.modelUpdatedFromUI();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAddAfter;
    private javax.swing.JButton bAddBefore;
    private javax.swing.JButton bDownAfter;
    private javax.swing.JButton bDownBefore;
    private javax.swing.JButton bEditAfter;
    private javax.swing.JButton bEditBefore;
    private javax.swing.JButton bRemoveAfter;
    private javax.swing.JButton bRemoveBefore;
    private javax.swing.JButton bUpAfter;
    private javax.swing.JButton bUpBefore;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList listAfter;
    private javax.swing.JList listBefore;
    private javax.swing.JPanel pAfter;
    private javax.swing.JPanel pBefore;
    // End of variables declaration//GEN-END:variables
 
}
