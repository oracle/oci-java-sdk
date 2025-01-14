/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Details to create a 'GI' type Exadata Fleet Update Collection. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateGiFsuCollectionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateGiFsuCollectionDetails extends CreateFsuCollectionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serviceType")
        private CollectionServiceTypes serviceType;

        public Builder serviceType(CollectionServiceTypes serviceType) {
            this.serviceType = serviceType;
            this.__explicitlySet__.add("serviceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * Grid Infrastructure Major Version of targets to be included in the Exadata Fleet Update
         * Collection. Only GI targets that match the version specified in this value would be added
         * to the Exadata Fleet Update Collection.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceMajorVersion")
        private GiSourceMajorVersions sourceMajorVersion;

        /**
         * Grid Infrastructure Major Version of targets to be included in the Exadata Fleet Update
         * Collection. Only GI targets that match the version specified in this value would be added
         * to the Exadata Fleet Update Collection.
         *
         * @param sourceMajorVersion the value to set
         * @return this builder
         */
        public Builder sourceMajorVersion(GiSourceMajorVersions sourceMajorVersion) {
            this.sourceMajorVersion = sourceMajorVersion;
            this.__explicitlySet__.add("sourceMajorVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fleetDiscovery")
        private GiFleetDiscoveryDetails fleetDiscovery;

        public Builder fleetDiscovery(GiFleetDiscoveryDetails fleetDiscovery) {
            this.fleetDiscovery = fleetDiscovery;
            this.__explicitlySet__.add("fleetDiscovery");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateGiFsuCollectionDetails build() {
            CreateGiFsuCollectionDetails model =
                    new CreateGiFsuCollectionDetails(
                            this.displayName,
                            this.serviceType,
                            this.compartmentId,
                            this.freeformTags,
                            this.definedTags,
                            this.sourceMajorVersion,
                            this.fleetDiscovery);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateGiFsuCollectionDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("serviceType")) {
                this.serviceType(model.getServiceType());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("sourceMajorVersion")) {
                this.sourceMajorVersion(model.getSourceMajorVersion());
            }
            if (model.wasPropertyExplicitlySet("fleetDiscovery")) {
                this.fleetDiscovery(model.getFleetDiscovery());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public CreateGiFsuCollectionDetails(
            String displayName,
            CollectionServiceTypes serviceType,
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            GiSourceMajorVersions sourceMajorVersion,
            GiFleetDiscoveryDetails fleetDiscovery) {
        super(displayName, serviceType, compartmentId, freeformTags, definedTags);
        this.sourceMajorVersion = sourceMajorVersion;
        this.fleetDiscovery = fleetDiscovery;
    }

    /**
     * Grid Infrastructure Major Version of targets to be included in the Exadata Fleet Update
     * Collection. Only GI targets that match the version specified in this value would be added to
     * the Exadata Fleet Update Collection.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceMajorVersion")
    private final GiSourceMajorVersions sourceMajorVersion;

    /**
     * Grid Infrastructure Major Version of targets to be included in the Exadata Fleet Update
     * Collection. Only GI targets that match the version specified in this value would be added to
     * the Exadata Fleet Update Collection.
     *
     * @return the value
     */
    public GiSourceMajorVersions getSourceMajorVersion() {
        return sourceMajorVersion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("fleetDiscovery")
    private final GiFleetDiscoveryDetails fleetDiscovery;

    public GiFleetDiscoveryDetails getFleetDiscovery() {
        return fleetDiscovery;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateGiFsuCollectionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", sourceMajorVersion=").append(String.valueOf(this.sourceMajorVersion));
        sb.append(", fleetDiscovery=").append(String.valueOf(this.fleetDiscovery));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateGiFsuCollectionDetails)) {
            return false;
        }

        CreateGiFsuCollectionDetails other = (CreateGiFsuCollectionDetails) o;
        return java.util.Objects.equals(this.sourceMajorVersion, other.sourceMajorVersion)
                && java.util.Objects.equals(this.fleetDiscovery, other.fleetDiscovery)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.sourceMajorVersion == null
                                ? 43
                                : this.sourceMajorVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.fleetDiscovery == null ? 43 : this.fleetDiscovery.hashCode());
        return result;
    }
}
