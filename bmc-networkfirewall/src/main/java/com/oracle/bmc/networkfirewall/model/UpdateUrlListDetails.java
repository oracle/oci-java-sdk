/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * The request details to be updated in the URL List for the policy. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateUrlListDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateUrlListDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"urls"})
    public UpdateUrlListDetails(java.util.List<UrlPattern> urls) {
        super();
        this.urls = urls;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateUrlListDetails build() {
            UpdateUrlListDetails model = new UpdateUrlListDetails(this.urls);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateUrlListDetails model) {
            if (model.wasPropertyExplicitlySet("urls")) {
                this.urls(model.getUrls());
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
        sb.append("UpdateUrlListDetails(");
        sb.append("super=").append(super.toString());
        sb.append("urls=").append(String.valueOf(this.urls));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateUrlListDetails)) {
            return false;
        }

        UpdateUrlListDetails other = (UpdateUrlListDetails) o;
        return java.util.Objects.equals(this.urls, other.urls) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.urls == null ? 43 : this.urls.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
