package tasks;

public class HundredDoors {
	public static void doorsAreOpen(){
		 boolean[] doors = new boolean[101];
		    for (int i = 1; i <= 100; i++) {
		      for (int j = i; j <= 100; j++) {
		        if(j % i == 0) {
		          doors[j] = !doors[j];
		        }
		      }
		    }
		    int count = 0;
		    for (int i = 1; i <= 100; i++) {
		      System.out.print("Az " + i + " ajtó ");
		      if (doors[i] == true ){
		        System.out.println("nyitva");
		        count++;
		      } else {
		        System.out.println("zárva");
		      }
		    }
		    System.out.println("Nyított ajtók: " + count);
		  }
	public static void main(String[] args) {
		HundredDoors.doorsAreOpen();
	}
}
