/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * UpdateNamespaceMetadataDetails is used to update the NamespaceMetadata. To update NamespaceMetadata, a user
 * must have NAMESPACE_UPDATE permission.
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
     * The updated compartment id for use by an S3 client, if this field is set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultS3CompartmentId")
    String defaultS3CompartmentId;

    /**
     * The updated compartment id for use by a Swift client, if this field is set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultSwiftCompartmentId")
    String defaultSwiftCompartmentId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
