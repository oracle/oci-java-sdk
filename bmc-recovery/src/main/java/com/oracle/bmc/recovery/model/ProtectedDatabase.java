/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.recovery.model;

/**
 * A protected database is an Oracle Cloud Database whose backups are managed by Oracle Database
 * Autonomous Recovery Service. Each protected database requires a recovery service subnet and a
 * protection policy to use Recovery Service as the backup destination for centralized backup and
 * recovery <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210216")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ProtectedDatabase.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ProtectedDatabase
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "dbUniqueName",
        "vpcUserName",
        "databaseSize",
        "protectionPolicyId",
        "recoveryServiceSubnets",
        "databaseId",
        "databaseSizeInGBs",
        "changeRate",
        "compressionRatio",
        "isRedoLogsShipped",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "health",
        "isReadOnlyResource",
        "lifecycleDetails",
        "healthDetails",
        "metrics",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public ProtectedDatabase(
            String id,
            String displayName,
            String compartmentId,
            String dbUniqueName,
            String vpcUserName,
            DatabaseSizes databaseSize,
            String protectionPolicyId,
            java.util.List<RecoveryServiceSubnetDetails> recoveryServiceSubnets,
            String databaseId,
            Integer databaseSizeInGBs,
            Double changeRate,
            Double compressionRatio,
            Boolean isRedoLogsShipped,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            Health health,
            Boolean isReadOnlyResource,
            String lifecycleDetails,
            String healthDetails,
            Metrics metrics,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.dbUniqueName = dbUniqueName;
        this.vpcUserName = vpcUserName;
        this.databaseSize = databaseSize;
        this.protectionPolicyId = protectionPolicyId;
        this.recoveryServiceSubnets = recoveryServiceSubnets;
        this.databaseId = databaseId;
        this.databaseSizeInGBs = databaseSizeInGBs;
        this.changeRate = changeRate;
        this.compressionRatio = compressionRatio;
        this.isRedoLogsShipped = isRedoLogsShipped;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.health = health;
        this.isReadOnlyResource = isReadOnlyResource;
        this.lifecycleDetails = lifecycleDetails;
        this.healthDetails = healthDetails;
        this.metrics = metrics;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the protected database. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the protected database.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The protected database name. You can change the displayName. Avoid entering confidential
         * information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The protected database name. You can change the displayName. Avoid entering confidential
         * information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The OCID of the compartment that contains the protected database. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the protected database.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The dbUniqueName for the protected database in Recovery Service. You cannot change the
         * unique name.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbUniqueName")
        private String dbUniqueName;

        /**
         * The dbUniqueName for the protected database in Recovery Service. You cannot change the
         * unique name.
         *
         * @param dbUniqueName the value to set
         * @return this builder
         */
        public Builder dbUniqueName(String dbUniqueName) {
            this.dbUniqueName = dbUniqueName;
            this.__explicitlySet__.add("dbUniqueName");
            return this;
        }
        /**
         * The virtual private catalog (VPC) user credentials that authenticates the protected
         * database to access Recovery Service.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vpcUserName")
        private String vpcUserName;

        /**
         * The virtual private catalog (VPC) user credentials that authenticates the protected
         * database to access Recovery Service.
         *
         * @param vpcUserName the value to set
         * @return this builder
         */
        public Builder vpcUserName(String vpcUserName) {
            this.vpcUserName = vpcUserName;
            this.__explicitlySet__.add("vpcUserName");
            return this;
        }
        /**
         * The size of the protected database. XS - Less than 5GB, S - 5GB to 50GB, M - 50GB to
         * 500GB, L - 500GB to 1TB, XL - 1TB to 5TB, XXL - Greater than 5TB.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseSize")
        private DatabaseSizes databaseSize;

        /**
         * The size of the protected database. XS - Less than 5GB, S - 5GB to 50GB, M - 50GB to
         * 500GB, L - 500GB to 1TB, XL - 1TB to 5TB, XXL - Greater than 5TB.
         *
         * @param databaseSize the value to set
         * @return this builder
         */
        public Builder databaseSize(DatabaseSizes databaseSize) {
            this.databaseSize = databaseSize;
            this.__explicitlySet__.add("databaseSize");
            return this;
        }
        /** The OCID of the protection policy associated with the protected database. */
        @com.fasterxml.jackson.annotation.JsonProperty("protectionPolicyId")
        private String protectionPolicyId;

        /**
         * The OCID of the protection policy associated with the protected database.
         *
         * @param protectionPolicyId the value to set
         * @return this builder
         */
        public Builder protectionPolicyId(String protectionPolicyId) {
            this.protectionPolicyId = protectionPolicyId;
            this.__explicitlySet__.add("protectionPolicyId");
            return this;
        }
        /** List of recovery service subnet resources associated with the protected database. */
        @com.fasterxml.jackson.annotation.JsonProperty("recoveryServiceSubnets")
        private java.util.List<RecoveryServiceSubnetDetails> recoveryServiceSubnets;

        /**
         * List of recovery service subnet resources associated with the protected database.
         *
         * @param recoveryServiceSubnets the value to set
         * @return this builder
         */
        public Builder recoveryServiceSubnets(
                java.util.List<RecoveryServiceSubnetDetails> recoveryServiceSubnets) {
            this.recoveryServiceSubnets = recoveryServiceSubnets;
            this.__explicitlySet__.add("recoveryServiceSubnets");
            return this;
        }
        /** The OCID of the protected database. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
        private String databaseId;

        /**
         * The OCID of the protected database.
         *
         * @param databaseId the value to set
         * @return this builder
         */
        public Builder databaseId(String databaseId) {
            this.databaseId = databaseId;
            this.__explicitlySet__.add("databaseId");
            return this;
        }
        /** The size of the database in GBs, in gigabytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseSizeInGBs")
        private Integer databaseSizeInGBs;

        /**
         * The size of the database in GBs, in gigabytes.
         *
         * @param databaseSizeInGBs the value to set
         * @return this builder
         */
        public Builder databaseSizeInGBs(Integer databaseSizeInGBs) {
            this.databaseSizeInGBs = databaseSizeInGBs;
            this.__explicitlySet__.add("databaseSizeInGBs");
            return this;
        }
        /**
         * The percentage of data changes that exist in the database between successive incremental
         * backups.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("changeRate")
        private Double changeRate;

        /**
         * The percentage of data changes that exist in the database between successive incremental
         * backups.
         *
         * @param changeRate the value to set
         * @return this builder
         */
        public Builder changeRate(Double changeRate) {
            this.changeRate = changeRate;
            this.__explicitlySet__.add("changeRate");
            return this;
        }
        /**
         * The compression ratio of the protected database. The compression ratio represents the
         * ratio of compressed block size to expanded block size.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compressionRatio")
        private Double compressionRatio;

        /**
         * The compression ratio of the protected database. The compression ratio represents the
         * ratio of compressed block size to expanded block size.
         *
         * @param compressionRatio the value to set
         * @return this builder
         */
        public Builder compressionRatio(Double compressionRatio) {
            this.compressionRatio = compressionRatio;
            this.__explicitlySet__.add("compressionRatio");
            return this;
        }
        /**
         * The value TRUE indicates that the protected database is configured to use Real-time data
         * protection, and redo-data is sent from the protected database to Recovery Service.
         * Real-time data protection substantially reduces the window of potential data loss that
         * exists between successive archived redo log backups. For this to be effective, additional
         * configuration is needed on client side.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isRedoLogsShipped")
        private Boolean isRedoLogsShipped;

        /**
         * The value TRUE indicates that the protected database is configured to use Real-time data
         * protection, and redo-data is sent from the protected database to Recovery Service.
         * Real-time data protection substantially reduces the window of potential data loss that
         * exists between successive archived redo log backups. For this to be effective, additional
         * configuration is needed on client side.
         *
         * @param isRedoLogsShipped the value to set
         * @return this builder
         */
        public Builder isRedoLogsShipped(Boolean isRedoLogsShipped) {
            this.isRedoLogsShipped = isRedoLogsShipped;
            this.__explicitlySet__.add("isRedoLogsShipped");
            return this;
        }
        /**
         * An RFC3339 formatted datetime string that indicates the created time for a protected
         * database. For example: '2020-05-22T21:10:29.600Z'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * An RFC3339 formatted datetime string that indicates the created time for a protected
         * database. For example: '2020-05-22T21:10:29.600Z'
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
         * An RFC3339 formatted datetime string that indicates the last updated time for a protected
         * database. For example: '2020-05-22T21:10:29.600Z'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * An RFC3339 formatted datetime string that indicates the last updated time for a protected
         * database. For example: '2020-05-22T21:10:29.600Z'
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The current state of the Protected Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the Protected Database.
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
         * Indicates the protection status of the database. Allowed values are: - HEALTHY - WARNING
         * - ALERT
         *
         * <p>A 'HEALTHY' status indicates that Recovery Service can ensure database recovery to any
         * point in time within the entire recovery window. The potential data loss exposure since
         * the last backup is: - Less than 10 seconds, if Real-time data protection is enabled -
         * Less than 70 minutes if Real-time data protection is disabled
         *
         * <p>A 'WARNING' status indicates that Recovery Service can ensure database recovery within
         * the current recovery window - 1 day. The potential data loss exposure since the last
         * backup is: - Greater than 10 seconds, if Real-time data protection is enabled - Greater
         * than 60 minutes, if if Real-time data protection is disabled
         *
         * <p>An 'ALERT' status indicates that Recovery Service cannot recover the database within
         * the current recovery window.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("health")
        private Health health;

        /**
         * Indicates the protection status of the database. Allowed values are: - HEALTHY - WARNING
         * - ALERT
         *
         * <p>A 'HEALTHY' status indicates that Recovery Service can ensure database recovery to any
         * point in time within the entire recovery window. The potential data loss exposure since
         * the last backup is: - Less than 10 seconds, if Real-time data protection is enabled -
         * Less than 70 minutes if Real-time data protection is disabled
         *
         * <p>A 'WARNING' status indicates that Recovery Service can ensure database recovery within
         * the current recovery window - 1 day. The potential data loss exposure since the last
         * backup is: - Greater than 10 seconds, if Real-time data protection is enabled - Greater
         * than 60 minutes, if if Real-time data protection is disabled
         *
         * <p>An 'ALERT' status indicates that Recovery Service cannot recover the database within
         * the current recovery window.
         *
         * @param health the value to set
         * @return this builder
         */
        public Builder health(Health health) {
            this.health = health;
            this.__explicitlySet__.add("health");
            return this;
        }
        /**
         * Indicates whether the protected database is created by Recovery Service or created
         * manually. Set to <b>TRUE</b> for a service-defined protected database. When you enable
         * the OCI-managed automatic backups option for a database and set Recovery Service as the
         * backup destination, then Recovery Service creates the associated protected database
         * resource. Set to <b>FALSE</b> for a user-defined protected database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isReadOnlyResource")
        private Boolean isReadOnlyResource;

        /**
         * Indicates whether the protected database is created by Recovery Service or created
         * manually. Set to <b>TRUE</b> for a service-defined protected database. When you enable
         * the OCI-managed automatic backups option for a database and set Recovery Service as the
         * backup destination, then Recovery Service creates the associated protected database
         * resource. Set to <b>FALSE</b> for a user-defined protected database.
         *
         * @param isReadOnlyResource the value to set
         * @return this builder
         */
        public Builder isReadOnlyResource(Boolean isReadOnlyResource) {
            this.isReadOnlyResource = isReadOnlyResource;
            this.__explicitlySet__.add("isReadOnlyResource");
            return this;
        }
        /**
         * Detailed description about the current lifecycle state of the protected database. For
         * example, it can be used to provide actionable information for a resource in a Failed
         * state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Detailed description about the current lifecycle state of the protected database. For
         * example, it can be used to provide actionable information for a resource in a Failed
         * state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** A message describing the current health of the protected database. */
        @com.fasterxml.jackson.annotation.JsonProperty("healthDetails")
        private String healthDetails;

        /**
         * A message describing the current health of the protected database.
         *
         * @param healthDetails the value to set
         * @return this builder
         */
        public Builder healthDetails(String healthDetails) {
            this.healthDetails = healthDetails;
            this.__explicitlySet__.add("healthDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metrics")
        private Metrics metrics;

        public Builder metrics(Metrics metrics) {
            this.metrics = metrics;
            this.__explicitlySet__.add("metrics");
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
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}. For more information, see
         * [Resource
         * Tags](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/resourcetags.htm)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}. For more information, see
         * [Resource
         * Tags](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/resourcetags.htm)
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
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}. For more information, see [Resource
         * Tags](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/resourcetags.htm)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}. For more information, see [Resource
         * Tags](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/resourcetags.htm)
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

        public ProtectedDatabase build() {
            ProtectedDatabase model =
                    new ProtectedDatabase(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.dbUniqueName,
                            this.vpcUserName,
                            this.databaseSize,
                            this.protectionPolicyId,
                            this.recoveryServiceSubnets,
                            this.databaseId,
                            this.databaseSizeInGBs,
                            this.changeRate,
                            this.compressionRatio,
                            this.isRedoLogsShipped,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.health,
                            this.isReadOnlyResource,
                            this.lifecycleDetails,
                            this.healthDetails,
                            this.metrics,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProtectedDatabase model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("dbUniqueName")) {
                this.dbUniqueName(model.getDbUniqueName());
            }
            if (model.wasPropertyExplicitlySet("vpcUserName")) {
                this.vpcUserName(model.getVpcUserName());
            }
            if (model.wasPropertyExplicitlySet("databaseSize")) {
                this.databaseSize(model.getDatabaseSize());
            }
            if (model.wasPropertyExplicitlySet("protectionPolicyId")) {
                this.protectionPolicyId(model.getProtectionPolicyId());
            }
            if (model.wasPropertyExplicitlySet("recoveryServiceSubnets")) {
                this.recoveryServiceSubnets(model.getRecoveryServiceSubnets());
            }
            if (model.wasPropertyExplicitlySet("databaseId")) {
                this.databaseId(model.getDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("databaseSizeInGBs")) {
                this.databaseSizeInGBs(model.getDatabaseSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("changeRate")) {
                this.changeRate(model.getChangeRate());
            }
            if (model.wasPropertyExplicitlySet("compressionRatio")) {
                this.compressionRatio(model.getCompressionRatio());
            }
            if (model.wasPropertyExplicitlySet("isRedoLogsShipped")) {
                this.isRedoLogsShipped(model.getIsRedoLogsShipped());
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
            if (model.wasPropertyExplicitlySet("health")) {
                this.health(model.getHealth());
            }
            if (model.wasPropertyExplicitlySet("isReadOnlyResource")) {
                this.isReadOnlyResource(model.getIsReadOnlyResource());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("healthDetails")) {
                this.healthDetails(model.getHealthDetails());
            }
            if (model.wasPropertyExplicitlySet("metrics")) {
                this.metrics(model.getMetrics());
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

    /** The OCID of the protected database. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the protected database.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The protected database name. You can change the displayName. Avoid entering confidential
     * information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The protected database name. You can change the displayName. Avoid entering confidential
     * information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The OCID of the compartment that contains the protected database. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the protected database.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The dbUniqueName for the protected database in Recovery Service. You cannot change the unique
     * name.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbUniqueName")
    private final String dbUniqueName;

    /**
     * The dbUniqueName for the protected database in Recovery Service. You cannot change the unique
     * name.
     *
     * @return the value
     */
    public String getDbUniqueName() {
        return dbUniqueName;
    }

    /**
     * The virtual private catalog (VPC) user credentials that authenticates the protected database
     * to access Recovery Service.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vpcUserName")
    private final String vpcUserName;

    /**
     * The virtual private catalog (VPC) user credentials that authenticates the protected database
     * to access Recovery Service.
     *
     * @return the value
     */
    public String getVpcUserName() {
        return vpcUserName;
    }

    /**
     * The size of the protected database. XS - Less than 5GB, S - 5GB to 50GB, M - 50GB to 500GB, L
     * - 500GB to 1TB, XL - 1TB to 5TB, XXL - Greater than 5TB.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseSize")
    private final DatabaseSizes databaseSize;

    /**
     * The size of the protected database. XS - Less than 5GB, S - 5GB to 50GB, M - 50GB to 500GB, L
     * - 500GB to 1TB, XL - 1TB to 5TB, XXL - Greater than 5TB.
     *
     * @return the value
     */
    public DatabaseSizes getDatabaseSize() {
        return databaseSize;
    }

    /** The OCID of the protection policy associated with the protected database. */
    @com.fasterxml.jackson.annotation.JsonProperty("protectionPolicyId")
    private final String protectionPolicyId;

    /**
     * The OCID of the protection policy associated with the protected database.
     *
     * @return the value
     */
    public String getProtectionPolicyId() {
        return protectionPolicyId;
    }

    /** List of recovery service subnet resources associated with the protected database. */
    @com.fasterxml.jackson.annotation.JsonProperty("recoveryServiceSubnets")
    private final java.util.List<RecoveryServiceSubnetDetails> recoveryServiceSubnets;

    /**
     * List of recovery service subnet resources associated with the protected database.
     *
     * @return the value
     */
    public java.util.List<RecoveryServiceSubnetDetails> getRecoveryServiceSubnets() {
        return recoveryServiceSubnets;
    }

    /** The OCID of the protected database. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
    private final String databaseId;

    /**
     * The OCID of the protected database.
     *
     * @return the value
     */
    public String getDatabaseId() {
        return databaseId;
    }

    /** The size of the database in GBs, in gigabytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseSizeInGBs")
    private final Integer databaseSizeInGBs;

    /**
     * The size of the database in GBs, in gigabytes.
     *
     * @return the value
     */
    public Integer getDatabaseSizeInGBs() {
        return databaseSizeInGBs;
    }

    /**
     * The percentage of data changes that exist in the database between successive incremental
     * backups.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("changeRate")
    private final Double changeRate;

    /**
     * The percentage of data changes that exist in the database between successive incremental
     * backups.
     *
     * @return the value
     */
    public Double getChangeRate() {
        return changeRate;
    }

    /**
     * The compression ratio of the protected database. The compression ratio represents the ratio
     * of compressed block size to expanded block size.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compressionRatio")
    private final Double compressionRatio;

    /**
     * The compression ratio of the protected database. The compression ratio represents the ratio
     * of compressed block size to expanded block size.
     *
     * @return the value
     */
    public Double getCompressionRatio() {
        return compressionRatio;
    }

    /**
     * The value TRUE indicates that the protected database is configured to use Real-time data
     * protection, and redo-data is sent from the protected database to Recovery Service. Real-time
     * data protection substantially reduces the window of potential data loss that exists between
     * successive archived redo log backups. For this to be effective, additional configuration is
     * needed on client side.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isRedoLogsShipped")
    private final Boolean isRedoLogsShipped;

    /**
     * The value TRUE indicates that the protected database is configured to use Real-time data
     * protection, and redo-data is sent from the protected database to Recovery Service. Real-time
     * data protection substantially reduces the window of potential data loss that exists between
     * successive archived redo log backups. For this to be effective, additional configuration is
     * needed on client side.
     *
     * @return the value
     */
    public Boolean getIsRedoLogsShipped() {
        return isRedoLogsShipped;
    }

    /**
     * An RFC3339 formatted datetime string that indicates the created time for a protected
     * database. For example: '2020-05-22T21:10:29.600Z'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * An RFC3339 formatted datetime string that indicates the created time for a protected
     * database. For example: '2020-05-22T21:10:29.600Z'
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * An RFC3339 formatted datetime string that indicates the last updated time for a protected
     * database. For example: '2020-05-22T21:10:29.600Z'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * An RFC3339 formatted datetime string that indicates the last updated time for a protected
     * database. For example: '2020-05-22T21:10:29.600Z'
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current state of the Protected Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the Protected Database.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Indicates the protection status of the database. Allowed values are: - HEALTHY - WARNING -
     * ALERT
     *
     * <p>A 'HEALTHY' status indicates that Recovery Service can ensure database recovery to any
     * point in time within the entire recovery window. The potential data loss exposure since the
     * last backup is: - Less than 10 seconds, if Real-time data protection is enabled - Less than
     * 70 minutes if Real-time data protection is disabled
     *
     * <p>A 'WARNING' status indicates that Recovery Service can ensure database recovery within the
     * current recovery window - 1 day. The potential data loss exposure since the last backup is: -
     * Greater than 10 seconds, if Real-time data protection is enabled - Greater than 60 minutes,
     * if if Real-time data protection is disabled
     *
     * <p>An 'ALERT' status indicates that Recovery Service cannot recover the database within the
     * current recovery window.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("health")
    private final Health health;

    /**
     * Indicates the protection status of the database. Allowed values are: - HEALTHY - WARNING -
     * ALERT
     *
     * <p>A 'HEALTHY' status indicates that Recovery Service can ensure database recovery to any
     * point in time within the entire recovery window. The potential data loss exposure since the
     * last backup is: - Less than 10 seconds, if Real-time data protection is enabled - Less than
     * 70 minutes if Real-time data protection is disabled
     *
     * <p>A 'WARNING' status indicates that Recovery Service can ensure database recovery within the
     * current recovery window - 1 day. The potential data loss exposure since the last backup is: -
     * Greater than 10 seconds, if Real-time data protection is enabled - Greater than 60 minutes,
     * if if Real-time data protection is disabled
     *
     * <p>An 'ALERT' status indicates that Recovery Service cannot recover the database within the
     * current recovery window.
     *
     * @return the value
     */
    public Health getHealth() {
        return health;
    }

    /**
     * Indicates whether the protected database is created by Recovery Service or created manually.
     * Set to <b>TRUE</b> for a service-defined protected database. When you enable the OCI-managed
     * automatic backups option for a database and set Recovery Service as the backup destination,
     * then Recovery Service creates the associated protected database resource. Set to <b>FALSE</b>
     * for a user-defined protected database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isReadOnlyResource")
    private final Boolean isReadOnlyResource;

    /**
     * Indicates whether the protected database is created by Recovery Service or created manually.
     * Set to <b>TRUE</b> for a service-defined protected database. When you enable the OCI-managed
     * automatic backups option for a database and set Recovery Service as the backup destination,
     * then Recovery Service creates the associated protected database resource. Set to <b>FALSE</b>
     * for a user-defined protected database.
     *
     * @return the value
     */
    public Boolean getIsReadOnlyResource() {
        return isReadOnlyResource;
    }

    /**
     * Detailed description about the current lifecycle state of the protected database. For
     * example, it can be used to provide actionable information for a resource in a Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Detailed description about the current lifecycle state of the protected database. For
     * example, it can be used to provide actionable information for a resource in a Failed state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** A message describing the current health of the protected database. */
    @com.fasterxml.jackson.annotation.JsonProperty("healthDetails")
    private final String healthDetails;

    /**
     * A message describing the current health of the protected database.
     *
     * @return the value
     */
    public String getHealthDetails() {
        return healthDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("metrics")
    private final Metrics metrics;

    public Metrics getMetrics() {
        return metrics;
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
     * {@code {"foo-namespace": {"bar-key": "value"}}}. For more information, see [Resource
     * Tags](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/resourcetags.htm)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}. For more information, see [Resource
     * Tags](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}. For more information, see [Resource
     * Tags](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/resourcetags.htm)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}. For more information, see [Resource
     * Tags](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/resourcetags.htm)
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
        sb.append("ProtectedDatabase(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", dbUniqueName=").append(String.valueOf(this.dbUniqueName));
        sb.append(", vpcUserName=").append(String.valueOf(this.vpcUserName));
        sb.append(", databaseSize=").append(String.valueOf(this.databaseSize));
        sb.append(", protectionPolicyId=").append(String.valueOf(this.protectionPolicyId));
        sb.append(", recoveryServiceSubnets=").append(String.valueOf(this.recoveryServiceSubnets));
        sb.append(", databaseId=").append(String.valueOf(this.databaseId));
        sb.append(", databaseSizeInGBs=").append(String.valueOf(this.databaseSizeInGBs));
        sb.append(", changeRate=").append(String.valueOf(this.changeRate));
        sb.append(", compressionRatio=").append(String.valueOf(this.compressionRatio));
        sb.append(", isRedoLogsShipped=").append(String.valueOf(this.isRedoLogsShipped));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", health=").append(String.valueOf(this.health));
        sb.append(", isReadOnlyResource=").append(String.valueOf(this.isReadOnlyResource));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", healthDetails=").append(String.valueOf(this.healthDetails));
        sb.append(", metrics=").append(String.valueOf(this.metrics));
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
        if (!(o instanceof ProtectedDatabase)) {
            return false;
        }

        ProtectedDatabase other = (ProtectedDatabase) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.dbUniqueName, other.dbUniqueName)
                && java.util.Objects.equals(this.vpcUserName, other.vpcUserName)
                && java.util.Objects.equals(this.databaseSize, other.databaseSize)
                && java.util.Objects.equals(this.protectionPolicyId, other.protectionPolicyId)
                && java.util.Objects.equals(
                        this.recoveryServiceSubnets, other.recoveryServiceSubnets)
                && java.util.Objects.equals(this.databaseId, other.databaseId)
                && java.util.Objects.equals(this.databaseSizeInGBs, other.databaseSizeInGBs)
                && java.util.Objects.equals(this.changeRate, other.changeRate)
                && java.util.Objects.equals(this.compressionRatio, other.compressionRatio)
                && java.util.Objects.equals(this.isRedoLogsShipped, other.isRedoLogsShipped)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.health, other.health)
                && java.util.Objects.equals(this.isReadOnlyResource, other.isReadOnlyResource)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.healthDetails, other.healthDetails)
                && java.util.Objects.equals(this.metrics, other.metrics)
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
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.dbUniqueName == null ? 43 : this.dbUniqueName.hashCode());
        result = (result * PRIME) + (this.vpcUserName == null ? 43 : this.vpcUserName.hashCode());
        result = (result * PRIME) + (this.databaseSize == null ? 43 : this.databaseSize.hashCode());
        result =
                (result * PRIME)
                        + (this.protectionPolicyId == null
                                ? 43
                                : this.protectionPolicyId.hashCode());
        result =
                (result * PRIME)
                        + (this.recoveryServiceSubnets == null
                                ? 43
                                : this.recoveryServiceSubnets.hashCode());
        result = (result * PRIME) + (this.databaseId == null ? 43 : this.databaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseSizeInGBs == null ? 43 : this.databaseSizeInGBs.hashCode());
        result = (result * PRIME) + (this.changeRate == null ? 43 : this.changeRate.hashCode());
        result =
                (result * PRIME)
                        + (this.compressionRatio == null ? 43 : this.compressionRatio.hashCode());
        result =
                (result * PRIME)
                        + (this.isRedoLogsShipped == null ? 43 : this.isRedoLogsShipped.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.health == null ? 43 : this.health.hashCode());
        result =
                (result * PRIME)
                        + (this.isReadOnlyResource == null
                                ? 43
                                : this.isReadOnlyResource.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.healthDetails == null ? 43 : this.healthDetails.hashCode());
        result = (result * PRIME) + (this.metrics == null ? 43 : this.metrics.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
