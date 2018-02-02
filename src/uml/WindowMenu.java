package uml;

import java.util.List;

public abstract class WindowMenu {
    protected String name;
    protected List<String> menuItem;
    protected List<WindowMenu> submenus;

    abstract public void present(boolean visible);
    abstract public String getSelection();
}
