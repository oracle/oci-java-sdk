/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * DataAsset and Connection Registry Attributes <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Type.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class Type extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** The list of attributes of the data asset. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataAssetAttributes")
        private java.util.List<Attribute> dataAssetAttributes;

        /**
         * The list of attributes of the data asset.
         *
         * @param dataAssetAttributes the value to set
         * @return this builder
         */
        public Builder dataAssetAttributes(java.util.List<Attribute> dataAssetAttributes) {
            this.dataAssetAttributes = dataAssetAttributes;
            this.__explicitlySet__.add("dataAssetAttributes");
            return this;
        }
        /** Mapping the connectionType as the key to the list of attributes as the value. */
        @com.fasterxml.jackson.annotation.JsonProperty("connectionAttributes")
        private java.util.Map<String, java.util.List<Attribute>> connectionAttributes;

        /**
         * Mapping the connectionType as the key to the list of attributes as the value.
         *
         * @param connectionAttributes the value to set
         * @return this builder
         */
        public Builder connectionAttributes(
                java.util.Map<String, java.util.List<Attribute>> connectionAttributes) {
            this.connectionAttributes = connectionAttributes;
            this.__explicitlySet__.add("connectionAttributes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Type build() {
            Type model = new Type(this.dataAssetAttributes, this.connectionAttributes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Type model) {
            if (model.wasPropertyExplicitlySet("dataAssetAttributes")) {
                this.dataAssetAttributes(model.getDataAssetAttributes());
            }
            if (model.wasPropertyExplicitlySet("connectionAttributes")) {
                this.connectionAttributes(model.getConnectionAttributes());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The list of attributes of the data asset. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataAssetAttributes")
    private final java.util.List<Attribute> dataAssetAttributes;

    /**
     * The list of attributes of the data asset.
     *
     * @return the value
     */
    public java.util.List<Attribute> getDataAssetAttributes() {
        return dataAssetAttributes;
    }

    /** Mapping the connectionType as the key to the list of attributes as the value. */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionAttributes")
    private final java.util.Map<String, java.util.List<Attribute>> connectionAttributes;

    /**
     * Mapping the connectionType as the key to the list of attributes as the value.
     *
     * @return the value
     */
    public java.util.Map<String, java.util.List<Attribute>> getConnectionAttributes() {
        return connectionAttributes;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Type(");
        sb.append("super=").append(super.toString());
        sb.append("dataAssetAttributes=").append(String.valueOf(this.dataAssetAttributes));
        sb.append(", connectionAttributes=").append(String.valueOf(this.connectionAttributes));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
