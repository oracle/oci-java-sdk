/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * Registry Attribute Object, to get connector details
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Attribute.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Attribute {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSensitive")
        private Boolean isSensitive;

        public Builder isSensitive(Boolean isSensitive) {
            this.isSensitive = isSensitive;
            this.__explicitlySet__.add("isSensitive");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isMandatory")
        private Boolean isMandatory;

        public Builder isMandatory(Boolean isMandatory) {
            this.isMandatory = isMandatory;
            this.__explicitlySet__.add("isMandatory");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isGenerated")
        private Boolean isGenerated;

        public Builder isGenerated(Boolean isGenerated) {
            this.isGenerated = isGenerated;
            this.__explicitlySet__.add("isGenerated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isBase64Encoded")
        private Boolean isBase64Encoded;

        public Builder isBase64Encoded(Boolean isBase64Encoded) {
            this.isBase64Encoded = isBase64Encoded;
            this.__explicitlySet__.add("isBase64Encoded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("validKeyList")
        private java.util.List<String> validKeyList;

        public Builder validKeyList(java.util.List<String> validKeyList) {
            this.validKeyList = validKeyList;
            this.__explicitlySet__.add("validKeyList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("attributeType")
        private String attributeType;

        public Builder attributeType(String attributeType) {
            this.attributeType = attributeType;
            this.__explicitlySet__.add("attributeType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Attribute build() {
            Attribute __instance__ =
                    new Attribute(
                            name,
                            isSensitive,
                            isMandatory,
                            isGenerated,
                            isBase64Encoded,
                            validKeyList,
                            attributeType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Attribute o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .isSensitive(o.getIsSensitive())
                            .isMandatory(o.getIsMandatory())
                            .isGenerated(o.getIsGenerated())
                            .isBase64Encoded(o.getIsBase64Encoded())
                            .validKeyList(o.getValidKeyList())
                            .attributeType(o.getAttributeType());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The name of of the Attribute.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * True if Attribute is sensitive.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSensitive")
    Boolean isSensitive;

    /**
     * True if Attribute is mandatory.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMandatory")
    Boolean isMandatory;

    /**
     * True if Attribute is generated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isGenerated")
    Boolean isGenerated;

    /**
     * True if Attribute is encoded.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isBase64Encoded")
    Boolean isBase64Encoded;

    /**
     * List of valid key list
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("validKeyList")
    java.util.List<String> validKeyList;

    /**
     * Attribute type details
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attributeType")
    String attributeType;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
