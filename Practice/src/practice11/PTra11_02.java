package practice11;
/*
 * PTra11_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra11_02 {
	public static void main(String[] args) {

		java.util.Scanner scanner=new java.util.Scanner(System.in);
		// ★ ReadFileClassのクラスメソッドreadBookDataFile()を使い、本情報を取得します

		System.out.println("探したい本のタイトル（又はその一部）を入力してください");

		String line  =scanner.nextLine();

		Book[]result=FileReaderClass.readBookDataFile();

		// ★ ユーザが入力した文字列が、本情報のタイトル一部に含まれていた場合は、その本情報を出力してください
		for(int i=0;i<result.length;i++) {
			if(result[i].title.contains(line)) {
				System.out.println(result[i].dispBookInfo());
			}


		}


	}

}
