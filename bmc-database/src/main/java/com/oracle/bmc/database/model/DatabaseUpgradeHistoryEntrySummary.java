/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The Database service supports the upgrade history of databases.
 *
 * <p>To use any of the API operations, you must be authorized in an IAM policy. If you are not
 * authorized, talk to an administrator. If you are an administrator who needs to write policies to
 * give users access, see [Getting Started with
 * Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 * <p>For information about access control and compartments, see [Overview of the Identity
 * Service](https://docs.cloud.oracle.com/Content/Identity/Concepts/overview.htm).
 *
 * <p>*Warning:** Oracle recommends that you avoid using any confidential information when you
 * supply string values using the API. <br>
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
        builder = DatabaseUpgradeHistoryEntrySummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class DatabaseUpgradeHistoryEntrySummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "action",
        "source",
        "lifecycleState",
        "lifecycleDetails",
        "targetDBVersion",
        "targetDatabaseSoftwareImageId",
        "targetDbHomeId",
        "sourceDbHomeId",
        "timeStarted",
        "timeEnded",
        "options"
    })
    public DatabaseUpgradeHistoryEntrySummary(
            String id,
            Action action,
            Source source,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            String targetDBVersion,
            String targetDatabaseSoftwareImageId,
            String targetDbHomeId,
            String sourceDbHomeId,
            java.util.Date timeStarted,
            java.util.Date timeEnded,
            String options) {
        super();
        this.id = id;
        this.action = action;
        this.source = source;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.targetDBVersion = targetDBVersion;
        this.targetDatabaseSoftwareImageId = targetDatabaseSoftwareImageId;
        this.targetDbHomeId = targetDbHomeId;
        this.sourceDbHomeId = sourceDbHomeId;
        this.timeStarted = timeStarted;
        this.timeEnded = timeEnded;
        this.options = options;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * database upgrade history.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * database upgrade history.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The database upgrade action. */
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        /**
         * The database upgrade action.
         *
         * @param action the value to set
         * @return this builder
         */
        public Builder action(Action action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }
        /**
         * The source of the Oracle Database software to be used for the upgrade. - Use {@code
         * DB_HOME} to specify an existing Database Home to upgrade the database. The database is
         * moved to the target Database Home and makes use of the Oracle Database software version
         * of the target Database Home. - Use {@code DB_VERSION} to specify a generally-available
         * Oracle Database software version to upgrade the database. - Use {@code DB_SOFTWARE_IMAGE}
         * to specify a [database software
         * image](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/databasesoftwareimage.htm)
         * to upgrade the database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private Source source;

        /**
         * The source of the Oracle Database software to be used for the upgrade. - Use {@code
         * DB_HOME} to specify an existing Database Home to upgrade the database. The database is
         * moved to the target Database Home and makes use of the Oracle Database software version
         * of the target Database Home. - Use {@code DB_VERSION} to specify a generally-available
         * Oracle Database software version to upgrade the database. - Use {@code DB_SOFTWARE_IMAGE}
         * to specify a [database software
         * image](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/databasesoftwareimage.htm)
         * to upgrade the database.
         *
         * @param source the value to set
         * @return this builder
         */
        public Builder source(Source source) {
            this.source = source;
            this.__explicitlySet__.add("source");
            return this;
        }
        /** Status of database upgrade history SUCCEEDED|IN_PROGRESS|FAILED. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * Status of database upgrade history SUCCEEDED|IN_PROGRESS|FAILED.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Additional information about the current lifecycle state. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Additional information about the current lifecycle state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * A valid Oracle Database version. To get a list of supported versions, use the {@link
         * #listDbVersions(ListDbVersionsRequest) listDbVersions} operation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetDBVersion")
        private String targetDBVersion;

        /**
         * A valid Oracle Database version. To get a list of supported versions, use the {@link
         * #listDbVersions(ListDbVersionsRequest) listDbVersions} operation.
         *
         * @param targetDBVersion the value to set
         * @return this builder
         */
        public Builder targetDBVersion(String targetDBVersion) {
            this.targetDBVersion = targetDBVersion;
            this.__explicitlySet__.add("targetDBVersion");
            return this;
        }
        /** the database software image used for upgrading database. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetDatabaseSoftwareImageId")
        private String targetDatabaseSoftwareImageId;

        /**
         * the database software image used for upgrading database.
         *
         * @param targetDatabaseSoftwareImageId the value to set
         * @return this builder
         */
        public Builder targetDatabaseSoftwareImageId(String targetDatabaseSoftwareImageId) {
            this.targetDatabaseSoftwareImageId = targetDatabaseSoftwareImageId;
            this.__explicitlySet__.add("targetDatabaseSoftwareImageId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Database Home.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetDbHomeId")
        private String targetDbHomeId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Database Home.
         *
         * @param targetDbHomeId the value to set
         * @return this builder
         */
        public Builder targetDbHomeId(String targetDbHomeId) {
            this.targetDbHomeId = targetDbHomeId;
            this.__explicitlySet__.add("targetDbHomeId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Database Home.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceDbHomeId")
        private String sourceDbHomeId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Database Home.
         *
         * @param sourceDbHomeId the value to set
         * @return this builder
         */
        public Builder sourceDbHomeId(String sourceDbHomeId) {
            this.sourceDbHomeId = sourceDbHomeId;
            this.__explicitlySet__.add("sourceDbHomeId");
            return this;
        }
        /** The date and time when the database upgrade started. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The date and time when the database upgrade started.
         *
         * @param timeStarted the value to set
         * @return this builder
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /** The date and time when the database upgrade ended. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
        private java.util.Date timeEnded;

        /**
         * The date and time when the database upgrade ended.
         *
         * @param timeEnded the value to set
         * @return this builder
         */
        public Builder timeEnded(java.util.Date timeEnded) {
            this.timeEnded = timeEnded;
            this.__explicitlySet__.add("timeEnded");
            return this;
        }
        /**
         * Additional upgrade options supported by DBUA(Database Upgrade Assistant). Example:
         * "-upgradeTimezone false -keepEvents"
         */
        @com.fasterxml.jackson.annotation.JsonProperty("options")
        private String options;

        /**
         * Additional upgrade options supported by DBUA(Database Upgrade Assistant). Example:
         * "-upgradeTimezone false -keepEvents"
         *
         * @param options the value to set
         * @return this builder
         */
        public Builder options(String options) {
            this.options = options;
            this.__explicitlySet__.add("options");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseUpgradeHistoryEntrySummary build() {
            DatabaseUpgradeHistoryEntrySummary model =
                    new DatabaseUpgradeHistoryEntrySummary(
                            this.id,
                            this.action,
                            this.source,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.targetDBVersion,
                            this.targetDatabaseSoftwareImageId,
                            this.targetDbHomeId,
                            this.sourceDbHomeId,
                            this.timeStarted,
                            this.timeEnded,
                            this.options);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseUpgradeHistoryEntrySummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
            }
            if (model.wasPropertyExplicitlySet("source")) {
                this.source(model.getSource());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("targetDBVersion")) {
                this.targetDBVersion(model.getTargetDBVersion());
            }
            if (model.wasPropertyExplicitlySet("targetDatabaseSoftwareImageId")) {
                this.targetDatabaseSoftwareImageId(model.getTargetDatabaseSoftwareImageId());
            }
            if (model.wasPropertyExplicitlySet("targetDbHomeId")) {
                this.targetDbHomeId(model.getTargetDbHomeId());
            }
            if (model.wasPropertyExplicitlySet("sourceDbHomeId")) {
                this.sourceDbHomeId(model.getSourceDbHomeId());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeEnded")) {
                this.timeEnded(model.getTimeEnded());
            }
            if (model.wasPropertyExplicitlySet("options")) {
                this.options(model.getOptions());
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
     * database upgrade history.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * database upgrade history.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The database upgrade action. */
    public enum Action implements com.oracle.bmc.http.internal.BmcEnum {
        Precheck("PRECHECK"),
        Upgrade("UPGRADE"),
        Rollback("ROLLBACK"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Action.class);

        private final String value;
        private static java.util.Map<String, Action> map;

        static {
            map = new java.util.HashMap<>();
            for (Action v : Action.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Action(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Action create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Action', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The database upgrade action. */
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final Action action;

    /**
     * The database upgrade action.
     *
     * @return the value
     */
    public Action getAction() {
        return action;
    }

    /**
     * The source of the Oracle Database software to be used for the upgrade. - Use {@code DB_HOME}
     * to specify an existing Database Home to upgrade the database. The database is moved to the
     * target Database Home and makes use of the Oracle Database software version of the target
     * Database Home. - Use {@code DB_VERSION} to specify a generally-available Oracle Database
     * software version to upgrade the database. - Use {@code DB_SOFTWARE_IMAGE} to specify a
     * [database software
     * image](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/databasesoftwareimage.htm)
     * to upgrade the database.
     */
    public enum Source implements com.oracle.bmc.http.internal.BmcEnum {
        DbHome("DB_HOME"),
        DbVersion("DB_VERSION"),
        DbSoftwareImage("DB_SOFTWARE_IMAGE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Source.class);

        private final String value;
        private static java.util.Map<String, Source> map;

        static {
            map = new java.util.HashMap<>();
            for (Source v : Source.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Source(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Source create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Source', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The source of the Oracle Database software to be used for the upgrade. - Use {@code DB_HOME}
     * to specify an existing Database Home to upgrade the database. The database is moved to the
     * target Database Home and makes use of the Oracle Database software version of the target
     * Database Home. - Use {@code DB_VERSION} to specify a generally-available Oracle Database
     * software version to upgrade the database. - Use {@code DB_SOFTWARE_IMAGE} to specify a
     * [database software
     * image](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/databasesoftwareimage.htm)
     * to upgrade the database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    private final Source source;

    /**
     * The source of the Oracle Database software to be used for the upgrade. - Use {@code DB_HOME}
     * to specify an existing Database Home to upgrade the database. The database is moved to the
     * target Database Home and makes use of the Oracle Database software version of the target
     * Database Home. - Use {@code DB_VERSION} to specify a generally-available Oracle Database
     * software version to upgrade the database. - Use {@code DB_SOFTWARE_IMAGE} to specify a
     * [database software
     * image](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/databasesoftwareimage.htm)
     * to upgrade the database.
     *
     * @return the value
     */
    public Source getSource() {
        return source;
    }

    /** Status of database upgrade history SUCCEEDED|IN_PROGRESS|FAILED. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Succeeded("SUCCEEDED"),
        Failed("FAILED"),
        InProgress("IN_PROGRESS"),

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
    /** Status of database upgrade history SUCCEEDED|IN_PROGRESS|FAILED. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * Status of database upgrade history SUCCEEDED|IN_PROGRESS|FAILED.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Additional information about the current lifecycle state. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Additional information about the current lifecycle state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * A valid Oracle Database version. To get a list of supported versions, use the {@link
     * #listDbVersions(ListDbVersionsRequest) listDbVersions} operation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetDBVersion")
    private final String targetDBVersion;

    /**
     * A valid Oracle Database version. To get a list of supported versions, use the {@link
     * #listDbVersions(ListDbVersionsRequest) listDbVersions} operation.
     *
     * @return the value
     */
    public String getTargetDBVersion() {
        return targetDBVersion;
    }

    /** the database software image used for upgrading database. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetDatabaseSoftwareImageId")
    private final String targetDatabaseSoftwareImageId;

    /**
     * the database software image used for upgrading database.
     *
     * @return the value
     */
    public String getTargetDatabaseSoftwareImageId() {
        return targetDatabaseSoftwareImageId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Database Home.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetDbHomeId")
    private final String targetDbHomeId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Database Home.
     *
     * @return the value
     */
    public String getTargetDbHomeId() {
        return targetDbHomeId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Database Home.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceDbHomeId")
    private final String sourceDbHomeId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Database Home.
     *
     * @return the value
     */
    public String getSourceDbHomeId() {
        return sourceDbHomeId;
    }

    /** The date and time when the database upgrade started. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The date and time when the database upgrade started.
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /** The date and time when the database upgrade ended. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    private final java.util.Date timeEnded;

    /**
     * The date and time when the database upgrade ended.
     *
     * @return the value
     */
    public java.util.Date getTimeEnded() {
        return timeEnded;
    }

    /**
     * Additional upgrade options supported by DBUA(Database Upgrade Assistant). Example:
     * "-upgradeTimezone false -keepEvents"
     */
    @com.fasterxml.jackson.annotation.JsonProperty("options")
    private final String options;

    /**
     * Additional upgrade options supported by DBUA(Database Upgrade Assistant). Example:
     * "-upgradeTimezone false -keepEvents"
     *
     * @return the value
     */
    public String getOptions() {
        return options;
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
        sb.append("DatabaseUpgradeHistoryEntrySummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", source=").append(String.valueOf(this.source));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", targetDBVersion=").append(String.valueOf(this.targetDBVersion));
        sb.append(", targetDatabaseSoftwareImageId=")
                .append(String.valueOf(this.targetDatabaseSoftwareImageId));
        sb.append(", targetDbHomeId=").append(String.valueOf(this.targetDbHomeId));
        sb.append(", sourceDbHomeId=").append(String.valueOf(this.sourceDbHomeId));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeEnded=").append(String.valueOf(this.timeEnded));
        sb.append(", options=").append(String.valueOf(this.options));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseUpgradeHistoryEntrySummary)) {
            return false;
        }

        DatabaseUpgradeHistoryEntrySummary other = (DatabaseUpgradeHistoryEntrySummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.source, other.source)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.targetDBVersion, other.targetDBVersion)
                && java.util.Objects.equals(
                        this.targetDatabaseSoftwareImageId, other.targetDatabaseSoftwareImageId)
                && java.util.Objects.equals(this.targetDbHomeId, other.targetDbHomeId)
                && java.util.Objects.equals(this.sourceDbHomeId, other.sourceDbHomeId)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeEnded, other.timeEnded)
                && java.util.Objects.equals(this.options, other.options)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + (this.source == null ? 43 : this.source.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.targetDBVersion == null ? 43 : this.targetDBVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.targetDatabaseSoftwareImageId == null
                                ? 43
                                : this.targetDatabaseSoftwareImageId.hashCode());
        result =
                (result * PRIME)
                        + (this.targetDbHomeId == null ? 43 : this.targetDbHomeId.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceDbHomeId == null ? 43 : this.sourceDbHomeId.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeEnded == null ? 43 : this.timeEnded.hashCode());
        result = (result * PRIME) + (this.options == null ? 43 : this.options.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
