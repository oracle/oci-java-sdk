/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.sch.model;

/**
 * An object that represents the target of the flow defined by the connector. An example target is a
 * stream (Streaming service). For more information about flows defined by connectors, see [Overview
 * of Connector Hub](https://docs.oracle.com/iaas/Content/connector-hub/overview.htm). For
 * configuration instructions, see [Creating a
 * Connector](https://docs.oracle.com/iaas/Content/connector-hub/create-service-connector.htm). <br>
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
        defaultImpl = TargetDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = NotificationsTargetDetails.class,
            name = "notifications"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ObjectStorageTargetDetails.class,
            name = "objectStorage"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = MonitoringTargetDetails.class,
            name = "monitoring"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = FunctionsTargetDetails.class,
            name = "functions"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = LoggingAnalyticsTargetDetails.class,
            name = "loggingAnalytics"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = StreamingTargetDetails.class,
            name = "streaming")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class TargetDetails extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({})
    protected TargetDetails() {
        super();
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
        sb.append("TargetDetails(");
        sb.append("super=").append(super.toString());
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TargetDetails)) {
            return false;
        }

        TargetDetails other = (TargetDetails) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** The type discriminator. */
    public enum Kind implements com.oracle.bmc.http.internal.BmcEnum {
        Functions("functions"),
        LoggingAnalytics("loggingAnalytics"),
        Monitoring("monitoring"),
        Notifications("notifications"),
        ObjectStorage("objectStorage"),
        Streaming("streaming"),
        ;

        private final String value;
        private static java.util.Map<String, Kind> map;

        static {
            map = new java.util.HashMap<>();
            for (Kind v : Kind.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid Kind: " + key);
        }
    };
}
