
// import java.util.stream.Stream;

// class Student{
//     String firstname="rahul";
//     int age = 12;

//     Student() {
//         System.out.println("hello");
//     }
//     Student(String firstName){
//         this();
//         System.out.println(firstName);
//     }
//     Student(String firstName, int age ){
//         this(firstName);                        // constructor 
//         this.firstname=firstName;
//         age =age;
//         System.out.println(firstName+ " "+age);
//     }
// }
// class srajal23{
//     public static void main(String[] args) {
//         Student obj=new Student(); 
//     }
// }
class animal{
    void eat(){
        System.out.println("eatinggggggggggggg");
    }
}
class Dog extends  animal{
    void bark(){
        System.out.println("barkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");

    }

}
class puppy extends Dog{
    void lazy(){
        System.out.println("cutieeeeeeeeeee");
    }
}
class haire extends puppy{
    void chai(){
        System.out.println("browunnnnnnnn");
    }
}
class srajal23{
    public static void main(String[] args) {
        haire obj=new haire();
        obj.bark();
        obj.eat();
        obj.lazy();
        obj.chai();
    }

}
