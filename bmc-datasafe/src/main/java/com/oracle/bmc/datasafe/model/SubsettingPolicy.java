/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * A subsetting policy defines the approach to subset data in a target database. It's basically a
 * collection of rules applied on tables or schemas, to reduce rows in them. A subsetting policy can
 * be used to subset multiple databases provided that they have the same schema design. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SubsettingPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SubsettingPolicy
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "timeCreated",
        "lifecycleState",
        "timeUpdated",
        "description",
        "isRedoLoggingEnabled",
        "isRefreshStatsEnabled",
        "parallelDegree",
        "recompile",
        "unrelatedTablesAction",
        "preSubsettingScript",
        "postSubsettingScript",
        "schemaSource",
        "maskingPolicyId",
        "freeformTags",
        "definedTags"
    })
    public SubsettingPolicy(
            String id,
            String compartmentId,
            String displayName,
            java.util.Date timeCreated,
            LifecycleState lifecycleState,
            java.util.Date timeUpdated,
            String description,
            Boolean isRedoLoggingEnabled,
            Boolean isRefreshStatsEnabled,
            String parallelDegree,
            Recompile recompile,
            UnrelatedTablesAction unrelatedTablesAction,
            String preSubsettingScript,
            String postSubsettingScript,
            SchemaSourceDetails schemaSource,
            String maskingPolicyId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.timeCreated = timeCreated;
        this.lifecycleState = lifecycleState;
        this.timeUpdated = timeUpdated;
        this.description = description;
        this.isRedoLoggingEnabled = isRedoLoggingEnabled;
        this.isRefreshStatsEnabled = isRefreshStatsEnabled;
        this.parallelDegree = parallelDegree;
        this.recompile = recompile;
        this.unrelatedTablesAction = unrelatedTablesAction;
        this.preSubsettingScript = preSubsettingScript;
        this.postSubsettingScript = postSubsettingScript;
        this.schemaSource = schemaSource;
        this.maskingPolicyId = maskingPolicyId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the subsetting policy */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the subsetting policy
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID of the compartment that contains the subsetting policy */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the subsetting policy
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The display name of the subsetting policy */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the subsetting policy
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The date and time the subsetting policy was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the subsetting policy was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339)
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The current state of the subsetting policy */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the subsetting policy
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
         * The date and time the subsetting policy was last updated, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the subsetting policy was last updated, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339)
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The description of the subsetting policy */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the subsetting policy
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
         * Indicates if redo logging is enabled during a subsetting operation. It's disabled by
         * default. Set this attribute to true to enable redo logging. By default, subsetting
         * disables redo logging and flashback logging to purge any original data from logs.
         * However, in certain circumstances when you only want to test subsetting, rollback
         * changes, and retry subsetting, you could enable logging and use a flashback database to
         * retrieve the original data after it has been subsetted.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isRedoLoggingEnabled")
        private Boolean isRedoLoggingEnabled;

        /**
         * Indicates if redo logging is enabled during a subsetting operation. It's disabled by
         * default. Set this attribute to true to enable redo logging. By default, subsetting
         * disables redo logging and flashback logging to purge any original data from logs.
         * However, in certain circumstances when you only want to test subsetting, rollback
         * changes, and retry subsetting, you could enable logging and use a flashback database to
         * retrieve the original data after it has been subsetted.
         *
         * @param isRedoLoggingEnabled the value to set
         * @return this builder
         */
        public Builder isRedoLoggingEnabled(Boolean isRedoLoggingEnabled) {
            this.isRedoLoggingEnabled = isRedoLoggingEnabled;
            this.__explicitlySet__.add("isRedoLoggingEnabled");
            return this;
        }
        /**
         * Indicates if statistics gathering is enabled. It's enabled by default. Set this attribute
         * to false to disable statistics gathering. The subsetting process gathers statistics on
         * database tables after subsetting completes
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isRefreshStatsEnabled")
        private Boolean isRefreshStatsEnabled;

        /**
         * Indicates if statistics gathering is enabled. It's enabled by default. Set this attribute
         * to false to disable statistics gathering. The subsetting process gathers statistics on
         * database tables after subsetting completes
         *
         * @param isRefreshStatsEnabled the value to set
         * @return this builder
         */
        public Builder isRefreshStatsEnabled(Boolean isRefreshStatsEnabled) {
            this.isRefreshStatsEnabled = isRefreshStatsEnabled;
            this.__explicitlySet__.add("isRefreshStatsEnabled");
            return this;
        }
        /**
         * Specifies options to enable parallel execution when running data subsetting. Allowed
         * values are 'NONE' (no parallelism), 'DEFAULT' (the Oracle Database computes the optimum
         * degree of parallelism) or an integer value to be used as the degree of parallelism.
         * Parallel execution helps effectively use multiple CPUs and improve subsetting
         * performance. Refer to the Oracle Database parallel execution framework when choosing an
         * explicit degree of parallelism
         */
        @com.fasterxml.jackson.annotation.JsonProperty("parallelDegree")
        private String parallelDegree;

        /**
         * Specifies options to enable parallel execution when running data subsetting. Allowed
         * values are 'NONE' (no parallelism), 'DEFAULT' (the Oracle Database computes the optimum
         * degree of parallelism) or an integer value to be used as the degree of parallelism.
         * Parallel execution helps effectively use multiple CPUs and improve subsetting
         * performance. Refer to the Oracle Database parallel execution framework when choosing an
         * explicit degree of parallelism
         *
         * @param parallelDegree the value to set
         * @return this builder
         */
        public Builder parallelDegree(String parallelDegree) {
            this.parallelDegree = parallelDegree;
            this.__explicitlySet__.add("parallelDegree");
            return this;
        }
        /**
         * Specifies how to recompile invalid objects post data subsetting. Allowed values are
         * 'SERIAL' (recompile in serial), 'PARALLEL' (recompile in parallel), 'NONE' (do not
         * recompile). If it's set to PARALLEL, the value of parallelDegree attribute is used. Use
         * the built-in UTL_RECOMP package to recompile any remaining invalid objects after
         * subsetting completes
         */
        @com.fasterxml.jackson.annotation.JsonProperty("recompile")
        private Recompile recompile;

        /**
         * Specifies how to recompile invalid objects post data subsetting. Allowed values are
         * 'SERIAL' (recompile in serial), 'PARALLEL' (recompile in parallel), 'NONE' (do not
         * recompile). If it's set to PARALLEL, the value of parallelDegree attribute is used. Use
         * the built-in UTL_RECOMP package to recompile any remaining invalid objects after
         * subsetting completes
         *
         * @param recompile the value to set
         * @return this builder
         */
        public Builder recompile(Recompile recompile) {
            this.recompile = recompile;
            this.__explicitlySet__.add("recompile");
            return this;
        }
        /**
         * Strategy to be applied for tables which are not impacted by any of the subsetting rules
         */
        @com.fasterxml.jackson.annotation.JsonProperty("unrelatedTablesAction")
        private UnrelatedTablesAction unrelatedTablesAction;

        /**
         * Strategy to be applied for tables which are not impacted by any of the subsetting rules
         *
         * @param unrelatedTablesAction the value to set
         * @return this builder
         */
        public Builder unrelatedTablesAction(UnrelatedTablesAction unrelatedTablesAction) {
            this.unrelatedTablesAction = unrelatedTablesAction;
            this.__explicitlySet__.add("unrelatedTablesAction");
            return this;
        }
        /**
         * A pre-subsetting script, which can contain SQL and PL/SQL statements. It's executed
         * before the core subsetting script generated using the subsetting policy. It's usually
         * used to perform any preparation or prerequisite work before subsetting data
         */
        @com.fasterxml.jackson.annotation.JsonProperty("preSubsettingScript")
        private String preSubsettingScript;

        /**
         * A pre-subsetting script, which can contain SQL and PL/SQL statements. It's executed
         * before the core subsetting script generated using the subsetting policy. It's usually
         * used to perform any preparation or prerequisite work before subsetting data
         *
         * @param preSubsettingScript the value to set
         * @return this builder
         */
        public Builder preSubsettingScript(String preSubsettingScript) {
            this.preSubsettingScript = preSubsettingScript;
            this.__explicitlySet__.add("preSubsettingScript");
            return this;
        }
        /**
         * A post-subsetting script, which can contain SQL and PL/SQL statements. It's executed
         * after the core subsetting script generated using the subsetting policy. It's usually used
         * to perform additional transformation or cleanup work after subsetting.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("postSubsettingScript")
        private String postSubsettingScript;

        /**
         * A post-subsetting script, which can contain SQL and PL/SQL statements. It's executed
         * after the core subsetting script generated using the subsetting policy. It's usually used
         * to perform additional transformation or cleanup work after subsetting.
         *
         * @param postSubsettingScript the value to set
         * @return this builder
         */
        public Builder postSubsettingScript(String postSubsettingScript) {
            this.postSubsettingScript = postSubsettingScript;
            this.__explicitlySet__.add("postSubsettingScript");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("schemaSource")
        private SchemaSourceDetails schemaSource;

        public Builder schemaSource(SchemaSourceDetails schemaSource) {
            this.schemaSource = schemaSource;
            this.__explicitlySet__.add("schemaSource");
            return this;
        }
        /** The OCID of the masking policy associated with this subsetting policy */
        @com.fasterxml.jackson.annotation.JsonProperty("maskingPolicyId")
        private String maskingPolicyId;

        /**
         * The OCID of the masking policy associated with this subsetting policy
         *
         * @param maskingPolicyId the value to set
         * @return this builder
         */
        public Builder maskingPolicyId(String maskingPolicyId) {
            this.maskingPolicyId = maskingPolicyId;
            this.__explicitlySet__.add("maskingPolicyId");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SubsettingPolicy build() {
            SubsettingPolicy model =
                    new SubsettingPolicy(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.timeCreated,
                            this.lifecycleState,
                            this.timeUpdated,
                            this.description,
                            this.isRedoLoggingEnabled,
                            this.isRefreshStatsEnabled,
                            this.parallelDegree,
                            this.recompile,
                            this.unrelatedTablesAction,
                            this.preSubsettingScript,
                            this.postSubsettingScript,
                            this.schemaSource,
                            this.maskingPolicyId,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SubsettingPolicy model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("isRedoLoggingEnabled")) {
                this.isRedoLoggingEnabled(model.getIsRedoLoggingEnabled());
            }
            if (model.wasPropertyExplicitlySet("isRefreshStatsEnabled")) {
                this.isRefreshStatsEnabled(model.getIsRefreshStatsEnabled());
            }
            if (model.wasPropertyExplicitlySet("parallelDegree")) {
                this.parallelDegree(model.getParallelDegree());
            }
            if (model.wasPropertyExplicitlySet("recompile")) {
                this.recompile(model.getRecompile());
            }
            if (model.wasPropertyExplicitlySet("unrelatedTablesAction")) {
                this.unrelatedTablesAction(model.getUnrelatedTablesAction());
            }
            if (model.wasPropertyExplicitlySet("preSubsettingScript")) {
                this.preSubsettingScript(model.getPreSubsettingScript());
            }
            if (model.wasPropertyExplicitlySet("postSubsettingScript")) {
                this.postSubsettingScript(model.getPostSubsettingScript());
            }
            if (model.wasPropertyExplicitlySet("schemaSource")) {
                this.schemaSource(model.getSchemaSource());
            }
            if (model.wasPropertyExplicitlySet("maskingPolicyId")) {
                this.maskingPolicyId(model.getMaskingPolicyId());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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

    /** The OCID of the subsetting policy */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the subsetting policy
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of the compartment that contains the subsetting policy */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the subsetting policy
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The display name of the subsetting policy */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the subsetting policy
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The date and time the subsetting policy was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the subsetting policy was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339)
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The current state of the subsetting policy */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Active("ACTIVE"),
        Updating("UPDATING"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        NeedsAttention("NEEDS_ATTENTION"),
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
    /** The current state of the subsetting policy */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the subsetting policy
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The date and time the subsetting policy was last updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the subsetting policy was last updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339)
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The description of the subsetting policy */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the subsetting policy
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * Indicates if redo logging is enabled during a subsetting operation. It's disabled by default.
     * Set this attribute to true to enable redo logging. By default, subsetting disables redo
     * logging and flashback logging to purge any original data from logs. However, in certain
     * circumstances when you only want to test subsetting, rollback changes, and retry subsetting,
     * you could enable logging and use a flashback database to retrieve the original data after it
     * has been subsetted.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isRedoLoggingEnabled")
    private final Boolean isRedoLoggingEnabled;

    /**
     * Indicates if redo logging is enabled during a subsetting operation. It's disabled by default.
     * Set this attribute to true to enable redo logging. By default, subsetting disables redo
     * logging and flashback logging to purge any original data from logs. However, in certain
     * circumstances when you only want to test subsetting, rollback changes, and retry subsetting,
     * you could enable logging and use a flashback database to retrieve the original data after it
     * has been subsetted.
     *
     * @return the value
     */
    public Boolean getIsRedoLoggingEnabled() {
        return isRedoLoggingEnabled;
    }

    /**
     * Indicates if statistics gathering is enabled. It's enabled by default. Set this attribute to
     * false to disable statistics gathering. The subsetting process gathers statistics on database
     * tables after subsetting completes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isRefreshStatsEnabled")
    private final Boolean isRefreshStatsEnabled;

    /**
     * Indicates if statistics gathering is enabled. It's enabled by default. Set this attribute to
     * false to disable statistics gathering. The subsetting process gathers statistics on database
     * tables after subsetting completes
     *
     * @return the value
     */
    public Boolean getIsRefreshStatsEnabled() {
        return isRefreshStatsEnabled;
    }

    /**
     * Specifies options to enable parallel execution when running data subsetting. Allowed values
     * are 'NONE' (no parallelism), 'DEFAULT' (the Oracle Database computes the optimum degree of
     * parallelism) or an integer value to be used as the degree of parallelism. Parallel execution
     * helps effectively use multiple CPUs and improve subsetting performance. Refer to the Oracle
     * Database parallel execution framework when choosing an explicit degree of parallelism
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parallelDegree")
    private final String parallelDegree;

    /**
     * Specifies options to enable parallel execution when running data subsetting. Allowed values
     * are 'NONE' (no parallelism), 'DEFAULT' (the Oracle Database computes the optimum degree of
     * parallelism) or an integer value to be used as the degree of parallelism. Parallel execution
     * helps effectively use multiple CPUs and improve subsetting performance. Refer to the Oracle
     * Database parallel execution framework when choosing an explicit degree of parallelism
     *
     * @return the value
     */
    public String getParallelDegree() {
        return parallelDegree;
    }

    /**
     * Specifies how to recompile invalid objects post data subsetting. Allowed values are 'SERIAL'
     * (recompile in serial), 'PARALLEL' (recompile in parallel), 'NONE' (do not recompile). If it's
     * set to PARALLEL, the value of parallelDegree attribute is used. Use the built-in UTL_RECOMP
     * package to recompile any remaining invalid objects after subsetting completes
     */
    public enum Recompile implements com.oracle.bmc.http.internal.BmcEnum {
        Serial("SERIAL"),
        Parallel("PARALLEL"),
        None("NONE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Recompile.class);

        private final String value;
        private static java.util.Map<String, Recompile> map;

        static {
            map = new java.util.HashMap<>();
            for (Recompile v : Recompile.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Recompile(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Recompile create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Recompile', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Specifies how to recompile invalid objects post data subsetting. Allowed values are 'SERIAL'
     * (recompile in serial), 'PARALLEL' (recompile in parallel), 'NONE' (do not recompile). If it's
     * set to PARALLEL, the value of parallelDegree attribute is used. Use the built-in UTL_RECOMP
     * package to recompile any remaining invalid objects after subsetting completes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("recompile")
    private final Recompile recompile;

    /**
     * Specifies how to recompile invalid objects post data subsetting. Allowed values are 'SERIAL'
     * (recompile in serial), 'PARALLEL' (recompile in parallel), 'NONE' (do not recompile). If it's
     * set to PARALLEL, the value of parallelDegree attribute is used. Use the built-in UTL_RECOMP
     * package to recompile any remaining invalid objects after subsetting completes
     *
     * @return the value
     */
    public Recompile getRecompile() {
        return recompile;
    }

    /** Strategy to be applied for tables which are not impacted by any of the subsetting rules */
    public enum UnrelatedTablesAction implements com.oracle.bmc.http.internal.BmcEnum {
        Truncate("TRUNCATE"),
        Keep("KEEP"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(UnrelatedTablesAction.class);

        private final String value;
        private static java.util.Map<String, UnrelatedTablesAction> map;

        static {
            map = new java.util.HashMap<>();
            for (UnrelatedTablesAction v : UnrelatedTablesAction.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        UnrelatedTablesAction(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UnrelatedTablesAction create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'UnrelatedTablesAction', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Strategy to be applied for tables which are not impacted by any of the subsetting rules */
    @com.fasterxml.jackson.annotation.JsonProperty("unrelatedTablesAction")
    private final UnrelatedTablesAction unrelatedTablesAction;

    /**
     * Strategy to be applied for tables which are not impacted by any of the subsetting rules
     *
     * @return the value
     */
    public UnrelatedTablesAction getUnrelatedTablesAction() {
        return unrelatedTablesAction;
    }

    /**
     * A pre-subsetting script, which can contain SQL and PL/SQL statements. It's executed before
     * the core subsetting script generated using the subsetting policy. It's usually used to
     * perform any preparation or prerequisite work before subsetting data
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preSubsettingScript")
    private final String preSubsettingScript;

    /**
     * A pre-subsetting script, which can contain SQL and PL/SQL statements. It's executed before
     * the core subsetting script generated using the subsetting policy. It's usually used to
     * perform any preparation or prerequisite work before subsetting data
     *
     * @return the value
     */
    public String getPreSubsettingScript() {
        return preSubsettingScript;
    }

    /**
     * A post-subsetting script, which can contain SQL and PL/SQL statements. It's executed after
     * the core subsetting script generated using the subsetting policy. It's usually used to
     * perform additional transformation or cleanup work after subsetting.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("postSubsettingScript")
    private final String postSubsettingScript;

    /**
     * A post-subsetting script, which can contain SQL and PL/SQL statements. It's executed after
     * the core subsetting script generated using the subsetting policy. It's usually used to
     * perform additional transformation or cleanup work after subsetting.
     *
     * @return the value
     */
    public String getPostSubsettingScript() {
        return postSubsettingScript;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("schemaSource")
    private final SchemaSourceDetails schemaSource;

    public SchemaSourceDetails getSchemaSource() {
        return schemaSource;
    }

    /** The OCID of the masking policy associated with this subsetting policy */
    @com.fasterxml.jackson.annotation.JsonProperty("maskingPolicyId")
    private final String maskingPolicyId;

    /**
     * The OCID of the masking policy associated with this subsetting policy
     *
     * @return the value
     */
    public String getMaskingPolicyId() {
        return maskingPolicyId;
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
        sb.append("SubsettingPolicy(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", isRedoLoggingEnabled=").append(String.valueOf(this.isRedoLoggingEnabled));
        sb.append(", isRefreshStatsEnabled=").append(String.valueOf(this.isRefreshStatsEnabled));
        sb.append(", parallelDegree=").append(String.valueOf(this.parallelDegree));
        sb.append(", recompile=").append(String.valueOf(this.recompile));
        sb.append(", unrelatedTablesAction=").append(String.valueOf(this.unrelatedTablesAction));
        sb.append(", preSubsettingScript=").append(String.valueOf(this.preSubsettingScript));
        sb.append(", postSubsettingScript=").append(String.valueOf(this.postSubsettingScript));
        sb.append(", schemaSource=").append(String.valueOf(this.schemaSource));
        sb.append(", maskingPolicyId=").append(String.valueOf(this.maskingPolicyId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubsettingPolicy)) {
            return false;
        }

        SubsettingPolicy other = (SubsettingPolicy) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.isRedoLoggingEnabled, other.isRedoLoggingEnabled)
                && java.util.Objects.equals(this.isRefreshStatsEnabled, other.isRefreshStatsEnabled)
                && java.util.Objects.equals(this.parallelDegree, other.parallelDegree)
                && java.util.Objects.equals(this.recompile, other.recompile)
                && java.util.Objects.equals(this.unrelatedTablesAction, other.unrelatedTablesAction)
                && java.util.Objects.equals(this.preSubsettingScript, other.preSubsettingScript)
                && java.util.Objects.equals(this.postSubsettingScript, other.postSubsettingScript)
                && java.util.Objects.equals(this.schemaSource, other.schemaSource)
                && java.util.Objects.equals(this.maskingPolicyId, other.maskingPolicyId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
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
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.isRedoLoggingEnabled == null
                                ? 43
                                : this.isRedoLoggingEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isRefreshStatsEnabled == null
                                ? 43
                                : this.isRefreshStatsEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.parallelDegree == null ? 43 : this.parallelDegree.hashCode());
        result = (result * PRIME) + (this.recompile == null ? 43 : this.recompile.hashCode());
        result =
                (result * PRIME)
                        + (this.unrelatedTablesAction == null
                                ? 43
                                : this.unrelatedTablesAction.hashCode());
        result =
                (result * PRIME)
                        + (this.preSubsettingScript == null
                                ? 43
                                : this.preSubsettingScript.hashCode());
        result =
                (result * PRIME)
                        + (this.postSubsettingScript == null
                                ? 43
                                : this.postSubsettingScript.hashCode());
        result = (result * PRIME) + (this.schemaSource == null ? 43 : this.schemaSource.hashCode());
        result =
                (result * PRIME)
                        + (this.maskingPolicyId == null ? 43 : this.maskingPolicyId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
