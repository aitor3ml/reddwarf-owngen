/*-
 * See the file LICENSE for redistribution information.
 *
 * Copyright (c) 2002, 2013 Oracle and/or its affiliates.  All rights reserved.
 *
 */

package com.sleepycat.je;

import com.sleepycat.util.ConfigBeanInfoBase;

import java.beans.BeanDescriptor;
import java.beans.PropertyDescriptor;

/**
 * @hidden
 * Getter/Setters for JavaBean based tools.
 */
public class EnvironmentMutableConfigBeanInfo extends ConfigBeanInfoBase {
    
    @Override
    public BeanDescriptor getBeanDescriptor() {
        return getBdescriptor(EnvironmentMutableConfig.class);
    }

    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        return getPdescriptor(EnvironmentMutableConfig.class);
    }
}
