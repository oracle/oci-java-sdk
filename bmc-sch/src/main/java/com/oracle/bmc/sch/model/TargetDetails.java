/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.sch.model;

/**
 * An object that represents the target of the flow defined by the service connector.
 * An example target is a stream (Streaming service).
 * For more information about flows defined by service connectors, see
 * [Service Connector Hub Overview](https://docs.cloud.oracle.com/iaas/Content/service-connector-hub/overview.htm).
 * For configuration instructions, see
 * [To create a service connector](https://docs.cloud.oracle.com/iaas/Content/service-connector-hub/managingconnectors.htm#create).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200909")
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "kind",
    defaultImpl = TargetDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = NotificationsTargetDetails.class,
        name = "notifications"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ObjectStorageTargetDetails.class,
        name = "objectStorage"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = MonitoringTargetDetails.class,
        name = "monitoring"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = FunctionsTargetDetails.class,
        name = "functions"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = LoggingAnalyticsTargetDetails.class,
        name = "loggingAnalytics"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = StreamingTargetDetails.class,
        name = "streaming"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class TargetDetails {

    /**
     * The type descriminator.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Kind {
        Functions("functions"),
        LoggingAnalytics("loggingAnalytics"),
        Monitoring("monitoring"),
        Notifications("notifications"),
        ObjectStorage("objectStorage"),
        Streaming("streaming"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
