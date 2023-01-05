public class Turtle extends Animal implements Speakable, Runable, Swimable {
    public Turtle(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public String speak() {
        return "o";
    }


    @Override
    public Integer runSpeed() {
        return 1;
    }

    @Override
    public Integer swimSpeed() {
        return 30;
    }
}
