package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car car1=new Car();
		car1.color="Yellow";
		car1.gasoline=60;

		Car car2=new Car();
		car2.color="Blue";
		car2.gasoline=70;

		Car car3=new Car();
		car3.color="Green";
		car3.gasoline=80;

		final int DISTANCE=300;

		int n=0;
		int sum=0;

		while (true) {
			int result1=car1.run();
			n++;
			int x=car1.gasoline;
			sum+=result1;
			if(sum>DISTANCE) {
				System.out.println("目的地にまで"+n+"時間かかりました。残りのガソリンは、"+x+"リットルです");
				break;
			}
		}
		    n=0;
		    sum=0;
			while (true) {
				int result2=car2.run();
				n++;
				int x=car2.gasoline;
				sum+=result2;
				if(sum>DISTANCE) {
					System.out.println("目的地にまで"+n+"時間かかりました。残りのガソリンは、"+x+"リットルです");
					break;
				}
			}
			n=0;
			sum=0;
			while (true) {
				int result3=car3.run();
				n++;
				int x=car3.gasoline;
				sum+=result3;
				if(sum>DISTANCE) {
					System.out.println("目的地にまで"+n+"時間かかりました。残りのガソリンは、"+x+"リットルです");
					break;
				}
			}


		}


}

