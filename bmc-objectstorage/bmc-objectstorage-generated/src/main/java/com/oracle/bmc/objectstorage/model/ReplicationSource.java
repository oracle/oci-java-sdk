/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * The details of a replication source bucket that replicates to a target destination bucket.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ReplicationSource.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ReplicationSource {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("policyName")
        private String policyName;

        public Builder policyName(String policyName) {
            this.policyName = policyName;
            this.__explicitlySet__.add("policyName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceRegionName")
        private String sourceRegionName;

        public Builder sourceRegionName(String sourceRegionName) {
            this.sourceRegionName = sourceRegionName;
            this.__explicitlySet__.add("sourceRegionName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceBucketName")
        private String sourceBucketName;

        public Builder sourceBucketName(String sourceBucketName) {
            this.sourceBucketName = sourceBucketName;
            this.__explicitlySet__.add("sourceBucketName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ReplicationSource build() {
            ReplicationSource __instance__ =
                    new ReplicationSource(policyName, sourceRegionName, sourceBucketName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReplicationSource o) {
            Builder copiedBuilder =
                    policyName(o.getPolicyName())
                            .sourceRegionName(o.getSourceRegionName())
                            .sourceBucketName(o.getSourceBucketName());

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
     * The name of the policy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("policyName")
    String policyName;

    /**
     * The source region replicating data from, for example "us-ashburn-1".
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceRegionName")
    String sourceRegionName;

    /**
     * The source bucket replicating data from.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceBucketName")
    String sourceBucketName;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
