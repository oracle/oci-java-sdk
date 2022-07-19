/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ModifyDatabaseManagementDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ModifyDatabaseManagementDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "credentialDetails",
        "privateEndPointId",
        "managementType",
        "serviceName"
    })
    public ModifyDatabaseManagementDetails(
            DatabaseCredentialDetails credentialDetails,
            String privateEndPointId,
            ManagementType managementType,
            String serviceName) {
        super();
        this.credentialDetails = credentialDetails;
        this.privateEndPointId = privateEndPointId;
        this.managementType = managementType;
        this.serviceName = serviceName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("credentialDetails")
        private DatabaseCredentialDetails credentialDetails;

        public Builder credentialDetails(DatabaseCredentialDetails credentialDetails) {
            this.credentialDetails = credentialDetails;
            this.__explicitlySet__.add("credentialDetails");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the private endpoint.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("privateEndPointId")
        private String privateEndPointId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the private endpoint.
         *
         * @param privateEndPointId the value to set
         * @return this builder
         **/
        public Builder privateEndPointId(String privateEndPointId) {
            this.privateEndPointId = privateEndPointId;
            this.__explicitlySet__.add("privateEndPointId");
            return this;
        }
        /**
         * The Database Management type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("managementType")
        private ManagementType managementType;

        /**
         * The Database Management type.
         * @param managementType the value to set
         * @return this builder
         **/
        public Builder managementType(ManagementType managementType) {
            this.managementType = managementType;
            this.__explicitlySet__.add("managementType");
            return this;
        }
        /**
         * The name of the Oracle Database service that will be used to connect to the database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
        private String serviceName;

        /**
         * The name of the Oracle Database service that will be used to connect to the database.
         * @param serviceName the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @com.fasterxml.jackson.annotation.JsonProperty("credentialDetails")
    private final DatabaseCredentialDetails credentialDetails;

    public DatabaseCredentialDetails getCredentialDetails() {
        return credentialDetails;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the private endpoint.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndPointId")
    private final String privateEndPointId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the private endpoint.
     *
     * @return the value
     **/
    public String getPrivateEndPointId() {
        return privateEndPointId;
    }

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
    private final ManagementType managementType;

    /**
     * The Database Management type.
     * @return the value
     **/
    public ManagementType getManagementType() {
        return managementType;
    }

    /**
     * The name of the Oracle Database service that will be used to connect to the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    private final String serviceName;

    /**
     * The name of the Oracle Database service that will be used to connect to the database.
     * @return the value
     **/
    public String getServiceName() {
        return serviceName;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ModifyDatabaseManagementDetails(");
        sb.append("credentialDetails=").append(String.valueOf(this.credentialDetails));
        sb.append(", privateEndPointId=").append(String.valueOf(this.privateEndPointId));
        sb.append(", managementType=").append(String.valueOf(this.managementType));
        sb.append(", serviceName=").append(String.valueOf(this.serviceName));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModifyDatabaseManagementDetails)) {
            return false;
        }

        ModifyDatabaseManagementDetails other = (ModifyDatabaseManagementDetails) o;
        return java.util.Objects.equals(this.credentialDetails, other.credentialDetails)
                && java.util.Objects.equals(this.privateEndPointId, other.privateEndPointId)
                && java.util.Objects.equals(this.managementType, other.managementType)
                && java.util.Objects.equals(this.serviceName, other.serviceName)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.credentialDetails == null ? 43 : this.credentialDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndPointId == null ? 43 : this.privateEndPointId.hashCode());
        result =
                (result * PRIME)
                        + (this.managementType == null ? 43 : this.managementType.hashCode());
        result = (result * PRIME) + (this.serviceName == null ? 43 : this.serviceName.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
