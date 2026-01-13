/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The user credential information. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RestCredential.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RestCredential
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "username",
        "password",
        "sslTrustStoreType",
        "sslTrustStoreLocation",
        "sslTrustStorePassword"
    })
    public RestCredential(
            String username,
            String password,
            SslTrustStoreType sslTrustStoreType,
            String sslTrustStoreLocation,
            String sslTrustStorePassword) {
        super();
        this.username = username;
        this.password = password;
        this.sslTrustStoreType = sslTrustStoreType;
        this.sslTrustStoreLocation = sslTrustStoreLocation;
        this.sslTrustStorePassword = sslTrustStorePassword;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the user. */
        @com.fasterxml.jackson.annotation.JsonProperty("username")
        private String username;

        /**
         * The name of the user.
         *
         * @param username the value to set
         * @return this builder
         */
        public Builder username(String username) {
            this.username = username;
            this.__explicitlySet__.add("username");
            return this;
        }
        /** The password of the user. */
        @com.fasterxml.jackson.annotation.JsonProperty("password")
        private String password;

        /**
         * The password of the user.
         *
         * @param password the value to set
         * @return this builder
         */
        public Builder password(String password) {
            this.password = password;
            this.__explicitlySet__.add("password");
            return this;
        }
        /** The SSL truststore type. */
        @com.fasterxml.jackson.annotation.JsonProperty("sslTrustStoreType")
        private SslTrustStoreType sslTrustStoreType;

        /**
         * The SSL truststore type.
         *
         * @param sslTrustStoreType the value to set
         * @return this builder
         */
        public Builder sslTrustStoreType(SslTrustStoreType sslTrustStoreType) {
            this.sslTrustStoreType = sslTrustStoreType;
            this.__explicitlySet__.add("sslTrustStoreType");
            return this;
        }
        /** The full path of the SSL truststore location in the agent. */
        @com.fasterxml.jackson.annotation.JsonProperty("sslTrustStoreLocation")
        private String sslTrustStoreLocation;

        /**
         * The full path of the SSL truststore location in the agent.
         *
         * @param sslTrustStoreLocation the value to set
         * @return this builder
         */
        public Builder sslTrustStoreLocation(String sslTrustStoreLocation) {
            this.sslTrustStoreLocation = sslTrustStoreLocation;
            this.__explicitlySet__.add("sslTrustStoreLocation");
            return this;
        }
        /** The password of the SSL truststore location in the agent. */
        @com.fasterxml.jackson.annotation.JsonProperty("sslTrustStorePassword")
        private String sslTrustStorePassword;

        /**
         * The password of the SSL truststore location in the agent.
         *
         * @param sslTrustStorePassword the value to set
         * @return this builder
         */
        public Builder sslTrustStorePassword(String sslTrustStorePassword) {
            this.sslTrustStorePassword = sslTrustStorePassword;
            this.__explicitlySet__.add("sslTrustStorePassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RestCredential build() {
            RestCredential model =
                    new RestCredential(
                            this.username,
                            this.password,
                            this.sslTrustStoreType,
                            this.sslTrustStoreLocation,
                            this.sslTrustStorePassword);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RestCredential model) {
            if (model.wasPropertyExplicitlySet("username")) {
                this.username(model.getUsername());
            }
            if (model.wasPropertyExplicitlySet("password")) {
                this.password(model.getPassword());
            }
            if (model.wasPropertyExplicitlySet("sslTrustStoreType")) {
                this.sslTrustStoreType(model.getSslTrustStoreType());
            }
            if (model.wasPropertyExplicitlySet("sslTrustStoreLocation")) {
                this.sslTrustStoreLocation(model.getSslTrustStoreLocation());
            }
            if (model.wasPropertyExplicitlySet("sslTrustStorePassword")) {
                this.sslTrustStorePassword(model.getSslTrustStorePassword());
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

    /** The name of the user. */
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    private final String username;

    /**
     * The name of the user.
     *
     * @return the value
     */
    public String getUsername() {
        return username;
    }

    /** The password of the user. */
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    private final String password;

    /**
     * The password of the user.
     *
     * @return the value
     */
    public String getPassword() {
        return password;
    }

    /** The SSL truststore type. */
    public enum SslTrustStoreType implements com.oracle.bmc.http.internal.BmcEnum {
        Jks("JKS"),
        Bcfks("BCFKS"),
        ;

        private final String value;
        private static java.util.Map<String, SslTrustStoreType> map;

        static {
            map = new java.util.HashMap<>();
            for (SslTrustStoreType v : SslTrustStoreType.values()) {
                map.put(v.getValue(), v);
            }
        }

        SslTrustStoreType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SslTrustStoreType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SslTrustStoreType: " + key);
        }
    };
    /** The SSL truststore type. */
    @com.fasterxml.jackson.annotation.JsonProperty("sslTrustStoreType")
    private final SslTrustStoreType sslTrustStoreType;

    /**
     * The SSL truststore type.
     *
     * @return the value
     */
    public SslTrustStoreType getSslTrustStoreType() {
        return sslTrustStoreType;
    }

    /** The full path of the SSL truststore location in the agent. */
    @com.fasterxml.jackson.annotation.JsonProperty("sslTrustStoreLocation")
    private final String sslTrustStoreLocation;

    /**
     * The full path of the SSL truststore location in the agent.
     *
     * @return the value
     */
    public String getSslTrustStoreLocation() {
        return sslTrustStoreLocation;
    }

    /** The password of the SSL truststore location in the agent. */
    @com.fasterxml.jackson.annotation.JsonProperty("sslTrustStorePassword")
    private final String sslTrustStorePassword;

    /**
     * The password of the SSL truststore location in the agent.
     *
     * @return the value
     */
    public String getSslTrustStorePassword() {
        return sslTrustStorePassword;
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
        sb.append("RestCredential(");
        sb.append("super=").append(super.toString());
        sb.append("username=").append(String.valueOf(this.username));
        sb.append(", password=").append("<redacted>");
        sb.append(", sslTrustStoreType=").append(String.valueOf(this.sslTrustStoreType));
        sb.append(", sslTrustStoreLocation=").append(String.valueOf(this.sslTrustStoreLocation));
        sb.append(", sslTrustStorePassword=").append("<redacted>");
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RestCredential)) {
            return false;
        }

        RestCredential other = (RestCredential) o;
        return java.util.Objects.equals(this.username, other.username)
                && java.util.Objects.equals(this.password, other.password)
                && java.util.Objects.equals(this.sslTrustStoreType, other.sslTrustStoreType)
                && java.util.Objects.equals(this.sslTrustStoreLocation, other.sslTrustStoreLocation)
                && java.util.Objects.equals(this.sslTrustStorePassword, other.sslTrustStorePassword)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.username == null ? 43 : this.username.hashCode());
        result = (result * PRIME) + (this.password == null ? 43 : this.password.hashCode());
        result =
                (result * PRIME)
                        + (this.sslTrustStoreType == null ? 43 : this.sslTrustStoreType.hashCode());
        result =
                (result * PRIME)
                        + (this.sslTrustStoreLocation == null
                                ? 43
                                : this.sslTrustStoreLocation.hashCode());
        result =
                (result * PRIME)
                        + (this.sslTrustStorePassword == null
                                ? 43
                                : this.sslTrustStorePassword.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
