package com.mm_project.common.code;

public enum Config {
	
	//DOMAIN("http://www.pclass.com"),
	DOMAIN("http://localhost:9090"),
	SMTP_AUTHENTICATION_ID("wjdduddns270@gmail.com"),
	SMTP_AUTHENTICATION_PASSWORD("135a135a!"),
	COMPANY_EMAIL("wjdduddns270@gmail.com"),
	//UPLOAD_PATH("C:\\CODE\\upload\\"); 운영서버
	UPLOAD_PATH("C:\\CODE\\upload\\"); //개발서버
	
	
	public final String DESC;
	
	private Config(String desc) {
		this.DESC = desc;
	}	

}
