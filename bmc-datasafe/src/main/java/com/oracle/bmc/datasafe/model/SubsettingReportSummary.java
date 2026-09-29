/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Summary information for a report generated from a data subsetting operation <br>
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
        builder = SubsettingReportSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SubsettingReportSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "subsettingWorkRequestId",
        "subsettingPolicyId",
        "targetId",
        "maskingReportId",
        "maskingPolicyId",
        "maskingWorkRequestId",
        "totalSubsettedSchemas",
        "totalSubsettedObjects",
        "totalSubsettedRows",
        "databaseSizeBeforeSubsettingInKBs",
        "databaseSizeAfterSubsettingInKBs",
        "timeSubsettingStarted",
        "timeSubsettingFinished",
        "lifecycleState",
        "timeCreated",
        "isRedoLoggingEnabled",
        "isRefreshStatsEnabled",
        "parallelDegree",
        "recompile",
        "subsettingStatus",
        "totalPreSubsettingScriptErrors",
        "totalPostSubsettingScriptErrors"
    })
    public SubsettingReportSummary(
            String id,
            String compartmentId,
            String subsettingWorkRequestId,
            String subsettingPolicyId,
            String targetId,
            String maskingReportId,
            String maskingPolicyId,
            String maskingWorkRequestId,
            Long totalSubsettedSchemas,
            Long totalSubsettedObjects,
            Long totalSubsettedRows,
            String databaseSizeBeforeSubsettingInKBs,
            String databaseSizeAfterSubsettingInKBs,
            java.util.Date timeSubsettingStarted,
            java.util.Date timeSubsettingFinished,
            SubsettingReport.LifecycleState lifecycleState,
            java.util.Date timeCreated,
            Boolean isRedoLoggingEnabled,
            Boolean isRefreshStatsEnabled,
            String parallelDegree,
            String recompile,
            SubsettingStatus subsettingStatus,
            Long totalPreSubsettingScriptErrors,
            Long totalPostSubsettingScriptErrors) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.subsettingWorkRequestId = subsettingWorkRequestId;
        this.subsettingPolicyId = subsettingPolicyId;
        this.targetId = targetId;
        this.maskingReportId = maskingReportId;
        this.maskingPolicyId = maskingPolicyId;
        this.maskingWorkRequestId = maskingWorkRequestId;
        this.totalSubsettedSchemas = totalSubsettedSchemas;
        this.totalSubsettedObjects = totalSubsettedObjects;
        this.totalSubsettedRows = totalSubsettedRows;
        this.databaseSizeBeforeSubsettingInKBs = databaseSizeBeforeSubsettingInKBs;
        this.databaseSizeAfterSubsettingInKBs = databaseSizeAfterSubsettingInKBs;
        this.timeSubsettingStarted = timeSubsettingStarted;
        this.timeSubsettingFinished = timeSubsettingFinished;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.isRedoLoggingEnabled = isRedoLoggingEnabled;
        this.isRefreshStatsEnabled = isRefreshStatsEnabled;
        this.parallelDegree = parallelDegree;
        this.recompile = recompile;
        this.subsettingStatus = subsettingStatus;
        this.totalPreSubsettingScriptErrors = totalPreSubsettingScriptErrors;
        this.totalPostSubsettingScriptErrors = totalPostSubsettingScriptErrors;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the subsetting report */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the subsetting report
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID of the compartment that contains the subsetting report */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the subsetting report
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The OCID of the subsetting work request that resulted in this subsetting report */
        @com.fasterxml.jackson.annotation.JsonProperty("subsettingWorkRequestId")
        private String subsettingWorkRequestId;

        /**
         * The OCID of the subsetting work request that resulted in this subsetting report
         *
         * @param subsettingWorkRequestId the value to set
         * @return this builder
         */
        public Builder subsettingWorkRequestId(String subsettingWorkRequestId) {
            this.subsettingWorkRequestId = subsettingWorkRequestId;
            this.__explicitlySet__.add("subsettingWorkRequestId");
            return this;
        }
        /** The OCID of the subsetting policy used */
        @com.fasterxml.jackson.annotation.JsonProperty("subsettingPolicyId")
        private String subsettingPolicyId;

        /**
         * The OCID of the subsetting policy used
         *
         * @param subsettingPolicyId the value to set
         * @return this builder
         */
        public Builder subsettingPolicyId(String subsettingPolicyId) {
            this.subsettingPolicyId = subsettingPolicyId;
            this.__explicitlySet__.add("subsettingPolicyId");
            return this;
        }
        /** The OCID of the target database subsetted */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * The OCID of the target database subsetted
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /** The OCID of the masking report associated with this subsetting report */
        @com.fasterxml.jackson.annotation.JsonProperty("maskingReportId")
        private String maskingReportId;

        /**
         * The OCID of the masking report associated with this subsetting report
         *
         * @param maskingReportId the value to set
         * @return this builder
         */
        public Builder maskingReportId(String maskingReportId) {
            this.maskingReportId = maskingReportId;
            this.__explicitlySet__.add("maskingReportId");
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
        /** The OCID of the masking work request triggered after this subsetting job */
        @com.fasterxml.jackson.annotation.JsonProperty("maskingWorkRequestId")
        private String maskingWorkRequestId;

        /**
         * The OCID of the masking work request triggered after this subsetting job
         *
         * @param maskingWorkRequestId the value to set
         * @return this builder
         */
        public Builder maskingWorkRequestId(String maskingWorkRequestId) {
            this.maskingWorkRequestId = maskingWorkRequestId;
            this.__explicitlySet__.add("maskingWorkRequestId");
            return this;
        }
        /** The total number of subsetted schemas */
        @com.fasterxml.jackson.annotation.JsonProperty("totalSubsettedSchemas")
        private Long totalSubsettedSchemas;

        /**
         * The total number of subsetted schemas
         *
         * @param totalSubsettedSchemas the value to set
         * @return this builder
         */
        public Builder totalSubsettedSchemas(Long totalSubsettedSchemas) {
            this.totalSubsettedSchemas = totalSubsettedSchemas;
            this.__explicitlySet__.add("totalSubsettedSchemas");
            return this;
        }
        /** The total number of subsetted objects */
        @com.fasterxml.jackson.annotation.JsonProperty("totalSubsettedObjects")
        private Long totalSubsettedObjects;

        /**
         * The total number of subsetted objects
         *
         * @param totalSubsettedObjects the value to set
         * @return this builder
         */
        public Builder totalSubsettedObjects(Long totalSubsettedObjects) {
            this.totalSubsettedObjects = totalSubsettedObjects;
            this.__explicitlySet__.add("totalSubsettedObjects");
            return this;
        }
        /** The count of rows reduced in the subsetting job */
        @com.fasterxml.jackson.annotation.JsonProperty("totalSubsettedRows")
        private Long totalSubsettedRows;

        /**
         * The count of rows reduced in the subsetting job
         *
         * @param totalSubsettedRows the value to set
         * @return this builder
         */
        public Builder totalSubsettedRows(Long totalSubsettedRows) {
            this.totalSubsettedRows = totalSubsettedRows;
            this.__explicitlySet__.add("totalSubsettedRows");
            return this;
        }
        /** The size of the target database before subsetting in KBs */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseSizeBeforeSubsettingInKBs")
        private String databaseSizeBeforeSubsettingInKBs;

        /**
         * The size of the target database before subsetting in KBs
         *
         * @param databaseSizeBeforeSubsettingInKBs the value to set
         * @return this builder
         */
        public Builder databaseSizeBeforeSubsettingInKBs(String databaseSizeBeforeSubsettingInKBs) {
            this.databaseSizeBeforeSubsettingInKBs = databaseSizeBeforeSubsettingInKBs;
            this.__explicitlySet__.add("databaseSizeBeforeSubsettingInKBs");
            return this;
        }
        /** The size of the target database after subsetting in KBs */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseSizeAfterSubsettingInKBs")
        private String databaseSizeAfterSubsettingInKBs;

        /**
         * The size of the target database after subsetting in KBs
         *
         * @param databaseSizeAfterSubsettingInKBs the value to set
         * @return this builder
         */
        public Builder databaseSizeAfterSubsettingInKBs(String databaseSizeAfterSubsettingInKBs) {
            this.databaseSizeAfterSubsettingInKBs = databaseSizeAfterSubsettingInKBs;
            this.__explicitlySet__.add("databaseSizeAfterSubsettingInKBs");
            return this;
        }
        /**
         * The date and time data subsetting started, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeSubsettingStarted")
        private java.util.Date timeSubsettingStarted;

        /**
         * The date and time data subsetting started, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339)
         *
         * @param timeSubsettingStarted the value to set
         * @return this builder
         */
        public Builder timeSubsettingStarted(java.util.Date timeSubsettingStarted) {
            this.timeSubsettingStarted = timeSubsettingStarted;
            this.__explicitlySet__.add("timeSubsettingStarted");
            return this;
        }
        /**
         * The date and time data subsetting finished, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeSubsettingFinished")
        private java.util.Date timeSubsettingFinished;

        /**
         * The date and time data subsetting finished, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339)
         *
         * @param timeSubsettingFinished the value to set
         * @return this builder
         */
        public Builder timeSubsettingFinished(java.util.Date timeSubsettingFinished) {
            this.timeSubsettingFinished = timeSubsettingFinished;
            this.__explicitlySet__.add("timeSubsettingFinished");
            return this;
        }
        /** The current state of the subsetting report */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private SubsettingReport.LifecycleState lifecycleState;

        /**
         * The current state of the subsetting report
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(SubsettingReport.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The date and time the subsetting report was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the subsetting report was created, in the format defined by
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
        /** Indicates if redo logging was enabled during the subsetting operation */
        @com.fasterxml.jackson.annotation.JsonProperty("isRedoLoggingEnabled")
        private Boolean isRedoLoggingEnabled;

        /**
         * Indicates if redo logging was enabled during the subsetting operation
         *
         * @param isRedoLoggingEnabled the value to set
         * @return this builder
         */
        public Builder isRedoLoggingEnabled(Boolean isRedoLoggingEnabled) {
            this.isRedoLoggingEnabled = isRedoLoggingEnabled;
            this.__explicitlySet__.add("isRedoLoggingEnabled");
            return this;
        }
        /** Indicates if statistics gathering was enabled during the subsetting operation */
        @com.fasterxml.jackson.annotation.JsonProperty("isRefreshStatsEnabled")
        private Boolean isRefreshStatsEnabled;

        /**
         * Indicates if statistics gathering was enabled during the subsetting operation
         *
         * @param isRefreshStatsEnabled the value to set
         * @return this builder
         */
        public Builder isRefreshStatsEnabled(Boolean isRefreshStatsEnabled) {
            this.isRefreshStatsEnabled = isRefreshStatsEnabled;
            this.__explicitlySet__.add("isRefreshStatsEnabled");
            return this;
        }
        /** Indicates if parallel execution was enabled during the subsetting operation */
        @com.fasterxml.jackson.annotation.JsonProperty("parallelDegree")
        private String parallelDegree;

        /**
         * Indicates if parallel execution was enabled during the subsetting operation
         *
         * @param parallelDegree the value to set
         * @return this builder
         */
        public Builder parallelDegree(String parallelDegree) {
            this.parallelDegree = parallelDegree;
            this.__explicitlySet__.add("parallelDegree");
            return this;
        }
        /** Indicates how invalid objects were recompiled post the subsetting operation */
        @com.fasterxml.jackson.annotation.JsonProperty("recompile")
        private String recompile;

        /**
         * Indicates how invalid objects were recompiled post the subsetting operation
         *
         * @param recompile the value to set
         * @return this builder
         */
        public Builder recompile(String recompile) {
            this.recompile = recompile;
            this.__explicitlySet__.add("recompile");
            return this;
        }
        /** The status of the subsetting job */
        @com.fasterxml.jackson.annotation.JsonProperty("subsettingStatus")
        private SubsettingStatus subsettingStatus;

        /**
         * The status of the subsetting job
         *
         * @param subsettingStatus the value to set
         * @return this builder
         */
        public Builder subsettingStatus(SubsettingStatus subsettingStatus) {
            this.subsettingStatus = subsettingStatus;
            this.__explicitlySet__.add("subsettingStatus");
            return this;
        }
        /** The total number of errors in pre-subsetting script */
        @com.fasterxml.jackson.annotation.JsonProperty("totalPreSubsettingScriptErrors")
        private Long totalPreSubsettingScriptErrors;

        /**
         * The total number of errors in pre-subsetting script
         *
         * @param totalPreSubsettingScriptErrors the value to set
         * @return this builder
         */
        public Builder totalPreSubsettingScriptErrors(Long totalPreSubsettingScriptErrors) {
            this.totalPreSubsettingScriptErrors = totalPreSubsettingScriptErrors;
            this.__explicitlySet__.add("totalPreSubsettingScriptErrors");
            return this;
        }
        /** The total number of errors in post-subsetting script */
        @com.fasterxml.jackson.annotation.JsonProperty("totalPostSubsettingScriptErrors")
        private Long totalPostSubsettingScriptErrors;

        /**
         * The total number of errors in post-subsetting script
         *
         * @param totalPostSubsettingScriptErrors the value to set
         * @return this builder
         */
        public Builder totalPostSubsettingScriptErrors(Long totalPostSubsettingScriptErrors) {
            this.totalPostSubsettingScriptErrors = totalPostSubsettingScriptErrors;
            this.__explicitlySet__.add("totalPostSubsettingScriptErrors");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SubsettingReportSummary build() {
            SubsettingReportSummary model =
                    new SubsettingReportSummary(
                            this.id,
                            this.compartmentId,
                            this.subsettingWorkRequestId,
                            this.subsettingPolicyId,
                            this.targetId,
                            this.maskingReportId,
                            this.maskingPolicyId,
                            this.maskingWorkRequestId,
                            this.totalSubsettedSchemas,
                            this.totalSubsettedObjects,
                            this.totalSubsettedRows,
                            this.databaseSizeBeforeSubsettingInKBs,
                            this.databaseSizeAfterSubsettingInKBs,
                            this.timeSubsettingStarted,
                            this.timeSubsettingFinished,
                            this.lifecycleState,
                            this.timeCreated,
                            this.isRedoLoggingEnabled,
                            this.isRefreshStatsEnabled,
                            this.parallelDegree,
                            this.recompile,
                            this.subsettingStatus,
                            this.totalPreSubsettingScriptErrors,
                            this.totalPostSubsettingScriptErrors);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SubsettingReportSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("subsettingWorkRequestId")) {
                this.subsettingWorkRequestId(model.getSubsettingWorkRequestId());
            }
            if (model.wasPropertyExplicitlySet("subsettingPolicyId")) {
                this.subsettingPolicyId(model.getSubsettingPolicyId());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("maskingReportId")) {
                this.maskingReportId(model.getMaskingReportId());
            }
            if (model.wasPropertyExplicitlySet("maskingPolicyId")) {
                this.maskingPolicyId(model.getMaskingPolicyId());
            }
            if (model.wasPropertyExplicitlySet("maskingWorkRequestId")) {
                this.maskingWorkRequestId(model.getMaskingWorkRequestId());
            }
            if (model.wasPropertyExplicitlySet("totalSubsettedSchemas")) {
                this.totalSubsettedSchemas(model.getTotalSubsettedSchemas());
            }
            if (model.wasPropertyExplicitlySet("totalSubsettedObjects")) {
                this.totalSubsettedObjects(model.getTotalSubsettedObjects());
            }
            if (model.wasPropertyExplicitlySet("totalSubsettedRows")) {
                this.totalSubsettedRows(model.getTotalSubsettedRows());
            }
            if (model.wasPropertyExplicitlySet("databaseSizeBeforeSubsettingInKBs")) {
                this.databaseSizeBeforeSubsettingInKBs(
                        model.getDatabaseSizeBeforeSubsettingInKBs());
            }
            if (model.wasPropertyExplicitlySet("databaseSizeAfterSubsettingInKBs")) {
                this.databaseSizeAfterSubsettingInKBs(model.getDatabaseSizeAfterSubsettingInKBs());
            }
            if (model.wasPropertyExplicitlySet("timeSubsettingStarted")) {
                this.timeSubsettingStarted(model.getTimeSubsettingStarted());
            }
            if (model.wasPropertyExplicitlySet("timeSubsettingFinished")) {
                this.timeSubsettingFinished(model.getTimeSubsettingFinished());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
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
            if (model.wasPropertyExplicitlySet("subsettingStatus")) {
                this.subsettingStatus(model.getSubsettingStatus());
            }
            if (model.wasPropertyExplicitlySet("totalPreSubsettingScriptErrors")) {
                this.totalPreSubsettingScriptErrors(model.getTotalPreSubsettingScriptErrors());
            }
            if (model.wasPropertyExplicitlySet("totalPostSubsettingScriptErrors")) {
                this.totalPostSubsettingScriptErrors(model.getTotalPostSubsettingScriptErrors());
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

    /** The OCID of the subsetting report */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the subsetting report
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of the compartment that contains the subsetting report */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the subsetting report
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The OCID of the subsetting work request that resulted in this subsetting report */
    @com.fasterxml.jackson.annotation.JsonProperty("subsettingWorkRequestId")
    private final String subsettingWorkRequestId;

    /**
     * The OCID of the subsetting work request that resulted in this subsetting report
     *
     * @return the value
     */
    public String getSubsettingWorkRequestId() {
        return subsettingWorkRequestId;
    }

    /** The OCID of the subsetting policy used */
    @com.fasterxml.jackson.annotation.JsonProperty("subsettingPolicyId")
    private final String subsettingPolicyId;

    /**
     * The OCID of the subsetting policy used
     *
     * @return the value
     */
    public String getSubsettingPolicyId() {
        return subsettingPolicyId;
    }

    /** The OCID of the target database subsetted */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * The OCID of the target database subsetted
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
    }

    /** The OCID of the masking report associated with this subsetting report */
    @com.fasterxml.jackson.annotation.JsonProperty("maskingReportId")
    private final String maskingReportId;

    /**
     * The OCID of the masking report associated with this subsetting report
     *
     * @return the value
     */
    public String getMaskingReportId() {
        return maskingReportId;
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

    /** The OCID of the masking work request triggered after this subsetting job */
    @com.fasterxml.jackson.annotation.JsonProperty("maskingWorkRequestId")
    private final String maskingWorkRequestId;

    /**
     * The OCID of the masking work request triggered after this subsetting job
     *
     * @return the value
     */
    public String getMaskingWorkRequestId() {
        return maskingWorkRequestId;
    }

    /** The total number of subsetted schemas */
    @com.fasterxml.jackson.annotation.JsonProperty("totalSubsettedSchemas")
    private final Long totalSubsettedSchemas;

    /**
     * The total number of subsetted schemas
     *
     * @return the value
     */
    public Long getTotalSubsettedSchemas() {
        return totalSubsettedSchemas;
    }

    /** The total number of subsetted objects */
    @com.fasterxml.jackson.annotation.JsonProperty("totalSubsettedObjects")
    private final Long totalSubsettedObjects;

    /**
     * The total number of subsetted objects
     *
     * @return the value
     */
    public Long getTotalSubsettedObjects() {
        return totalSubsettedObjects;
    }

    /** The count of rows reduced in the subsetting job */
    @com.fasterxml.jackson.annotation.JsonProperty("totalSubsettedRows")
    private final Long totalSubsettedRows;

    /**
     * The count of rows reduced in the subsetting job
     *
     * @return the value
     */
    public Long getTotalSubsettedRows() {
        return totalSubsettedRows;
    }

    /** The size of the target database before subsetting in KBs */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseSizeBeforeSubsettingInKBs")
    private final String databaseSizeBeforeSubsettingInKBs;

    /**
     * The size of the target database before subsetting in KBs
     *
     * @return the value
     */
    public String getDatabaseSizeBeforeSubsettingInKBs() {
        return databaseSizeBeforeSubsettingInKBs;
    }

    /** The size of the target database after subsetting in KBs */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseSizeAfterSubsettingInKBs")
    private final String databaseSizeAfterSubsettingInKBs;

    /**
     * The size of the target database after subsetting in KBs
     *
     * @return the value
     */
    public String getDatabaseSizeAfterSubsettingInKBs() {
        return databaseSizeAfterSubsettingInKBs;
    }

    /**
     * The date and time data subsetting started, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeSubsettingStarted")
    private final java.util.Date timeSubsettingStarted;

    /**
     * The date and time data subsetting started, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339)
     *
     * @return the value
     */
    public java.util.Date getTimeSubsettingStarted() {
        return timeSubsettingStarted;
    }

    /**
     * The date and time data subsetting finished, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeSubsettingFinished")
    private final java.util.Date timeSubsettingFinished;

    /**
     * The date and time data subsetting finished, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339)
     *
     * @return the value
     */
    public java.util.Date getTimeSubsettingFinished() {
        return timeSubsettingFinished;
    }

    /** The current state of the subsetting report */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final SubsettingReport.LifecycleState lifecycleState;

    /**
     * The current state of the subsetting report
     *
     * @return the value
     */
    public SubsettingReport.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The date and time the subsetting report was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the subsetting report was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339)
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** Indicates if redo logging was enabled during the subsetting operation */
    @com.fasterxml.jackson.annotation.JsonProperty("isRedoLoggingEnabled")
    private final Boolean isRedoLoggingEnabled;

    /**
     * Indicates if redo logging was enabled during the subsetting operation
     *
     * @return the value
     */
    public Boolean getIsRedoLoggingEnabled() {
        return isRedoLoggingEnabled;
    }

    /** Indicates if statistics gathering was enabled during the subsetting operation */
    @com.fasterxml.jackson.annotation.JsonProperty("isRefreshStatsEnabled")
    private final Boolean isRefreshStatsEnabled;

    /**
     * Indicates if statistics gathering was enabled during the subsetting operation
     *
     * @return the value
     */
    public Boolean getIsRefreshStatsEnabled() {
        return isRefreshStatsEnabled;
    }

    /** Indicates if parallel execution was enabled during the subsetting operation */
    @com.fasterxml.jackson.annotation.JsonProperty("parallelDegree")
    private final String parallelDegree;

    /**
     * Indicates if parallel execution was enabled during the subsetting operation
     *
     * @return the value
     */
    public String getParallelDegree() {
        return parallelDegree;
    }

    /** Indicates how invalid objects were recompiled post the subsetting operation */
    @com.fasterxml.jackson.annotation.JsonProperty("recompile")
    private final String recompile;

    /**
     * Indicates how invalid objects were recompiled post the subsetting operation
     *
     * @return the value
     */
    public String getRecompile() {
        return recompile;
    }

    /** The status of the subsetting job */
    public enum SubsettingStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Failed("FAILED"),
        Success("SUCCESS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(SubsettingStatus.class);

        private final String value;
        private static java.util.Map<String, SubsettingStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (SubsettingStatus v : SubsettingStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SubsettingStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SubsettingStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SubsettingStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The status of the subsetting job */
    @com.fasterxml.jackson.annotation.JsonProperty("subsettingStatus")
    private final SubsettingStatus subsettingStatus;

    /**
     * The status of the subsetting job
     *
     * @return the value
     */
    public SubsettingStatus getSubsettingStatus() {
        return subsettingStatus;
    }

    /** The total number of errors in pre-subsetting script */
    @com.fasterxml.jackson.annotation.JsonProperty("totalPreSubsettingScriptErrors")
    private final Long totalPreSubsettingScriptErrors;

    /**
     * The total number of errors in pre-subsetting script
     *
     * @return the value
     */
    public Long getTotalPreSubsettingScriptErrors() {
        return totalPreSubsettingScriptErrors;
    }

    /** The total number of errors in post-subsetting script */
    @com.fasterxml.jackson.annotation.JsonProperty("totalPostSubsettingScriptErrors")
    private final Long totalPostSubsettingScriptErrors;

    /**
     * The total number of errors in post-subsetting script
     *
     * @return the value
     */
    public Long getTotalPostSubsettingScriptErrors() {
        return totalPostSubsettingScriptErrors;
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
        sb.append("SubsettingReportSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", subsettingWorkRequestId=")
                .append(String.valueOf(this.subsettingWorkRequestId));
        sb.append(", subsettingPolicyId=").append(String.valueOf(this.subsettingPolicyId));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", maskingReportId=").append(String.valueOf(this.maskingReportId));
        sb.append(", maskingPolicyId=").append(String.valueOf(this.maskingPolicyId));
        sb.append(", maskingWorkRequestId=").append(String.valueOf(this.maskingWorkRequestId));
        sb.append(", totalSubsettedSchemas=").append(String.valueOf(this.totalSubsettedSchemas));
        sb.append(", totalSubsettedObjects=").append(String.valueOf(this.totalSubsettedObjects));
        sb.append(", totalSubsettedRows=").append(String.valueOf(this.totalSubsettedRows));
        sb.append(", databaseSizeBeforeSubsettingInKBs=")
                .append(String.valueOf(this.databaseSizeBeforeSubsettingInKBs));
        sb.append(", databaseSizeAfterSubsettingInKBs=")
                .append(String.valueOf(this.databaseSizeAfterSubsettingInKBs));
        sb.append(", timeSubsettingStarted=").append(String.valueOf(this.timeSubsettingStarted));
        sb.append(", timeSubsettingFinished=").append(String.valueOf(this.timeSubsettingFinished));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", isRedoLoggingEnabled=").append(String.valueOf(this.isRedoLoggingEnabled));
        sb.append(", isRefreshStatsEnabled=").append(String.valueOf(this.isRefreshStatsEnabled));
        sb.append(", parallelDegree=").append(String.valueOf(this.parallelDegree));
        sb.append(", recompile=").append(String.valueOf(this.recompile));
        sb.append(", subsettingStatus=").append(String.valueOf(this.subsettingStatus));
        sb.append(", totalPreSubsettingScriptErrors=")
                .append(String.valueOf(this.totalPreSubsettingScriptErrors));
        sb.append(", totalPostSubsettingScriptErrors=")
                .append(String.valueOf(this.totalPostSubsettingScriptErrors));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubsettingReportSummary)) {
            return false;
        }

        SubsettingReportSummary other = (SubsettingReportSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.subsettingWorkRequestId, other.subsettingWorkRequestId)
                && java.util.Objects.equals(this.subsettingPolicyId, other.subsettingPolicyId)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.maskingReportId, other.maskingReportId)
                && java.util.Objects.equals(this.maskingPolicyId, other.maskingPolicyId)
                && java.util.Objects.equals(this.maskingWorkRequestId, other.maskingWorkRequestId)
                && java.util.Objects.equals(this.totalSubsettedSchemas, other.totalSubsettedSchemas)
                && java.util.Objects.equals(this.totalSubsettedObjects, other.totalSubsettedObjects)
                && java.util.Objects.equals(this.totalSubsettedRows, other.totalSubsettedRows)
                && java.util.Objects.equals(
                        this.databaseSizeBeforeSubsettingInKBs,
                        other.databaseSizeBeforeSubsettingInKBs)
                && java.util.Objects.equals(
                        this.databaseSizeAfterSubsettingInKBs,
                        other.databaseSizeAfterSubsettingInKBs)
                && java.util.Objects.equals(this.timeSubsettingStarted, other.timeSubsettingStarted)
                && java.util.Objects.equals(
                        this.timeSubsettingFinished, other.timeSubsettingFinished)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.isRedoLoggingEnabled, other.isRedoLoggingEnabled)
                && java.util.Objects.equals(this.isRefreshStatsEnabled, other.isRefreshStatsEnabled)
                && java.util.Objects.equals(this.parallelDegree, other.parallelDegree)
                && java.util.Objects.equals(this.recompile, other.recompile)
                && java.util.Objects.equals(this.subsettingStatus, other.subsettingStatus)
                && java.util.Objects.equals(
                        this.totalPreSubsettingScriptErrors, other.totalPreSubsettingScriptErrors)
                && java.util.Objects.equals(
                        this.totalPostSubsettingScriptErrors, other.totalPostSubsettingScriptErrors)
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
                        + (this.subsettingWorkRequestId == null
                                ? 43
                                : this.subsettingWorkRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.subsettingPolicyId == null
                                ? 43
                                : this.subsettingPolicyId.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result =
                (result * PRIME)
                        + (this.maskingReportId == null ? 43 : this.maskingReportId.hashCode());
        result =
                (result * PRIME)
                        + (this.maskingPolicyId == null ? 43 : this.maskingPolicyId.hashCode());
        result =
                (result * PRIME)
                        + (this.maskingWorkRequestId == null
                                ? 43
                                : this.maskingWorkRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.totalSubsettedSchemas == null
                                ? 43
                                : this.totalSubsettedSchemas.hashCode());
        result =
                (result * PRIME)
                        + (this.totalSubsettedObjects == null
                                ? 43
                                : this.totalSubsettedObjects.hashCode());
        result =
                (result * PRIME)
                        + (this.totalSubsettedRows == null
                                ? 43
                                : this.totalSubsettedRows.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseSizeBeforeSubsettingInKBs == null
                                ? 43
                                : this.databaseSizeBeforeSubsettingInKBs.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseSizeAfterSubsettingInKBs == null
                                ? 43
                                : this.databaseSizeAfterSubsettingInKBs.hashCode());
        result =
                (result * PRIME)
                        + (this.timeSubsettingStarted == null
                                ? 43
                                : this.timeSubsettingStarted.hashCode());
        result =
                (result * PRIME)
                        + (this.timeSubsettingFinished == null
                                ? 43
                                : this.timeSubsettingFinished.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
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
                        + (this.subsettingStatus == null ? 43 : this.subsettingStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.totalPreSubsettingScriptErrors == null
                                ? 43
                                : this.totalPreSubsettingScriptErrors.hashCode());
        result =
                (result * PRIME)
                        + (this.totalPostSubsettingScriptErrors == null
                                ? 43
                                : this.totalPostSubsettingScriptErrors.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
