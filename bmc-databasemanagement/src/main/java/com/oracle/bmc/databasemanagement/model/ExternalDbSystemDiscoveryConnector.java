/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The connector details used to connect to the external DB system component. <br>
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
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "connectorType",
        defaultImpl = ExternalDbSystemDiscoveryConnector.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ExternalDbSystemDiscoveryMacsConnector.class,
            name = "MACS")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class ExternalDbSystemDiscoveryConnector
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "connectionStatus",
        "connectionFailureMessage",
        "timeConnectionStatusLastUpdated"
    })
    protected ExternalDbSystemDiscoveryConnector(
            String displayName,
            String connectionStatus,
            String connectionFailureMessage,
            java.util.Date timeConnectionStatusLastUpdated) {
        super();
        this.displayName = displayName;
        this.connectionStatus = connectionStatus;
        this.connectionFailureMessage = connectionFailureMessage;
        this.timeConnectionStatusLastUpdated = timeConnectionStatusLastUpdated;
    }

    /** The user-friendly name for the external connector. The name does not have to be unique. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the external connector. The name does not have to be unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The status of connectivity to the external DB system component. */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionStatus")
    private final String connectionStatus;

    /**
     * The status of connectivity to the external DB system component.
     *
     * @return the value
     */
    public String getConnectionStatus() {
        return connectionStatus;
    }

    /**
     * The error message indicating the reason for connection failure or {@code null} if the
     * connection was successful.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionFailureMessage")
    private final String connectionFailureMessage;

    /**
     * The error message indicating the reason for connection failure or {@code null} if the
     * connection was successful.
     *
     * @return the value
     */
    public String getConnectionFailureMessage() {
        return connectionFailureMessage;
    }

    /**
     * The date and time the connectionStatus of the external DB system connector was last updated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeConnectionStatusLastUpdated")
    private final java.util.Date timeConnectionStatusLastUpdated;

    /**
     * The date and time the connectionStatus of the external DB system connector was last updated.
     *
     * @return the value
     */
    public java.util.Date getTimeConnectionStatusLastUpdated() {
        return timeConnectionStatusLastUpdated;
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
        sb.append("ExternalDbSystemDiscoveryConnector(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", connectionStatus=").append(String.valueOf(this.connectionStatus));
        sb.append(", connectionFailureMessage=")
                .append(String.valueOf(this.connectionFailureMessage));
        sb.append(", timeConnectionStatusLastUpdated=")
                .append(String.valueOf(this.timeConnectionStatusLastUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalDbSystemDiscoveryConnector)) {
            return false;
        }

        ExternalDbSystemDiscoveryConnector other = (ExternalDbSystemDiscoveryConnector) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.connectionStatus, other.connectionStatus)
                && java.util.Objects.equals(
                        this.connectionFailureMessage, other.connectionFailureMessage)
                && java.util.Objects.equals(
                        this.timeConnectionStatusLastUpdated, other.timeConnectionStatusLastUpdated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionStatus == null ? 43 : this.connectionStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionFailureMessage == null
                                ? 43
                                : this.connectionFailureMessage.hashCode());
        result =
                (result * PRIME)
                        + (this.timeConnectionStatusLastUpdated == null
                                ? 43
                                : this.timeConnectionStatusLastUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** The type of connector. */
    public enum ConnectorType implements com.oracle.bmc.http.internal.BmcEnum {
        Macs("MACS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ConnectorType.class);

        private final String value;
        private static java.util.Map<String, ConnectorType> map;

        static {
            map = new java.util.HashMap<>();
            for (ConnectorType v : ConnectorType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ConnectorType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ConnectorType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ConnectorType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
