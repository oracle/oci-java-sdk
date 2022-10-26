/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.analytics.model;

/**
 * Vanity url configuration details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190331")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = VanityUrlDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class VanityUrlDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "description", "urls", "hosts", "publicCertificate"})
    public VanityUrlDetails(
            String key,
            String description,
            java.util.List<String> urls,
            java.util.List<String> hosts,
            String publicCertificate) {
        super();
        this.key = key;
        this.description = description;
        this.urls = urls;
        this.hosts = hosts;
        this.publicCertificate = publicCertificate;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The vanity url unique identifier key. */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The vanity url unique identifier key.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** Description of the vanity url. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the vanity url.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** List of urls supported by this vanity URL definition (max of 3). */
        @com.fasterxml.jackson.annotation.JsonProperty("urls")
        private java.util.List<String> urls;

        /**
         * List of urls supported by this vanity URL definition (max of 3).
         *
         * @param urls the value to set
         * @return this builder
         */
        public Builder urls(java.util.List<String> urls) {
            this.urls = urls;
            this.__explicitlySet__.add("urls");
            return this;
        }
        /** List of fully qualified hostnames supported by this vanity URL definition (max of 3). */
        @com.fasterxml.jackson.annotation.JsonProperty("hosts")
        private java.util.List<String> hosts;

        /**
         * List of fully qualified hostnames supported by this vanity URL definition (max of 3).
         *
         * @param hosts the value to set
         * @return this builder
         */
        public Builder hosts(java.util.List<String> hosts) {
            this.hosts = hosts;
            this.__explicitlySet__.add("hosts");
            return this;
        }
        /** PEM certificate for HTTPS connections. */
        @com.fasterxml.jackson.annotation.JsonProperty("publicCertificate")
        private String publicCertificate;

        /**
         * PEM certificate for HTTPS connections.
         *
         * @param publicCertificate the value to set
         * @return this builder
         */
        public Builder publicCertificate(String publicCertificate) {
            this.publicCertificate = publicCertificate;
            this.__explicitlySet__.add("publicCertificate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VanityUrlDetails build() {
            VanityUrlDetails model =
                    new VanityUrlDetails(
                            this.key,
                            this.description,
                            this.urls,
                            this.hosts,
                            this.publicCertificate);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VanityUrlDetails model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("urls")) {
                this.urls(model.getUrls());
            }
            if (model.wasPropertyExplicitlySet("hosts")) {
                this.hosts(model.getHosts());
            }
            if (model.wasPropertyExplicitlySet("publicCertificate")) {
                this.publicCertificate(model.getPublicCertificate());
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

    /** The vanity url unique identifier key. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The vanity url unique identifier key.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** Description of the vanity url. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the vanity url.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** List of urls supported by this vanity URL definition (max of 3). */
    @com.fasterxml.jackson.annotation.JsonProperty("urls")
    private final java.util.List<String> urls;

    /**
     * List of urls supported by this vanity URL definition (max of 3).
     *
     * @return the value
     */
    public java.util.List<String> getUrls() {
        return urls;
    }

    /** List of fully qualified hostnames supported by this vanity URL definition (max of 3). */
    @com.fasterxml.jackson.annotation.JsonProperty("hosts")
    private final java.util.List<String> hosts;

    /**
     * List of fully qualified hostnames supported by this vanity URL definition (max of 3).
     *
     * @return the value
     */
    public java.util.List<String> getHosts() {
        return hosts;
    }

    /** PEM certificate for HTTPS connections. */
    @com.fasterxml.jackson.annotation.JsonProperty("publicCertificate")
    private final String publicCertificate;

    /**
     * PEM certificate for HTTPS connections.
     *
     * @return the value
     */
    public String getPublicCertificate() {
        return publicCertificate;
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
        sb.append("VanityUrlDetails(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", urls=").append(String.valueOf(this.urls));
        sb.append(", hosts=").append(String.valueOf(this.hosts));
        sb.append(", publicCertificate=").append(String.valueOf(this.publicCertificate));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VanityUrlDetails)) {
            return false;
        }

        VanityUrlDetails other = (VanityUrlDetails) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.urls, other.urls)
                && java.util.Objects.equals(this.hosts, other.hosts)
                && java.util.Objects.equals(this.publicCertificate, other.publicCertificate)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.urls == null ? 43 : this.urls.hashCode());
        result = (result * PRIME) + (this.hosts == null ? 43 : this.hosts.hashCode());
        result =
                (result * PRIME)
                        + (this.publicCertificate == null ? 43 : this.publicCertificate.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
