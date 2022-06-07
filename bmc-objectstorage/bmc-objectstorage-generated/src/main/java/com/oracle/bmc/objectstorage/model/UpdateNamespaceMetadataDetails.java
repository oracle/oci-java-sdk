/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * UpdateNamespaceMetadataDetails is used to update the NamespaceMetadata. To update NamespaceMetadata, a user
 * must have OBJECTSTORAGE_NAMESPACE_UPDATE permission.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateNamespaceMetadataDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateNamespaceMetadataDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"defaultS3CompartmentId", "defaultSwiftCompartmentId"})
    public UpdateNamespaceMetadataDetails(
            String defaultS3CompartmentId, String defaultSwiftCompartmentId) {
        super();
        this.defaultS3CompartmentId = defaultS3CompartmentId;
        this.defaultSwiftCompartmentId = defaultSwiftCompartmentId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The updated compartment id for use by an S3 client, if this field is set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultS3CompartmentId")
    private final String defaultS3CompartmentId;

    public String getDefaultS3CompartmentId() {
        return defaultS3CompartmentId;
    }

    /**
     * The updated compartment id for use by a Swift client, if this field is set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultSwiftCompartmentId")
    private final String defaultSwiftCompartmentId;

    public String getDefaultSwiftCompartmentId() {
        return defaultSwiftCompartmentId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateNamespaceMetadataDetails(");
        sb.append("defaultS3CompartmentId=").append(String.valueOf(this.defaultS3CompartmentId));
        sb.append(", defaultSwiftCompartmentId=")
                .append(String.valueOf(this.defaultSwiftCompartmentId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateNamespaceMetadataDetails)) {
            return false;
        }

        UpdateNamespaceMetadataDetails other = (UpdateNamespaceMetadataDetails) o;
        return java.util.Objects.equals(this.defaultS3CompartmentId, other.defaultS3CompartmentId)
                && java.util.Objects.equals(
                        this.defaultSwiftCompartmentId, other.defaultSwiftCompartmentId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.defaultS3CompartmentId == null
                                ? 43
                                : this.defaultS3CompartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultSwiftCompartmentId == null
                                ? 43
                                : this.defaultSwiftCompartmentId.hashCode());
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
