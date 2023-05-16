/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The pipeline log configuration details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PipelineLogConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PipelineLogConfigurationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "enableLogging",
        "enableAutoLogCreation",
        "logGroupId",
        "logId"
    })
    public PipelineLogConfigurationDetails(
            Boolean enableLogging, Boolean enableAutoLogCreation, String logGroupId, String logId) {
        super();
        this.enableLogging = enableLogging;
        this.enableAutoLogCreation = enableAutoLogCreation;
        this.logGroupId = logGroupId;
        this.logId = logId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** If customer logging is enabled for pipeline. */
        @com.fasterxml.jackson.annotation.JsonProperty("enableLogging")
        private Boolean enableLogging;

        /**
         * If customer logging is enabled for pipeline.
         *
         * @param enableLogging the value to set
         * @return this builder
         */
        public Builder enableLogging(Boolean enableLogging) {
            this.enableLogging = enableLogging;
            this.__explicitlySet__.add("enableLogging");
            return this;
        }
        /** If automatic on-behalf-of log object creation is enabled for pipeline runs. */
        @com.fasterxml.jackson.annotation.JsonProperty("enableAutoLogCreation")
        private Boolean enableAutoLogCreation;

        /**
         * If automatic on-behalf-of log object creation is enabled for pipeline runs.
         *
         * @param enableAutoLogCreation the value to set
         * @return this builder
         */
        public Builder enableAutoLogCreation(Boolean enableAutoLogCreation) {
            this.enableAutoLogCreation = enableAutoLogCreation;
            this.__explicitlySet__.add("enableAutoLogCreation");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the log group.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("logGroupId")
        private String logGroupId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the log group.
         *
         * @param logGroupId the value to set
         * @return this builder
         */
        public Builder logGroupId(String logGroupId) {
            this.logGroupId = logGroupId;
            this.__explicitlySet__.add("logGroupId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the log.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("logId")
        private String logId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the log.
         *
         * @param logId the value to set
         * @return this builder
         */
        public Builder logId(String logId) {
            this.logId = logId;
            this.__explicitlySet__.add("logId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PipelineLogConfigurationDetails build() {
            PipelineLogConfigurationDetails model =
                    new PipelineLogConfigurationDetails(
                            this.enableLogging,
                            this.enableAutoLogCreation,
                            this.logGroupId,
                            this.logId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PipelineLogConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("enableLogging")) {
                this.enableLogging(model.getEnableLogging());
            }
            if (model.wasPropertyExplicitlySet("enableAutoLogCreation")) {
                this.enableAutoLogCreation(model.getEnableAutoLogCreation());
            }
            if (model.wasPropertyExplicitlySet("logGroupId")) {
                this.logGroupId(model.getLogGroupId());
            }
            if (model.wasPropertyExplicitlySet("logId")) {
                this.logId(model.getLogId());
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

    /** If customer logging is enabled for pipeline. */
    @com.fasterxml.jackson.annotation.JsonProperty("enableLogging")
    private final Boolean enableLogging;

    /**
     * If customer logging is enabled for pipeline.
     *
     * @return the value
     */
    public Boolean getEnableLogging() {
        return enableLogging;
    }

    /** If automatic on-behalf-of log object creation is enabled for pipeline runs. */
    @com.fasterxml.jackson.annotation.JsonProperty("enableAutoLogCreation")
    private final Boolean enableAutoLogCreation;

    /**
     * If automatic on-behalf-of log object creation is enabled for pipeline runs.
     *
     * @return the value
     */
    public Boolean getEnableAutoLogCreation() {
        return enableAutoLogCreation;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the log group.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logGroupId")
    private final String logGroupId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the log group.
     *
     * @return the value
     */
    public String getLogGroupId() {
        return logGroupId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the log.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logId")
    private final String logId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the log.
     *
     * @return the value
     */
    public String getLogId() {
        return logId;
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
        sb.append("PipelineLogConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("enableLogging=").append(String.valueOf(this.enableLogging));
        sb.append(", enableAutoLogCreation=").append(String.valueOf(this.enableAutoLogCreation));
        sb.append(", logGroupId=").append(String.valueOf(this.logGroupId));
        sb.append(", logId=").append(String.valueOf(this.logId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PipelineLogConfigurationDetails)) {
            return false;
        }

        PipelineLogConfigurationDetails other = (PipelineLogConfigurationDetails) o;
        return java.util.Objects.equals(this.enableLogging, other.enableLogging)
                && java.util.Objects.equals(this.enableAutoLogCreation, other.enableAutoLogCreation)
                && java.util.Objects.equals(this.logGroupId, other.logGroupId)
                && java.util.Objects.equals(this.logId, other.logId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.enableLogging == null ? 43 : this.enableLogging.hashCode());
        result =
                (result * PRIME)
                        + (this.enableAutoLogCreation == null
                                ? 43
                                : this.enableAutoLogCreation.hashCode());
        result = (result * PRIME) + (this.logGroupId == null ? 43 : this.logGroupId.hashCode());
        result = (result * PRIME) + (this.logId == null ? 43 : this.logId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
