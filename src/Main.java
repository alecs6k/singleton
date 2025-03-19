public class Main {
    public static void main(String[] args) {
        ApplicationState applicationState = ApplicationState.getInstance();
        applicationState.printApplicationState();

        applicationState.setConnected(Boolean.FALSE);
        applicationState.setCurrentUser("User 1");

        ApplicationState otherReference = ApplicationState.getInstance();
        otherReference.printApplicationState();
    }
}
