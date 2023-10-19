/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * URL pattern lists of the policy. The value of an entry is a list of URL patterns. The associated
 * key/name is the identifier by which the URL pattern list is referenced. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UrlList.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UrlList extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "urls", "totalUrls", "parentResourceId"})
    public UrlList(
            String name,
            java.util.List<UrlPattern> urls,
            Integer totalUrls,
            String parentResourceId) {
        super();
        this.name = name;
        this.urls = urls;
        this.totalUrls = totalUrls;
        this.parentResourceId = parentResourceId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique name identifier for the URL list. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Unique name identifier for the URL list.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** List of urls. */
        @com.fasterxml.jackson.annotation.JsonProperty("urls")
        private java.util.List<UrlPattern> urls;

        /**
         * List of urls.
         *
         * @param urls the value to set
         * @return this builder
         */
        public Builder urls(java.util.List<UrlPattern> urls) {
            this.urls = urls;
            this.__explicitlySet__.add("urls");
            return this;
        }
        /** Total count of URLs in the URL List */
        @com.fasterxml.jackson.annotation.JsonProperty("totalUrls")
        private Integer totalUrls;

        /**
         * Total count of URLs in the URL List
         *
         * @param totalUrls the value to set
         * @return this builder
         */
        public Builder totalUrls(Integer totalUrls) {
            this.totalUrls = totalUrls;
            this.__explicitlySet__.add("totalUrls");
            return this;
        }
        /** OCID of the Network Firewall Policy this URL List belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("parentResourceId")
        private String parentResourceId;

        /**
         * OCID of the Network Firewall Policy this URL List belongs to.
         *
         * @param parentResourceId the value to set
         * @return this builder
         */
        public Builder parentResourceId(String parentResourceId) {
            this.parentResourceId = parentResourceId;
            this.__explicitlySet__.add("parentResourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UrlList build() {
            UrlList model =
                    new UrlList(this.name, this.urls, this.totalUrls, this.parentResourceId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UrlList model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("urls")) {
                this.urls(model.getUrls());
            }
            if (model.wasPropertyExplicitlySet("totalUrls")) {
                this.totalUrls(model.getTotalUrls());
            }
            if (model.wasPropertyExplicitlySet("parentResourceId")) {
                this.parentResourceId(model.getParentResourceId());
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

    /** Unique name identifier for the URL list. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Unique name identifier for the URL list.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** List of urls. */
    @com.fasterxml.jackson.annotation.JsonProperty("urls")
    private final java.util.List<UrlPattern> urls;

    /**
     * List of urls.
     *
     * @return the value
     */
    public java.util.List<UrlPattern> getUrls() {
        return urls;
    }

    /** Total count of URLs in the URL List */
    @com.fasterxml.jackson.annotation.JsonProperty("totalUrls")
    private final Integer totalUrls;

    /**
     * Total count of URLs in the URL List
     *
     * @return the value
     */
    public Integer getTotalUrls() {
        return totalUrls;
    }

    /** OCID of the Network Firewall Policy this URL List belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("parentResourceId")
    private final String parentResourceId;

    /**
     * OCID of the Network Firewall Policy this URL List belongs to.
     *
     * @return the value
     */
    public String getParentResourceId() {
        return parentResourceId;
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
        sb.append("UrlList(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", urls=").append(String.valueOf(this.urls));
        sb.append(", totalUrls=").append(String.valueOf(this.totalUrls));
        sb.append(", parentResourceId=").append(String.valueOf(this.parentResourceId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UrlList)) {
            return false;
        }

        UrlList other = (UrlList) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.urls, other.urls)
                && java.util.Objects.equals(this.totalUrls, other.totalUrls)
                && java.util.Objects.equals(this.parentResourceId, other.parentResourceId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.urls == null ? 43 : this.urls.hashCode());
        result = (result * PRIME) + (this.totalUrls == null ? 43 : this.totalUrls.hashCode());
        result =
                (result * PRIME)
                        + (this.parentResourceId == null ? 43 : this.parentResourceId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
