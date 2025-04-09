import java.util.*;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) throws DuplicatePRNException {
        for (Student st : students) {
            if (st.getPrn().equals(s.getPrn())) {
                throw new DuplicatePRNException("Student with PRN already exists.");
            }
        }
        students.add(s);
    }

    public void displayAll() throws EmptyStudentListException {
        if (students.isEmpty()) throw new EmptyStudentListException("No students to display.");
        for (Student s : students) s.display();
    }

    public Student searchByPRN(String prn) throws StudentNotFoundException {
        for (Student s : students) {
            if (s.getPrn().equals(prn)) return s;
        }
        throw new StudentNotFoundException("Student with PRN " + prn + " not found.");
    }

    public Student searchByName(String name) throws StudentNotFoundException {
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) return s;
        }
        throw new StudentNotFoundException("Student with name " + name + " not found.");
    }

    public Student searchByPosition(int pos) throws InvalidInputException {
        if (pos < 0 || pos >= students.size()) {
            throw new InvalidInputException("Invalid index: " + pos);
        }
        return students.get(pos);
    }

    public void updateStudent(String prn, String newName, String newDob, double newMarks)
        throws StudentNotFoundException {
        Student s = searchByPRN(prn);
        s.setName(newName);
        s.setDob(newDob);
        s.setMarks(newMarks);
    }

    public void deleteStudent(String prn) throws StudentNotFoundException {
        Student s = searchByPRN(prn);
        students.remove(s);
    }
}
