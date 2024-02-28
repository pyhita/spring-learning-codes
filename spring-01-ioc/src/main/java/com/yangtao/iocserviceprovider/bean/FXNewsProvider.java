package com.yangtao.iocserviceprovider.bean;

/**
 * @Author: kante_yang
 * @Date: 2024/2/20
 */
public class FXNewsProvider {

    private FXNewsListener fxNewsListener;
    private FXNewsPersister fxNewsPersister;

    public FXNewsProvider(FXNewsListener fxNewsListener, FXNewsPersister fxNewsPersister) {
        this.fxNewsListener = fxNewsListener;
        this.fxNewsPersister = fxNewsPersister;
    }

    public FXNewsListener getFxNewsListener() {
        return fxNewsListener;
    }

    public void setFxNewsListener(FXNewsListener fxNewsListener) {
        this.fxNewsListener = fxNewsListener;
    }

    public FXNewsPersister getFxNewsPersister() {
        return fxNewsPersister;
    }

    public void setFxNewsPersister(FXNewsPersister fxNewsPersister) {
        this.fxNewsPersister = fxNewsPersister;
    }
}
