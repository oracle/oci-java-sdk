/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A list of Trusted Platform Module (TPM) Platform Configuration Register (PCR) entries. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MeasuredBootReportMeasurements.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MeasuredBootReportMeasurements
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"policy", "actual"})
    public MeasuredBootReportMeasurements(
            java.util.List<MeasuredBootEntry> policy, java.util.List<MeasuredBootEntry> actual) {
        super();
        this.policy = policy;
        this.actual = actual;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The list of expected PCR entries to use during verification. */
        @com.fasterxml.jackson.annotation.JsonProperty("policy")
        private java.util.List<MeasuredBootEntry> policy;

        /**
         * The list of expected PCR entries to use during verification.
         *
         * @param policy the value to set
         * @return this builder
         */
        public Builder policy(java.util.List<MeasuredBootEntry> policy) {
            this.policy = policy;
            this.__explicitlySet__.add("policy");
            return this;
        }
        /** The list of actual PCR entries measured during boot. */
        @com.fasterxml.jackson.annotation.JsonProperty("actual")
        private java.util.List<MeasuredBootEntry> actual;

        /**
         * The list of actual PCR entries measured during boot.
         *
         * @param actual the value to set
         * @return this builder
         */
        public Builder actual(java.util.List<MeasuredBootEntry> actual) {
            this.actual = actual;
            this.__explicitlySet__.add("actual");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MeasuredBootReportMeasurements build() {
            MeasuredBootReportMeasurements model =
                    new MeasuredBootReportMeasurements(this.policy, this.actual);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MeasuredBootReportMeasurements model) {
            if (model.wasPropertyExplicitlySet("policy")) {
                this.policy(model.getPolicy());
            }
            if (model.wasPropertyExplicitlySet("actual")) {
                this.actual(model.getActual());
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

    /** The list of expected PCR entries to use during verification. */
    @com.fasterxml.jackson.annotation.JsonProperty("policy")
    private final java.util.List<MeasuredBootEntry> policy;

    /**
     * The list of expected PCR entries to use during verification.
     *
     * @return the value
     */
    public java.util.List<MeasuredBootEntry> getPolicy() {
        return policy;
    }

    /** The list of actual PCR entries measured during boot. */
    @com.fasterxml.jackson.annotation.JsonProperty("actual")
    private final java.util.List<MeasuredBootEntry> actual;

    /**
     * The list of actual PCR entries measured during boot.
     *
     * @return the value
     */
    public java.util.List<MeasuredBootEntry> getActual() {
        return actual;
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
        sb.append("MeasuredBootReportMeasurements(");
        sb.append("super=").append(super.toString());
        sb.append("policy=").append(String.valueOf(this.policy));
        sb.append(", actual=").append(String.valueOf(this.actual));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MeasuredBootReportMeasurements)) {
            return false;
        }

        MeasuredBootReportMeasurements other = (MeasuredBootReportMeasurements) o;
        return java.util.Objects.equals(this.policy, other.policy)
                && java.util.Objects.equals(this.actual, other.actual)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.policy == null ? 43 : this.policy.hashCode());
        result = (result * PRIME) + (this.actual == null ? 43 : this.actual.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
