package Task2.MVC;

public class LabClassDriver {
    private Student[] database;
    private StudentsDB model;
    private LabClassUI view;
    private LabClass controller;

    public LabClassDriver() {
        initDatabase();
    }

    private void initDatabase() {
        database = new Student[] {
                new Student("Жолобов Игорь", 4.2),
                new Student("Антонов Антон", 4.9),
                new Student("Смирнов Пётр", 3.8),
                new Student("Пупкин Василий", 3.5),
                new Student("Иванов Иван", 2.3),
                new Student("Сергеев Сергей", 5.0),
                new Student("Некрасова Мария", 3.7),
                new Student("Фролов Матвей", 4.85),
                new Student("Чернышов Сергей", 5.0)
        };
    }

    public void run() {
        model = new StudentsDB(database);
        view = new LabClassUI();
        controller = new LabClass(model, view);
    }
}
