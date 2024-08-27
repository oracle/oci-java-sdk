/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.model;

/**
 * The details of auto rotation schedule for the Key being create updated or imported. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AutoKeyRotationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AutoKeyRotationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "rotationIntervalInDays",
        "timeOfScheduleStart",
        "timeOfNextRotation",
        "timeOfLastRotation",
        "lastRotationStatus",
        "lastRotationMessage"
    })
    public AutoKeyRotationDetails(
            Integer rotationIntervalInDays,
            java.util.Date timeOfScheduleStart,
            java.util.Date timeOfNextRotation,
            java.util.Date timeOfLastRotation,
            LastRotationStatus lastRotationStatus,
            String lastRotationMessage) {
        super();
        this.rotationIntervalInDays = rotationIntervalInDays;
        this.timeOfScheduleStart = timeOfScheduleStart;
        this.timeOfNextRotation = timeOfNextRotation;
        this.timeOfLastRotation = timeOfLastRotation;
        this.lastRotationStatus = lastRotationStatus;
        this.lastRotationMessage = lastRotationMessage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The interval of auto key rotation. For auto key rotation the interval should between 60
         * day and 365 days (1 year). Note: User must specify this parameter when creating a new
         * schedule.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("rotationIntervalInDays")
        private Integer rotationIntervalInDays;

        /**
         * The interval of auto key rotation. For auto key rotation the interval should between 60
         * day and 365 days (1 year). Note: User must specify this parameter when creating a new
         * schedule.
         *
         * @param rotationIntervalInDays the value to set
         * @return this builder
         */
        public Builder rotationIntervalInDays(Integer rotationIntervalInDays) {
            this.rotationIntervalInDays = rotationIntervalInDays;
            this.__explicitlySet__.add("rotationIntervalInDays");
            return this;
        }
        /**
         * A property indicating scheduled start date expressed as date YYYY-MM-DD String. Example:
         * 2023-04-04T00:00:00Z. The time has no significance when scheduling an auto key rotation
         * as this can be done anytime approximately the scheduled day, KMS ignores the time and
         * replaces it with 00:00, for example 2023-04-04T15:14:13Z will be used as
         * 2023-04-04T00:00:00Z . Note : Today\u2019s date will be used if not specified by
         * customer.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfScheduleStart")
        private java.util.Date timeOfScheduleStart;

        /**
         * A property indicating scheduled start date expressed as date YYYY-MM-DD String. Example:
         * 2023-04-04T00:00:00Z. The time has no significance when scheduling an auto key rotation
         * as this can be done anytime approximately the scheduled day, KMS ignores the time and
         * replaces it with 00:00, for example 2023-04-04T15:14:13Z will be used as
         * 2023-04-04T00:00:00Z . Note : Today\u2019s date will be used if not specified by
         * customer.
         *
         * @param timeOfScheduleStart the value to set
         * @return this builder
         */
        public Builder timeOfScheduleStart(java.util.Date timeOfScheduleStart) {
            this.timeOfScheduleStart = timeOfScheduleStart;
            this.__explicitlySet__.add("timeOfScheduleStart");
            return this;
        }
        /**
         * A property indicating Next estimated scheduled Time, as per the interval, expressed as
         * date YYYY-MM-DD String. Example: {@code 2023-04-04T00:00:00Z}. The time has no
         * significance when scheduling an auto key rotation as this can be done anytime
         * approximately the scheduled day, KMS ignores the time and replaces it with 00:00, for
         * example 2023-04-04T15:14:13Z will be used as 2023-04-04T00:00:00Z.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfNextRotation")
        private java.util.Date timeOfNextRotation;

        /**
         * A property indicating Next estimated scheduled Time, as per the interval, expressed as
         * date YYYY-MM-DD String. Example: {@code 2023-04-04T00:00:00Z}. The time has no
         * significance when scheduling an auto key rotation as this can be done anytime
         * approximately the scheduled day, KMS ignores the time and replaces it with 00:00, for
         * example 2023-04-04T15:14:13Z will be used as 2023-04-04T00:00:00Z.
         *
         * @param timeOfNextRotation the value to set
         * @return this builder
         */
        public Builder timeOfNextRotation(java.util.Date timeOfNextRotation) {
            this.timeOfNextRotation = timeOfNextRotation;
            this.__explicitlySet__.add("timeOfNextRotation");
            return this;
        }
        /** A property indicating Last rotation Date. Example: {@code 2023-04-04T00:00:00Z}. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfLastRotation")
        private java.util.Date timeOfLastRotation;

        /**
         * A property indicating Last rotation Date. Example: {@code 2023-04-04T00:00:00Z}.
         *
         * @param timeOfLastRotation the value to set
         * @return this builder
         */
        public Builder timeOfLastRotation(java.util.Date timeOfLastRotation) {
            this.timeOfLastRotation = timeOfLastRotation;
            this.__explicitlySet__.add("timeOfLastRotation");
            return this;
        }
        /** The status of last execution of auto key rotation. */
        @com.fasterxml.jackson.annotation.JsonProperty("lastRotationStatus")
        private LastRotationStatus lastRotationStatus;

        /**
         * The status of last execution of auto key rotation.
         *
         * @param lastRotationStatus the value to set
         * @return this builder
         */
        public Builder lastRotationStatus(LastRotationStatus lastRotationStatus) {
            this.lastRotationStatus = lastRotationStatus;
            this.__explicitlySet__.add("lastRotationStatus");
            return this;
        }
        /** The last execution status message of auto key rotation. */
        @com.fasterxml.jackson.annotation.JsonProperty("lastRotationMessage")
        private String lastRotationMessage;

        /**
         * The last execution status message of auto key rotation.
         *
         * @param lastRotationMessage the value to set
         * @return this builder
         */
        public Builder lastRotationMessage(String lastRotationMessage) {
            this.lastRotationMessage = lastRotationMessage;
            this.__explicitlySet__.add("lastRotationMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutoKeyRotationDetails build() {
            AutoKeyRotationDetails model =
                    new AutoKeyRotationDetails(
                            this.rotationIntervalInDays,
                            this.timeOfScheduleStart,
                            this.timeOfNextRotation,
                            this.timeOfLastRotation,
                            this.lastRotationStatus,
                            this.lastRotationMessage);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutoKeyRotationDetails model) {
            if (model.wasPropertyExplicitlySet("rotationIntervalInDays")) {
                this.rotationIntervalInDays(model.getRotationIntervalInDays());
            }
            if (model.wasPropertyExplicitlySet("timeOfScheduleStart")) {
                this.timeOfScheduleStart(model.getTimeOfScheduleStart());
            }
            if (model.wasPropertyExplicitlySet("timeOfNextRotation")) {
                this.timeOfNextRotation(model.getTimeOfNextRotation());
            }
            if (model.wasPropertyExplicitlySet("timeOfLastRotation")) {
                this.timeOfLastRotation(model.getTimeOfLastRotation());
            }
            if (model.wasPropertyExplicitlySet("lastRotationStatus")) {
                this.lastRotationStatus(model.getLastRotationStatus());
            }
            if (model.wasPropertyExplicitlySet("lastRotationMessage")) {
                this.lastRotationMessage(model.getLastRotationMessage());
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
     * The interval of auto key rotation. For auto key rotation the interval should between 60 day
     * and 365 days (1 year). Note: User must specify this parameter when creating a new schedule.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rotationIntervalInDays")
    private final Integer rotationIntervalInDays;

    /**
     * The interval of auto key rotation. For auto key rotation the interval should between 60 day
     * and 365 days (1 year). Note: User must specify this parameter when creating a new schedule.
     *
     * @return the value
     */
    public Integer getRotationIntervalInDays() {
        return rotationIntervalInDays;
    }

    /**
     * A property indicating scheduled start date expressed as date YYYY-MM-DD String. Example:
     * 2023-04-04T00:00:00Z. The time has no significance when scheduling an auto key rotation as
     * this can be done anytime approximately the scheduled day, KMS ignores the time and replaces
     * it with 00:00, for example 2023-04-04T15:14:13Z will be used as 2023-04-04T00:00:00Z . Note :
     * Today\u2019s date will be used if not specified by customer.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfScheduleStart")
    private final java.util.Date timeOfScheduleStart;

    /**
     * A property indicating scheduled start date expressed as date YYYY-MM-DD String. Example:
     * 2023-04-04T00:00:00Z. The time has no significance when scheduling an auto key rotation as
     * this can be done anytime approximately the scheduled day, KMS ignores the time and replaces
     * it with 00:00, for example 2023-04-04T15:14:13Z will be used as 2023-04-04T00:00:00Z . Note :
     * Today\u2019s date will be used if not specified by customer.
     *
     * @return the value
     */
    public java.util.Date getTimeOfScheduleStart() {
        return timeOfScheduleStart;
    }

    /**
     * A property indicating Next estimated scheduled Time, as per the interval, expressed as date
     * YYYY-MM-DD String. Example: {@code 2023-04-04T00:00:00Z}. The time has no significance when
     * scheduling an auto key rotation as this can be done anytime approximately the scheduled day,
     * KMS ignores the time and replaces it with 00:00, for example 2023-04-04T15:14:13Z will be
     * used as 2023-04-04T00:00:00Z.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfNextRotation")
    private final java.util.Date timeOfNextRotation;

    /**
     * A property indicating Next estimated scheduled Time, as per the interval, expressed as date
     * YYYY-MM-DD String. Example: {@code 2023-04-04T00:00:00Z}. The time has no significance when
     * scheduling an auto key rotation as this can be done anytime approximately the scheduled day,
     * KMS ignores the time and replaces it with 00:00, for example 2023-04-04T15:14:13Z will be
     * used as 2023-04-04T00:00:00Z.
     *
     * @return the value
     */
    public java.util.Date getTimeOfNextRotation() {
        return timeOfNextRotation;
    }

    /** A property indicating Last rotation Date. Example: {@code 2023-04-04T00:00:00Z}. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfLastRotation")
    private final java.util.Date timeOfLastRotation;

    /**
     * A property indicating Last rotation Date. Example: {@code 2023-04-04T00:00:00Z}.
     *
     * @return the value
     */
    public java.util.Date getTimeOfLastRotation() {
        return timeOfLastRotation;
    }

    /** The status of last execution of auto key rotation. */
    public enum LastRotationStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Success("SUCCESS"),
        Failed("FAILED"),
        InProgress("IN_PROGRESS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LastRotationStatus.class);

        private final String value;
        private static java.util.Map<String, LastRotationStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (LastRotationStatus v : LastRotationStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LastRotationStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LastRotationStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LastRotationStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The status of last execution of auto key rotation. */
    @com.fasterxml.jackson.annotation.JsonProperty("lastRotationStatus")
    private final LastRotationStatus lastRotationStatus;

    /**
     * The status of last execution of auto key rotation.
     *
     * @return the value
     */
    public LastRotationStatus getLastRotationStatus() {
        return lastRotationStatus;
    }

    /** The last execution status message of auto key rotation. */
    @com.fasterxml.jackson.annotation.JsonProperty("lastRotationMessage")
    private final String lastRotationMessage;

    /**
     * The last execution status message of auto key rotation.
     *
     * @return the value
     */
    public String getLastRotationMessage() {
        return lastRotationMessage;
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
        sb.append("AutoKeyRotationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("rotationIntervalInDays=").append(String.valueOf(this.rotationIntervalInDays));
        sb.append(", timeOfScheduleStart=").append(String.valueOf(this.timeOfScheduleStart));
        sb.append(", timeOfNextRotation=").append(String.valueOf(this.timeOfNextRotation));
        sb.append(", timeOfLastRotation=").append(String.valueOf(this.timeOfLastRotation));
        sb.append(", lastRotationStatus=").append(String.valueOf(this.lastRotationStatus));
        sb.append(", lastRotationMessage=").append(String.valueOf(this.lastRotationMessage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutoKeyRotationDetails)) {
            return false;
        }

        AutoKeyRotationDetails other = (AutoKeyRotationDetails) o;
        return java.util.Objects.equals(this.rotationIntervalInDays, other.rotationIntervalInDays)
                && java.util.Objects.equals(this.timeOfScheduleStart, other.timeOfScheduleStart)
                && java.util.Objects.equals(this.timeOfNextRotation, other.timeOfNextRotation)
                && java.util.Objects.equals(this.timeOfLastRotation, other.timeOfLastRotation)
                && java.util.Objects.equals(this.lastRotationStatus, other.lastRotationStatus)
                && java.util.Objects.equals(this.lastRotationMessage, other.lastRotationMessage)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.rotationIntervalInDays == null
                                ? 43
                                : this.rotationIntervalInDays.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfScheduleStart == null
                                ? 43
                                : this.timeOfScheduleStart.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfNextRotation == null
                                ? 43
                                : this.timeOfNextRotation.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfLastRotation == null
                                ? 43
                                : this.timeOfLastRotation.hashCode());
        result =
                (result * PRIME)
                        + (this.lastRotationStatus == null
                                ? 43
                                : this.lastRotationStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.lastRotationMessage == null
                                ? 43
                                : this.lastRotationMessage.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
