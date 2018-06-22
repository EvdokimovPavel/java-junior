package demo.ooad;

/**
 * Stateful VS Stateless Design
 */
public class Logger {
    private MessageFilter filter = new MoonPhaseMessageFilter();
    private MessageSaver saver;

    public void log(String message) {
        if (filter.filter(message)) {
            saver = new ConsoleMessageSaver(message);
            saver.save();
        }
    }
}
