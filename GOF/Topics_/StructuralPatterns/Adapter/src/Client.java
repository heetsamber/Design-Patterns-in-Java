package Adapter;

public class Client {
    public static void main(String[] args){
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);

        if(hole.fits(rpeg)){
            System.out.println("Round peg r5 fits round hole r5");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);

        // 컴파일 불가능 fits(RoundPeg peg) 타입이기 때문
        // hole.fits(smallSqPeg);

        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);

        // SquarePegAdapter는 RoundPeg를 상속받았기 때문에 fits메소드에서 호출가능
        if(hole.fits(smallSqPegAdapter)){
            System.out.println("smallSqPegAdapter : Square peg w2 fits round hole r5.");
        }
        if(!hole.fits(largeSqPegAdapter)){
            System.out.println("largeSqPegAdapter : Square peg w20 does not fit into round hole r5.");
        }
    }
}
