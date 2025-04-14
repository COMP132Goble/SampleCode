package designPatterns;

public class Fruit {
    static Log log = Log.getLog();
    boolean isPeeled = false;

    public void peel() {
		log.addMessage("object " + this + " was peeled.");
		isPeeled = true;
	}

	public void bite() {
		String msg ="object " + this + " was bitten.";
		if (!isPeeled) {
			msg += ".. before being peeled!";
		}
		log.addMessage(msg);
	}

	public static void main(String[] args) {
		Apple a1 = new Apple();
		Apple a2 = new Apple();
		Banana b1 = new Banana();
		Banana b2 = new Banana();

		a1.peel();
		b1.peel();
		a1.bite();
		b1.bite();
		a2.bite();
		a2.peel();
		b2.peel();

		Fruit.log.print();
	}
}
