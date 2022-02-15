/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * A masking policy defines the approach to mask data in a target database. It's basically
 * a collection of columns to be masked, called masking columns, and the associated masking
 * formats to be used to mask these columns. A masking policy can be used to mask multiple
 * databases provided that they have the same schema design. For more information, see
 * <a href="https://docs.oracle.com/en/cloud/paas/data-safe/udscs/masking-policies.html">Masking Policies </a>
 * in the Oracle Data Safe documentation.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MaskingPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class MaskingPolicy {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private MaskingLifecycleState lifecycleState;

        public Builder lifecycleState(MaskingLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isDropTempTablesEnabled")
        private Boolean isDropTempTablesEnabled;

        public Builder isDropTempTablesEnabled(Boolean isDropTempTablesEnabled) {
            this.isDropTempTablesEnabled = isDropTempTablesEnabled;
            this.__explicitlySet__.add("isDropTempTablesEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isRedoLoggingEnabled")
        private Boolean isRedoLoggingEnabled;

        public Builder isRedoLoggingEnabled(Boolean isRedoLoggingEnabled) {
            this.isRedoLoggingEnabled = isRedoLoggingEnabled;
            this.__explicitlySet__.add("isRedoLoggingEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isRefreshStatsEnabled")
        private Boolean isRefreshStatsEnabled;

        public Builder isRefreshStatsEnabled(Boolean isRefreshStatsEnabled) {
            this.isRefreshStatsEnabled = isRefreshStatsEnabled;
            this.__explicitlySet__.add("isRefreshStatsEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parallelDegree")
        private String parallelDegree;

        public Builder parallelDegree(String parallelDegree) {
            this.parallelDegree = parallelDegree;
            this.__explicitlySet__.add("parallelDegree");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("recompile")
        private Recompile recompile;

        public Builder recompile(Recompile recompile) {
            this.recompile = recompile;
            this.__explicitlySet__.add("recompile");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("preMaskingScript")
        private String preMaskingScript;

        public Builder preMaskingScript(String preMaskingScript) {
            this.preMaskingScript = preMaskingScript;
            this.__explicitlySet__.add("preMaskingScript");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("postMaskingScript")
        private String postMaskingScript;

        public Builder postMaskingScript(String postMaskingScript) {
            this.postMaskingScript = postMaskingScript;
            this.__explicitlySet__.add("postMaskingScript");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("columnSource")
        private ColumnSourceDetails columnSource;

        public Builder columnSource(ColumnSourceDetails columnSource) {
            this.columnSource = columnSource;
            this.__explicitlySet__.add("columnSource");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MaskingPolicy build() {
            MaskingPolicy __instance__ =
                    new MaskingPolicy(
                            id,
                            compartmentId,
                            displayName,
                            timeCreated,
                            lifecycleState,
                            timeUpdated,
                            description,
                            isDropTempTablesEnabled,
                            isRedoLoggingEnabled,
                            isRefreshStatsEnabled,
                            parallelDegree,
                            recompile,
                            preMaskingScript,
                            postMaskingScript,
                            columnSource,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MaskingPolicy o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .timeCreated(o.getTimeCreated())
                            .lifecycleState(o.getLifecycleState())
                            .timeUpdated(o.getTimeUpdated())
                            .description(o.getDescription())
                            .isDropTempTablesEnabled(o.getIsDropTempTablesEnabled())
                            .isRedoLoggingEnabled(o.getIsRedoLoggingEnabled())
                            .isRefreshStatsEnabled(o.getIsRefreshStatsEnabled())
                            .parallelDegree(o.getParallelDegree())
                            .recompile(o.getRecompile())
                            .preMaskingScript(o.getPreMaskingScript())
                            .postMaskingScript(o.getPostMaskingScript())
                            .columnSource(o.getColumnSource())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The OCID of the masking policy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The OCID of the compartment that contains the masking policy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The display name of the masking policy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The date and time the masking policy was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The current state of the masking policy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    MaskingLifecycleState lifecycleState;

    /**
     * The date and time the masking policy was last updated, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * The description of the masking policy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * Indicates if the temporary tables created during a masking operation should be dropped after masking. It's enabled by default.
     * Set this attribute to false to preserve the temporary tables. Masking creates temporary tables that map the original sensitive
     * data values to mask values. By default, these temporary tables are dropped after masking. But, in some cases, you may want
     * to preserve this information to track how masking changed your data. Note that doing so compromises security. These tables
     * must be dropped before the database is available for unprivileged users.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDropTempTablesEnabled")
    Boolean isDropTempTablesEnabled;

    /**
     * Indicates if redo logging is enabled during a masking operation. It's disabled by default. Set this attribute to true to
     * enable redo logging. By default, masking disables redo logging and flashback logging to purge any original unmasked
     * data from logs. However, in certain circumstances when you only want to test masking, rollback changes, and retry masking,
     * you could enable logging and use a flashback database to retrieve the original unmasked data after it has been masked.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRedoLoggingEnabled")
    Boolean isRedoLoggingEnabled;

    /**
     * Indicates if statistics gathering is enabled. It's enabled by default. Set this attribute to false to disable statistics
     * gathering. The masking process gathers statistics on masked database tables after masking completes.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRefreshStatsEnabled")
    Boolean isRefreshStatsEnabled;

    /**
     * Specifies options to enable parallel execution when running data masking. Allowed values are 'NONE' (no parallelism),
     * 'DEFAULT' (the Oracle Database computes the optimum degree of parallelism) or an integer value to be used as the degree
     * of parallelism. Parallel execution helps effectively use multiple CPUsi and improve masking performance. Refer to the
     * Oracle Database parallel execution framework when choosing an explicit degree of parallelism.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parallelDegree")
    String parallelDegree;
    /**
     * Specifies how to recompile invalid objects post data masking. Allowed values are 'SERIAL' (recompile in serial),
     * 'PARALLEL' (recompile in parallel), 'NONE' (do not recompile). If it's set to PARALLEL, the value of parallelDegree
     * attribute is used.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Recompile {
        Serial("SERIAL"),
        Parallel("PARALLEL"),
        None("NONE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * Specifies how to recompile invalid objects post data masking. Allowed values are 'SERIAL' (recompile in serial),
     * 'PARALLEL' (recompile in parallel), 'NONE' (do not recompile). If it's set to PARALLEL, the value of parallelDegree
     * attribute is used.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recompile")
    Recompile recompile;

    /**
     * A pre-masking script, which can contain SQL and PL/SQL statements. It's executed before
     * the core masking script generated using the masking policy. It's usually used to perform
     * any preparation or prerequisite work before masking data.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("preMaskingScript")
    String preMaskingScript;

    /**
     * A post-masking script, which can contain SQL and PL/SQL statements. It's executed after
     * the core masking script generated using the masking policy. It's usually used to perform
     * additional transformation or cleanup work after masking.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("postMaskingScript")
    String postMaskingScript;

    @com.fasterxml.jackson.annotation.JsonProperty("columnSource")
    ColumnSourceDetails columnSource;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
