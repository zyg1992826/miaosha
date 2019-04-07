package cn.hdu.learn.miaosha.api;

import lombok.ToString;

import java.io.Serializable;

/**
 * Created by gaoruyi on 2018/3/5.
 */
@ToString
public class Response<T> implements Serializable {

    private static final long serialVersionUID = -750644833749014618L;
    private boolean success;
    private T result;
    private String error;

    public Response() {
        super();
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getResult() {
        return this.result;
    }

    public void setResult(T result) {
        this.success = true;
        this.result = result;
    }

    public String getError() {
        return this.error;
    }

    public void setError(String error) {
        this.success = false;
        this.error = error;
    }


    public static <T> Response<T> ok(T data) {
        Response<T> resp = new Response();
        resp.setResult(data);
        return resp;
    }

    public static <T> Response<T> ok() {
        return ok(null);
    }

    public static <T> Response<T> fail(String error) {
        Response<T> resp = new Response();
        resp.setError(error);
        return resp;
    }
}
