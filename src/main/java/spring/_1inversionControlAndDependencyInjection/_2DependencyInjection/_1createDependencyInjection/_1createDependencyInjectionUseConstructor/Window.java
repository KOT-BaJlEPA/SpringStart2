package spring._1inversionControlAndDependencyInjection._2DependencyInjection._1createDependencyInjection._1createDependencyInjectionUseConstructor;

public class Window {
    private String windowShape = "square";

    public Window() {
    }

    public String getWindowShape() {
        return windowShape;
    }

    public void setWindowShape(String windowShape) {
        this.windowShape = windowShape;
    }

    @Override
    public String toString() {
        return "Window{" +
                "windowShape='" + windowShape + '\'' +
                '}';
    }

    public Window(String windowShape) {
        this.windowShape = windowShape;
    }
}
