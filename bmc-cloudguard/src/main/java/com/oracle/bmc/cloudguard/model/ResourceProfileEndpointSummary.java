/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Summary information for resource profile endpoints. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ResourceProfileEndpointSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ResourceProfileEndpointSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "resourceProfileId",
        "problemId",
        "sightingType",
        "sightingTypeDisplayName",
        "ipAddress",
        "ipAddressType",
        "ipClassificationType",
        "country",
        "latitude",
        "longitude",
        "asnNumber",
        "regions",
        "services",
        "timeLastDetected"
    })
    public ResourceProfileEndpointSummary(
            String id,
            String resourceProfileId,
            String problemId,
            String sightingType,
            String sightingTypeDisplayName,
            String ipAddress,
            String ipAddressType,
            String ipClassificationType,
            String country,
            Double latitude,
            Double longitude,
            String asnNumber,
            java.util.List<String> regions,
            java.util.List<String> services,
            java.util.Date timeLastDetected) {
        super();
        this.id = id;
        this.resourceProfileId = resourceProfileId;
        this.problemId = problemId;
        this.sightingType = sightingType;
        this.sightingTypeDisplayName = sightingTypeDisplayName;
        this.ipAddress = ipAddress;
        this.ipAddressType = ipAddressType;
        this.ipClassificationType = ipClassificationType;
        this.country = country;
        this.latitude = latitude;
        this.longitude = longitude;
        this.asnNumber = asnNumber;
        this.regions = regions;
        this.services = services;
        this.timeLastDetected = timeLastDetected;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier for sighting endpoints */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier for sighting endpoints
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Resource profile ID associated with the impacted resource */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceProfileId")
        private String resourceProfileId;

        /**
         * Resource profile ID associated with the impacted resource
         *
         * @param resourceProfileId the value to set
         * @return this builder
         */
        public Builder resourceProfileId(String resourceProfileId) {
            this.resourceProfileId = resourceProfileId;
            this.__explicitlySet__.add("resourceProfileId");
            return this;
        }
        /** Problem ID for sighting endpoints */
        @com.fasterxml.jackson.annotation.JsonProperty("problemId")
        private String problemId;

        /**
         * Problem ID for sighting endpoints
         *
         * @param problemId the value to set
         * @return this builder
         */
        public Builder problemId(String problemId) {
            this.problemId = problemId;
            this.__explicitlySet__.add("problemId");
            return this;
        }
        /** Type of sighting for sighting endpoints */
        @com.fasterxml.jackson.annotation.JsonProperty("sightingType")
        private String sightingType;

        /**
         * Type of sighting for sighting endpoints
         *
         * @param sightingType the value to set
         * @return this builder
         */
        public Builder sightingType(String sightingType) {
            this.sightingType = sightingType;
            this.__explicitlySet__.add("sightingType");
            return this;
        }
        /** Display name of the sighting type */
        @com.fasterxml.jackson.annotation.JsonProperty("sightingTypeDisplayName")
        private String sightingTypeDisplayName;

        /**
         * Display name of the sighting type
         *
         * @param sightingTypeDisplayName the value to set
         * @return this builder
         */
        public Builder sightingTypeDisplayName(String sightingTypeDisplayName) {
            this.sightingTypeDisplayName = sightingTypeDisplayName;
            this.__explicitlySet__.add("sightingTypeDisplayName");
            return this;
        }
        /** IP address for sighting */
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        /**
         * IP address for sighting
         *
         * @param ipAddress the value to set
         * @return this builder
         */
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            this.__explicitlySet__.add("ipAddress");
            return this;
        }
        /** Type of IP address for sighting */
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddressType")
        private String ipAddressType;

        /**
         * Type of IP address for sighting
         *
         * @param ipAddressType the value to set
         * @return this builder
         */
        public Builder ipAddressType(String ipAddressType) {
            this.ipAddressType = ipAddressType;
            this.__explicitlySet__.add("ipAddressType");
            return this;
        }
        /** IP address classification type */
        @com.fasterxml.jackson.annotation.JsonProperty("ipClassificationType")
        private String ipClassificationType;

        /**
         * IP address classification type
         *
         * @param ipClassificationType the value to set
         * @return this builder
         */
        public Builder ipClassificationType(String ipClassificationType) {
            this.ipClassificationType = ipClassificationType;
            this.__explicitlySet__.add("ipClassificationType");
            return this;
        }
        /** Country of sighting */
        @com.fasterxml.jackson.annotation.JsonProperty("country")
        private String country;

        /**
         * Country of sighting
         *
         * @param country the value to set
         * @return this builder
         */
        public Builder country(String country) {
            this.country = country;
            this.__explicitlySet__.add("country");
            return this;
        }
        /** Latitude of sighting */
        @com.fasterxml.jackson.annotation.JsonProperty("latitude")
        private Double latitude;

        /**
         * Latitude of sighting
         *
         * @param latitude the value to set
         * @return this builder
         */
        public Builder latitude(Double latitude) {
            this.latitude = latitude;
            this.__explicitlySet__.add("latitude");
            return this;
        }
        /** Longitude of sighting */
        @com.fasterxml.jackson.annotation.JsonProperty("longitude")
        private Double longitude;

        /**
         * Longitude of sighting
         *
         * @param longitude the value to set
         * @return this builder
         */
        public Builder longitude(Double longitude) {
            this.longitude = longitude;
            this.__explicitlySet__.add("longitude");
            return this;
        }
        /** ASN number of sighting */
        @com.fasterxml.jackson.annotation.JsonProperty("asnNumber")
        private String asnNumber;

        /**
         * ASN number of sighting
         *
         * @param asnNumber the value to set
         * @return this builder
         */
        public Builder asnNumber(String asnNumber) {
            this.asnNumber = asnNumber;
            this.__explicitlySet__.add("asnNumber");
            return this;
        }
        /** Regions where activities were performed from this IP address */
        @com.fasterxml.jackson.annotation.JsonProperty("regions")
        private java.util.List<String> regions;

        /**
         * Regions where activities were performed from this IP address
         *
         * @param regions the value to set
         * @return this builder
         */
        public Builder regions(java.util.List<String> regions) {
            this.regions = regions;
            this.__explicitlySet__.add("regions");
            return this;
        }
        /** List of services where activities were performed from this IP address */
        @com.fasterxml.jackson.annotation.JsonProperty("services")
        private java.util.List<String> services;

        /**
         * List of services where activities were performed from this IP address
         *
         * @param services the value to set
         * @return this builder
         */
        public Builder services(java.util.List<String> services) {
            this.services = services;
            this.__explicitlySet__.add("services");
            return this;
        }
        /** Date and time when activities were created */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastDetected")
        private java.util.Date timeLastDetected;

        /**
         * Date and time when activities were created
         *
         * @param timeLastDetected the value to set
         * @return this builder
         */
        public Builder timeLastDetected(java.util.Date timeLastDetected) {
            this.timeLastDetected = timeLastDetected;
            this.__explicitlySet__.add("timeLastDetected");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceProfileEndpointSummary build() {
            ResourceProfileEndpointSummary model =
                    new ResourceProfileEndpointSummary(
                            this.id,
                            this.resourceProfileId,
                            this.problemId,
                            this.sightingType,
                            this.sightingTypeDisplayName,
                            this.ipAddress,
                            this.ipAddressType,
                            this.ipClassificationType,
                            this.country,
                            this.latitude,
                            this.longitude,
                            this.asnNumber,
                            this.regions,
                            this.services,
                            this.timeLastDetected);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceProfileEndpointSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("resourceProfileId")) {
                this.resourceProfileId(model.getResourceProfileId());
            }
            if (model.wasPropertyExplicitlySet("problemId")) {
                this.problemId(model.getProblemId());
            }
            if (model.wasPropertyExplicitlySet("sightingType")) {
                this.sightingType(model.getSightingType());
            }
            if (model.wasPropertyExplicitlySet("sightingTypeDisplayName")) {
                this.sightingTypeDisplayName(model.getSightingTypeDisplayName());
            }
            if (model.wasPropertyExplicitlySet("ipAddress")) {
                this.ipAddress(model.getIpAddress());
            }
            if (model.wasPropertyExplicitlySet("ipAddressType")) {
                this.ipAddressType(model.getIpAddressType());
            }
            if (model.wasPropertyExplicitlySet("ipClassificationType")) {
                this.ipClassificationType(model.getIpClassificationType());
            }
            if (model.wasPropertyExplicitlySet("country")) {
                this.country(model.getCountry());
            }
            if (model.wasPropertyExplicitlySet("latitude")) {
                this.latitude(model.getLatitude());
            }
            if (model.wasPropertyExplicitlySet("longitude")) {
                this.longitude(model.getLongitude());
            }
            if (model.wasPropertyExplicitlySet("asnNumber")) {
                this.asnNumber(model.getAsnNumber());
            }
            if (model.wasPropertyExplicitlySet("regions")) {
                this.regions(model.getRegions());
            }
            if (model.wasPropertyExplicitlySet("services")) {
                this.services(model.getServices());
            }
            if (model.wasPropertyExplicitlySet("timeLastDetected")) {
                this.timeLastDetected(model.getTimeLastDetected());
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

    /** Unique identifier for sighting endpoints */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier for sighting endpoints
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Resource profile ID associated with the impacted resource */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceProfileId")
    private final String resourceProfileId;

    /**
     * Resource profile ID associated with the impacted resource
     *
     * @return the value
     */
    public String getResourceProfileId() {
        return resourceProfileId;
    }

    /** Problem ID for sighting endpoints */
    @com.fasterxml.jackson.annotation.JsonProperty("problemId")
    private final String problemId;

    /**
     * Problem ID for sighting endpoints
     *
     * @return the value
     */
    public String getProblemId() {
        return problemId;
    }

    /** Type of sighting for sighting endpoints */
    @com.fasterxml.jackson.annotation.JsonProperty("sightingType")
    private final String sightingType;

    /**
     * Type of sighting for sighting endpoints
     *
     * @return the value
     */
    public String getSightingType() {
        return sightingType;
    }

    /** Display name of the sighting type */
    @com.fasterxml.jackson.annotation.JsonProperty("sightingTypeDisplayName")
    private final String sightingTypeDisplayName;

    /**
     * Display name of the sighting type
     *
     * @return the value
     */
    public String getSightingTypeDisplayName() {
        return sightingTypeDisplayName;
    }

    /** IP address for sighting */
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    private final String ipAddress;

    /**
     * IP address for sighting
     *
     * @return the value
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /** Type of IP address for sighting */
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddressType")
    private final String ipAddressType;

    /**
     * Type of IP address for sighting
     *
     * @return the value
     */
    public String getIpAddressType() {
        return ipAddressType;
    }

    /** IP address classification type */
    @com.fasterxml.jackson.annotation.JsonProperty("ipClassificationType")
    private final String ipClassificationType;

    /**
     * IP address classification type
     *
     * @return the value
     */
    public String getIpClassificationType() {
        return ipClassificationType;
    }

    /** Country of sighting */
    @com.fasterxml.jackson.annotation.JsonProperty("country")
    private final String country;

    /**
     * Country of sighting
     *
     * @return the value
     */
    public String getCountry() {
        return country;
    }

    /** Latitude of sighting */
    @com.fasterxml.jackson.annotation.JsonProperty("latitude")
    private final Double latitude;

    /**
     * Latitude of sighting
     *
     * @return the value
     */
    public Double getLatitude() {
        return latitude;
    }

    /** Longitude of sighting */
    @com.fasterxml.jackson.annotation.JsonProperty("longitude")
    private final Double longitude;

    /**
     * Longitude of sighting
     *
     * @return the value
     */
    public Double getLongitude() {
        return longitude;
    }

    /** ASN number of sighting */
    @com.fasterxml.jackson.annotation.JsonProperty("asnNumber")
    private final String asnNumber;

    /**
     * ASN number of sighting
     *
     * @return the value
     */
    public String getAsnNumber() {
        return asnNumber;
    }

    /** Regions where activities were performed from this IP address */
    @com.fasterxml.jackson.annotation.JsonProperty("regions")
    private final java.util.List<String> regions;

    /**
     * Regions where activities were performed from this IP address
     *
     * @return the value
     */
    public java.util.List<String> getRegions() {
        return regions;
    }

    /** List of services where activities were performed from this IP address */
    @com.fasterxml.jackson.annotation.JsonProperty("services")
    private final java.util.List<String> services;

    /**
     * List of services where activities were performed from this IP address
     *
     * @return the value
     */
    public java.util.List<String> getServices() {
        return services;
    }

    /** Date and time when activities were created */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastDetected")
    private final java.util.Date timeLastDetected;

    /**
     * Date and time when activities were created
     *
     * @return the value
     */
    public java.util.Date getTimeLastDetected() {
        return timeLastDetected;
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
        sb.append("ResourceProfileEndpointSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", resourceProfileId=").append(String.valueOf(this.resourceProfileId));
        sb.append(", problemId=").append(String.valueOf(this.problemId));
        sb.append(", sightingType=").append(String.valueOf(this.sightingType));
        sb.append(", sightingTypeDisplayName=")
                .append(String.valueOf(this.sightingTypeDisplayName));
        sb.append(", ipAddress=").append(String.valueOf(this.ipAddress));
        sb.append(", ipAddressType=").append(String.valueOf(this.ipAddressType));
        sb.append(", ipClassificationType=").append(String.valueOf(this.ipClassificationType));
        sb.append(", country=").append(String.valueOf(this.country));
        sb.append(", latitude=").append(String.valueOf(this.latitude));
        sb.append(", longitude=").append(String.valueOf(this.longitude));
        sb.append(", asnNumber=").append(String.valueOf(this.asnNumber));
        sb.append(", regions=").append(String.valueOf(this.regions));
        sb.append(", services=").append(String.valueOf(this.services));
        sb.append(", timeLastDetected=").append(String.valueOf(this.timeLastDetected));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourceProfileEndpointSummary)) {
            return false;
        }

        ResourceProfileEndpointSummary other = (ResourceProfileEndpointSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.resourceProfileId, other.resourceProfileId)
                && java.util.Objects.equals(this.problemId, other.problemId)
                && java.util.Objects.equals(this.sightingType, other.sightingType)
                && java.util.Objects.equals(
                        this.sightingTypeDisplayName, other.sightingTypeDisplayName)
                && java.util.Objects.equals(this.ipAddress, other.ipAddress)
                && java.util.Objects.equals(this.ipAddressType, other.ipAddressType)
                && java.util.Objects.equals(this.ipClassificationType, other.ipClassificationType)
                && java.util.Objects.equals(this.country, other.country)
                && java.util.Objects.equals(this.latitude, other.latitude)
                && java.util.Objects.equals(this.longitude, other.longitude)
                && java.util.Objects.equals(this.asnNumber, other.asnNumber)
                && java.util.Objects.equals(this.regions, other.regions)
                && java.util.Objects.equals(this.services, other.services)
                && java.util.Objects.equals(this.timeLastDetected, other.timeLastDetected)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceProfileId == null ? 43 : this.resourceProfileId.hashCode());
        result = (result * PRIME) + (this.problemId == null ? 43 : this.problemId.hashCode());
        result = (result * PRIME) + (this.sightingType == null ? 43 : this.sightingType.hashCode());
        result =
                (result * PRIME)
                        + (this.sightingTypeDisplayName == null
                                ? 43
                                : this.sightingTypeDisplayName.hashCode());
        result = (result * PRIME) + (this.ipAddress == null ? 43 : this.ipAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.ipAddressType == null ? 43 : this.ipAddressType.hashCode());
        result =
                (result * PRIME)
                        + (this.ipClassificationType == null
                                ? 43
                                : this.ipClassificationType.hashCode());
        result = (result * PRIME) + (this.country == null ? 43 : this.country.hashCode());
        result = (result * PRIME) + (this.latitude == null ? 43 : this.latitude.hashCode());
        result = (result * PRIME) + (this.longitude == null ? 43 : this.longitude.hashCode());
        result = (result * PRIME) + (this.asnNumber == null ? 43 : this.asnNumber.hashCode());
        result = (result * PRIME) + (this.regions == null ? 43 : this.regions.hashCode());
        result = (result * PRIME) + (this.services == null ? 43 : this.services.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastDetected == null ? 43 : this.timeLastDetected.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
