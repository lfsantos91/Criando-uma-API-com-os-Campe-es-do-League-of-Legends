package org.springframework.beans.factory;

public class UnsatisfiedDependencyExceptionImpl extends UnsatisfiedDependencyException {
    public UnsatisfiedDependencyExceptionImpl(String resourceDescription, String beanName, String propertyName, String msg) {
        super(resourceDescription, beanName, propertyName, msg);
    }
}
