import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

public class PluginButton extends AnAction {


  @Override
  public void actionPerformed(@NotNull AnActionEvent e) {
    Messages.showMessageDialog("Hello", "Hello World", Messages.getInformationIcon());
  }

  @Override
  public boolean isDumbAware() {
    return super.isDumbAware();
  }




}
