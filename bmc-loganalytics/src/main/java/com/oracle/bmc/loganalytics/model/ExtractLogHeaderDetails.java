/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * log header values <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExtractLogHeaderDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExtractLogHeaderDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"logKey", "headerValues"})
    public ExtractLogHeaderDetails(String logKey, java.util.List<String> headerValues) {
        super();
        this.logKey = logKey;
        this.headerValues = headerValues;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The log key. */
        @com.fasterxml.jackson.annotation.JsonProperty("logKey")
        private String logKey;

        /**
         * The log key.
         *
         * @param logKey the value to set
         * @return this builder
         */
        public Builder logKey(String logKey) {
            this.logKey = logKey;
            this.__explicitlySet__.add("logKey");
            return this;
        }
        /** The log header values. */
        @com.fasterxml.jackson.annotation.JsonProperty("headerValues")
        private java.util.List<String> headerValues;

        /**
         * The log header values.
         *
         * @param headerValues the value to set
         * @return this builder
         */
        public Builder headerValues(java.util.List<String> headerValues) {
            this.headerValues = headerValues;
            this.__explicitlySet__.add("headerValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExtractLogHeaderDetails build() {
            ExtractLogHeaderDetails model =
                    new ExtractLogHeaderDetails(this.logKey, this.headerValues);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExtractLogHeaderDetails model) {
            if (model.wasPropertyExplicitlySet("logKey")) {
                this.logKey(model.getLogKey());
            }
            if (model.wasPropertyExplicitlySet("headerValues")) {
                this.headerValues(model.getHeaderValues());
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

    /** The log key. */
    @com.fasterxml.jackson.annotation.JsonProperty("logKey")
    private final String logKey;

    /**
     * The log key.
     *
     * @return the value
     */
    public String getLogKey() {
        return logKey;
    }

    /** The log header values. */
    @com.fasterxml.jackson.annotation.JsonProperty("headerValues")
    private final java.util.List<String> headerValues;

    /**
     * The log header values.
     *
     * @return the value
     */
    public java.util.List<String> getHeaderValues() {
        return headerValues;
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
        sb.append("ExtractLogHeaderDetails(");
        sb.append("super=").append(super.toString());
        sb.append("logKey=").append(String.valueOf(this.logKey));
        sb.append(", headerValues=").append(String.valueOf(this.headerValues));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExtractLogHeaderDetails)) {
            return false;
        }

        ExtractLogHeaderDetails other = (ExtractLogHeaderDetails) o;
        return java.util.Objects.equals(this.logKey, other.logKey)
                && java.util.Objects.equals(this.headerValues, other.headerValues)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.logKey == null ? 43 : this.logKey.hashCode());
        result = (result * PRIME) + (this.headerValues == null ? 43 : this.headerValues.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
