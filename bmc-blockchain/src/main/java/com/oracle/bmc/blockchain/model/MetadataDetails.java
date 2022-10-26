/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.blockchain.model;

/**
 * Metadata parameter details <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191010")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MetadataDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class MetadataDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"paramName", "paramValue", "isJsonValue"})
    public MetadataDetails(String paramName, String paramValue, Boolean isJsonValue) {
        super();
        this.paramName = paramName;
        this.paramValue = paramValue;
        this.isJsonValue = isJsonValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Metadata param name */
        @com.fasterxml.jackson.annotation.JsonProperty("paramName")
        private String paramName;

        /**
         * Metadata param name
         *
         * @param paramName the value to set
         * @return this builder
         */
        public Builder paramName(String paramName) {
            this.paramName = paramName;
            this.__explicitlySet__.add("paramName");
            return this;
        }
        /** Metadata param value. Complex value will be a JSON string. */
        @com.fasterxml.jackson.annotation.JsonProperty("paramValue")
        private String paramValue;

        /**
         * Metadata param value. Complex value will be a JSON string.
         *
         * @param paramValue the value to set
         * @return this builder
         */
        public Builder paramValue(String paramValue) {
            this.paramValue = paramValue;
            this.__explicitlySet__.add("paramValue");
            return this;
        }
        /** Indicates if the value is a JSON string */
        @com.fasterxml.jackson.annotation.JsonProperty("isJsonValue")
        private Boolean isJsonValue;

        /**
         * Indicates if the value is a JSON string
         *
         * @param isJsonValue the value to set
         * @return this builder
         */
        public Builder isJsonValue(Boolean isJsonValue) {
            this.isJsonValue = isJsonValue;
            this.__explicitlySet__.add("isJsonValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MetadataDetails build() {
            MetadataDetails model =
                    new MetadataDetails(this.paramName, this.paramValue, this.isJsonValue);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MetadataDetails model) {
            if (model.wasPropertyExplicitlySet("paramName")) {
                this.paramName(model.getParamName());
            }
            if (model.wasPropertyExplicitlySet("paramValue")) {
                this.paramValue(model.getParamValue());
            }
            if (model.wasPropertyExplicitlySet("isJsonValue")) {
                this.isJsonValue(model.getIsJsonValue());
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

    /** Metadata param name */
    @com.fasterxml.jackson.annotation.JsonProperty("paramName")
    private final String paramName;

    /**
     * Metadata param name
     *
     * @return the value
     */
    public String getParamName() {
        return paramName;
    }

    /** Metadata param value. Complex value will be a JSON string. */
    @com.fasterxml.jackson.annotation.JsonProperty("paramValue")
    private final String paramValue;

    /**
     * Metadata param value. Complex value will be a JSON string.
     *
     * @return the value
     */
    public String getParamValue() {
        return paramValue;
    }

    /** Indicates if the value is a JSON string */
    @com.fasterxml.jackson.annotation.JsonProperty("isJsonValue")
    private final Boolean isJsonValue;

    /**
     * Indicates if the value is a JSON string
     *
     * @return the value
     */
    public Boolean getIsJsonValue() {
        return isJsonValue;
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
        sb.append("MetadataDetails(");
        sb.append("super=").append(super.toString());
        sb.append("paramName=").append(String.valueOf(this.paramName));
        sb.append(", paramValue=").append(String.valueOf(this.paramValue));
        sb.append(", isJsonValue=").append(String.valueOf(this.isJsonValue));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MetadataDetails)) {
            return false;
        }

        MetadataDetails other = (MetadataDetails) o;
        return java.util.Objects.equals(this.paramName, other.paramName)
                && java.util.Objects.equals(this.paramValue, other.paramValue)
                && java.util.Objects.equals(this.isJsonValue, other.isJsonValue)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.paramName == null ? 43 : this.paramName.hashCode());
        result = (result * PRIME) + (this.paramValue == null ? 43 : this.paramValue.hashCode());
        result = (result * PRIME) + (this.isJsonValue == null ? 43 : this.isJsonValue.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
