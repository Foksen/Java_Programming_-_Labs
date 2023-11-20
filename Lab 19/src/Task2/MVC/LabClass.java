package Task2.MVC;

import Task2.Exceptions.EmptyStringException;
import Task2.Exceptions.StudentNotFoundException;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Arrays;

public class LabClass {
    private final StudentsDB model;
    private final LabClassUI view;
    private ArrayList<Student> selectedStudents;

    public LabClass(StudentsDB model, LabClassUI view) {
        this.model = model;
        this.view = view;

        view.getFindBtn().addActionListener(this::findBtnAction);
        view.getClearBtn().addActionListener(this::clearBtnAction);
        view.getSortBtn().addActionListener(this::sortBtnAction);

        selectedStudents = new ArrayList<>(Arrays.asList(model.students));
        updateView();
    }

    private String getInput() throws EmptyStringException {
        String input = view.getNameInput().getText();
        if (input.isEmpty())
            throw new EmptyStringException("Введите имя студента!");
        return view.getNameInput().getText();
    }

    private void findBtnAction(ActionEvent e) {
        try {
            String input = getInput();
            selectedStudents.clear();
            for (Student student : model.students) {
                if (student.getName().contains(input))
                    selectedStudents.add(student);
            }
            if (selectedStudents.isEmpty())
                throw new StudentNotFoundException("Студенты с заданным именем не найдены!");
        } catch (EmptyStringException ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage(),
                    "Пустой ввод!", JOptionPane.WARNING_MESSAGE);
        } catch (StudentNotFoundException ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage(),
                    "Не найдено!", JOptionPane.WARNING_MESSAGE);
        } finally {
            updateView();
        }
    }

    private void clearBtnAction(ActionEvent e) {
        selectedStudents.clear();
        selectedStudents = new ArrayList<>(Arrays.asList(model.students));
        updateView();
    }

    private void sortBtnAction(ActionEvent e) {
        selectedStudents.sort((o1, o2) -> -(o1.compareTo(o2)));
        updateView();
    }

    private void updateView() {
        String[] listItems = new String[selectedStudents.size()];
        for (int i = 0; i < selectedStudents.size(); ++i) {
            listItems[i] = selectedStudents.get(i).getName() + " : " + selectedStudents.get(i).getGrade();
        }
        view.getStudentsList().setListData(listItems);
    }
}
