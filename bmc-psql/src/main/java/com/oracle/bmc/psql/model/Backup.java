/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * Database system backup information. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Backup.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Backup extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "description",
        "compartmentId",
        "sourceType",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "retentionPeriod",
        "backupSize",
        "dbSystemId",
        "dbSystemDetails",
        "lastAcceptedRequestToken",
        "lastCompletedRequestToken",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public Backup(
            String id,
            String displayName,
            String description,
            String compartmentId,
            SourceType sourceType,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            Integer retentionPeriod,
            Integer backupSize,
            String dbSystemId,
            DbSystemDetails dbSystemDetails,
            String lastAcceptedRequestToken,
            String lastCompletedRequestToken,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.description = description;
        this.compartmentId = compartmentId;
        this.sourceType = sourceType;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.retentionPeriod = retentionPeriod;
        this.backupSize = backupSize;
        this.dbSystemId = dbSystemId;
        this.dbSystemDetails = dbSystemDetails;
        this.lastAcceptedRequestToken = lastAcceptedRequestToken;
        this.lastCompletedRequestToken = lastCompletedRequestToken;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * backup.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * backup.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** A user-friendly display name for the backup. Avoid entering confidential information. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly display name for the backup. Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** A description for the backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A description for the backup.
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
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment that contains the backup.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment that contains the backup.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Specifies whether the backup was created manually, or by a management policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceType")
        private SourceType sourceType;

        /**
         * Specifies whether the backup was created manually, or by a management policy.
         *
         * @param sourceType the value to set
         * @return this builder
         */
        public Builder sourceType(SourceType sourceType) {
            this.sourceType = sourceType;
            this.__explicitlySet__.add("sourceType");
            return this;
        }
        /**
         * The date and time the backup request was received, expressed in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the backup request was received, expressed in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the backup was updated, expressed in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the backup was updated, expressed in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The current state of the backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the backup.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** Backup retention period in days. */
        @com.fasterxml.jackson.annotation.JsonProperty("retentionPeriod")
        private Integer retentionPeriod;

        /**
         * Backup retention period in days.
         *
         * @param retentionPeriod the value to set
         * @return this builder
         */
        public Builder retentionPeriod(Integer retentionPeriod) {
            this.retentionPeriod = retentionPeriod;
            this.__explicitlySet__.add("retentionPeriod");
            return this;
        }
        /** The size of the backup, in gigabytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("backupSize")
        private Integer backupSize;

        /**
         * The size of the backup, in gigabytes.
         *
         * @param backupSize the value to set
         * @return this builder
         */
        public Builder backupSize(Integer backupSize) {
            this.backupSize = backupSize;
            this.__explicitlySet__.add("backupSize");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * backup's source database system.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
        private String dbSystemId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * backup's source database system.
         *
         * @param dbSystemId the value to set
         * @return this builder
         */
        public Builder dbSystemId(String dbSystemId) {
            this.dbSystemId = dbSystemId;
            this.__explicitlySet__.add("dbSystemId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemDetails")
        private DbSystemDetails dbSystemDetails;

        public Builder dbSystemDetails(DbSystemDetails dbSystemDetails) {
            this.dbSystemDetails = dbSystemDetails;
            this.__explicitlySet__.add("dbSystemDetails");
            return this;
        }
        /** lastAcceptedRequestToken from MP. */
        @com.fasterxml.jackson.annotation.JsonProperty("lastAcceptedRequestToken")
        private String lastAcceptedRequestToken;

        /**
         * lastAcceptedRequestToken from MP.
         *
         * @param lastAcceptedRequestToken the value to set
         * @return this builder
         */
        public Builder lastAcceptedRequestToken(String lastAcceptedRequestToken) {
            this.lastAcceptedRequestToken = lastAcceptedRequestToken;
            this.__explicitlySet__.add("lastAcceptedRequestToken");
            return this;
        }
        /** lastCompletedRequestToken from MP. */
        @com.fasterxml.jackson.annotation.JsonProperty("lastCompletedRequestToken")
        private String lastCompletedRequestToken;

        /**
         * lastCompletedRequestToken from MP.
         *
         * @param lastCompletedRequestToken the value to set
         * @return this builder
         */
        public Builder lastCompletedRequestToken(String lastCompletedRequestToken) {
            this.lastCompletedRequestToken = lastCompletedRequestToken;
            this.__explicitlySet__.add("lastCompletedRequestToken");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Backup build() {
            Backup model =
                    new Backup(
                            this.id,
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.sourceType,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.retentionPeriod,
                            this.backupSize,
                            this.dbSystemId,
                            this.dbSystemDetails,
                            this.lastAcceptedRequestToken,
                            this.lastCompletedRequestToken,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Backup model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("sourceType")) {
                this.sourceType(model.getSourceType());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("retentionPeriod")) {
                this.retentionPeriod(model.getRetentionPeriod());
            }
            if (model.wasPropertyExplicitlySet("backupSize")) {
                this.backupSize(model.getBackupSize());
            }
            if (model.wasPropertyExplicitlySet("dbSystemId")) {
                this.dbSystemId(model.getDbSystemId());
            }
            if (model.wasPropertyExplicitlySet("dbSystemDetails")) {
                this.dbSystemDetails(model.getDbSystemDetails());
            }
            if (model.wasPropertyExplicitlySet("lastAcceptedRequestToken")) {
                this.lastAcceptedRequestToken(model.getLastAcceptedRequestToken());
            }
            if (model.wasPropertyExplicitlySet("lastCompletedRequestToken")) {
                this.lastCompletedRequestToken(model.getLastCompletedRequestToken());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * backup.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * backup.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** A user-friendly display name for the backup. Avoid entering confidential information. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly display name for the backup. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** A description for the backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A description for the backup.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains the backup.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains the backup.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Specifies whether the backup was created manually, or by a management policy. */
    public enum SourceType implements com.oracle.bmc.http.internal.BmcEnum {
        Scheduled("SCHEDULED"),
        Manual("MANUAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(SourceType.class);

        private final String value;
        private static java.util.Map<String, SourceType> map;

        static {
            map = new java.util.HashMap<>();
            for (SourceType v : SourceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SourceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SourceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SourceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Specifies whether the backup was created manually, or by a management policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceType")
    private final SourceType sourceType;

    /**
     * Specifies whether the backup was created manually, or by a management policy.
     *
     * @return the value
     */
    public SourceType getSourceType() {
        return sourceType;
    }

    /**
     * The date and time the backup request was received, expressed in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the backup request was received, expressed in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the backup was updated, expressed in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the backup was updated, expressed in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current state of the backup. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current state of the backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the backup.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** Backup retention period in days. */
    @com.fasterxml.jackson.annotation.JsonProperty("retentionPeriod")
    private final Integer retentionPeriod;

    /**
     * Backup retention period in days.
     *
     * @return the value
     */
    public Integer getRetentionPeriod() {
        return retentionPeriod;
    }

    /** The size of the backup, in gigabytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("backupSize")
    private final Integer backupSize;

    /**
     * The size of the backup, in gigabytes.
     *
     * @return the value
     */
    public Integer getBackupSize() {
        return backupSize;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * backup's source database system.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
    private final String dbSystemId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * backup's source database system.
     *
     * @return the value
     */
    public String getDbSystemId() {
        return dbSystemId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemDetails")
    private final DbSystemDetails dbSystemDetails;

    public DbSystemDetails getDbSystemDetails() {
        return dbSystemDetails;
    }

    /** lastAcceptedRequestToken from MP. */
    @com.fasterxml.jackson.annotation.JsonProperty("lastAcceptedRequestToken")
    private final String lastAcceptedRequestToken;

    /**
     * lastAcceptedRequestToken from MP.
     *
     * @return the value
     */
    public String getLastAcceptedRequestToken() {
        return lastAcceptedRequestToken;
    }

    /** lastCompletedRequestToken from MP. */
    @com.fasterxml.jackson.annotation.JsonProperty("lastCompletedRequestToken")
    private final String lastCompletedRequestToken;

    /**
     * lastCompletedRequestToken from MP.
     *
     * @return the value
     */
    public String getLastCompletedRequestToken() {
        return lastCompletedRequestToken;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("Backup(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", sourceType=").append(String.valueOf(this.sourceType));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", retentionPeriod=").append(String.valueOf(this.retentionPeriod));
        sb.append(", backupSize=").append(String.valueOf(this.backupSize));
        sb.append(", dbSystemId=").append(String.valueOf(this.dbSystemId));
        sb.append(", dbSystemDetails=").append(String.valueOf(this.dbSystemDetails));
        sb.append(", lastAcceptedRequestToken=")
                .append(String.valueOf(this.lastAcceptedRequestToken));
        sb.append(", lastCompletedRequestToken=")
                .append(String.valueOf(this.lastCompletedRequestToken));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Backup)) {
            return false;
        }

        Backup other = (Backup) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.sourceType, other.sourceType)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.retentionPeriod, other.retentionPeriod)
                && java.util.Objects.equals(this.backupSize, other.backupSize)
                && java.util.Objects.equals(this.dbSystemId, other.dbSystemId)
                && java.util.Objects.equals(this.dbSystemDetails, other.dbSystemDetails)
                && java.util.Objects.equals(
                        this.lastAcceptedRequestToken, other.lastAcceptedRequestToken)
                && java.util.Objects.equals(
                        this.lastCompletedRequestToken, other.lastCompletedRequestToken)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.sourceType == null ? 43 : this.sourceType.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.retentionPeriod == null ? 43 : this.retentionPeriod.hashCode());
        result = (result * PRIME) + (this.backupSize == null ? 43 : this.backupSize.hashCode());
        result = (result * PRIME) + (this.dbSystemId == null ? 43 : this.dbSystemId.hashCode());
        result =
                (result * PRIME)
                        + (this.dbSystemDetails == null ? 43 : this.dbSystemDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.lastAcceptedRequestToken == null
                                ? 43
                                : this.lastAcceptedRequestToken.hashCode());
        result =
                (result * PRIME)
                        + (this.lastCompletedRequestToken == null
                                ? 43
                                : this.lastCompletedRequestToken.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
