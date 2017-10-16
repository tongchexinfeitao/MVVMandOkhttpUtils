package com.bewei.mvvmss.bean;

import java.util.List;

/**
 * 1. 类的用途
 * 2. @author forever
 * 3. @date 2017/10/9 15:33
 */


public class News {
    private String error;
    private List<Results> results;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public List<Results> getResults() {
        return results;
    }

    public void setResults(List<Results> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "News{" +
                "error='" + error + '\'' +
                ", results=" + results +
                '}';
    }
}
