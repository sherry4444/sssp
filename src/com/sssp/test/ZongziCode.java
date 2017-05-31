package com.sssp.test;

public class ZongziCode {

	public static void main(String[] args) {
		// int result = (int) (Math.random() * (9999 - 1000 + 1)) + 1000;
		// System.out.println(result);
		try {
			String key = "bbb";
			switch (key) {
			case "bbb":
				System.out.println("success: " + key);
				break;
			default:
				break;
			}
		} catch (Exception e) {
			System.out.println("fail: " + e.getMessage());
		}

	}
}