/*
Copyright (c) 2012, University of Texas at El Paso
All rights reserved.
Redistribution and use in source and binary forms, with or without 
modification, are permitted provided that the following conditions are met:
- Redistributions of source code must retain the above copyright notice, this 
  list of conditions and the following disclaimer.
- Redistributions in binary form must reproduce the above copyright notice, 
  this list of conditions and the following disclaimer in the documentation 
  and/or other materials provided with the distribution.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
  AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE 
  IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE 
  ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE 
  LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR 
  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
  SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS 
  INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN 
  CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
 */
package edu.utep.cybershare.wdoit.ui;

import org.jdesktop.application.Action;

public class WdoAboutBox extends javax.swing.JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WdoAboutBox(java.awt.Frame parent) {
		super(parent);
		initComponents();
		getRootPane().setDefaultButton(closeButton);
	}

	@Action
	public void closeAboutBox() {
		setVisible(false);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		closeButton = new javax.swing.JButton();
		javax.swing.JLabel appTitleLabel = new javax.swing.JLabel();
		javax.swing.JLabel versionLabel = new javax.swing.JLabel();
		javax.swing.JLabel appVersionLabel = new javax.swing.JLabel();
		javax.swing.JLabel vendorLabel = new javax.swing.JLabel();
		javax.swing.JLabel appVendorLabel = new javax.swing.JLabel();
		javax.swing.JLabel homepageLabel = new javax.swing.JLabel();
		javax.swing.JLabel appHomepageLabel = new javax.swing.JLabel();
		javax.swing.JLabel appDescLabel = new javax.swing.JLabel();
		javax.swing.JLabel imageLabel = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application
				.getInstance(edu.utep.cybershare.wdoit.WdoApp.class)
				.getContext().getResourceMap(WdoAboutBox.class);
		setTitle(resourceMap.getString("title")); // NOI18N
		setModal(true);
		setName("aboutBox"); // NOI18N
		setResizable(false);

		javax.swing.ActionMap actionMap = org.jdesktop.application.Application
				.getInstance(edu.utep.cybershare.wdoit.WdoApp.class)
				.getContext().getActionMap(WdoAboutBox.class, this);
		closeButton.setAction(actionMap.get("closeAboutBox")); // NOI18N
		closeButton.setName("closeButton"); // NOI18N

		appTitleLabel.setFont(appTitleLabel.getFont().deriveFont(
				appTitleLabel.getFont().getStyle() | java.awt.Font.BOLD,
				appTitleLabel.getFont().getSize() + 4));
		appTitleLabel.setText(resourceMap.getString("Application.name")); // NOI18N
		appTitleLabel.setName("appTitleLabel"); // NOI18N

		versionLabel.setFont(versionLabel.getFont().deriveFont(
				versionLabel.getFont().getStyle() | java.awt.Font.BOLD));
		versionLabel.setText(resourceMap.getString("versionLabel.text")); // NOI18N
		versionLabel.setName("versionLabel"); // NOI18N

		appVersionLabel.setText(resourceMap.getString("Application.version")); // NOI18N
		appVersionLabel.setName("appVersionLabel"); // NOI18N

		vendorLabel.setFont(vendorLabel.getFont().deriveFont(
				vendorLabel.getFont().getStyle() | java.awt.Font.BOLD));
		vendorLabel.setText(resourceMap.getString("vendorLabel.text")); // NOI18N
		vendorLabel.setName("vendorLabel"); // NOI18N

		appVendorLabel.setText(resourceMap.getString("Application.vendor")); // NOI18N
		appVendorLabel.setName("appVendorLabel"); // NOI18N

		homepageLabel.setFont(homepageLabel.getFont().deriveFont(
				homepageLabel.getFont().getStyle() | java.awt.Font.BOLD));
		homepageLabel.setText(resourceMap.getString("homepageLabel.text")); // NOI18N
		homepageLabel.setName("homepageLabel"); // NOI18N

		appHomepageLabel.setText(resourceMap.getString("Application.homepage")); // NOI18N
		appHomepageLabel.setName("appHomepageLabel"); // NOI18N

		appDescLabel.setText(resourceMap.getString("appDescLabel.text")); // NOI18N
		appDescLabel.setName("appDescLabel"); // NOI18N

		imageLabel.setIcon(resourceMap.getIcon("imageLabel.icon")); // NOI18N
		imageLabel.setName("imageLabel"); // NOI18N

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(imageLabel)
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(appTitleLabel)
												.addComponent(
														appDescLabel,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														283, Short.MAX_VALUE)
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																				.addComponent(
																						vendorLabel)
																				.addComponent(
																						versionLabel)
																				.addComponent(
																						homepageLabel))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						appVendorLabel)
																				.addComponent(
																						appVersionLabel)
																				.addComponent(
																						appHomepageLabel)
																				.addComponent(
																						closeButton))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
								.addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(imageLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(6, 6, 6)
								.addComponent(appTitleLabel)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(appDescLabel)
								.addGap(11, 11, 11)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(versionLabel)
												.addComponent(appVersionLabel))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(vendorLabel)
												.addComponent(appVendorLabel))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(homepageLabel)
												.addComponent(appHomepageLabel))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(closeButton).addGap(5, 5, 5)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton closeButton;
	// End of variables declaration//GEN-END:variables

}