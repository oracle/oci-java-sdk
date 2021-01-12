/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Agreements for a listing resource version.
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
    builder = AppCatalogListingResourceVersionAgreements.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AppCatalogListingResourceVersionAgreements {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("listingId")
        private String listingId;

        public Builder listingId(String listingId) {
            this.listingId = listingId;
            this.__explicitlySet__.add("listingId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("listingResourceVersion")
        private String listingResourceVersion;

        public Builder listingResourceVersion(String listingResourceVersion) {
            this.listingResourceVersion = listingResourceVersion;
            this.__explicitlySet__.add("listingResourceVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("oracleTermsOfUseLink")
        private String oracleTermsOfUseLink;

        public Builder oracleTermsOfUseLink(String oracleTermsOfUseLink) {
            this.oracleTermsOfUseLink = oracleTermsOfUseLink;
            this.__explicitlySet__.add("oracleTermsOfUseLink");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("eulaLink")
        private String eulaLink;

        public Builder eulaLink(String eulaLink) {
            this.eulaLink = eulaLink;
            this.__explicitlySet__.add("eulaLink");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeRetrieved")
        private java.util.Date timeRetrieved;

        public Builder timeRetrieved(java.util.Date timeRetrieved) {
            this.timeRetrieved = timeRetrieved;
            this.__explicitlySet__.add("timeRetrieved");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("signature")
        private String signature;

        public Builder signature(String signature) {
            this.signature = signature;
            this.__explicitlySet__.add("signature");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AppCatalogListingResourceVersionAgreements build() {
            AppCatalogListingResourceVersionAgreements __instance__ =
                    new AppCatalogListingResourceVersionAgreements(
                            listingId,
                            listingResourceVersion,
                            oracleTermsOfUseLink,
                            eulaLink,
                            timeRetrieved,
                            signature);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AppCatalogListingResourceVersionAgreements o) {
            Builder copiedBuilder =
                    listingId(o.getListingId())
                            .listingResourceVersion(o.getListingResourceVersion())
                            .oracleTermsOfUseLink(o.getOracleTermsOfUseLink())
                            .eulaLink(o.getEulaLink())
                            .timeRetrieved(o.getTimeRetrieved())
                            .signature(o.getSignature());

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
     * The OCID of the listing associated with these agreements.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listingId")
    String listingId;

    /**
     * Listing resource version associated with these agreements.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listingResourceVersion")
    String listingResourceVersion;

    /**
     * Oracle TOU link
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oracleTermsOfUseLink")
    String oracleTermsOfUseLink;

    /**
     * EULA link
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("eulaLink")
    String eulaLink;

    /**
     * Date and time the agreements were retrieved, in [RFC3339](https://tools.ietf.org/html/rfc3339) format.
     * Example: `2018-03-20T12:32:53.532Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeRetrieved")
    java.util.Date timeRetrieved;

    /**
     * A generated signature for this agreement retrieval operation which should be used in the create subscription call.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("signature")
    String signature;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
