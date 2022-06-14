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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ReplicaDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ReplicaDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"proxyCount", "caCount", "consoleCount"})
    public ReplicaDetails(Integer proxyCount, Integer caCount, Integer consoleCount) {
        super();
        this.proxyCount = proxyCount;
        this.caCount = caCount;
        this.consoleCount = consoleCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Number of REST proxy replicas
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("proxyCount")
        private Integer proxyCount;

        /**
         * Number of REST proxy replicas
         * @param proxyCount the value to set
         * @return this builder
         **/
        public Builder proxyCount(Integer proxyCount) {
            this.proxyCount = proxyCount;
            this.__explicitlySet__.add("proxyCount");
            return this;
        }
        /**
         * Number of CA replicas
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("caCount")
        private Integer caCount;

        /**
         * Number of CA replicas
         * @param caCount the value to set
         * @return this builder
         **/
        public Builder caCount(Integer caCount) {
            this.caCount = caCount;
            this.__explicitlySet__.add("caCount");
            return this;
        }
        /**
         * Number of console replicas
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("consoleCount")
        private Integer consoleCount;

        /**
         * Number of console replicas
         * @param consoleCount the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Number of REST proxy replicas
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("proxyCount")
    private final Integer proxyCount;

    /**
     * Number of REST proxy replicas
     * @return the value
     **/
    public Integer getProxyCount() {
        return proxyCount;
    }

    /**
     * Number of CA replicas
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("caCount")
    private final Integer caCount;

    /**
     * Number of CA replicas
     * @return the value
     **/
    public Integer getCaCount() {
        return caCount;
    }

    /**
     * Number of console replicas
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("consoleCount")
    private final Integer consoleCount;

    /**
     * Number of console replicas
     * @return the value
     **/
    public Integer getConsoleCount() {
        return consoleCount;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ReplicaDetails(");
        sb.append("proxyCount=").append(String.valueOf(this.proxyCount));
        sb.append(", caCount=").append(String.valueOf(this.caCount));
        sb.append(", consoleCount=").append(String.valueOf(this.consoleCount));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReplicaDetails)) {
            return false;
        }

        ReplicaDetails other = (ReplicaDetails) o;
        return java.util.Objects.equals(this.proxyCount, other.proxyCount)
                && java.util.Objects.equals(this.caCount, other.caCount)
                && java.util.Objects.equals(this.consoleCount, other.consoleCount)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.proxyCount == null ? 43 : this.proxyCount.hashCode());
        result = (result * PRIME) + (this.caCount == null ? 43 : this.caCount.hashCode());
        result = (result * PRIME) + (this.consoleCount == null ? 43 : this.consoleCount.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
