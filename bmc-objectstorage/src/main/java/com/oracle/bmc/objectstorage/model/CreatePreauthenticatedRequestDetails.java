/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreatePreauthenticatedRequestDetails.Builder.class
)
public class CreatePreauthenticatedRequestDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        @com.fasterxml.jackson.annotation.JsonProperty("accessType")
        private AccessType accessType;

        @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
        private java.util.Date timeExpires;

        public CreatePreauthenticatedRequestDetails build() {
            return new CreatePreauthenticatedRequestDetails(
                    name, objectName, accessType, timeExpires);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreatePreauthenticatedRequestDetails o) {
            return name(o.getName())
                    .objectName(o.getObjectName())
                    .accessType(o.getAccessType())
                    .timeExpires(o.getTimeExpires());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * user specified name for pre-authenticated request. Helpful for management purposes.
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
    public enum AccessType {
        ObjectRead("ObjectRead"),
        ObjectWrite("ObjectWrite"),
        ObjectReadWrite("ObjectReadWrite"),
        AnyObjectWrite("AnyObjectWrite"),
        ;

        private final String value;
        private static java.util.Map<String, AccessType> map;

        static {
            map = new java.util.HashMap<>();
            for (AccessType v : AccessType.values()) {
                map.put(v.getValue(), v);
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
            throw new RuntimeException("Invalid AccessType: " + key);
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
     * The expiration date after which the pre-authenticated request will no longer be valid per spec
     * [RFC 3339](https://tools.ietf.org/rfc/rfc3339)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    java.util.Date timeExpires;
}
