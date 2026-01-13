/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.model.internal;

import com.oracle.bmc.http.client.Serializer;

import jakarta.annotation.Nonnull;

/** A helper class to support json related operations */
public class JsonConverter {
    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(JsonConverter.class);

    /** Get desired object from the json provided */
    public static <T> T jsonBlobToObject(@Nonnull String jsonBlob, @Nonnull Class<T> clazz) {
        if (jsonBlob == null) {
            throw new java.lang.NullPointerException("jsonBlob is marked non-null but is null");
        }
        if (clazz == null) {
            throw new java.lang.NullPointerException("clazz is marked non-null but is null");
        }
        T object = null;
        try {
            object = Serializer.getDefault().readValue(jsonBlob, clazz);
        } catch (Exception e) {
            LOG.error("Exception in parsing out json blob {}", jsonBlob, e);
        }
        return object;
    }

    /** Get json string from the object param */
    public static <T> String objectToJsonBlob(@Nonnull T object) {
        if (object == null) {
            throw new java.lang.NullPointerException("object is marked non-null but is null");
        }
        String jsonBlob = null;
        try {
            jsonBlob = Serializer.getDefault().writeValueAsString(object);
        } catch (Exception e) {
            LOG.error("Exception in writing json blob from object {}", object, e);
        }
        return jsonBlob;
    }
}
