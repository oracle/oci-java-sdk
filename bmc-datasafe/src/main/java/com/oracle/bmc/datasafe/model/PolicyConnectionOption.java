/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Types of connection supported by Data Safe. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PolicyConnectionOption.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PolicyConnectionOption
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"connectionType", "identifiers"})
    public PolicyConnectionOption(
            ConnectionType connectionType, java.util.List<String> identifiers) {
        super();
        this.connectionType = connectionType;
        this.identifiers = identifiers;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The connection type used to connect to the database. Allowed values: - PRIVATE_ENDPOINT -
         * Represents connection through private endpoint in Data Safe. - ONPREM_CONNECTOR -
         * Represents connection through on-premises connector in Data Safe.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("connectionType")
        private ConnectionType connectionType;

        /**
         * The connection type used to connect to the database. Allowed values: - PRIVATE_ENDPOINT -
         * Represents connection through private endpoint in Data Safe. - ONPREM_CONNECTOR -
         * Represents connection through on-premises connector in Data Safe.
         *
         * @param connectionType the value to set
         * @return this builder
         */
        public Builder connectionType(ConnectionType connectionType) {
            this.connectionType = connectionType;
            this.__explicitlySet__.add("connectionType");
            return this;
        }
        /**
         * List of OCIDs required to establish the connection. - For {@code PRIVATE_ENDPOINT},
         * provide the OCID(s) of Data Safe private endpoint(s). - For {@code ONPREM_CONNECTOR},
         * provide the OCID(s) of on-premises connector(s).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("identifiers")
        private java.util.List<String> identifiers;

        /**
         * List of OCIDs required to establish the connection. - For {@code PRIVATE_ENDPOINT},
         * provide the OCID(s) of Data Safe private endpoint(s). - For {@code ONPREM_CONNECTOR},
         * provide the OCID(s) of on-premises connector(s).
         *
         * @param identifiers the value to set
         * @return this builder
         */
        public Builder identifiers(java.util.List<String> identifiers) {
            this.identifiers = identifiers;
            this.__explicitlySet__.add("identifiers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PolicyConnectionOption build() {
            PolicyConnectionOption model =
                    new PolicyConnectionOption(this.connectionType, this.identifiers);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PolicyConnectionOption model) {
            if (model.wasPropertyExplicitlySet("connectionType")) {
                this.connectionType(model.getConnectionType());
            }
            if (model.wasPropertyExplicitlySet("identifiers")) {
                this.identifiers(model.getIdentifiers());
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
     * The connection type used to connect to the database. Allowed values: - PRIVATE_ENDPOINT -
     * Represents connection through private endpoint in Data Safe. - ONPREM_CONNECTOR - Represents
     * connection through on-premises connector in Data Safe.
     */
    public enum ConnectionType implements com.oracle.bmc.http.internal.BmcEnum {
        PrivateEndpoint("PRIVATE_ENDPOINT"),
        OnpremConnector("ONPREM_CONNECTOR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ConnectionType.class);

        private final String value;
        private static java.util.Map<String, ConnectionType> map;

        static {
            map = new java.util.HashMap<>();
            for (ConnectionType v : ConnectionType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ConnectionType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ConnectionType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ConnectionType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The connection type used to connect to the database. Allowed values: - PRIVATE_ENDPOINT -
     * Represents connection through private endpoint in Data Safe. - ONPREM_CONNECTOR - Represents
     * connection through on-premises connector in Data Safe.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionType")
    private final ConnectionType connectionType;

    /**
     * The connection type used to connect to the database. Allowed values: - PRIVATE_ENDPOINT -
     * Represents connection through private endpoint in Data Safe. - ONPREM_CONNECTOR - Represents
     * connection through on-premises connector in Data Safe.
     *
     * @return the value
     */
    public ConnectionType getConnectionType() {
        return connectionType;
    }

    /**
     * List of OCIDs required to establish the connection. - For {@code PRIVATE_ENDPOINT}, provide
     * the OCID(s) of Data Safe private endpoint(s). - For {@code ONPREM_CONNECTOR}, provide the
     * OCID(s) of on-premises connector(s).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identifiers")
    private final java.util.List<String> identifiers;

    /**
     * List of OCIDs required to establish the connection. - For {@code PRIVATE_ENDPOINT}, provide
     * the OCID(s) of Data Safe private endpoint(s). - For {@code ONPREM_CONNECTOR}, provide the
     * OCID(s) of on-premises connector(s).
     *
     * @return the value
     */
    public java.util.List<String> getIdentifiers() {
        return identifiers;
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
        sb.append("PolicyConnectionOption(");
        sb.append("super=").append(super.toString());
        sb.append("connectionType=").append(String.valueOf(this.connectionType));
        sb.append(", identifiers=").append(String.valueOf(this.identifiers));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PolicyConnectionOption)) {
            return false;
        }

        PolicyConnectionOption other = (PolicyConnectionOption) o;
        return java.util.Objects.equals(this.connectionType, other.connectionType)
                && java.util.Objects.equals(this.identifiers, other.identifiers)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.connectionType == null ? 43 : this.connectionType.hashCode());
        result = (result * PRIME) + (this.identifiers == null ? 43 : this.identifiers.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
