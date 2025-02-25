/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.model;

/**
 * The response returned for the get manifest call.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = GetManifestResponse.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class GetManifestResponse extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"serializedManifest"})
    public GetManifestResponse(String serializedManifest) {
        super();
        this.serializedManifest = serializedManifest;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The serialized manifest response.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serializedManifest")
        private String serializedManifest;

        /**
         * The serialized manifest response.
         * @param serializedManifest the value to set
         * @return this builder
         **/
        public Builder serializedManifest(String serializedManifest) {
            this.serializedManifest = serializedManifest;
            this.__explicitlySet__.add("serializedManifest");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GetManifestResponse build() {
            GetManifestResponse model = new GetManifestResponse(this.serializedManifest);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GetManifestResponse model) {
            if (model.wasPropertyExplicitlySet("serializedManifest")) {
                this.serializedManifest(model.getSerializedManifest());
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
     * The serialized manifest response.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serializedManifest")
    private final String serializedManifest;

    /**
     * The serialized manifest response.
     * @return the value
     **/
    public String getSerializedManifest() {
        return serializedManifest;
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
        sb.append("GetManifestResponse(");
        sb.append("super=").append(super.toString());
        sb.append("serializedManifest=").append(String.valueOf(this.serializedManifest));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetManifestResponse)) {
            return false;
        }

        GetManifestResponse other = (GetManifestResponse) o;
        return java.util.Objects.equals(this.serializedManifest, other.serializedManifest)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.serializedManifest == null
                                ? 43
                                : this.serializedManifest.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
