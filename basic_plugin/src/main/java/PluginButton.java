import com.intellij.ide.BrowserUtil;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;



import javax.swing.*;


public class PluginButton extends AnAction {
  @Override
  public void actionPerformed(@NotNull AnActionEvent e) {
    String[] options = {"WebTeam people", "JCEF"};
    int choice = JOptionPane.showOptionDialog(null, "Choose a website to open", "Website Selector",
        JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

    if (choice == 0) {
      BrowserUtil.browse("https://www.jetbrains.com/company/people/webteam/");
    } else if (choice == 1) {
      BrowserUtil.browse("https://github.com/chromiumembedded/java-cef");
    }
  }
}
