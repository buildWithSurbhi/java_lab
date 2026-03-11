interface Outer {
    interface Inner {
        void show();
    }
}

class NestedInterfaceDemo implements Outer.Inner {

    public void show() {
        System.out.println("Nested interface implemented successfully.");
    }

    public static void main(String[] args) {
        NestedInterfaceDemo obj = new NestedInterfaceDemo();
        obj.show();
    }
}