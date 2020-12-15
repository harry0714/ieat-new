package com.harry.iLoveEat.object;

import java.io.Serializable;

public class HttpResponseEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4240085878573577213L;

	/**
	 * 响应码
	 */
	private int code;

	/**
	 * 响应信息
	 */
	private String message;

	/**
	 * 结果数据
	 */
	private Object result;

	/**
	 * 默认构造
	 */
	public HttpResponseEntity() {
	}

	/**
	 * 返回结果
	 */
	public HttpResponseEntity(Object result) {
		this(HttpResponseCodeEnum.SUCCESS, "success", result);
	}

	/**
	 * 返回提示码 和 信息
	 */
	public HttpResponseEntity(int code, String message) {
		this.code = code;
		this.message = message;
	}

	/**
	 * 返回
	 */
	public HttpResponseEntity(int code, String message, Object result) {
		this.code = code;
		this.message = message;
		this.result = result;
	}

	/**
	 * 返回
	 */
	public HttpResponseEntity(HttpResponseCodeEnum httpResponseCodeEnum, Object result) {
		this.code = httpResponseCodeEnum.getCode();
		this.message = httpResponseCodeEnum.getMessage();
		this.result = result;
	}

	/**
	 * 返回
	 */
	public HttpResponseEntity(HttpResponseCodeEnum httpResponseCodeEnum, String message) {
		this.code = httpResponseCodeEnum.getCode();
		this.message = message;
	}

	/**
	 * 返回
	 */
	public HttpResponseEntity(HttpResponseCodeEnum httpResponseCodeEnum, String message, Object result) {
		this.code = httpResponseCodeEnum.getCode();
		this.message = message;
		this.result = result;
	}

	/**
	 * 返回成功信息
	 */
	public static HttpResponseEntity success() {
		return new HttpResponseEntity(HttpResponseCodeEnum.SUCCESS, "success");
	}

	/**
	 * 返回成功信息
	 *
	 * @param message 提示信息
	 */
	public static HttpResponseEntity success(String message) {
		return new HttpResponseEntity(HttpResponseCodeEnum.SUCCESS, message);
	}

	/**
	 * 返回成功数据
	 *
	 * @param message 提示信息
	 * @param result  结果数据
	 */
	public static HttpResponseEntity success(String message, Object result) {
		return new HttpResponseEntity(HttpResponseCodeEnum.SUCCESS, message, result);
	}

	/**
	 * 返回成功数据
	 *
	 * @param result 结果数据
	 */
	public static HttpResponseEntity result(Object result) {
		return new HttpResponseEntity(result);
	}

	/**
	 * 返回错误信息
	 *
	 * @param message 提示信息
	 */
	public static HttpResponseEntity error(String message) {
		return new HttpResponseEntity(HttpResponseCodeEnum.ERROR, message);
	}

	/**
	 * 返回指定错误码
	 *
	 * @param code    状态码
	 * @param message 提示信息
	 */
	public static HttpResponseEntity error(int code, String message) {
		return new HttpResponseEntity(code, message);
	}

	/**
	 * 返回错误结果信息
	 *
	 * @param code    状态码
	 * @param message 提示信息
	 * @param result  错误结果
	 */
	public static HttpResponseEntity error(int code, String message, Object result) {
		return new HttpResponseEntity(code, message, result);
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getResult() {
		return result;
	}

	public HttpResponseEntity setResult(Object result) {
		this.result = result;
		return this;
	}

	@Override
	public String toString() {
		return "HttpResponseEntity{" + "code=" + code + ", message='" + message + '\'' + ", result=" + result + '}';
	}
}
