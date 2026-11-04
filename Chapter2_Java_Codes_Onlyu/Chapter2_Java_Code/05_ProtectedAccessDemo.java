// protected members can be accessed by subclasses.
class UniversityPerson {
    protected String department;

    protected void announce() {
        System.out.println("From " + department);
    }
}

class UniversityStudent extends UniversityPerson {
    public void setDepartment(String department) {
        this.department = department;
    }

    public void introduce() {
        announce();
    }
}

class ProtectedAccessDemo {
    public static void main(String[] args) {
        UniversityStudent student = new UniversityStudent();
        student.setDepartment("Computer Science");
        student.introduce();
    }
}
