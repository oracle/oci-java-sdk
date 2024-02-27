/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.sch.model;

/**
 * A service source or service target used to create a connector. Example connector plugins include
 * the Queue source and the Notifications target. For more information about flows defined by
 * connectors, see [Overview of Connector
 * Hub](https://docs.cloud.oracle.com/iaas/Content/connector-hub/overview.htm). For configuration
 * instructions, see [Creating a
 * Connector](https://docs.cloud.oracle.com/iaas/Content/connector-hub/create-service-connector.htm).
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200909")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "kind",
        defaultImpl = ConnectorPlugin.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = TargetConnectorPlugin.class,
            name = "TARGET"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = SourceConnectorPlugin.class,
            name = "SOURCE")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class ConnectorPlugin extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "timeCreated",
        "estimatedThroughput",
        "lifecycleState",
        "displayName",
        "schema"
    })
    protected ConnectorPlugin(
            String name,
            java.util.Date timeCreated,
            EstimatedThroughput estimatedThroughput,
            ConnectorPluginLifecycleState lifecycleState,
            String displayName,
            String schema) {
        super();
        this.name = name;
        this.timeCreated = timeCreated;
        this.estimatedThroughput = estimatedThroughput;
        this.lifecycleState = lifecycleState;
        this.displayName = displayName;
        this.schema = schema;
    }

    /** The service to be called by the connector plugin. Example: {@code QueueSource} */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The service to be called by the connector plugin. Example: {@code QueueSource}
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * The date and time when this plugin became available. Format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2023-09-09T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time when this plugin became available. Format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2023-09-09T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The estimated throughput range (LOW, MEDIUM, HIGH). */
    @com.fasterxml.jackson.annotation.JsonProperty("estimatedThroughput")
    private final EstimatedThroughput estimatedThroughput;

    /**
     * The estimated throughput range (LOW, MEDIUM, HIGH).
     *
     * @return the value
     */
    public EstimatedThroughput getEstimatedThroughput() {
        return estimatedThroughput;
    }

    /** The current state of the service connector. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ConnectorPluginLifecycleState lifecycleState;

    /**
     * The current state of the service connector.
     *
     * @return the value
     */
    public ConnectorPluginLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A user-friendly name. It does not have to be unique, and it is changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. It does not have to be unique, and it is changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Gets the specified connector plugin configuration information in OpenAPI specification
     * format.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("schema")
    private final String schema;

    /**
     * Gets the specified connector plugin configuration information in OpenAPI specification
     * format.
     *
     * @return the value
     */
    public String getSchema() {
        return schema;
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
        sb.append("ConnectorPlugin(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", estimatedThroughput=").append(String.valueOf(this.estimatedThroughput));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", schema=").append(String.valueOf(this.schema));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConnectorPlugin)) {
            return false;
        }

        ConnectorPlugin other = (ConnectorPlugin) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.estimatedThroughput, other.estimatedThroughput)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.schema, other.schema)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.estimatedThroughput == null
                                ? 43
                                : this.estimatedThroughput.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.schema == null ? 43 : this.schema.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** The plugin type discriminator. */
    public enum Kind implements com.oracle.bmc.http.internal.BmcEnum {
        Source("SOURCE"),
        Target("TARGET"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Kind.class);

        private final String value;
        private static java.util.Map<String, Kind> map;

        static {
            map = new java.util.HashMap<>();
            for (Kind v : Kind.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Kind(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Kind create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Kind', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
}
