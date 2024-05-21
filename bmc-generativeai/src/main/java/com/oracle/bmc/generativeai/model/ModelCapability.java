/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * Describes what this model can be used for.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
public enum ModelCapability {
    TextGeneration("TEXT_GENERATION"),
    TextSummarization("TEXT_SUMMARIZATION"),
    TextEmbeddings("TEXT_EMBEDDINGS"),
    FineTune("FINE_TUNE"),
    Chat("CHAT"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ModelCapability.class);

    private final String value;
    private static java.util.Map<String, ModelCapability> map;

    static {
        map = new java.util.HashMap<>();
        for (ModelCapability v : ModelCapability.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ModelCapability(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ModelCapability create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'ModelCapability', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
