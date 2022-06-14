/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * DataAsset & Connection Registry Attributes
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Type.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Type {
    @Deprecated
    @java.beans.ConstructorProperties({"dataAssetAttributes", "connectionAttributes"})
    public Type(
            java.util.List<Attribute> dataAssetAttributes,
            java.util.Map<String, java.util.List<Attribute>> connectionAttributes) {
        super();
        this.dataAssetAttributes = dataAssetAttributes;
        this.connectionAttributes = connectionAttributes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * list of attributes for the dataAsset
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataAssetAttributes")
        private java.util.List<Attribute> dataAssetAttributes;

        /**
         * list of attributes for the dataAsset
         * @param dataAssetAttributes the value to set
         * @return this builder
         **/
        public Builder dataAssetAttributes(java.util.List<Attribute> dataAssetAttributes) {
            this.dataAssetAttributes = dataAssetAttributes;
            this.__explicitlySet__.add("dataAssetAttributes");
            return this;
        }
        /**
         * Map of connectionType as key and List of attributes as value
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("connectionAttributes")
        private java.util.Map<String, java.util.List<Attribute>> connectionAttributes;

        /**
         * Map of connectionType as key and List of attributes as value
         * @param connectionAttributes the value to set
         * @return this builder
         **/
        public Builder connectionAttributes(
                java.util.Map<String, java.util.List<Attribute>> connectionAttributes) {
            this.connectionAttributes = connectionAttributes;
            this.__explicitlySet__.add("connectionAttributes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Type build() {
            Type __instance__ = new Type(dataAssetAttributes, connectionAttributes);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Type o) {
            Builder copiedBuilder =
                    dataAssetAttributes(o.getDataAssetAttributes())
                            .connectionAttributes(o.getConnectionAttributes());

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
     * list of attributes for the dataAsset
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataAssetAttributes")
    private final java.util.List<Attribute> dataAssetAttributes;

    /**
     * list of attributes for the dataAsset
     * @return the value
     **/
    public java.util.List<Attribute> getDataAssetAttributes() {
        return dataAssetAttributes;
    }

    /**
     * Map of connectionType as key and List of attributes as value
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectionAttributes")
    private final java.util.Map<String, java.util.List<Attribute>> connectionAttributes;

    /**
     * Map of connectionType as key and List of attributes as value
     * @return the value
     **/
    public java.util.Map<String, java.util.List<Attribute>> getConnectionAttributes() {
        return connectionAttributes;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Type(");
        sb.append("dataAssetAttributes=").append(String.valueOf(this.dataAssetAttributes));
        sb.append(", connectionAttributes=").append(String.valueOf(this.connectionAttributes));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Type)) {
            return false;
        }

        Type other = (Type) o;
        return java.util.Objects.equals(this.dataAssetAttributes, other.dataAssetAttributes)
                && java.util.Objects.equals(this.connectionAttributes, other.connectionAttributes)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.dataAssetAttributes == null
                                ? 43
                                : this.dataAssetAttributes.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionAttributes == null
                                ? 43
                                : this.connectionAttributes.hashCode());
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
