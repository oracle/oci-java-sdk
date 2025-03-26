/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Property overrides at the scope of objects.
 * For example, if you want to use logSourceName as 'xyz' for all objects that conatins string 'abc/' then
 * define matchType as 'contains', matchValue as 'abc/', propertyName as 'logSourceName' and propertyValue as 'xyz'.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PropertyOverride.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PropertyOverride extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"matchType", "matchValue", "propertyName", "propertyValue"})
    public PropertyOverride(
            String matchType, String matchValue, String propertyName, String propertyValue) {
        super();
        this.matchType = matchType;
        this.matchValue = matchValue;
        this.propertyName = propertyName;
        this.propertyValue = propertyValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Match Type. Accepted values are: contains.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("matchType")
        private String matchType;

        /**
         * Match Type. Accepted values are: contains.
         *
         * @param matchType the value to set
         * @return this builder
         **/
        public Builder matchType(String matchType) {
            this.matchType = matchType;
            this.__explicitlySet__.add("matchType");
            return this;
        }
        /**
         * Match Value.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("matchValue")
        private String matchValue;

        /**
         * Match Value.
         * @param matchValue the value to set
         * @return this builder
         **/
        public Builder matchValue(String matchValue) {
            this.matchValue = matchValue;
            this.__explicitlySet__.add("matchValue");
            return this;
        }
        /**
         * Property to override. Accepted values are: logSourceName, charEncoding.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("propertyName")
        private String propertyName;

        /**
         * Property to override. Accepted values are: logSourceName, charEncoding.
         *
         * @param propertyName the value to set
         * @return this builder
         **/
        public Builder propertyName(String propertyName) {
            this.propertyName = propertyName;
            this.__explicitlySet__.add("propertyName");
            return this;
        }
        /**
         * Value of the property.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("propertyValue")
        private String propertyValue;

        /**
         * Value of the property.
         * @param propertyValue the value to set
         * @return this builder
         **/
        public Builder propertyValue(String propertyValue) {
            this.propertyValue = propertyValue;
            this.__explicitlySet__.add("propertyValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PropertyOverride build() {
            PropertyOverride model =
                    new PropertyOverride(
                            this.matchType, this.matchValue, this.propertyName, this.propertyValue);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PropertyOverride model) {
            if (model.wasPropertyExplicitlySet("matchType")) {
                this.matchType(model.getMatchType());
            }
            if (model.wasPropertyExplicitlySet("matchValue")) {
                this.matchValue(model.getMatchValue());
            }
            if (model.wasPropertyExplicitlySet("propertyName")) {
                this.propertyName(model.getPropertyName());
            }
            if (model.wasPropertyExplicitlySet("propertyValue")) {
                this.propertyValue(model.getPropertyValue());
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
     * Match Type. Accepted values are: contains.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("matchType")
    private final String matchType;

    /**
     * Match Type. Accepted values are: contains.
     *
     * @return the value
     **/
    public String getMatchType() {
        return matchType;
    }

    /**
     * Match Value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("matchValue")
    private final String matchValue;

    /**
     * Match Value.
     * @return the value
     **/
    public String getMatchValue() {
        return matchValue;
    }

    /**
     * Property to override. Accepted values are: logSourceName, charEncoding.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("propertyName")
    private final String propertyName;

    /**
     * Property to override. Accepted values are: logSourceName, charEncoding.
     *
     * @return the value
     **/
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * Value of the property.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("propertyValue")
    private final String propertyValue;

    /**
     * Value of the property.
     * @return the value
     **/
    public String getPropertyValue() {
        return propertyValue;
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
        sb.append("PropertyOverride(");
        sb.append("super=").append(super.toString());
        sb.append("matchType=").append(String.valueOf(this.matchType));
        sb.append(", matchValue=").append(String.valueOf(this.matchValue));
        sb.append(", propertyName=").append(String.valueOf(this.propertyName));
        sb.append(", propertyValue=").append(String.valueOf(this.propertyValue));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PropertyOverride)) {
            return false;
        }

        PropertyOverride other = (PropertyOverride) o;
        return java.util.Objects.equals(this.matchType, other.matchType)
                && java.util.Objects.equals(this.matchValue, other.matchValue)
                && java.util.Objects.equals(this.propertyName, other.propertyName)
                && java.util.Objects.equals(this.propertyValue, other.propertyValue)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.matchType == null ? 43 : this.matchType.hashCode());
        result = (result * PRIME) + (this.matchValue == null ? 43 : this.matchValue.hashCode());
        result = (result * PRIME) + (this.propertyName == null ? 43 : this.propertyName.hashCode());
        result =
                (result * PRIME)
                        + (this.propertyValue == null ? 43 : this.propertyValue.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
