/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details to update a masking policy. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateMaskingPolicyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateMaskingPolicyDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "isDropTempTablesEnabled",
        "isRedoLoggingEnabled",
        "isRefreshStatsEnabled",
        "parallelDegree",
        "recompile",
        "preMaskingScript",
        "postMaskingScript",
        "columnSource",
        "freeformTags",
        "definedTags"
    })
    public UpdateMaskingPolicyDetails(
            String displayName,
            String description,
            Boolean isDropTempTablesEnabled,
            Boolean isRedoLoggingEnabled,
            Boolean isRefreshStatsEnabled,
            String parallelDegree,
            MaskingPolicy.Recompile recompile,
            String preMaskingScript,
            String postMaskingScript,
            UpdateColumnSourceDetails columnSource,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.isDropTempTablesEnabled = isDropTempTablesEnabled;
        this.isRedoLoggingEnabled = isRedoLoggingEnabled;
        this.isRefreshStatsEnabled = isRefreshStatsEnabled;
        this.parallelDegree = parallelDegree;
        this.recompile = recompile;
        this.preMaskingScript = preMaskingScript;
        this.postMaskingScript = postMaskingScript;
        this.columnSource = columnSource;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The display name of the masking policy. The name does not have to be unique, and it's
         * changeable.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the masking policy. The name does not have to be unique, and it's
         * changeable.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The description of the masking policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the masking policy.
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
         * Indicates if the temporary tables created during a masking operation should be dropped
         * after masking. It's enabled by default. Set this attribute to false to preserve the
         * temporary tables. Masking creates temporary tables that map the original sensitive data
         * values to mask values. By default, these temporary tables are dropped after masking. But,
         * in some cases, you may want to preserve this information to track how masking changed
         * your data. Note that doing so compromises security. These tables must be dropped before
         * the database is available for unprivileged users.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isDropTempTablesEnabled")
        private Boolean isDropTempTablesEnabled;

        /**
         * Indicates if the temporary tables created during a masking operation should be dropped
         * after masking. It's enabled by default. Set this attribute to false to preserve the
         * temporary tables. Masking creates temporary tables that map the original sensitive data
         * values to mask values. By default, these temporary tables are dropped after masking. But,
         * in some cases, you may want to preserve this information to track how masking changed
         * your data. Note that doing so compromises security. These tables must be dropped before
         * the database is available for unprivileged users.
         *
         * @param isDropTempTablesEnabled the value to set
         * @return this builder
         */
        public Builder isDropTempTablesEnabled(Boolean isDropTempTablesEnabled) {
            this.isDropTempTablesEnabled = isDropTempTablesEnabled;
            this.__explicitlySet__.add("isDropTempTablesEnabled");
            return this;
        }
        /**
         * Indicates if redo logging is enabled during a masking operation. It's disabled by
         * default. Set this attribute to true to enable redo logging. By default, masking disables
         * redo logging and flashback logging to purge any original unmasked data from logs.
         * However, in certain circumstances when you only want to test masking, rollback changes,
         * and retry masking, you could enable logging and use a flashback database to retrieve the
         * original unmasked data after it has been masked.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isRedoLoggingEnabled")
        private Boolean isRedoLoggingEnabled;

        /**
         * Indicates if redo logging is enabled during a masking operation. It's disabled by
         * default. Set this attribute to true to enable redo logging. By default, masking disables
         * redo logging and flashback logging to purge any original unmasked data from logs.
         * However, in certain circumstances when you only want to test masking, rollback changes,
         * and retry masking, you could enable logging and use a flashback database to retrieve the
         * original unmasked data after it has been masked.
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
         * to false to disable statistics gathering. The masking process gathers statistics on
         * masked database tables after masking completes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isRefreshStatsEnabled")
        private Boolean isRefreshStatsEnabled;

        /**
         * Indicates if statistics gathering is enabled. It's enabled by default. Set this attribute
         * to false to disable statistics gathering. The masking process gathers statistics on
         * masked database tables after masking completes.
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
         * Specifies options to enable parallel execution when running data masking. Allowed values
         * are 'NONE' (no parallelism), 'DEFAULT' (the Oracle Database computes the optimum degree
         * of parallelism) or an integer value to be used as the degree of parallelism. Parallel
         * execution helps effectively use multiple CPUsi and improve masking performance. Refer to
         * the Oracle Database parallel execution framework when choosing an explicit degree of
         * parallelism.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("parallelDegree")
        private String parallelDegree;

        /**
         * Specifies options to enable parallel execution when running data masking. Allowed values
         * are 'NONE' (no parallelism), 'DEFAULT' (the Oracle Database computes the optimum degree
         * of parallelism) or an integer value to be used as the degree of parallelism. Parallel
         * execution helps effectively use multiple CPUsi and improve masking performance. Refer to
         * the Oracle Database parallel execution framework when choosing an explicit degree of
         * parallelism.
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
         * Specifies how to recompile invalid objects post data masking. Allowed values are 'SERIAL'
         * (recompile in serial), 'PARALLEL' (recompile in parallel), 'NONE' (do not recompile). If
         * it's set to PARALLEL, the value of parallelDegree attribute is used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("recompile")
        private MaskingPolicy.Recompile recompile;

        /**
         * Specifies how to recompile invalid objects post data masking. Allowed values are 'SERIAL'
         * (recompile in serial), 'PARALLEL' (recompile in parallel), 'NONE' (do not recompile). If
         * it's set to PARALLEL, the value of parallelDegree attribute is used.
         *
         * @param recompile the value to set
         * @return this builder
         */
        public Builder recompile(MaskingPolicy.Recompile recompile) {
            this.recompile = recompile;
            this.__explicitlySet__.add("recompile");
            return this;
        }
        /**
         * A pre-masking script, which can contain SQL and PL/SQL statements. It's executed before
         * the core masking script generated using the masking policy. It's usually used to perform
         * any preparation or prerequisite work before masking data.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("preMaskingScript")
        private String preMaskingScript;

        /**
         * A pre-masking script, which can contain SQL and PL/SQL statements. It's executed before
         * the core masking script generated using the masking policy. It's usually used to perform
         * any preparation or prerequisite work before masking data.
         *
         * @param preMaskingScript the value to set
         * @return this builder
         */
        public Builder preMaskingScript(String preMaskingScript) {
            this.preMaskingScript = preMaskingScript;
            this.__explicitlySet__.add("preMaskingScript");
            return this;
        }
        /**
         * A post-masking script, which can contain SQL and PL/SQL statements. It's executed after
         * the core masking script generated using the masking policy. It's usually used to perform
         * additional transformation or cleanup work after masking.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("postMaskingScript")
        private String postMaskingScript;

        /**
         * A post-masking script, which can contain SQL and PL/SQL statements. It's executed after
         * the core masking script generated using the masking policy. It's usually used to perform
         * additional transformation or cleanup work after masking.
         *
         * @param postMaskingScript the value to set
         * @return this builder
         */
        public Builder postMaskingScript(String postMaskingScript) {
            this.postMaskingScript = postMaskingScript;
            this.__explicitlySet__.add("postMaskingScript");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("columnSource")
        private UpdateColumnSourceDetails columnSource;

        public Builder columnSource(UpdateColumnSourceDetails columnSource) {
            this.columnSource = columnSource;
            this.__explicitlySet__.add("columnSource");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
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
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
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

        public UpdateMaskingPolicyDetails build() {
            UpdateMaskingPolicyDetails model =
                    new UpdateMaskingPolicyDetails(
                            this.displayName,
                            this.description,
                            this.isDropTempTablesEnabled,
                            this.isRedoLoggingEnabled,
                            this.isRefreshStatsEnabled,
                            this.parallelDegree,
                            this.recompile,
                            this.preMaskingScript,
                            this.postMaskingScript,
                            this.columnSource,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateMaskingPolicyDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("isDropTempTablesEnabled")) {
                this.isDropTempTablesEnabled(model.getIsDropTempTablesEnabled());
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
            if (model.wasPropertyExplicitlySet("preMaskingScript")) {
                this.preMaskingScript(model.getPreMaskingScript());
            }
            if (model.wasPropertyExplicitlySet("postMaskingScript")) {
                this.postMaskingScript(model.getPostMaskingScript());
            }
            if (model.wasPropertyExplicitlySet("columnSource")) {
                this.columnSource(model.getColumnSource());
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
     * The display name of the masking policy. The name does not have to be unique, and it's
     * changeable.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the masking policy. The name does not have to be unique, and it's
     * changeable.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The description of the masking policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the masking policy.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * Indicates if the temporary tables created during a masking operation should be dropped after
     * masking. It's enabled by default. Set this attribute to false to preserve the temporary
     * tables. Masking creates temporary tables that map the original sensitive data values to mask
     * values. By default, these temporary tables are dropped after masking. But, in some cases, you
     * may want to preserve this information to track how masking changed your data. Note that doing
     * so compromises security. These tables must be dropped before the database is available for
     * unprivileged users.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isDropTempTablesEnabled")
    private final Boolean isDropTempTablesEnabled;

    /**
     * Indicates if the temporary tables created during a masking operation should be dropped after
     * masking. It's enabled by default. Set this attribute to false to preserve the temporary
     * tables. Masking creates temporary tables that map the original sensitive data values to mask
     * values. By default, these temporary tables are dropped after masking. But, in some cases, you
     * may want to preserve this information to track how masking changed your data. Note that doing
     * so compromises security. These tables must be dropped before the database is available for
     * unprivileged users.
     *
     * @return the value
     */
    public Boolean getIsDropTempTablesEnabled() {
        return isDropTempTablesEnabled;
    }

    /**
     * Indicates if redo logging is enabled during a masking operation. It's disabled by default.
     * Set this attribute to true to enable redo logging. By default, masking disables redo logging
     * and flashback logging to purge any original unmasked data from logs. However, in certain
     * circumstances when you only want to test masking, rollback changes, and retry masking, you
     * could enable logging and use a flashback database to retrieve the original unmasked data
     * after it has been masked.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isRedoLoggingEnabled")
    private final Boolean isRedoLoggingEnabled;

    /**
     * Indicates if redo logging is enabled during a masking operation. It's disabled by default.
     * Set this attribute to true to enable redo logging. By default, masking disables redo logging
     * and flashback logging to purge any original unmasked data from logs. However, in certain
     * circumstances when you only want to test masking, rollback changes, and retry masking, you
     * could enable logging and use a flashback database to retrieve the original unmasked data
     * after it has been masked.
     *
     * @return the value
     */
    public Boolean getIsRedoLoggingEnabled() {
        return isRedoLoggingEnabled;
    }

    /**
     * Indicates if statistics gathering is enabled. It's enabled by default. Set this attribute to
     * false to disable statistics gathering. The masking process gathers statistics on masked
     * database tables after masking completes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isRefreshStatsEnabled")
    private final Boolean isRefreshStatsEnabled;

    /**
     * Indicates if statistics gathering is enabled. It's enabled by default. Set this attribute to
     * false to disable statistics gathering. The masking process gathers statistics on masked
     * database tables after masking completes.
     *
     * @return the value
     */
    public Boolean getIsRefreshStatsEnabled() {
        return isRefreshStatsEnabled;
    }

    /**
     * Specifies options to enable parallel execution when running data masking. Allowed values are
     * 'NONE' (no parallelism), 'DEFAULT' (the Oracle Database computes the optimum degree of
     * parallelism) or an integer value to be used as the degree of parallelism. Parallel execution
     * helps effectively use multiple CPUsi and improve masking performance. Refer to the Oracle
     * Database parallel execution framework when choosing an explicit degree of parallelism.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parallelDegree")
    private final String parallelDegree;

    /**
     * Specifies options to enable parallel execution when running data masking. Allowed values are
     * 'NONE' (no parallelism), 'DEFAULT' (the Oracle Database computes the optimum degree of
     * parallelism) or an integer value to be used as the degree of parallelism. Parallel execution
     * helps effectively use multiple CPUsi and improve masking performance. Refer to the Oracle
     * Database parallel execution framework when choosing an explicit degree of parallelism.
     *
     * @return the value
     */
    public String getParallelDegree() {
        return parallelDegree;
    }

    /**
     * Specifies how to recompile invalid objects post data masking. Allowed values are 'SERIAL'
     * (recompile in serial), 'PARALLEL' (recompile in parallel), 'NONE' (do not recompile). If it's
     * set to PARALLEL, the value of parallelDegree attribute is used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("recompile")
    private final MaskingPolicy.Recompile recompile;

    /**
     * Specifies how to recompile invalid objects post data masking. Allowed values are 'SERIAL'
     * (recompile in serial), 'PARALLEL' (recompile in parallel), 'NONE' (do not recompile). If it's
     * set to PARALLEL, the value of parallelDegree attribute is used.
     *
     * @return the value
     */
    public MaskingPolicy.Recompile getRecompile() {
        return recompile;
    }

    /**
     * A pre-masking script, which can contain SQL and PL/SQL statements. It's executed before the
     * core masking script generated using the masking policy. It's usually used to perform any
     * preparation or prerequisite work before masking data.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preMaskingScript")
    private final String preMaskingScript;

    /**
     * A pre-masking script, which can contain SQL and PL/SQL statements. It's executed before the
     * core masking script generated using the masking policy. It's usually used to perform any
     * preparation or prerequisite work before masking data.
     *
     * @return the value
     */
    public String getPreMaskingScript() {
        return preMaskingScript;
    }

    /**
     * A post-masking script, which can contain SQL and PL/SQL statements. It's executed after the
     * core masking script generated using the masking policy. It's usually used to perform
     * additional transformation or cleanup work after masking.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("postMaskingScript")
    private final String postMaskingScript;

    /**
     * A post-masking script, which can contain SQL and PL/SQL statements. It's executed after the
     * core masking script generated using the masking policy. It's usually used to perform
     * additional transformation or cleanup work after masking.
     *
     * @return the value
     */
    public String getPostMaskingScript() {
        return postMaskingScript;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("columnSource")
    private final UpdateColumnSourceDetails columnSource;

    public UpdateColumnSourceDetails getColumnSource() {
        return columnSource;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
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
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
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
        sb.append("UpdateMaskingPolicyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", isDropTempTablesEnabled=")
                .append(String.valueOf(this.isDropTempTablesEnabled));
        sb.append(", isRedoLoggingEnabled=").append(String.valueOf(this.isRedoLoggingEnabled));
        sb.append(", isRefreshStatsEnabled=").append(String.valueOf(this.isRefreshStatsEnabled));
        sb.append(", parallelDegree=").append(String.valueOf(this.parallelDegree));
        sb.append(", recompile=").append(String.valueOf(this.recompile));
        sb.append(", preMaskingScript=").append(String.valueOf(this.preMaskingScript));
        sb.append(", postMaskingScript=").append(String.valueOf(this.postMaskingScript));
        sb.append(", columnSource=").append(String.valueOf(this.columnSource));
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
        if (!(o instanceof UpdateMaskingPolicyDetails)) {
            return false;
        }

        UpdateMaskingPolicyDetails other = (UpdateMaskingPolicyDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(
                        this.isDropTempTablesEnabled, other.isDropTempTablesEnabled)
                && java.util.Objects.equals(this.isRedoLoggingEnabled, other.isRedoLoggingEnabled)
                && java.util.Objects.equals(this.isRefreshStatsEnabled, other.isRefreshStatsEnabled)
                && java.util.Objects.equals(this.parallelDegree, other.parallelDegree)
                && java.util.Objects.equals(this.recompile, other.recompile)
                && java.util.Objects.equals(this.preMaskingScript, other.preMaskingScript)
                && java.util.Objects.equals(this.postMaskingScript, other.postMaskingScript)
                && java.util.Objects.equals(this.columnSource, other.columnSource)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.isDropTempTablesEnabled == null
                                ? 43
                                : this.isDropTempTablesEnabled.hashCode());
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
                        + (this.preMaskingScript == null ? 43 : this.preMaskingScript.hashCode());
        result =
                (result * PRIME)
                        + (this.postMaskingScript == null ? 43 : this.postMaskingScript.hashCode());
        result = (result * PRIME) + (this.columnSource == null ? 43 : this.columnSource.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
