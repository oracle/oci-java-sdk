/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The SQL Firewall policy resource contains the firewall policy metadata for a single user. <br>
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
        builder = SqlFirewallPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SqlFirewallPolicy
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "description",
        "securityPolicyId",
        "dbUserName",
        "sqlLevel",
        "status",
        "enforcementScope",
        "violationAction",
        "violationAudit",
        "allowedClientIps",
        "allowedClientOsUsernames",
        "allowedClientPrograms",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public SqlFirewallPolicy(
            String id,
            String compartmentId,
            String displayName,
            String description,
            String securityPolicyId,
            String dbUserName,
            SqlLevel sqlLevel,
            Status status,
            EnforcementScope enforcementScope,
            ViolationAction violationAction,
            ViolationAudit violationAudit,
            java.util.List<String> allowedClientIps,
            java.util.List<String> allowedClientOsUsernames,
            java.util.List<String> allowedClientPrograms,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            SqlFirewallPolicyLifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.securityPolicyId = securityPolicyId;
        this.dbUserName = dbUserName;
        this.sqlLevel = sqlLevel;
        this.status = status;
        this.enforcementScope = enforcementScope;
        this.violationAction = violationAction;
        this.violationAudit = violationAudit;
        this.allowedClientIps = allowedClientIps;
        this.allowedClientOsUsernames = allowedClientOsUsernames;
        this.allowedClientPrograms = allowedClientPrograms;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the SQL Firewall policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the SQL Firewall policy.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID of the compartment containing the SQL Firewall policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment containing the SQL Firewall policy.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The display name of the SQL Firewall policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the SQL Firewall policy.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The description of the SQL Firewall policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the SQL Firewall policy.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The OCID of the security policy corresponding to the SQL Firewall policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("securityPolicyId")
        private String securityPolicyId;

        /**
         * The OCID of the security policy corresponding to the SQL Firewall policy.
         *
         * @param securityPolicyId the value to set
         * @return this builder
         */
        public Builder securityPolicyId(String securityPolicyId) {
            this.securityPolicyId = securityPolicyId;
            this.__explicitlySet__.add("securityPolicyId");
            return this;
        }
        /** The database user name. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbUserName")
        private String dbUserName;

        /**
         * The database user name.
         *
         * @param dbUserName the value to set
         * @return this builder
         */
        public Builder dbUserName(String dbUserName) {
            this.dbUserName = dbUserName;
            this.__explicitlySet__.add("dbUserName");
            return this;
        }
        /**
         * Specifies the level of SQL included for this SQL Firewall policy. USER_ISSUED_SQL - User
         * issued SQL statements only. ALL_SQL - Includes all SQL statements including SQL statement
         * issued inside PL/SQL units.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sqlLevel")
        private SqlLevel sqlLevel;

        /**
         * Specifies the level of SQL included for this SQL Firewall policy. USER_ISSUED_SQL - User
         * issued SQL statements only. ALL_SQL - Includes all SQL statements including SQL statement
         * issued inside PL/SQL units.
         *
         * @param sqlLevel the value to set
         * @return this builder
         */
        public Builder sqlLevel(SqlLevel sqlLevel) {
            this.sqlLevel = sqlLevel;
            this.__explicitlySet__.add("sqlLevel");
            return this;
        }
        /** Specifies whether the SQL Firewall policy is enabled or disabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * Specifies whether the SQL Firewall policy is enabled or disabled.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** Specifies the SQL Firewall policy enforcement option. */
        @com.fasterxml.jackson.annotation.JsonProperty("enforcementScope")
        private EnforcementScope enforcementScope;

        /**
         * Specifies the SQL Firewall policy enforcement option.
         *
         * @param enforcementScope the value to set
         * @return this builder
         */
        public Builder enforcementScope(EnforcementScope enforcementScope) {
            this.enforcementScope = enforcementScope;
            this.__explicitlySet__.add("enforcementScope");
            return this;
        }
        /** Specifies the mode in which the SQL Firewall policy is enabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("violationAction")
        private ViolationAction violationAction;

        /**
         * Specifies the mode in which the SQL Firewall policy is enabled.
         *
         * @param violationAction the value to set
         * @return this builder
         */
        public Builder violationAction(ViolationAction violationAction) {
            this.violationAction = violationAction;
            this.__explicitlySet__.add("violationAction");
            return this;
        }
        /**
         * Specifies whether a unified audit policy should be enabled for auditing the SQL Firewall
         * policy violations.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("violationAudit")
        private ViolationAudit violationAudit;

        /**
         * Specifies whether a unified audit policy should be enabled for auditing the SQL Firewall
         * policy violations.
         *
         * @param violationAudit the value to set
         * @return this builder
         */
        public Builder violationAudit(ViolationAudit violationAudit) {
            this.violationAudit = violationAudit;
            this.__explicitlySet__.add("violationAudit");
            return this;
        }
        /** The list of allowed ip addresses for the SQL Firewall policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("allowedClientIps")
        private java.util.List<String> allowedClientIps;

        /**
         * The list of allowed ip addresses for the SQL Firewall policy.
         *
         * @param allowedClientIps the value to set
         * @return this builder
         */
        public Builder allowedClientIps(java.util.List<String> allowedClientIps) {
            this.allowedClientIps = allowedClientIps;
            this.__explicitlySet__.add("allowedClientIps");
            return this;
        }
        /** The list of allowed operating system user names for the SQL Firewall policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("allowedClientOsUsernames")
        private java.util.List<String> allowedClientOsUsernames;

        /**
         * The list of allowed operating system user names for the SQL Firewall policy.
         *
         * @param allowedClientOsUsernames the value to set
         * @return this builder
         */
        public Builder allowedClientOsUsernames(java.util.List<String> allowedClientOsUsernames) {
            this.allowedClientOsUsernames = allowedClientOsUsernames;
            this.__explicitlySet__.add("allowedClientOsUsernames");
            return this;
        }
        /** The list of allowed client programs for the SQL Firewall policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("allowedClientPrograms")
        private java.util.List<String> allowedClientPrograms;

        /**
         * The list of allowed client programs for the SQL Firewall policy.
         *
         * @param allowedClientPrograms the value to set
         * @return this builder
         */
        public Builder allowedClientPrograms(java.util.List<String> allowedClientPrograms) {
            this.allowedClientPrograms = allowedClientPrograms;
            this.__explicitlySet__.add("allowedClientPrograms");
            return this;
        }
        /** The time that the SQL Firewall policy was created, in the format defined by RFC3339. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time that the SQL Firewall policy was created, in the format defined by RFC3339.
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
         * The date and time the SQL Firewall policy was last updated, in the format defined by
         * RFC3339.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the SQL Firewall policy was last updated, in the format defined by
         * RFC3339.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The current state of the SQL Firewall policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private SqlFirewallPolicyLifecycleState lifecycleState;

        /**
         * The current state of the SQL Firewall policy.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(SqlFirewallPolicyLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Details about the current state of the SQL Firewall policy in Data Safe. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Details about the current state of the SQL Firewall policy in Data Safe.
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
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Department": "Finance"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm) Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm) Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
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
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see Resource Tags. Example: {@code {"orcl-cloud": {"free-tier-retained":
         * "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see Resource Tags. Example: {@code {"orcl-cloud": {"free-tier-retained":
         * "true"}}}
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

        public SqlFirewallPolicy build() {
            SqlFirewallPolicy model =
                    new SqlFirewallPolicy(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.securityPolicyId,
                            this.dbUserName,
                            this.sqlLevel,
                            this.status,
                            this.enforcementScope,
                            this.violationAction,
                            this.violationAudit,
                            this.allowedClientIps,
                            this.allowedClientOsUsernames,
                            this.allowedClientPrograms,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlFirewallPolicy model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("securityPolicyId")) {
                this.securityPolicyId(model.getSecurityPolicyId());
            }
            if (model.wasPropertyExplicitlySet("dbUserName")) {
                this.dbUserName(model.getDbUserName());
            }
            if (model.wasPropertyExplicitlySet("sqlLevel")) {
                this.sqlLevel(model.getSqlLevel());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("enforcementScope")) {
                this.enforcementScope(model.getEnforcementScope());
            }
            if (model.wasPropertyExplicitlySet("violationAction")) {
                this.violationAction(model.getViolationAction());
            }
            if (model.wasPropertyExplicitlySet("violationAudit")) {
                this.violationAudit(model.getViolationAudit());
            }
            if (model.wasPropertyExplicitlySet("allowedClientIps")) {
                this.allowedClientIps(model.getAllowedClientIps());
            }
            if (model.wasPropertyExplicitlySet("allowedClientOsUsernames")) {
                this.allowedClientOsUsernames(model.getAllowedClientOsUsernames());
            }
            if (model.wasPropertyExplicitlySet("allowedClientPrograms")) {
                this.allowedClientPrograms(model.getAllowedClientPrograms());
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

    /** The OCID of the SQL Firewall policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the SQL Firewall policy.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of the compartment containing the SQL Firewall policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment containing the SQL Firewall policy.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The display name of the SQL Firewall policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the SQL Firewall policy.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The description of the SQL Firewall policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the SQL Firewall policy.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The OCID of the security policy corresponding to the SQL Firewall policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("securityPolicyId")
    private final String securityPolicyId;

    /**
     * The OCID of the security policy corresponding to the SQL Firewall policy.
     *
     * @return the value
     */
    public String getSecurityPolicyId() {
        return securityPolicyId;
    }

    /** The database user name. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbUserName")
    private final String dbUserName;

    /**
     * The database user name.
     *
     * @return the value
     */
    public String getDbUserName() {
        return dbUserName;
    }

    /**
     * Specifies the level of SQL included for this SQL Firewall policy. USER_ISSUED_SQL - User
     * issued SQL statements only. ALL_SQL - Includes all SQL statements including SQL statement
     * issued inside PL/SQL units.
     */
    public enum SqlLevel implements com.oracle.bmc.http.internal.BmcEnum {
        UserIssuedSql("USER_ISSUED_SQL"),
        AllSql("ALL_SQL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(SqlLevel.class);

        private final String value;
        private static java.util.Map<String, SqlLevel> map;

        static {
            map = new java.util.HashMap<>();
            for (SqlLevel v : SqlLevel.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SqlLevel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SqlLevel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SqlLevel', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Specifies the level of SQL included for this SQL Firewall policy. USER_ISSUED_SQL - User
     * issued SQL statements only. ALL_SQL - Includes all SQL statements including SQL statement
     * issued inside PL/SQL units.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sqlLevel")
    private final SqlLevel sqlLevel;

    /**
     * Specifies the level of SQL included for this SQL Firewall policy. USER_ISSUED_SQL - User
     * issued SQL statements only. ALL_SQL - Includes all SQL statements including SQL statement
     * issued inside PL/SQL units.
     *
     * @return the value
     */
    public SqlLevel getSqlLevel() {
        return sqlLevel;
    }

    /** Specifies whether the SQL Firewall policy is enabled or disabled. */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Specifies whether the SQL Firewall policy is enabled or disabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * Specifies whether the SQL Firewall policy is enabled or disabled.
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /** Specifies the SQL Firewall policy enforcement option. */
    public enum EnforcementScope implements com.oracle.bmc.http.internal.BmcEnum {
        EnforceContext("ENFORCE_CONTEXT"),
        EnforceSql("ENFORCE_SQL"),
        EnforceAll("ENFORCE_ALL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(EnforcementScope.class);

        private final String value;
        private static java.util.Map<String, EnforcementScope> map;

        static {
            map = new java.util.HashMap<>();
            for (EnforcementScope v : EnforcementScope.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        EnforcementScope(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static EnforcementScope create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'EnforcementScope', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Specifies the SQL Firewall policy enforcement option. */
    @com.fasterxml.jackson.annotation.JsonProperty("enforcementScope")
    private final EnforcementScope enforcementScope;

    /**
     * Specifies the SQL Firewall policy enforcement option.
     *
     * @return the value
     */
    public EnforcementScope getEnforcementScope() {
        return enforcementScope;
    }

    /** Specifies the mode in which the SQL Firewall policy is enabled. */
    public enum ViolationAction implements com.oracle.bmc.http.internal.BmcEnum {
        Block("BLOCK"),
        Observe("OBSERVE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ViolationAction.class);

        private final String value;
        private static java.util.Map<String, ViolationAction> map;

        static {
            map = new java.util.HashMap<>();
            for (ViolationAction v : ViolationAction.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ViolationAction(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ViolationAction create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ViolationAction', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Specifies the mode in which the SQL Firewall policy is enabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("violationAction")
    private final ViolationAction violationAction;

    /**
     * Specifies the mode in which the SQL Firewall policy is enabled.
     *
     * @return the value
     */
    public ViolationAction getViolationAction() {
        return violationAction;
    }

    /**
     * Specifies whether a unified audit policy should be enabled for auditing the SQL Firewall
     * policy violations.
     */
    public enum ViolationAudit implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ViolationAudit.class);

        private final String value;
        private static java.util.Map<String, ViolationAudit> map;

        static {
            map = new java.util.HashMap<>();
            for (ViolationAudit v : ViolationAudit.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ViolationAudit(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ViolationAudit create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ViolationAudit', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Specifies whether a unified audit policy should be enabled for auditing the SQL Firewall
     * policy violations.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("violationAudit")
    private final ViolationAudit violationAudit;

    /**
     * Specifies whether a unified audit policy should be enabled for auditing the SQL Firewall
     * policy violations.
     *
     * @return the value
     */
    public ViolationAudit getViolationAudit() {
        return violationAudit;
    }

    /** The list of allowed ip addresses for the SQL Firewall policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("allowedClientIps")
    private final java.util.List<String> allowedClientIps;

    /**
     * The list of allowed ip addresses for the SQL Firewall policy.
     *
     * @return the value
     */
    public java.util.List<String> getAllowedClientIps() {
        return allowedClientIps;
    }

    /** The list of allowed operating system user names for the SQL Firewall policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("allowedClientOsUsernames")
    private final java.util.List<String> allowedClientOsUsernames;

    /**
     * The list of allowed operating system user names for the SQL Firewall policy.
     *
     * @return the value
     */
    public java.util.List<String> getAllowedClientOsUsernames() {
        return allowedClientOsUsernames;
    }

    /** The list of allowed client programs for the SQL Firewall policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("allowedClientPrograms")
    private final java.util.List<String> allowedClientPrograms;

    /**
     * The list of allowed client programs for the SQL Firewall policy.
     *
     * @return the value
     */
    public java.util.List<String> getAllowedClientPrograms() {
        return allowedClientPrograms;
    }

    /** The time that the SQL Firewall policy was created, in the format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time that the SQL Firewall policy was created, in the format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the SQL Firewall policy was last updated, in the format defined by RFC3339.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the SQL Firewall policy was last updated, in the format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current state of the SQL Firewall policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final SqlFirewallPolicyLifecycleState lifecycleState;

    /**
     * The current state of the SQL Firewall policy.
     *
     * @return the value
     */
    public SqlFirewallPolicyLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Details about the current state of the SQL Firewall policy in Data Safe. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Details about the current state of the SQL Firewall policy in Data Safe.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm) Example: {@code
     * {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm) Example: {@code
     * {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see Resource Tags. Example: {@code {"orcl-cloud": {"free-tier-retained":
     * "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see Resource Tags. Example: {@code {"orcl-cloud": {"free-tier-retained":
     * "true"}}}
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
        sb.append("SqlFirewallPolicy(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", securityPolicyId=").append(String.valueOf(this.securityPolicyId));
        sb.append(", dbUserName=").append(String.valueOf(this.dbUserName));
        sb.append(", sqlLevel=").append(String.valueOf(this.sqlLevel));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", enforcementScope=").append(String.valueOf(this.enforcementScope));
        sb.append(", violationAction=").append(String.valueOf(this.violationAction));
        sb.append(", violationAudit=").append(String.valueOf(this.violationAudit));
        sb.append(", allowedClientIps=").append(String.valueOf(this.allowedClientIps));
        sb.append(", allowedClientOsUsernames=")
                .append(String.valueOf(this.allowedClientOsUsernames));
        sb.append(", allowedClientPrograms=").append(String.valueOf(this.allowedClientPrograms));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
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
        if (!(o instanceof SqlFirewallPolicy)) {
            return false;
        }

        SqlFirewallPolicy other = (SqlFirewallPolicy) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.securityPolicyId, other.securityPolicyId)
                && java.util.Objects.equals(this.dbUserName, other.dbUserName)
                && java.util.Objects.equals(this.sqlLevel, other.sqlLevel)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.enforcementScope, other.enforcementScope)
                && java.util.Objects.equals(this.violationAction, other.violationAction)
                && java.util.Objects.equals(this.violationAudit, other.violationAudit)
                && java.util.Objects.equals(this.allowedClientIps, other.allowedClientIps)
                && java.util.Objects.equals(
                        this.allowedClientOsUsernames, other.allowedClientOsUsernames)
                && java.util.Objects.equals(this.allowedClientPrograms, other.allowedClientPrograms)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
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
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.securityPolicyId == null ? 43 : this.securityPolicyId.hashCode());
        result = (result * PRIME) + (this.dbUserName == null ? 43 : this.dbUserName.hashCode());
        result = (result * PRIME) + (this.sqlLevel == null ? 43 : this.sqlLevel.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.enforcementScope == null ? 43 : this.enforcementScope.hashCode());
        result =
                (result * PRIME)
                        + (this.violationAction == null ? 43 : this.violationAction.hashCode());
        result =
                (result * PRIME)
                        + (this.violationAudit == null ? 43 : this.violationAudit.hashCode());
        result =
                (result * PRIME)
                        + (this.allowedClientIps == null ? 43 : this.allowedClientIps.hashCode());
        result =
                (result * PRIME)
                        + (this.allowedClientOsUsernames == null
                                ? 43
                                : this.allowedClientOsUsernames.hashCode());
        result =
                (result * PRIME)
                        + (this.allowedClientPrograms == null
                                ? 43
                                : this.allowedClientPrograms.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
