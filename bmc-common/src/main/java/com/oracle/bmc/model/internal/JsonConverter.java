/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.model.internal;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

/**
 * A helper class to support json related operations
 */
@Slf4j
public class JsonConverter {

    /**
     * Object mapper to support jackson json operations
     */
    private static final ObjectMapper mapper = new ObjectMapper();

    /**
     * Get desired object from the json provided
     */
    public static <T> T jsonBlobToObject(@NonNull String jsonBlob, @NonNull Class<T> clazz) {
        T object = null;
        try {
            object = mapper.readValue(jsonBlob, clazz);
        } catch (Exception e) {
            LOG.error("Exception in parsing out json blob {}", jsonBlob, e);
        }
        return object;
    }

    /**
     * Get json string from the object param
     */
    public static <T> String objectToJsonBlob(@NonNull T object) {
        String jsonBlob = null;
        try {
            jsonBlob = mapper.writeValueAsString(object);
        } catch (Exception e) {
            LOG.error("Exception in writing json blob from object {}", object, e);
        }
        return jsonBlob;
    }
}
