import java.util.Arrays;
import java.util.Random;


public class InsertionSort {
	private int[] data;
	private Random ranNum = new Random();
	private int count = 0;
	private int count2 = 0;

	public InsertionSort(int size){
		data = new int[size];
		for (int i = 0; i < data.length; i++){
			data[i] = 10 + ranNum.nextInt(90);
		}
	}

	public void insertionSort(){
		int temp;
		int smallest;

		for (int i = 1 ; i < data.length; i++){
			smallest = i;
			for (int j = i - 1; j >= 0; j--){
				if (data[j] > data[smallest]){
					temp = data[j];
					data[j] = data[smallest];
					data[smallest] = temp;
					smallest = j;
					count++;
				}
			}
		}

	}

	public void insertionSort2(){
		for (int i = 1; i < data.length; i++){
			int j = i - 1;
			int smallest = i;

			while((j >= 0) && data[j] > data[smallest] ){
				int temp = data[j];
				data[j] = data[smallest];
				data[smallest] = temp;
				smallest = j;
				j--;
				count++;	
			}
		}
	}

	public  void clone(InsertionSort copy){
		for (int i = 0; i < data.length; i++){
			this.data[i] = copy.data[i];
		}

	}


	public String toString(){
		return Arrays.toString(data);
	}

	public int getCount(){
		return count;
	}

}
