/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details to mask data. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MaskDataDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MaskDataDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "targetId",
        "isDecrypt",
        "isRerun",
        "tablespace",
        "isIgnoreErrorsEnabled",
        "seed",
        "isMoveInterimTablesEnabled",
        "isExecuteSavedScriptEnabled",
        "isDropTempTablesEnabled",
        "isRedoLoggingEnabled",
        "isRefreshStatsEnabled",
        "parallelDegree",
        "recompile"
    })
    public MaskDataDetails(
            String targetId,
            Boolean isDecrypt,
            Boolean isRerun,
            String tablespace,
            Boolean isIgnoreErrorsEnabled,
            String seed,
            Boolean isMoveInterimTablesEnabled,
            Boolean isExecuteSavedScriptEnabled,
            Boolean isDropTempTablesEnabled,
            Boolean isRedoLoggingEnabled,
            Boolean isRefreshStatsEnabled,
            String parallelDegree,
            String recompile) {
        super();
        this.targetId = targetId;
        this.isDecrypt = isDecrypt;
        this.isRerun = isRerun;
        this.tablespace = tablespace;
        this.isIgnoreErrorsEnabled = isIgnoreErrorsEnabled;
        this.seed = seed;
        this.isMoveInterimTablesEnabled = isMoveInterimTablesEnabled;
        this.isExecuteSavedScriptEnabled = isExecuteSavedScriptEnabled;
        this.isDropTempTablesEnabled = isDropTempTablesEnabled;
        this.isRedoLoggingEnabled = isRedoLoggingEnabled;
        this.isRefreshStatsEnabled = isRefreshStatsEnabled;
        this.parallelDegree = parallelDegree;
        this.recompile = recompile;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the target database to be masked. If it's not provided, the value of the
         * targetId attribute in the MaskingPolicy resource is used. The OCID of the target database
         * to be masked. If it's not provided, the value of the targetId attribute in the
         * MaskingPolicy resource is used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * The OCID of the target database to be masked. If it's not provided, the value of the
         * targetId attribute in the MaskingPolicy resource is used. The OCID of the target database
         * to be masked. If it's not provided, the value of the targetId attribute in the
         * MaskingPolicy resource is used.
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /**
         * Indicates if the masking request is to decrypt the data values previously encrypted using
         * Deterministic Encryption. Note that, to correctly decrypt the encrypted data values, it
         * requires the same seed value that was provided to encrypt those data values.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isDecrypt")
        private Boolean isDecrypt;

        /**
         * Indicates if the masking request is to decrypt the data values previously encrypted using
         * Deterministic Encryption. Note that, to correctly decrypt the encrypted data values, it
         * requires the same seed value that was provided to encrypt those data values.
         *
         * @param isDecrypt the value to set
         * @return this builder
         */
        public Builder isDecrypt(Boolean isDecrypt) {
            this.isDecrypt = isDecrypt;
            this.__explicitlySet__.add("isDecrypt");
            return this;
        }
        /**
         * Indicates if the masking request is to rerun the previously failed masking steps. If a
         * masking request is submitted with the isIgnoreErrorsEnabled attribute set to true, the
         * masking process tracks the failed masking steps. Another masking request can be submitted
         * with the isRun attribute set to true to rerun those failed masking steps. It helps save
         * time by executing only the failed masking steps and not doing the whole masking again.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isRerun")
        private Boolean isRerun;

        /**
         * Indicates if the masking request is to rerun the previously failed masking steps. If a
         * masking request is submitted with the isIgnoreErrorsEnabled attribute set to true, the
         * masking process tracks the failed masking steps. Another masking request can be submitted
         * with the isRun attribute set to true to rerun those failed masking steps. It helps save
         * time by executing only the failed masking steps and not doing the whole masking again.
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
         * The tablespace that should be used to create the mapping tables, DMASK objects, and other
         * temporary tables for data masking. If no tablespace is provided, the DEFAULT tablespace
         * is used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tablespace")
        private String tablespace;

        /**
         * The tablespace that should be used to create the mapping tables, DMASK objects, and other
         * temporary tables for data masking. If no tablespace is provided, the DEFAULT tablespace
         * is used.
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
         * Indicates if the masking process should continue on hitting an error. It provides fault
         * tolerance support and is enabled by default. In fault-tolerant mode, the masking process
         * saves the failed step and continues. You can then submit another masking request (with
         * isRerun attribute set to true) to execute only the failed steps.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isIgnoreErrorsEnabled")
        private Boolean isIgnoreErrorsEnabled;

        /**
         * Indicates if the masking process should continue on hitting an error. It provides fault
         * tolerance support and is enabled by default. In fault-tolerant mode, the masking process
         * saves the failed step and continues. You can then submit another masking request (with
         * isRerun attribute set to true) to execute only the failed steps.
         *
         * @param isIgnoreErrorsEnabled the value to set
         * @return this builder
         */
        public Builder isIgnoreErrorsEnabled(Boolean isIgnoreErrorsEnabled) {
            this.isIgnoreErrorsEnabled = isIgnoreErrorsEnabled;
            this.__explicitlySet__.add("isIgnoreErrorsEnabled");
            return this;
        }
        /**
         * The seed value to be used in case of Deterministic Encryption and Deterministic
         * Substitution masking formats.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("seed")
        private String seed;

        /**
         * The seed value to be used in case of Deterministic Encryption and Deterministic
         * Substitution masking formats.
         *
         * @param seed the value to set
         * @return this builder
         */
        public Builder seed(String seed) {
            this.seed = seed;
            this.__explicitlySet__.add("seed");
            return this;
        }
        /**
         * Indicates if the interim DMASK tables should be moved to the user-specified tablespace.
         * As interim tables can be large in size, set it to false if moving them causes performance
         * overhead during masking.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isMoveInterimTablesEnabled")
        private Boolean isMoveInterimTablesEnabled;

        /**
         * Indicates if the interim DMASK tables should be moved to the user-specified tablespace.
         * As interim tables can be large in size, set it to false if moving them causes performance
         * overhead during masking.
         *
         * @param isMoveInterimTablesEnabled the value to set
         * @return this builder
         */
        public Builder isMoveInterimTablesEnabled(Boolean isMoveInterimTablesEnabled) {
            this.isMoveInterimTablesEnabled = isMoveInterimTablesEnabled;
            this.__explicitlySet__.add("isMoveInterimTablesEnabled");
            return this;
        }
        /**
         * Indicates if data masking should be performed using a saved masking script. Setting this
         * attribute to true skips masking script generation and executes the masking script stored
         * in the Data Safe repository. It helps save time if there are no changes in the database
         * tables and their dependencies.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isExecuteSavedScriptEnabled")
        private Boolean isExecuteSavedScriptEnabled;

        /**
         * Indicates if data masking should be performed using a saved masking script. Setting this
         * attribute to true skips masking script generation and executes the masking script stored
         * in the Data Safe repository. It helps save time if there are no changes in the database
         * tables and their dependencies.
         *
         * @param isExecuteSavedScriptEnabled the value to set
         * @return this builder
         */
        public Builder isExecuteSavedScriptEnabled(Boolean isExecuteSavedScriptEnabled) {
            this.isExecuteSavedScriptEnabled = isExecuteSavedScriptEnabled;
            this.__explicitlySet__.add("isExecuteSavedScriptEnabled");
            return this;
        }
        /**
         * Indicates if the temporary tables created during a masking operation should be dropped
         * after masking. Set this attribute to false to preserve the temporary tables. Masking
         * creates temporary tables that map the original sensitive data values to mask values.
         * These temporary tables are dropped after masking if this attribute is set as true. But,
         * in some cases, you may want to preserve this information to track how masking changed
         * your data. Note that doing so compromises security. These tables must be dropped before
         * the database is available for unprivileged users. If it's not provided, the value of the
         * isDropTempTablesEnabled attribute in the MaskingPolicy resource is used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isDropTempTablesEnabled")
        private Boolean isDropTempTablesEnabled;

        /**
         * Indicates if the temporary tables created during a masking operation should be dropped
         * after masking. Set this attribute to false to preserve the temporary tables. Masking
         * creates temporary tables that map the original sensitive data values to mask values.
         * These temporary tables are dropped after masking if this attribute is set as true. But,
         * in some cases, you may want to preserve this information to track how masking changed
         * your data. Note that doing so compromises security. These tables must be dropped before
         * the database is available for unprivileged users. If it's not provided, the value of the
         * isDropTempTablesEnabled attribute in the MaskingPolicy resource is used.
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
         * Indicates if redo logging is enabled during a masking operation. Set this attribute to
         * true to enable redo logging. If set as false, masking disables redo logging and flashback
         * logging to purge any original unmasked data from logs. However, in certain circumstances
         * when you only want to test masking, rollback changes, and retry masking, you could enable
         * logging and use a flashback database to retrieve the original unmasked data after it has
         * been masked. If it's not provided, the value of the isRedoLoggingEnabled attribute in the
         * MaskingPolicy resource is used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isRedoLoggingEnabled")
        private Boolean isRedoLoggingEnabled;

        /**
         * Indicates if redo logging is enabled during a masking operation. Set this attribute to
         * true to enable redo logging. If set as false, masking disables redo logging and flashback
         * logging to purge any original unmasked data from logs. However, in certain circumstances
         * when you only want to test masking, rollback changes, and retry masking, you could enable
         * logging and use a flashback database to retrieve the original unmasked data after it has
         * been masked. If it's not provided, the value of the isRedoLoggingEnabled attribute in the
         * MaskingPolicy resource is used.
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
         * statistics gathering. The masking process gathers statistics on masked database tables
         * after masking completes. If it's not provided, the value of the isRefreshStatsEnabled
         * attribute in the MaskingPolicy resource is used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isRefreshStatsEnabled")
        private Boolean isRefreshStatsEnabled;

        /**
         * Indicates if statistics gathering is enabled. Set this attribute to false to disable
         * statistics gathering. The masking process gathers statistics on masked database tables
         * after masking completes. If it's not provided, the value of the isRefreshStatsEnabled
         * attribute in the MaskingPolicy resource is used.
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
         * execution helps effectively use multiple CPUs and improve masking performance. Refer to
         * the Oracle Database parallel execution framework when choosing an explicit degree of
         * parallelism.
         * https://www.oracle.com/pls/topic/lookup?ctx=dblatest&en/database/oracle/oracle-database&id=VLDBG-GUID-3E2AE088-2505-465E-A8B2-AC38813EA355
         * If it's not provided, the value of the parallelDegree attribute in the MaskingPolicy
         * resource is used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("parallelDegree")
        private String parallelDegree;

        /**
         * Specifies options to enable parallel execution when running data masking. Allowed values
         * are 'NONE' (no parallelism), 'DEFAULT' (the Oracle Database computes the optimum degree
         * of parallelism) or an integer value to be used as the degree of parallelism. Parallel
         * execution helps effectively use multiple CPUs and improve masking performance. Refer to
         * the Oracle Database parallel execution framework when choosing an explicit degree of
         * parallelism.
         * https://www.oracle.com/pls/topic/lookup?ctx=dblatest&en/database/oracle/oracle-database&id=VLDBG-GUID-3E2AE088-2505-465E-A8B2-AC38813EA355
         * If it's not provided, the value of the parallelDegree attribute in the MaskingPolicy
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
         * Specifies how to recompile invalid objects post data masking. Allowed values are 'SERIAL'
         * (recompile in serial), 'PARALLEL' (recompile in parallel), 'NONE' (do not recompile). If
         * it's set to PARALLEL, the value of parallelDegree attribute is used. Use the built-in
         * UTL_RECOMP package to recompile any remaining invalid objects after masking completes. If
         * it's not provided, the value of the parallelDegree attribute in the MaskingPolicy
         * resource is used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("recompile")
        private String recompile;

        /**
         * Specifies how to recompile invalid objects post data masking. Allowed values are 'SERIAL'
         * (recompile in serial), 'PARALLEL' (recompile in parallel), 'NONE' (do not recompile). If
         * it's set to PARALLEL, the value of parallelDegree attribute is used. Use the built-in
         * UTL_RECOMP package to recompile any remaining invalid objects after masking completes. If
         * it's not provided, the value of the parallelDegree attribute in the MaskingPolicy
         * resource is used.
         *
         * @param recompile the value to set
         * @return this builder
         */
        public Builder recompile(String recompile) {
            this.recompile = recompile;
            this.__explicitlySet__.add("recompile");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MaskDataDetails build() {
            MaskDataDetails model =
                    new MaskDataDetails(
                            this.targetId,
                            this.isDecrypt,
                            this.isRerun,
                            this.tablespace,
                            this.isIgnoreErrorsEnabled,
                            this.seed,
                            this.isMoveInterimTablesEnabled,
                            this.isExecuteSavedScriptEnabled,
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
        public Builder copy(MaskDataDetails model) {
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("isDecrypt")) {
                this.isDecrypt(model.getIsDecrypt());
            }
            if (model.wasPropertyExplicitlySet("isRerun")) {
                this.isRerun(model.getIsRerun());
            }
            if (model.wasPropertyExplicitlySet("tablespace")) {
                this.tablespace(model.getTablespace());
            }
            if (model.wasPropertyExplicitlySet("isIgnoreErrorsEnabled")) {
                this.isIgnoreErrorsEnabled(model.getIsIgnoreErrorsEnabled());
            }
            if (model.wasPropertyExplicitlySet("seed")) {
                this.seed(model.getSeed());
            }
            if (model.wasPropertyExplicitlySet("isMoveInterimTablesEnabled")) {
                this.isMoveInterimTablesEnabled(model.getIsMoveInterimTablesEnabled());
            }
            if (model.wasPropertyExplicitlySet("isExecuteSavedScriptEnabled")) {
                this.isExecuteSavedScriptEnabled(model.getIsExecuteSavedScriptEnabled());
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The OCID of the target database to be masked. If it's not provided, the value of the targetId
     * attribute in the MaskingPolicy resource is used. The OCID of the target database to be
     * masked. If it's not provided, the value of the targetId attribute in the MaskingPolicy
     * resource is used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * The OCID of the target database to be masked. If it's not provided, the value of the targetId
     * attribute in the MaskingPolicy resource is used. The OCID of the target database to be
     * masked. If it's not provided, the value of the targetId attribute in the MaskingPolicy
     * resource is used.
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
    }

    /**
     * Indicates if the masking request is to decrypt the data values previously encrypted using
     * Deterministic Encryption. Note that, to correctly decrypt the encrypted data values, it
     * requires the same seed value that was provided to encrypt those data values.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isDecrypt")
    private final Boolean isDecrypt;

    /**
     * Indicates if the masking request is to decrypt the data values previously encrypted using
     * Deterministic Encryption. Note that, to correctly decrypt the encrypted data values, it
     * requires the same seed value that was provided to encrypt those data values.
     *
     * @return the value
     */
    public Boolean getIsDecrypt() {
        return isDecrypt;
    }

    /**
     * Indicates if the masking request is to rerun the previously failed masking steps. If a
     * masking request is submitted with the isIgnoreErrorsEnabled attribute set to true, the
     * masking process tracks the failed masking steps. Another masking request can be submitted
     * with the isRun attribute set to true to rerun those failed masking steps. It helps save time
     * by executing only the failed masking steps and not doing the whole masking again.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isRerun")
    private final Boolean isRerun;

    /**
     * Indicates if the masking request is to rerun the previously failed masking steps. If a
     * masking request is submitted with the isIgnoreErrorsEnabled attribute set to true, the
     * masking process tracks the failed masking steps. Another masking request can be submitted
     * with the isRun attribute set to true to rerun those failed masking steps. It helps save time
     * by executing only the failed masking steps and not doing the whole masking again.
     *
     * @return the value
     */
    public Boolean getIsRerun() {
        return isRerun;
    }

    /**
     * The tablespace that should be used to create the mapping tables, DMASK objects, and other
     * temporary tables for data masking. If no tablespace is provided, the DEFAULT tablespace is
     * used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tablespace")
    private final String tablespace;

    /**
     * The tablespace that should be used to create the mapping tables, DMASK objects, and other
     * temporary tables for data masking. If no tablespace is provided, the DEFAULT tablespace is
     * used.
     *
     * @return the value
     */
    public String getTablespace() {
        return tablespace;
    }

    /**
     * Indicates if the masking process should continue on hitting an error. It provides fault
     * tolerance support and is enabled by default. In fault-tolerant mode, the masking process
     * saves the failed step and continues. You can then submit another masking request (with
     * isRerun attribute set to true) to execute only the failed steps.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isIgnoreErrorsEnabled")
    private final Boolean isIgnoreErrorsEnabled;

    /**
     * Indicates if the masking process should continue on hitting an error. It provides fault
     * tolerance support and is enabled by default. In fault-tolerant mode, the masking process
     * saves the failed step and continues. You can then submit another masking request (with
     * isRerun attribute set to true) to execute only the failed steps.
     *
     * @return the value
     */
    public Boolean getIsIgnoreErrorsEnabled() {
        return isIgnoreErrorsEnabled;
    }

    /**
     * The seed value to be used in case of Deterministic Encryption and Deterministic Substitution
     * masking formats.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("seed")
    private final String seed;

    /**
     * The seed value to be used in case of Deterministic Encryption and Deterministic Substitution
     * masking formats.
     *
     * @return the value
     */
    public String getSeed() {
        return seed;
    }

    /**
     * Indicates if the interim DMASK tables should be moved to the user-specified tablespace. As
     * interim tables can be large in size, set it to false if moving them causes performance
     * overhead during masking.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isMoveInterimTablesEnabled")
    private final Boolean isMoveInterimTablesEnabled;

    /**
     * Indicates if the interim DMASK tables should be moved to the user-specified tablespace. As
     * interim tables can be large in size, set it to false if moving them causes performance
     * overhead during masking.
     *
     * @return the value
     */
    public Boolean getIsMoveInterimTablesEnabled() {
        return isMoveInterimTablesEnabled;
    }

    /**
     * Indicates if data masking should be performed using a saved masking script. Setting this
     * attribute to true skips masking script generation and executes the masking script stored in
     * the Data Safe repository. It helps save time if there are no changes in the database tables
     * and their dependencies.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isExecuteSavedScriptEnabled")
    private final Boolean isExecuteSavedScriptEnabled;

    /**
     * Indicates if data masking should be performed using a saved masking script. Setting this
     * attribute to true skips masking script generation and executes the masking script stored in
     * the Data Safe repository. It helps save time if there are no changes in the database tables
     * and their dependencies.
     *
     * @return the value
     */
    public Boolean getIsExecuteSavedScriptEnabled() {
        return isExecuteSavedScriptEnabled;
    }

    /**
     * Indicates if the temporary tables created during a masking operation should be dropped after
     * masking. Set this attribute to false to preserve the temporary tables. Masking creates
     * temporary tables that map the original sensitive data values to mask values. These temporary
     * tables are dropped after masking if this attribute is set as true. But, in some cases, you
     * may want to preserve this information to track how masking changed your data. Note that doing
     * so compromises security. These tables must be dropped before the database is available for
     * unprivileged users. If it's not provided, the value of the isDropTempTablesEnabled attribute
     * in the MaskingPolicy resource is used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isDropTempTablesEnabled")
    private final Boolean isDropTempTablesEnabled;

    /**
     * Indicates if the temporary tables created during a masking operation should be dropped after
     * masking. Set this attribute to false to preserve the temporary tables. Masking creates
     * temporary tables that map the original sensitive data values to mask values. These temporary
     * tables are dropped after masking if this attribute is set as true. But, in some cases, you
     * may want to preserve this information to track how masking changed your data. Note that doing
     * so compromises security. These tables must be dropped before the database is available for
     * unprivileged users. If it's not provided, the value of the isDropTempTablesEnabled attribute
     * in the MaskingPolicy resource is used.
     *
     * @return the value
     */
    public Boolean getIsDropTempTablesEnabled() {
        return isDropTempTablesEnabled;
    }

    /**
     * Indicates if redo logging is enabled during a masking operation. Set this attribute to true
     * to enable redo logging. If set as false, masking disables redo logging and flashback logging
     * to purge any original unmasked data from logs. However, in certain circumstances when you
     * only want to test masking, rollback changes, and retry masking, you could enable logging and
     * use a flashback database to retrieve the original unmasked data after it has been masked. If
     * it's not provided, the value of the isRedoLoggingEnabled attribute in the MaskingPolicy
     * resource is used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isRedoLoggingEnabled")
    private final Boolean isRedoLoggingEnabled;

    /**
     * Indicates if redo logging is enabled during a masking operation. Set this attribute to true
     * to enable redo logging. If set as false, masking disables redo logging and flashback logging
     * to purge any original unmasked data from logs. However, in certain circumstances when you
     * only want to test masking, rollback changes, and retry masking, you could enable logging and
     * use a flashback database to retrieve the original unmasked data after it has been masked. If
     * it's not provided, the value of the isRedoLoggingEnabled attribute in the MaskingPolicy
     * resource is used.
     *
     * @return the value
     */
    public Boolean getIsRedoLoggingEnabled() {
        return isRedoLoggingEnabled;
    }

    /**
     * Indicates if statistics gathering is enabled. Set this attribute to false to disable
     * statistics gathering. The masking process gathers statistics on masked database tables after
     * masking completes. If it's not provided, the value of the isRefreshStatsEnabled attribute in
     * the MaskingPolicy resource is used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isRefreshStatsEnabled")
    private final Boolean isRefreshStatsEnabled;

    /**
     * Indicates if statistics gathering is enabled. Set this attribute to false to disable
     * statistics gathering. The masking process gathers statistics on masked database tables after
     * masking completes. If it's not provided, the value of the isRefreshStatsEnabled attribute in
     * the MaskingPolicy resource is used.
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
     * helps effectively use multiple CPUs and improve masking performance. Refer to the Oracle
     * Database parallel execution framework when choosing an explicit degree of parallelism.
     * https://www.oracle.com/pls/topic/lookup?ctx=dblatest&en/database/oracle/oracle-database&id=VLDBG-GUID-3E2AE088-2505-465E-A8B2-AC38813EA355
     * If it's not provided, the value of the parallelDegree attribute in the MaskingPolicy resource
     * is used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parallelDegree")
    private final String parallelDegree;

    /**
     * Specifies options to enable parallel execution when running data masking. Allowed values are
     * 'NONE' (no parallelism), 'DEFAULT' (the Oracle Database computes the optimum degree of
     * parallelism) or an integer value to be used as the degree of parallelism. Parallel execution
     * helps effectively use multiple CPUs and improve masking performance. Refer to the Oracle
     * Database parallel execution framework when choosing an explicit degree of parallelism.
     * https://www.oracle.com/pls/topic/lookup?ctx=dblatest&en/database/oracle/oracle-database&id=VLDBG-GUID-3E2AE088-2505-465E-A8B2-AC38813EA355
     * If it's not provided, the value of the parallelDegree attribute in the MaskingPolicy resource
     * is used.
     *
     * @return the value
     */
    public String getParallelDegree() {
        return parallelDegree;
    }

    /**
     * Specifies how to recompile invalid objects post data masking. Allowed values are 'SERIAL'
     * (recompile in serial), 'PARALLEL' (recompile in parallel), 'NONE' (do not recompile). If it's
     * set to PARALLEL, the value of parallelDegree attribute is used. Use the built-in UTL_RECOMP
     * package to recompile any remaining invalid objects after masking completes. If it's not
     * provided, the value of the parallelDegree attribute in the MaskingPolicy resource is used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("recompile")
    private final String recompile;

    /**
     * Specifies how to recompile invalid objects post data masking. Allowed values are 'SERIAL'
     * (recompile in serial), 'PARALLEL' (recompile in parallel), 'NONE' (do not recompile). If it's
     * set to PARALLEL, the value of parallelDegree attribute is used. Use the built-in UTL_RECOMP
     * package to recompile any remaining invalid objects after masking completes. If it's not
     * provided, the value of the parallelDegree attribute in the MaskingPolicy resource is used.
     *
     * @return the value
     */
    public String getRecompile() {
        return recompile;
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
        sb.append("MaskDataDetails(");
        sb.append("super=").append(super.toString());
        sb.append("targetId=").append(String.valueOf(this.targetId));
        sb.append(", isDecrypt=").append(String.valueOf(this.isDecrypt));
        sb.append(", isRerun=").append(String.valueOf(this.isRerun));
        sb.append(", tablespace=").append(String.valueOf(this.tablespace));
        sb.append(", isIgnoreErrorsEnabled=").append(String.valueOf(this.isIgnoreErrorsEnabled));
        sb.append(", seed=").append("<redacted>");
        sb.append(", isMoveInterimTablesEnabled=")
                .append(String.valueOf(this.isMoveInterimTablesEnabled));
        sb.append(", isExecuteSavedScriptEnabled=")
                .append(String.valueOf(this.isExecuteSavedScriptEnabled));
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
        if (!(o instanceof MaskDataDetails)) {
            return false;
        }

        MaskDataDetails other = (MaskDataDetails) o;
        return java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.isDecrypt, other.isDecrypt)
                && java.util.Objects.equals(this.isRerun, other.isRerun)
                && java.util.Objects.equals(this.tablespace, other.tablespace)
                && java.util.Objects.equals(this.isIgnoreErrorsEnabled, other.isIgnoreErrorsEnabled)
                && java.util.Objects.equals(this.seed, other.seed)
                && java.util.Objects.equals(
                        this.isMoveInterimTablesEnabled, other.isMoveInterimTablesEnabled)
                && java.util.Objects.equals(
                        this.isExecuteSavedScriptEnabled, other.isExecuteSavedScriptEnabled)
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
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.isDecrypt == null ? 43 : this.isDecrypt.hashCode());
        result = (result * PRIME) + (this.isRerun == null ? 43 : this.isRerun.hashCode());
        result = (result * PRIME) + (this.tablespace == null ? 43 : this.tablespace.hashCode());
        result =
                (result * PRIME)
                        + (this.isIgnoreErrorsEnabled == null
                                ? 43
                                : this.isIgnoreErrorsEnabled.hashCode());
        result = (result * PRIME) + (this.seed == null ? 43 : this.seed.hashCode());
        result =
                (result * PRIME)
                        + (this.isMoveInterimTablesEnabled == null
                                ? 43
                                : this.isMoveInterimTablesEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isExecuteSavedScriptEnabled == null
                                ? 43
                                : this.isExecuteSavedScriptEnabled.hashCode());
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
