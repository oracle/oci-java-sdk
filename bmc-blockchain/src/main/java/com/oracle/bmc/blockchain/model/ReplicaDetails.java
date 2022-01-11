/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.blockchain.model;

/**
 * Number of replicas of service components like Rest Proxy, CA and Console
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191010")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ReplicaDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ReplicaDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("proxyCount")
        private Integer proxyCount;

        public Builder proxyCount(Integer proxyCount) {
            this.proxyCount = proxyCount;
            this.__explicitlySet__.add("proxyCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("caCount")
        private Integer caCount;

        public Builder caCount(Integer caCount) {
            this.caCount = caCount;
            this.__explicitlySet__.add("caCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("consoleCount")
        private Integer consoleCount;

        public Builder consoleCount(Integer consoleCount) {
            this.consoleCount = consoleCount;
            this.__explicitlySet__.add("consoleCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ReplicaDetails build() {
            ReplicaDetails __instance__ = new ReplicaDetails(proxyCount, caCount, consoleCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReplicaDetails o) {
            Builder copiedBuilder =
                    proxyCount(o.getProxyCount())
                            .caCount(o.getCaCount())
                            .consoleCount(o.getConsoleCount());

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
     * Number of REST proxy replicas
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("proxyCount")
    Integer proxyCount;

    /**
     * Number of CA replicas
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("caCount")
    Integer caCount;

    /**
     * Number of console replicas
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("consoleCount")
    Integer consoleCount;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
