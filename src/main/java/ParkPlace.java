import java.util.Scanner;

public class ParkPlace {
    private int weight;

    private void carWeight() {
        Scanner sc = new Scanner(System.in);
        setWeight(sc.nextInt());
        sc.close();
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void carPark() {
        carWeight();
        if (getWeight() >= 10) {
            System.out.println("Go to stage 0");
        } else if (getWeight() >= 5) {
            System.out.println("Go to stage 1");
        } else {
            System.out.println("Go to stage 2");
        }
    }

    public static void main(String[] args) {
        ParkPlace place = new ParkPlace();
        place.carPark();
    }
}
