/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AppCatalogListingResourceVersionAgreements.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AppCatalogListingResourceVersionAgreements
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "listingId",
        "listingResourceVersion",
        "oracleTermsOfUseLink",
        "eulaLink",
        "timeRetrieved",
        "signature"
    })
    public AppCatalogListingResourceVersionAgreements(
            String listingId,
            String listingResourceVersion,
            String oracleTermsOfUseLink,
            String eulaLink,
            java.util.Date timeRetrieved,
            String signature) {
        super();
        this.listingId = listingId;
        this.listingResourceVersion = listingResourceVersion;
        this.oracleTermsOfUseLink = oracleTermsOfUseLink;
        this.eulaLink = eulaLink;
        this.timeRetrieved = timeRetrieved;
        this.signature = signature;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the listing associated with these agreements.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("listingId")
        private String listingId;

        /**
         * The OCID of the listing associated with these agreements.
         * @param listingId the value to set
         * @return this builder
         **/
        public Builder listingId(String listingId) {
            this.listingId = listingId;
            this.__explicitlySet__.add("listingId");
            return this;
        }
        /**
         * Listing resource version associated with these agreements.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("listingResourceVersion")
        private String listingResourceVersion;

        /**
         * Listing resource version associated with these agreements.
         * @param listingResourceVersion the value to set
         * @return this builder
         **/
        public Builder listingResourceVersion(String listingResourceVersion) {
            this.listingResourceVersion = listingResourceVersion;
            this.__explicitlySet__.add("listingResourceVersion");
            return this;
        }
        /**
         * Oracle TOU link
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("oracleTermsOfUseLink")
        private String oracleTermsOfUseLink;

        /**
         * Oracle TOU link
         * @param oracleTermsOfUseLink the value to set
         * @return this builder
         **/
        public Builder oracleTermsOfUseLink(String oracleTermsOfUseLink) {
            this.oracleTermsOfUseLink = oracleTermsOfUseLink;
            this.__explicitlySet__.add("oracleTermsOfUseLink");
            return this;
        }
        /**
         * EULA link
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("eulaLink")
        private String eulaLink;

        /**
         * EULA link
         * @param eulaLink the value to set
         * @return this builder
         **/
        public Builder eulaLink(String eulaLink) {
            this.eulaLink = eulaLink;
            this.__explicitlySet__.add("eulaLink");
            return this;
        }
        /**
         * Date and time the agreements were retrieved, in [RFC3339](https://tools.ietf.org/html/rfc3339) format.
         * Example: {@code 2018-03-20T12:32:53.532Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeRetrieved")
        private java.util.Date timeRetrieved;

        /**
         * Date and time the agreements were retrieved, in [RFC3339](https://tools.ietf.org/html/rfc3339) format.
         * Example: {@code 2018-03-20T12:32:53.532Z}
         *
         * @param timeRetrieved the value to set
         * @return this builder
         **/
        public Builder timeRetrieved(java.util.Date timeRetrieved) {
            this.timeRetrieved = timeRetrieved;
            this.__explicitlySet__.add("timeRetrieved");
            return this;
        }
        /**
         * A generated signature for this agreement retrieval operation which should be used in the create subscription call.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("signature")
        private String signature;

        /**
         * A generated signature for this agreement retrieval operation which should be used in the create subscription call.
         *
         * @param signature the value to set
         * @return this builder
         **/
        public Builder signature(String signature) {
            this.signature = signature;
            this.__explicitlySet__.add("signature");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AppCatalogListingResourceVersionAgreements build() {
            AppCatalogListingResourceVersionAgreements model =
                    new AppCatalogListingResourceVersionAgreements(
                            this.listingId,
                            this.listingResourceVersion,
                            this.oracleTermsOfUseLink,
                            this.eulaLink,
                            this.timeRetrieved,
                            this.signature);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AppCatalogListingResourceVersionAgreements model) {
            if (model.wasPropertyExplicitlySet("listingId")) {
                this.listingId(model.getListingId());
            }
            if (model.wasPropertyExplicitlySet("listingResourceVersion")) {
                this.listingResourceVersion(model.getListingResourceVersion());
            }
            if (model.wasPropertyExplicitlySet("oracleTermsOfUseLink")) {
                this.oracleTermsOfUseLink(model.getOracleTermsOfUseLink());
            }
            if (model.wasPropertyExplicitlySet("eulaLink")) {
                this.eulaLink(model.getEulaLink());
            }
            if (model.wasPropertyExplicitlySet("timeRetrieved")) {
                this.timeRetrieved(model.getTimeRetrieved());
            }
            if (model.wasPropertyExplicitlySet("signature")) {
                this.signature(model.getSignature());
            }
            return this;
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
     * The OCID of the listing associated with these agreements.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listingId")
    private final String listingId;

    /**
     * The OCID of the listing associated with these agreements.
     * @return the value
     **/
    public String getListingId() {
        return listingId;
    }

    /**
     * Listing resource version associated with these agreements.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listingResourceVersion")
    private final String listingResourceVersion;

    /**
     * Listing resource version associated with these agreements.
     * @return the value
     **/
    public String getListingResourceVersion() {
        return listingResourceVersion;
    }

    /**
     * Oracle TOU link
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oracleTermsOfUseLink")
    private final String oracleTermsOfUseLink;

    /**
     * Oracle TOU link
     * @return the value
     **/
    public String getOracleTermsOfUseLink() {
        return oracleTermsOfUseLink;
    }

    /**
     * EULA link
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("eulaLink")
    private final String eulaLink;

    /**
     * EULA link
     * @return the value
     **/
    public String getEulaLink() {
        return eulaLink;
    }

    /**
     * Date and time the agreements were retrieved, in [RFC3339](https://tools.ietf.org/html/rfc3339) format.
     * Example: {@code 2018-03-20T12:32:53.532Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeRetrieved")
    private final java.util.Date timeRetrieved;

    /**
     * Date and time the agreements were retrieved, in [RFC3339](https://tools.ietf.org/html/rfc3339) format.
     * Example: {@code 2018-03-20T12:32:53.532Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeRetrieved() {
        return timeRetrieved;
    }

    /**
     * A generated signature for this agreement retrieval operation which should be used in the create subscription call.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("signature")
    private final String signature;

    /**
     * A generated signature for this agreement retrieval operation which should be used in the create subscription call.
     *
     * @return the value
     **/
    public String getSignature() {
        return signature;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AppCatalogListingResourceVersionAgreements(");
        sb.append("super=").append(super.toString());
        sb.append("listingId=").append(String.valueOf(this.listingId));
        sb.append(", listingResourceVersion=").append(String.valueOf(this.listingResourceVersion));
        sb.append(", oracleTermsOfUseLink=").append(String.valueOf(this.oracleTermsOfUseLink));
        sb.append(", eulaLink=").append(String.valueOf(this.eulaLink));
        sb.append(", timeRetrieved=").append(String.valueOf(this.timeRetrieved));
        sb.append(", signature=").append(String.valueOf(this.signature));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AppCatalogListingResourceVersionAgreements)) {
            return false;
        }

        AppCatalogListingResourceVersionAgreements other =
                (AppCatalogListingResourceVersionAgreements) o;
        return java.util.Objects.equals(this.listingId, other.listingId)
                && java.util.Objects.equals(
                        this.listingResourceVersion, other.listingResourceVersion)
                && java.util.Objects.equals(this.oracleTermsOfUseLink, other.oracleTermsOfUseLink)
                && java.util.Objects.equals(this.eulaLink, other.eulaLink)
                && java.util.Objects.equals(this.timeRetrieved, other.timeRetrieved)
                && java.util.Objects.equals(this.signature, other.signature)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.listingId == null ? 43 : this.listingId.hashCode());
        result =
                (result * PRIME)
                        + (this.listingResourceVersion == null
                                ? 43
                                : this.listingResourceVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.oracleTermsOfUseLink == null
                                ? 43
                                : this.oracleTermsOfUseLink.hashCode());
        result = (result * PRIME) + (this.eulaLink == null ? 43 : this.eulaLink.hashCode());
        result =
                (result * PRIME)
                        + (this.timeRetrieved == null ? 43 : this.timeRetrieved.hashCode());
        result = (result * PRIME) + (this.signature == null ? 43 : this.signature.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
