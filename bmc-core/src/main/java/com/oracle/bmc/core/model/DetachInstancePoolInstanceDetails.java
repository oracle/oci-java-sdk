/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * An instance that is to be detached from an instance pool.
 *
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
    builder = DetachInstancePoolInstanceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DetachInstancePoolInstanceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isDecrementSize")
        private Boolean isDecrementSize;

        public Builder isDecrementSize(Boolean isDecrementSize) {
            this.isDecrementSize = isDecrementSize;
            this.__explicitlySet__.add("isDecrementSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAutoTerminate")
        private Boolean isAutoTerminate;

        public Builder isAutoTerminate(Boolean isAutoTerminate) {
            this.isAutoTerminate = isAutoTerminate;
            this.__explicitlySet__.add("isAutoTerminate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DetachInstancePoolInstanceDetails build() {
            DetachInstancePoolInstanceDetails __instance__ =
                    new DetachInstancePoolInstanceDetails(
                            instanceId, isDecrementSize, isAutoTerminate);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DetachInstancePoolInstanceDetails o) {
            Builder copiedBuilder =
                    instanceId(o.getInstanceId())
                            .isDecrementSize(o.getIsDecrementSize())
                            .isAutoTerminate(o.getIsAutoTerminate());

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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    String instanceId;

    /**
     * Whether to decrease the size of the instance pool when the instance is detached. If {@code true}, the
     * pool size is decreased. If {@code false}, the pool will provision a new, replacement instance
     * using the pool's instance configuration as a template. Default is {@code true}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDecrementSize")
    Boolean isDecrementSize;

    /**
     * Whether to permanently terminate (delete) the instance and its attached boot volume
     * when detaching it from the instance pool. Default is {@code false}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoTerminate")
    Boolean isAutoTerminate;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
