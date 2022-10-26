/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The scheduling details for the quarterly maintenance window. Patching and system updates take
 * place during the maintenance window. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DbServerPatchingDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class DbServerPatchingDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "estimatedPatchDuration",
        "patchingStatus",
        "timePatchingStarted",
        "timePatchingEnded"
    })
    public DbServerPatchingDetails(
            Integer estimatedPatchDuration,
            PatchingStatus patchingStatus,
            java.util.Date timePatchingStarted,
            java.util.Date timePatchingEnded) {
        super();
        this.estimatedPatchDuration = estimatedPatchDuration;
        this.patchingStatus = patchingStatus;
        this.timePatchingStarted = timePatchingStarted;
        this.timePatchingEnded = timePatchingEnded;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Estimated time, in minutes, to patch one database server. */
        @com.fasterxml.jackson.annotation.JsonProperty("estimatedPatchDuration")
        private Integer estimatedPatchDuration;

        /**
         * Estimated time, in minutes, to patch one database server.
         *
         * @param estimatedPatchDuration the value to set
         * @return this builder
         */
        public Builder estimatedPatchDuration(Integer estimatedPatchDuration) {
            this.estimatedPatchDuration = estimatedPatchDuration;
            this.__explicitlySet__.add("estimatedPatchDuration");
            return this;
        }
        /** The status of the patching operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("patchingStatus")
        private PatchingStatus patchingStatus;

        /**
         * The status of the patching operation.
         *
         * @param patchingStatus the value to set
         * @return this builder
         */
        public Builder patchingStatus(PatchingStatus patchingStatus) {
            this.patchingStatus = patchingStatus;
            this.__explicitlySet__.add("patchingStatus");
            return this;
        }
        /** The time when the patching operation started. */
        @com.fasterxml.jackson.annotation.JsonProperty("timePatchingStarted")
        private java.util.Date timePatchingStarted;

        /**
         * The time when the patching operation started.
         *
         * @param timePatchingStarted the value to set
         * @return this builder
         */
        public Builder timePatchingStarted(java.util.Date timePatchingStarted) {
            this.timePatchingStarted = timePatchingStarted;
            this.__explicitlySet__.add("timePatchingStarted");
            return this;
        }
        /** The time when the patching operation ended. */
        @com.fasterxml.jackson.annotation.JsonProperty("timePatchingEnded")
        private java.util.Date timePatchingEnded;

        /**
         * The time when the patching operation ended.
         *
         * @param timePatchingEnded the value to set
         * @return this builder
         */
        public Builder timePatchingEnded(java.util.Date timePatchingEnded) {
            this.timePatchingEnded = timePatchingEnded;
            this.__explicitlySet__.add("timePatchingEnded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DbServerPatchingDetails build() {
            DbServerPatchingDetails model =
                    new DbServerPatchingDetails(
                            this.estimatedPatchDuration,
                            this.patchingStatus,
                            this.timePatchingStarted,
                            this.timePatchingEnded);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DbServerPatchingDetails model) {
            if (model.wasPropertyExplicitlySet("estimatedPatchDuration")) {
                this.estimatedPatchDuration(model.getEstimatedPatchDuration());
            }
            if (model.wasPropertyExplicitlySet("patchingStatus")) {
                this.patchingStatus(model.getPatchingStatus());
            }
            if (model.wasPropertyExplicitlySet("timePatchingStarted")) {
                this.timePatchingStarted(model.getTimePatchingStarted());
            }
            if (model.wasPropertyExplicitlySet("timePatchingEnded")) {
                this.timePatchingEnded(model.getTimePatchingEnded());
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

    /** Estimated time, in minutes, to patch one database server. */
    @com.fasterxml.jackson.annotation.JsonProperty("estimatedPatchDuration")
    private final Integer estimatedPatchDuration;

    /**
     * Estimated time, in minutes, to patch one database server.
     *
     * @return the value
     */
    public Integer getEstimatedPatchDuration() {
        return estimatedPatchDuration;
    }

    /** The status of the patching operation. */
    public enum PatchingStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Scheduled("SCHEDULED"),
        MaintenanceInProgress("MAINTENANCE_IN_PROGRESS"),
        Failed("FAILED"),
        Complete("COMPLETE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PatchingStatus.class);

        private final String value;
        private static java.util.Map<String, PatchingStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (PatchingStatus v : PatchingStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PatchingStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PatchingStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PatchingStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The status of the patching operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("patchingStatus")
    private final PatchingStatus patchingStatus;

    /**
     * The status of the patching operation.
     *
     * @return the value
     */
    public PatchingStatus getPatchingStatus() {
        return patchingStatus;
    }

    /** The time when the patching operation started. */
    @com.fasterxml.jackson.annotation.JsonProperty("timePatchingStarted")
    private final java.util.Date timePatchingStarted;

    /**
     * The time when the patching operation started.
     *
     * @return the value
     */
    public java.util.Date getTimePatchingStarted() {
        return timePatchingStarted;
    }

    /** The time when the patching operation ended. */
    @com.fasterxml.jackson.annotation.JsonProperty("timePatchingEnded")
    private final java.util.Date timePatchingEnded;

    /**
     * The time when the patching operation ended.
     *
     * @return the value
     */
    public java.util.Date getTimePatchingEnded() {
        return timePatchingEnded;
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
        sb.append("DbServerPatchingDetails(");
        sb.append("super=").append(super.toString());
        sb.append("estimatedPatchDuration=").append(String.valueOf(this.estimatedPatchDuration));
        sb.append(", patchingStatus=").append(String.valueOf(this.patchingStatus));
        sb.append(", timePatchingStarted=").append(String.valueOf(this.timePatchingStarted));
        sb.append(", timePatchingEnded=").append(String.valueOf(this.timePatchingEnded));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DbServerPatchingDetails)) {
            return false;
        }

        DbServerPatchingDetails other = (DbServerPatchingDetails) o;
        return java.util.Objects.equals(this.estimatedPatchDuration, other.estimatedPatchDuration)
                && java.util.Objects.equals(this.patchingStatus, other.patchingStatus)
                && java.util.Objects.equals(this.timePatchingStarted, other.timePatchingStarted)
                && java.util.Objects.equals(this.timePatchingEnded, other.timePatchingEnded)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.estimatedPatchDuration == null
                                ? 43
                                : this.estimatedPatchDuration.hashCode());
        result =
                (result * PRIME)
                        + (this.patchingStatus == null ? 43 : this.patchingStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.timePatchingStarted == null
                                ? 43
                                : this.timePatchingStarted.hashCode());
        result =
                (result * PRIME)
                        + (this.timePatchingEnded == null ? 43 : this.timePatchingEnded.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
