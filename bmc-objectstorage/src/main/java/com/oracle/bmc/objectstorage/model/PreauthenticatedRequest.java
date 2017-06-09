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
@JsonDeserialize(builder = PreauthenticatedRequest.Builder.class)
public class PreauthenticatedRequest {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("id")
        private String id;

        @JsonProperty("name")
        private String name;

        @JsonProperty("accessUri")
        private String accessUri;

        @JsonProperty("objectName")
        private String objectName;

        @JsonProperty("accessType")
        private AccessType accessType;

        @JsonProperty("timeExpires")
        private Date timeExpires;

        @JsonProperty("timeCreated")
        private Date timeCreated;

        public PreauthenticatedRequest build() {
            return new PreauthenticatedRequest(
                    id, name, accessUri, objectName, accessType, timeExpires, timeCreated);
        }

        @JsonIgnore
        public Builder copy(PreauthenticatedRequest o) {
            return id(o.getId())
                    .name(o.getName())
                    .accessUri(o.getAccessUri())
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
    @JsonProperty("id")
    @Valid
    @NotNull
    String id;

    /**
     * the user supplied name of the pre-authenticated request.
     **/
    @JsonProperty("name")
    @Valid
    @NotNull
    String name;

    /**
     * the uri to embed in the url when using the pre-authenticated request.
     **/
    @JsonProperty("accessUri")
    @Valid
    @NotNull
    String accessUri;

    /**
     * Name of object that is being granted access to by the pre-authenticated request. This can be null and that would mean that the pre-authenticated request is granting access to the entire bucket
     **/
    @JsonProperty("objectName")
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
        private static Map<String, AccessType> map;

        static {
            map = new HashMap<>();
            for (AccessType v : AccessType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
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
            LOG.warn(
                    "Received unknown value '{}' for enum 'AccessType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
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
     * the expiration date after which the pre authenticated request will no longer be valid as per spec
     * [RFC 3339](https://tools.ietf.org/rfc/rfc3339)
     *
     **/
    @JsonProperty("timeExpires")
    @Valid
    @NotNull
    Date timeExpires;

    /**
     * the date when the pre-authenticated request was created as per spec
     * [RFC 3339](https://tools.ietf.org/rfc/rfc3339)
     *
     **/
    @JsonProperty("timeCreated")
    @Valid
    @NotNull
    Date timeCreated;
}
