/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * A log entry related to the pre-masking health check. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MaskingPolicyHealthReportLogSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MaskingPolicyHealthReportLogSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "messageType",
        "timestamp",
        "message",
        "remediation",
        "description",
        "healthCheckType"
    })
    public MaskingPolicyHealthReportLogSummary(
            MessageType messageType,
            java.util.Date timestamp,
            String message,
            String remediation,
            String description,
            HealthCheckType healthCheckType) {
        super();
        this.messageType = messageType;
        this.timestamp = timestamp;
        this.message = message;
        this.remediation = remediation;
        this.description = description;
        this.healthCheckType = healthCheckType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The log entry type. */
        @com.fasterxml.jackson.annotation.JsonProperty("messageType")
        private MessageType messageType;

        /**
         * The log entry type.
         *
         * @param messageType the value to set
         * @return this builder
         */
        public Builder messageType(MessageType messageType) {
            this.messageType = messageType;
            this.__explicitlySet__.add("messageType");
            return this;
        }
        /**
         * The date and time the log entry was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        /**
         * The date and time the log entry was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timestamp the value to set
         * @return this builder
         */
        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }
        /** A human-readable log entry. */
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * A human-readable log entry.
         *
         * @param message the value to set
         * @return this builder
         */
        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }
        /** A human-readable log entry to remedy any error or warnings in the masking policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("remediation")
        private String remediation;

        /**
         * A human-readable log entry to remedy any error or warnings in the masking policy.
         *
         * @param remediation the value to set
         * @return this builder
         */
        public Builder remediation(String remediation) {
            this.remediation = remediation;
            this.__explicitlySet__.add("remediation");
            return this;
        }
        /** A human-readable description for the log entry. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A human-readable description for the log entry.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * An enum type entry for each health check in the masking policy. Each enum describes a
         * type of health check. INVALID_OBJECT_CHECK checks if there exist any invalid objects in
         * the masking tables. PRIVILEGE_CHECK checks if the masking user has sufficient privilege
         * to run masking. TABLESPACE_CHECK checks if the user has sufficient default and TEMP
         * tablespace. DATABASE_OR_SYSTEM_TRIGGERS_CHECK checks if there exist any database/system
         * triggers available. UNDO_TABLESPACE_CHECK checks if the AUTOEXTEND feature is enabled for
         * the undo tablespace. If it's not enabled, it further checks if the undo tablespace has
         * any space remaining STATE_STATS_CHECK checks if all the statistics of the masking table
         * is upto date or not. OLS_POLICY_CHECK , VPD_POLICY_CHECK and REDACTION_POLICY_CHECK
         * checks if the masking tables has Oracle Label Security (OLS) or Virtual Private Database
         * (VPD) or Redaction policies enabled. DV_ENABLE_CHECK checks if database has Database
         * Vault(DV) enabled DE_COL_SIZE_CHECK checks if any masking column with DETERMINISTIC
         * ENCRYPTION as masking format has average column size greater than 27 or not.
         * ACTIVE_MASK_JOB_CHECK checks if there is any active masking job running on the target
         * database. DETERMINISTIC_ENCRYPTION_FORMAT_CHECK checks if any masking column has
         * deterministic encryption masking format. COLUMN_EXIST_CHECK checks if the masking columns
         * are available in the target database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("healthCheckType")
        private HealthCheckType healthCheckType;

        /**
         * An enum type entry for each health check in the masking policy. Each enum describes a
         * type of health check. INVALID_OBJECT_CHECK checks if there exist any invalid objects in
         * the masking tables. PRIVILEGE_CHECK checks if the masking user has sufficient privilege
         * to run masking. TABLESPACE_CHECK checks if the user has sufficient default and TEMP
         * tablespace. DATABASE_OR_SYSTEM_TRIGGERS_CHECK checks if there exist any database/system
         * triggers available. UNDO_TABLESPACE_CHECK checks if the AUTOEXTEND feature is enabled for
         * the undo tablespace. If it's not enabled, it further checks if the undo tablespace has
         * any space remaining STATE_STATS_CHECK checks if all the statistics of the masking table
         * is upto date or not. OLS_POLICY_CHECK , VPD_POLICY_CHECK and REDACTION_POLICY_CHECK
         * checks if the masking tables has Oracle Label Security (OLS) or Virtual Private Database
         * (VPD) or Redaction policies enabled. DV_ENABLE_CHECK checks if database has Database
         * Vault(DV) enabled DE_COL_SIZE_CHECK checks if any masking column with DETERMINISTIC
         * ENCRYPTION as masking format has average column size greater than 27 or not.
         * ACTIVE_MASK_JOB_CHECK checks if there is any active masking job running on the target
         * database. DETERMINISTIC_ENCRYPTION_FORMAT_CHECK checks if any masking column has
         * deterministic encryption masking format. COLUMN_EXIST_CHECK checks if the masking columns
         * are available in the target database.
         *
         * @param healthCheckType the value to set
         * @return this builder
         */
        public Builder healthCheckType(HealthCheckType healthCheckType) {
            this.healthCheckType = healthCheckType;
            this.__explicitlySet__.add("healthCheckType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MaskingPolicyHealthReportLogSummary build() {
            MaskingPolicyHealthReportLogSummary model =
                    new MaskingPolicyHealthReportLogSummary(
                            this.messageType,
                            this.timestamp,
                            this.message,
                            this.remediation,
                            this.description,
                            this.healthCheckType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MaskingPolicyHealthReportLogSummary model) {
            if (model.wasPropertyExplicitlySet("messageType")) {
                this.messageType(model.getMessageType());
            }
            if (model.wasPropertyExplicitlySet("timestamp")) {
                this.timestamp(model.getTimestamp());
            }
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
            }
            if (model.wasPropertyExplicitlySet("remediation")) {
                this.remediation(model.getRemediation());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("healthCheckType")) {
                this.healthCheckType(model.getHealthCheckType());
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

    /** The log entry type. */
    public enum MessageType implements com.oracle.bmc.http.internal.BmcEnum {
        Pass("PASS"),
        Warning("WARNING"),
        Error("ERROR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(MessageType.class);

        private final String value;
        private static java.util.Map<String, MessageType> map;

        static {
            map = new java.util.HashMap<>();
            for (MessageType v : MessageType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        MessageType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MessageType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'MessageType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The log entry type. */
    @com.fasterxml.jackson.annotation.JsonProperty("messageType")
    private final MessageType messageType;

    /**
     * The log entry type.
     *
     * @return the value
     */
    public MessageType getMessageType() {
        return messageType;
    }

    /**
     * The date and time the log entry was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final java.util.Date timestamp;

    /**
     * The date and time the log entry was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /** A human-readable log entry. */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * A human-readable log entry.
     *
     * @return the value
     */
    public String getMessage() {
        return message;
    }

    /** A human-readable log entry to remedy any error or warnings in the masking policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("remediation")
    private final String remediation;

    /**
     * A human-readable log entry to remedy any error or warnings in the masking policy.
     *
     * @return the value
     */
    public String getRemediation() {
        return remediation;
    }

    /** A human-readable description for the log entry. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A human-readable description for the log entry.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * An enum type entry for each health check in the masking policy. Each enum describes a type of
     * health check. INVALID_OBJECT_CHECK checks if there exist any invalid objects in the masking
     * tables. PRIVILEGE_CHECK checks if the masking user has sufficient privilege to run masking.
     * TABLESPACE_CHECK checks if the user has sufficient default and TEMP tablespace.
     * DATABASE_OR_SYSTEM_TRIGGERS_CHECK checks if there exist any database/system triggers
     * available. UNDO_TABLESPACE_CHECK checks if the AUTOEXTEND feature is enabled for the undo
     * tablespace. If it's not enabled, it further checks if the undo tablespace has any space
     * remaining STATE_STATS_CHECK checks if all the statistics of the masking table is upto date or
     * not. OLS_POLICY_CHECK , VPD_POLICY_CHECK and REDACTION_POLICY_CHECK checks if the masking
     * tables has Oracle Label Security (OLS) or Virtual Private Database (VPD) or Redaction
     * policies enabled. DV_ENABLE_CHECK checks if database has Database Vault(DV) enabled
     * DE_COL_SIZE_CHECK checks if any masking column with DETERMINISTIC ENCRYPTION as masking
     * format has average column size greater than 27 or not. ACTIVE_MASK_JOB_CHECK checks if there
     * is any active masking job running on the target database.
     * DETERMINISTIC_ENCRYPTION_FORMAT_CHECK checks if any masking column has deterministic
     * encryption masking format. COLUMN_EXIST_CHECK checks if the masking columns are available in
     * the target database.
     */
    public enum HealthCheckType implements com.oracle.bmc.http.internal.BmcEnum {
        InvalidObjectCheck("INVALID_OBJECT_CHECK"),
        PrivilegeCheck("PRIVILEGE_CHECK"),
        TablespaceCheck("TABLESPACE_CHECK"),
        DatabaseOrSystemTriggersCheck("DATABASE_OR_SYSTEM_TRIGGERS_CHECK"),
        UndoTablespaceCheck("UNDO_TABLESPACE_CHECK"),
        StateStatsCheck("STATE_STATS_CHECK"),
        OlsPolicyCheck("OLS_POLICY_CHECK"),
        VpdPolicyCheck("VPD_POLICY_CHECK"),
        DvEnableCheck("DV_ENABLE_CHECK"),
        DeColSizeCheck("DE_COL_SIZE_CHECK"),
        RedactionPolicyCheck("REDACTION_POLICY_CHECK"),
        ActiveMaskJobCheck("ACTIVE_MASK_JOB_CHECK"),
        TargetValidationCheck("TARGET_VALIDATION_CHECK"),
        DeterministicEncryptionFormatCheck("DETERMINISTIC_ENCRYPTION_FORMAT_CHECK"),
        ColumnExistCheck("COLUMN_EXIST_CHECK"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(HealthCheckType.class);

        private final String value;
        private static java.util.Map<String, HealthCheckType> map;

        static {
            map = new java.util.HashMap<>();
            for (HealthCheckType v : HealthCheckType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        HealthCheckType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static HealthCheckType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'HealthCheckType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * An enum type entry for each health check in the masking policy. Each enum describes a type of
     * health check. INVALID_OBJECT_CHECK checks if there exist any invalid objects in the masking
     * tables. PRIVILEGE_CHECK checks if the masking user has sufficient privilege to run masking.
     * TABLESPACE_CHECK checks if the user has sufficient default and TEMP tablespace.
     * DATABASE_OR_SYSTEM_TRIGGERS_CHECK checks if there exist any database/system triggers
     * available. UNDO_TABLESPACE_CHECK checks if the AUTOEXTEND feature is enabled for the undo
     * tablespace. If it's not enabled, it further checks if the undo tablespace has any space
     * remaining STATE_STATS_CHECK checks if all the statistics of the masking table is upto date or
     * not. OLS_POLICY_CHECK , VPD_POLICY_CHECK and REDACTION_POLICY_CHECK checks if the masking
     * tables has Oracle Label Security (OLS) or Virtual Private Database (VPD) or Redaction
     * policies enabled. DV_ENABLE_CHECK checks if database has Database Vault(DV) enabled
     * DE_COL_SIZE_CHECK checks if any masking column with DETERMINISTIC ENCRYPTION as masking
     * format has average column size greater than 27 or not. ACTIVE_MASK_JOB_CHECK checks if there
     * is any active masking job running on the target database.
     * DETERMINISTIC_ENCRYPTION_FORMAT_CHECK checks if any masking column has deterministic
     * encryption masking format. COLUMN_EXIST_CHECK checks if the masking columns are available in
     * the target database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("healthCheckType")
    private final HealthCheckType healthCheckType;

    /**
     * An enum type entry for each health check in the masking policy. Each enum describes a type of
     * health check. INVALID_OBJECT_CHECK checks if there exist any invalid objects in the masking
     * tables. PRIVILEGE_CHECK checks if the masking user has sufficient privilege to run masking.
     * TABLESPACE_CHECK checks if the user has sufficient default and TEMP tablespace.
     * DATABASE_OR_SYSTEM_TRIGGERS_CHECK checks if there exist any database/system triggers
     * available. UNDO_TABLESPACE_CHECK checks if the AUTOEXTEND feature is enabled for the undo
     * tablespace. If it's not enabled, it further checks if the undo tablespace has any space
     * remaining STATE_STATS_CHECK checks if all the statistics of the masking table is upto date or
     * not. OLS_POLICY_CHECK , VPD_POLICY_CHECK and REDACTION_POLICY_CHECK checks if the masking
     * tables has Oracle Label Security (OLS) or Virtual Private Database (VPD) or Redaction
     * policies enabled. DV_ENABLE_CHECK checks if database has Database Vault(DV) enabled
     * DE_COL_SIZE_CHECK checks if any masking column with DETERMINISTIC ENCRYPTION as masking
     * format has average column size greater than 27 or not. ACTIVE_MASK_JOB_CHECK checks if there
     * is any active masking job running on the target database.
     * DETERMINISTIC_ENCRYPTION_FORMAT_CHECK checks if any masking column has deterministic
     * encryption masking format. COLUMN_EXIST_CHECK checks if the masking columns are available in
     * the target database.
     *
     * @return the value
     */
    public HealthCheckType getHealthCheckType() {
        return healthCheckType;
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
        sb.append("MaskingPolicyHealthReportLogSummary(");
        sb.append("super=").append(super.toString());
        sb.append("messageType=").append(String.valueOf(this.messageType));
        sb.append(", timestamp=").append(String.valueOf(this.timestamp));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(", remediation=").append(String.valueOf(this.remediation));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", healthCheckType=").append(String.valueOf(this.healthCheckType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MaskingPolicyHealthReportLogSummary)) {
            return false;
        }

        MaskingPolicyHealthReportLogSummary other = (MaskingPolicyHealthReportLogSummary) o;
        return java.util.Objects.equals(this.messageType, other.messageType)
                && java.util.Objects.equals(this.timestamp, other.timestamp)
                && java.util.Objects.equals(this.message, other.message)
                && java.util.Objects.equals(this.remediation, other.remediation)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.healthCheckType, other.healthCheckType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.messageType == null ? 43 : this.messageType.hashCode());
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + (this.remediation == null ? 43 : this.remediation.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.healthCheckType == null ? 43 : this.healthCheckType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
