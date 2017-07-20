/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.model;

/**
 * A mapping between a single group defined by the identity provider (IdP) you're federating with
 * and a single IAM Service {@link Group} in Oracle Bare Metal Cloud
 * Services. For more information about group mappings and what they're for, see
 * [Identity Providers and Federation](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/federation.htm).
 * <p>
 * A given IdP group can be mapped to zero, one, or multiple IAM Service groups, and vice versa.
 * But each `IdPGroupMapping` object is between only a single IdP group and IAM Service group.
 * Each `IdPGroupMapping` object has its own OCID.
 * <p>
 **Note:** Any users who are in more than 50 IdP groups cannot be authenticated to use the Oracle
 * Bare Metal Cloud Services Console.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = IdpGroupMapping.Builder.class)
public class IdpGroupMapping {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        @com.fasterxml.jackson.annotation.JsonProperty("idpId")
        private String idpId;

        @com.fasterxml.jackson.annotation.JsonProperty("idpGroupName")
        private String idpGroupName;

        @com.fasterxml.jackson.annotation.JsonProperty("groupId")
        private String groupId;

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        @com.fasterxml.jackson.annotation.JsonProperty("inactiveStatus")
        private Long inactiveStatus;

        public IdpGroupMapping build() {
            return new IdpGroupMapping(
                    id,
                    idpId,
                    idpGroupName,
                    groupId,
                    compartmentId,
                    timeCreated,
                    lifecycleState,
                    inactiveStatus);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IdpGroupMapping o) {
            return id(o.getId())
                    .idpId(o.getIdpId())
                    .idpGroupName(o.getIdpGroupName())
                    .groupId(o.getGroupId())
                    .compartmentId(o.getCompartmentId())
                    .timeCreated(o.getTimeCreated())
                    .lifecycleState(o.getLifecycleState())
                    .inactiveStatus(o.getInactiveStatus());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The OCID of the `IdpGroupMapping`.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String id;

    /**
     * The OCID of the `IdentityProvider` this mapping belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idpId")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String idpId;

    /**
     * The name of the IdP group that is mapped to the IAM Service group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idpGroupName")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String idpGroupName;

    /**
     * The OCID of the IAM Service group that is mapped to the IdP group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupId")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String groupId;

    /**
     * The OCID of the tenancy containing the `IdentityProvider`.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String compartmentId;

    /**
     * Date and time the mapping was created, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    java.util.Date timeCreated;
    /**
     * The mapping's current state.  After creating a mapping object, make sure its `lifecycleState` changes
     * from CREATING to ACTIVE before using it.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Creating("CREATING"),
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The mapping's current state.  After creating a mapping object, make sure its `lifecycleState` changes
     * from CREATING to ACTIVE before using it.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 64)
    LifecycleState lifecycleState;

    /**
     * The detailed status of INACTIVE lifecycleState.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inactiveStatus")
    Long inactiveStatus;
}
