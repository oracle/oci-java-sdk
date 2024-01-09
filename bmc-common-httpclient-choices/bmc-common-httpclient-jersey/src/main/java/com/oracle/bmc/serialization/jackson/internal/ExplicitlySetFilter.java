/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.serialization.jackson.internal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.oracle.bmc.http.client.InternalSdk;
import com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel;

import java.lang.reflect.Field;
import java.util.Set;

import static com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME;
import static com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_PROPERTY_NAME;

@InternalSdk
public class ExplicitlySetFilter extends SimpleBeanPropertyFilter {
    public static final ExplicitlySetFilter INSTANCE = new ExplicitlySetFilter();
    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ExplicitlySetFilter.class);

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
                }
                // null, find out if null was explicitly set using the
                //      method from BmcModel common class
                else if (pojo instanceof ExplicitlySetBmcModel) {
                    if (((ExplicitlySetBmcModel) pojo).wasPropertyExplicitlySet(writer.getName())) {
                        writer.serializeAsField(pojo, jgen, provider);
                    }
                }
                // To be removed on the next architecture-level change
                //      kept for compatibility reasons
                // null, find out if model has explicitlySet property
                else if (hasExplicitlySetInAField(pojo, writer)) {
                    writer.serializeAsField(pojo, jgen, provider);
                }
            } finally {
                field.setAccessible(accessible);
            }
        } else if (!jgen.canOmitFields()) {
            // since 2.3
            writer.serializeAsOmittedField(pojo, jgen, provider);
        }
    }

    @Deprecated
    @SuppressWarnings("unchecked")
    private boolean hasExplicitlySetInAField(Object pojo, PropertyWriter writer) throws Exception {
        Field explicitField = pojo.getClass().getDeclaredField(EXPLICITLY_SET_FILTER_NAME);
        boolean explicitAccessible = explicitField.isAccessible();
        try {
            explicitField.setAccessible(true);
            Set<String> explicitlySet = (Set<String>) explicitField.get(pojo);
            if (explicitlySet.contains(writer.getName())) {
                return true;
            }
        } finally {
            explicitField.setAccessible(explicitAccessible);
        }

        return false;
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
        String lowerCamelCased = lowerUnderscoreToLowerCamel(fieldName);
        try {
            return getDeclaredField(pojoClass, lowerCamelCased);
        } catch (NoSuchFieldException nsfe) {
            LOG.debug(
                    "Exact field name match failed for %s, lower camel-case %s didn't work either",
                    fieldName, lowerCamelCased);
            // Look through all fields and find a field with a matching JsonProperty annotation
            for (Field f : pojoClass.getDeclaredFields()) {
                for (JsonProperty a : f.getAnnotationsByType(JsonProperty.class)) {
                    if (fieldName.equals(a.value())) {
                        return f;
                    }
                }
            }
            throw nsfe;
        }
    }

    @Override
    protected boolean include(BeanPropertyWriter writer) {
        return include((PropertyWriter) writer);
    }

    @Override
    protected boolean include(PropertyWriter writer) {
        return !EXPLICITLY_SET_PROPERTY_NAME.equals(writer.getName());
    }

    private static String lowerUnderscoreToLowerCamel(String s) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '_') {
                sb.deleteCharAt(i);
                sb.replace(i, i + 1, String.valueOf(Character.toUpperCase(sb.charAt(i))));
            }
        }
        return sb.toString();
    }
}
