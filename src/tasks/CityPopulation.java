public class CityPopulation{
	int[] peoples;
	
	
	public void init(int size){
		peoples = new int[size];
		for(int i = 0; i < peoples.length; i++){
			peoples[i] = 1;
		}
	}
	public void born(int percent){
		int size = peoples.length + peoples.length * (percent/100);
		int[] result = new int[size];
		for(int i = 0; i < result.length; i++){
			result[i] = 1;
		}
		peoples = result;
	}
	public void arrive(){
		int size = peoples.length + 50;
		int[] result = new int[size];
		peoples = result + result;
	}
	public void increment(){
		born(2);
		arrive();
		
	}
	public int getCitySize(){
		return peoples.length;
	}
	public static void main(String[] args){
		CityPopulation test = new CityPopulation();
		int count = 0;
		test.init(1000);
			while(test.getCitySize() <= 1300){
			test.increment();
			count++;
			}
		System.out.println(count);
	}
}