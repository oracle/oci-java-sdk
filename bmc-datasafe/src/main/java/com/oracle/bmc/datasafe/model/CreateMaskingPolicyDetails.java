/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details to create a new masking policy. Use either a sensitive data model or a reference
 * target database to create your masking policy.
 * <p>
 * To use a sensitive data model as the source of masking columns, set the columnSource
 * attribute to SENSITIVE_DATA_MODEL and provide the sensitiveDataModelId attribute. After
 * creating a masking policy, you can use the AddMaskingColumnsFromSdm operation to automatically
 * add all the columns from the associated sensitive data model. In this case, the target
 * database associated with the sensitive data model is used for column and masking format validations.
 * <p>
 * You can also create a masking policy without using a sensitive data model. In this case,
 * you need to associate your masking policy with a target database by setting the columnSource
 * attribute to TARGET and providing the targetId attribute. The specified target database is
 * used for column and masking format validations.
 * <p>
 * After creating a masking policy, you can use the CreateMaskingColumn or PatchMaskingColumns
 * operation to manually add columns to the policy. You need to add the parent columns only,
 * and it automatically adds the child columns (in referential relationship with the parent
 * columns) from the associated sensitive data model or target database.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateMaskingPolicyDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateMaskingPolicyDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
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
        private MaskingPolicy.Recompile recompile;

        public Builder recompile(MaskingPolicy.Recompile recompile) {
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
        private CreateColumnSourceDetails columnSource;

        public Builder columnSource(CreateColumnSourceDetails columnSource) {
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

        public CreateMaskingPolicyDetails build() {
            CreateMaskingPolicyDetails __instance__ =
                    new CreateMaskingPolicyDetails(
                            displayName,
                            compartmentId,
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
        public Builder copy(CreateMaskingPolicyDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .compartmentId(o.getCompartmentId())
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
     * The display name of the masking policy. The name does not have to be unique, and it's changeable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The OCID of the compartment where the masking policy should be created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

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
    @com.fasterxml.jackson.annotation.JsonProperty("recompile")
    MaskingPolicy.Recompile recompile;

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
    CreateColumnSourceDetails columnSource;

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
