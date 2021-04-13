/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.sch.model;

/**
 * The function task. Batch input can be limited by either size or time. The first limit reached determines the boundary of the batch.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200909")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FunctionTaskDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "kind"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class FunctionTaskDetails extends TaskDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("functionId")
        private String functionId;

        public Builder functionId(String functionId) {
            this.functionId = functionId;
            this.__explicitlySet__.add("functionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("batchSizeInKbs")
        private Integer batchSizeInKbs;

        public Builder batchSizeInKbs(Integer batchSizeInKbs) {
            this.batchSizeInKbs = batchSizeInKbs;
            this.__explicitlySet__.add("batchSizeInKbs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("batchTimeInSec")
        private Integer batchTimeInSec;

        public Builder batchTimeInSec(Integer batchTimeInSec) {
            this.batchTimeInSec = batchTimeInSec;
            this.__explicitlySet__.add("batchTimeInSec");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FunctionTaskDetails build() {
            FunctionTaskDetails __instance__ =
                    new FunctionTaskDetails(functionId, batchSizeInKbs, batchTimeInSec);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FunctionTaskDetails o) {
            Builder copiedBuilder =
                    functionId(o.getFunctionId())
                            .batchSizeInKbs(o.getBatchSizeInKbs())
                            .batchTimeInSec(o.getBatchTimeInSec());

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

    @Deprecated
    public FunctionTaskDetails(String functionId, Integer batchSizeInKbs, Integer batchTimeInSec) {
        super();
        this.functionId = functionId;
        this.batchSizeInKbs = batchSizeInKbs;
        this.batchTimeInSec = batchTimeInSec;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the function to be used as a task.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("functionId")
    String functionId;

    /**
     * Size limit (kilobytes) for batch sent to invoke the function.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("batchSizeInKbs")
    Integer batchSizeInKbs;

    /**
     * Time limit (seconds) for batch sent to invoke the function.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("batchTimeInSec")
    Integer batchTimeInSec;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
