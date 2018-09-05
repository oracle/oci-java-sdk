/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * A NamespaceMetadta is a map for storing namespace and defaultS3CompartmentId, defaultSwiftCompartmentId.
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
    builder = NamespaceMetadata.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class NamespaceMetadata {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultS3CompartmentId")
        private String defaultS3CompartmentId;

        public Builder defaultS3CompartmentId(String defaultS3CompartmentId) {
            this.defaultS3CompartmentId = defaultS3CompartmentId;
            this.__explicitlySet__.add("defaultS3CompartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultSwiftCompartmentId")
        private String defaultSwiftCompartmentId;

        public Builder defaultSwiftCompartmentId(String defaultSwiftCompartmentId) {
            this.defaultSwiftCompartmentId = defaultSwiftCompartmentId;
            this.__explicitlySet__.add("defaultSwiftCompartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NamespaceMetadata build() {
            NamespaceMetadata __instance__ =
                    new NamespaceMetadata(
                            namespace, defaultS3CompartmentId, defaultSwiftCompartmentId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NamespaceMetadata o) {
            Builder copiedBuilder =
                    namespace(o.getNamespace())
                            .defaultS3CompartmentId(o.getDefaultS3CompartmentId())
                            .defaultSwiftCompartmentId(o.getDefaultSwiftCompartmentId());

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
     * The namespace to which the metadata belongs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    String namespace;

    /**
     * The default compartment ID for an S3 client.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultS3CompartmentId")
    String defaultS3CompartmentId;

    /**
     * The default compartment ID for a Swift client.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultSwiftCompartmentId")
    String defaultSwiftCompartmentId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
