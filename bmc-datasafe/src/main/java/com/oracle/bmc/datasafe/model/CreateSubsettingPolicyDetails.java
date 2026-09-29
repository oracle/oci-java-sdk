/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details to create a new subsetting policy. Use either a sensitive data model or a target database
 * as the source of schemas for subsetting. To use a sensitive data model as the source of schemas,
 * set the schemaSource attribute to SENSITIVE_DATA_MODEL and provide the sensitiveDataModelId
 * attribute. The schemas from the SDM will be used for subsetting. To use a target database as the
 * source of schemas, set the schemaSource attribute to TARGET and provide the targetId attribute
 * along with the schemasForSubsetting list. The schema list can also be provided or updated later
 * using the UpdateSubsettingPolicy operation. After creating a subsetting policy, you can use
 * operations to add or modify subsetting rules as needed <br>
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
        builder = CreateSubsettingPolicyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateSubsettingPolicyDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "compartmentId",
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
    public CreateSubsettingPolicyDetails(
            String displayName,
            String compartmentId,
            String description,
            Boolean isRedoLoggingEnabled,
            Boolean isRefreshStatsEnabled,
            String parallelDegree,
            SubsettingPolicy.Recompile recompile,
            SubsettingPolicy.UnrelatedTablesAction unrelatedTablesAction,
            String preSubsettingScript,
            String postSubsettingScript,
            CreateSchemaSourceDetails schemaSource,
            String maskingPolicyId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.compartmentId = compartmentId;
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
        /**
         * The display name of the subsetting policy. The name does not have to be unique, and it's
         * changeable
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the subsetting policy. The name does not have to be unique, and it's
         * changeable
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The OCID of the compartment where the subsetting policy should be created */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment where the subsetting policy should be created
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
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
         * retrieve the original data after it has been subsetted
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isRedoLoggingEnabled")
        private Boolean isRedoLoggingEnabled;

        /**
         * Indicates if redo logging is enabled during a subsetting operation. It's disabled by
         * default. Set this attribute to true to enable redo logging. By default, subsetting
         * disables redo logging and flashback logging to purge any original data from logs.
         * However, in certain circumstances when you only want to test subsetting, rollback
         * changes, and retry subsetting, you could enable logging and use a flashback database to
         * retrieve the original data after it has been subsetted
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
         * subsetted database tables after subsetting completes
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isRefreshStatsEnabled")
        private Boolean isRefreshStatsEnabled;

        /**
         * Indicates if statistics gathering is enabled. It's enabled by default. Set this attribute
         * to false to disable statistics gathering. The subsetting process gathers statistics on
         * subsetted database tables after subsetting completes
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
        private SubsettingPolicy.Recompile recompile;

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
        public Builder recompile(SubsettingPolicy.Recompile recompile) {
            this.recompile = recompile;
            this.__explicitlySet__.add("recompile");
            return this;
        }
        /**
         * Strategy to be applied for tables which are not impacted by any of the subsetting rules
         */
        @com.fasterxml.jackson.annotation.JsonProperty("unrelatedTablesAction")
        private SubsettingPolicy.UnrelatedTablesAction unrelatedTablesAction;

        /**
         * Strategy to be applied for tables which are not impacted by any of the subsetting rules
         *
         * @param unrelatedTablesAction the value to set
         * @return this builder
         */
        public Builder unrelatedTablesAction(
                SubsettingPolicy.UnrelatedTablesAction unrelatedTablesAction) {
            this.unrelatedTablesAction = unrelatedTablesAction;
            this.__explicitlySet__.add("unrelatedTablesAction");
            return this;
        }
        /**
         * A pre-subsetting script, which can contain SQL and PL/SQL statements. It's executed
         * before the subsetting process. It's usually used to perform any preparation or
         * prerequisite work before subsetting data.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("preSubsettingScript")
        private String preSubsettingScript;

        /**
         * A pre-subsetting script, which can contain SQL and PL/SQL statements. It's executed
         * before the subsetting process. It's usually used to perform any preparation or
         * prerequisite work before subsetting data.
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
         * after the subsetting process. It's usually used to perform additional transformation or
         * cleanup work after subsetting data.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("postSubsettingScript")
        private String postSubsettingScript;

        /**
         * A post-subsetting script, which can contain SQL and PL/SQL statements. It's executed
         * after the subsetting process. It's usually used to perform additional transformation or
         * cleanup work after subsetting data.
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
        private CreateSchemaSourceDetails schemaSource;

        public Builder schemaSource(CreateSchemaSourceDetails schemaSource) {
            this.schemaSource = schemaSource;
            this.__explicitlySet__.add("schemaSource");
            return this;
        }
        /** The OCID of the masking policy to associate with this subsetting policy */
        @com.fasterxml.jackson.annotation.JsonProperty("maskingPolicyId")
        private String maskingPolicyId;

        /**
         * The OCID of the masking policy to associate with this subsetting policy
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

        public CreateSubsettingPolicyDetails build() {
            CreateSubsettingPolicyDetails model =
                    new CreateSubsettingPolicyDetails(
                            this.displayName,
                            this.compartmentId,
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
        public Builder copy(CreateSubsettingPolicyDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
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

    /**
     * The display name of the subsetting policy. The name does not have to be unique, and it's
     * changeable
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the subsetting policy. The name does not have to be unique, and it's
     * changeable
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The OCID of the compartment where the subsetting policy should be created */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment where the subsetting policy should be created
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
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
     * has been subsetted
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isRedoLoggingEnabled")
    private final Boolean isRedoLoggingEnabled;

    /**
     * Indicates if redo logging is enabled during a subsetting operation. It's disabled by default.
     * Set this attribute to true to enable redo logging. By default, subsetting disables redo
     * logging and flashback logging to purge any original data from logs. However, in certain
     * circumstances when you only want to test subsetting, rollback changes, and retry subsetting,
     * you could enable logging and use a flashback database to retrieve the original data after it
     * has been subsetted
     *
     * @return the value
     */
    public Boolean getIsRedoLoggingEnabled() {
        return isRedoLoggingEnabled;
    }

    /**
     * Indicates if statistics gathering is enabled. It's enabled by default. Set this attribute to
     * false to disable statistics gathering. The subsetting process gathers statistics on subsetted
     * database tables after subsetting completes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isRefreshStatsEnabled")
    private final Boolean isRefreshStatsEnabled;

    /**
     * Indicates if statistics gathering is enabled. It's enabled by default. Set this attribute to
     * false to disable statistics gathering. The subsetting process gathers statistics on subsetted
     * database tables after subsetting completes
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
    @com.fasterxml.jackson.annotation.JsonProperty("recompile")
    private final SubsettingPolicy.Recompile recompile;

    /**
     * Specifies how to recompile invalid objects post data subsetting. Allowed values are 'SERIAL'
     * (recompile in serial), 'PARALLEL' (recompile in parallel), 'NONE' (do not recompile). If it's
     * set to PARALLEL, the value of parallelDegree attribute is used. Use the built-in UTL_RECOMP
     * package to recompile any remaining invalid objects after subsetting completes
     *
     * @return the value
     */
    public SubsettingPolicy.Recompile getRecompile() {
        return recompile;
    }

    /** Strategy to be applied for tables which are not impacted by any of the subsetting rules */
    @com.fasterxml.jackson.annotation.JsonProperty("unrelatedTablesAction")
    private final SubsettingPolicy.UnrelatedTablesAction unrelatedTablesAction;

    /**
     * Strategy to be applied for tables which are not impacted by any of the subsetting rules
     *
     * @return the value
     */
    public SubsettingPolicy.UnrelatedTablesAction getUnrelatedTablesAction() {
        return unrelatedTablesAction;
    }

    /**
     * A pre-subsetting script, which can contain SQL and PL/SQL statements. It's executed before
     * the subsetting process. It's usually used to perform any preparation or prerequisite work
     * before subsetting data.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preSubsettingScript")
    private final String preSubsettingScript;

    /**
     * A pre-subsetting script, which can contain SQL and PL/SQL statements. It's executed before
     * the subsetting process. It's usually used to perform any preparation or prerequisite work
     * before subsetting data.
     *
     * @return the value
     */
    public String getPreSubsettingScript() {
        return preSubsettingScript;
    }

    /**
     * A post-subsetting script, which can contain SQL and PL/SQL statements. It's executed after
     * the subsetting process. It's usually used to perform additional transformation or cleanup
     * work after subsetting data.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("postSubsettingScript")
    private final String postSubsettingScript;

    /**
     * A post-subsetting script, which can contain SQL and PL/SQL statements. It's executed after
     * the subsetting process. It's usually used to perform additional transformation or cleanup
     * work after subsetting data.
     *
     * @return the value
     */
    public String getPostSubsettingScript() {
        return postSubsettingScript;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("schemaSource")
    private final CreateSchemaSourceDetails schemaSource;

    public CreateSchemaSourceDetails getSchemaSource() {
        return schemaSource;
    }

    /** The OCID of the masking policy to associate with this subsetting policy */
    @com.fasterxml.jackson.annotation.JsonProperty("maskingPolicyId")
    private final String maskingPolicyId;

    /**
     * The OCID of the masking policy to associate with this subsetting policy
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
        sb.append("CreateSubsettingPolicyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
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
        if (!(o instanceof CreateSubsettingPolicyDetails)) {
            return false;
        }

        CreateSubsettingPolicyDetails other = (CreateSubsettingPolicyDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
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
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
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
