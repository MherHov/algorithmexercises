import java.util.Random;

public class Exercises {
    public  boolean canMakePackage(int smallBags, int bigBags, int goalWeight) {
        int totalWeight = smallBags + (bigBags * 5);

        if (goalWeight <= totalWeight && goalWeight % 5 <= smallBags) {
            return true;
        } else {
            return false;
        }
    }
    public  int largestPrimeFactor(int n) {
        int largestFactor = 1;

        while (n % 2 == 0) {
            largestFactor = 2;
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                largestFactor = i;
                n /= i;
            }
        }

        if (n > 2) {
            largestFactor = n;
        }

        return largestFactor;
    }
    public void evenOdd(){
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        if (randomNumber % 2 == 0) {
            System.out.println(randomNumber + " is an even number.");
        } else {
            System.out.println(randomNumber + " is an odd number.");
        }
    }
    public void minMax(){
        Random random = new Random();
        int min = 100, max = 0, i = 0;
        while (i < 10) {
            int n = random.nextInt(100) + 1;
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
            i++;
        }
        System.out.println("Smallest number: " + min);
        System.out.println("Largest number: " + max);
    }
}
