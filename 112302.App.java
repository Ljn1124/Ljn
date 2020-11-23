package pac;

public class App2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		int arr[][]={
				{200,300},
				{300,500},
				{400,400},
				{350,420},
		};
		while (true){
			Thread.sleep(1000);
			System.out.println("一秒了");
			System.out.println(arr[(int)(Math.random()*10%4)][0]+","+arr[(int)(Math.random()*10%4)][1]);
		}
	}

}
