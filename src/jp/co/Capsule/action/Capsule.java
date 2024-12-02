package jp.co.Capsule.action;

public class Capsule {

		public static void main(String[] args) {

			Person taro = new Person("山田太郎",20);

			System.out.println(taro.getName());

			//太郎の名前を花子に変更
			taro.setName("花子");
			System.out.println(taro.getName());


			System.out.println(taro.getAge());

			//太郎の年齢を３０に変更
			taro.setAge(30);;
			System.out.println(taro.getAge());

		}

}
