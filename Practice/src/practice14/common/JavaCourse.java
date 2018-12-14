package practice14.common;

public class JavaCourse implements Course{

	String PREFIX = "【Eラーニング】java";



	public String getCourseName() {
		return PREFIX;
	}

	String[] courseUnit= {"式と演算","制御構文メソッド", "配列","オブジェクト","指向継承高度な継承"};

	public String[] getCourseUnit() {

		  return courseUnit;
	}


}
