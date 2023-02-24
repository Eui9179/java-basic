package org.basic.day5.init_execise;

class Main {
	public static void main(String[] args) {
		new 사람();
		new 사람();
		new 사람();
	}
}

class 동물 {
	동물() {
		init();
	}

	void init() { }
}

class 사람 extends 동물 {
	void init() {
		System.out.println("사람이 초기화 됩니다.");
	}
}