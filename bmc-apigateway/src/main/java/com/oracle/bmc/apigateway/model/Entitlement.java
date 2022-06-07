/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * A usage plan entitlement, comprising of rate limits, quotas and the deployments they are applied to.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Entitlement.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Entitlement {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "description", "rateLimit", "quota", "targets"})
    public Entitlement(
            String name,
            String description,
            RateLimit rateLimit,
            Quota quota,
            java.util.List<EntitlementTarget> targets) {
        super();
        this.name = name;
        this.description = description;
        this.rateLimit = rateLimit;
        this.quota = quota;
        this.targets = targets;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rateLimit")
        private RateLimit rateLimit;

        public Builder rateLimit(RateLimit rateLimit) {
            this.rateLimit = rateLimit;
            this.__explicitlySet__.add("rateLimit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("quota")
        private Quota quota;

        public Builder quota(Quota quota) {
            this.quota = quota;
            this.__explicitlySet__.add("quota");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targets")
        private java.util.List<EntitlementTarget> targets;

        public Builder targets(java.util.List<EntitlementTarget> targets) {
            this.targets = targets;
            this.__explicitlySet__.add("targets");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Entitlement build() {
            Entitlement __instance__ =
                    new Entitlement(name, description, rateLimit, quota, targets);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Entitlement o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .description(o.getDescription())
                            .rateLimit(o.getRateLimit())
                            .quota(o.getQuota())
                            .targets(o.getTargets());

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
     * An entitlement name, unique within a usage plan.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    public String getName() {
        return name;
    }

    /**
     * A user-friendly description. To provide some insight about the resource.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    public String getDescription() {
        return description;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("rateLimit")
    private final RateLimit rateLimit;

    public RateLimit getRateLimit() {
        return rateLimit;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("quota")
    private final Quota quota;

    public Quota getQuota() {
        return quota;
    }

    /**
     * A collection of targeted deployments that the entitlement will be applied to.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targets")
    private final java.util.List<EntitlementTarget> targets;

    public java.util.List<EntitlementTarget> getTargets() {
        return targets;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Entitlement(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", rateLimit=").append(String.valueOf(this.rateLimit));
        sb.append(", quota=").append(String.valueOf(this.quota));
        sb.append(", targets=").append(String.valueOf(this.targets));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Entitlement)) {
            return false;
        }

        Entitlement other = (Entitlement) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.rateLimit, other.rateLimit)
                && java.util.Objects.equals(this.quota, other.quota)
                && java.util.Objects.equals(this.targets, other.targets)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.rateLimit == null ? 43 : this.rateLimit.hashCode());
        result = (result * PRIME) + (this.quota == null ? 43 : this.quota.hashCode());
        result = (result * PRIME) + (this.targets == null ? 43 : this.targets.hashCode());
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
