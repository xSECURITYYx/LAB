public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.setStudentData("S101", "Alice", 20);
        controller.updateView();
    }
}
