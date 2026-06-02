/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * DR precheck result for standby peer in the specified placement (availabilityDomain and faultDomain).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DisasterRecoveryPrecheckReport.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DisasterRecoveryPrecheckReport
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "timePrecheckStarted",
        "timePrecheckFinished",
        "precheckStatus",
        "checks"
    })
    public DisasterRecoveryPrecheckReport(
            java.util.Date timePrecheckStarted,
            java.util.Date timePrecheckFinished,
            PrecheckStatus precheckStatus,
            java.util.List<DisasterRecoveryPrecheckResult> checks) {
        super();
        this.timePrecheckStarted = timePrecheckStarted;
        this.timePrecheckFinished = timePrecheckFinished;
        this.precheckStatus = precheckStatus;
        this.checks = checks;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The timestamp when pre-check started. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2024-10-26T20:19:29.600Z}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timePrecheckStarted")
        private java.util.Date timePrecheckStarted;

        /**
         * The timestamp when pre-check started. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2024-10-26T20:19:29.600Z}.
         *
         * @param timePrecheckStarted the value to set
         * @return this builder
         **/
        public Builder timePrecheckStarted(java.util.Date timePrecheckStarted) {
            this.timePrecheckStarted = timePrecheckStarted;
            this.__explicitlySet__.add("timePrecheckStarted");
            return this;
        }
        /**
         * The timestamp when pre-check operation finished. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2024-10-26T20:19:29.600Z}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timePrecheckFinished")
        private java.util.Date timePrecheckFinished;

        /**
         * The timestamp when pre-check operation finished. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2024-10-26T20:19:29.600Z}.
         *
         * @param timePrecheckFinished the value to set
         * @return this builder
         **/
        public Builder timePrecheckFinished(java.util.Date timePrecheckFinished) {
            this.timePrecheckFinished = timePrecheckFinished;
            this.__explicitlySet__.add("timePrecheckFinished");
            return this;
        }
        /**
         * Status of the DR precheck result.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("precheckStatus")
        private PrecheckStatus precheckStatus;

        /**
         * Status of the DR precheck result.
         * @param precheckStatus the value to set
         * @return this builder
         **/
        public Builder precheckStatus(PrecheckStatus precheckStatus) {
            this.precheckStatus = precheckStatus;
            this.__explicitlySet__.add("precheckStatus");
            return this;
        }
        /**
         * A list of precheck results.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("checks")
        private java.util.List<DisasterRecoveryPrecheckResult> checks;

        /**
         * A list of precheck results.
         *
         * @param checks the value to set
         * @return this builder
         **/
        public Builder checks(java.util.List<DisasterRecoveryPrecheckResult> checks) {
            this.checks = checks;
            this.__explicitlySet__.add("checks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DisasterRecoveryPrecheckReport build() {
            DisasterRecoveryPrecheckReport model =
                    new DisasterRecoveryPrecheckReport(
                            this.timePrecheckStarted,
                            this.timePrecheckFinished,
                            this.precheckStatus,
                            this.checks);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DisasterRecoveryPrecheckReport model) {
            if (model.wasPropertyExplicitlySet("timePrecheckStarted")) {
                this.timePrecheckStarted(model.getTimePrecheckStarted());
            }
            if (model.wasPropertyExplicitlySet("timePrecheckFinished")) {
                this.timePrecheckFinished(model.getTimePrecheckFinished());
            }
            if (model.wasPropertyExplicitlySet("precheckStatus")) {
                this.precheckStatus(model.getPrecheckStatus());
            }
            if (model.wasPropertyExplicitlySet("checks")) {
                this.checks(model.getChecks());
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
     * The timestamp when pre-check started. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2024-10-26T20:19:29.600Z}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timePrecheckStarted")
    private final java.util.Date timePrecheckStarted;

    /**
     * The timestamp when pre-check started. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2024-10-26T20:19:29.600Z}.
     *
     * @return the value
     **/
    public java.util.Date getTimePrecheckStarted() {
        return timePrecheckStarted;
    }

    /**
     * The timestamp when pre-check operation finished. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2024-10-26T20:19:29.600Z}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timePrecheckFinished")
    private final java.util.Date timePrecheckFinished;

    /**
     * The timestamp when pre-check operation finished. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2024-10-26T20:19:29.600Z}.
     *
     * @return the value
     **/
    public java.util.Date getTimePrecheckFinished() {
        return timePrecheckFinished;
    }

    /**
     * Status of the DR precheck result.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("precheckStatus")
    private final PrecheckStatus precheckStatus;

    /**
     * Status of the DR precheck result.
     * @return the value
     **/
    public PrecheckStatus getPrecheckStatus() {
        return precheckStatus;
    }

    /**
     * A list of precheck results.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("checks")
    private final java.util.List<DisasterRecoveryPrecheckResult> checks;

    /**
     * A list of precheck results.
     *
     * @return the value
     **/
    public java.util.List<DisasterRecoveryPrecheckResult> getChecks() {
        return checks;
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
        sb.append("DisasterRecoveryPrecheckReport(");
        sb.append("super=").append(super.toString());
        sb.append("timePrecheckStarted=").append(String.valueOf(this.timePrecheckStarted));
        sb.append(", timePrecheckFinished=").append(String.valueOf(this.timePrecheckFinished));
        sb.append(", precheckStatus=").append(String.valueOf(this.precheckStatus));
        sb.append(", checks=").append(String.valueOf(this.checks));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DisasterRecoveryPrecheckReport)) {
            return false;
        }

        DisasterRecoveryPrecheckReport other = (DisasterRecoveryPrecheckReport) o;
        return java.util.Objects.equals(this.timePrecheckStarted, other.timePrecheckStarted)
                && java.util.Objects.equals(this.timePrecheckFinished, other.timePrecheckFinished)
                && java.util.Objects.equals(this.precheckStatus, other.precheckStatus)
                && java.util.Objects.equals(this.checks, other.checks)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timePrecheckStarted == null
                                ? 43
                                : this.timePrecheckStarted.hashCode());
        result =
                (result * PRIME)
                        + (this.timePrecheckFinished == null
                                ? 43
                                : this.timePrecheckFinished.hashCode());
        result =
                (result * PRIME)
                        + (this.precheckStatus == null ? 43 : this.precheckStatus.hashCode());
        result = (result * PRIME) + (this.checks == null ? 43 : this.checks.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
