package com.mm_project.common.code;

public enum ErrorCode {
	
	DATABASE_ACCESS_ERROR("데이터베이스와 통신 중 에러가 발생하였습니다."),
	FAILED_VALIDATED_ERROR("데이터가 양식이 적합하지 않습니다."),
	MAIL_SEND_FAIL_ERROR("이메일 발송 중 에러가 발생하였습니다."),
	HTTP_CONNECT_ERROR("HTTP 통신 중 에러가 발생하였습니다."),
	AUTHENTICATION_FAILED_ERROR("유효하지 않은 인증입니다."),
	UNAUTHORIZED_PAGE("접근 권한이 없는 페이지 입니다."),
	REDIRECT_LOGIN_PAGE_NO_MESSAGE("","/member/login"),
	FAILED_FILE_UPLOAD_ERROR("파일업로드에 실패했습니다."),
	REDIRECT("");
	
	public final String MSSSAGE;
	public final String URL;
	
	ErrorCode(String msg){
		this.MSSSAGE = msg;
		this.URL = "/";
	}
	
	ErrorCode(String msg, String url){
		this.MSSSAGE = msg;
		this.URL = url;
	}
	
	
}
