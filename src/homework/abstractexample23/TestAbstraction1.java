package homework.abstractexample23;

//In real scenario, method is called by programmer or user
class TestAbstraction1{
    public static void main(String args[]){
        Circle1 s=new Circle1();//In a real scenario, object is provided throughmethod, e.g., getShape() method
        s.draw();
    }
}