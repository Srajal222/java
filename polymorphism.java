
//     void sum(int a){
//         System.out.println(a);
//     }
//     void sum(int a,int b){
//         System.out.println(a+b);
//     }
// }//          compile time polymorphism in method overloading 
// class polymorphism{
//     public static void main(String[] args) {
//         parent obj=new parent();
//         obj.sum(23);
//         obj.sum(23, 34);

//     }
    
// }
//  abstract class & methodssss
// abstract class payment{
//     abstract void pay(int a);
//     void succes(){
//         System.out.println("payment done " );
//     }

// }
// class upipayment extends payment{
//     void pay(int a){
//         System.out.println("pay vi upi :- "+a);
//     }

// }
// class netbanking extends payment{
//     void pay(int b){
//         System.out.println("pay by netbanking :- "+b);
//     }
// }
// class polymorphism{
//     public static void main(String[] args) {
//         payment obj=new upipayment();
//         obj.pay(25000);
//         obj.succes();
//         payment obj1=new netbanking();
//         obj1.pay(510000);
//         obj1.succes();
//     }
    

// }

// abstract class shape {
//         abstract void area(int a);
//         void find(){
//             System.out.println("finding " );
//         }
// }
// class circle extends shape{
//         void area(int a){
//             System.out.println("area circle:- " + a);
//         }
    
// }
// class rectangle extends shape{
//         void area(int b){
//             System.out.println("area rectangle  :- "+b);
//         }
// }
// class polymorphism{
//         public static void main(String[] args) {
//             shape obj=new circle();
//             obj.find();
//             obj.area(23);
//             shape obj1=new rectangle();
//             obj1.find();
//             obj1.area(25);
//         }
    
// }

// abstract class animal {
//     abstract void sound();
//     void voice(){
//         System.out.println("barkkkkkkk");

//     }

// }
// class dog extends animal{
//     void sound(){
//         System.out.println("laudly soundsss");
//     }
// }
// class cat extends animal{
//     void sound(){
//         System.out.println("meaau meaauuu");
//     }
// }
// class polymorphism{
//     public static void main(String[] args) {
//         animal obj= new dog;



// class atm{
//     private int a;

//     void setrupees(int a){
//         this.a=a;
//     }
//     int getrupees(){
//         return a;
//     }

// }
// class polymorphism{
//     public static void main(String[] args) {
//         atm obj = new atm();
//         obj.setrupees(23333);
//         System.out.println(obj.getrupees());
        
        
//     }
// } 
// class BankAccount{
//     private int a;
//     void getter(){
//         this.a=a;
//     }
//     void setter(){
        
//     }
// }
// class polymorphism{
//     public static void main(String[] args) {
//         BankAccount obj=new BankAccount();
//         obj.setter();
//         obj.getter();
//         System.out.println(obj.setter());
//     }

// }
