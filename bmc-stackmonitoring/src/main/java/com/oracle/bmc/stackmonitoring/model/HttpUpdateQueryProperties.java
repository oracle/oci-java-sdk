/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Query properties applicable to HTTP type of collection method <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = HttpUpdateQueryProperties.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "collectionMethod")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HttpUpdateQueryProperties extends MetricExtensionUpdateQueryProperties {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Http(s) end point URL */
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;

        /**
         * Http(s) end point URL
         *
         * @param url the value to set
         * @return this builder
         */
        public Builder url(String url) {
            this.url = url;
            this.__explicitlySet__.add("url");
            return this;
        }
        /** Type of content response given by the http(s) URL */
        @com.fasterxml.jackson.annotation.JsonProperty("responseContentType")
        private HttpResponseContentTypes responseContentType;

        /**
         * Type of content response given by the http(s) URL
         *
         * @param responseContentType the value to set
         * @return this builder
         */
        public Builder responseContentType(HttpResponseContentTypes responseContentType) {
            this.responseContentType = responseContentType;
            this.__explicitlySet__.add("responseContentType");
            return this;
        }
        /**
         * Supported protocol of resources to be associated with this metric extension. This is
         * optional and defaults to HTTPS, which uses secure connection to the URL
         */
        @com.fasterxml.jackson.annotation.JsonProperty("protocolType")
        private HttpProtocolTypes protocolType;

        /**
         * Supported protocol of resources to be associated with this metric extension. This is
         * optional and defaults to HTTPS, which uses secure connection to the URL
         *
         * @param protocolType the value to set
         * @return this builder
         */
        public Builder protocolType(HttpProtocolTypes protocolType) {
            this.protocolType = protocolType;
            this.__explicitlySet__.add("protocolType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scriptDetails")
        private UpdateHttpScriptFileDetails scriptDetails;

        public Builder scriptDetails(UpdateHttpScriptFileDetails scriptDetails) {
            this.scriptDetails = scriptDetails;
            this.__explicitlySet__.add("scriptDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HttpUpdateQueryProperties build() {
            HttpUpdateQueryProperties model =
                    new HttpUpdateQueryProperties(
                            this.url,
                            this.responseContentType,
                            this.protocolType,
                            this.scriptDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HttpUpdateQueryProperties model) {
            if (model.wasPropertyExplicitlySet("url")) {
                this.url(model.getUrl());
            }
            if (model.wasPropertyExplicitlySet("responseContentType")) {
                this.responseContentType(model.getResponseContentType());
            }
            if (model.wasPropertyExplicitlySet("protocolType")) {
                this.protocolType(model.getProtocolType());
            }
            if (model.wasPropertyExplicitlySet("scriptDetails")) {
                this.scriptDetails(model.getScriptDetails());
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

    @Deprecated
    public HttpUpdateQueryProperties(
            String url,
            HttpResponseContentTypes responseContentType,
            HttpProtocolTypes protocolType,
            UpdateHttpScriptFileDetails scriptDetails) {
        super();
        this.url = url;
        this.responseContentType = responseContentType;
        this.protocolType = protocolType;
        this.scriptDetails = scriptDetails;
    }

    /** Http(s) end point URL */
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    private final String url;

    /**
     * Http(s) end point URL
     *
     * @return the value
     */
    public String getUrl() {
        return url;
    }

    /** Type of content response given by the http(s) URL */
    @com.fasterxml.jackson.annotation.JsonProperty("responseContentType")
    private final HttpResponseContentTypes responseContentType;

    /**
     * Type of content response given by the http(s) URL
     *
     * @return the value
     */
    public HttpResponseContentTypes getResponseContentType() {
        return responseContentType;
    }

    /**
     * Supported protocol of resources to be associated with this metric extension. This is optional
     * and defaults to HTTPS, which uses secure connection to the URL
     */
    @com.fasterxml.jackson.annotation.JsonProperty("protocolType")
    private final HttpProtocolTypes protocolType;

    /**
     * Supported protocol of resources to be associated with this metric extension. This is optional
     * and defaults to HTTPS, which uses secure connection to the URL
     *
     * @return the value
     */
    public HttpProtocolTypes getProtocolType() {
        return protocolType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("scriptDetails")
    private final UpdateHttpScriptFileDetails scriptDetails;

    public UpdateHttpScriptFileDetails getScriptDetails() {
        return scriptDetails;
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
        sb.append("HttpUpdateQueryProperties(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", url=").append(String.valueOf(this.url));
        sb.append(", responseContentType=").append(String.valueOf(this.responseContentType));
        sb.append(", protocolType=").append(String.valueOf(this.protocolType));
        sb.append(", scriptDetails=").append(String.valueOf(this.scriptDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HttpUpdateQueryProperties)) {
            return false;
        }

        HttpUpdateQueryProperties other = (HttpUpdateQueryProperties) o;
        return java.util.Objects.equals(this.url, other.url)
                && java.util.Objects.equals(this.responseContentType, other.responseContentType)
                && java.util.Objects.equals(this.protocolType, other.protocolType)
                && java.util.Objects.equals(this.scriptDetails, other.scriptDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.url == null ? 43 : this.url.hashCode());
        result =
                (result * PRIME)
                        + (this.responseContentType == null
                                ? 43
                                : this.responseContentType.hashCode());
        result = (result * PRIME) + (this.protocolType == null ? 43 : this.protocolType.hashCode());
        result =
                (result * PRIME)
                        + (this.scriptDetails == null ? 43 : this.scriptDetails.hashCode());
        return result;
    }
}
