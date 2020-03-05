class JSample1_3{
	public static void main(String[] args){
		System.out.println("こんにちは");
	}
} 

/*
文字コードUTF-8で保存されているためwindowsで普通にコンパイルして実行すると文字化けを起こす。
解決策はコンパイル時に
javac -encoding　エンコーディング名　ソースファイル名.java
とする
*/