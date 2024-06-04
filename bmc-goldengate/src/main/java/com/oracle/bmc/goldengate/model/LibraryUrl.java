/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * A Pre-Authenticated Request Object URL to a DB2 for z/OS library that needs to be uploaded to
 * your DB2 for z/OS server in order to establish GoldenGate connections to it. For licensing
 * reasons, the URL is accessible for 10 minutes only. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = LibraryUrl.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LibraryUrl extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"url"})
    public LibraryUrl(String url) {
        super();
        this.url = url;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The URL of a resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;

        /**
         * The URL of a resource.
         *
         * @param url the value to set
         * @return this builder
         */
        public Builder url(String url) {
            this.url = url;
            this.__explicitlySet__.add("url");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LibraryUrl build() {
            LibraryUrl model = new LibraryUrl(this.url);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LibraryUrl model) {
            if (model.wasPropertyExplicitlySet("url")) {
                this.url(model.getUrl());
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

    /** The URL of a resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    private final String url;

    /**
     * The URL of a resource.
     *
     * @return the value
     */
    public String getUrl() {
        return url;
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
        sb.append("LibraryUrl(");
        sb.append("super=").append(super.toString());
        sb.append("url=").append(String.valueOf(this.url));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LibraryUrl)) {
            return false;
        }

        LibraryUrl other = (LibraryUrl) o;
        return java.util.Objects.equals(this.url, other.url) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.url == null ? 43 : this.url.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
