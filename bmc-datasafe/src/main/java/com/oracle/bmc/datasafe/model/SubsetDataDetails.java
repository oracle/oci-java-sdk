/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details required to perform data subsetting on a target database using a subsetting policy <br>
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
        builder = SubsetDataDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SubsetDataDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "targetId",
        "masking",
        "isRerun",
        "reRunFromStep",
        "tablespace",
        "isRedoLoggingEnabled",
        "isRefreshStatsEnabled",
        "parallelDegree",
        "recompile",
        "targetCredentials"
    })
    public SubsetDataDetails(
            String targetId,
            Masking masking,
            Boolean isRerun,
            ReRunFromStep reRunFromStep,
            String tablespace,
            Boolean isRedoLoggingEnabled,
            Boolean isRefreshStatsEnabled,
            String parallelDegree,
            SubsettingPolicy.Recompile recompile,
            Credentials targetCredentials) {
        super();
        this.targetId = targetId;
        this.masking = masking;
        this.isRerun = isRerun;
        this.reRunFromStep = reRunFromStep;
        this.tablespace = tablespace;
        this.isRedoLoggingEnabled = isRedoLoggingEnabled;
        this.isRefreshStatsEnabled = isRefreshStatsEnabled;
        this.parallelDegree = parallelDegree;
        this.recompile = recompile;
        this.targetCredentials = targetCredentials;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the target database to be subsetted. If it's not provided, the value of the
         * targetId attribute in the SubsettingPolicy resource is used
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * The OCID of the target database to be subsetted. If it's not provided, the value of the
         * targetId attribute in the SubsettingPolicy resource is used
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /** Indicates whether masking should be triggered after successful subsetting */
        @com.fasterxml.jackson.annotation.JsonProperty("masking")
        private Masking masking;

        /**
         * Indicates whether masking should be triggered after successful subsetting
         *
         * @param masking the value to set
         * @return this builder
         */
        public Builder masking(Masking masking) {
            this.masking = masking;
            this.__explicitlySet__.add("masking");
            return this;
        }
        /** Indicates if the request is to rerun the previously failed subsetting job */
        @com.fasterxml.jackson.annotation.JsonProperty("isRerun")
        private Boolean isRerun;

        /**
         * Indicates if the request is to rerun the previously failed subsetting job
         *
         * @param isRerun the value to set
         * @return this builder
         */
        public Builder isRerun(Boolean isRerun) {
            this.isRerun = isRerun;
            this.__explicitlySet__.add("isRerun");
            return this;
        }
        /**
         * Specifies the step from which subsetting needs to be rerun. This param will be used only
         * when isRerun attribute is true. If PRE_SUBSETTING_SCRIPT is passed, it will rerun the
         * pre-subsetting script, followed by subsetting, and then the post-subsetting script. If
         * POST_SUBSETTING_SCRIPT is passed, it will rerun only the post-subsetting script. If this
         * field is not set and isRerun is set to true, then it will default to the last failed
         * step.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("reRunFromStep")
        private ReRunFromStep reRunFromStep;

        /**
         * Specifies the step from which subsetting needs to be rerun. This param will be used only
         * when isRerun attribute is true. If PRE_SUBSETTING_SCRIPT is passed, it will rerun the
         * pre-subsetting script, followed by subsetting, and then the post-subsetting script. If
         * POST_SUBSETTING_SCRIPT is passed, it will rerun only the post-subsetting script. If this
         * field is not set and isRerun is set to true, then it will default to the last failed
         * step.
         *
         * @param reRunFromStep the value to set
         * @return this builder
         */
        public Builder reRunFromStep(ReRunFromStep reRunFromStep) {
            this.reRunFromStep = reRunFromStep;
            this.__explicitlySet__.add("reRunFromStep");
            return this;
        }
        /**
         * The tablespace that should be used to create the temporary tables for data subsetting. If
         * no tablespace is provided, the DEFAULT tablespace is used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tablespace")
        private String tablespace;

        /**
         * The tablespace that should be used to create the temporary tables for data subsetting. If
         * no tablespace is provided, the DEFAULT tablespace is used.
         *
         * @param tablespace the value to set
         * @return this builder
         */
        public Builder tablespace(String tablespace) {
            this.tablespace = tablespace;
            this.__explicitlySet__.add("tablespace");
            return this;
        }
        /**
         * Indicates if redo logging is enabled during a subsetting operation. Set this attribute to
         * true to enable redo logging. If set as false, subsetting disables redo logging and
         * flashback logging to purge any original data from logs. However, in certain circumstances
         * when you only want to test subsetting, rollback changes, and retry, you could enable
         * logging and use a flashback database to retrieve the original data after it has been
         * subsetted. If it's not provided, the value of the isRedoLoggingEnabled attribute in the
         * SubsettingPolicy resource is used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isRedoLoggingEnabled")
        private Boolean isRedoLoggingEnabled;

        /**
         * Indicates if redo logging is enabled during a subsetting operation. Set this attribute to
         * true to enable redo logging. If set as false, subsetting disables redo logging and
         * flashback logging to purge any original data from logs. However, in certain circumstances
         * when you only want to test subsetting, rollback changes, and retry, you could enable
         * logging and use a flashback database to retrieve the original data after it has been
         * subsetted. If it's not provided, the value of the isRedoLoggingEnabled attribute in the
         * SubsettingPolicy resource is used.
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
         * Indicates if statistics gathering is enabled. Set this attribute to false to disable
         * statistics gathering. The subsetting process gathers statistics on subset database tables
         * after subsetting completes. If it's not provided, the value of the isRefreshStatsEnabled
         * attribute in the SubsettingPolicy resource is used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isRefreshStatsEnabled")
        private Boolean isRefreshStatsEnabled;

        /**
         * Indicates if statistics gathering is enabled. Set this attribute to false to disable
         * statistics gathering. The subsetting process gathers statistics on subset database tables
         * after subsetting completes. If it's not provided, the value of the isRefreshStatsEnabled
         * attribute in the SubsettingPolicy resource is used.
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
         * explicit degree of parallelism.
         * https://www.oracle.com/pls/topic/lookup?ctx=dblatest&en/database/oracle/oracle-database&id=VLDBG-GUID-3E2AE088-2505-465E-A8B2-AC38813EA355
         * If it's not provided, the value of the parallelDegree attribute in the SubsettingPolicy
         * resource is used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("parallelDegree")
        private String parallelDegree;

        /**
         * Specifies options to enable parallel execution when running data subsetting. Allowed
         * values are 'NONE' (no parallelism), 'DEFAULT' (the Oracle Database computes the optimum
         * degree of parallelism) or an integer value to be used as the degree of parallelism.
         * Parallel execution helps effectively use multiple CPUs and improve subsetting
         * performance. Refer to the Oracle Database parallel execution framework when choosing an
         * explicit degree of parallelism.
         * https://www.oracle.com/pls/topic/lookup?ctx=dblatest&en/database/oracle/oracle-database&id=VLDBG-GUID-3E2AE088-2505-465E-A8B2-AC38813EA355
         * If it's not provided, the value of the parallelDegree attribute in the SubsettingPolicy
         * resource is used.
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
         * subsetting completes. If it's not provided, the value of the recompile attribute in the
         * SubsettingPolicy resource is used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("recompile")
        private SubsettingPolicy.Recompile recompile;

        /**
         * Specifies how to recompile invalid objects post data subsetting. Allowed values are
         * 'SERIAL' (recompile in serial), 'PARALLEL' (recompile in parallel), 'NONE' (do not
         * recompile). If it's set to PARALLEL, the value of parallelDegree attribute is used. Use
         * the built-in UTL_RECOMP package to recompile any remaining invalid objects after
         * subsetting completes. If it's not provided, the value of the recompile attribute in the
         * SubsettingPolicy resource is used.
         *
         * @param recompile the value to set
         * @return this builder
         */
        public Builder recompile(SubsettingPolicy.Recompile recompile) {
            this.recompile = recompile;
            this.__explicitlySet__.add("recompile");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetCredentials")
        private Credentials targetCredentials;

        public Builder targetCredentials(Credentials targetCredentials) {
            this.targetCredentials = targetCredentials;
            this.__explicitlySet__.add("targetCredentials");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SubsetDataDetails build() {
            SubsetDataDetails model =
                    new SubsetDataDetails(
                            this.targetId,
                            this.masking,
                            this.isRerun,
                            this.reRunFromStep,
                            this.tablespace,
                            this.isRedoLoggingEnabled,
                            this.isRefreshStatsEnabled,
                            this.parallelDegree,
                            this.recompile,
                            this.targetCredentials);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SubsetDataDetails model) {
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("masking")) {
                this.masking(model.getMasking());
            }
            if (model.wasPropertyExplicitlySet("isRerun")) {
                this.isRerun(model.getIsRerun());
            }
            if (model.wasPropertyExplicitlySet("reRunFromStep")) {
                this.reRunFromStep(model.getReRunFromStep());
            }
            if (model.wasPropertyExplicitlySet("tablespace")) {
                this.tablespace(model.getTablespace());
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
            if (model.wasPropertyExplicitlySet("targetCredentials")) {
                this.targetCredentials(model.getTargetCredentials());
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
     * The OCID of the target database to be subsetted. If it's not provided, the value of the
     * targetId attribute in the SubsettingPolicy resource is used
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * The OCID of the target database to be subsetted. If it's not provided, the value of the
     * targetId attribute in the SubsettingPolicy resource is used
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
    }

    /** Indicates whether masking should be triggered after successful subsetting */
    public enum Masking implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        ;

        private final String value;
        private static java.util.Map<String, Masking> map;

        static {
            map = new java.util.HashMap<>();
            for (Masking v : Masking.values()) {
                map.put(v.getValue(), v);
            }
        }

        Masking(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Masking create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Masking: " + key);
        }
    };
    /** Indicates whether masking should be triggered after successful subsetting */
    @com.fasterxml.jackson.annotation.JsonProperty("masking")
    private final Masking masking;

    /**
     * Indicates whether masking should be triggered after successful subsetting
     *
     * @return the value
     */
    public Masking getMasking() {
        return masking;
    }

    /** Indicates if the request is to rerun the previously failed subsetting job */
    @com.fasterxml.jackson.annotation.JsonProperty("isRerun")
    private final Boolean isRerun;

    /**
     * Indicates if the request is to rerun the previously failed subsetting job
     *
     * @return the value
     */
    public Boolean getIsRerun() {
        return isRerun;
    }

    /**
     * Specifies the step from which subsetting needs to be rerun. This param will be used only when
     * isRerun attribute is true. If PRE_SUBSETTING_SCRIPT is passed, it will rerun the
     * pre-subsetting script, followed by subsetting, and then the post-subsetting script. If
     * POST_SUBSETTING_SCRIPT is passed, it will rerun only the post-subsetting script. If this
     * field is not set and isRerun is set to true, then it will default to the last failed step.
     */
    public enum ReRunFromStep implements com.oracle.bmc.http.internal.BmcEnum {
        PreSubsettingScript("PRE_SUBSETTING_SCRIPT"),
        PostSubsettingScript("POST_SUBSETTING_SCRIPT"),
        ;

        private final String value;
        private static java.util.Map<String, ReRunFromStep> map;

        static {
            map = new java.util.HashMap<>();
            for (ReRunFromStep v : ReRunFromStep.values()) {
                map.put(v.getValue(), v);
            }
        }

        ReRunFromStep(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ReRunFromStep create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ReRunFromStep: " + key);
        }
    };
    /**
     * Specifies the step from which subsetting needs to be rerun. This param will be used only when
     * isRerun attribute is true. If PRE_SUBSETTING_SCRIPT is passed, it will rerun the
     * pre-subsetting script, followed by subsetting, and then the post-subsetting script. If
     * POST_SUBSETTING_SCRIPT is passed, it will rerun only the post-subsetting script. If this
     * field is not set and isRerun is set to true, then it will default to the last failed step.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reRunFromStep")
    private final ReRunFromStep reRunFromStep;

    /**
     * Specifies the step from which subsetting needs to be rerun. This param will be used only when
     * isRerun attribute is true. If PRE_SUBSETTING_SCRIPT is passed, it will rerun the
     * pre-subsetting script, followed by subsetting, and then the post-subsetting script. If
     * POST_SUBSETTING_SCRIPT is passed, it will rerun only the post-subsetting script. If this
     * field is not set and isRerun is set to true, then it will default to the last failed step.
     *
     * @return the value
     */
    public ReRunFromStep getReRunFromStep() {
        return reRunFromStep;
    }

    /**
     * The tablespace that should be used to create the temporary tables for data subsetting. If no
     * tablespace is provided, the DEFAULT tablespace is used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tablespace")
    private final String tablespace;

    /**
     * The tablespace that should be used to create the temporary tables for data subsetting. If no
     * tablespace is provided, the DEFAULT tablespace is used.
     *
     * @return the value
     */
    public String getTablespace() {
        return tablespace;
    }

    /**
     * Indicates if redo logging is enabled during a subsetting operation. Set this attribute to
     * true to enable redo logging. If set as false, subsetting disables redo logging and flashback
     * logging to purge any original data from logs. However, in certain circumstances when you only
     * want to test subsetting, rollback changes, and retry, you could enable logging and use a
     * flashback database to retrieve the original data after it has been subsetted. If it's not
     * provided, the value of the isRedoLoggingEnabled attribute in the SubsettingPolicy resource is
     * used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isRedoLoggingEnabled")
    private final Boolean isRedoLoggingEnabled;

    /**
     * Indicates if redo logging is enabled during a subsetting operation. Set this attribute to
     * true to enable redo logging. If set as false, subsetting disables redo logging and flashback
     * logging to purge any original data from logs. However, in certain circumstances when you only
     * want to test subsetting, rollback changes, and retry, you could enable logging and use a
     * flashback database to retrieve the original data after it has been subsetted. If it's not
     * provided, the value of the isRedoLoggingEnabled attribute in the SubsettingPolicy resource is
     * used.
     *
     * @return the value
     */
    public Boolean getIsRedoLoggingEnabled() {
        return isRedoLoggingEnabled;
    }

    /**
     * Indicates if statistics gathering is enabled. Set this attribute to false to disable
     * statistics gathering. The subsetting process gathers statistics on subset database tables
     * after subsetting completes. If it's not provided, the value of the isRefreshStatsEnabled
     * attribute in the SubsettingPolicy resource is used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isRefreshStatsEnabled")
    private final Boolean isRefreshStatsEnabled;

    /**
     * Indicates if statistics gathering is enabled. Set this attribute to false to disable
     * statistics gathering. The subsetting process gathers statistics on subset database tables
     * after subsetting completes. If it's not provided, the value of the isRefreshStatsEnabled
     * attribute in the SubsettingPolicy resource is used.
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
     * Database parallel execution framework when choosing an explicit degree of parallelism.
     * https://www.oracle.com/pls/topic/lookup?ctx=dblatest&en/database/oracle/oracle-database&id=VLDBG-GUID-3E2AE088-2505-465E-A8B2-AC38813EA355
     * If it's not provided, the value of the parallelDegree attribute in the SubsettingPolicy
     * resource is used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parallelDegree")
    private final String parallelDegree;

    /**
     * Specifies options to enable parallel execution when running data subsetting. Allowed values
     * are 'NONE' (no parallelism), 'DEFAULT' (the Oracle Database computes the optimum degree of
     * parallelism) or an integer value to be used as the degree of parallelism. Parallel execution
     * helps effectively use multiple CPUs and improve subsetting performance. Refer to the Oracle
     * Database parallel execution framework when choosing an explicit degree of parallelism.
     * https://www.oracle.com/pls/topic/lookup?ctx=dblatest&en/database/oracle/oracle-database&id=VLDBG-GUID-3E2AE088-2505-465E-A8B2-AC38813EA355
     * If it's not provided, the value of the parallelDegree attribute in the SubsettingPolicy
     * resource is used.
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
     * package to recompile any remaining invalid objects after subsetting completes. If it's not
     * provided, the value of the recompile attribute in the SubsettingPolicy resource is used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("recompile")
    private final SubsettingPolicy.Recompile recompile;

    /**
     * Specifies how to recompile invalid objects post data subsetting. Allowed values are 'SERIAL'
     * (recompile in serial), 'PARALLEL' (recompile in parallel), 'NONE' (do not recompile). If it's
     * set to PARALLEL, the value of parallelDegree attribute is used. Use the built-in UTL_RECOMP
     * package to recompile any remaining invalid objects after subsetting completes. If it's not
     * provided, the value of the recompile attribute in the SubsettingPolicy resource is used.
     *
     * @return the value
     */
    public SubsettingPolicy.Recompile getRecompile() {
        return recompile;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("targetCredentials")
    private final Credentials targetCredentials;

    public Credentials getTargetCredentials() {
        return targetCredentials;
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
        sb.append("SubsetDataDetails(");
        sb.append("super=").append(super.toString());
        sb.append("targetId=").append(String.valueOf(this.targetId));
        sb.append(", masking=").append(String.valueOf(this.masking));
        sb.append(", isRerun=").append(String.valueOf(this.isRerun));
        sb.append(", reRunFromStep=").append(String.valueOf(this.reRunFromStep));
        sb.append(", tablespace=").append(String.valueOf(this.tablespace));
        sb.append(", isRedoLoggingEnabled=").append(String.valueOf(this.isRedoLoggingEnabled));
        sb.append(", isRefreshStatsEnabled=").append(String.valueOf(this.isRefreshStatsEnabled));
        sb.append(", parallelDegree=").append(String.valueOf(this.parallelDegree));
        sb.append(", recompile=").append(String.valueOf(this.recompile));
        sb.append(", targetCredentials=").append(String.valueOf(this.targetCredentials));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubsetDataDetails)) {
            return false;
        }

        SubsetDataDetails other = (SubsetDataDetails) o;
        return java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.masking, other.masking)
                && java.util.Objects.equals(this.isRerun, other.isRerun)
                && java.util.Objects.equals(this.reRunFromStep, other.reRunFromStep)
                && java.util.Objects.equals(this.tablespace, other.tablespace)
                && java.util.Objects.equals(this.isRedoLoggingEnabled, other.isRedoLoggingEnabled)
                && java.util.Objects.equals(this.isRefreshStatsEnabled, other.isRefreshStatsEnabled)
                && java.util.Objects.equals(this.parallelDegree, other.parallelDegree)
                && java.util.Objects.equals(this.recompile, other.recompile)
                && java.util.Objects.equals(this.targetCredentials, other.targetCredentials)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.masking == null ? 43 : this.masking.hashCode());
        result = (result * PRIME) + (this.isRerun == null ? 43 : this.isRerun.hashCode());
        result =
                (result * PRIME)
                        + (this.reRunFromStep == null ? 43 : this.reRunFromStep.hashCode());
        result = (result * PRIME) + (this.tablespace == null ? 43 : this.tablespace.hashCode());
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
                        + (this.targetCredentials == null ? 43 : this.targetCredentials.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
