/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Provides details about actual Oracle Managed Database Software Updates scheduled time and
 * version. <br>
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
        builder = ManagedSoftwareUpdateMaintenanceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ManagedSoftwareUpdateMaintenanceDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "timeScheduled",
        "updateReadinessStatus",
        "updateReadinessStatusDetails",
        "timeOfStatusUpdate",
        "updateMode",
        "version",
        "timeOfLastReadinessCheck"
    })
    public ManagedSoftwareUpdateMaintenanceDetails(
            java.util.Date timeScheduled,
            UpdateReadinessStatus updateReadinessStatus,
            String updateReadinessStatusDetails,
            java.util.Date timeOfStatusUpdate,
            UpdateMode updateMode,
            String version,
            java.util.Date timeOfLastReadinessCheck) {
        super();
        this.timeScheduled = timeScheduled;
        this.updateReadinessStatus = updateReadinessStatus;
        this.updateReadinessStatusDetails = updateReadinessStatusDetails;
        this.timeOfStatusUpdate = timeOfStatusUpdate;
        this.updateMode = updateMode;
        this.version = version;
        this.timeOfLastReadinessCheck = timeOfLastReadinessCheck;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The date and time of the database was scheduled for update. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeScheduled")
        private java.util.Date timeScheduled;

        /**
         * The date and time of the database was scheduled for update.
         *
         * @param timeScheduled the value to set
         * @return this builder
         */
        public Builder timeScheduled(java.util.Date timeScheduled) {
            this.timeScheduled = timeScheduled;
            this.__explicitlySet__.add("timeScheduled");
            return this;
        }
        /** The managed software update readiness status */
        @com.fasterxml.jackson.annotation.JsonProperty("updateReadinessStatus")
        private UpdateReadinessStatus updateReadinessStatus;

        /**
         * The managed software update readiness status
         *
         * @param updateReadinessStatus the value to set
         * @return this builder
         */
        public Builder updateReadinessStatus(UpdateReadinessStatus updateReadinessStatus) {
            this.updateReadinessStatus = updateReadinessStatus;
            this.__explicitlySet__.add("updateReadinessStatus");
            return this;
        }
        /** This field will contain actual cause of update readiness state. */
        @com.fasterxml.jackson.annotation.JsonProperty("updateReadinessStatusDetails")
        private String updateReadinessStatusDetails;

        /**
         * This field will contain actual cause of update readiness state.
         *
         * @param updateReadinessStatusDetails the value to set
         * @return this builder
         */
        public Builder updateReadinessStatusDetails(String updateReadinessStatusDetails) {
            this.updateReadinessStatusDetails = updateReadinessStatusDetails;
            this.__explicitlySet__.add("updateReadinessStatusDetails");
            return this;
        }
        /** The date and time of when the status was updated. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfStatusUpdate")
        private java.util.Date timeOfStatusUpdate;

        /**
         * The date and time of when the status was updated.
         *
         * @param timeOfStatusUpdate the value to set
         * @return this builder
         */
        public Builder timeOfStatusUpdate(java.util.Date timeOfStatusUpdate) {
            this.timeOfStatusUpdate = timeOfStatusUpdate;
            this.__explicitlySet__.add("timeOfStatusUpdate");
            return this;
        }
        /** Oracle Managed Database Software update method, either "ROLLING" or "NONROLLING" */
        @com.fasterxml.jackson.annotation.JsonProperty("updateMode")
        private UpdateMode updateMode;

        /**
         * Oracle Managed Database Software update method, either "ROLLING" or "NONROLLING"
         *
         * @param updateMode the value to set
         * @return this builder
         */
        public Builder updateMode(UpdateMode updateMode) {
            this.updateMode = updateMode;
            this.__explicitlySet__.add("updateMode");
            return this;
        }
        /** The version of the database was scheduled for update. */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * The version of the database was scheduled for update.
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /** The date and time of the last readiness check. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfLastReadinessCheck")
        private java.util.Date timeOfLastReadinessCheck;

        /**
         * The date and time of the last readiness check.
         *
         * @param timeOfLastReadinessCheck the value to set
         * @return this builder
         */
        public Builder timeOfLastReadinessCheck(java.util.Date timeOfLastReadinessCheck) {
            this.timeOfLastReadinessCheck = timeOfLastReadinessCheck;
            this.__explicitlySet__.add("timeOfLastReadinessCheck");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagedSoftwareUpdateMaintenanceDetails build() {
            ManagedSoftwareUpdateMaintenanceDetails model =
                    new ManagedSoftwareUpdateMaintenanceDetails(
                            this.timeScheduled,
                            this.updateReadinessStatus,
                            this.updateReadinessStatusDetails,
                            this.timeOfStatusUpdate,
                            this.updateMode,
                            this.version,
                            this.timeOfLastReadinessCheck);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagedSoftwareUpdateMaintenanceDetails model) {
            if (model.wasPropertyExplicitlySet("timeScheduled")) {
                this.timeScheduled(model.getTimeScheduled());
            }
            if (model.wasPropertyExplicitlySet("updateReadinessStatus")) {
                this.updateReadinessStatus(model.getUpdateReadinessStatus());
            }
            if (model.wasPropertyExplicitlySet("updateReadinessStatusDetails")) {
                this.updateReadinessStatusDetails(model.getUpdateReadinessStatusDetails());
            }
            if (model.wasPropertyExplicitlySet("timeOfStatusUpdate")) {
                this.timeOfStatusUpdate(model.getTimeOfStatusUpdate());
            }
            if (model.wasPropertyExplicitlySet("updateMode")) {
                this.updateMode(model.getUpdateMode());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("timeOfLastReadinessCheck")) {
                this.timeOfLastReadinessCheck(model.getTimeOfLastReadinessCheck());
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

    /** The date and time of the database was scheduled for update. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeScheduled")
    private final java.util.Date timeScheduled;

    /**
     * The date and time of the database was scheduled for update.
     *
     * @return the value
     */
    public java.util.Date getTimeScheduled() {
        return timeScheduled;
    }

    /** The managed software update readiness status */
    public enum UpdateReadinessStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Scheduled("SCHEDULED"),
        Succeeded("SUCCEEDED"),
        ReadyForManagedUpdate("READY_FOR_MANAGED_UPDATE"),
        NotReadyForManagedUpdate("NOT_READY_FOR_MANAGED_UPDATE"),
        InProgress("IN_PROGRESS"),
        NeedsAttention("NEEDS_ATTENTION"),
        AwaitingResolution("AWAITING_RESOLUTION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(UpdateReadinessStatus.class);

        private final String value;
        private static java.util.Map<String, UpdateReadinessStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (UpdateReadinessStatus v : UpdateReadinessStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        UpdateReadinessStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UpdateReadinessStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'UpdateReadinessStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The managed software update readiness status */
    @com.fasterxml.jackson.annotation.JsonProperty("updateReadinessStatus")
    private final UpdateReadinessStatus updateReadinessStatus;

    /**
     * The managed software update readiness status
     *
     * @return the value
     */
    public UpdateReadinessStatus getUpdateReadinessStatus() {
        return updateReadinessStatus;
    }

    /** This field will contain actual cause of update readiness state. */
    @com.fasterxml.jackson.annotation.JsonProperty("updateReadinessStatusDetails")
    private final String updateReadinessStatusDetails;

    /**
     * This field will contain actual cause of update readiness state.
     *
     * @return the value
     */
    public String getUpdateReadinessStatusDetails() {
        return updateReadinessStatusDetails;
    }

    /** The date and time of when the status was updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfStatusUpdate")
    private final java.util.Date timeOfStatusUpdate;

    /**
     * The date and time of when the status was updated.
     *
     * @return the value
     */
    public java.util.Date getTimeOfStatusUpdate() {
        return timeOfStatusUpdate;
    }

    /** Oracle Managed Database Software update method, either "ROLLING" or "NONROLLING" */
    public enum UpdateMode implements com.oracle.bmc.http.internal.BmcEnum {
        Rolling("ROLLING"),
        Nonrolling("NONROLLING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(UpdateMode.class);

        private final String value;
        private static java.util.Map<String, UpdateMode> map;

        static {
            map = new java.util.HashMap<>();
            for (UpdateMode v : UpdateMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        UpdateMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UpdateMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'UpdateMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Oracle Managed Database Software update method, either "ROLLING" or "NONROLLING" */
    @com.fasterxml.jackson.annotation.JsonProperty("updateMode")
    private final UpdateMode updateMode;

    /**
     * Oracle Managed Database Software update method, either "ROLLING" or "NONROLLING"
     *
     * @return the value
     */
    public UpdateMode getUpdateMode() {
        return updateMode;
    }

    /** The version of the database was scheduled for update. */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * The version of the database was scheduled for update.
     *
     * @return the value
     */
    public String getVersion() {
        return version;
    }

    /** The date and time of the last readiness check. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfLastReadinessCheck")
    private final java.util.Date timeOfLastReadinessCheck;

    /**
     * The date and time of the last readiness check.
     *
     * @return the value
     */
    public java.util.Date getTimeOfLastReadinessCheck() {
        return timeOfLastReadinessCheck;
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
        sb.append("ManagedSoftwareUpdateMaintenanceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("timeScheduled=").append(String.valueOf(this.timeScheduled));
        sb.append(", updateReadinessStatus=").append(String.valueOf(this.updateReadinessStatus));
        sb.append(", updateReadinessStatusDetails=")
                .append(String.valueOf(this.updateReadinessStatusDetails));
        sb.append(", timeOfStatusUpdate=").append(String.valueOf(this.timeOfStatusUpdate));
        sb.append(", updateMode=").append(String.valueOf(this.updateMode));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", timeOfLastReadinessCheck=")
                .append(String.valueOf(this.timeOfLastReadinessCheck));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagedSoftwareUpdateMaintenanceDetails)) {
            return false;
        }

        ManagedSoftwareUpdateMaintenanceDetails other = (ManagedSoftwareUpdateMaintenanceDetails) o;
        return java.util.Objects.equals(this.timeScheduled, other.timeScheduled)
                && java.util.Objects.equals(this.updateReadinessStatus, other.updateReadinessStatus)
                && java.util.Objects.equals(
                        this.updateReadinessStatusDetails, other.updateReadinessStatusDetails)
                && java.util.Objects.equals(this.timeOfStatusUpdate, other.timeOfStatusUpdate)
                && java.util.Objects.equals(this.updateMode, other.updateMode)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(
                        this.timeOfLastReadinessCheck, other.timeOfLastReadinessCheck)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timeScheduled == null ? 43 : this.timeScheduled.hashCode());
        result =
                (result * PRIME)
                        + (this.updateReadinessStatus == null
                                ? 43
                                : this.updateReadinessStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.updateReadinessStatusDetails == null
                                ? 43
                                : this.updateReadinessStatusDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfStatusUpdate == null
                                ? 43
                                : this.timeOfStatusUpdate.hashCode());
        result = (result * PRIME) + (this.updateMode == null ? 43 : this.updateMode.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfLastReadinessCheck == null
                                ? 43
                                : this.timeOfLastReadinessCheck.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
