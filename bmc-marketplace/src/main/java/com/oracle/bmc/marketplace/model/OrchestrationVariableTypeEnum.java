/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.marketplace.model;

/**
 * Possible data types for an orchestration variable.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
public enum OrchestrationVariableTypeEnum {
    String("STRING"),
    Integer("INTEGER"),
    ;

    private final String value;
    private static java.util.Map<String, OrchestrationVariableTypeEnum> map;

    static {
        map = new java.util.HashMap<>();
        for (OrchestrationVariableTypeEnum v : OrchestrationVariableTypeEnum.values()) {
            map.put(v.getValue(), v);
        }
    }

    OrchestrationVariableTypeEnum(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static OrchestrationVariableTypeEnum create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new RuntimeException("Invalid OrchestrationVariableTypeEnum: " + key);
    }
}
