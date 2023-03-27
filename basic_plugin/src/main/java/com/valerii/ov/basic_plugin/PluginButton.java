package com.valerii.ov.basic_plugin;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.ui.jcef.JBCefBrowser;
import java.awt.BorderLayout;
import org.jetbrains.annotations.NotNull;



import javax.swing.*;


public class PluginButton extends AnAction {
  @Override
  public void actionPerformed(@NotNull AnActionEvent e) {
    String[] options = {"WevTeam people", "JCEF repository"};
    int choice = JOptionPane.showOptionDialog(null, "Choose a website to open", "Website Selector",
        JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

    if (choice == 0) {
      JBCefBrowser browser = new JBCefBrowser();
      browser.loadURL("https://www.jetbrains.com/company/people/webteam/");
      showInDialog(browser.getComponent());
    } else if (choice == 1) {
      JBCefBrowser browser = new JBCefBrowser();
      browser.loadURL("https://github.com/chromiumembedded/java-cef");
      showInDialog(browser.getComponent());
    }
  }

  private static void showInDialog(@NotNull JComponent component) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    frame.getContentPane().add(component, BorderLayout.CENTER);
    frame.setSize(800, 600);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
