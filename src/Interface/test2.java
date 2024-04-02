package Interface;

class test2 extends test {
    test2() {
    }

    public void call() {
    }

    public String toString() {
        return "id=" + this.id + ", name= " + this.name;
    }

    public static void main(String[] args) {
        Demo1 test = new test();
        test2 t2 = new test2();
        test.call();
        System.out.println(test.hashCode());
        System.out.println(test.toString());
        System.out.println(test);
        System.out.println(t2.hashCode());
        System.out.println(t2);
    }
}
