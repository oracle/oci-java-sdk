/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * An object containing credential details to authenticate/authorize a REST request. <br>
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
        builder = EndpointCredentials.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class EndpointCredentials
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"credentialType", "credentialName", "credentialEndpoint"})
    public EndpointCredentials(
            CredentialType credentialType,
            String credentialName,
            CredentialEndpoint credentialEndpoint) {
        super();
        this.credentialType = credentialType;
        this.credentialName = credentialName;
        this.credentialEndpoint = credentialEndpoint;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The credential type. NONE indicates credentials are not needed to access the endpoint.
         * BASIC_AUTH represents a username and password based model. TOKEN could be static or
         * dynamic. In case of dynamic tokens, also specify the endpoint from which the token must
         * be fetched.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("credentialType")
        private CredentialType credentialType;

        /**
         * The credential type. NONE indicates credentials are not needed to access the endpoint.
         * BASIC_AUTH represents a username and password based model. TOKEN could be static or
         * dynamic. In case of dynamic tokens, also specify the endpoint from which the token must
         * be fetched.
         *
         * @param credentialType the value to set
         * @return this builder
         */
        public Builder credentialType(CredentialType credentialType) {
            this.credentialType = credentialType;
            this.__explicitlySet__.add("credentialType");
            return this;
        }
        /** The named credential name on the management agent. */
        @com.fasterxml.jackson.annotation.JsonProperty("credentialName")
        private String credentialName;

        /**
         * The named credential name on the management agent.
         *
         * @param credentialName the value to set
         * @return this builder
         */
        public Builder credentialName(String credentialName) {
            this.credentialName = credentialName;
            this.__explicitlySet__.add("credentialName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("credentialEndpoint")
        private CredentialEndpoint credentialEndpoint;

        public Builder credentialEndpoint(CredentialEndpoint credentialEndpoint) {
            this.credentialEndpoint = credentialEndpoint;
            this.__explicitlySet__.add("credentialEndpoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EndpointCredentials build() {
            EndpointCredentials model =
                    new EndpointCredentials(
                            this.credentialType, this.credentialName, this.credentialEndpoint);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EndpointCredentials model) {
            if (model.wasPropertyExplicitlySet("credentialType")) {
                this.credentialType(model.getCredentialType());
            }
            if (model.wasPropertyExplicitlySet("credentialName")) {
                this.credentialName(model.getCredentialName());
            }
            if (model.wasPropertyExplicitlySet("credentialEndpoint")) {
                this.credentialEndpoint(model.getCredentialEndpoint());
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

    /**
     * The credential type. NONE indicates credentials are not needed to access the endpoint.
     * BASIC_AUTH represents a username and password based model. TOKEN could be static or dynamic.
     * In case of dynamic tokens, also specify the endpoint from which the token must be fetched.
     */
    public enum CredentialType implements com.oracle.bmc.http.internal.BmcEnum {
        None("NONE"),
        BasicAuth("BASIC_AUTH"),
        StaticToken("STATIC_TOKEN"),
        DynamicToken("DYNAMIC_TOKEN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(CredentialType.class);

        private final String value;
        private static java.util.Map<String, CredentialType> map;

        static {
            map = new java.util.HashMap<>();
            for (CredentialType v : CredentialType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CredentialType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CredentialType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CredentialType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The credential type. NONE indicates credentials are not needed to access the endpoint.
     * BASIC_AUTH represents a username and password based model. TOKEN could be static or dynamic.
     * In case of dynamic tokens, also specify the endpoint from which the token must be fetched.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("credentialType")
    private final CredentialType credentialType;

    /**
     * The credential type. NONE indicates credentials are not needed to access the endpoint.
     * BASIC_AUTH represents a username and password based model. TOKEN could be static or dynamic.
     * In case of dynamic tokens, also specify the endpoint from which the token must be fetched.
     *
     * @return the value
     */
    public CredentialType getCredentialType() {
        return credentialType;
    }

    /** The named credential name on the management agent. */
    @com.fasterxml.jackson.annotation.JsonProperty("credentialName")
    private final String credentialName;

    /**
     * The named credential name on the management agent.
     *
     * @return the value
     */
    public String getCredentialName() {
        return credentialName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("credentialEndpoint")
    private final CredentialEndpoint credentialEndpoint;

    public CredentialEndpoint getCredentialEndpoint() {
        return credentialEndpoint;
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
        sb.append("EndpointCredentials(");
        sb.append("super=").append(super.toString());
        sb.append("credentialType=").append(String.valueOf(this.credentialType));
        sb.append(", credentialName=").append(String.valueOf(this.credentialName));
        sb.append(", credentialEndpoint=").append(String.valueOf(this.credentialEndpoint));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EndpointCredentials)) {
            return false;
        }

        EndpointCredentials other = (EndpointCredentials) o;
        return java.util.Objects.equals(this.credentialType, other.credentialType)
                && java.util.Objects.equals(this.credentialName, other.credentialName)
                && java.util.Objects.equals(this.credentialEndpoint, other.credentialEndpoint)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.credentialType == null ? 43 : this.credentialType.hashCode());
        result =
                (result * PRIME)
                        + (this.credentialName == null ? 43 : this.credentialName.hashCode());
        result =
                (result * PRIME)
                        + (this.credentialEndpoint == null
                                ? 43
                                : this.credentialEndpoint.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
