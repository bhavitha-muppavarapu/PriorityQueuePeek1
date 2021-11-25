import java.util.PriorityQueue;

class LotteryPrize implements Comparable{
    int lotteryNo;
    String name;

    public LotteryPrize(int lotteryNo, String name) {
        this.lotteryNo= lotteryNo;
        this.name = name;
    }
    public String toString(){
        return this.name+" got "+ this.lotteryNo+" marks.";
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
public class PriorityQueuePeek1{
    public static void main(String[] args) {
        PriorityQueue<LotteryPrize>Pqueue = new PriorityQueue<LotteryPrize>();
        LotteryPrize l1 = new LotteryPrize(123456,"Sham");
        LotteryPrize l2 = new LotteryPrize(823456,"Rehan");
        LotteryPrize l3 = new LotteryPrize(623456,"Rani");
        Pqueue.add(l1);
        Pqueue.add(l2);
        Pqueue.add(l3);
        System.out.println("The winner of Lottery Prize is "+Pqueue.peek().name+" with lottery number "
                + Pqueue.peek().lotteryNo);
    }
}