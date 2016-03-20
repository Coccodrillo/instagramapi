package com.instagram.instagramapi.objects;

/**
 * Created by Sayyam on 3/18/16.
 */
public class InstagramException extends Exception {

    String error;
    String errorReason;

    public InstagramException() {
    }

    public InstagramException(String detailMessage) {
        super(detailMessage);
    }

    public InstagramException(String detailMessage, String error, String errorReason) {
        super(detailMessage);
        this.error = error;
        this.errorReason = errorReason;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getErrorReason() {
        return errorReason;
    }

    public void setErrorReason(String errorReason) {
        this.errorReason = errorReason;
    }
}
