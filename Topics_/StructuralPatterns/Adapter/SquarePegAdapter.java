package Adapter;

// RoundPeg를 상속 받았기 때문에 RoundHole에서 호출가능함
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg){
        this.peg = peg;
    }
    @Override
    public double getRadius() {
        double result;
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));

        return result;
    }
}
