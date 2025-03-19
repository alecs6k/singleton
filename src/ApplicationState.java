import constant.ApplicationConstant;

public class ApplicationState {
    private static ApplicationState instance;

    private Boolean isDarkMode;
    private String currentUser;
    private String currentView;
    private Boolean isConnected;
    private String currentTask;

    private ApplicationState() {
        isDarkMode = Boolean.FALSE;
        currentUser = ApplicationConstant.DEFAULT_USER;
        currentView = ApplicationConstant.DEFAULT_VIEW;
        isConnected = Boolean.TRUE;
        currentTask = null;
    }

    public static ApplicationState getInstance() {
        if (instance == null) {
            instance = new ApplicationState();
        }
        return instance;
    }

    public void printApplicationState() {
        System.out.println(ApplicationConstant.STATUS_TITLE);
        System.out.println(ApplicationConstant.USER + this.currentUser);
        System.out.println(ApplicationConstant.VIEW + this.currentView);
        System.out.println(ApplicationConstant.DARK_VIEW + (this.isDarkMode ? ApplicationConstant.ACTIVATED : ApplicationConstant.DISABLED));
        System.out.println(ApplicationConstant.CONNECTION_STATUS + (this.isConnected ? ApplicationConstant.ONLINE : ApplicationConstant.OFFLINE));
        System.out.println(ApplicationConstant.CURRENT_TASK + (this.currentTask != null ? this.currentTask : ApplicationConstant.NONE));
        System.out.println(ApplicationConstant.END_LINE);
    }

    public void setConnected(boolean connected) {
        this.isConnected = connected;
        System.out.println(ApplicationConstant.CONNECTION_STATUS + (connected ? ApplicationConstant.ONLINE : ApplicationConstant.OFFLINE));
        System.out.println(ApplicationConstant.END_LINE);
    }

    public void setCurrentUser(String currentUser) {
        this.currentUser = currentUser;
        System.out.println(ApplicationConstant.USER + this.currentUser);
        System.out.println(ApplicationConstant.END_LINE);
    }
}
