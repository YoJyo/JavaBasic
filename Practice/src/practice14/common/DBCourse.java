package practice14.common;

public class DBCourse implements Course{

	String PREFIX = "【Eラーニング】DB基礎";


	public String getCourseName() {

		return PREFIX;
	}

	String[] courseUnit= {"DB基礎","SQL基礎","正規化","SQL応用"};

	public String[] getCourseUnit() {

		return courseUnit;
	}



}
