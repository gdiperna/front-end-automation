package scripts;


public class ControllerFactory {
    private static final ThreadLocal<Object> CONTROLLER = new ThreadLocal<>();

    public static <T> void setController(T controller) {
        CONTROLLER.set(controller);
    }

    @SuppressWarnings("unchecked")
    public static <T> T getController(Class<T> clazz) {
        return (T) CONTROLLER.get();
    }

    public static void clear() {
        CONTROLLER.remove();
    }
}
