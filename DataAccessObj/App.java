/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package vandudbsql;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
       // System.out.println(new App().getGreeting());
       Student st=new Student();
       st.setId(1111111);
       st.setName("CADDDD");

       StudImpl ob;
       ob=new StudImpl();
       ob.update(st);
       //ob.save(st);
       //ob.delete(st);
    }
}
