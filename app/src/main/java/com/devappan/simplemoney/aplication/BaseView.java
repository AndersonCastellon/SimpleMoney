package com.devappan.simplemoney.aplication;

public interface BaseView<T> {
    void showEmpty();
    void showError();
    void showContent(T content);
}
