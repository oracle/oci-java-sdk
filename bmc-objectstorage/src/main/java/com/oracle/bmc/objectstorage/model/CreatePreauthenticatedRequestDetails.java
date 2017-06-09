/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import java.util.*;
import javax.validation.*;
import javax.validation.constraints.*;

import lombok.Value;
import lombok.*;
import lombok.experimental.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = CreatePreauthenticatedRequestDetails.Builder.class)
public class CreatePreauthenticatedRequestDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("name")
        private String name;

        @JsonProperty("objectName")
        private String objectName;

        @JsonProperty("accessType")
        private AccessType accessType;

        @JsonProperty("timeExpires")
        private Date timeExpires;

        public CreatePreauthenticatedRequestDetails build() {
            return new CreatePreauthenticatedRequestDetails(
                    name, objectName, accessType, timeExpires);
        }

        @JsonIgnore
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
    @JsonProperty("name")
    @Valid
    @NotNull
    String name;

    /**
     * Name of object that is being granted access to by the pre-authenticated request. This can be null and that would mean that the pre-authenticated request is granting access to the entire bucket
     **/
    @JsonProperty("objectName")
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
        private static Map<String, AccessType> map;

        static {
            map = new HashMap<>();
            for (AccessType v : AccessType.values()) {
                map.put(v.getValue(), v);
            }
        }

        AccessType(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @JsonCreator
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
    @JsonProperty("accessType")
    @Valid
    @NotNull
    AccessType accessType;

    /**
     * The expiration date after which the pre-authenticated request will no longer be valid per spec
     * [RFC 3339](https://tools.ietf.org/rfc/rfc3339)
     *
     **/
    @JsonProperty("timeExpires")
    @Valid
    @NotNull
    Date timeExpires;
}
