package practic.enums;

public enum Color {
    BLUE {
        @Override
        public void specialMethod() {
            System.out.println("blue");
        }
    }, GREEN{
        @Override
        public void specialMethod() {
            System.out.println("green");

        }
    }, YELLOW {
        @Override
        public void specialMethod() {
            System.out.println("yellow");

        }
    },
    RED{
        @Override
        public void specialMethod() {
            System.out.println("red");

        }
    };

    Color() {
        System.out.println("This is constructor of " + this.name());
    }
    public void someMethod (){
        System.out.println("This is enum methods " + this.name());
    }
    public abstract void specialMethod();
}
