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
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = NginxBlueGreenStrategy.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "strategyType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class NginxBlueGreenStrategy extends OkeBlueGreenStrategy {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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
    String namespaceA;

    /**
     * Namespace B for deployment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespaceB")
    String namespaceB;

    /**
     * Name of the Ingress resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ingressName")
    String ingressName;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
