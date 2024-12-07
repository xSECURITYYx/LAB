public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentData(String id, String name, int age) {
        model.setStudent(new Student(id, name, age));
    }

    public void updateView() {
        Student student = model.getStudent();
        view.printStudentDetails(student.getId(), student.getName(), student.getAge());
    }
}
