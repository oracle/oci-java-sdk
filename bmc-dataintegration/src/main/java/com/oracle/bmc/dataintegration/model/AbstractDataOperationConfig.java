/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The information about the data operation.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType",
    defaultImpl = AbstractDataOperationConfig.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = WriteOperationConfig.class,
        name = "WRITE_OPERATION_CONFIG"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ReadOperationConfig.class,
        name = "READ_OPERATION_CONFIG"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class AbstractDataOperationConfig {
    @Deprecated
    @java.beans.ConstructorProperties({
        "metadataConfigProperties",
        "derivedAttributes",
        "callAttribute"
    })
    protected AbstractDataOperationConfig(
            java.util.Map<String, String> metadataConfigProperties,
            java.util.Map<String, String> derivedAttributes,
            BipCallAttribute callAttribute) {
        super();
        this.metadataConfigProperties = metadataConfigProperties;
        this.derivedAttributes = derivedAttributes;
        this.callAttribute = callAttribute;
    }

    /**
     * This map is used for passing extra metatdata configuration that is required by read / write operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadataConfigProperties")
    private final java.util.Map<String, String> metadataConfigProperties;

    /**
     * This map is used for passing extra metatdata configuration that is required by read / write operation.
     * @return the value
     **/
    public java.util.Map<String, String> getMetadataConfigProperties() {
        return metadataConfigProperties;
    }

    /**
     * this map is used for passing BIP report parameter values.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("derivedAttributes")
    private final java.util.Map<String, String> derivedAttributes;

    /**
     * this map is used for passing BIP report parameter values.
     * @return the value
     **/
    public java.util.Map<String, String> getDerivedAttributes() {
        return derivedAttributes;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("callAttribute")
    private final BipCallAttribute callAttribute;

    public BipCallAttribute getCallAttribute() {
        return callAttribute;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AbstractDataOperationConfig(");
        sb.append("metadataConfigProperties=")
                .append(String.valueOf(this.metadataConfigProperties));
        sb.append(", derivedAttributes=").append(String.valueOf(this.derivedAttributes));
        sb.append(", callAttribute=").append(String.valueOf(this.callAttribute));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AbstractDataOperationConfig)) {
            return false;
        }

        AbstractDataOperationConfig other = (AbstractDataOperationConfig) o;
        return java.util.Objects.equals(
                        this.metadataConfigProperties, other.metadataConfigProperties)
                && java.util.Objects.equals(this.derivedAttributes, other.derivedAttributes)
                && java.util.Objects.equals(this.callAttribute, other.callAttribute);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.metadataConfigProperties == null
                                ? 43
                                : this.metadataConfigProperties.hashCode());
        result =
                (result * PRIME)
                        + (this.derivedAttributes == null ? 43 : this.derivedAttributes.hashCode());
        result =
                (result * PRIME)
                        + (this.callAttribute == null ? 43 : this.callAttribute.hashCode());
        return result;
    }

    /**
     * The type of data operation.
     **/
    public enum ModelType {
        ReadOperationConfig("READ_OPERATION_CONFIG"),
        WriteOperationConfig("WRITE_OPERATION_CONFIG"),
        ;

        private final String value;
        private static java.util.Map<String, ModelType> map;

        static {
            map = new java.util.HashMap<>();
            for (ModelType v : ModelType.values()) {
                map.put(v.getValue(), v);
            }
        }

        ModelType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ModelType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ModelType: " + key);
        }
    };
}
