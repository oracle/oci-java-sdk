/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * Backup validation details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = BackupValidationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BackupValidationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "validationStatus",
        "timeLastValidated",
        "estimatedRestoreDuration",
        "errorMessage",
        "backupPreparationStatus",
        "preparedBackupDetails"
    })
    public BackupValidationDetails(
            ValidationStatus validationStatus,
            java.util.Date timeLastValidated,
            String estimatedRestoreDuration,
            String errorMessage,
            BackupPreparationStatus backupPreparationStatus,
            PreparedBackupDetails preparedBackupDetails) {
        super();
        this.validationStatus = validationStatus;
        this.timeLastValidated = timeLastValidated;
        this.estimatedRestoreDuration = estimatedRestoreDuration;
        this.errorMessage = errorMessage;
        this.backupPreparationStatus = backupPreparationStatus;
        this.preparedBackupDetails = preparedBackupDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The status of backup validation: NOT_VALIDATED (Default): The backup has not been
         * validated. VALIDATED: The backup has been validated successfully. NEEDS_ATTENTION: The
         * backup validation failed due to a transient issue. Validation should be retried. FAILED:
         * The backup cannot be restored.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("validationStatus")
        private ValidationStatus validationStatus;

        /**
         * The status of backup validation: NOT_VALIDATED (Default): The backup has not been
         * validated. VALIDATED: The backup has been validated successfully. NEEDS_ATTENTION: The
         * backup validation failed due to a transient issue. Validation should be retried. FAILED:
         * The backup cannot be restored.
         *
         * @param validationStatus the value to set
         * @return this builder
         */
        public Builder validationStatus(ValidationStatus validationStatus) {
            this.validationStatus = validationStatus;
            this.__explicitlySet__.add("validationStatus");
            return this;
        }
        /** The date and time of the most recent validation performed on the backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastValidated")
        private java.util.Date timeLastValidated;

        /**
         * The date and time of the most recent validation performed on the backup.
         *
         * @param timeLastValidated the value to set
         * @return this builder
         */
        public Builder timeLastValidated(java.util.Date timeLastValidated) {
            this.timeLastValidated = timeLastValidated;
            this.__explicitlySet__.add("timeLastValidated");
            return this;
        }
        /** The estimated restore duration of the backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("estimatedRestoreDuration")
        private String estimatedRestoreDuration;

        /**
         * The estimated restore duration of the backup.
         *
         * @param estimatedRestoreDuration the value to set
         * @return this builder
         */
        public Builder estimatedRestoreDuration(String estimatedRestoreDuration) {
            this.estimatedRestoreDuration = estimatedRestoreDuration;
            this.__explicitlySet__.add("estimatedRestoreDuration");
            return this;
        }
        /** Error message if the backup validation has failed. */
        @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
        private String errorMessage;

        /**
         * Error message if the backup validation has failed.
         *
         * @param errorMessage the value to set
         * @return this builder
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            this.__explicitlySet__.add("errorMessage");
            return this;
        }
        /**
         * Indicates whether the backup has been prepared successfully. PREPARED: The backup is
         * prepared one. NOT_PREPARED: The backup is not prepared.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("backupPreparationStatus")
        private BackupPreparationStatus backupPreparationStatus;

        /**
         * Indicates whether the backup has been prepared successfully. PREPARED: The backup is
         * prepared one. NOT_PREPARED: The backup is not prepared.
         *
         * @param backupPreparationStatus the value to set
         * @return this builder
         */
        public Builder backupPreparationStatus(BackupPreparationStatus backupPreparationStatus) {
            this.backupPreparationStatus = backupPreparationStatus;
            this.__explicitlySet__.add("backupPreparationStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("preparedBackupDetails")
        private PreparedBackupDetails preparedBackupDetails;

        public Builder preparedBackupDetails(PreparedBackupDetails preparedBackupDetails) {
            this.preparedBackupDetails = preparedBackupDetails;
            this.__explicitlySet__.add("preparedBackupDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BackupValidationDetails build() {
            BackupValidationDetails model =
                    new BackupValidationDetails(
                            this.validationStatus,
                            this.timeLastValidated,
                            this.estimatedRestoreDuration,
                            this.errorMessage,
                            this.backupPreparationStatus,
                            this.preparedBackupDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BackupValidationDetails model) {
            if (model.wasPropertyExplicitlySet("validationStatus")) {
                this.validationStatus(model.getValidationStatus());
            }
            if (model.wasPropertyExplicitlySet("timeLastValidated")) {
                this.timeLastValidated(model.getTimeLastValidated());
            }
            if (model.wasPropertyExplicitlySet("estimatedRestoreDuration")) {
                this.estimatedRestoreDuration(model.getEstimatedRestoreDuration());
            }
            if (model.wasPropertyExplicitlySet("errorMessage")) {
                this.errorMessage(model.getErrorMessage());
            }
            if (model.wasPropertyExplicitlySet("backupPreparationStatus")) {
                this.backupPreparationStatus(model.getBackupPreparationStatus());
            }
            if (model.wasPropertyExplicitlySet("preparedBackupDetails")) {
                this.preparedBackupDetails(model.getPreparedBackupDetails());
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
     * The status of backup validation: NOT_VALIDATED (Default): The backup has not been validated.
     * VALIDATED: The backup has been validated successfully. NEEDS_ATTENTION: The backup validation
     * failed due to a transient issue. Validation should be retried. FAILED: The backup cannot be
     * restored.
     */
    public enum ValidationStatus implements com.oracle.bmc.http.internal.BmcEnum {
        NotValidated("NOT_VALIDATED"),
        Validated("VALIDATED"),
        NeedsAttention("NEEDS_ATTENTION"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ValidationStatus.class);

        private final String value;
        private static java.util.Map<String, ValidationStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (ValidationStatus v : ValidationStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ValidationStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ValidationStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ValidationStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The status of backup validation: NOT_VALIDATED (Default): The backup has not been validated.
     * VALIDATED: The backup has been validated successfully. NEEDS_ATTENTION: The backup validation
     * failed due to a transient issue. Validation should be retried. FAILED: The backup cannot be
     * restored.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("validationStatus")
    private final ValidationStatus validationStatus;

    /**
     * The status of backup validation: NOT_VALIDATED (Default): The backup has not been validated.
     * VALIDATED: The backup has been validated successfully. NEEDS_ATTENTION: The backup validation
     * failed due to a transient issue. Validation should be retried. FAILED: The backup cannot be
     * restored.
     *
     * @return the value
     */
    public ValidationStatus getValidationStatus() {
        return validationStatus;
    }

    /** The date and time of the most recent validation performed on the backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastValidated")
    private final java.util.Date timeLastValidated;

    /**
     * The date and time of the most recent validation performed on the backup.
     *
     * @return the value
     */
    public java.util.Date getTimeLastValidated() {
        return timeLastValidated;
    }

    /** The estimated restore duration of the backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("estimatedRestoreDuration")
    private final String estimatedRestoreDuration;

    /**
     * The estimated restore duration of the backup.
     *
     * @return the value
     */
    public String getEstimatedRestoreDuration() {
        return estimatedRestoreDuration;
    }

    /** Error message if the backup validation has failed. */
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
    private final String errorMessage;

    /**
     * Error message if the backup validation has failed.
     *
     * @return the value
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Indicates whether the backup has been prepared successfully. PREPARED: The backup is prepared
     * one. NOT_PREPARED: The backup is not prepared.
     */
    public enum BackupPreparationStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Prepared("PREPARED"),
        NotPrepared("NOT_PREPARED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(BackupPreparationStatus.class);

        private final String value;
        private static java.util.Map<String, BackupPreparationStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (BackupPreparationStatus v : BackupPreparationStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        BackupPreparationStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BackupPreparationStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'BackupPreparationStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates whether the backup has been prepared successfully. PREPARED: The backup is prepared
     * one. NOT_PREPARED: The backup is not prepared.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backupPreparationStatus")
    private final BackupPreparationStatus backupPreparationStatus;

    /**
     * Indicates whether the backup has been prepared successfully. PREPARED: The backup is prepared
     * one. NOT_PREPARED: The backup is not prepared.
     *
     * @return the value
     */
    public BackupPreparationStatus getBackupPreparationStatus() {
        return backupPreparationStatus;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("preparedBackupDetails")
    private final PreparedBackupDetails preparedBackupDetails;

    public PreparedBackupDetails getPreparedBackupDetails() {
        return preparedBackupDetails;
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
        sb.append("BackupValidationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("validationStatus=").append(String.valueOf(this.validationStatus));
        sb.append(", timeLastValidated=").append(String.valueOf(this.timeLastValidated));
        sb.append(", estimatedRestoreDuration=")
                .append(String.valueOf(this.estimatedRestoreDuration));
        sb.append(", errorMessage=").append(String.valueOf(this.errorMessage));
        sb.append(", backupPreparationStatus=")
                .append(String.valueOf(this.backupPreparationStatus));
        sb.append(", preparedBackupDetails=").append(String.valueOf(this.preparedBackupDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BackupValidationDetails)) {
            return false;
        }

        BackupValidationDetails other = (BackupValidationDetails) o;
        return java.util.Objects.equals(this.validationStatus, other.validationStatus)
                && java.util.Objects.equals(this.timeLastValidated, other.timeLastValidated)
                && java.util.Objects.equals(
                        this.estimatedRestoreDuration, other.estimatedRestoreDuration)
                && java.util.Objects.equals(this.errorMessage, other.errorMessage)
                && java.util.Objects.equals(
                        this.backupPreparationStatus, other.backupPreparationStatus)
                && java.util.Objects.equals(this.preparedBackupDetails, other.preparedBackupDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.validationStatus == null ? 43 : this.validationStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastValidated == null ? 43 : this.timeLastValidated.hashCode());
        result =
                (result * PRIME)
                        + (this.estimatedRestoreDuration == null
                                ? 43
                                : this.estimatedRestoreDuration.hashCode());
        result = (result * PRIME) + (this.errorMessage == null ? 43 : this.errorMessage.hashCode());
        result =
                (result * PRIME)
                        + (this.backupPreparationStatus == null
                                ? 43
                                : this.backupPreparationStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.preparedBackupDetails == null
                                ? 43
                                : this.preparedBackupDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
