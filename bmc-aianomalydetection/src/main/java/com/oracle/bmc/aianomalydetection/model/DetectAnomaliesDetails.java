/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aianomalydetection.model;

/**
 * Base class for the DetectAnomalies call. It contains the identifier that will
 * be used for deciding what type of request this is.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "requestType",
    defaultImpl = DetectAnomaliesDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = InlineDetectAnomaliesRequest.class,
        name = "INLINE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = EmbeddedDetectAnomaliesRequest.class,
        name = "BASE64_ENCODED"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class DetectAnomaliesDetails {

    /**
     * The OCID of the trained model\u3002
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelId")
    String modelId;

    /**
     * Type of request. This parameter will be filled autmatically by classes generated
     * by the SDK. For raw curl request, user will have to provide this field.
     *
     **/
    public enum RequestType {
        Inline("INLINE"),
        Base64Encoded("BASE64_ENCODED"),
        ;

        private final String value;
        private static java.util.Map<String, RequestType> map;

        static {
            map = new java.util.HashMap<>();
            for (RequestType v : RequestType.values()) {
                map.put(v.getValue(), v);
            }
        }

        RequestType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RequestType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid RequestType: " + key);
        }
    };
}
