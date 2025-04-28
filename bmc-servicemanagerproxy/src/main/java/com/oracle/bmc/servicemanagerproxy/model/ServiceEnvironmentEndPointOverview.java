/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemanagerproxy.model;

/**
 * An overview of service environment endpoints. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210914")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ServiceEnvironmentEndPointOverview.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ServiceEnvironmentEndPointOverview
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"environmentType", "url", "description"})
    public ServiceEnvironmentEndPointOverview(
            EnvironmentType environmentType, String url, String description) {
        super();
        this.environmentType = environmentType;
        this.url = url;
        this.description = description;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Service environment endpoint type. */
        @com.fasterxml.jackson.annotation.JsonProperty("environmentType")
        private EnvironmentType environmentType;

        /**
         * Service environment endpoint type.
         *
         * @param environmentType the value to set
         * @return this builder
         */
        public Builder environmentType(EnvironmentType environmentType) {
            this.environmentType = environmentType;
            this.__explicitlySet__.add("environmentType");
            return this;
        }
        /** Service environment instance URL. */
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;

        /**
         * Service environment instance URL.
         *
         * @param url the value to set
         * @return this builder
         */
        public Builder url(String url) {
            this.url = url;
            this.__explicitlySet__.add("url");
            return this;
        }
        /** Description of the environment link */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the environment link
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ServiceEnvironmentEndPointOverview build() {
            ServiceEnvironmentEndPointOverview model =
                    new ServiceEnvironmentEndPointOverview(
                            this.environmentType, this.url, this.description);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ServiceEnvironmentEndPointOverview model) {
            if (model.wasPropertyExplicitlySet("environmentType")) {
                this.environmentType(model.getEnvironmentType());
            }
            if (model.wasPropertyExplicitlySet("url")) {
                this.url(model.getUrl());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
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

    /** Service environment endpoint type. */
    public enum EnvironmentType implements com.oracle.bmc.http.internal.BmcEnum {
        InstanceUrlProd("INSTANCE_URL_PROD"),
        InstanceUrlTest("INSTANCE_URL_TEST"),
        InstanceUrlDev("INSTANCE_URL_DEV"),
        Other("OTHER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(EnvironmentType.class);

        private final String value;
        private static java.util.Map<String, EnvironmentType> map;

        static {
            map = new java.util.HashMap<>();
            for (EnvironmentType v : EnvironmentType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        EnvironmentType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static EnvironmentType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'EnvironmentType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Service environment endpoint type. */
    @com.fasterxml.jackson.annotation.JsonProperty("environmentType")
    private final EnvironmentType environmentType;

    /**
     * Service environment endpoint type.
     *
     * @return the value
     */
    public EnvironmentType getEnvironmentType() {
        return environmentType;
    }

    /** Service environment instance URL. */
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    private final String url;

    /**
     * Service environment instance URL.
     *
     * @return the value
     */
    public String getUrl() {
        return url;
    }

    /** Description of the environment link */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the environment link
     *
     * @return the value
     */
    public String getDescription() {
        return description;
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
        sb.append("ServiceEnvironmentEndPointOverview(");
        sb.append("super=").append(super.toString());
        sb.append("environmentType=").append(String.valueOf(this.environmentType));
        sb.append(", url=").append(String.valueOf(this.url));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ServiceEnvironmentEndPointOverview)) {
            return false;
        }

        ServiceEnvironmentEndPointOverview other = (ServiceEnvironmentEndPointOverview) o;
        return java.util.Objects.equals(this.environmentType, other.environmentType)
                && java.util.Objects.equals(this.url, other.url)
                && java.util.Objects.equals(this.description, other.description)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.environmentType == null ? 43 : this.environmentType.hashCode());
        result = (result * PRIME) + (this.url == null ? 43 : this.url.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
