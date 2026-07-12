package solid_principles.isp.BadExample;

class Robot implements Worker {

    public void work() {
        System.out.println("Working");
    }

    public void eat() {
        throw new UnsupportedOperationException();
    }
}