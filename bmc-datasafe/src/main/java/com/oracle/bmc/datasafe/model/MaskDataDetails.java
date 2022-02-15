/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details to mask data.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MaskDataDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class MaskDataDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isDecrypt")
        private Boolean isDecrypt;

        public Builder isDecrypt(Boolean isDecrypt) {
            this.isDecrypt = isDecrypt;
            this.__explicitlySet__.add("isDecrypt");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isRerun")
        private Boolean isRerun;

        public Builder isRerun(Boolean isRerun) {
            this.isRerun = isRerun;
            this.__explicitlySet__.add("isRerun");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tablespace")
        private String tablespace;

        public Builder tablespace(String tablespace) {
            this.tablespace = tablespace;
            this.__explicitlySet__.add("tablespace");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isIgnoreErrorsEnabled")
        private Boolean isIgnoreErrorsEnabled;

        public Builder isIgnoreErrorsEnabled(Boolean isIgnoreErrorsEnabled) {
            this.isIgnoreErrorsEnabled = isIgnoreErrorsEnabled;
            this.__explicitlySet__.add("isIgnoreErrorsEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("seed")
        private String seed;

        public Builder seed(String seed) {
            this.seed = seed;
            this.__explicitlySet__.add("seed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isMoveInterimTablesEnabled")
        private Boolean isMoveInterimTablesEnabled;

        public Builder isMoveInterimTablesEnabled(Boolean isMoveInterimTablesEnabled) {
            this.isMoveInterimTablesEnabled = isMoveInterimTablesEnabled;
            this.__explicitlySet__.add("isMoveInterimTablesEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isExecuteSavedScriptEnabled")
        private Boolean isExecuteSavedScriptEnabled;

        public Builder isExecuteSavedScriptEnabled(Boolean isExecuteSavedScriptEnabled) {
            this.isExecuteSavedScriptEnabled = isExecuteSavedScriptEnabled;
            this.__explicitlySet__.add("isExecuteSavedScriptEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MaskDataDetails build() {
            MaskDataDetails __instance__ =
                    new MaskDataDetails(
                            targetId,
                            isDecrypt,
                            isRerun,
                            tablespace,
                            isIgnoreErrorsEnabled,
                            seed,
                            isMoveInterimTablesEnabled,
                            isExecuteSavedScriptEnabled);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MaskDataDetails o) {
            Builder copiedBuilder =
                    targetId(o.getTargetId())
                            .isDecrypt(o.getIsDecrypt())
                            .isRerun(o.getIsRerun())
                            .tablespace(o.getTablespace())
                            .isIgnoreErrorsEnabled(o.getIsIgnoreErrorsEnabled())
                            .seed(o.getSeed())
                            .isMoveInterimTablesEnabled(o.getIsMoveInterimTablesEnabled())
                            .isExecuteSavedScriptEnabled(o.getIsExecuteSavedScriptEnabled());

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
     * The OCID of the target database to be masked. If it's not provided, the value of the
     * targetId attribute in the MaskingPolicy resource is used. The OCID of the target
     * database to be masked. If it's not provided, the value of the targetId attribute in
     * the MaskingPolicy resource is used.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    String targetId;

    /**
     * Indicates if the masking request is to decrypt the data values previously encrypted using Deterministic Encryption. Note that, to
     * correctly decrypt the encrypted data values, it requires the same seed value that was provided to encrypt those data values.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDecrypt")
    Boolean isDecrypt;

    /**
     * Indicates if the masking request is to rerun the previously failed masking steps. If a masking request is submitted with the
     * isIgnoreErrorsEnabled attribute set to true, the masking process tracks the failed masking steps. Another masking request can be
     * submitted with the isRun attribute set to true to rerun those failed masking steps. It helps save time by executing only the failed
     * masking steps and not doing the whole masking again.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRerun")
    Boolean isRerun;

    /**
     * The tablespace that should be used to create the mapping tables, DMASK objects, and other temporary tables for data masking.
     * If no tablespace is provided, the DEFAULT tablespace is used.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tablespace")
    String tablespace;

    /**
     * Indicates if the masking process should continue on hitting an error. It provides fault tolerance support and is enabled by
     * default. In fault-tolerant mode, the masking process saves the failed step and continues. You can then submit another masking
     * request (with isRerun attribute set to true) to execute only the failed steps.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isIgnoreErrorsEnabled")
    Boolean isIgnoreErrorsEnabled;

    /**
     * The seed value to be used in case of Deterministic Encryption and Deterministic Substitution masking formats.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("seed")
    String seed;

    /**
     * Indicates if the interim DMASK tables should be moved to the user-specified tablespace. As interim tables can be large in size,
     * set it to false if moving them causes performance overhead during masking.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMoveInterimTablesEnabled")
    Boolean isMoveInterimTablesEnabled;

    /**
     * Indicates if data masking should be performed using a saved masking script. Setting this attribute to true skips masking script
     * generation and executes the masking script stored in the Data Safe repository. It helps save time if there are no changes in
     * the database tables and their dependencies.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isExecuteSavedScriptEnabled")
    Boolean isExecuteSavedScriptEnabled;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
