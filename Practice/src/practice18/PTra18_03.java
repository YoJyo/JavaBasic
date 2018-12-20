/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import entity.Player;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> array = new ArrayList<Player>();
		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				String[] array1 = line.split(",", 0);
				Player player = new Player();

				player.setPosition(array1[0]);
				player.setName(array1[1]);
				player.setCountry(array1[2]);
				player.setTeam(array1[3]);

				array.add(player);

			}

		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		}
		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i).getTeam().contains("レアル・マドリード")) {
				array.remove(i);
			}
			if (array.get(i).getTeam().contains("バルセロナ")) {
				array.remove(i);
			}

		}

		// ★ 削除後のArrayListの中身を全件出力してください
		for (Player str : array) {

			System.out.println(str.toString());

		}
	}
}
