public class Main {

    public static void main(String[] args) {

        Student st = new Student();

        st.setName("Ali");

        st.setGrade(18.5);

        System.out.println(st.getName());

        System.out.println(st.getGrade());

        // مقدار اشتباه
        st.setGrade(50);
    }
}