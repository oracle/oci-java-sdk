/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.internal;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.google.common.base.CaseFormat;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
import java.util.Set;

@Slf4j
public class ExplicitlySetFilter extends SimpleBeanPropertyFilter {
    public static final ExplicitlySetFilter INSTANCE = new ExplicitlySetFilter();
    public static final String NAME = "explicitlySetFilter";
    public static final String FIELD_NAME = "__explicitlySet__";

    private ExplicitlySetFilter() {}

    @Override
    public void serializeAsField(
            Object pojo, JsonGenerator jgen, SerializerProvider provider, PropertyWriter writer)
            throws Exception {
        if (include(writer)) {
            Field field = getMatchingDeclaredField(pojo.getClass(), writer.getName());
            boolean accessible = field.isAccessible();
            try {
                field.setAccessible(true);
                Object fieldValue = field.get(pojo);
                if (fieldValue != null) {
                    // not null, definitely serialize
                    writer.serializeAsField(pojo, jgen, provider);
                } else {
                    // null, find out if null was explicitly set
                    Field explicitField = pojo.getClass().getDeclaredField(FIELD_NAME);
                    boolean explicitAccessible = explicitField.isAccessible();
                    try {
                        explicitField.setAccessible(true);
                        Set<String> explicitlySet = (Set<String>) explicitField.get(pojo);
                        if (explicitlySet.contains(writer.getName())) {
                            // explicitly set, serialize
                            writer.serializeAsField(pojo, jgen, provider);
                        }
                    } finally {
                        explicitField.setAccessible(explicitAccessible);
                    }
                }
            } finally {
                field.setAccessible(accessible);
            }
        } else if (!jgen.canOmitFields()) { // since 2.3
            writer.serializeAsOmittedField(pojo, jgen, provider);
        }
    }

    private static Field getDeclaredField(Class<?> pojoClass, String fieldName)
            throws NoSuchFieldException {
        try {
            return pojoClass.getDeclaredField(fieldName);
        } catch (NoSuchFieldException nsfe) {
            Class<?> superclass = pojoClass.getSuperclass();
            if (superclass != null) {
                return getDeclaredField(superclass, fieldName);
            } else {
                throw nsfe;
            }
        }
    }

    private static Field getMatchingDeclaredField(Class<?> pojoClass, String fieldName)
            throws NoSuchFieldException {
        // Try matching the exact field name
        try {
            return getDeclaredField(pojoClass, fieldName);
        } catch (NoSuchFieldException nsfe) {
            LOG.debug("Exact field name match failed for {}", fieldName);
        }
        // If not found, try converting the field name from snake case to camel case
        return getDeclaredField(
                pojoClass, CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, fieldName));
    }

    @Override
    protected boolean include(BeanPropertyWriter writer) {
        return !FIELD_NAME.equals(writer.getName());
    }

    @Override
    protected boolean include(PropertyWriter writer) {
        return !FIELD_NAME.equals(writer.getName());
    }
}
