/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * The details of a replication source bucket that replicates to a target destination bucket. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ReplicationSource.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ReplicationSource
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"policyName", "sourceRegionName", "sourceBucketName"})
    public ReplicationSource(String policyName, String sourceRegionName, String sourceBucketName) {
        super();
        this.policyName = policyName;
        this.sourceRegionName = sourceRegionName;
        this.sourceBucketName = sourceBucketName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("policyName")
        private String policyName;

        /**
         * The name of the policy.
         *
         * @param policyName the value to set
         * @return this builder
         */
        public Builder policyName(String policyName) {
            this.policyName = policyName;
            this.__explicitlySet__.add("policyName");
            return this;
        }
        /** The source region replicating data from, for example "us-ashburn-1". */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceRegionName")
        private String sourceRegionName;

        /**
         * The source region replicating data from, for example "us-ashburn-1".
         *
         * @param sourceRegionName the value to set
         * @return this builder
         */
        public Builder sourceRegionName(String sourceRegionName) {
            this.sourceRegionName = sourceRegionName;
            this.__explicitlySet__.add("sourceRegionName");
            return this;
        }
        /** The source bucket replicating data from. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceBucketName")
        private String sourceBucketName;

        /**
         * The source bucket replicating data from.
         *
         * @param sourceBucketName the value to set
         * @return this builder
         */
        public Builder sourceBucketName(String sourceBucketName) {
            this.sourceBucketName = sourceBucketName;
            this.__explicitlySet__.add("sourceBucketName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ReplicationSource build() {
            ReplicationSource model =
                    new ReplicationSource(
                            this.policyName, this.sourceRegionName, this.sourceBucketName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReplicationSource model) {
            if (model.wasPropertyExplicitlySet("policyName")) {
                this.policyName(model.getPolicyName());
            }
            if (model.wasPropertyExplicitlySet("sourceRegionName")) {
                this.sourceRegionName(model.getSourceRegionName());
            }
            if (model.wasPropertyExplicitlySet("sourceBucketName")) {
                this.sourceBucketName(model.getSourceBucketName());
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

    /** The name of the policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("policyName")
    private final String policyName;

    /**
     * The name of the policy.
     *
     * @return the value
     */
    public String getPolicyName() {
        return policyName;
    }

    /** The source region replicating data from, for example "us-ashburn-1". */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceRegionName")
    private final String sourceRegionName;

    /**
     * The source region replicating data from, for example "us-ashburn-1".
     *
     * @return the value
     */
    public String getSourceRegionName() {
        return sourceRegionName;
    }

    /** The source bucket replicating data from. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceBucketName")
    private final String sourceBucketName;

    /**
     * The source bucket replicating data from.
     *
     * @return the value
     */
    public String getSourceBucketName() {
        return sourceBucketName;
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
        sb.append("ReplicationSource(");
        sb.append("super=").append(super.toString());
        sb.append("policyName=").append(String.valueOf(this.policyName));
        sb.append(", sourceRegionName=").append(String.valueOf(this.sourceRegionName));
        sb.append(", sourceBucketName=").append(String.valueOf(this.sourceBucketName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReplicationSource)) {
            return false;
        }

        ReplicationSource other = (ReplicationSource) o;
        return java.util.Objects.equals(this.policyName, other.policyName)
                && java.util.Objects.equals(this.sourceRegionName, other.sourceRegionName)
                && java.util.Objects.equals(this.sourceBucketName, other.sourceBucketName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.policyName == null ? 43 : this.policyName.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceRegionName == null ? 43 : this.sourceRegionName.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceBucketName == null ? 43 : this.sourceBucketName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
