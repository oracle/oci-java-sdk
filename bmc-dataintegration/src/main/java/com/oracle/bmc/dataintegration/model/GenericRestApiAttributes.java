/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Generic rest api specific attributes. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = GenericRestApiAttributes.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class GenericRestApiAttributes
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"serverUrl"})
    public GenericRestApiAttributes(String serverUrl) {
        super();
        this.serverUrl = serverUrl;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The server URL serving operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("serverUrl")
        private String serverUrl;

        /**
         * The server URL serving operation.
         *
         * @param serverUrl the value to set
         * @return this builder
         */
        public Builder serverUrl(String serverUrl) {
            this.serverUrl = serverUrl;
            this.__explicitlySet__.add("serverUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GenericRestApiAttributes build() {
            GenericRestApiAttributes model = new GenericRestApiAttributes(this.serverUrl);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GenericRestApiAttributes model) {
            if (model.wasPropertyExplicitlySet("serverUrl")) {
                this.serverUrl(model.getServerUrl());
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

    /** The server URL serving operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("serverUrl")
    private final String serverUrl;

    /**
     * The server URL serving operation.
     *
     * @return the value
     */
    public String getServerUrl() {
        return serverUrl;
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
        sb.append("GenericRestApiAttributes(");
        sb.append("super=").append(super.toString());
        sb.append("serverUrl=").append(String.valueOf(this.serverUrl));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GenericRestApiAttributes)) {
            return false;
        }

        GenericRestApiAttributes other = (GenericRestApiAttributes) o;
        return java.util.Objects.equals(this.serverUrl, other.serverUrl) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.serverUrl == null ? 43 : this.serverUrl.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
