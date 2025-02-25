/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Rule condition
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Condition.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Condition extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"attrGroup", "attrKey", "attrValue"})
    public Condition(String attrGroup, String attrKey, String attrValue) {
        super();
        this.attrGroup = attrGroup;
        this.attrKey = attrKey;
        this.attrValue = attrValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Attribute Group. Provide a Tag namespace if the rule is based on a tag.
         * Provide resource type if the rule is based on a resource property.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("attrGroup")
        private String attrGroup;

        /**
         * Attribute Group. Provide a Tag namespace if the rule is based on a tag.
         * Provide resource type if the rule is based on a resource property.
         *
         * @param attrGroup the value to set
         * @return this builder
         **/
        public Builder attrGroup(String attrGroup) {
            this.attrGroup = attrGroup;
            this.__explicitlySet__.add("attrGroup");
            return this;
        }
        /**
         * Attribute Key.Provide Tag key if the rule is based on a tag.
         * Provide resource property name if the rule is based on a resource property.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("attrKey")
        private String attrKey;

        /**
         * Attribute Key.Provide Tag key if the rule is based on a tag.
         * Provide resource property name if the rule is based on a resource property.
         *
         * @param attrKey the value to set
         * @return this builder
         **/
        public Builder attrKey(String attrKey) {
            this.attrKey = attrKey;
            this.__explicitlySet__.add("attrKey");
            return this;
        }
        /**
         * Attribute Value.Provide Tag value if the rule is based on a tag.
         * Provide resource property value if the rule is based on a resource property.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("attrValue")
        private String attrValue;

        /**
         * Attribute Value.Provide Tag value if the rule is based on a tag.
         * Provide resource property value if the rule is based on a resource property.
         *
         * @param attrValue the value to set
         * @return this builder
         **/
        public Builder attrValue(String attrValue) {
            this.attrValue = attrValue;
            this.__explicitlySet__.add("attrValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Condition build() {
            Condition model = new Condition(this.attrGroup, this.attrKey, this.attrValue);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Condition model) {
            if (model.wasPropertyExplicitlySet("attrGroup")) {
                this.attrGroup(model.getAttrGroup());
            }
            if (model.wasPropertyExplicitlySet("attrKey")) {
                this.attrKey(model.getAttrKey());
            }
            if (model.wasPropertyExplicitlySet("attrValue")) {
                this.attrValue(model.getAttrValue());
            }
            return this;
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
     * Attribute Group. Provide a Tag namespace if the rule is based on a tag.
     * Provide resource type if the rule is based on a resource property.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attrGroup")
    private final String attrGroup;

    /**
     * Attribute Group. Provide a Tag namespace if the rule is based on a tag.
     * Provide resource type if the rule is based on a resource property.
     *
     * @return the value
     **/
    public String getAttrGroup() {
        return attrGroup;
    }

    /**
     * Attribute Key.Provide Tag key if the rule is based on a tag.
     * Provide resource property name if the rule is based on a resource property.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attrKey")
    private final String attrKey;

    /**
     * Attribute Key.Provide Tag key if the rule is based on a tag.
     * Provide resource property name if the rule is based on a resource property.
     *
     * @return the value
     **/
    public String getAttrKey() {
        return attrKey;
    }

    /**
     * Attribute Value.Provide Tag value if the rule is based on a tag.
     * Provide resource property value if the rule is based on a resource property.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attrValue")
    private final String attrValue;

    /**
     * Attribute Value.Provide Tag value if the rule is based on a tag.
     * Provide resource property value if the rule is based on a resource property.
     *
     * @return the value
     **/
    public String getAttrValue() {
        return attrValue;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Condition(");
        sb.append("super=").append(super.toString());
        sb.append("attrGroup=").append(String.valueOf(this.attrGroup));
        sb.append(", attrKey=").append(String.valueOf(this.attrKey));
        sb.append(", attrValue=").append(String.valueOf(this.attrValue));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Condition)) {
            return false;
        }

        Condition other = (Condition) o;
        return java.util.Objects.equals(this.attrGroup, other.attrGroup)
                && java.util.Objects.equals(this.attrKey, other.attrKey)
                && java.util.Objects.equals(this.attrValue, other.attrValue)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.attrGroup == null ? 43 : this.attrGroup.hashCode());
        result = (result * PRIME) + (this.attrKey == null ? 43 : this.attrKey.hashCode());
        result = (result * PRIME) + (this.attrValue == null ? 43 : this.attrValue.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
