/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vault.model;

/**
 * Defines the frequency of the rotation and the information about the target system <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180608")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RotationConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RotationConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "rotationInterval",
        "targetSystemDetails",
        "isScheduledRotationEnabled"
    })
    public RotationConfig(
            String rotationInterval,
            TargetSystemDetails targetSystemDetails,
            Boolean isScheduledRotationEnabled) {
        super();
        this.rotationInterval = rotationInterval;
        this.targetSystemDetails = targetSystemDetails;
        this.isScheduledRotationEnabled = isScheduledRotationEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The time interval that indicates the frequency for rotating secret data, as described in
         * ISO 8601 format. The minimum value is 1 day and maximum value is 360 days. For example,
         * if you want to set the time interval for rotating a secret data as 30 days, the duration
         * is expressed as "P30D."
         */
        @com.fasterxml.jackson.annotation.JsonProperty("rotationInterval")
        private String rotationInterval;

        /**
         * The time interval that indicates the frequency for rotating secret data, as described in
         * ISO 8601 format. The minimum value is 1 day and maximum value is 360 days. For example,
         * if you want to set the time interval for rotating a secret data as 30 days, the duration
         * is expressed as "P30D."
         *
         * @param rotationInterval the value to set
         * @return this builder
         */
        public Builder rotationInterval(String rotationInterval) {
            this.rotationInterval = rotationInterval;
            this.__explicitlySet__.add("rotationInterval");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetSystemDetails")
        private TargetSystemDetails targetSystemDetails;

        public Builder targetSystemDetails(TargetSystemDetails targetSystemDetails) {
            this.targetSystemDetails = targetSystemDetails;
            this.__explicitlySet__.add("targetSystemDetails");
            return this;
        }
        /** Enables auto rotation, when set to true rotationInterval must be set. */
        @com.fasterxml.jackson.annotation.JsonProperty("isScheduledRotationEnabled")
        private Boolean isScheduledRotationEnabled;

        /**
         * Enables auto rotation, when set to true rotationInterval must be set.
         *
         * @param isScheduledRotationEnabled the value to set
         * @return this builder
         */
        public Builder isScheduledRotationEnabled(Boolean isScheduledRotationEnabled) {
            this.isScheduledRotationEnabled = isScheduledRotationEnabled;
            this.__explicitlySet__.add("isScheduledRotationEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RotationConfig build() {
            RotationConfig model =
                    new RotationConfig(
                            this.rotationInterval,
                            this.targetSystemDetails,
                            this.isScheduledRotationEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RotationConfig model) {
            if (model.wasPropertyExplicitlySet("rotationInterval")) {
                this.rotationInterval(model.getRotationInterval());
            }
            if (model.wasPropertyExplicitlySet("targetSystemDetails")) {
                this.targetSystemDetails(model.getTargetSystemDetails());
            }
            if (model.wasPropertyExplicitlySet("isScheduledRotationEnabled")) {
                this.isScheduledRotationEnabled(model.getIsScheduledRotationEnabled());
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

    /**
     * The time interval that indicates the frequency for rotating secret data, as described in ISO
     * 8601 format. The minimum value is 1 day and maximum value is 360 days. For example, if you
     * want to set the time interval for rotating a secret data as 30 days, the duration is
     * expressed as "P30D."
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rotationInterval")
    private final String rotationInterval;

    /**
     * The time interval that indicates the frequency for rotating secret data, as described in ISO
     * 8601 format. The minimum value is 1 day and maximum value is 360 days. For example, if you
     * want to set the time interval for rotating a secret data as 30 days, the duration is
     * expressed as "P30D."
     *
     * @return the value
     */
    public String getRotationInterval() {
        return rotationInterval;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("targetSystemDetails")
    private final TargetSystemDetails targetSystemDetails;

    public TargetSystemDetails getTargetSystemDetails() {
        return targetSystemDetails;
    }

    /** Enables auto rotation, when set to true rotationInterval must be set. */
    @com.fasterxml.jackson.annotation.JsonProperty("isScheduledRotationEnabled")
    private final Boolean isScheduledRotationEnabled;

    /**
     * Enables auto rotation, when set to true rotationInterval must be set.
     *
     * @return the value
     */
    public Boolean getIsScheduledRotationEnabled() {
        return isScheduledRotationEnabled;
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
        sb.append("RotationConfig(");
        sb.append("super=").append(super.toString());
        sb.append("rotationInterval=").append(String.valueOf(this.rotationInterval));
        sb.append(", targetSystemDetails=").append(String.valueOf(this.targetSystemDetails));
        sb.append(", isScheduledRotationEnabled=")
                .append(String.valueOf(this.isScheduledRotationEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RotationConfig)) {
            return false;
        }

        RotationConfig other = (RotationConfig) o;
        return java.util.Objects.equals(this.rotationInterval, other.rotationInterval)
                && java.util.Objects.equals(this.targetSystemDetails, other.targetSystemDetails)
                && java.util.Objects.equals(
                        this.isScheduledRotationEnabled, other.isScheduledRotationEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.rotationInterval == null ? 43 : this.rotationInterval.hashCode());
        result =
                (result * PRIME)
                        + (this.targetSystemDetails == null
                                ? 43
                                : this.targetSystemDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.isScheduledRotationEnabled == null
                                ? 43
                                : this.isScheduledRotationEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
