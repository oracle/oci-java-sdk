/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * An object containing details to make a REST request.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = EndpointRequest.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class EndpointRequest extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "method",
        "url",
        "contentType",
        "payload",
        "headers",
        "formParameters"
    })
    public EndpointRequest(
            Method method,
            String url,
            String contentType,
            String payload,
            java.util.List<NameValuePair> headers,
            java.util.List<NameValuePair> formParameters) {
        super();
        this.method = method;
        this.url = url;
        this.contentType = contentType;
        this.payload = payload;
        this.headers = headers;
        this.formParameters = formParameters;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The endpoint method - GET or POST.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("method")
        private Method method;

        /**
         * The endpoint method - GET or POST.
         * @param method the value to set
         * @return this builder
         **/
        public Builder method(Method method) {
            this.method = method;
            this.__explicitlySet__.add("method");
            return this;
        }
        /**
         * The request URL.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;

        /**
         * The request URL.
         * @param url the value to set
         * @return this builder
         **/
        public Builder url(String url) {
            this.url = url;
            this.__explicitlySet__.add("url");
            return this;
        }
        /**
         * The request content type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("contentType")
        private String contentType;

        /**
         * The request content type.
         * @param contentType the value to set
         * @return this builder
         **/
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            this.__explicitlySet__.add("contentType");
            return this;
        }
        /**
         * The request payload, applicable for POST requests.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("payload")
        private String payload;

        /**
         * The request payload, applicable for POST requests.
         * @param payload the value to set
         * @return this builder
         **/
        public Builder payload(String payload) {
            this.payload = payload;
            this.__explicitlySet__.add("payload");
            return this;
        }
        /**
         * The request headers represented as a list of name-value pairs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("headers")
        private java.util.List<NameValuePair> headers;

        /**
         * The request headers represented as a list of name-value pairs.
         * @param headers the value to set
         * @return this builder
         **/
        public Builder headers(java.util.List<NameValuePair> headers) {
            this.headers = headers;
            this.__explicitlySet__.add("headers");
            return this;
        }
        /**
         * The request form parameters represented as a list of name-value pairs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("formParameters")
        private java.util.List<NameValuePair> formParameters;

        /**
         * The request form parameters represented as a list of name-value pairs.
         * @param formParameters the value to set
         * @return this builder
         **/
        public Builder formParameters(java.util.List<NameValuePair> formParameters) {
            this.formParameters = formParameters;
            this.__explicitlySet__.add("formParameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EndpointRequest build() {
            EndpointRequest model =
                    new EndpointRequest(
                            this.method,
                            this.url,
                            this.contentType,
                            this.payload,
                            this.headers,
                            this.formParameters);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EndpointRequest model) {
            if (model.wasPropertyExplicitlySet("method")) {
                this.method(model.getMethod());
            }
            if (model.wasPropertyExplicitlySet("url")) {
                this.url(model.getUrl());
            }
            if (model.wasPropertyExplicitlySet("contentType")) {
                this.contentType(model.getContentType());
            }
            if (model.wasPropertyExplicitlySet("payload")) {
                this.payload(model.getPayload());
            }
            if (model.wasPropertyExplicitlySet("headers")) {
                this.headers(model.getHeaders());
            }
            if (model.wasPropertyExplicitlySet("formParameters")) {
                this.formParameters(model.getFormParameters());
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
     * The endpoint method - GET or POST.
     **/
    public enum Method {
        Get("GET"),
        Post("POST"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Method.class);

        private final String value;
        private static java.util.Map<String, Method> map;

        static {
            map = new java.util.HashMap<>();
            for (Method v : Method.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Method(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Method create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Method', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The endpoint method - GET or POST.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("method")
    private final Method method;

    /**
     * The endpoint method - GET or POST.
     * @return the value
     **/
    public Method getMethod() {
        return method;
    }

    /**
     * The request URL.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    private final String url;

    /**
     * The request URL.
     * @return the value
     **/
    public String getUrl() {
        return url;
    }

    /**
     * The request content type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contentType")
    private final String contentType;

    /**
     * The request content type.
     * @return the value
     **/
    public String getContentType() {
        return contentType;
    }

    /**
     * The request payload, applicable for POST requests.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("payload")
    private final String payload;

    /**
     * The request payload, applicable for POST requests.
     * @return the value
     **/
    public String getPayload() {
        return payload;
    }

    /**
     * The request headers represented as a list of name-value pairs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("headers")
    private final java.util.List<NameValuePair> headers;

    /**
     * The request headers represented as a list of name-value pairs.
     * @return the value
     **/
    public java.util.List<NameValuePair> getHeaders() {
        return headers;
    }

    /**
     * The request form parameters represented as a list of name-value pairs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("formParameters")
    private final java.util.List<NameValuePair> formParameters;

    /**
     * The request form parameters represented as a list of name-value pairs.
     * @return the value
     **/
    public java.util.List<NameValuePair> getFormParameters() {
        return formParameters;
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
        sb.append("EndpointRequest(");
        sb.append("super=").append(super.toString());
        sb.append("method=").append(String.valueOf(this.method));
        sb.append(", url=").append(String.valueOf(this.url));
        sb.append(", contentType=").append(String.valueOf(this.contentType));
        sb.append(", payload=").append(String.valueOf(this.payload));
        sb.append(", headers=").append(String.valueOf(this.headers));
        sb.append(", formParameters=").append(String.valueOf(this.formParameters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EndpointRequest)) {
            return false;
        }

        EndpointRequest other = (EndpointRequest) o;
        return java.util.Objects.equals(this.method, other.method)
                && java.util.Objects.equals(this.url, other.url)
                && java.util.Objects.equals(this.contentType, other.contentType)
                && java.util.Objects.equals(this.payload, other.payload)
                && java.util.Objects.equals(this.headers, other.headers)
                && java.util.Objects.equals(this.formParameters, other.formParameters)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.method == null ? 43 : this.method.hashCode());
        result = (result * PRIME) + (this.url == null ? 43 : this.url.hashCode());
        result = (result * PRIME) + (this.contentType == null ? 43 : this.contentType.hashCode());
        result = (result * PRIME) + (this.payload == null ? 43 : this.payload.hashCode());
        result = (result * PRIME) + (this.headers == null ? 43 : this.headers.hashCode());
        result =
                (result * PRIME)
                        + (this.formParameters == null ? 43 : this.formParameters.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
