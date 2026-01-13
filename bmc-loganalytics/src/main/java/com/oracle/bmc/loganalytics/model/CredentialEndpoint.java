/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * The endpoint from where to fetch a credential, for example, the OAuth 2.0 token. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CredentialEndpoint.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CredentialEndpoint
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "description",
        "model",
        "endpointId",
        "request",
        "response",
        "proxy"
    })
    public CredentialEndpoint(
            String name,
            String description,
            String model,
            Long endpointId,
            EndpointRequest request,
            EndpointResponse response,
            EndpointProxy proxy) {
        super();
        this.name = name;
        this.description = description;
        this.model = model;
        this.endpointId = endpointId;
        this.request = request;
        this.response = response;
        this.proxy = proxy;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The credential endpoint name. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The credential endpoint name.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The credential endpoint description. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The credential endpoint description.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The credential endpoint model. */
        @com.fasterxml.jackson.annotation.JsonProperty("model")
        private String model;

        /**
         * The credential endpoint model.
         *
         * @param model the value to set
         * @return this builder
         */
        public Builder model(String model) {
            this.model = model;
            this.__explicitlySet__.add("model");
            return this;
        }
        /** The endpoint unique identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("endpointId")
        private Long endpointId;

        /**
         * The endpoint unique identifier.
         *
         * @param endpointId the value to set
         * @return this builder
         */
        public Builder endpointId(Long endpointId) {
            this.endpointId = endpointId;
            this.__explicitlySet__.add("endpointId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("request")
        private EndpointRequest request;

        public Builder request(EndpointRequest request) {
            this.request = request;
            this.__explicitlySet__.add("request");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("response")
        private EndpointResponse response;

        public Builder response(EndpointResponse response) {
            this.response = response;
            this.__explicitlySet__.add("response");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("proxy")
        private EndpointProxy proxy;

        public Builder proxy(EndpointProxy proxy) {
            this.proxy = proxy;
            this.__explicitlySet__.add("proxy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CredentialEndpoint build() {
            CredentialEndpoint model =
                    new CredentialEndpoint(
                            this.name,
                            this.description,
                            this.model,
                            this.endpointId,
                            this.request,
                            this.response,
                            this.proxy);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CredentialEndpoint model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("model")) {
                this.model(model.getModel());
            }
            if (model.wasPropertyExplicitlySet("endpointId")) {
                this.endpointId(model.getEndpointId());
            }
            if (model.wasPropertyExplicitlySet("request")) {
                this.request(model.getRequest());
            }
            if (model.wasPropertyExplicitlySet("response")) {
                this.response(model.getResponse());
            }
            if (model.wasPropertyExplicitlySet("proxy")) {
                this.proxy(model.getProxy());
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

    /** The credential endpoint name. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The credential endpoint name.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The credential endpoint description. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The credential endpoint description.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The credential endpoint model. */
    @com.fasterxml.jackson.annotation.JsonProperty("model")
    private final String model;

    /**
     * The credential endpoint model.
     *
     * @return the value
     */
    public String getModel() {
        return model;
    }

    /** The endpoint unique identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("endpointId")
    private final Long endpointId;

    /**
     * The endpoint unique identifier.
     *
     * @return the value
     */
    public Long getEndpointId() {
        return endpointId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("request")
    private final EndpointRequest request;

    public EndpointRequest getRequest() {
        return request;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("response")
    private final EndpointResponse response;

    public EndpointResponse getResponse() {
        return response;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("proxy")
    private final EndpointProxy proxy;

    public EndpointProxy getProxy() {
        return proxy;
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
        sb.append("CredentialEndpoint(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", model=").append(String.valueOf(this.model));
        sb.append(", endpointId=").append(String.valueOf(this.endpointId));
        sb.append(", request=").append(String.valueOf(this.request));
        sb.append(", response=").append(String.valueOf(this.response));
        sb.append(", proxy=").append(String.valueOf(this.proxy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CredentialEndpoint)) {
            return false;
        }

        CredentialEndpoint other = (CredentialEndpoint) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.model, other.model)
                && java.util.Objects.equals(this.endpointId, other.endpointId)
                && java.util.Objects.equals(this.request, other.request)
                && java.util.Objects.equals(this.response, other.response)
                && java.util.Objects.equals(this.proxy, other.proxy)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.model == null ? 43 : this.model.hashCode());
        result = (result * PRIME) + (this.endpointId == null ? 43 : this.endpointId.hashCode());
        result = (result * PRIME) + (this.request == null ? 43 : this.request.hashCode());
        result = (result * PRIME) + (this.response == null ? 43 : this.response.hashCode());
        result = (result * PRIME) + (this.proxy == null ? 43 : this.proxy.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
