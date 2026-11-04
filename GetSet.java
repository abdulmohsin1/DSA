public class GetSet {


    int id;
    String name;
    String course;
    int age;


    void students(int id ,String name,String course, int age){
        this.id=id;
        this.name=name;
        this.course=course;
        this.age=age;
    }
/// getter
    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
    String getCourse(){
        return course;
    }
    int getAge(){
        return age;
    }
//setter
     void setId(int id){
        this.id=id;
    }
    void setName(String name){
        this.name=name;
    }
    void setCourse(String course){
        this.course=course;
    }
    void setAge(int age){
        this.age=age;
    }
    static void main() {
   GetSet st= new GetSet();
   st.students(101,"abdulmohsin", "MCA",25);
        // using getter
        System.out.println(st.getId());
        System.out.println(st.getName());
        System.out.println(st.getCourse());
        System.out.println(st.getAge());

        //using setter
        st.setAge(26);
        st.setCourse("PHD");
        st.setId(111);
        st.setName("shaikh ji");
        System.out.println("updated age: " + st.getAge());
        System.out.println("updated course: " + st.getCourse());
        System.out.println("updated id: " + st.getId());
        System.out.println("updated name: " + st.getName());
        System.out.println("---------------------------");
    }
}
