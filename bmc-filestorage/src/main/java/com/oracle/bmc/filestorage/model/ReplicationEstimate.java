/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.model;

/**
 * Details for response from replication estimation.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ReplicationEstimate.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ReplicationEstimate extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "changeRateInMBps",
        "isReplicationSupported",
        "minimumSupportedIntervalInMinutes",
        "estimatedBaseCopyTimeInMinutes",
        "allowedTargetRegions"
    })
    public ReplicationEstimate(
            Integer changeRateInMBps,
            Boolean isReplicationSupported,
            Integer minimumSupportedIntervalInMinutes,
            Integer estimatedBaseCopyTimeInMinutes,
            java.util.List<String> allowedTargetRegions) {
        super();
        this.changeRateInMBps = changeRateInMBps;
        this.isReplicationSupported = isReplicationSupported;
        this.minimumSupportedIntervalInMinutes = minimumSupportedIntervalInMinutes;
        this.estimatedBaseCopyTimeInMinutes = estimatedBaseCopyTimeInMinutes;
        this.allowedTargetRegions = allowedTargetRegions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The rate of change on source filesystem which was used to provide the estimate in MegaBytes per second.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("changeRateInMBps")
        private Integer changeRateInMBps;

        /**
         * The rate of change on source filesystem which was used to provide the estimate in MegaBytes per second.
         * @param changeRateInMBps the value to set
         * @return this builder
         **/
        public Builder changeRateInMBps(Integer changeRateInMBps) {
            this.changeRateInMBps = changeRateInMBps;
            this.__explicitlySet__.add("changeRateInMBps");
            return this;
        }
        /**
         * Specifies whether replication can be enabled on the file system.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isReplicationSupported")
        private Boolean isReplicationSupported;

        /**
         * Specifies whether replication can be enabled on the file system.
         * @param isReplicationSupported the value to set
         * @return this builder
         **/
        public Builder isReplicationSupported(Boolean isReplicationSupported) {
            this.isReplicationSupported = isReplicationSupported;
            this.__explicitlySet__.add("isReplicationSupported");
            return this;
        }
        /**
         * The minimum supported replication interval for specified file system in minutes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("minimumSupportedIntervalInMinutes")
        private Integer minimumSupportedIntervalInMinutes;

        /**
         * The minimum supported replication interval for specified file system in minutes.
         * @param minimumSupportedIntervalInMinutes the value to set
         * @return this builder
         **/
        public Builder minimumSupportedIntervalInMinutes(
                Integer minimumSupportedIntervalInMinutes) {
            this.minimumSupportedIntervalInMinutes = minimumSupportedIntervalInMinutes;
            this.__explicitlySet__.add("minimumSupportedIntervalInMinutes");
            return this;
        }
        /**
         * The approximate time required for the base sync between source and target to finish.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("estimatedBaseCopyTimeInMinutes")
        private Integer estimatedBaseCopyTimeInMinutes;

        /**
         * The approximate time required for the base sync between source and target to finish.
         * @param estimatedBaseCopyTimeInMinutes the value to set
         * @return this builder
         **/
        public Builder estimatedBaseCopyTimeInMinutes(Integer estimatedBaseCopyTimeInMinutes) {
            this.estimatedBaseCopyTimeInMinutes = estimatedBaseCopyTimeInMinutes;
            this.__explicitlySet__.add("estimatedBaseCopyTimeInMinutes");
            return this;
        }
        /**
         * Array of allowed target region names which can be paired with source file system.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("allowedTargetRegions")
        private java.util.List<String> allowedTargetRegions;

        /**
         * Array of allowed target region names which can be paired with source file system.
         * @param allowedTargetRegions the value to set
         * @return this builder
         **/
        public Builder allowedTargetRegions(java.util.List<String> allowedTargetRegions) {
            this.allowedTargetRegions = allowedTargetRegions;
            this.__explicitlySet__.add("allowedTargetRegions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ReplicationEstimate build() {
            ReplicationEstimate model =
                    new ReplicationEstimate(
                            this.changeRateInMBps,
                            this.isReplicationSupported,
                            this.minimumSupportedIntervalInMinutes,
                            this.estimatedBaseCopyTimeInMinutes,
                            this.allowedTargetRegions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReplicationEstimate model) {
            if (model.wasPropertyExplicitlySet("changeRateInMBps")) {
                this.changeRateInMBps(model.getChangeRateInMBps());
            }
            if (model.wasPropertyExplicitlySet("isReplicationSupported")) {
                this.isReplicationSupported(model.getIsReplicationSupported());
            }
            if (model.wasPropertyExplicitlySet("minimumSupportedIntervalInMinutes")) {
                this.minimumSupportedIntervalInMinutes(
                        model.getMinimumSupportedIntervalInMinutes());
            }
            if (model.wasPropertyExplicitlySet("estimatedBaseCopyTimeInMinutes")) {
                this.estimatedBaseCopyTimeInMinutes(model.getEstimatedBaseCopyTimeInMinutes());
            }
            if (model.wasPropertyExplicitlySet("allowedTargetRegions")) {
                this.allowedTargetRegions(model.getAllowedTargetRegions());
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
     * The rate of change on source filesystem which was used to provide the estimate in MegaBytes per second.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("changeRateInMBps")
    private final Integer changeRateInMBps;

    /**
     * The rate of change on source filesystem which was used to provide the estimate in MegaBytes per second.
     * @return the value
     **/
    public Integer getChangeRateInMBps() {
        return changeRateInMBps;
    }

    /**
     * Specifies whether replication can be enabled on the file system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isReplicationSupported")
    private final Boolean isReplicationSupported;

    /**
     * Specifies whether replication can be enabled on the file system.
     * @return the value
     **/
    public Boolean getIsReplicationSupported() {
        return isReplicationSupported;
    }

    /**
     * The minimum supported replication interval for specified file system in minutes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minimumSupportedIntervalInMinutes")
    private final Integer minimumSupportedIntervalInMinutes;

    /**
     * The minimum supported replication interval for specified file system in minutes.
     * @return the value
     **/
    public Integer getMinimumSupportedIntervalInMinutes() {
        return minimumSupportedIntervalInMinutes;
    }

    /**
     * The approximate time required for the base sync between source and target to finish.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("estimatedBaseCopyTimeInMinutes")
    private final Integer estimatedBaseCopyTimeInMinutes;

    /**
     * The approximate time required for the base sync between source and target to finish.
     * @return the value
     **/
    public Integer getEstimatedBaseCopyTimeInMinutes() {
        return estimatedBaseCopyTimeInMinutes;
    }

    /**
     * Array of allowed target region names which can be paired with source file system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowedTargetRegions")
    private final java.util.List<String> allowedTargetRegions;

    /**
     * Array of allowed target region names which can be paired with source file system.
     * @return the value
     **/
    public java.util.List<String> getAllowedTargetRegions() {
        return allowedTargetRegions;
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
        sb.append("ReplicationEstimate(");
        sb.append("super=").append(super.toString());
        sb.append("changeRateInMBps=").append(String.valueOf(this.changeRateInMBps));
        sb.append(", isReplicationSupported=").append(String.valueOf(this.isReplicationSupported));
        sb.append(", minimumSupportedIntervalInMinutes=")
                .append(String.valueOf(this.minimumSupportedIntervalInMinutes));
        sb.append(", estimatedBaseCopyTimeInMinutes=")
                .append(String.valueOf(this.estimatedBaseCopyTimeInMinutes));
        sb.append(", allowedTargetRegions=").append(String.valueOf(this.allowedTargetRegions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReplicationEstimate)) {
            return false;
        }

        ReplicationEstimate other = (ReplicationEstimate) o;
        return java.util.Objects.equals(this.changeRateInMBps, other.changeRateInMBps)
                && java.util.Objects.equals(
                        this.isReplicationSupported, other.isReplicationSupported)
                && java.util.Objects.equals(
                        this.minimumSupportedIntervalInMinutes,
                        other.minimumSupportedIntervalInMinutes)
                && java.util.Objects.equals(
                        this.estimatedBaseCopyTimeInMinutes, other.estimatedBaseCopyTimeInMinutes)
                && java.util.Objects.equals(this.allowedTargetRegions, other.allowedTargetRegions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.changeRateInMBps == null ? 43 : this.changeRateInMBps.hashCode());
        result =
                (result * PRIME)
                        + (this.isReplicationSupported == null
                                ? 43
                                : this.isReplicationSupported.hashCode());
        result =
                (result * PRIME)
                        + (this.minimumSupportedIntervalInMinutes == null
                                ? 43
                                : this.minimumSupportedIntervalInMinutes.hashCode());
        result =
                (result * PRIME)
                        + (this.estimatedBaseCopyTimeInMinutes == null
                                ? 43
                                : this.estimatedBaseCopyTimeInMinutes.hashCode());
        result =
                (result * PRIME)
                        + (this.allowedTargetRegions == null
                                ? 43
                                : this.allowedTargetRegions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
