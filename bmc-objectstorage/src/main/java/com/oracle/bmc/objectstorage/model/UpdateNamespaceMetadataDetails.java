/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * An UpdateNamespaceMetadataDetails is used for update NamespaceMetadata. To be able to upate the NamespaceMetadata, a user
 *  must have NAMESPACE_UPDATE permission.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateNamespaceMetadataDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class UpdateNamespaceMetadataDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
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

        public UpdateNamespaceMetadataDetails build() {
            UpdateNamespaceMetadataDetails __instance__ =
                    new UpdateNamespaceMetadataDetails(
                            defaultS3CompartmentId, defaultSwiftCompartmentId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateNamespaceMetadataDetails o) {
            Builder copiedBuilder =
                    defaultS3CompartmentId(o.getDefaultS3CompartmentId())
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
     * The update compartment id for an S3 client if this field is set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultS3CompartmentId")
    String defaultS3CompartmentId;

    /**
     * The update compartment id for a Swift client if this field is set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultSwiftCompartmentId")
    String defaultSwiftCompartmentId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
