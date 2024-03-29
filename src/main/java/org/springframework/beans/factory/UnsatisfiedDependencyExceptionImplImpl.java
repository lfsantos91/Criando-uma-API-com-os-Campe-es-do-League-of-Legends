package org.springframework.beans.factory;

public class UnsatisfiedDependencyExceptionImplImpl extends UnsatisfiedDependencyExceptionImpl {
    public UnsatisfiedDependencyExceptionImplImpl(String resourceDescription, String beanName, String propertyName, String msg) {
        super(resourceDescription, beanName, propertyName, msg);
    }
}
