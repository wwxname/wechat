package com.td.spm.rest.web.common;

public class Configure {
	private static String key = "EfZo0Ex4PCvmBFLNJLxD0KpyRLMrwcyr";
	//小程序ID	
	private static String appID = "wx76b016d55868cd04";
	//商户号
	private static String mch_id = "1494207272";
	//
	private static String secret = "e88e514b8eb1d18a29f133f4fe088485";

	public static String getSecret() {
		return secret;
	}

	public static void setSecret(String secret) {
		Configure.secret = secret;
	}

	public static String getKey() {
		return key;
	}

	public static void setKey(String key) {
		Configure.key = key;
	}

	public static String getAppID() {
		return appID;
	}

	public static void setAppID(String appID) {
		Configure.appID = appID;
	}

	public static String getMch_id() {
		return mch_id;
	}

	public static void setMch_id(String mch_id) {
		Configure.mch_id = mch_id;
	}

}
