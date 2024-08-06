/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Attributes to generate load pipeline script. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = GenerateLoadPipelineScriptDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GenerateLoadPipelineScriptDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "targetBucketName",
        "targetBucketNamespace",
        "targetBucketRegion",
        "intervalMinutes"
    })
    public GenerateLoadPipelineScriptDetails(
            String targetBucketName,
            String targetBucketNamespace,
            String targetBucketRegion,
            Integer intervalMinutes) {
        super();
        this.targetBucketName = targetBucketName;
        this.targetBucketNamespace = targetBucketNamespace;
        this.targetBucketRegion = targetBucketRegion;
        this.intervalMinutes = intervalMinutes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the bucket where data will be exported. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetBucketName")
        private String targetBucketName;

        /**
         * The name of the bucket where data will be exported.
         *
         * @param targetBucketName the value to set
         * @return this builder
         */
        public Builder targetBucketName(String targetBucketName) {
            this.targetBucketName = targetBucketName;
            this.__explicitlySet__.add("targetBucketName");
            return this;
        }
        /** The namespace of the bucket where data will be exported. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetBucketNamespace")
        private String targetBucketNamespace;

        /**
         * The namespace of the bucket where data will be exported.
         *
         * @param targetBucketNamespace the value to set
         * @return this builder
         */
        public Builder targetBucketNamespace(String targetBucketNamespace) {
            this.targetBucketNamespace = targetBucketNamespace;
            this.__explicitlySet__.add("targetBucketNamespace");
            return this;
        }
        /** The id of the region of the target bucket. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetBucketRegion")
        private String targetBucketRegion;

        /**
         * The id of the region of the target bucket.
         *
         * @param targetBucketRegion the value to set
         * @return this builder
         */
        public Builder targetBucketRegion(String targetBucketRegion) {
            this.targetBucketRegion = targetBucketRegion;
            this.__explicitlySet__.add("targetBucketRegion");
            return this;
        }
        /**
         * The time internal in minutes between consecutive executions of scheduled pipeline job.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("intervalMinutes")
        private Integer intervalMinutes;

        /**
         * The time internal in minutes between consecutive executions of scheduled pipeline job.
         *
         * @param intervalMinutes the value to set
         * @return this builder
         */
        public Builder intervalMinutes(Integer intervalMinutes) {
            this.intervalMinutes = intervalMinutes;
            this.__explicitlySet__.add("intervalMinutes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GenerateLoadPipelineScriptDetails build() {
            GenerateLoadPipelineScriptDetails model =
                    new GenerateLoadPipelineScriptDetails(
                            this.targetBucketName,
                            this.targetBucketNamespace,
                            this.targetBucketRegion,
                            this.intervalMinutes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GenerateLoadPipelineScriptDetails model) {
            if (model.wasPropertyExplicitlySet("targetBucketName")) {
                this.targetBucketName(model.getTargetBucketName());
            }
            if (model.wasPropertyExplicitlySet("targetBucketNamespace")) {
                this.targetBucketNamespace(model.getTargetBucketNamespace());
            }
            if (model.wasPropertyExplicitlySet("targetBucketRegion")) {
                this.targetBucketRegion(model.getTargetBucketRegion());
            }
            if (model.wasPropertyExplicitlySet("intervalMinutes")) {
                this.intervalMinutes(model.getIntervalMinutes());
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

    /** The name of the bucket where data will be exported. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetBucketName")
    private final String targetBucketName;

    /**
     * The name of the bucket where data will be exported.
     *
     * @return the value
     */
    public String getTargetBucketName() {
        return targetBucketName;
    }

    /** The namespace of the bucket where data will be exported. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetBucketNamespace")
    private final String targetBucketNamespace;

    /**
     * The namespace of the bucket where data will be exported.
     *
     * @return the value
     */
    public String getTargetBucketNamespace() {
        return targetBucketNamespace;
    }

    /** The id of the region of the target bucket. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetBucketRegion")
    private final String targetBucketRegion;

    /**
     * The id of the region of the target bucket.
     *
     * @return the value
     */
    public String getTargetBucketRegion() {
        return targetBucketRegion;
    }

    /** The time internal in minutes between consecutive executions of scheduled pipeline job. */
    @com.fasterxml.jackson.annotation.JsonProperty("intervalMinutes")
    private final Integer intervalMinutes;

    /**
     * The time internal in minutes between consecutive executions of scheduled pipeline job.
     *
     * @return the value
     */
    public Integer getIntervalMinutes() {
        return intervalMinutes;
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
        sb.append("GenerateLoadPipelineScriptDetails(");
        sb.append("super=").append(super.toString());
        sb.append("targetBucketName=").append(String.valueOf(this.targetBucketName));
        sb.append(", targetBucketNamespace=").append(String.valueOf(this.targetBucketNamespace));
        sb.append(", targetBucketRegion=").append(String.valueOf(this.targetBucketRegion));
        sb.append(", intervalMinutes=").append(String.valueOf(this.intervalMinutes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GenerateLoadPipelineScriptDetails)) {
            return false;
        }

        GenerateLoadPipelineScriptDetails other = (GenerateLoadPipelineScriptDetails) o;
        return java.util.Objects.equals(this.targetBucketName, other.targetBucketName)
                && java.util.Objects.equals(this.targetBucketNamespace, other.targetBucketNamespace)
                && java.util.Objects.equals(this.targetBucketRegion, other.targetBucketRegion)
                && java.util.Objects.equals(this.intervalMinutes, other.intervalMinutes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.targetBucketName == null ? 43 : this.targetBucketName.hashCode());
        result =
                (result * PRIME)
                        + (this.targetBucketNamespace == null
                                ? 43
                                : this.targetBucketNamespace.hashCode());
        result =
                (result * PRIME)
                        + (this.targetBucketRegion == null
                                ? 43
                                : this.targetBucketRegion.hashCode());
        result =
                (result * PRIME)
                        + (this.intervalMinutes == null ? 43 : this.intervalMinutes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
