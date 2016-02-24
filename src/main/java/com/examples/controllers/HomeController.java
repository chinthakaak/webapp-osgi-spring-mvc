package com.examples.controllers;

//import org.osgi.framework.BundleContext;
//import org.osgi.service.cm.ConfigurationAdmin;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
//import org.springframework.osgi.context.BundleContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ka40215 on 2/20/16.
 */
@Controller
public class HomeController {//implements ApplicationContextAware, BundleContextAware {
    @RequestMapping({"/", "/home"})
    public String showHomePage() {
        return "home";
    }

//    @Autowired
//    BundleContext bundleContext;
//
//    @Autowired
//    ApplicationContext applicationContext;
//
//    @Autowired
//    ConfigurationAdmin configurationAdmin;
//
//    public BundleContext getBundleContext() {
//        return bundleContext;
//    }
//
//    public void setBundleContext(BundleContext bundleContext) {
//        this.bundleContext = bundleContext;
//    }
//
//    public ConfigurationAdmin getConfigurationAdmin() {
//        return configurationAdmin;
//    }
//
//    public void setConfigurationAdmin(ConfigurationAdmin configurationAdmin) {
//        this.configurationAdmin = configurationAdmin;
//    }
//
//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        this.applicationContext=applicationContext;
//    }
}
