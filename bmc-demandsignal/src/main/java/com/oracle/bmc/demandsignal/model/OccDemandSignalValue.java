/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.demandsignal.model;

/**
 * The Value of Demand Signal for particular month. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OccDemandSignalValue.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OccDemandSignalValue
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"timeExpected", "value", "comments"})
    public OccDemandSignalValue(java.util.Date timeExpected, Float value, String comments) {
        super();
        this.timeExpected = timeExpected;
        this.value = value;
        this.comments = comments;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The date of the Demand Signal Value. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeExpected")
        private java.util.Date timeExpected;

        /**
         * The date of the Demand Signal Value.
         *
         * @param timeExpected the value to set
         * @return this builder
         */
        public Builder timeExpected(java.util.Date timeExpected) {
            this.timeExpected = timeExpected;
            this.__explicitlySet__.add("timeExpected");
            return this;
        }
        /** The Demand Signal Value. */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private Float value;

        /**
         * The Demand Signal Value.
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(Float value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /** Space provided for users to make comments regarding the value. */
        @com.fasterxml.jackson.annotation.JsonProperty("comments")
        private String comments;

        /**
         * Space provided for users to make comments regarding the value.
         *
         * @param comments the value to set
         * @return this builder
         */
        public Builder comments(String comments) {
            this.comments = comments;
            this.__explicitlySet__.add("comments");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OccDemandSignalValue build() {
            OccDemandSignalValue model =
                    new OccDemandSignalValue(this.timeExpected, this.value, this.comments);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OccDemandSignalValue model) {
            if (model.wasPropertyExplicitlySet("timeExpected")) {
                this.timeExpected(model.getTimeExpected());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("comments")) {
                this.comments(model.getComments());
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

    /** The date of the Demand Signal Value. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeExpected")
    private final java.util.Date timeExpected;

    /**
     * The date of the Demand Signal Value.
     *
     * @return the value
     */
    public java.util.Date getTimeExpected() {
        return timeExpected;
    }

    /** The Demand Signal Value. */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final Float value;

    /**
     * The Demand Signal Value.
     *
     * @return the value
     */
    public Float getValue() {
        return value;
    }

    /** Space provided for users to make comments regarding the value. */
    @com.fasterxml.jackson.annotation.JsonProperty("comments")
    private final String comments;

    /**
     * Space provided for users to make comments regarding the value.
     *
     * @return the value
     */
    public String getComments() {
        return comments;
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
        sb.append("OccDemandSignalValue(");
        sb.append("super=").append(super.toString());
        sb.append("timeExpected=").append(String.valueOf(this.timeExpected));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", comments=").append(String.valueOf(this.comments));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OccDemandSignalValue)) {
            return false;
        }

        OccDemandSignalValue other = (OccDemandSignalValue) o;
        return java.util.Objects.equals(this.timeExpected, other.timeExpected)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.comments, other.comments)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timeExpected == null ? 43 : this.timeExpected.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.comments == null ? 43 : this.comments.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
