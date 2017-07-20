/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PreauthenticatedRequestSummary.Builder.class
)
public class PreauthenticatedRequestSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        @com.fasterxml.jackson.annotation.JsonProperty("accessType")
        private AccessType accessType;

        @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
        private java.util.Date timeExpires;

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public PreauthenticatedRequestSummary build() {
            return new PreauthenticatedRequestSummary(
                    id, name, objectName, accessType, timeExpires, timeCreated);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PreauthenticatedRequestSummary o) {
            return id(o.getId())
                    .name(o.getName())
                    .objectName(o.getObjectName())
                    .accessType(o.getAccessType())
                    .timeExpires(o.getTimeExpires())
                    .timeCreated(o.getTimeCreated());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * the unique identifier to use when directly addressing the pre-authenticated request
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String id;

    /**
     * the user supplied name of the pre-authenticated request
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String name;

    /**
     * Name of object that is being granted access to by the pre-authenticated request. This can be null and that would mean that the pre-authenticated request is granting access to the entire bucket
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    String objectName;
    /**
     * the operation that can be performed on this resource e.g PUT or GET.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum AccessType {
        ObjectRead("ObjectRead"),
        ObjectWrite("ObjectWrite"),
        ObjectReadWrite("ObjectReadWrite"),
        AnyObjectWrite("AnyObjectWrite"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, AccessType> map;

        static {
            map = new java.util.HashMap<>();
            for (AccessType v : AccessType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AccessType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AccessType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AccessType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * the operation that can be performed on this resource e.g PUT or GET.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("accessType")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    AccessType accessType;

    /**
     * the expiration date after which the pre authenticated request will no longer be valid as per spec
     * [RFC 3339](https://tools.ietf.org/rfc/rfc3339)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    java.util.Date timeExpires;

    /**
     * the date when the pre-authenticated request was created as per spec
     * [RFC 3339](https://tools.ietf.org/rfc/rfc3339)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    java.util.Date timeCreated;
}
