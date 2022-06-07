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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Attribute.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Attribute {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "isSensitive",
        "isMandatory",
        "isGenerated",
        "isBase64Encoded",
        "validKeyList",
        "attributeType"
    })
    public Attribute(
            String name,
            Boolean isSensitive,
            Boolean isMandatory,
            Boolean isGenerated,
            Boolean isBase64Encoded,
            java.util.List<String> validKeyList,
            String attributeType) {
        super();
        this.name = name;
        this.isSensitive = isSensitive;
        this.isMandatory = isMandatory;
        this.isGenerated = isGenerated;
        this.isBase64Encoded = isBase64Encoded;
        this.validKeyList = validKeyList;
        this.attributeType = attributeType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The name of of the Attribute.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    public String getName() {
        return name;
    }

    /**
     * True if Attribute is sensitive.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSensitive")
    private final Boolean isSensitive;

    public Boolean getIsSensitive() {
        return isSensitive;
    }

    /**
     * True if Attribute is mandatory.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMandatory")
    private final Boolean isMandatory;

    public Boolean getIsMandatory() {
        return isMandatory;
    }

    /**
     * True if Attribute is generated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isGenerated")
    private final Boolean isGenerated;

    public Boolean getIsGenerated() {
        return isGenerated;
    }

    /**
     * True if Attribute is encoded.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isBase64Encoded")
    private final Boolean isBase64Encoded;

    public Boolean getIsBase64Encoded() {
        return isBase64Encoded;
    }

    /**
     * List of valid key list
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("validKeyList")
    private final java.util.List<String> validKeyList;

    public java.util.List<String> getValidKeyList() {
        return validKeyList;
    }

    /**
     * Attribute type details
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attributeType")
    private final String attributeType;

    public String getAttributeType() {
        return attributeType;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Attribute(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", isSensitive=").append(String.valueOf(this.isSensitive));
        sb.append(", isMandatory=").append(String.valueOf(this.isMandatory));
        sb.append(", isGenerated=").append(String.valueOf(this.isGenerated));
        sb.append(", isBase64Encoded=").append(String.valueOf(this.isBase64Encoded));
        sb.append(", validKeyList=").append(String.valueOf(this.validKeyList));
        sb.append(", attributeType=").append(String.valueOf(this.attributeType));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Attribute)) {
            return false;
        }

        Attribute other = (Attribute) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.isSensitive, other.isSensitive)
                && java.util.Objects.equals(this.isMandatory, other.isMandatory)
                && java.util.Objects.equals(this.isGenerated, other.isGenerated)
                && java.util.Objects.equals(this.isBase64Encoded, other.isBase64Encoded)
                && java.util.Objects.equals(this.validKeyList, other.validKeyList)
                && java.util.Objects.equals(this.attributeType, other.attributeType)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.isSensitive == null ? 43 : this.isSensitive.hashCode());
        result = (result * PRIME) + (this.isMandatory == null ? 43 : this.isMandatory.hashCode());
        result = (result * PRIME) + (this.isGenerated == null ? 43 : this.isGenerated.hashCode());
        result =
                (result * PRIME)
                        + (this.isBase64Encoded == null ? 43 : this.isBase64Encoded.hashCode());
        result = (result * PRIME) + (this.validKeyList == null ? 43 : this.validKeyList.hashCode());
        result =
                (result * PRIME)
                        + (this.attributeType == null ? 43 : this.attributeType.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
