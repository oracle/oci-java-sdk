/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Summary of a masking report.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MaskingReportSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MaskingReportSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "maskingWorkRequestId",
        "maskingPolicyId",
        "targetId",
        "totalMaskedSensitiveTypes",
        "totalMaskedSchemas",
        "totalMaskedObjects",
        "totalMaskedColumns",
        "totalMaskedValues",
        "timeMaskingStarted",
        "timeMaskingFinished",
        "lifecycleState",
        "timeCreated",
        "isDropTempTablesEnabled",
        "isRedoLoggingEnabled",
        "isRefreshStatsEnabled",
        "parallelDegree",
        "recompile"
    })
    public MaskingReportSummary(
            String id,
            String compartmentId,
            String maskingWorkRequestId,
            String maskingPolicyId,
            String targetId,
            Long totalMaskedSensitiveTypes,
            Long totalMaskedSchemas,
            Long totalMaskedObjects,
            Long totalMaskedColumns,
            Long totalMaskedValues,
            java.util.Date timeMaskingStarted,
            java.util.Date timeMaskingFinished,
            MaskingLifecycleState lifecycleState,
            java.util.Date timeCreated,
            Boolean isDropTempTablesEnabled,
            Boolean isRedoLoggingEnabled,
            Boolean isRefreshStatsEnabled,
            String parallelDegree,
            String recompile) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.maskingWorkRequestId = maskingWorkRequestId;
        this.maskingPolicyId = maskingPolicyId;
        this.targetId = targetId;
        this.totalMaskedSensitiveTypes = totalMaskedSensitiveTypes;
        this.totalMaskedSchemas = totalMaskedSchemas;
        this.totalMaskedObjects = totalMaskedObjects;
        this.totalMaskedColumns = totalMaskedColumns;
        this.totalMaskedValues = totalMaskedValues;
        this.timeMaskingStarted = timeMaskingStarted;
        this.timeMaskingFinished = timeMaskingFinished;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.isDropTempTablesEnabled = isDropTempTablesEnabled;
        this.isRedoLoggingEnabled = isRedoLoggingEnabled;
        this.isRefreshStatsEnabled = isRefreshStatsEnabled;
        this.parallelDegree = parallelDegree;
        this.recompile = recompile;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the masking report.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the masking report.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The OCID of the compartment that contains the masking report.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the masking report.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The OCID of the masking work request that resulted in this masking report.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maskingWorkRequestId")
        private String maskingWorkRequestId;

        /**
         * The OCID of the masking work request that resulted in this masking report.
         * @param maskingWorkRequestId the value to set
         * @return this builder
         **/
        public Builder maskingWorkRequestId(String maskingWorkRequestId) {
            this.maskingWorkRequestId = maskingWorkRequestId;
            this.__explicitlySet__.add("maskingWorkRequestId");
            return this;
        }
        /**
         * The OCID of the masking policy used.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maskingPolicyId")
        private String maskingPolicyId;

        /**
         * The OCID of the masking policy used.
         * @param maskingPolicyId the value to set
         * @return this builder
         **/
        public Builder maskingPolicyId(String maskingPolicyId) {
            this.maskingPolicyId = maskingPolicyId;
            this.__explicitlySet__.add("maskingPolicyId");
            return this;
        }
        /**
         * The OCID of the target database masked.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * The OCID of the target database masked.
         * @param targetId the value to set
         * @return this builder
         **/
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /**
         * The total number of unique sensitive types associated with the masked columns.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalMaskedSensitiveTypes")
        private Long totalMaskedSensitiveTypes;

        /**
         * The total number of unique sensitive types associated with the masked columns.
         * @param totalMaskedSensitiveTypes the value to set
         * @return this builder
         **/
        public Builder totalMaskedSensitiveTypes(Long totalMaskedSensitiveTypes) {
            this.totalMaskedSensitiveTypes = totalMaskedSensitiveTypes;
            this.__explicitlySet__.add("totalMaskedSensitiveTypes");
            return this;
        }
        /**
         * The total number of unique schemas that contain the masked columns.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalMaskedSchemas")
        private Long totalMaskedSchemas;

        /**
         * The total number of unique schemas that contain the masked columns.
         * @param totalMaskedSchemas the value to set
         * @return this builder
         **/
        public Builder totalMaskedSchemas(Long totalMaskedSchemas) {
            this.totalMaskedSchemas = totalMaskedSchemas;
            this.__explicitlySet__.add("totalMaskedSchemas");
            return this;
        }
        /**
         * The total number of unique objects (tables and editioning views) that contain the masked columns.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalMaskedObjects")
        private Long totalMaskedObjects;

        /**
         * The total number of unique objects (tables and editioning views) that contain the masked columns.
         * @param totalMaskedObjects the value to set
         * @return this builder
         **/
        public Builder totalMaskedObjects(Long totalMaskedObjects) {
            this.totalMaskedObjects = totalMaskedObjects;
            this.__explicitlySet__.add("totalMaskedObjects");
            return this;
        }
        /**
         * The total number of masked columns.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalMaskedColumns")
        private Long totalMaskedColumns;

        /**
         * The total number of masked columns.
         * @param totalMaskedColumns the value to set
         * @return this builder
         **/
        public Builder totalMaskedColumns(Long totalMaskedColumns) {
            this.totalMaskedColumns = totalMaskedColumns;
            this.__explicitlySet__.add("totalMaskedColumns");
            return this;
        }
        /**
         * The total number of masked values.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalMaskedValues")
        private Long totalMaskedValues;

        /**
         * The total number of masked values.
         * @param totalMaskedValues the value to set
         * @return this builder
         **/
        public Builder totalMaskedValues(Long totalMaskedValues) {
            this.totalMaskedValues = totalMaskedValues;
            this.__explicitlySet__.add("totalMaskedValues");
            return this;
        }
        /**
         * The date and time data masking started, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeMaskingStarted")
        private java.util.Date timeMaskingStarted;

        /**
         * The date and time data masking started, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339)
         * @param timeMaskingStarted the value to set
         * @return this builder
         **/
        public Builder timeMaskingStarted(java.util.Date timeMaskingStarted) {
            this.timeMaskingStarted = timeMaskingStarted;
            this.__explicitlySet__.add("timeMaskingStarted");
            return this;
        }
        /**
         * The date and time data masking finished, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeMaskingFinished")
        private java.util.Date timeMaskingFinished;

        /**
         * The date and time data masking finished, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339)
         * @param timeMaskingFinished the value to set
         * @return this builder
         **/
        public Builder timeMaskingFinished(java.util.Date timeMaskingFinished) {
            this.timeMaskingFinished = timeMaskingFinished;
            this.__explicitlySet__.add("timeMaskingFinished");
            return this;
        }
        /**
         * The current state of the masking report.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private MaskingLifecycleState lifecycleState;

        /**
         * The current state of the masking report.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(MaskingLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The date and time the masking report was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the masking report was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * Indicates if the temporary tables created during the masking operation were dropped after masking.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDropTempTablesEnabled")
        private Boolean isDropTempTablesEnabled;

        /**
         * Indicates if the temporary tables created during the masking operation were dropped after masking.
         *
         * @param isDropTempTablesEnabled the value to set
         * @return this builder
         **/
        public Builder isDropTempTablesEnabled(Boolean isDropTempTablesEnabled) {
            this.isDropTempTablesEnabled = isDropTempTablesEnabled;
            this.__explicitlySet__.add("isDropTempTablesEnabled");
            return this;
        }
        /**
         * Indicates if redo logging was enabled during the masking operation.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isRedoLoggingEnabled")
        private Boolean isRedoLoggingEnabled;

        /**
         * Indicates if redo logging was enabled during the masking operation.
         *
         * @param isRedoLoggingEnabled the value to set
         * @return this builder
         **/
        public Builder isRedoLoggingEnabled(Boolean isRedoLoggingEnabled) {
            this.isRedoLoggingEnabled = isRedoLoggingEnabled;
            this.__explicitlySet__.add("isRedoLoggingEnabled");
            return this;
        }
        /**
         * Indicates if statistics gathering was enabled during the masking operation.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isRefreshStatsEnabled")
        private Boolean isRefreshStatsEnabled;

        /**
         * Indicates if statistics gathering was enabled during the masking operation.
         *
         * @param isRefreshStatsEnabled the value to set
         * @return this builder
         **/
        public Builder isRefreshStatsEnabled(Boolean isRefreshStatsEnabled) {
            this.isRefreshStatsEnabled = isRefreshStatsEnabled;
            this.__explicitlySet__.add("isRefreshStatsEnabled");
            return this;
        }
        /**
         * Indicates if parallel execution was enabled during the masking operation.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parallelDegree")
        private String parallelDegree;

        /**
         * Indicates if parallel execution was enabled during the masking operation.
         *
         * @param parallelDegree the value to set
         * @return this builder
         **/
        public Builder parallelDegree(String parallelDegree) {
            this.parallelDegree = parallelDegree;
            this.__explicitlySet__.add("parallelDegree");
            return this;
        }
        /**
         * Indicates how invalid objects were recompiled post the masking operation.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recompile")
        private String recompile;

        /**
         * Indicates how invalid objects were recompiled post the masking operation.
         *
         * @param recompile the value to set
         * @return this builder
         **/
        public Builder recompile(String recompile) {
            this.recompile = recompile;
            this.__explicitlySet__.add("recompile");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MaskingReportSummary build() {
            MaskingReportSummary model =
                    new MaskingReportSummary(
                            this.id,
                            this.compartmentId,
                            this.maskingWorkRequestId,
                            this.maskingPolicyId,
                            this.targetId,
                            this.totalMaskedSensitiveTypes,
                            this.totalMaskedSchemas,
                            this.totalMaskedObjects,
                            this.totalMaskedColumns,
                            this.totalMaskedValues,
                            this.timeMaskingStarted,
                            this.timeMaskingFinished,
                            this.lifecycleState,
                            this.timeCreated,
                            this.isDropTempTablesEnabled,
                            this.isRedoLoggingEnabled,
                            this.isRefreshStatsEnabled,
                            this.parallelDegree,
                            this.recompile);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MaskingReportSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("maskingWorkRequestId")) {
                this.maskingWorkRequestId(model.getMaskingWorkRequestId());
            }
            if (model.wasPropertyExplicitlySet("maskingPolicyId")) {
                this.maskingPolicyId(model.getMaskingPolicyId());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("totalMaskedSensitiveTypes")) {
                this.totalMaskedSensitiveTypes(model.getTotalMaskedSensitiveTypes());
            }
            if (model.wasPropertyExplicitlySet("totalMaskedSchemas")) {
                this.totalMaskedSchemas(model.getTotalMaskedSchemas());
            }
            if (model.wasPropertyExplicitlySet("totalMaskedObjects")) {
                this.totalMaskedObjects(model.getTotalMaskedObjects());
            }
            if (model.wasPropertyExplicitlySet("totalMaskedColumns")) {
                this.totalMaskedColumns(model.getTotalMaskedColumns());
            }
            if (model.wasPropertyExplicitlySet("totalMaskedValues")) {
                this.totalMaskedValues(model.getTotalMaskedValues());
            }
            if (model.wasPropertyExplicitlySet("timeMaskingStarted")) {
                this.timeMaskingStarted(model.getTimeMaskingStarted());
            }
            if (model.wasPropertyExplicitlySet("timeMaskingFinished")) {
                this.timeMaskingFinished(model.getTimeMaskingFinished());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
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
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The OCID of the masking report.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the masking report.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The OCID of the compartment that contains the masking report.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the masking report.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The OCID of the masking work request that resulted in this masking report.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maskingWorkRequestId")
    private final String maskingWorkRequestId;

    /**
     * The OCID of the masking work request that resulted in this masking report.
     * @return the value
     **/
    public String getMaskingWorkRequestId() {
        return maskingWorkRequestId;
    }

    /**
     * The OCID of the masking policy used.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maskingPolicyId")
    private final String maskingPolicyId;

    /**
     * The OCID of the masking policy used.
     * @return the value
     **/
    public String getMaskingPolicyId() {
        return maskingPolicyId;
    }

    /**
     * The OCID of the target database masked.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * The OCID of the target database masked.
     * @return the value
     **/
    public String getTargetId() {
        return targetId;
    }

    /**
     * The total number of unique sensitive types associated with the masked columns.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalMaskedSensitiveTypes")
    private final Long totalMaskedSensitiveTypes;

    /**
     * The total number of unique sensitive types associated with the masked columns.
     * @return the value
     **/
    public Long getTotalMaskedSensitiveTypes() {
        return totalMaskedSensitiveTypes;
    }

    /**
     * The total number of unique schemas that contain the masked columns.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalMaskedSchemas")
    private final Long totalMaskedSchemas;

    /**
     * The total number of unique schemas that contain the masked columns.
     * @return the value
     **/
    public Long getTotalMaskedSchemas() {
        return totalMaskedSchemas;
    }

    /**
     * The total number of unique objects (tables and editioning views) that contain the masked columns.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalMaskedObjects")
    private final Long totalMaskedObjects;

    /**
     * The total number of unique objects (tables and editioning views) that contain the masked columns.
     * @return the value
     **/
    public Long getTotalMaskedObjects() {
        return totalMaskedObjects;
    }

    /**
     * The total number of masked columns.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalMaskedColumns")
    private final Long totalMaskedColumns;

    /**
     * The total number of masked columns.
     * @return the value
     **/
    public Long getTotalMaskedColumns() {
        return totalMaskedColumns;
    }

    /**
     * The total number of masked values.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalMaskedValues")
    private final Long totalMaskedValues;

    /**
     * The total number of masked values.
     * @return the value
     **/
    public Long getTotalMaskedValues() {
        return totalMaskedValues;
    }

    /**
     * The date and time data masking started, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeMaskingStarted")
    private final java.util.Date timeMaskingStarted;

    /**
     * The date and time data masking started, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339)
     * @return the value
     **/
    public java.util.Date getTimeMaskingStarted() {
        return timeMaskingStarted;
    }

    /**
     * The date and time data masking finished, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeMaskingFinished")
    private final java.util.Date timeMaskingFinished;

    /**
     * The date and time data masking finished, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339)
     * @return the value
     **/
    public java.util.Date getTimeMaskingFinished() {
        return timeMaskingFinished;
    }

    /**
     * The current state of the masking report.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final MaskingLifecycleState lifecycleState;

    /**
     * The current state of the masking report.
     * @return the value
     **/
    public MaskingLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The date and time the masking report was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the masking report was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Indicates if the temporary tables created during the masking operation were dropped after masking.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDropTempTablesEnabled")
    private final Boolean isDropTempTablesEnabled;

    /**
     * Indicates if the temporary tables created during the masking operation were dropped after masking.
     *
     * @return the value
     **/
    public Boolean getIsDropTempTablesEnabled() {
        return isDropTempTablesEnabled;
    }

    /**
     * Indicates if redo logging was enabled during the masking operation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRedoLoggingEnabled")
    private final Boolean isRedoLoggingEnabled;

    /**
     * Indicates if redo logging was enabled during the masking operation.
     *
     * @return the value
     **/
    public Boolean getIsRedoLoggingEnabled() {
        return isRedoLoggingEnabled;
    }

    /**
     * Indicates if statistics gathering was enabled during the masking operation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRefreshStatsEnabled")
    private final Boolean isRefreshStatsEnabled;

    /**
     * Indicates if statistics gathering was enabled during the masking operation.
     *
     * @return the value
     **/
    public Boolean getIsRefreshStatsEnabled() {
        return isRefreshStatsEnabled;
    }

    /**
     * Indicates if parallel execution was enabled during the masking operation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parallelDegree")
    private final String parallelDegree;

    /**
     * Indicates if parallel execution was enabled during the masking operation.
     *
     * @return the value
     **/
    public String getParallelDegree() {
        return parallelDegree;
    }

    /**
     * Indicates how invalid objects were recompiled post the masking operation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recompile")
    private final String recompile;

    /**
     * Indicates how invalid objects were recompiled post the masking operation.
     *
     * @return the value
     **/
    public String getRecompile() {
        return recompile;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("MaskingReportSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", maskingWorkRequestId=").append(String.valueOf(this.maskingWorkRequestId));
        sb.append(", maskingPolicyId=").append(String.valueOf(this.maskingPolicyId));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", totalMaskedSensitiveTypes=")
                .append(String.valueOf(this.totalMaskedSensitiveTypes));
        sb.append(", totalMaskedSchemas=").append(String.valueOf(this.totalMaskedSchemas));
        sb.append(", totalMaskedObjects=").append(String.valueOf(this.totalMaskedObjects));
        sb.append(", totalMaskedColumns=").append(String.valueOf(this.totalMaskedColumns));
        sb.append(", totalMaskedValues=").append(String.valueOf(this.totalMaskedValues));
        sb.append(", timeMaskingStarted=").append(String.valueOf(this.timeMaskingStarted));
        sb.append(", timeMaskingFinished=").append(String.valueOf(this.timeMaskingFinished));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", isDropTempTablesEnabled=")
                .append(String.valueOf(this.isDropTempTablesEnabled));
        sb.append(", isRedoLoggingEnabled=").append(String.valueOf(this.isRedoLoggingEnabled));
        sb.append(", isRefreshStatsEnabled=").append(String.valueOf(this.isRefreshStatsEnabled));
        sb.append(", parallelDegree=").append(String.valueOf(this.parallelDegree));
        sb.append(", recompile=").append(String.valueOf(this.recompile));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MaskingReportSummary)) {
            return false;
        }

        MaskingReportSummary other = (MaskingReportSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.maskingWorkRequestId, other.maskingWorkRequestId)
                && java.util.Objects.equals(this.maskingPolicyId, other.maskingPolicyId)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(
                        this.totalMaskedSensitiveTypes, other.totalMaskedSensitiveTypes)
                && java.util.Objects.equals(this.totalMaskedSchemas, other.totalMaskedSchemas)
                && java.util.Objects.equals(this.totalMaskedObjects, other.totalMaskedObjects)
                && java.util.Objects.equals(this.totalMaskedColumns, other.totalMaskedColumns)
                && java.util.Objects.equals(this.totalMaskedValues, other.totalMaskedValues)
                && java.util.Objects.equals(this.timeMaskingStarted, other.timeMaskingStarted)
                && java.util.Objects.equals(this.timeMaskingFinished, other.timeMaskingFinished)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(
                        this.isDropTempTablesEnabled, other.isDropTempTablesEnabled)
                && java.util.Objects.equals(this.isRedoLoggingEnabled, other.isRedoLoggingEnabled)
                && java.util.Objects.equals(this.isRefreshStatsEnabled, other.isRefreshStatsEnabled)
                && java.util.Objects.equals(this.parallelDegree, other.parallelDegree)
                && java.util.Objects.equals(this.recompile, other.recompile)
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
        result =
                (result * PRIME)
                        + (this.maskingWorkRequestId == null
                                ? 43
                                : this.maskingWorkRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.maskingPolicyId == null ? 43 : this.maskingPolicyId.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result =
                (result * PRIME)
                        + (this.totalMaskedSensitiveTypes == null
                                ? 43
                                : this.totalMaskedSensitiveTypes.hashCode());
        result =
                (result * PRIME)
                        + (this.totalMaskedSchemas == null
                                ? 43
                                : this.totalMaskedSchemas.hashCode());
        result =
                (result * PRIME)
                        + (this.totalMaskedObjects == null
                                ? 43
                                : this.totalMaskedObjects.hashCode());
        result =
                (result * PRIME)
                        + (this.totalMaskedColumns == null
                                ? 43
                                : this.totalMaskedColumns.hashCode());
        result =
                (result * PRIME)
                        + (this.totalMaskedValues == null ? 43 : this.totalMaskedValues.hashCode());
        result =
                (result * PRIME)
                        + (this.timeMaskingStarted == null
                                ? 43
                                : this.timeMaskingStarted.hashCode());
        result =
                (result * PRIME)
                        + (this.timeMaskingFinished == null
                                ? 43
                                : this.timeMaskingFinished.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
