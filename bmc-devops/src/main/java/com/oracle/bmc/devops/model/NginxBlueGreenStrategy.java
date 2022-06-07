/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies the NGINX blue green release strategy.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = NginxBlueGreenStrategy.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "strategyType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class NginxBlueGreenStrategy extends OkeBlueGreenStrategy {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("namespaceA")
        private String namespaceA;

        public Builder namespaceA(String namespaceA) {
            this.namespaceA = namespaceA;
            this.__explicitlySet__.add("namespaceA");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("namespaceB")
        private String namespaceB;

        public Builder namespaceB(String namespaceB) {
            this.namespaceB = namespaceB;
            this.__explicitlySet__.add("namespaceB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ingressName")
        private String ingressName;

        public Builder ingressName(String ingressName) {
            this.ingressName = ingressName;
            this.__explicitlySet__.add("ingressName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NginxBlueGreenStrategy build() {
            NginxBlueGreenStrategy __instance__ =
                    new NginxBlueGreenStrategy(namespaceA, namespaceB, ingressName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NginxBlueGreenStrategy o) {
            Builder copiedBuilder =
                    namespaceA(o.getNamespaceA())
                            .namespaceB(o.getNamespaceB())
                            .ingressName(o.getIngressName());

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

    @Deprecated
    public NginxBlueGreenStrategy(String namespaceA, String namespaceB, String ingressName) {
        super();
        this.namespaceA = namespaceA;
        this.namespaceB = namespaceB;
        this.ingressName = ingressName;
    }

    /**
     * Namespace A for deployment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespaceA")
    private final String namespaceA;

    public String getNamespaceA() {
        return namespaceA;
    }

    /**
     * Namespace B for deployment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespaceB")
    private final String namespaceB;

    public String getNamespaceB() {
        return namespaceB;
    }

    /**
     * Name of the Ingress resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ingressName")
    private final String ingressName;

    public String getIngressName() {
        return ingressName;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("NginxBlueGreenStrategy(");
        sb.append("super=").append(super.toString());
        sb.append(", namespaceA=").append(String.valueOf(this.namespaceA));
        sb.append(", namespaceB=").append(String.valueOf(this.namespaceB));
        sb.append(", ingressName=").append(String.valueOf(this.ingressName));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NginxBlueGreenStrategy)) {
            return false;
        }

        NginxBlueGreenStrategy other = (NginxBlueGreenStrategy) o;
        return java.util.Objects.equals(this.namespaceA, other.namespaceA)
                && java.util.Objects.equals(this.namespaceB, other.namespaceB)
                && java.util.Objects.equals(this.ingressName, other.ingressName)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.namespaceA == null ? 43 : this.namespaceA.hashCode());
        result = (result * PRIME) + (this.namespaceB == null ? 43 : this.namespaceB.hashCode());
        result = (result * PRIME) + (this.ingressName == null ? 43 : this.ingressName.hashCode());
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
