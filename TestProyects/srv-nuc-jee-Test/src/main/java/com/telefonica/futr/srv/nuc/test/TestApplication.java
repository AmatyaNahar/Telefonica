package com.telefonica.futr.srv.nuc.test;

import com.telefonica.coco.boot.config.Application;
import com.telefonica.coco.boot.config.ApplicationSupport;

@Application
public class TestApplication extends ApplicationSupport {

    public static void main(String[] args) {

        runService(TestApplication.class, args);
    }

}