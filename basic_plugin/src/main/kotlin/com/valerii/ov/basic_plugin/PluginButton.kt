package com.valerii.ov.basic_plugin

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.ui.jcef.JBCefBrowser
import org.jetbrains.annotations.NotNull
import java.awt.BorderLayout
import javax.swing.*

class PluginButton : AnAction() {

    override fun actionPerformed(@NotNull e: AnActionEvent) {
        val options = arrayOf("WebTeam people", "JCEF repository")
        val choice = JOptionPane.showOptionDialog(
                null, "Choose a website to open", "Website Selector",
                JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]
        )

        if (choice == 0) {
            val browser = JBCefBrowser()
            browser.loadURL("https://www.jetbrains.com/company/people/webteam/")
            showInDialog(browser.component)
        } else if (choice == 1) {
            val browser = JBCefBrowser()
            browser.loadURL("https://github.com/chromiumembedded/java-cef")
            showInDialog(browser.component)
        }
    }

    private fun showInDialog(@NotNull component: JComponent) {
        val frame = JFrame()
        frame.defaultCloseOperation = WindowConstants.DISPOSE_ON_CLOSE
        frame.contentPane.add(component, BorderLayout.CENTER)
        frame.setSize(800, 600)
        frame.setLocationRelativeTo(null)
        frame.isVisible = true
    }
}