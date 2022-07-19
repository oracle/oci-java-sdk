/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Listing Resource Version summary
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
    builder = AppCatalogListingResourceVersionSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AppCatalogListingResourceVersionSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "listingId",
        "timePublished",
        "listingResourceId",
        "listingResourceVersion"
    })
    public AppCatalogListingResourceVersionSummary(
            String listingId,
            java.util.Date timePublished,
            String listingResourceId,
            String listingResourceVersion) {
        super();
        this.listingId = listingId;
        this.timePublished = timePublished;
        this.listingResourceId = listingResourceId;
        this.listingResourceVersion = listingResourceVersion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the listing this resource version belongs to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("listingId")
        private String listingId;

        /**
         * The OCID of the listing this resource version belongs to.
         * @param listingId the value to set
         * @return this builder
         **/
        public Builder listingId(String listingId) {
            this.listingId = listingId;
            this.__explicitlySet__.add("listingId");
            return this;
        }
        /**
         * Date and time the listing resource version was published, in [RFC3339](https://tools.ietf.org/html/rfc3339) format.
         * Example: {@code 2018-03-20T12:32:53.532Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timePublished")
        private java.util.Date timePublished;

        /**
         * Date and time the listing resource version was published, in [RFC3339](https://tools.ietf.org/html/rfc3339) format.
         * Example: {@code 2018-03-20T12:32:53.532Z}
         *
         * @param timePublished the value to set
         * @return this builder
         **/
        public Builder timePublished(java.util.Date timePublished) {
            this.timePublished = timePublished;
            this.__explicitlySet__.add("timePublished");
            return this;
        }
        /**
         * OCID of the listing resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("listingResourceId")
        private String listingResourceId;

        /**
         * OCID of the listing resource.
         * @param listingResourceId the value to set
         * @return this builder
         **/
        public Builder listingResourceId(String listingResourceId) {
            this.listingResourceId = listingResourceId;
            this.__explicitlySet__.add("listingResourceId");
            return this;
        }
        /**
         * Resource Version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("listingResourceVersion")
        private String listingResourceVersion;

        /**
         * Resource Version.
         * @param listingResourceVersion the value to set
         * @return this builder
         **/
        public Builder listingResourceVersion(String listingResourceVersion) {
            this.listingResourceVersion = listingResourceVersion;
            this.__explicitlySet__.add("listingResourceVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AppCatalogListingResourceVersionSummary build() {
            AppCatalogListingResourceVersionSummary __instance__ =
                    new AppCatalogListingResourceVersionSummary(
                            listingId, timePublished, listingResourceId, listingResourceVersion);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AppCatalogListingResourceVersionSummary o) {
            Builder copiedBuilder =
                    listingId(o.getListingId())
                            .timePublished(o.getTimePublished())
                            .listingResourceId(o.getListingResourceId())
                            .listingResourceVersion(o.getListingResourceVersion());

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
     * The OCID of the listing this resource version belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listingId")
    private final String listingId;

    /**
     * The OCID of the listing this resource version belongs to.
     * @return the value
     **/
    public String getListingId() {
        return listingId;
    }

    /**
     * Date and time the listing resource version was published, in [RFC3339](https://tools.ietf.org/html/rfc3339) format.
     * Example: {@code 2018-03-20T12:32:53.532Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timePublished")
    private final java.util.Date timePublished;

    /**
     * Date and time the listing resource version was published, in [RFC3339](https://tools.ietf.org/html/rfc3339) format.
     * Example: {@code 2018-03-20T12:32:53.532Z}
     *
     * @return the value
     **/
    public java.util.Date getTimePublished() {
        return timePublished;
    }

    /**
     * OCID of the listing resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listingResourceId")
    private final String listingResourceId;

    /**
     * OCID of the listing resource.
     * @return the value
     **/
    public String getListingResourceId() {
        return listingResourceId;
    }

    /**
     * Resource Version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listingResourceVersion")
    private final String listingResourceVersion;

    /**
     * Resource Version.
     * @return the value
     **/
    public String getListingResourceVersion() {
        return listingResourceVersion;
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
        sb.append("AppCatalogListingResourceVersionSummary(");
        sb.append("listingId=").append(String.valueOf(this.listingId));
        sb.append(", timePublished=").append(String.valueOf(this.timePublished));
        sb.append(", listingResourceId=").append(String.valueOf(this.listingResourceId));
        sb.append(", listingResourceVersion=").append(String.valueOf(this.listingResourceVersion));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AppCatalogListingResourceVersionSummary)) {
            return false;
        }

        AppCatalogListingResourceVersionSummary other = (AppCatalogListingResourceVersionSummary) o;
        return java.util.Objects.equals(this.listingId, other.listingId)
                && java.util.Objects.equals(this.timePublished, other.timePublished)
                && java.util.Objects.equals(this.listingResourceId, other.listingResourceId)
                && java.util.Objects.equals(
                        this.listingResourceVersion, other.listingResourceVersion)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.listingId == null ? 43 : this.listingId.hashCode());
        result =
                (result * PRIME)
                        + (this.timePublished == null ? 43 : this.timePublished.hashCode());
        result =
                (result * PRIME)
                        + (this.listingResourceId == null ? 43 : this.listingResourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.listingResourceVersion == null
                                ? 43
                                : this.listingResourceVersion.hashCode());
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
