/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Problem endpoints summary.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ProblemEndpointSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ProblemEndpointSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sightingId")
        private String sightingId;

        public Builder sightingId(String sightingId) {
            this.sightingId = sightingId;
            this.__explicitlySet__.add("sightingId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("problemId")
        private String problemId;

        public Builder problemId(String problemId) {
            this.problemId = problemId;
            this.__explicitlySet__.add("problemId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sightingType")
        private String sightingType;

        public Builder sightingType(String sightingType) {
            this.sightingType = sightingType;
            this.__explicitlySet__.add("sightingType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sightingTypeDisplayName")
        private String sightingTypeDisplayName;

        public Builder sightingTypeDisplayName(String sightingTypeDisplayName) {
            this.sightingTypeDisplayName = sightingTypeDisplayName;
            this.__explicitlySet__.add("sightingTypeDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            this.__explicitlySet__.add("ipAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ipAddressType")
        private String ipAddressType;

        public Builder ipAddressType(String ipAddressType) {
            this.ipAddressType = ipAddressType;
            this.__explicitlySet__.add("ipAddressType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ipClassificationType")
        private String ipClassificationType;

        public Builder ipClassificationType(String ipClassificationType) {
            this.ipClassificationType = ipClassificationType;
            this.__explicitlySet__.add("ipClassificationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("country")
        private String country;

        public Builder country(String country) {
            this.country = country;
            this.__explicitlySet__.add("country");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("latitude")
        private Double latitude;

        public Builder latitude(Double latitude) {
            this.latitude = latitude;
            this.__explicitlySet__.add("latitude");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("longitude")
        private Double longitude;

        public Builder longitude(Double longitude) {
            this.longitude = longitude;
            this.__explicitlySet__.add("longitude");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("asnNumber")
        private String asnNumber;

        public Builder asnNumber(String asnNumber) {
            this.asnNumber = asnNumber;
            this.__explicitlySet__.add("asnNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("regions")
        private java.util.List<String> regions;

        public Builder regions(java.util.List<String> regions) {
            this.regions = regions;
            this.__explicitlySet__.add("regions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("services")
        private java.util.List<String> services;

        public Builder services(java.util.List<String> services) {
            this.services = services;
            this.__explicitlySet__.add("services");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeLastDetected")
        private java.util.Date timeLastDetected;

        public Builder timeLastDetected(java.util.Date timeLastDetected) {
            this.timeLastDetected = timeLastDetected;
            this.__explicitlySet__.add("timeLastDetected");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProblemEndpointSummary build() {
            ProblemEndpointSummary __instance__ =
                    new ProblemEndpointSummary(
                            id,
                            sightingId,
                            problemId,
                            sightingType,
                            sightingTypeDisplayName,
                            ipAddress,
                            ipAddressType,
                            ipClassificationType,
                            country,
                            latitude,
                            longitude,
                            asnNumber,
                            regions,
                            services,
                            timeLastDetected);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProblemEndpointSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .sightingId(o.getSightingId())
                            .problemId(o.getProblemId())
                            .sightingType(o.getSightingType())
                            .sightingTypeDisplayName(o.getSightingTypeDisplayName())
                            .ipAddress(o.getIpAddress())
                            .ipAddressType(o.getIpAddressType())
                            .ipClassificationType(o.getIpClassificationType())
                            .country(o.getCountry())
                            .latitude(o.getLatitude())
                            .longitude(o.getLongitude())
                            .asnNumber(o.getAsnNumber())
                            .regions(o.getRegions())
                            .services(o.getServices())
                            .timeLastDetected(o.getTimeLastDetected());

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
     * Unique identifier for problem endpoint.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * Unique id for sighting associated with the endpoint.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sightingId")
    String sightingId;

    /**
     * Unique id for cloudguard problem
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("problemId")
    String problemId;

    /**
     * Identifier for the sighting type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sightingType")
    String sightingType;

    /**
     * Display Name of the sighting type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sightingTypeDisplayName")
    String sightingTypeDisplayName;

    /**
     * IP Address of the Endpoint
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    String ipAddress;

    /**
     * IP Address type of the Endpoint
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddressType")
    String ipAddressType;

    /**
     * IP Address classification type of the endpoint
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipClassificationType")
    String ipClassificationType;

    /**
     * Country of the endpoint
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("country")
    String country;

    /**
     * Latitude of the endpoint
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("latitude")
    Double latitude;

    /**
     * Longitude of the endpoint
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("longitude")
    Double longitude;

    /**
     * ASN number of the endpoint
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("asnNumber")
    String asnNumber;

    /**
     * Regions where activities were performed from this IP
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("regions")
    java.util.List<String> regions;

    /**
     * Services where activities were performed from this IP
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("services")
    java.util.List<String> services;

    /**
     * Time when activities were last detected
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastDetected")
    java.util.Date timeLastDetected;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
