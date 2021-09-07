/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Data to update one or more attributes of the Database Management configuration for the database.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ModifyDatabaseManagementDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ModifyDatabaseManagementDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("credentialDetails")
        private DatabaseCredentialDetails credentialDetails;

        public Builder credentialDetails(DatabaseCredentialDetails credentialDetails) {
            this.credentialDetails = credentialDetails;
            this.__explicitlySet__.add("credentialDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("privateEndPointId")
        private String privateEndPointId;

        public Builder privateEndPointId(String privateEndPointId) {
            this.privateEndPointId = privateEndPointId;
            this.__explicitlySet__.add("privateEndPointId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("managementType")
        private ManagementType managementType;

        public Builder managementType(ManagementType managementType) {
            this.managementType = managementType;
            this.__explicitlySet__.add("managementType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
        private String serviceName;

        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            this.__explicitlySet__.add("serviceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ModifyDatabaseManagementDetails build() {
            ModifyDatabaseManagementDetails __instance__ =
                    new ModifyDatabaseManagementDetails(
                            credentialDetails, privateEndPointId, managementType, serviceName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModifyDatabaseManagementDetails o) {
            Builder copiedBuilder =
                    credentialDetails(o.getCredentialDetails())
                            .privateEndPointId(o.getPrivateEndPointId())
                            .managementType(o.getManagementType())
                            .serviceName(o.getServiceName());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    @com.fasterxml.jackson.annotation.JsonProperty("credentialDetails")
    DatabaseCredentialDetails credentialDetails;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the private endpoint.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndPointId")
    String privateEndPointId;
    /**
     * The Database Management type.
     **/
    public enum ManagementType {
        Basic("BASIC"),
        Advanced("ADVANCED"),
        ;

        private final String value;
        private static java.util.Map<String, ManagementType> map;

        static {
            map = new java.util.HashMap<>();
            for (ManagementType v : ManagementType.values()) {
                map.put(v.getValue(), v);
            }
        }

        ManagementType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ManagementType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ManagementType: " + key);
        }
    };
    /**
     * The Database Management type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managementType")
    ManagementType managementType;

    /**
     * The name of the Oracle Database service that will be used to connect to the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    String serviceName;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
