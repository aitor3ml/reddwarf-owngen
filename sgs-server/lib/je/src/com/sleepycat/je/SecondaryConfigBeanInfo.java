/*-
 * See the file LICENSE for redistribution information.
 *
 * Copyright (c) 2002, 2013 Oracle and/or its affiliates.  All rights reserved.
 *
 */

package com.sleepycat.je;

import java.beans.BeanDescriptor;
import java.beans.PropertyDescriptor;

/**
 * @hidden
 * Getter/Setters for JavaBean based tools.
 */
public class SecondaryConfigBeanInfo extends DatabaseConfigBeanInfo {

    @Override
    public BeanDescriptor getBeanDescriptor() {
        return getBdescriptor(SecondaryConfig.class);
    }

    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        return getPdescriptor(SecondaryConfig.class);
    }
}
