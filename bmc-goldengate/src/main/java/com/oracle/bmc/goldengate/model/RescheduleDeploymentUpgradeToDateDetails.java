/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Definition of the additional attributes for default deployment upgrade cancel. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RescheduleDeploymentUpgradeToDateDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RescheduleDeploymentUpgradeToDateDetails
        extends RescheduleDeploymentUpgradeDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The time of upgrade schedule. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeSchedule")
        private java.util.Date timeSchedule;

        /**
         * The time of upgrade schedule. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         *
         * @param timeSchedule the value to set
         * @return this builder
         */
        public Builder timeSchedule(java.util.Date timeSchedule) {
            this.timeSchedule = timeSchedule;
            this.__explicitlySet__.add("timeSchedule");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RescheduleDeploymentUpgradeToDateDetails build() {
            RescheduleDeploymentUpgradeToDateDetails model =
                    new RescheduleDeploymentUpgradeToDateDetails(this.timeSchedule);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RescheduleDeploymentUpgradeToDateDetails model) {
            if (model.wasPropertyExplicitlySet("timeSchedule")) {
                this.timeSchedule(model.getTimeSchedule());
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

    @Deprecated
    public RescheduleDeploymentUpgradeToDateDetails(java.util.Date timeSchedule) {
        super();
        this.timeSchedule = timeSchedule;
    }

    /**
     * The time of upgrade schedule. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeSchedule")
    private final java.util.Date timeSchedule;

    /**
     * The time of upgrade schedule. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     * @return the value
     */
    public java.util.Date getTimeSchedule() {
        return timeSchedule;
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
        sb.append("RescheduleDeploymentUpgradeToDateDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", timeSchedule=").append(String.valueOf(this.timeSchedule));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RescheduleDeploymentUpgradeToDateDetails)) {
            return false;
        }

        RescheduleDeploymentUpgradeToDateDetails other =
                (RescheduleDeploymentUpgradeToDateDetails) o;
        return java.util.Objects.equals(this.timeSchedule, other.timeSchedule)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.timeSchedule == null ? 43 : this.timeSchedule.hashCode());
        return result;
    }
}
