/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement.model;

/**
 * A summary model for the Occm demand signal resource property option. To support range of the
 * options for a property <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231107")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OccmDemandSignalResourcePropertyOptionSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OccmDemandSignalResourcePropertyOptionSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"optionKey", "optionValue"})
    public OccmDemandSignalResourcePropertyOptionSummary(String optionKey, String optionValue) {
        super();
        this.optionKey = optionKey;
        this.optionValue = optionValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** key of a property option like memoryValue, ocpuValue. */
        @com.fasterxml.jackson.annotation.JsonProperty("optionKey")
        private String optionKey;

        /**
         * key of a property option like memoryValue, ocpuValue.
         *
         * @param optionKey the value to set
         * @return this builder
         */
        public Builder optionKey(String optionKey) {
            this.optionKey = optionKey;
            this.__explicitlySet__.add("optionKey");
            return this;
        }
        /** value of a property option like 64, 2 fastconnect etc. */
        @com.fasterxml.jackson.annotation.JsonProperty("optionValue")
        private String optionValue;

        /**
         * value of a property option like 64, 2 fastconnect etc.
         *
         * @param optionValue the value to set
         * @return this builder
         */
        public Builder optionValue(String optionValue) {
            this.optionValue = optionValue;
            this.__explicitlySet__.add("optionValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OccmDemandSignalResourcePropertyOptionSummary build() {
            OccmDemandSignalResourcePropertyOptionSummary model =
                    new OccmDemandSignalResourcePropertyOptionSummary(
                            this.optionKey, this.optionValue);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OccmDemandSignalResourcePropertyOptionSummary model) {
            if (model.wasPropertyExplicitlySet("optionKey")) {
                this.optionKey(model.getOptionKey());
            }
            if (model.wasPropertyExplicitlySet("optionValue")) {
                this.optionValue(model.getOptionValue());
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

    /** key of a property option like memoryValue, ocpuValue. */
    @com.fasterxml.jackson.annotation.JsonProperty("optionKey")
    private final String optionKey;

    /**
     * key of a property option like memoryValue, ocpuValue.
     *
     * @return the value
     */
    public String getOptionKey() {
        return optionKey;
    }

    /** value of a property option like 64, 2 fastconnect etc. */
    @com.fasterxml.jackson.annotation.JsonProperty("optionValue")
    private final String optionValue;

    /**
     * value of a property option like 64, 2 fastconnect etc.
     *
     * @return the value
     */
    public String getOptionValue() {
        return optionValue;
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
        sb.append("OccmDemandSignalResourcePropertyOptionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("optionKey=").append(String.valueOf(this.optionKey));
        sb.append(", optionValue=").append(String.valueOf(this.optionValue));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OccmDemandSignalResourcePropertyOptionSummary)) {
            return false;
        }

        OccmDemandSignalResourcePropertyOptionSummary other =
                (OccmDemandSignalResourcePropertyOptionSummary) o;
        return java.util.Objects.equals(this.optionKey, other.optionKey)
                && java.util.Objects.equals(this.optionValue, other.optionValue)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.optionKey == null ? 43 : this.optionKey.hashCode());
        result = (result * PRIME) + (this.optionValue == null ? 43 : this.optionValue.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
